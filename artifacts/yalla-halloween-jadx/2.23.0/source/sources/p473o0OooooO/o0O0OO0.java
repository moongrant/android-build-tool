package p473o0OooooO;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000O00;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p281o0O0O0oO.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.firebase.YLFirebaseMessageManager$unBindFirebase$1", f = "YLFirebaseMessageManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public o0O0OO0(Continuation<? super o0O0OO0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0OO0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o0O0OO0(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FirebaseMessaging firebaseMessaging;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(OooOO0.OooO0OO());
            }
            firebaseMessaging.OooO0O0();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
