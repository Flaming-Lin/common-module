package converter;

import com.flaming.common.converter.BeanCopyConverter;
import com.flaming.common.table.TableInfo;
import com.flaming.common.table.TableRow;

import java.util.Collections;

public class BeanCopyConverterTest {

    public static void main(String[] args) {
        TableInfo tableInfo = new TableInfo();
        tableInfo.setTitle("test");
        tableInfo.setRawInfo(111);
        tableInfo.setTableType(5.2);
        tableInfo.setRows(Collections.singletonList(new TableRow()));

        BeanCopyConverter<TableInfo> beanCopyConverter = new BeanCopyConverter<>();

        TableInfo newTableInfo = beanCopyConverter.convert(tableInfo, TableInfo.class);
        System.out.println(newTableInfo.toString());
    }

}
