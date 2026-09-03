package p478o0o000;

import com.yalla.yalla.data.repository.ApiRepo$uploadFirebaseToken$$inlined$call$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p412o0Oo0o0O.o0000oo;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.firebase.YLFirebaseMessageManager$uploadFirebaseToken$1", f = "YLFirebaseMessageManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f48381OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(String str, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f48381OooO0o0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoOo0(this.f48381OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48380OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boxing.boxBoolean(true))) {
                StringBuilder sb = new StringBuilder("token = ");
                String str = this.f48381OooO0o0;
                sb.append(str);
                o0000O00.OooO0OO("YLFirebaseMessagingService", sb.toString());
                o0000oo o0000ooVar = o0000oo.f45964OooO00o;
                this.f48380OooO0Oo = 1;
                o0000ooVar.getClass();
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ApiRepo$uploadFirebaseToken$$inlined$call$1(o0000ooVar, null, str), this);
                if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objWithContext = Unit.INSTANCE;
                }
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
