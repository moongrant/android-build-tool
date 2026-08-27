package p474o0o000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o00OOO0O;
import com.yalla.yalla.util.log.OooOO0;
import com.yalla.yalla.util.o000OO00;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p472o0o0000o.OooOO0O;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public final class o000oOoO implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String strEncodedPath = request.url().encodedPath();
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(strEncodedPath, "/", "_", false, 4, (Object) null);
        OooOO0.OooO0OO("MockInterceptor", "urlPath   " + strEncodedPath + "   " + strReplace$default);
        if (Intrinsics.areEqual(((MutableLiveData) OooOO0O.OooO0o0().f93784OooO0O0.getValue()).getValue(), Boolean.TRUE)) {
            SnapshotStateMap<String, Pair<String, String>> snapshotStateMap = o000OO00.f81072OooO00o;
            if (snapshotStateMap.containsKey(strReplace$default)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Pair<String, String> pair = snapshotStateMap.get(strReplace$default);
                    String second = pair != null ? pair.getSecond() : null;
                    o00OOO0O.OooO0O0("Mock Success");
                    ResponseBody.Companion companion2 = ResponseBody.INSTANCE;
                    Intrinsics.checkNotNull(second);
                    return new Response.Builder().code(200).protocol(Protocol.HTTP_2).body(companion2.create(second, MediaType.INSTANCE.get("text/plain; charset=utf-8"))).message("code=200,Mock Data").request(chain.request()).receivedResponseAtMillis(System.currentTimeMillis()).build();
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    if (Result.m7828exceptionOrNullimpl(Result.m7825constructorimpl(ResultKt.createFailure(th))) != null) {
                        return chain.proceed(request);
                    }
                }
            }
        }
        return chain.proceed(request);
    }
}
