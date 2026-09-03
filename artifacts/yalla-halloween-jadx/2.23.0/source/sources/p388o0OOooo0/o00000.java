package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOO.OooOO0;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000 extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44377OooO0Oo;

    public o00000(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44377OooO0Oo = context;
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        OooOO0.OooO00o().OooO0OO("BuildType", (String) o00Ooo.f44290OooO0oO.getValue());
        OooOO0.OooO00o().OooO0OO("Country", Locale.getDefault().getDisplayCountry(Locale.CHINA));
        OooOO0.OooO00o().OooO0OO("CountryCode", Locale.getDefault().getCountry());
        OooOO0.OooO00o().OooO0OO("Installer", (String) o00Ooo.f44291OooO0oo.getValue());
        OooOO0.OooO00o().OooO0OO("OS_CPUABI", (String) oo000o.f44310OooO0o.getValue());
        OooOO0.OooO00o().OooO0OO("PackageName", o00Ooo.OooO0O0());
        FirebaseAnalytics.getInstance(this.f44377OooO0Oo).f19791OooO00o.zzy("app_open", null);
    }
}
