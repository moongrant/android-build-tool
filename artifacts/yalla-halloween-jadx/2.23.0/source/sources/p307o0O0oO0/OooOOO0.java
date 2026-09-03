package p307o0O0oO0;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile OooOOO0 f42476OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f42477OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f42478OooO0O0 = false;

    public OooOOO0() {
        OooOOO oooOOO;
        synchronized (OooOOO.class) {
            if (OooOOO.f42475OooO00o == null) {
                OooOOO.f42475OooO00o = new OooOOO();
            }
            oooOOO = OooOOO.f42475OooO00o;
        }
        this.f42477OooO00o = oooOOO;
    }

    public static OooOOO0 OooO0Oo() {
        if (f42476OooO0OO == null) {
            synchronized (OooOOO0.class) {
                if (f42476OooO0OO == null) {
                    f42476OooO0OO = new OooOOO0();
                }
            }
        }
        return f42476OooO0OO;
    }

    public final void OooO00o(String str) {
        if (this.f42478OooO0O0) {
            this.f42477OooO00o.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void OooO0O0(String str, Object... objArr) {
        if (this.f42478OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f42477OooO00o.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    public final void OooO0OO(String str, Object... objArr) {
        if (this.f42478OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f42477OooO00o.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void OooO0o(String str) {
        if (this.f42478OooO0O0) {
            this.f42477OooO00o.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void OooO0o0(String str, Object... objArr) {
        if (this.f42478OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f42477OooO00o.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    public final void OooO0oO(String str, Object... objArr) {
        if (this.f42478OooO0O0) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f42477OooO00o.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
