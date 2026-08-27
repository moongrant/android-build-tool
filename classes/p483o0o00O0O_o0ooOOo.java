package p483o0o00O0O;

import androidx.camera.camera2.internal.o000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.domain.DomainConfig;
import com.yalla.yalla.domain.DomainType;
import com.yalla.yalla.domain.OooOo00;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URL;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p469o0OooooO.oOO0OO;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nApiDomainTagReplaceInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiDomainTagReplaceInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiDomainTagReplaceInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class o0ooOOo implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) {
        String str;
        int iIntValue;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String strHeader = request.header("UnChangeDomain");
        if (strHeader != null && Boolean.parseBoolean(strHeader)) {
            return chain.proceed(request);
        }
        HttpUrl httpUrlUrl = request.url();
        String strOooO0OO = o000O0.OooO0OO(httpUrlUrl.scheme(), "://", httpUrlUrl.host());
        DomainType domainType = OooOo00.OooO0OO(strOooO0OO);
        if (domainType == null) {
            DomainConfig.f49178OooO00o.getClass();
            Pair pairOooO = DomainConfig.OooO(strOooO0OO);
            if (pairOooO != null && (str = (String) pairOooO.getSecond()) != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    HttpUrl.Builder builderNewBuilder = httpUrlUrl.newBuilder();
                    String host = new URL(str).getHost();
                    Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
                    return chain.proceed(request.newBuilder().url(builderNewBuilder.host(host).build()).build());
                }
            }
            return chain.proceed(request);
        }
        Intrinsics.checkNotNullParameter(domainType, "domainType");
        List list = (List) ((ConcurrentHashMap) OooOo00.f49344OooO00o.getValue()).get(domainType);
        switch (OooOo00.OooO0O0.$EnumSwitchMapping$0[domainType.ordinal()]) {
            case 1:
                iIntValue = oOO0OO.OooO0Oo().f45735OooO0Oo.OooO00o().intValue();
                break;
            case 2:
                iIntValue = oOO0OO.OooO0Oo().f45737OooO0o0.OooO00o().intValue();
                break;
            case 3:
                iIntValue = oOO0OO.OooO0Oo().f45736OooO0o.OooO00o().intValue();
                break;
            case 4:
                iIntValue = oOO0OO.OooO0Oo().f45738OooO0oO.OooO00o().intValue();
                break;
            case 5:
                iIntValue = oOO0OO.OooO0Oo().f45739OooO0oo.OooO00o().intValue();
                break;
            case 6:
                iIntValue = oOO0OO.OooO0Oo().f45731OooO.OooO00o().intValue();
                break;
            case 7:
                iIntValue = oOO0OO.OooO0Oo().f45740OooOO0.OooO00o().intValue();
                break;
            case 8:
                iIntValue = oOO0OO.OooO0Oo().f45746OooOOOo.OooO00o().intValue();
                break;
            case 9:
                iIntValue = oOO0OO.OooO0Oo().f45741OooOO0O.OooO00o().intValue();
                break;
            case 10:
                iIntValue = oOO0OO.OooO0Oo().f45742OooOO0o.OooO00o().intValue();
                break;
            case 11:
                iIntValue = oOO0OO.OooO0Oo().f45744OooOOO0.OooO00o().intValue();
                break;
            case 12:
                iIntValue = oOO0OO.OooO0Oo().f45743OooOOO.OooO00o().intValue();
                break;
            case 13:
                iIntValue = oOO0OO.OooO0Oo().f45745OooOOOO.OooO00o().intValue();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNull(list);
        int iCoerceIn = RangesKt.coerceIn(iIntValue, 0, list.size() - 1);
        Object obj = (iCoerceIn < 0 || iCoerceIn >= list.size()) ? (String) list.get(0) : list.get(iCoerceIn);
        int iOooO00o = OooOo00.OooO00o(domainType);
        HttpUrl.Builder builderNewBuilder2 = httpUrlUrl.newBuilder();
        String host2 = new URL((String) obj).getHost();
        Intrinsics.checkNotNullExpressionValue(host2, "getHost(...)");
        return chain.proceed(request.newBuilder().url(builderNewBuilder2.host(host2).build()).header("domain_head_tag", strOooO0OO).header("domain_head_index", String.valueOf(iOooO00o)).build());
    }
}
