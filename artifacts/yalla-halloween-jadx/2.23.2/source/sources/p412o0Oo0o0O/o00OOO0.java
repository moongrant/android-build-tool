package p412o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.TaskService;
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
import p384o0OOoo0O.o0OOO0o;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTaskRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRepo.kt\ncom/yalla/yalla/data/repository/TaskRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 4 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,25:1\n18#2,7:26\n25#2,10:34\n109#3:33\n62#4:44\n62#4:45\n62#4:46\n*S KotlinDebug\n*F\n+ 1 TaskRepo.kt\ncom/yalla/yalla/data/repository/TaskRepo\n*L\n12#1:26,7\n12#1:34,10\n12#1:33\n17#1:44\n20#1:45\n23#1:46\n*E\n"})
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OOO0 f46199OooO00o = new o00OOO0();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.TaskRepo", f = "TaskRepo.kt", i = {}, l = {13}, m = "yallaChatBindTask", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46200OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46201OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46200OooO0Oo = obj;
            this.f46201OooO0o |= Integer.MIN_VALUE;
            return o00OOO0.this.OooO00o(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f46201OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f46201OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objYallaChatBindTask = oooO00o.f46200OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f46201OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objYallaChatBindTask);
                TaskService taskServiceOooO00o = o0OOO0o.OooO00o();
                oooO00o.f46201OooO0o = 1;
                objYallaChatBindTask = taskServiceOooO00o.yallaChatBindTask(str, oooO00o);
                if (objYallaChatBindTask == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objYallaChatBindTask);
            }
            return objYallaChatBindTask;
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
