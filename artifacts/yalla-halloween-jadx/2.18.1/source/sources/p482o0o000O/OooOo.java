package p482o0o000O;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.AppsFlyerLib;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p054o00000oo.o00O000;
import p168o00Ooo0.OooOOOO;
import p252o00ooO0.o000000O;
import p483o0o000O0.OooOO0;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.oo0o0Oo;
import p516o0o0O000.o0OoOo0;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40863OooO0OO;

    public OooOo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40863OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    @Nullable
    public final List<Class<? extends o000000O>> OooO00o() {
        return CollectionsKt.listOf(OooOO0.class);
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        Context context = this.f40863OooO0OO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        o00O000 o00o001 = new o00O000();
        String strOooO00o = p516o0o0O000.OooOo.f42064OooO00o.OooO00o();
        if (OooO0OO.OooO0O0(strOooO00o) && !strOooO00o.equals("Yalla")) {
            AppsFlyerLib.getInstance().setOutOfStore(strOooO00o);
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
        Objects.requireNonNull(oo0o0ooOooO0o);
        String strOooO0O0 = OooOOOO.OooO0O0(o0OoOo0.OooO0O0(), oo0o0ooOooO0o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-30248626527760L).hashCode()), p254o00ooO0O.o000O0O0.OooO0OO(R.string.appsflyer_key)));
        Intrinsics.checkNotNullExpressionValue(strOooO0O0, o000O0O0.OooO00o(-30308756069904L));
        appsFlyerLib.init(strOooO0O0, o00o001, application);
        AppsFlyerLib.getInstance().setCollectIMEI(false);
        AppsFlyerLib.getInstance().setCollectAndroidID(false);
        AppsFlyerLib.getInstance().start(application);
    }
}
