package p377o0OOoO00;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.installations.local.OooO0O0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p314o0O0oO0o.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f38702OooO0O0 = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f38703OooO0OO = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o0OoOo0 f38704OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O f38705OooO00o;

    public o0OoOo0(o00000O o00000o) {
        this.f38705OooO00o = o00000o;
    }

    public static o0OoOo0 OooO0OO() {
        if (o00000O.f36573OooO00o == null) {
            o00000O.f36573OooO00o = new o00000O();
        }
        o00000O o00000o = o00000O.f36573OooO00o;
        if (f38704OooO0Oo == null) {
            f38704OooO0Oo = new o0OoOo0(o00000o);
        }
        return f38704OooO0Oo;
    }

    public final long OooO00o() {
        Objects.requireNonNull(this.f38705OooO00o);
        return System.currentTimeMillis();
    }

    public final long OooO0O0() {
        return TimeUnit.MILLISECONDS.toSeconds(OooO00o());
    }

    public final boolean OooO0Oo(@NonNull OooO0O0 oooO0O0) {
        if (TextUtils.isEmpty(oooO0O0.OooO00o())) {
            return true;
        }
        return oooO0O0.OooO0O0() + oooO0O0.OooO0oO() < OooO0O0() + f38702OooO0O0;
    }
}
