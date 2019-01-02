import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo{
    static public void SimgleFormat(String pattern,double value1){

        DecimalFormat myFormat =new DecimalFormat(pattern);
        String output=myFormat.format(value1);
        System.out.println(value1+" "+pattern+" "+output);
    }


    static public void UseApplyPatternMethodFormat(String pattern,double abc){
        DecimalFormat myFormat=new DecimalFormat();
        myFormat.applyPattern(pattern);
        System.out.println(abc+" "+pattern+" "+myFormat.format(abc));
    }

    public static void main(String[] args){

        SimgleFormat("###,###,###",123456.789);
        SimgleFormat("00000000.###kg",123456.789);
        SimgleFormat("000000.000",123.78);
        UseApplyPatternMethodFormat("###.##",123456.789);
        UseApplyPatternMethodFormat("0.00\u2030",0.789);
    }
}