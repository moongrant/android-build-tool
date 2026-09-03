package p378o0OOoOo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.call.core.HttpCoreRequest;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.oo00oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f44238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParamsWrapper f44239OooO0O0;

    public o000oOoO(@NotNull String url, @NotNull ParamsWrapper paramsWrapper) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
        this.f44238OooO00o = url;
        this.f44239OooO0O0 = paramsWrapper;
    }

    @Override // p378o0OOoOo0.Oooo000
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o0O0o> continuation) {
        HashMap map = new HashMap();
        ParamsWrapper paramsWrapper = this.f44239OooO0O0;
        Map<String, String> map2 = paramsWrapper.f22678OooO0OO;
        if (map2 != null) {
            map.putAll(map2);
        }
        Map<String, ? extends Object> map3 = paramsWrapper.f22676OooO00o;
        String str = this.f44238OooO00o;
        if (map3 != null) {
            return HttpCoreRequest.f22674OooO00o.postForm(map, str, map3, continuation);
        }
        Object obj = paramsWrapper.f22677OooO0O0;
        if (obj == null) {
            return HttpCoreRequest.f22674OooO00o.post(map, str, continuation);
        }
        if (!(obj instanceof String)) {
            return HttpCoreRequest.f22674OooO00o.postJson(map, str, obj, continuation);
        }
        oo00oO.OooO00o oooO00o = oo00oO.Companion;
        Pattern pattern = o00OOO0.f57234OooO0o0;
        o00OOO0 o00ooo0OooO0O0 = o00OOO0.OooO00o.OooO0O0("application/json; charset=utf-8");
        oooO00o.getClass();
        return HttpCoreRequest.f22674OooO00o.postBody(map, str, oo00oO.OooO00o.OooO00o((String) obj, o00ooo0OooO0O0), continuation);
    }
}
