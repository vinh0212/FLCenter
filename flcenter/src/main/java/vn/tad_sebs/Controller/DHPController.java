package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.SwingWorker;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import com.itextpdf.text.FontFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import vn.tad_sebs.DAO.StudentDAO;
import vn.tad_sebs.DAO.SubjectDAO;
import vn.tad_sebs.DAO.CanboDAO.TeacherDAO;
import vn.tad_sebs.Model.Student;
import vn.tad_sebs.Model.Teacher;
import vn.tad_sebs.View.StudentCustomSearch;
import vn.tad_sebs.View.StudentView;
import vn.tad_sebs.Controller.MainController2.DHPListener;
import vn.tad_sebs.DAO.CanboDAO;
import vn.tad_sebs.DAO.LopDAO;
import vn.tad_sebs.Model.CourseFeeEntry;
import vn.tad_sebs.Model.Lop;
import vn.tad_sebs.Model.Monhoc;
import vn.tad_sebs.View.DHPView;

public class DHPController {
    private DHPView dhpView;
    private StudentDAO studentDAO;
    private LopDAO lopDAO;
    private int id;

    public DHPController(DHPView dhpView) {
        this.dhpView = dhpView;
        this.studentDAO = new StudentDAO();
        this.lopDAO = new LopDAO();

        dhpView.addTbPriceModelListener(new TBPriceModelListener());
        dhpView.addPayListener(new PayListener());
    }

    public void showDHPView(int id) {
        this.id = id;
        dhpView.setVisible(true);
        dhpView.getListLops(lopDAO.getListLops());

        for (Student s : studentDAO.getListStudents()) {
            if (s.getId() == id) {
                dhpView.showStudent(s);
                break;
            }
        }
    }

    class TBPriceModelListener implements TableModelListener {
        public void tableChanged(TableModelEvent e) {
            dhpView.showPrice();
        }
    }

    class PayListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Student student = new Student();
            student.setId(id);
            student.setCourseFeeMap(dhpView.getCFM());
            studentDAO.editFee(student);

            for (Student s : studentDAO.getListStudents()) {
                if (s.getId() == id) {
                    student = s;
                    break;
                }
            }

            TableModel model = dhpView.getTbPriceModel();

            try {
                // Tạo một Document

                Document document = new Document();
                // Tạo một PdfWriter
                PdfWriter.getInstance(document, new FileOutputStream("Invoice.pdf"));
                // Mở Document
                document.open();

                // Tạo một font chung
                Font font = FontFactory.getFont(FontFactory.TIMES, 14);

                // Tạo tiêu đề với font lớn hơn và đậm
                Paragraph title = new Paragraph("HOA DON THANH TOAN", FontFactory.getFont(FontFactory.TIMES_BOLD, 18));
                title.setAlignment(Element.ALIGN_CENTER);
                document.add(title);

                // Thêm thông tin học viên
                document.add(new Chunk("\n"));
                document.add(new Paragraph("1. Thong tin hoc vien", FontFactory.getFont(FontFactory.TIMES_BOLD, 16)));
                document.add(new Paragraph("Ho ten: " + student.getName(), font));
                document.add(new Paragraph("Ngay sinh: " + student.getDate(), font));
                document.add(new Paragraph("Gioi tinh: " + student.getGioitinh(), font));
                document.add(new Paragraph("Dia chi: " + student.getAddress(), font));

                // Thêm chi tiết hóa đơn
                document.add(new Chunk("\n"));
                document.add(new Paragraph("2. Chi tiet hoa don", FontFactory.getFont(FontFactory.TIMES_BOLD, 16)));

                // Tạo bảng cho chi tiết hóa đơn
                PdfPTable table = new PdfPTable(3); // 3 columns
                table.setWidthPercentage(100); // Full Width
                table.setSpacingBefore(10f); // Space before table
                table.setSpacingAfter(10f); // Space after table

                // Set Column widths
                float[] columnWidths = { 1f, 2f, 1f };
                table.setWidths(columnWidths);

                table.addCell("STT");
                table.addCell("Ten khoa hoc");
                table.addCell("Hoc phi");

                for (int i = 0; i < model.getRowCount(); i++) {
                    table.addCell(String.valueOf(i + 1));
                    table.addCell(String.valueOf(model.getValueAt(i, 1)));
                    table.addCell(String.valueOf(model.getValueAt(i, 2)));
                }

                document.add(table);

                document.add(new Paragraph("Tong cong: " + dhpView.getSum(), font));

                document.add(new Paragraph("Ngay lap hoa don: " + LocalDate.now().toString(), font));

                // thêm hàng chữ ký cho người lập hoá đơn và người thanh toán, cùng 1 hàng

                document.add(new Chunk("\n"));
                // Thêm chữ ký
                document.add(new Paragraph("Nguoi lap hoa don" + "                                                    " + "Nguoi thanh toan", font));

                // Đóng Document
                document.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            dhpView.showMessage("Thanh toán thành công! Xuất hoá đơn trong thư mục của phần mềm.");

        }
    }

}
