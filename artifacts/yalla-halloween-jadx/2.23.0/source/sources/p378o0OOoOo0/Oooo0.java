package p378o0OOoOo0;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.call.core.HttpCoreRequest;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o0O0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGetRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetRequest.kt\ncom/yalla/yalla/api/call/request/GetRequest\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,36:1\n215#2,2:37\n*S KotlinDebug\n*F\n+ 1 GetRequest.kt\ncom/yalla/yalla/api/call/request/GetRequest\n*L\n15#1:37,2\n*E\n"})
public final class Oooo0 extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f44236OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final ParamsWrapper f44237OooO0O0;

    public Oooo0(@NotNull String url, @Nullable ParamsWrapper paramsWrapper) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f44236OooO00o = url;
        this.f44237OooO0O0 = paramsWrapper;
    }

    @Override // p378o0OOoOo0.Oooo000
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o0O0o> continuation) {
        Map<String, String> map;
        Map<String, Object> map2;
        StringBuilder sb = new StringBuilder();
        ParamsWrapper paramsWrapper = this.f44237OooO0O0;
        if (paramsWrapper != null && (map2 = paramsWrapper.f22676OooO00o) != null) {
            boolean z = true;
            if (!map2.isEmpty()) {
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
        }
        HashMap map3 = new HashMap();
        if (paramsWrapper != null && (map = paramsWrapper.f22678OooO0OO) != null) {
            map3.putAll(map);
        }
        return HttpCoreRequest.f22674OooO00o.get(map3, this.f44236OooO00o + ((Object) sb), continuation);
    }
}
