package p354o0OOOo;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import p016OooOoO0.OooOo00;
import p361o0OOOoOo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38296OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f38297OooO0O0 = null;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final String f38298OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f38299OooO0O0;

        public OooO00o(OooOOO oooOOO) {
            boolean z;
            int iOooO0o = Oooo0.OooO0o(oooOOO.f38296OooO00o, "com.google.firebase.crashlytics.unity_version", "string");
            if (iOooO0o != 0) {
                this.f38298OooO00o = "Unity";
                String string = oooOOO.f38296OooO00o.getResources().getString(iOooO0o);
                this.f38299OooO0O0 = string;
                String strOooO0Oo = OooOo00.OooO0Oo("Unity Editor version is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strOooO0Oo, null);
                    return;
                }
                return;
            }
            if (oooOOO.f38296OooO00o.getAssets() == null) {
                z = false;
            } else {
                try {
                    InputStream inputStreamOpen = oooOOO.f38296OooO00o.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    z = true;
                } catch (IOException unused) {
                    z = false;
                }
            }
            if (!z) {
                this.f38298OooO00o = null;
                this.f38299OooO0O0 = null;
                return;
            }
            this.f38298OooO00o = "Flutter";
            this.f38299OooO0O0 = null;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
            }
        }
    }

    public OooOOO(Context context) {
        this.f38296OooO00o = context;
    }
}
