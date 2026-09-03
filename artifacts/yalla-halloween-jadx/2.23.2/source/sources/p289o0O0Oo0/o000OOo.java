package p289o0O0Oo0;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import p293o0O0OoO0.OooOo00;
import p664o0oooOO.oO00OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f41530OooO00o;

    public o000OOo(o0O0O00 o0o0o00) {
        this.f41530OooO00o = o0o0o00;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        o00Ooo o00ooo2 = this.f41530OooO00o.f41572OooO0oO;
        oO00OO0O oo00oo0o = o00ooo2.f41546OooO0OO;
        OooOo00 oooOo00 = (OooOo00) oo00oo0o.f59868OooO0O0;
        String str = (String) oo00oo0o.f59867OooO00o;
        oooOo00.getClass();
        if (!new File(oooOo00.f41695OooO0O0, str).exists()) {
            String strOooO0o0 = o00ooo2.OooO0o0();
            boolean z = strOooO0o0 != null && o00ooo2.f41552OooOO0.OooO0OO(strOooO0o0);
            return Boolean.valueOf(z);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
        }
        OooOo00 oooOo01 = (OooOo00) oo00oo0o.f59868OooO0O0;
        String str2 = (String) oo00oo0o.f59867OooO00o;
        oooOo01.getClass();
        new File(oooOo01.f41695OooO0O0, str2).delete();
        return Boolean.valueOf(z);
    }
}
