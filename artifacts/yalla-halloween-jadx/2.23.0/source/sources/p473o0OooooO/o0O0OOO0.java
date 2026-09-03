package p473o0OooooO;

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
import p406o0Oo0Ooo.oOO00OO;
import p464o0Oooo.o000000O;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.firebase.YLFirebaseMessageManager$uploadFirebaseToken$1", f = "YLFirebaseMessageManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47207OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f47208OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(String str, Continuation<? super o0O0OOO0> continuation) {
        super(2, continuation);
        this.f47208OooO0o0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0OOO0(this.f47208OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0OOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47207OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boxing.boxBoolean(true))) {
                StringBuilder sb = new StringBuilder("token = ");
                String str = this.f47208OooO0o0;
                sb.append(str);
                OooOOO0.OooO0OO("YLFirebaseMessagingService", sb.toString());
                oOO00OO ooo00oo = oOO00OO.f44930OooO00o;
                this.f47207OooO0Oo = 1;
                ooo00oo.getClass();
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ApiRepo$uploadFirebaseToken$$inlined$call$1(ooo00oo, null, str), this);
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
