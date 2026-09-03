package com.app.base.model;

import OooO00o.OooO00o;
import Oooo000.o000O0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TurntableModel {

    public static class DescsModel {
        public String desc;
        public String url;

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DescsModel{desc='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.desc, '\'', ", url='");
            return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', '}');
        }
    }

    public static class TurntableDesc {

        /* JADX INFO: renamed from: code, reason: collision with root package name */
        public int f11894code;
        public List<DescsModel> descs;
    }

    public static class TurntableItemList {

        /* JADX INFO: renamed from: code, reason: collision with root package name */
        public int f11895code;
        public List<TurntableItemModel> items;
        public int type;
    }

    public static class TurntableItemModel {
        public String en;
        public long id;

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TurntableItem{en='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.en, '\'', ", id=");
            return o000O0.OooO0O0(sbOooO0o0, this.id, '}');
        }
    }

    public static class TurntableStart {
        public static final String TYPE_OTHER = "other";
        public static final String TYPE_SELF = "source";
        public String ar;

        /* JADX INFO: renamed from: code, reason: collision with root package name */
        public int f11896code;
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

        /* JADX INFO: renamed from: code, reason: collision with root package name */
        public int f11897code;
        public List<TurntableItemModel> items;
    }
}
