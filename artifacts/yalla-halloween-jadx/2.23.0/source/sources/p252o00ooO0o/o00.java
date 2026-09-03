package p252o00ooO0o;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public class o00 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o00 f40911OooO0o0 = new o00(true, 3, null, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f40912OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f40913OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Throwable f40914OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40915OooO0Oo;

    public o00(boolean z, int i, @Nullable String str, @Nullable Exception exc) {
        this.f40912OooO00o = z;
        this.f40915OooO0Oo = i;
        this.f40913OooO0O0 = str;
        this.f40914OooO0OO = exc;
    }

    public static o00 OooO0O0(@NonNull String str) {
        return new o00(false, 1, str, null);
    }

    public static o00 OooO0OO(@NonNull String str, @NonNull Exception exc) {
        return new o00(false, 1, str, exc);
    }

    @Nullable
    public String OooO00o() {
        return this.f40913OooO0O0;
    }

    public final void OooO0Oo() {
        if (this.f40912OooO00o || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.f40914OooO0OO;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", OooO00o(), th);
        } else {
            Log.d("GoogleCertificatesRslt", OooO00o());
        }
    }
}
