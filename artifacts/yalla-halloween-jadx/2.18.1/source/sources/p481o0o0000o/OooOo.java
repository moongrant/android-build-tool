package p481o0o0000o;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.call.core.HttpCoreRequest;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OOOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo extends OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f40858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final ParamsWrapper f40859OooO0O0;

    public OooOo(@NotNull String url, @Nullable ParamsWrapper paramsWrapper) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f40858OooO00o = url;
        this.f40859OooO0O0 = paramsWrapper;
    }

    @Override // p481o0o0000o.OooOo00
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00OOOOo> continuation) {
        Map<String, String> map;
        Map<String, Object> map2;
        StringBuilder sb = new StringBuilder();
        ParamsWrapper paramsWrapper = this.f40859OooO0O0;
        if (paramsWrapper != null && (map2 = paramsWrapper.f20567OooO00o) != null) {
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
        ParamsWrapper paramsWrapper2 = this.f40859OooO0O0;
        if (paramsWrapper2 != null && (map = paramsWrapper2.f20569OooO0OO) != null) {
            map3.putAll(map);
        }
        return HttpCoreRequest.f20565OooO00o.get(map3, this.f40858OooO00o + ((Object) sb), continuation);
    }
}
