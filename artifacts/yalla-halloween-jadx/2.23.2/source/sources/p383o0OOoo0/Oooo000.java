package p383o0OOoo0;

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
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f43307OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParamsWrapper f43308OooO0O0;

    public Oooo000(@NotNull String url, @NotNull ParamsWrapper paramsWrapper) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
        this.f43307OooO00o = url;
        this.f43308OooO0O0 = paramsWrapper;
    }

    @Override // p383o0OOoo0.OooOo00
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o0O00oO0> continuation) {
        HashMap map = new HashMap();
        ParamsWrapper paramsWrapper = this.f43308OooO0O0;
        Map<String, String> map2 = paramsWrapper.f22208OooO0OO;
        if (map2 != null) {
            map.putAll(map2);
        }
        Map<String, ? extends Object> map3 = paramsWrapper.f22206OooO00o;
        String str = this.f43307OooO00o;
        if (map3 != null) {
            return HttpCoreRequest.f22204OooO00o.postForm(map, str, map3, continuation);
        }
        Object obj = paramsWrapper.f22207OooO0O0;
        if (obj == null) {
            return HttpCoreRequest.f22204OooO00o.post(map, str, continuation);
        }
        if (!(obj instanceof String)) {
            return HttpCoreRequest.f22204OooO00o.postJson(map, str, obj, continuation);
        }
        o0oO0Ooo.OooO00o oooO00o = o0oO0Ooo.Companion;
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        o0O000Oo o0o000ooOooO0O0 = o0O000Oo.OooO00o.OooO0O0("application/json; charset=utf-8");
        oooO00o.getClass();
        return HttpCoreRequest.f22204OooO00o.postBody(map, str, o0oO0Ooo.OooO00o.OooO00o((String) obj, o0o000ooOooO0O0), continuation);
    }
}
