package p529o0o0OO0o;

import OooO00o.OooO00o;
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
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.firebase.YLFirebaseMessageManager$uploadFirebaseToken$1", f = "YLFirebaseMessageManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43137Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f43138Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(String str, Continuation<? super o00O0000> continuation) {
        super(2, continuation);
        this.f43138Oooo0oO = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0000(this.f43138Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43137Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boxing.boxBoolean(true))) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("token = ");
                sbOooO0o0.append(this.f43138Oooo0oO);
                o00O00.OooO0OO("YLFirebaseMessagingService", sbOooO0o0.toString());
                OooOO0 oooOO1 = OooOO0.f42222OooO00o;
                String str = this.f43138Oooo0oO;
                this.f43137Oooo0o = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ApiRepo$uploadFirebaseToken$$inlined$call$1(oooOO1, null, str), this);
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
