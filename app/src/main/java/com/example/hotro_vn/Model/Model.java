package com.example.hotro_vn.Model;

import java.math.BigInteger;
import java.util.Date;

public class Model {
    private String sanpham;
    private  String diadiem;
    private  String ngaythang;
    private  String nguoitao;

    public Model(String sanpham, String diadiem, String ngaythang, String nguoitao) {
        this.sanpham = sanpham;
        this.diadiem = diadiem;
        this.ngaythang = ngaythang;
        this.nguoitao = nguoitao;
    }

    public String getSanpham() {
        return sanpham;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public String getNgaythang() {
        return ngaythang;
    }

    public void setNgaythang(String ngaythang) {
        this.ngaythang = ngaythang;
    }

    public String getNguoitao() {
        return nguoitao;
    }

    public void setNguoitao(String nguoitao) {
        this.nguoitao = nguoitao;
    }
}
