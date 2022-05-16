package complex;

import java.util.Scanner;

    

public class Complex {
    // Thuoc tinh
    private double a;
    private double b;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Complex() {
        a = 0;
        b = 0;
    }

    // Ham khoi tao co doi so
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Ham nhap so phuc
    public void nhap(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        a = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        b = sc.nextDouble();
    }

    // Ham hien thi so phuc
    public void hienThi() {
        if (b < 0) {
            System.out.println(a + " - " + Math.abs(b) + "*j");
        } else {
            System.out.println(a + " + " + b + "*j");
        }
    }
    
    
     // Ham cong 2 so phuc
    public Complex congSP(Complex sp2) {
        double thuc = a + sp2.a;
        double ao = b + sp2.b;
        return new Complex(thuc, ao);
    }

    // Ham tru 2 so phuc
    public Complex truSP(Complex sp2) {
        double thuc = a - sp2.a;
        double ao = b - sp2.b;
        return new Complex(thuc, ao);
    }

    // Ham nhan 2 so phuc
    public Complex nhanSP(Complex sp2) {
        double thuc = a * sp2.a - b * sp2.b;
        double ao = a * sp2.b + sp2.a * b;
        return new Complex(thuc, ao);
    }

    // Ham chia 2 so phuc
    public Complex chiaSP(Complex sp2) {
        double thuc = (a * sp2.a + b * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        double ao = (sp2.a * b - a * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        return new Complex(thuc, ao);
    }
    
    public Complex nhanthuc(float t) {
        double thuc = a * t;
        double ao = b * t;
        return new Complex(thuc, ao);
    }
    
    
    
    public double modun() {
        return Math.sqrt(a * a + b* b);
    }
    
    public String sosanh (Complex sp2) {
        if (a == sp2.a && b == sp2.b)
            System.out.println("bang nhau");
        else
            System.out.println("ko bang nhau");
        return null;
    }
    
    
    
    

    public static void main(String[] args) {
        float t;
        System.out.print("Nhap t: ");
        Scanner d = new Scanner(System.in);
        t = d.nextFloat();
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex spTong = new Complex();
        Complex spHieu = new Complex();
        Complex spTich = new Complex();
        Complex spThuong = new Complex(); 
        Complex spNhanthuc = new Complex();
        

        // Nhap
        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(sc);

        // Hien thi
        System.out.println("So phuc 1 la:");
        sp1.hienThi();
        System.out.println("So phuc 2 la:");
        sp2.hienThi();
        
        sp1.toString();

        // tong
        spTong = sp1.congSP(sp2);
        System.out.println("Ket qua cua phep cong sp1 cho sp2 la:");
        spTong.hienThi();
        
        
        //hieu
        spHieu = sp1.truSP(sp2);
        System.out.println("Ket qua cua phep tru sp1 cho sp2 la:");
        spHieu.hienThi();
        

       //tich
        spTich = sp1.nhanSP(sp2);
        System.out.println("Ket qua cua phep nhan sp1 cho sp2 la:");
        spTich.hienThi();
        
        
        //chia
        spThuong = sp1.chiaSP(sp2);
        System.out.println("Ket qua cua phep chia sp1 cho sp2 la:");
        spThuong.hienThi();
        
        spNhanthuc = sp1.nhanthuc(t);
        System.out.println("Ket qua cua phep nhan sp1 voi so thuc:");
        spNhanthuc.hienThi();

        sc.close();
    }
}
