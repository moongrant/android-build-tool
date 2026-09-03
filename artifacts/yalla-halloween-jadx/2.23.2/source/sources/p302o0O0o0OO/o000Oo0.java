package p302o0O0o0OO;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.installations.local.OooO00o;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p565o0oOo0O0.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f41755OooO0O0 = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f41756OooO0OO = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o000Oo0 f41757OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f41758OooO00o;

    public o000Oo0(o00oO0o o00oo0o2) {
        this.f41758OooO00o = o00oo0o2;
    }

    public final boolean OooO00o(@NonNull OooO00o oooO00o) {
        if (TextUtils.isEmpty(oooO00o.f19723OooO0Oo)) {
            return true;
        }
        long j = oooO00o.f19724OooO0o + oooO00o.f19726OooO0oO;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f41758OooO00o.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f41755OooO0O0;
    }
}
