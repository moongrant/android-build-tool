package p358o0OOOo0o;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.internal.NativeProtocol;
import java.util.Locale;
import p356o0OOOo00.OooO0O0;
import p360o0OOOoO0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O implements OooO0O0.InterfaceC0381OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0OO f38381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0OO f38382OooO0O0;

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
            OooO0OO oooO0OO = "clx".equals(bundle2.getString("_o")) ? this.f38381OooO00o : this.f38382OooO0O0;
            if (oooO0OO == null) {
                return;
            }
            oooO0OO.OooO0OO(string, bundle2);
        }
    }
}
