package p254o00ooO0o;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public class o00O00 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o00O00 f40244OooO0o0 = new o00O00(true, 3, null, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f40245OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f40246OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Throwable f40247OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40248OooO0Oo;

    public o00O00(boolean z, int i, @Nullable String str, @Nullable Exception exc) {
        this.f40245OooO00o = z;
        this.f40248OooO0Oo = i;
        this.f40246OooO0O0 = str;
        this.f40247OooO0OO = exc;
    }

    public static o00O00 OooO0O0(@NonNull String str) {
        return new o00O00(false, 1, str, null);
    }

    public static o00O00 OooO0OO(@NonNull String str, @NonNull Exception exc) {
        return new o00O00(false, 1, str, exc);
    }

    @Nullable
    public String OooO00o() {
        return this.f40246OooO0O0;
    }

    public final void OooO0Oo() {
        if (this.f40245OooO00o || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f40247OooO0OO;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", OooO00o(), th);
        } else {
            Log.d("GoogleCertificatesRslt", OooO00o());
        }
    }
}
