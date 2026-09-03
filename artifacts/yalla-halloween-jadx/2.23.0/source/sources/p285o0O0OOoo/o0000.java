package p285o0O0OOoo;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import p286o0O0Oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f42109OooO00o;

    public o0000(o0000Ooo o0000ooo) {
        this.f42109OooO00o = o0000ooo;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        o0O0O00 o0o0o00 = this.f42109OooO00o.f42144OooO0oO;
        o0000O00 o0000o00 = o0o0o00.f42195OooO0OO;
        OooOo00 oooOo00 = o0000o00.f42127OooO0O0;
        oooOo00.getClass();
        if (!new File(oooOo00.f42242OooO0O0, o0000o00.f42126OooO00o).exists()) {
            String strOooO0o0 = o0o0o00.OooO0o0();
            boolean z = strOooO0o0 != null && o0o0o00.f42201OooOO0.OooO0Oo(strOooO0o0);
            return Boolean.valueOf(z);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
        }
        OooOo00 oooOo01 = o0000o00.f42127OooO0O0;
        oooOo01.getClass();
        new File(oooOo01.f42242OooO0O0, o0000o00.f42126OooO00o).delete();
        return Boolean.valueOf(z);
    }
}
