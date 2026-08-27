package p483o0o00O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.statistical.dev.OooO00o;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.OooO;
import okio.OooOOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiStatisticalInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiStatisticalInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiStatisticalInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class o0000 implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f94093OooO00o = Charset.forName("UTF-8");

    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Object objM7825constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(chain, "chain");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Request request = chain.request();
        String strHeader = request.header("yl-rep");
        Response responseProceed = chain.proceed(request);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (responseProceed.isSuccessful() && !Intrinsics.areEqual(strHeader, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return responseProceed;
        }
        ResponseBody responseBodyBody = responseProceed.body();
        if (responseBodyBody == null) {
            str = "";
        } else {
            Intrinsics.checkNotNull(responseBodyBody);
            OooOOO0 oooOOO0Source = responseBodyBody.source();
            oooOOO0Source.request(Long.MAX_VALUE);
            try {
                Result.Companion companion = Result.INSTANCE;
                OooO oooOClone = oooOOO0Source.OooO00o().clone();
                Charset charset = this.f94093OooO00o;
                Intrinsics.checkNotNullExpressionValue(charset, "charset");
                objM7825constructorimpl = Result.m7825constructorimpl(oooOClone.o0000oO0(charset));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7828exceptionOrNullimpl(objM7825constructorimpl) != null) {
                objM7825constructorimpl = "body read fail";
            }
            str = (String) objM7825constructorimpl;
        }
        OooO00o.f75601OooO00o.OooO0OO(request.url().getUrl(), responseProceed.isSuccessful(), jCurrentTimeMillis2, str);
        return responseProceed;
    }
}
