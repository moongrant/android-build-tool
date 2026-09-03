package o0O0OOO;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.internal.NativeProtocol;
import java.util.Locale;
import p283o0O0OOo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements o0O0OO0O.OooO00o.InterfaceC0451OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOOO0 f42014OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOO0 f42015OooO0O0;

    public final void OooO00o(int i, @Nullable Bundle bundle) {
        String str = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle(NativeProtocol.WEB_DIALOG_PARAMS);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            OooOOO0 oooOOO0 = "clx".equals(bundle2.getString("_o")) ? this.f42014OooO00o : this.f42015OooO0O0;
            if (oooOOO0 == null) {
                return;
            }
            oooOOO0.OooO0O0(bundle2, string);
        }
    }
}
