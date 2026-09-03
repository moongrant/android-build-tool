package p542o0o0o00O;

import android.os.Build;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.otlp.biz.OtlpInterceptor;
import com.common.support.crypto.AESKt;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o00Ooo;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o0000O0O;
import p408o0Oo0o0O.o00Oo0;
import p420o0OoO0OO.o0Oo0oo;
import p424o0OoO0oO.o0000O0;
import p464o0Oooo.o000000O;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O00o0;
import p634o0ooO0oO.oo00oO;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nIMHttp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMHttp.kt\ncom/yalla/yalla/service/im/socket/IMHttp\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,222:1\n314#2,11:223\n*S KotlinDebug\n*F\n+ 1 IMHttp.kt\ncom/yalla/yalla/service/im/socket/IMHttp\n*L\n197#1:223,11\n*E\n"})
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OOOO0 f55784OooO00o;

    static {
        o0Oo0oo.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        oooO00o.OooO0OO(7000L, TimeUnit.MILLISECONDS);
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        oooO00o.f57307OooOo0o = o0O000o0.OooO0O0(15L, unit);
        oooO00o.OooO0OO(5L, unit);
        oooO00o.OooO0Oo(8L, unit);
        oooO00o.OooO0o(8L, unit);
        SSLSocketFactory sSLSocketFactory = OooO00o2.f45553OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sslParams.sSLSocketFactory");
        X509TrustManager x509TrustManager = OooO00o2.f45554OooO0O0;
        Intrinsics.checkNotNullExpressionValue(x509TrustManager, "sslParams.trustManager");
        oooO00o.OooO0o0(sSLSocketFactory, x509TrustManager);
        oooO00o.OooO00o(new OtlpInterceptor());
        oooO00o.OooO00o(new HttpLoggingInterceptor(0));
        oooO00o.OooO00o(new o0000O0());
        Lazy lazy = o0000O0O.f44197OooO00o;
        o0000O0O.OooO0O0(oooO00o);
        f55784OooO00o = new o00OOOO0(oooO00o);
    }

    public static final void OooO00o(o00OOOOo.OooO00o oooO00o, HashMap map, o00Oo0 o00oo1, int i, String str) {
        String str2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = "";
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                str2 = (String) entry.getKey();
                map.put(str2, Boolean.TRUE);
                break;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            o00oo1.OooO0O0(i, null);
        } else {
            FirebasePerfOkHttpClient.enqueue(f55784OooO00o.OooO0O0(oooO00o.OooO0O0()), new Oooo000(o00oo1, oooO00o, map));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static Object OooO0O0(@NotNull String str, @NotNull GeneratedMessageV3.Builder builder, @NotNull Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        byte[] content = ((Message) builder.build()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(content, "content");
        byte[] bArrAesEncrypt$default = AESKt.aesEncrypt$default(content, (byte[]) o00Oo0.OooO0o().f45213OooO0O0.getValue(), (byte[]) o00Oo0.OooO0o().f45214OooO0OO.getValue(), (String) null, 4, (Object) null);
        oo00oO.OooO00o oooO00o = oo00oO.Companion;
        Pattern pattern = o00OOO0.f57234OooO0o0;
        o0O00o0 o0o00o0OooO0OO = oo00oO.OooO00o.OooO0OO(oooO00o, bArrAesEncrypt$default, o00OOO0.OooO00o.OooO0O0("application/octet-stream"), 0, 6);
        List<String> list = o0000O.f44074OooO00o;
        Oooo0 oooo0 = new Oooo0(cancellableContinuationImpl);
        if (!list.isEmpty()) {
            HashMap map = new HashMap();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                map.put(it.next(), Boolean.FALSE);
            }
            String str2 = list.get(0);
            map.put(str2, Boolean.TRUE);
            o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o();
            oooO00o2.OooOO0(str2 + str);
            oooO00o2.OooO00o("flags", (String) o00Oo0.OooO0o().f45215OooO0Oo.getValue());
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String str3 = (String) o000000O.OooOOOo().getValue();
            if (str3 == null) {
                str3 = "";
            }
            oooO00o2.OooO00o("Auth", str3);
            oooO00o2.OooO00o("User-Agent", o00Ooo.OooO00o("Yalla ", p382o0OOoo0o.o00Ooo.OooO0Oo(), ";Android ", Build.VERSION.RELEASE));
            oooO00o2.OooO00o("yalla-clientVer", String.valueOf(p382o0OOoo0o.o00Ooo.OooO0OO()));
            oooO00o2.OooO0oO(o0o00o0OooO0OO);
            FirebasePerfOkHttpClient.enqueue(f55784OooO00o.OooO0O0(oooO00o2.OooO0O0()), new Oooo000(oooo0, oooO00o2, map));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
