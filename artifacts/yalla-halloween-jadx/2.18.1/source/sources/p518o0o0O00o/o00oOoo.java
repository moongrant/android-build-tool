package p518o0o0O00o;

import OooO00o.OooO00o;
import com.app.base.app.appConfig.apiDataModela.OooO0O0;
import com.yalla.yalla.api.service.VoteApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@DebugMetadata(c = "com.yalla.yalla.data.manager.VoteGiftManager$loadGiftConfig$1", f = "VoteGiftManager.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class o00oOoo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42204Oooo0o;

    public o00oOoo(Continuation<? super o00oOoo> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00oOoo(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o00oOoo(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42204Oooo0o;
        String str = "";
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00oO0o o00oo0o2 = o00oO0o.f40841OooO00o;
                VoteApiService voteApiServiceOooO0O0 = o00oO0o.OooO0O0();
                this.f42204Oooo0o = 1;
                obj = voteApiServiceOooO0O0.getVoteGiftList(this);
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
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult.isSuccess()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List list = (List) apiResult.getData();
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(list.get(i2));
                    if (arrayList2.size() == 8 || i2 == list.size() - 1) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(arrayList2);
                        arrayList.add(arrayList3);
                        arrayList2.clear();
                    }
                }
            }
            o00O000 o00o001 = o00O000.f42199OooO00o;
            o00O000.f42200OooO0O0.postValue(arrayList);
        }
        return Unit.INSTANCE;
    }
}
