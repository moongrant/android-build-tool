package o0OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.model.http.ApiError;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0O0O0O;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiFailInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiFailInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiFailInterceptor\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,33:1\n109#2:34\n*S KotlinDebug\n*F\n+ 1 ApiFailInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiFailInterceptor\n*L\n29#1:34\n*E\n"})
public final class OooO0OO implements o0OoOoOo {
    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        o0O00O0o o0o00o0o = o000o.f59401OooO0o0;
        o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(o0o00o0o);
        if (o0o00o00OooO0OO.OooO0oO() || Intrinsics.areEqual(o0o00o0o.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o0o00o00OooO0OO;
        }
        String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(o0o00o00OooO0OO.f57850OooO0oO, o0o00o00OooO0OO.f57848OooO0o, null, 4, null));
        if (strOooO0oo == null) {
            strOooO0oo = "";
        }
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        o0O0O0O o0o0o0oOooO00o = o0O00oO0.OooO0O0.OooO00o(strOooO0oo, o0O000Oo.OooO00o.OooO00o("text/plain; charset=utf-8"));
        o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o(o0o00o00OooO0OO);
        oooO00o.f57863OooO0OO = 200;
        oooO00o.f57867OooO0oO = o0o0o0oOooO00o;
        return oooO00o.OooO00o();
    }
}
