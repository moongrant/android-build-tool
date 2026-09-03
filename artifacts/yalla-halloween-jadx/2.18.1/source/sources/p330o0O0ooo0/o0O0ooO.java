package p330o0O0ooo0;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
public class o0O0ooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0O0ooO f37064OooO0o0 = new o0O0ooO(true, 3, null, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f37065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f37066OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Throwable f37067OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f37068OooO0Oo;

    public o0O0ooO(boolean z, int i, @Nullable String str, @Nullable Throwable th) {
        this.f37065OooO00o = z;
        this.f37068OooO0Oo = i;
        this.f37066OooO0O0 = str;
        this.f37067OooO0OO = th;
    }

    public static o0O0ooO OooO0O0(@NonNull String str) {
        return new o0O0ooO(false, 1, str, null);
    }

    public static o0O0ooO OooO0OO(@NonNull String str, @NonNull Throwable th) {
        return new o0O0ooO(false, 1, str, th);
    }

    @Nullable
    public String OooO00o() {
        return this.f37066OooO0O0;
    }

    public final void OooO0Oo() {
        if (this.f37065OooO00o || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f37067OooO0OO != null) {
            Log.d("GoogleCertificatesRslt", OooO00o(), this.f37067OooO0OO);
        } else {
            Log.d("GoogleCertificatesRslt", OooO00o());
        }
    }
}
