package p361o0OOOoOo;

import android.util.Log;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00000 f38438OooO00o;

    public o00000O0(o00000 o00000Var) {
        this.f38438OooO00o = o00000Var;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        o0OO00O o0oo00o2 = this.f38438OooO00o.f38423OooO0oO;
        boolean z = false;
        boolean z2 = true;
        if (o0oo00o2.f38497OooO0OO.OooO0O0().exists()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
            }
            o0oo00o2.f38497OooO0OO.OooO0O0().delete();
        } else {
            String strOooO0o = o0oo00o2.OooO0o();
            if (strOooO0o != null && o0oo00o2.f38494OooO.OooO0OO(strOooO0o)) {
                z = true;
            }
            z2 = z;
        }
        return Boolean.valueOf(z2);
    }
}
