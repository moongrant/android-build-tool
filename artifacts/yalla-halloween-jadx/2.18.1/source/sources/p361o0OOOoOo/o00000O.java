package p361o0OOOoOo;

import OooO00o.OooO00o;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import o0OOo000.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38436OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f38437OooO0O0;

    public o00000O(String str, OooOO0 oooOO1) {
        this.f38436OooO00o = str;
        this.f38437OooO0O0 = oooOO1;
    }

    public final boolean OooO00o() {
        try {
            return OooO0O0().createNewFile();
        } catch (IOException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Error creating marker: ");
            sbOooO0o0.append(this.f38436OooO00o);
            Log.e("FirebaseCrashlytics", sbOooO0o0.toString(), e);
            return false;
        }
    }

    public final File OooO0O0() {
        return this.f38437OooO0O0.OooO0O0(this.f38436OooO00o);
    }
}
