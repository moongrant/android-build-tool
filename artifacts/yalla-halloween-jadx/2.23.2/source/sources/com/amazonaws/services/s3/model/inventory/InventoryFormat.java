package com.amazonaws.services.s3.model.inventory;

/* JADX INFO: loaded from: classes2.dex */
public enum InventoryFormat {
    CSV;

    private final String format = "CSV";

    @Override // java.lang.Enum
    public final String toString() {
        return this.format;
    }
}
