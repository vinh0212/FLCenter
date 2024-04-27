package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import vn.tad_sebs.Model.Department;
import vn.tad_sebs.Model.DepartmentXML;
import vn.tad_sebs.Model.Lanhdao;
import vn.tad_sebs.Model.Teacher;
import vn.tad_sebs.Model.TeacherXML;
import vn.tad_sebs.Model.LanhdaoXML;
import vn.tad_sebs.Utils.FileUtils;

public class CanboDAO {

    public static class TeacherDAO {

        private List<Teacher> listTeachers;
        private List<Department> listDepartments;
        private static final String TEACHER_FILE_NAME = "teacher.xml";
        private static final String DP_FILE_NAME = "department.xml";
        // private static final String CLASS_FILE_NAME = "class.xml";

        public TeacherDAO() {
            this.listTeachers = readListTeachers();
            this.listDepartments = readListDepartments();
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

        public List<Department> readListDepartments() {
            List<Department> list = new ArrayList<Department>();
            DepartmentXML departmentXML = (DepartmentXML) FileUtils.readXMLFile(
                    DP_FILE_NAME, DepartmentXML.class);
            if (departmentXML != null) {
                list = departmentXML.getDepartment();
            }
            return list;
        }

        public void writeListTeachers(List<Teacher> teachers) {
            TeacherXML teacherXML = new TeacherXML();
            teacherXML.setTeacher(teachers);
            FileUtils.writeXMLtoFile(TEACHER_FILE_NAME, teacherXML);
        }

        public void add(Teacher teacher) {
            sortListTeachersByID();
            int id = 1;
            if (listTeachers.size() > 0) {
                id = listTeachers.get(listTeachers.size() - 1).getId() + 1;
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

                        t.setMon(teacher.getMon());
                        t.setDp(teacher.getDp());
                        writeListTeachers(listTeachers);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public boolean delete(Teacher teacher) {
            boolean isFound = false;
            for (Teacher t : listTeachers) {
                if (t.getId() == teacher.getId()) {
                    listTeachers.remove(t);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                listTeachers.remove(teacher);
                sortListTeachersByID();
                writeListTeachers(listTeachers);
                return true;
            }
            return false;
        }

        public void sortListTeachersByID() {
            Collections.sort(listTeachers, new Comparator<Teacher>() {
                @Override
                public int compare(Teacher t1, Teacher t2) {
                    return t1.getId() - t2.getId();
                }
            });
        }

        public void sortListTeachersByName() {
            Collections.sort(listTeachers, new Comparator<Teacher>() {
                @Override
                public int compare(Teacher t1, Teacher t2) {
                    return t1.getName().compareTo(t2.getName());
                }
            });
        }

        public void sortListTeachersByCapbacham() // need more attention
        {
            // Tạo một HashMap với các giá trị bạn muốn sắp xếp và thứ tự tương ứng của chúng
            Map<String, Integer> order = new HashMap<>();
            order.put("Đại tướng", 1);
            order.put("Thượng tướng", 2);
            order.put("Trung tướng", 3);
            order.put("Thiếu tướng", 4);
            order.put("Đại tá", 5);
            order.put("Thượng tá", 6);
            order.put("Trung tá", 7);
            order.put("Thiếu tá", 8);
            order.put("Đại uý", 9);
            order.put("Thượng uý", 10);
            order.put("Trung uý", 11);
            order.put("Thiếu uý", 12);
            order.put("Hạ sĩ quan/CSNV", 13);
            order.put("Không có", 14);

            Collections.sort(listTeachers, new Comparator<Teacher>() {
                @Override
                public int compare(Teacher l1, Teacher l2) {
                    // Sử dụng HashMap trong hàm so sánh
                    return order.get(l1.getCapbacham()).compareTo(order.get(l2.getCapbacham()));
                }
            });
        }

        public List<Teacher> getListTeachers() {
            return listTeachers;
        }

        public List<Department> getListDepartments() {
            return listDepartments;
        }

        public void setListTeachers(List<Teacher> listTeachers) {
            this.listTeachers = listTeachers;
        }

        public List<Teacher> getUnavailableList(List<Teacher> list) {
            List<Teacher> unavailableList = new ArrayList<Teacher>();
            // compart 2 IDs to select
            for (Teacher t : listTeachers) {
                boolean isFound = false;
                for (Teacher t1 : list) {
                    if (t.getId() == t1.getId()) {
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    unavailableList.add(t);
                }
            }
            return unavailableList;
        }

        public List<Teacher> getListTeacherswithName(String s) {
            if ("".equals(s)) {
                return null;
            }
            HashSet<Teacher> list = new HashSet<Teacher>();

            String[] parts = s.split(",");

            for (String part : parts) {
                Teacher teacher = new Teacher();
                teacher.setId(Integer.parseInt(part));
                list.add(teacher);
            }

            List<Teacher> listTeachersWithName = new ArrayList<Teacher>();
            for (Teacher t : list) {
                for (Teacher t1 : listTeachers) {
                    if (t.getId() == t1.getId()) {
                        listTeachersWithName.add(t1);
                    }
                }
            }
            return listTeachersWithName;
        }

    }

    public static class LanhdaoDAO {

        private List<Lanhdao> listLanhdaos;
        private static final String LANHDAO_FILE_NAME = "lanhdao.xml";

        public LanhdaoDAO() {
            this.listLanhdaos = readListLanhdaos();
            if (listLanhdaos == null) {
                listLanhdaos = new ArrayList<Lanhdao>();
            }
        }

        public List<Lanhdao> readListLanhdaos() {
            List<Lanhdao> list = new ArrayList<Lanhdao>();
            LanhdaoXML lanhdaoXML = (LanhdaoXML) FileUtils.readXMLFile(
                    LANHDAO_FILE_NAME, LanhdaoXML.class);
            if (lanhdaoXML != null) {
                list = lanhdaoXML.getLanhdao();
            }
            return list;
        }

        public void writeListLanhdaos(List<Lanhdao> lanhdaos) {
            LanhdaoXML lanhdaoXML = new LanhdaoXML();
            lanhdaoXML.setLanhdao(lanhdaos);
            FileUtils.writeXMLtoFile(LANHDAO_FILE_NAME, lanhdaoXML);
        }

        public void add(Lanhdao lanhdao) {
            sortListLanhdaosByID();
            int id = 1;
            if (listLanhdaos.size() > 0) {
                id = listLanhdaos.get(listLanhdaos.size() - 1).getId() + 1;
            }
            lanhdao.setId(id);
            listLanhdaos.add(lanhdao);
            writeListLanhdaos(listLanhdaos);
        }

        public void edit(Lanhdao lanhdao) {
            try {
                for (Lanhdao l : listLanhdaos) {
                    if (l.getId() == lanhdao.getId()) {
                        l.setName(lanhdao.getName());
                        l.setDate(lanhdao.getDate());
                        l.setSex(lanhdao.getSex());
                        l.setAddress(lanhdao.getAddress());
                        l.setCapbacham(lanhdao.getCapbacham());
                        l.setChucvu(lanhdao.getChucvu());
                        writeListLanhdaos(listLanhdaos);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public boolean delete(Lanhdao lanhdao) {
            boolean isFound = false;
            for (Lanhdao l : listLanhdaos) {
                if (l.getId() == lanhdao.getId()) {
                    listLanhdaos.remove(l);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                listLanhdaos.remove(lanhdao);
                sortListLanhdaosByID();
                writeListLanhdaos(listLanhdaos);
                return true;
            }
            return false;
        }

        public List<Lanhdao> getListLanhdaos() {
            return listLanhdaos;
        }

        public void setListLanhdaos(List<Lanhdao> listLanhdaos) {
            this.listLanhdaos = listLanhdaos;
        }

        public void sortListLanhdaosByID() {
            Collections.sort(listLanhdaos, new Comparator<Lanhdao>() {
                @Override
                public int compare(Lanhdao l1, Lanhdao l2) {
                    return l1.getId() - l2.getId();
                }
            });
        }

        public void sortListLanhdaosByName() {
            Collections.sort(listLanhdaos, new Comparator<Lanhdao>() {
                @Override
                public int compare(Lanhdao l1, Lanhdao l2) {
                    return l1.getName().compareTo(l2.getName());
                }
            });
        }

        public void sortListLanhdaosByCapbacham() {
            // Tạo một HashMap với các giá trị bạn muốn sắp xếp và thứ tự tương ứng của chúng
            Map<String, Integer> order = new HashMap<>();
            order.put("Đại tướng", 1);
            order.put("Thượng tướng", 2);
            order.put("Trung tướng", 3);
            order.put("Thiếu tướng", 4);
            order.put("Đại tá", 5);
            order.put("Thượng tá", 6);
            order.put("Trung tá", 7);
            order.put("Thiếu tá", 8);
            order.put("Đại uý", 9);
            order.put("Thượng uý", 10);
            order.put("Trung uý", 11);
            order.put("Thiếu uý", 12);
            order.put("Hạ sĩ quan/CSNV", 13);
            order.put("Không có", 14);

            Collections.sort(listLanhdaos, new Comparator<Lanhdao>() {
                @Override
                public int compare(Lanhdao l1, Lanhdao l2) {
                    // Sử dụng HashMap trong hàm so sánh
                    return order.get(l1.getCapbacham()).compareTo(order.get(l2.getCapbacham()));
                }
            });
        }

        public void sortListLanhdaosByChucvu() // need more attention
        {
            Collections.sort(listLanhdaos, new Comparator<Lanhdao>() {
                @Override
                public int compare(Lanhdao l1, Lanhdao l2) {
                    return l1.getChucvu().compareTo(l2.getChucvu());
                }
            });
        }
    }

}
