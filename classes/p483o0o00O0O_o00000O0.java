package p483o0o00O0O;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.otlp.biz.entity.ErrorCode;
import com.yalla.yalla.app.startup.SailfishApm;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public final class o00000O0 implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Request request = chain.request();
        String strEncodedPath = request.url().encodedPath();
        Response responseProceed = chain.proceed(request);
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (responseProceed.isSuccessful()) {
            SailfishApm.OooO0OO(iElapsedRealtime, ErrorCode.CODE_SUCCESS.INSTANCE, strEncodedPath, request.url().host());
            return responseProceed;
        }
        int iCode = responseProceed.code();
        SailfishApm.OooO0OO(iElapsedRealtime, (iCode == 403 || iCode == 451) ? ErrorCode.CODE_ERROR1.INSTANCE : ErrorCode.CODE_ERROR20.INSTANCE, strEncodedPath, request.url().host());
        return responseProceed;
    }
}
