class stud {

    public stud(String name, String address, String phone_no) {
        System.out.println(" Student details :" + "   name:" + name +
                "   address:" + address +
                "   phone_Number:" + phone_no);
    }

    public stud(String name, String address, String phone_no, String adhar) {
        System.out.println(" Student details :" + "name:" + name +
                "    address:" + address +
                "    phone_Number:" + phone_no
                + "   adhar_card:" + adhar);
    }

    public stud(String name, String address, String phone_no, String adhar, String parent_phone) {
        System.out.println(" Student details :" +
                "  name:" + name +
                "   address:" + address +
                "   phone_Number:" + phone_no
                + "  adhar:" + adhar + "     parent_no.:" + parent_phone);
    }
}

public class Student_polymorp {
    public static void main(String[] args) {
        stud st = new stud("vansh", "surat", "123456");
        stud st1 = new stud("vansh", "surat", "123456", "2851v8515");
        stud st2 = new stud("vansh", "surat", "123456", "5948548dg", "25484864");
    }

}