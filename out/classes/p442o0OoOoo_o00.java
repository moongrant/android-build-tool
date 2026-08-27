package p442o0OoOoo;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.call.core.HttpCoreRequest;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGetRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetRequest.kt\ncom/yalla/yalla/api/call/request/GetRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,36:1\n216#2,2:37\n*S KotlinDebug\n*F\n+ 1 GetRequest.kt\ncom/yalla/yalla/api/call/request/GetRequest\n*L\n15#1:37,2\n*E\n"})
public final class o00 extends o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f93012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final ParamsWrapper f93013OooO0O0;

    public o00(@NotNull String url, @Nullable ParamsWrapper paramsWrapper) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f93012OooO00o = url;
        this.f93013OooO0O0 = paramsWrapper;
    }

    @Override // p442o0OoOoo.o000OOo0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super ResponseBody> continuation) {
        Map<String, String> map;
        Map<String, Object> map2;
        StringBuilder sb = new StringBuilder();
        ParamsWrapper paramsWrapper = this.f93013OooO0O0;
        if (paramsWrapper != null && (map2 = paramsWrapper.f44960OooO00o) != null && !map2.isEmpty()) {
            boolean z = true;
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    if (z) {
                        sb.append("?");
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                }
            }
        }
        HashMap map3 = new HashMap();
        if (paramsWrapper != null && (map = paramsWrapper.f44962OooO0OO) != null) {
            map3.putAll(map);
        }
        return HttpCoreRequest.f44958OooO00o.get(map3, this.f93012OooO00o + ((Object) sb), continuation);
    }
}
