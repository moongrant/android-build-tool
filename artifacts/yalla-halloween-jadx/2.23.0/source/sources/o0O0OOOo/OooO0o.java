package o0O0OOOo;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import p022Oooo00O.o00O00OO;
import p285o0O0OOoo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f42083OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f42084OooO0O0 = null;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final String f42085OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f42086OooO0O0;

        public OooO00o(OooO0o oooO0o) {
            boolean z;
            int iOooO0o = o000oOoO.OooO0o(oooO0o.f42083OooO00o, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = oooO0o.f42083OooO00o;
            if (iOooO0o != 0) {
                this.f42085OooO00o = "Unity";
                String string = context.getResources().getString(iOooO0o);
                this.f42086OooO0O0 = string;
                String strOooO00o = o00O00OO.OooO00o("Unity Editor version is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strOooO00o, null);
                    return;
                }
                return;
            }
            if (context.getAssets() == null) {
                z = false;
            } else {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    z = true;
                } catch (IOException unused) {
                    z = false;
                }
            }
            if (!z) {
                this.f42085OooO00o = null;
                this.f42086OooO0O0 = null;
                return;
            }
            this.f42085OooO00o = "Flutter";
            this.f42086OooO0O0 = null;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
            }
        }
    }

    public OooO0o(Context context) {
        this.f42083OooO00o = context;
    }
}
