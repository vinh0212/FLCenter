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
    public static class TeacherDAO {
        private List<Teacher> listTeachers;
        private static final String TEACHER_FILE_NAME = "canbo.xml";
        // private static final String CLASS_FILE_NAME = "class.xml";

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
            Collections.sort(listTeachers, new Comparator<Teacher>() {
                @Override
                public int compare(Teacher t1, Teacher t2) {
                    return t1.getCapbacham().compareTo(t2.getCapbacham());
                }
            });
        }

        public List<Teacher> getListTeachers() {
            return listTeachers;
        }

        public void setListTeachers(List<Teacher> listTeachers) {
            this.listTeachers = listTeachers;
        }
    }

    public static class LanhdaoDAO
    {
        private List<Lanhdao> listLanhdaos;
        private static final String LANHDAO_FILE_NAME = "canbo.xml";

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
            int id = 1;
            if (listLanhdaos != null && listLanhdaos.size() > 0) {
                id = listLanhdaos.size() + 1;
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
            }
            catch (Exception ex)
            {
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
    }

}
