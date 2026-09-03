package p423o0OoO0OO;

import com.code.android.json.OooO00o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o00oO0o;
import p384o0OOoo0O.OooOOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ext.RoomBaseAdapterExtKt$blockAd$1", f = "RoomBaseAdapterExt.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRoomBaseAdapterExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBaseAdapterExt.kt\ncom/yalla/yalla/ext/RoomBaseAdapterExtKt$blockAd$1\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,17:1\n18#2,7:18\n25#2,10:26\n109#3:25\n*S KotlinDebug\n*F\n+ 1 RoomBaseAdapterExt.kt\ncom/yalla/yalla/ext/RoomBaseAdapterExtKt$blockAd$1\n*L\n12#1:18,7\n12#1:26,10\n12#1:25\n*E\n"})
public final class o00O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46681OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f46682OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f46683OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(int i, int i2, Continuation<? super o00O00> continuation) {
        super(2, continuation);
        this.f46683OooO0o0 = i;
        this.f46682OooO0o = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00(this.f46683OooO0o0, this.f46682OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46681OooO0Oo;
        int i2 = this.f46683OooO0o0;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i3 = this.f46682OooO0o;
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                this.f46681OooO0Oo = 1;
                obj = mainApiServiceOooO00o.blockAds(i2, i3, this);
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
            String strOooO0oo = OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            obj = OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(obj);
        } catch (CancellationException e2) {
            String strOooO0oo2 = OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            obj = OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(obj);
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            obj = OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(obj);
        }
        if (((ApiResult) obj).isSuccess()) {
            LiveEventBus.get("BLOCK_ADVERTISING").post(Boxing.boxInt(i2));
        }
        return Unit.INSTANCE;
    }
}
