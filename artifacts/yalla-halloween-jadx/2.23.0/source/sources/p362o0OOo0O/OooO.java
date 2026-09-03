package p362o0OOo0O;

import p364o0OOo0OO.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile OooOOO f43873OooO00o;

    public static OooOOO OooO00o() {
        if (f43873OooO00o == null) {
            synchronized (OooO.class) {
                if (f43873OooO00o == null) {
                    f43873OooO00o = new OooOOO();
                }
            }
        }
        return f43873OooO00o;
    }
}
