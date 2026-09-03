package p419o0Oo0oO0;

import com.yalla.yalla.common.model.ShopVehicleListModel;
import p415o0Oo0o00.o000O000;
import p415o0Oo0o00.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f39601OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0o f39602OooO0O0;

    public static class OooO00o {
        public static boolean OooO00o(o000O000 o000o001) {
            return (o000o001.OooO0O0("If-Modified-Since") == null && o000o001.OooO0O0("If-None-Match") == null) ? false : true;
        }
    }

    public o00Ooo(o000O000 o000o001, o000O0o o000o0o2) {
        this.f39601OooO00o = o000o001;
        this.f39602OooO0O0 = o000o0o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r3.OooO00o().f39265OooO0o0 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OooO00o(o000O0o o000o0o2, o000O000 o000o001) {
        int i = o000o0o2.f39335OooO0OO;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case ShopVehicleListModel.VehicleTagType_Vip300 /* 300 */:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (o000o0o2.OooO0OO("Expires") == null) {
                if (o000o0o2.OooO00o().f39262OooO0OO == -1) {
                    if (!o000o0o2.OooO00o().f39264OooO0o) {
                    }
                }
            }
        }
        return (o000o0o2.OooO00o().f39261OooO0O0 || o000o001.OooO00o().f39261OooO0O0) ? false : true;
    }
}
