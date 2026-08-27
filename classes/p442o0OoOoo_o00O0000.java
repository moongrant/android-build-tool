package p442o0OoOoo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.call.core.HttpCoreRequest;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000 extends o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f93014OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParamsWrapper f93015OooO0O0;

    public o00O0000(@NotNull String url, @NotNull ParamsWrapper paramsWrapper) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
        this.f93014OooO00o = url;
        this.f93015OooO0O0 = paramsWrapper;
    }

    @Override // p442o0OoOoo.o000OOo0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super ResponseBody> continuation) {
        HashMap map = new HashMap();
        ParamsWrapper paramsWrapper = this.f93015OooO0O0;
        Map<String, String> map2 = paramsWrapper.f44962OooO0OO;
        if (map2 != null) {
            map.putAll(map2);
        }
        Object obj = paramsWrapper.f44961OooO0O0;
        String str = this.f93014OooO00o;
        if (obj == null) {
            Map<String, ? extends Object> map3 = paramsWrapper.f44960OooO00o;
            return map3 != null ? HttpCoreRequest.f44958OooO00o.postForm(map, str, map3, continuation) : HttpCoreRequest.f44958OooO00o.post(map, str, continuation);
        }
        if (obj instanceof String) {
            return HttpCoreRequest.f44958OooO00o.postBody(map, str, RequestBody.INSTANCE.create((String) obj, MediaType.INSTANCE.parse("application/json; charset=utf-8")), continuation);
        }
        return HttpCoreRequest.f44958OooO00o.postJson(map, str, obj, continuation);
    }
}
