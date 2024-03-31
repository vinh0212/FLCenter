package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.tad_sebs.Model.Canbo;
import vn.tad_sebs.Model.Lanhdao;
import vn.tad_sebs.Model.Teacher;
import vn.tad_sebs.Model.TeacherXML;
import vn.tad_sebs.Model.LanhdaoXML;
import vn.tad_sebs.Utils.FileUtils;

public class CanboDAO {
    class TeacherDAO
    {
        private List<Teacher> listTeachers;
        private static final String TEACHER_FILE_NAME = "canbo.xml";
        //private static final String CLASS_FILE_NAME = "class.xml";

        public TeacherDAO() {
            this.listTeachers = readListTeachers();
            if (listTeachers == null) {
                listTeachers = new ArrayList<Teacher>();
            }
        }

        public List<Teacher> readListTeachers() {
            List<Teacher> list = new ArrayList<Teacher>();
            TeacherXML teacherXML = (TeacherXML) FileUtils.readXMLFile(
                    TEACHER_FILE_NAME, TeacherXML.class);
            if (teacherXML != null) {
                list = teacherXML.getTeacher();
            }
            return list;
        }

        public void writeListTeachers(List<Teacher> teachers) {
            TeacherXML teacherXML = new TeacherXML();
            teacherXML.setTeacher(teachers);
            FileUtils.writeXMLtoFile(TEACHER_FILE_NAME, teacherXML);
        }

        public void add(Teacher teacher) {
            int id = 1;
            if (listTeachers != null && listTeachers.size() > 0) {
                id = listTeachers.size() + 1;
            }
            teacher.setId(id);
            listTeachers.add(teacher);
            writeListTeachers(listTeachers);
        }

        public void edit(Teacher teacher) {
            try {
                for (Teacher t : listTeachers) {
                if (t.getId() == teacher.getId()) {
                    t.setName(teacher.getName());
                    t.setDate(teacher.getDate());
                    t.setSex(teacher.getSex());
                    t.setAddress(teacher.getAddress());
                    t.setCapbacham(teacher.getCapbacham());
                    t.setLop(teacher.getLop());
                    t.setMon(teacher.getMon());
                    writeListTeachers(listTeachers);
                }
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public boolean delete(Teacher teacher)
        {
            boolean isFound = false;
            for (Teacher t : listTeachers)
            {
                if (t.getId() == teacher.getId())
                {
                    listTeachers.remove(t);
                    isFound = true;
                    break;
                }
            }
            if (isFound)
            {
                listTeachers.remove(teacher);
                writeListTeachers(listTeachers);
                return true;
            }
            return false;
        }
        public List<Teacher> getListTeachers()
        {
            return listTeachers;
        }
        public void setListTeachers(List<Teacher> listTeachers)
        {
            this.listTeachers = listTeachers;
        }
    }
}
