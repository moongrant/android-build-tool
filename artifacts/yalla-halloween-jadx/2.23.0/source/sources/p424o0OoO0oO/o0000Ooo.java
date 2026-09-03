package p424o0OoO0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.json.OooO00o;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.model.http.ApiError;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiFailInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiFailInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiFailInterceptor\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,33:1\n109#2:34\n*S KotlinDebug\n*F\n+ 1 ApiFailInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiFailInterceptor\n*L\n29#1:34\n*E\n"})
public final class o0000Ooo implements o00OOO00 {
    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        o00OOOOo o00ooooo2 = ncVar.f59720OooO0o0;
        o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(o00ooooo2);
        if (o0ooooOooO0O0.OooO0oO() || Intrinsics.areEqual(o00ooooo2.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o0ooooOooO0O0;
        }
        String strOooO0oo = OooO00o.OooO00o().OooO0oo(new ApiError(o0ooooOooO0O0.f57345OooO0oO, o0ooooOooO0O0.f57343OooO0o, null, 4, null));
        if (strOooO0oo == null) {
            strOooO0oo = "";
        }
        Pattern pattern = o00OOO0.f57234OooO0o0;
        o0 o0VarOooO00o = o0O0o.OooO0O0.OooO00o(strOooO0oo, o00OOO0.OooO00o.OooO00o("text/plain; charset=utf-8"));
        o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o(o0ooooOooO0O0);
        oooO00o.f57358OooO0OO = 200;
        oooO00o.f57362OooO0oO = o0VarOooO00o;
        return oooO00o.OooO00o();
    }
}
