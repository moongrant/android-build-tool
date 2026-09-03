package p368o0OOo0Oo;

import p370o0OOo0o0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile OooOOO f43084OooO00o;

    public static OooOOO OooO00o() {
        if (f43084OooO00o == null) {
            synchronized (OooOo.class) {
                if (f43084OooO00o == null) {
                    f43084OooO00o = new OooOOO();
                }
            }
        }
        return f43084OooO00o;
    }
}
