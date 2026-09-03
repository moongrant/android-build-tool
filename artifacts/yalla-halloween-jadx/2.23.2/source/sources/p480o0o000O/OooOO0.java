package p480o0o000O;

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
import o0OoO.OooOO0O;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.OooOo;
import p384o0OOoo0O.Oooo0;
import p386o0OOooO.oo0o0Oo;
import p415o0Oo0oO0.o00Ooo;
import p424o0OoO0Oo.o00OO00O;
import p475o0Ooooo0.o0O00oO0;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00OOO;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nIMHttp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMHttp.kt\ncom/yalla/yalla/service/im/socket/IMHttp\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,222:1\n314#2,11:223\n*S KotlinDebug\n*F\n+ 1 IMHttp.kt\ncom/yalla/yalla/service/im/socket/IMHttp\n*L\n197#1:223,11\n*E\n"})
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoO00O f48392OooO00o;

    static {
        o00OO00O.OooO00o OooO00o2 = o00OO00O.OooO00o();
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        oooO00o.OooO0O0(7000L, TimeUnit.MILLISECONDS);
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        oooO00o.f57936OooOo0o = oO000o00.OooO0O0(15L, unit);
        oooO00o.OooO0O0(5L, unit);
        oooO00o.OooO0OO(8L, unit);
        oooO00o.OooO0o0(8L, unit);
        SSLSocketFactory sSLSocketFactory = OooO00o2.f46729OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sSLSocketFactory");
        X509TrustManager trustManager = OooO00o2.f46730OooO0O0;
        Intrinsics.checkNotNullExpressionValue(trustManager, "trustManager");
        oooO00o.OooO0Oo(sSLSocketFactory, trustManager);
        oooO00o.OooO00o(new OtlpInterceptor());
        oooO00o.OooO00o(new HttpLoggingInterceptor(0));
        oooO00o.OooO00o(new OooOO0O());
        Lazy lazy = OooOo.f43318OooO00o;
        OooOo.OooO0O0(oooO00o);
        f48392OooO00o = new o0OoO00O(oooO00o);
    }

    public static final void OooO00o(o0O00O0o.OooO00o oooO00o, HashMap map, OooOOO oooOOO, int i, String str) {
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
            oooOOO.OooO0O0(i, null);
        } else {
            FirebasePerfOkHttpClient.enqueue(f48392OooO00o.OooO0O0(oooO00o.OooO0O0()), new OooO0o(oooOOO, oooO00o, map));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static Object OooO0O0(@NotNull String str, @NotNull GeneratedMessageV3.Builder builder, @NotNull Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        byte[] byteArray = ((Message) builder.build()).toByteArray();
        Intrinsics.checkNotNull(byteArray);
        byte[] bArrAesEncrypt$default = AESKt.aesEncrypt$default(byteArray, (byte[]) o00Ooo.OooO0o().f46392OooO0O0.getValue(), (byte[]) o00Ooo.OooO0o().f46393OooO0OO.getValue(), (String) null, 4, (Object) null);
        o0oO0Ooo.OooO00o oooO00o = o0oO0Ooo.Companion;
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        o0O00OOO o0o00oooOooO0OO = o0oO0Ooo.OooO00o.OooO0OO(oooO00o, bArrAesEncrypt$default, o0O000Oo.OooO00o.OooO0O0("application/octet-stream"), 0, 6);
        List<String> list = Oooo0.f43333OooO00o;
        OooO oooO = new OooO(cancellableContinuationImpl);
        if (!list.isEmpty()) {
            HashMap map = new HashMap();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                map.put(it.next(), Boolean.FALSE);
            }
            String str2 = list.get(0);
            map.put(str2, Boolean.TRUE);
            o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o();
            oooO00o2.OooOO0(str2 + str);
            oooO00o2.OooO00o("flags", (String) o00Ooo.OooO0o().f46394OooO0Oo.getValue());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String str3 = (String) o0O00oO0.OooOOOo().getValue();
            if (str3 == null) {
                str3 = "";
            }
            oooO00o2.OooO00o("Auth", str3);
            oooO00o2.OooO00o("User-Agent", p031OoooO0.o00Ooo.OooO00o("Yalla ", oo0o0Oo.OooO0Oo(), ";Android ", Build.VERSION.RELEASE));
            oooO00o2.OooO00o("yalla-clientVer", String.valueOf(oo0o0Oo.OooO0OO()));
            oooO00o2.OooO0oO(o0o00oooOooO0OO);
            FirebasePerfOkHttpClient.enqueue(f48392OooO00o.OooO0O0(oooO00o2.OooO0O0()), new OooO0o(oooO, oooO00o2, map));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
