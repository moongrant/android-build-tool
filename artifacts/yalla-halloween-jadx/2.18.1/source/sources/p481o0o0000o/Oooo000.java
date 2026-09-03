package p481o0o0000o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.call.core.HttpCoreRequest;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f40860OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParamsWrapper f40861OooO0O0;

    public Oooo000(@NotNull String url, @NotNull ParamsWrapper paramsWrapper) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
        this.f40860OooO00o = url;
        this.f40861OooO0O0 = paramsWrapper;
    }

    @Override // p481o0o0000o.OooOo00
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00OOOOo> continuation) {
        HashMap map = new HashMap();
        Map<String, String> map2 = this.f40861OooO0O0.f20569OooO0OO;
        if (map2 != null) {
            map.putAll(map2);
        }
        ParamsWrapper paramsWrapper = this.f40861OooO0O0;
        Map<String, ? extends Object> map3 = paramsWrapper.f20567OooO00o;
        if (map3 != null) {
            return HttpCoreRequest.f20565OooO00o.postForm(map, this.f40860OooO00o, map3, continuation);
        }
        Object obj = paramsWrapper.f20568OooO0O0;
        if (obj == null) {
            return HttpCoreRequest.f20565OooO00o.post(map, this.f40860OooO00o, continuation);
        }
        if (!(obj instanceof String)) {
            return HttpCoreRequest.f20565OooO00o.postJson(map, this.f40860OooO00o, obj, continuation);
        }
        return HttpCoreRequest.f20565OooO00o.postBody(map, this.f40860OooO00o, o0o0Oo.Companion.OooO00o((String) obj, o00OO0O0.f51401OooO0oO.OooO0O0("application/json; charset=utf-8")), continuation);
    }
}
