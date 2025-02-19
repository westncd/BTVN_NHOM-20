/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap_nhom20;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class SinhVien {
    String firstName, lastName, birthdate, address, classname;
    Map<String, Double> diemMonHoc = new HashMap<>();

    public SinhVien(String firstName, String lastName, String birthdate, String address, String classname,Map<String, Double> diemMonHoc ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.classname = classname;
        this.diemMonHoc.putAll(diemMonHoc);
    }
    
    public double tinhDiemTB() {
        return diemMonHoc.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public String xepHang() {
        double diemTB = tinhDiemTB();
        if (diemTB >= 8.5) return "A";
        else if (diemTB >= 7.0 && diemTB < 8.5) return "B";
        else if (diemTB >= 5.5 && diemTB < 7.0 ) return "C";
        else if (diemTB >= 4.0 && diemTB < 5.5) return "D";
        else return "<D";
    }
}
