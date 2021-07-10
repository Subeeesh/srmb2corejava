public class Obcl {

    public static void main(String[] args) {
        String str="Subeesh";
        System.out.println(str);
        StringBuffer str2=new StringBuffer(str);
        System.out.println(str2.length());
        System.out.println(str2.getClass()+" "+str2.hashCode());

        String str1="Amal";
        System.out.println(str1.toString());

        String str3="Mahez";
        System.out.println(str3.toString());

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());

        System.out.println(str.getClass());


    }

}