package QuanLySinhVien;

import java.util.Scanner;

public class Nguoi {
	 String hoTen;
	 String diaChi;
	 int namSinh;
	
	 
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public Nguoi(){
		
	}
	
	public Nguoi(String ht, String dc, int ns) {
		hoTen = ht;
		diaChi = dc;
		namSinh = ns;
	}
	
	public void NhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Dia chi: ");
		diaChi = sc.nextLine();
		System.out.println("Nam sinh: ");
		namSinh = sc.nextInt();
	}
	
	public void HienThi() {
		System.out.println("Ten sv: " + this.hoTen);
		System.out.println("Dia chi sv: " + this.diaChi);
		System.out.println("Nam sinh sv: " + this.namSinh);
	}
	
	
}
