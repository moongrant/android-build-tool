package p285o0O0OOo;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.internal.NativeProtocol;
import java.util.Locale;
import o0O0OOO0.OooO00o;
import p287o0O0OOoo.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 implements OooO00o.InterfaceC0443OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oo0o0Oo f41427OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oo0o0Oo f41428OooO0O0;

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
            oo0o0Oo oo0o0oo = "clx".equals(bundle2.getString("_o")) ? this.f41427OooO00o : this.f41428OooO0O0;
            if (oo0o0oo == null) {
                return;
            }
            oo0o0oo.OooO0O0(bundle2, string);
        }
    }
}
