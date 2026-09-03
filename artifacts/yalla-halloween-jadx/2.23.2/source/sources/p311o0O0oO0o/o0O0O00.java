package p311o0O0oO0o;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile o0O0O00 f41824OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo f41825OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f41826OooO0O0 = false;

    public o0O0O00() {
        o000OOo o000ooo2;
        synchronized (o000OOo.class) {
            if (o000OOo.f41823OooO00o == null) {
                o000OOo.f41823OooO00o = new o000OOo();
            }
            o000ooo2 = o000OOo.f41823OooO00o;
        }
        this.f41825OooO00o = o000ooo2;
    }

    public static o0O0O00 OooO0Oo() {
        if (f41824OooO0OO == null) {
            synchronized (o0O0O00.class) {
                if (f41824OooO0OO == null) {
                    f41824OooO0OO = new o0O0O00();
                }
            }
        }
        return f41824OooO0OO;
    }

    public final void OooO00o(String str) {
        if (this.f41826OooO0O0) {
            this.f41825OooO00o.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void OooO0O0(String str, Object... objArr) {
        if (this.f41826OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f41825OooO00o.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    public final void OooO0OO(String str, Object... objArr) {
        if (this.f41826OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f41825OooO00o.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void OooO0o(String str) {
        if (this.f41826OooO0O0) {
            this.f41825OooO00o.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void OooO0o0(String str, Object... objArr) {
        if (this.f41826OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f41825OooO00o.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    public final void OooO0oO(String str, Object... objArr) {
        if (this.f41826OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f41825OooO00o.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
