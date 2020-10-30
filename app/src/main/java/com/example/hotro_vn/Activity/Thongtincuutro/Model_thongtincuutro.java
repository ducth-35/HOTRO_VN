package com.example.hotro_vn.Activity.Thongtincuutro;

public class Model_thongtincuutro {
    private String sanpham;
    private  String diadiem;
    private  String ngaythang;
    private  String nguoitao;
    private  String songuoitao;
    private String thoigian;
    private String sodienthoai;
    private String chucvu;
    private  String building;

    public Model_thongtincuutro(String sanpham, String diadiem, String ngaythang, String nguoitao, String songuoitao, String thoigian, String sodienthoai, String chucvu, String building) {
        this.sanpham = sanpham;
        this.diadiem = diadiem;
        this.ngaythang = ngaythang;
        this.nguoitao = nguoitao;
        this.songuoitao = songuoitao;
        this.thoigian = thoigian;
        this.sodienthoai = sodienthoai;
        this.chucvu = chucvu;
        this.building = building;
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

    public String getSonguoitao() {
        return songuoitao;
    }

    public void setSonguoitao(String songuoitao) {
        this.songuoitao = songuoitao;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
