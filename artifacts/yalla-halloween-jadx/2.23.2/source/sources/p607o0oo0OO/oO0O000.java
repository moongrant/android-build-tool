package p607o0oo0OO;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final URL f57400OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f57401OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f57402OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Map<String, Object> f57403OooO0Oo;

    public oO0O000(@NotNull URL url, @NotNull String method, @NotNull LinkedHashMap headers, @Nullable LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f57400OooO00o = url;
        this.f57401OooO0O0 = method;
        this.f57402OooO0OO = headers;
        this.f57403OooO0Oo = linkedHashMap;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AuthRequest{method = " + this.f57401OooO0O0 + ", url = " + this.f57400OooO00o + ", ");
        Map<String, String> map = this.f57402OooO0OO;
        int i = 0;
        if (!map.isEmpty()) {
            sb.append("headers = [");
            int i2 = 0;
            for (Object obj : map.keySet()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(str + ':' + ((Object) map.get(str)));
                i2 = i3;
            }
            sb.append("]");
        }
        Map<String, Object> map2 = this.f57403OooO0Oo;
        if (map2 != null && (!map2.isEmpty())) {
            sb.append("params = [");
            for (Object obj2 : map2.keySet()) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj2;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str2 + ':' + map2.get(str2));
                i = i4;
            }
            sb.append("]");
        }
        Intrinsics.checkNotNullExpressionValue(sb.toString(), "StringBuilder().apply(builderAction).toString()");
        return super.toString();
    }
}
