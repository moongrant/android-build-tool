package p483o0o00O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o00O000o;
import com.code.android.util.o0o0Oo;
import com.common.support.networkstate.NetworkStateUtil;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.domain.DomainType;
import com.yalla.yalla.domain.OooOo00;
import com.yalla.yalla.util.log.OooOO0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p037OoooOOO.o000OOo0;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public final class o00000OO implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        int iCode;
        String strHeader;
        String strHeader2;
        DomainType domainTypeOooO0OO;
        String str;
        int i;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (!Intrinsics.areEqual(request.header("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) && (iCode = responseProceed.code()) != 400 && iCode != 401 && iCode != 500 && iCode != 505 && iCode < 600 && !responseProceed.isSuccessful() && NetworkStateUtil.INSTANCE.isConnected(o0o0Oo.OooO00o()) && !Intrinsics.areEqual(Response.header$default(responseProceed, "domain_head_is_canceled", null, 2, null), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) && (strHeader = chain.request().header("domain_head_tag")) != null && (strHeader2 = chain.request().header("domain_head_index")) != null && (domainTypeOooO0OO = OooOo00.OooO0OO(strHeader)) != null) {
            int iOooO00o = OooOo00.OooO00o(domainTypeOooO0OO);
            if (o00O000o.OooO0o0(strHeader2) == iOooO00o) {
                i = iOooO00o + 1;
                str = "域名失败切换";
                if (i >= OooOo00.OooO0O0(domainTypeOooO0OO).size()) {
                    i = 0;
                }
            } else {
                str = "域名已经被其它接口切了，直接用最新的";
                i = iOooO00o;
            }
            HttpUrl httpUrlUrl = request.url();
            List listOooO0O0 = OooOo00.OooO0O0(domainTypeOooO0OO);
            StringBuilder sb = new StringBuilder("域名切换 - tag = ");
            sb.append(str);
            sb.append("\noriginalUrl= ");
            sb.append(httpUrlUrl);
            sb.append("\ndomainTag= ");
            o000OOo0.OooO0OO(sb, strHeader, "\ndomainIndex= ", strHeader2, "\ncurrentIndex= ");
            sb.append(iOooO00o);
            sb.append("\ndomainType= ");
            sb.append(domainTypeOooO0OO);
            sb.append("\nnextIndex= ");
            sb.append(i);
            sb.append("\ngetDomainList= ");
            sb.append(listOooO0O0);
            OooOO0.OooO0O0(sb.toString());
            OooOo00.OooO0o0(domainTypeOooO0OO, i);
        }
        return responseProceed;
    }
}
