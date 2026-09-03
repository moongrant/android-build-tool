package com.yalla.yalla.model;

import androidx.compose.animation.o000oOoO;
import java.util.List;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
public class TurntableModel {

    public static class DescsModel {
        public String desc;
        public String url;

        public String toString() {
            StringBuilder sb = new StringBuilder("DescsModel{desc='");
            sb.append(this.desc);
            sb.append("', url='");
            return o0oOO.OooO0O0(sb, this.url, "'}");
        }
    }

    public static class TurntableDesc {
        public int code;
        public List<DescsModel> descs;
    }

    public static class TurntableItemList {
        public int code;
        public List<TurntableItemModel> items;
        public int type;
    }

    public static class TurntableItemModel {
        public String en;
        public long id;

        public String toString() {
            StringBuilder sb = new StringBuilder("TurntableItem{en='");
            sb.append(this.en);
            sb.append("', id=");
            return o000oOoO.OooO00o(sb, this.id, '}');
        }
    }

    public static class TurntableStart {
        public static final String TYPE_OTHER = "other";
        public static final String TYPE_SELF = "source";
        public String ar;
        public int code;
        public String en;
        public String es;
        public String hi;
        public String id;
        public int item;
        public String ja;
        public long leftcoin;
        public int mic;
        public String pt;
        public String tr;
        public String type;
        public String ur;
    }

    public static class TurntableStatus {
        public int code;
        public List<TurntableItemModel> items;
    }
}
