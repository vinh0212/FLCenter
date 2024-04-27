package vn.tad_sebs.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import vn.tad_sebs.Model.Data;
import vn.tad_sebs.Model.DataXML;
import vn.tad_sebs.Utils.FileUtils;

public class DataDAO {
    private List<Data> listDatas;
    private static final String DATA_FILE_NAME = "data.xml";

    public DataDAO()
    {
        this.listDatas = readListDatas();
        if (listDatas == null)
        {
            listDatas = new ArrayList<Data>();
        }
    }

    public List<Data> readListDatas()
    {
        List<Data> list = new ArrayList<Data>();
        DataXML dataXML = (DataXML)FileUtils.readXMLFile(DATA_FILE_NAME, DataXML.class);
        if (dataXML != null)
        {
            list = dataXML.getData();
        }
        return list;
    }

    public void writeListDatas(List<Data> datas)
    {
        DataXML dataXML = new DataXML();
        dataXML.setData(datas);
        FileUtils.writeXMLtoFile(DATA_FILE_NAME, dataXML);
    }

    public void add(Data data)
    {
        sortByID();
        int id = 1;
        if (listDatas.size() > 0)
        {
            id = listDatas.get(listDatas.size()-1).getId() + 1;
        }
        data.setId(id);
        listDatas.add(data);
        writeListDatas(listDatas);
    }

    public void edit(Data data)
    {
        try
        {
            for (Data d : listDatas)
            {
                if (d.getId() == data.getId())
                {
                    d.setName(data.getName());
                    d.setAuthor(data.getAuthor());
                    d.setCategory(data.getCategory());
                    break;
                }
            }
            sortByID();
            writeListDatas(listDatas);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean delete(Data data)
    {
        boolean isFound = false;
        for (Data d : listDatas)
        {
            if (d.getId() == data.getId())
            {
                data = d;
                isFound = true;
                break;
            }
        }
        if (isFound)
        {
            listDatas.remove(data);
            sortByID();
            writeListDatas(listDatas);
            return true;
        }
        return false;
    }

    public void sortByName()
    {
        Collections.sort(listDatas, new Comparator<Data>()
        {
            @Override
            public int compare(Data o1, Data o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortByID()
    {
        Collections.sort(listDatas, new Comparator<Data>()
        {
            @Override
            public int compare(Data o1, Data o2)
            {
                return Integer.valueOf(o1.getId()).compareTo(o2.getId());
            }
        });
    
    }

    public List<Data> getListDatas()
    {
        return listDatas;
    }

    public void setListDatas(List<Data> listDatas)
    {
        this.listDatas = listDatas;
    }

}
