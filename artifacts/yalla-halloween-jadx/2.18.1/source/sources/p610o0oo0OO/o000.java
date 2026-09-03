package p610o0oo0OO;

import android.os.Handler;
import android.os.Looper;
import p613o0oo0OOo.oOo000o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile oOo000o0 f48361OooO00o;

    static {
        new Handler(Looper.getMainLooper());
    }

    public static o000O000 OooO00o() {
        if (f48361OooO00o == null) {
            synchronized (o000.class) {
                if (f48361OooO00o == null) {
                    f48361OooO00o = new oOo000o0();
                }
            }
        }
        return f48361OooO00o;
    }
}
