package o0O0o0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f42386OooO0O0 = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f42387OooO0OO = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static OooOo f42388OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p303o0O0o0o0.OooO0O0 f42389OooO00o;

    public OooOo(p303o0O0o0o0.OooO0O0 oooO0O0) {
        this.f42389OooO00o = oooO0O0;
    }

    public final boolean OooO00o(@NonNull com.google.firebase.installations.local.OooO00o oooO00o) {
        if (TextUtils.isEmpty(oooO00o.f20195OooO0Oo)) {
            return true;
        }
        long j = oooO00o.f20196OooO0o + oooO00o.f20198OooO0oO;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f42389OooO00o.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f42386OooO0O0;
    }
}
