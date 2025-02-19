/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap_nhom20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LopHoc> danhSachLop = new HashMap<>();
        
        // Tạo lớp mẫu
        LopHoc lop1 = new LopHoc("CNTT1");
        Map<String, Double> diem1 = Map.of("LTHDT", 8.0, "QLDA", 7.5, "HM", 6.5, "CSDL", 8.5, "LTTB", 9.0);
        Map<String, Double> diem2 = Map.of("LTHDT", 5.0, "QLDA", 6.0, "HM", 5.5, "CSDL", 4.5, "LTTB", 6.0);
        Map<String, Double> diem3 = Map.of("LTHDT", 9.0, "QLDA", 8.5, "HM", 9.5, "CSDL", 9.0, "LTTB", 9.5);
        
        lop1.themSinhVien(new SinhVien("Nguyen", "A", "2000-01-01", "Hanoi", "CNTT1", diem1));
        lop1.themSinhVien(new SinhVien("Tran", "B", "2000-02-01", "HCM", "CNTT1", diem2));
        lop1.themSinhVien(new SinhVien("Le", "C", "2000-03-01", "Da Nang", "CNTT1", diem3));
        
        danhSachLop.put("CNTT1", lop1);
        
        // Giao diện nhập lớp từ người dùng
        System.out.println("Nhap ten lop de hien thi danh sach sinh vien va thong ke: ");
        String tenLop = scanner.nextLine();
        
        if (danhSachLop.containsKey(tenLop)) {
            LopHoc lop = danhSachLop.get(tenLop);
            System.out.println("Danh sach sinh vien lop " + tenLop + ":");
            for (SinhVien sv : lop.danhSachSV) {
                System.out.println(sv.firstName + " " + sv.lastName + " - Diem TB: " + sv.tinhDiemTB() + " - Xep hang: " + sv.xepHang());
            }
            lop.thongKeRank();
        } else {
            System.out.println("Khong tim thay lop!");
        }
        scanner.close();
    }
}
