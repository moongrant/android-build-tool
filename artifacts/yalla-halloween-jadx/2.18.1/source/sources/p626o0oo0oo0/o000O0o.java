package p626o0oo0oo0;

import OooO00o.OooO00o;
import java.net.URL;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final URL f48673OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f48674OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f48675OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Map<String, Object> f48676OooO0Oo;

    public o000O0o(@NotNull URL url, @NotNull String method, @NotNull Map<String, String> headers, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f48673OooO00o = url;
        this.f48674OooO0O0 = method;
        this.f48675OooO0OO = headers;
        this.f48676OooO0Oo = map;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AuthRequest{method = ");
        sbOooO0o0.append(this.f48674OooO0O0);
        sbOooO0o0.append(", url = ");
        sbOooO0o0.append(this.f48673OooO00o);
        sbOooO0o0.append(", ");
        sb.append(sbOooO0o0.toString());
        int i = 0;
        if (!this.f48675OooO0OO.isEmpty()) {
            sb.append("headers = [");
            int i2 = 0;
            for (Object obj : this.f48675OooO0OO.keySet()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(str + ':' + ((Object) this.f48675OooO0OO.get(str)));
                i2 = i3;
            }
            sb.append("]");
        }
        Map<String, Object> map = this.f48676OooO0Oo;
        if (map != null && (!map.isEmpty())) {
            sb.append("params = [");
            for (Object obj2 : map.keySet()) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj2;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str2 + ':' + map.get(str2));
                i = i4;
            }
            sb.append("]");
        }
        Intrinsics.checkNotNullExpressionValue(sb.toString(), "StringBuilder().apply(builderAction).toString()");
        return super.toString();
    }
}
