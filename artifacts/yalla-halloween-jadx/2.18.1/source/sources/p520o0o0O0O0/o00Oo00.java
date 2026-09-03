package p520o0o0O0O0;

import OooO00o.OooO00o;
import androidx.lifecycle.MutableLiveData;
import com.app.base.app.appConfig.apiDataModela.OooO0O0;
import com.yalla.yalla.api.service.VoteApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.VoteDetailModel;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o0o0000.o00oO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.VoteRepo$getVoteRank$1$1", f = "VoteRepo.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class o00Oo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ long f42747Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42748Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<ApiResult<VoteDetailModel>> f42749Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f42750Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(MutableLiveData<ApiResult<VoteDetailModel>> mutableLiveData, long j, long j2, Continuation<? super o00Oo00> continuation) {
        super(2, continuation);
        this.f42749Oooo0oO = mutableLiveData;
        this.f42750Oooo0oo = j;
        this.f42747Oooo = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Oo00(this.f42749Oooo0oO, this.f42750Oooo0oo, this.f42747Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00Oo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42748Oooo0o;
        String str = "";
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f42750Oooo0oo;
                long j2 = this.f42747Oooo;
                o00oO0o o00oo0o2 = o00oO0o.f40841OooO00o;
                VoteApiService voteApiServiceOooO0O0 = o00oO0o.OooO0O0();
                this.f42748Oooo0o = 1;
                obj = voteApiServiceOooO0O0.getVoteRank(j, j2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (IOException e) {
            ApiError apiErrorOooO00o = OooO0O0.OooO00o(e, OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            obj = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(obj);
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            obj = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(obj);
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            obj = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(obj);
        }
        this.f42749Oooo0oO.postValue((ApiResult) obj);
        return Unit.INSTANCE;
    }
}
