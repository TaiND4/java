package QuanLySinhVien;

import java.util.Scanner;

public class SinhVien extends Nguoi{
	 String maSV;
	 String tenHocPhan1, tenHocPhan2;
	 double diemMon1, diemMon2;
	 double diemTB;
	
	public SinhVien() {
		
	}
	

	public SinhVien(String hoTen, String diaChi, int namSinh, String maSV) {
		super(hoTen, diaChi, namSinh);
		this.namSinh = namSinh;
		this.maSV = maSV;
	}

	@Override
	public void NhapTT() {
		super.NhapTT();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma sinh vien: ");
		maSV = sc.nextLine();
		System.out.println("Ten hoc phan 1: ");
		tenHocPhan1 = sc.nextLine();
		System.out.println("Diem hoc phan 1: ");
		diemMon1 = Double.parseDouble(sc.nextLine());
		System.out.println("Ten hoc phan 2: ");
		tenHocPhan2 = sc.nextLine();
		System.out.println("Diem hoc phan 2: ");
		diemMon2 = Double.parseDouble(sc.nextLine());
	}
	
	public void HienThi() {
		super.HienThi();
		System.out.println("Ma sv: " + this.maSV);
		System.out.println("Ten hoc phan 1: " + this.tenHocPhan1);
		System.out.println("Diem mon 1: " + this.diemMon1 );
		System.out.println("Ten hoc phan 2: " + this.tenHocPhan2);
		System.out.println("Diem mon 2: " + this.diemMon2 );
		System.out.println("Diem TB: " + DiemTB());
		
	}
	
	public double DiemTB() {
		diemTB = (diemMon1 + diemMon2) / 2;
		return diemTB;
		
	}
	
	
}
