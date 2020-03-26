package firstproject.leminh.chuong9_bai20;

public class SanPham  {
    private String ma;
    private String ten;
    private int dongia;

    public SanPham(String ma,String ten,int dongia){
        this.ma = ma;
        this.ten = ten;
        this.dongia = dongia;
    }

    public String getTen() {
        return ten;
    }
    public String getMa(){
        return ma;
    }
    public int getDongia(){
        return dongia;
    }
}
