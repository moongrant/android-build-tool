package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;
import p285o0O0OOo.OooOo;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43642OooO0Oo;

    public o0OoOo0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43642OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        OooOo.OooO00o().OooO0OO("BuildType", (String) oo0o0Oo.f43513OooO0oO.getValue());
        OooOo.OooO00o().OooO0OO("Country", Locale.getDefault().getDisplayCountry(Locale.CHINA));
        OooOo.OooO00o().OooO0OO("CountryCode", Locale.getDefault().getCountry());
        OooOo.OooO00o().OooO0OO("Installer", (String) oo0o0Oo.f43514OooO0oo.getValue());
        OooOo.OooO00o().OooO0OO("OS_CPUABI", (String) o000000.f43489OooO0oo.getValue());
        OooOo.OooO00o().OooO0OO("PackageName", oo0o0Oo.OooO0O0());
        FirebaseAnalytics.getInstance(this.f43642OooO0Oo).f19317OooO00o.zzy("app_open", null);
    }
}
