package p377o0OOoOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOo00;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.util.Function.OooO;
import com.yalla.yalla.util.Function.OooOO0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p385o0OOooOO.o00O00O;
import p421o0OoO0Oo.o000000O;
import p579o0oOoo.oOo00OO0;
import p581o0oOoo00.o000OOo;
import p592o0oo00O.OooOOO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class o0000O0 {
    /* JADX WARN: Type inference failed for: r2v0, types: [com.yalla.yalla.api.old.ApiAppConfig$getWebErrorList$1, com.yalla.yalla.util.Function.OooO] */
    public static void OooO00o(@Nullable final o00O00O.OooO00o oooO00o) {
        boolean z = App.f22703OooO0o0;
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        String str = o0000O.f44167o0000oo0;
        ?? r2 = new OooO() { // from class: com.yalla.yalla.api.old.ApiAppConfig$getWebErrorList$1
            @Override // com.yalla.yalla.util.Function.OooO, com.yalla.yalla.util.Function.OooO0o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                OooOOO0.OooO0O0("OkHttpCallback ,OkHttpCallback = , onFinish");
                if (OooOO0.OooO0o0(response) != null) {
                    List<ApiErrorCodeDB> list = (List) oOo00OO0.OooO0O0(response, new TypeToken<List<? extends ApiErrorCodeDB>>() { // from class: com.yalla.yalla.api.old.ApiAppConfig$getWebErrorList$1$onFinish$modelList$1
                    }.getType());
                    if (OooOo00.OooO0O0(list)) {
                        for (ApiErrorCodeDB apiErrorCodeDB : list) {
                            ApiErrorCodeDB apiErrorCodeDBOooO0OO = o000OOo.OooO00o().OooOOOO().OooO0OO(apiErrorCodeDB.Code);
                            if (OooOo00.OooO0O0(apiErrorCodeDBOooO0OO)) {
                                apiErrorCodeDB.id = apiErrorCodeDBOooO0OO.id;
                                o000OOo.OooO00o().OooOOOO().OooO00o(apiErrorCodeDB);
                            } else {
                                o000OOo.OooO00o().OooOOOO().OooO0Oo(apiErrorCodeDB);
                            }
                        }
                    }
                }
                OooO oooO = oooO00o;
                if (oooO != null) {
                    oooO.OooO0o0(response);
                }
            }
        };
        r2.OooO0o();
        o000000O o000000o2 = new o000000O();
        o000000o2.f45565OooO0O0 = null;
        o000000o2.f45564OooO00o = str;
        o000000o2.f45567OooO0Oo = linkedHashMapOooO00o;
        OooO0OO.OooO00o(o000000o2, linkedHashMapOooO00o);
        o000000o2.OooO0O0().OooO00o(new OooOO0(r2));
    }
}
