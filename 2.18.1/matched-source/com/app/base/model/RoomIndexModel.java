package com.app.base.model;

import com.app.base.interfaceType.FeedbackType;
import kotlin.collections.unsigned.OooO00o;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public class RoomIndexModel {
    public AdData adData;
    public String barid;
    public String baridx;
    public String barimage;
    public String barlevel;
    public String barname;
    public String bartype;
    public String countryid;
    public String heatday;
    public String heatnow;
    public int isPrettyBarId;
    public String isencrypt;
    public int isofficial;
    public int ispwdroom;
    public String labelname;
    public String livestate;
    public String medal;
    public String notice;
    public String onlinenum;
    public String positionid;
    public String relatedType;
    public String roomserverip;
    public String sessionId;
    public String time;
    public int uiNoRoom;
    public String variety;
    public int istop = 0;
    public int frontThreeValue = 0;
    public String uid = OooO00o.OooO0O0(OooOOO.f41216OooO00o);

    public class AdData {
        public String adid = "";
        public String adTitle = "";
        public String adImage = "";
        public String adDescription = "";
        public String adUrl = "";

        public AdData() {
        }

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("AdData{adid='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.adid, '\'', ", adTitle='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.adTitle, '\'', ", adImage='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.adImage, '\'', ", adDescription='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.adDescription, '\'', ", adUrl='");
            return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.adUrl, '\'', '}');
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean isFull() {
        try {
            int i = Integer.parseInt(this.onlinenum);
            String str = this.bartype;
            byte b = -1;
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        b = 4;
                    }
                    break;
                case 50:
                    if (str.equals(FeedbackType.Suggestions)) {
                        b = 3;
                    }
                    break;
                case 51:
                    if (str.equals(FeedbackType.Recharge)) {
                        b = 2;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        b = 1;
                    }
                    break;
                case 53:
                    if (str.equals(FeedbackType.Others)) {
                        b = 0;
                    }
                    break;
            }
            if (b == 0) {
                return i >= 2000;
            }
            if (b == 1) {
                return i >= 1000;
            }
            if (b == 2) {
                return i >= 100;
            }
            if (b != 3) {
                return b == 4 && i >= 20;
            }
            return i >= 50;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RoomIndexModel{barid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barid, '\'', ", baridx='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.baridx, '\'', ", barname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barname, '\'', ", bartype='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.bartype, '\'', ", barlevel='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barlevel, '\'', ", barimage='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barimage, '\'', ", heatday='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.heatday, '\'', ", livestate='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.livestate, '\'', ", roomserverip='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.roomserverip, '\'', ", variety='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.variety, '\'', ", isencrypt='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.isencrypt, '\'', ", onlinenum='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.onlinenum, '\'', ", notice='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.notice, '\'', ", labelname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.labelname, '\'', ", heatnow='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.heatnow, '\'', ", istop='");
        sbOooO0o0.append(this.istop);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", countryid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.countryid, '\'', ", relatedType='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.relatedType, '\'', ", frontThreeValue=");
        sbOooO0o0.append(this.frontThreeValue);
        sbOooO0o0.append(", uiNoRoom=");
        sbOooO0o0.append(this.uiNoRoom);
        sbOooO0o0.append(", positionid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.positionid, '\'', ", sessionId='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.sessionId, '\'', "adData:");
        sbOooO0o0.append(this.adData);
        sbOooO0o0.append('\'');
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
