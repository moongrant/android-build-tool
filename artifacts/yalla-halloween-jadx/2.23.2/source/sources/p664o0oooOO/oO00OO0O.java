package p664o0oooOO;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p293o0O0OoO0.OooOo00;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f59867OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f59868OooO0O0;

    public /* synthetic */ oO00OO0O(Object obj, Object obj2) {
        this.f59867OooO00o = obj;
        this.f59868OooO0O0 = obj2;
    }

    public final void OooO00o() {
        Object obj = this.f59867OooO00o;
        try {
            OooOo00 oooOo00 = (OooOo00) this.f59868OooO0O0;
            oooOo00.getClass();
            new File(oooOo00.f41695OooO0O0, (String) obj).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) obj), e);
        }
    }
}
