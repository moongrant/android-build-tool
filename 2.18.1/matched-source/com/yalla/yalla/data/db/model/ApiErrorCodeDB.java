package com.yalla.yalla.data.db.model;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"Code"})})
public class ApiErrorCodeDB {
    public String Code;
    public String MessgeES;
    public String MessgeEn;
    public String MessgeHi;
    public String MessgeIn;
    public String MessgeME;
    public String MessgePT;
    public String MessgeTr;
    public String MessgeUr;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    public String getMessge() {
        switch (oo000o.OooO0O0()) {
            case 1:
                return this.MessgeME;
            case 2:
                return this.MessgeTr;
            case 3:
                return this.MessgeIn;
            case 4:
            default:
                return this.MessgeEn;
            case 5:
                return this.MessgePT;
            case 6:
                return this.MessgeES;
            case 7:
                return this.MessgeHi;
            case 8:
                return this.MessgeUr;
        }
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ApiErrorCodeDB{\n id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append("\n Code='");
        sbOooO0o0.append(this.Code);
        sbOooO0o0.append("\n MessgeEn='");
        sbOooO0o0.append(this.MessgeEn);
        sbOooO0o0.append("\n MessgeME='");
        sbOooO0o0.append(this.MessgeME);
        sbOooO0o0.append("\n MessgeTr='");
        sbOooO0o0.append(this.MessgeTr);
        sbOooO0o0.append("\n MessgeIn='");
        sbOooO0o0.append(this.MessgeIn);
        sbOooO0o0.append("\n MessgePT='");
        sbOooO0o0.append(this.MessgePT);
        sbOooO0o0.append("\n MessgeES='");
        sbOooO0o0.append(this.MessgeES);
        sbOooO0o0.append("\n MessgeHi='");
        sbOooO0o0.append(this.MessgeHi);
        sbOooO0o0.append("\n MessgeUr='");
        return o00oO0o.OooO0O0(sbOooO0o0, this.MessgeUr, '}');
    }
}
