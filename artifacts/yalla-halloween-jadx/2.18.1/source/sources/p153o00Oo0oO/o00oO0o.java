package p153o00Oo0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.Function.OooO;
import com.app.base.Function.OooO0OO;
import com.app.base.application.App;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p551o0oOO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o {

    public static final class OooO00o extends OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ OooO0OO.OooO0O0 f32215OooO0OO;

        /* JADX INFO: renamed from: o00Oo0oO.o00oO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0346OooO00o extends o00000O0<List<? extends ApiErrorCodeDB>> {
        }

        public OooO00o(OooO0OO.OooO0O0 oooO0O0) {
            this.f32215OooO0OO = oooO0O0;
        }

        @Override // com.app.base.Function.OooO0OO.OooO0O0, com.app.base.Function.OooO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            super.onFinish(response);
            if (OooO.OooO0o0(response) != null) {
                List<ApiErrorCodeDB> list = (List) o0Oo0oo.OooO0OO(response, new C0346OooO00o().getType());
                if (com.yalla.support.common.util.OooO0OO.OooO0O0(list)) {
                    for (ApiErrorCodeDB apiErrorCodeDB : list) {
                        ApiErrorCodeDB apiErrorCodeDBOooO0Oo = p491o0o00O00.OooO0OO.OooO00o().OooOOo0().OooO0Oo(apiErrorCodeDB.Code);
                        if (com.yalla.support.common.util.OooO0OO.OooO0O0(apiErrorCodeDBOooO0Oo)) {
                            apiErrorCodeDB.id = apiErrorCodeDBOooO0Oo.id;
                            p491o0o00O00.OooO0OO.OooO00o().OooOOo0().OooO00o(apiErrorCodeDB);
                        } else {
                            p491o0o00O00.OooO0OO.OooO00o().OooOOo0().OooO0OO(apiErrorCodeDB);
                        }
                    }
                }
            }
            OooO0OO.OooO0O0 oooO0O0 = this.f32215OooO0OO;
            if (oooO0O0 != null) {
                oooO0O0.onFinish(response);
            }
        }
    }

    public final void OooO00o(@Nullable OooO0OO.OooO0O0 oooO0O0) {
        App app = App.f11458Oooo0oO;
        Map<String, String> mapOooO00o = OooO0OO.OooO00o();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        String str = o0ooOOo.f32314o000O0;
        OooO00o oooO00o = new OooO00o(oooO0O0);
        oooO00o.OooO0OO();
        OooOOO0 oooOOO0 = new OooOOO0();
        oooOOO0.f44612OooO0O0 = null;
        oooOOO0.f44611OooO00o = str;
        oooOOO0.f44614OooO0Oo = mapOooO00o;
        o00OO0O0.OooO00o(oooOOO0, mapOooO00o);
        oooOOO0.OooO0O0().OooO00o(new OooO(oooO00o));
    }
}
