package com.company.patterns.behavioral.command.bankandsupplier.supplier;

public class ReceiveSupplier {
    private int supplierId;
    private String supplierName;

    public ReceiveSupplier(int supplierId, String supplierName) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

//    public void enable() {
//
//    }
//
//    public void disable() {
//        System.out.println("-" + supplierId + "' id'li" + supplierName + " adli supplier pasif edildi");
//    }


    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
