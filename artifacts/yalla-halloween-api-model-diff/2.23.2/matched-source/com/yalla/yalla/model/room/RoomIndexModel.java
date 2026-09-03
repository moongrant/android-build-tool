package com.yalla.yalla.model.room;

import com.yalla.yalla.data.constant.FeedbackType;
import p004OooO0oO.o0OoOo0;
import p028Oooo0oO.o0oOO;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
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
    public String uid;
    public String variety;
    public String websocketaddr;
    public int istop = 0;
    public int frontThreeValue = 0;

    public class AdData {
        public String adid = "";
        public String adTitle = "";
        public String adImage = "";
        public String adDescription = "";
        public String adUrl = "";

        public AdData() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AdData{adid='");
            sb.append(this.adid);
            sb.append("', adTitle='");
            sb.append(this.adTitle);
            sb.append("', adImage='");
            sb.append(this.adImage);
            sb.append("', adDescription='");
            sb.append(this.adDescription);
            sb.append("', adUrl='");
            return o0oOO.OooO0O0(sb, this.adUrl, "'}");
        }
    }

    public RoomIndexModel() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        this.uid = o0OoOo0.OooO00o();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean isFull() {
        byte b;
        try {
            int i = Integer.parseInt(this.onlinenum);
            String str = this.bartype;
            switch (str.hashCode()) {
                case 49:
                    if (!str.equals("1")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 50:
                    if (!str.equals(FeedbackType.Suggestions)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 51:
                    if (!str.equals(FeedbackType.Recharge)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 52:
                    if (!str.equals("4")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 53:
                    if (!str.equals(FeedbackType.Others)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                default:
                    b = -1;
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
        return "RoomIndexModel{barid='" + this.barid + "', baridx='" + this.baridx + "', barname='" + this.barname + "', bartype='" + this.bartype + "', barlevel='" + this.barlevel + "', barimage='" + this.barimage + "', heatday='" + this.heatday + "', livestate='" + this.livestate + "', roomserverip='" + this.roomserverip + "', variety='" + this.variety + "', isencrypt='" + this.isencrypt + "', onlinenum='" + this.onlinenum + "', notice='" + this.notice + "', labelname='" + this.labelname + "', heatnow='" + this.heatnow + "', istop='" + this.istop + "', countryid='" + this.countryid + "', relatedType='" + this.relatedType + "', frontThreeValue=" + this.frontThreeValue + ", uiNoRoom=" + this.uiNoRoom + ", positionid='" + this.positionid + "', sessionId='" + this.sessionId + "'adData:" + this.adData + "'}";
    }
}
