package p531o0o0OOO0;

import android.os.Build;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.protobuf.GeneratedMessageLite;
import com.yalla.yalla.common.model.ImResult;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o0o0000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p485o0o000Oo.o0OoOo0;
import p485o0o000Oo.oo000o;
import p487o0o000oO.o0OOO0o;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.OooOOOO;
import p612o0oo0OOO.oOo0000O;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import p663o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O000 f43398OooO00o = new o00O000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o00OO f43399OooO0O0;

    public static final class OooO00o extends o00O00O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<ImResult> f43400OooO00o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(CancellableContinuation<? super ImResult> cancellableContinuation) {
            this.f43400OooO00o = cancellableContinuation;
        }

        @Override // p612o0oo0OOO.oOo0000O
        public final void OooO0O0(@Nullable o00OOOO0 o00oooo1) throws BadPaddingException, IllegalBlockSizeException, IOException {
            byte[] bArrOooO00o;
            o00OOOOo o00ooooo2 = o00oooo1.f51441OoooO;
            if (o00ooooo2 != null) {
                byte[] bArrOooO0O0 = o00ooooo2.OooO0O0();
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                bArrOooO00o = OooOOOO.OooO00o(bArrOooO0O0, (byte[]) OooOOO0.OooO0o().f41374OooO0O0.getValue(), (byte[]) OooOOO0.OooO0o().f41375OooO0OO.getValue());
            } else {
                bArrOooO00o = null;
            }
            CancellableContinuation<ImResult> cancellableContinuation = this.f43400OooO00o;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(new ImResult(bArrOooO00o, 0, 2, null)));
        }

        @Override // p612o0oo0OOO.oOo0000O
        public final void onError(int i) {
            CancellableContinuation<ImResult> cancellableContinuation = this.f43400OooO00o;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(new ImResult(null, i, 1, null)));
        }
    }

    static {
        o00OoO00.OooOOO0.OooO00o OooO00o2 = p157o00OoO00.OooOOO0.OooO00o();
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        oooO00o.OooO0OO(7000L, TimeUnit.MILLISECONDS);
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        oooO00o.f51368OooOo = o00OOO00.OooO0O0(15L, unit);
        oooO00o.OooO0OO(5L, unit);
        oooO00o.OooO0oO(8L, unit);
        oooO00o.OooO(8L);
        SSLSocketFactory sSLSocketFactory = OooO00o2.f32360OooO00o;
        Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sslParams.sSLSocketFactory");
        X509TrustManager x509TrustManager = OooO00o2.f32361OooO0O0;
        Intrinsics.checkNotNullExpressionValue(x509TrustManager, "sslParams.trustManager");
        oooO00o.OooO0oo(sSLSocketFactory, x509TrustManager);
        oooO00o.OooO00o(new oo000o());
        oooO00o.OooO00o(new o0OoOo0());
        OooO0O0.f40784OooO00o.OooO0O0(oooO00o);
        f43399OooO0O0 = new o00OO(oooO00o);
    }

    public static final void OooO00o(o0ooo0o0.o00OOO00.OooO00o oooO00o, HashMap map, oOo0000O ooo0000o, int i, String str) {
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
            ooo0000o.onError(i);
            return;
        }
        ((o00O0OO) f43399OooO0O0.OooO0OO(oooO00o.OooO0O0())).OoooO0O(new o00oOoo(ooo0000o, oooO00o, map));
    }

    @Nullable
    public final Object OooO0O0(@NotNull String str, @NotNull GeneratedMessageLite.OooO00o<?, ?> oooO00o, @NotNull Continuation<? super ImResult> continuation) throws BadPaddingException, IllegalBlockSizeException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        byte[] content = oooO00o.build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(content, "content");
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        byte[] key = (byte[]) OooOOO0.OooO0o().f41374OooO0O0.getValue();
        byte[] bArr = (byte[]) OooOOO0.OooO0o().f41375OooO0OO.getValue();
        Intrinsics.checkNotNullParameter(content, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter("AES/CBC/PKCS7Padding", "algorithm");
        byte[] bArrDoFinal = OooOOOO.OooO0O0(1, key, bArr, "AES/CBC/PKCS7Padding").doFinal(content);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(this)");
        o0o0Oo o0o0ooOooO0Oo = o0o0Oo.OooO00o.OooO0Oo(o0o0Oo.Companion, bArrDoFinal, o00OO0O0.f51401OooO0oO.OooO0O0("application/octet-stream"), 0, 6);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        List<String> list = o0ooOOo.f32219OooO0O0;
        OooO00o oooO00o2 = new OooO00o(cancellableContinuationImpl);
        if (!list.isEmpty()) {
            HashMap map = new HashMap();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                map.put(it.next(), Boolean.FALSE);
            }
            String str2 = list.get(0);
            map.put(str2, Boolean.TRUE);
            o0ooo0o0.o00OOO00.OooO00o oooO00o3 = new o0ooo0o0.o00OOO00.OooO00o();
            oooO00o3.OooOO0o(str2 + str);
            OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
            oooO00o3.OooO00o("flags", (String) OooOOO0.OooO0o().f41376OooO0Oo.getValue());
            String value = OooOOO.f41216OooO00o.OooOo0O().getValue();
            if (value == null) {
                value = "";
            }
            oooO00o3.OooO00o("Auth", value);
            StringBuilder sb = new StringBuilder();
            sb.append("Yalla ");
            o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
            sb.append(o0OOO0o.OooO0O0());
            sb.append(";Android ");
            sb.append(Build.VERSION.RELEASE);
            oooO00o3.OooO00o("User-Agent", sb.toString());
            oooO00o3.OooO00o("yalla-clientVer", "21");
            oooO00o3.OooO0oo(o0o0ooOooO0Oo);
            ((o00O0OO) f43399OooO0O0.OooO0OO(oooO00o3.OooO0O0())).OoooO0O(new o00oOoo(oooO00o2, oooO00o3, map));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
