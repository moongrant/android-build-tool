package p285o0O0OOoo;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p286o0O0Oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42126OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f42127OooO0O0;

    public o0000O00(OooOo00 oooOo00, String str) {
        this.f42126OooO00o = str;
        this.f42127OooO0O0 = oooOo00;
    }

    public final void OooO00o() {
        String str = this.f42126OooO00o;
        try {
            OooOo00 oooOo00 = this.f42127OooO0O0;
            oooOo00.getClass();
            new File(oooOo00.f42242OooO0O0, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + str, e);
        }
    }
}
