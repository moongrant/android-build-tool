package p412o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.model.GeetCodeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o00oO0o;
import p384o0OOoo0O.OooOOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGeetRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeetRepository.kt\ncom/yalla/yalla/data/repository/GeetRepository\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,13:1\n18#2,7:14\n25#2,10:22\n109#3:21\n*S KotlinDebug\n*F\n+ 1 GeetRepository.kt\ncom/yalla/yalla/data/repository/GeetRepository\n*L\n11#1:14,7\n11#1:22,10\n11#1:21\n*E\n"})
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000Oo0 f46047OooO00o = new o000Oo0();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.GeetRepository", f = "GeetRepository.kt", i = {}, l = {11}, m = "geetGetInfo", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46048OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46049OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46048OooO0Oo = obj;
            this.f46049OooO0o |= Integer.MIN_VALUE;
            return o000Oo0.this.OooO00o(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @Nullable Integer num, @NotNull Continuation<? super ApiResult<GeetCodeModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f46049OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f46049OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objGeetGetInfo = oooO00o.f46048OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f46049OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGeetGetInfo);
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                oooO00o.f46049OooO0o = 1;
                objGeetGetInfo = mainApiServiceOooO00o.geetGetInfo(str, num, oooO00o);
                if (objGeetGetInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGeetGetInfo);
            }
            return objGeetGetInfo;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
