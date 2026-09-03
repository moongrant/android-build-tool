package com.yalla.yalla.data.db.model;

import androidx.compose.foundation.layout.oo000o;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
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
        switch (OooOo00.OooO0OO()) {
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
        StringBuilder sb = new StringBuilder("ApiErrorCodeDB{\n id=");
        sb.append(this.id);
        sb.append("\n Code='");
        sb.append(this.Code);
        sb.append("\n MessgeEn='");
        sb.append(this.MessgeEn);
        sb.append("\n MessgeME='");
        sb.append(this.MessgeME);
        sb.append("\n MessgeTr='");
        sb.append(this.MessgeTr);
        sb.append("\n MessgeIn='");
        sb.append(this.MessgeIn);
        sb.append("\n MessgePT='");
        sb.append(this.MessgePT);
        sb.append("\n MessgeES='");
        sb.append(this.MessgeES);
        sb.append("\n MessgeHi='");
        sb.append(this.MessgeHi);
        sb.append("\n MessgeUr='");
        return oo000o.OooO0O0(sb, this.MessgeUr, '}');
    }
}
