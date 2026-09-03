package p286o0O0OOoO;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import p022Oooo00O.o00O00OO;
import p289o0O0Oo0.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f41437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f41438OooO0O0 = null;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final String f41439OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f41440OooO0O0;

        public OooO00o(o0ooOOo o0ooooo) {
            boolean z;
            int iOooO0o = OooOO0O.OooO0o(o0ooooo.f41437OooO00o, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = o0ooooo.f41437OooO00o;
            if (iOooO0o != 0) {
                this.f41439OooO00o = "Unity";
                String string = context.getResources().getString(iOooO0o);
                this.f41440OooO0O0 = string;
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
                this.f41439OooO00o = null;
                this.f41440OooO0O0 = null;
                return;
            }
            this.f41439OooO00o = "Flutter";
            this.f41440OooO0O0 = null;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
            }
        }
    }

    public o0ooOOo(Context context) {
        this.f41437OooO00o = context;
    }
}
