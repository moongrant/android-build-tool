package p384o0OOoo0O;

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
import p391o0OOooo0.o0OO00O;
import p408o0Oo0Oo0.o00Oo0;
import p426o0OoO0o0.OooOOOO;
import p427o0OoO0oO.o00OOO0;
import p590o0oOooo0.oOOO00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class OooOo00 {
    /* JADX WARN: Type inference failed for: r2v0, types: [com.yalla.yalla.api.old.ApiAppConfig$getWebErrorList$1, com.yalla.yalla.util.Function.OooO] */
    public static void OooO00o(@Nullable final o0OO00O.OooO00o oooO00o) {
        boolean z = App.f22233OooO0o0;
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        String str = Oooo0.f43426o0000oo0;
        ?? r2 = new OooO() { // from class: com.yalla.yalla.api.old.ApiAppConfig$getWebErrorList$1
            @Override // com.yalla.yalla.util.Function.OooO, com.yalla.yalla.util.Function.OooO0o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                o0000O00.OooO0O0("OkHttpCallback ,OkHttpCallback = , onFinish");
                if (OooOO0.OooO0o0(response) != null) {
                    List<ApiErrorCodeDB> list = (List) oOOO00.OooO0O0(response, new TypeToken<List<? extends ApiErrorCodeDB>>() { // from class: com.yalla.yalla.api.old.ApiAppConfig$getWebErrorList$1$onFinish$modelList$1
                    }.getType());
                    if (OooOo00.OooO0O0(list)) {
                        for (ApiErrorCodeDB apiErrorCodeDB : list) {
                            ApiErrorCodeDB apiErrorCodeDBOooO0OO = o00Oo0.OooO00o().OooOOOo().OooO0OO(apiErrorCodeDB.Code);
                            if (OooOo00.OooO0O0(apiErrorCodeDBOooO0OO)) {
                                apiErrorCodeDB.id = apiErrorCodeDBOooO0OO.id;
                                o00Oo0.OooO00o().OooOOOo().OooO00o(apiErrorCodeDB);
                            } else {
                                o00Oo0.OooO00o().OooOOOo().OooO0Oo(apiErrorCodeDB);
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
        o00OOO0 o00ooo1 = new o00OOO0();
        o00ooo1.f46765OooO0O0 = null;
        o00ooo1.f46764OooO00o = str;
        o00ooo1.f46767OooO0Oo = linkedHashMapOooO00o;
        OooO0OO.OooO00o(o00ooo1, linkedHashMapOooO00o);
        o00ooo1.OooO0O0().OooO00o(new OooOO0(r2));
    }
}
