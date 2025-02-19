/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap_nhom20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class LopHoc {
    String tenLop;
    List<SinhVien> danhSachSV = new ArrayList<>();

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
    }

    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
    }

    public void thongKeRank() {
        Map<String, Integer> thongKe = new HashMap<>();
        thongKe.put("A", 0);
        thongKe.put("B", 0);
        thongKe.put("C", 0);
        thongKe.put("D", 0);
        thongKe.put("<D", 0);
        
        for (SinhVien sv : danhSachSV) {
            String rank = sv.xepHang();
            thongKe.put(rank, thongKe.get(rank) + 1);
        }
        
        System.out.println("Thong ke xep hang diem lop " + tenLop + ":");
        thongKe.forEach((rank, count) -> System.out.println(rank + ": " + count));
    }
}
