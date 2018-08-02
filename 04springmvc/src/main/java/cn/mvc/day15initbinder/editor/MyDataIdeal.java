package cn.mvc.day15initbinder.editor;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Pattern;

public class MyDataIdeal extends PropertiesEditor
{
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat sdf=getSimpleDate(text);
        Date date=null;
        try {
            date=sdf.parse(text);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        setValue(date);
    }
    /*根据字符串的格式自定义转换的格式*/
    private SimpleDateFormat getSimpleDate(String str) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        if(Pattern.matches("^\\d{4}-\\d{1,2}-\\d{2}$",str)){
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        }
        if(Pattern.matches("^\\d{4}/\\d{1,2}/\\d{2}$",str)){
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }
        if(Pattern.matches("^\\d{4}\\d{1,2}\\d{2}$",str)){
            sdf=new SimpleDateFormat("yyyyMMdd");
        }
        return sdf;
    }
}
