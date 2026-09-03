package p536o0o0OOoo;

import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0O0ooO;
import p563o0oOo0.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.message.SystemMessageActivity$initData$2$1", f = "SystemMessageActivity.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
public final class w1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43883Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f43884Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO<SystemMessage> f43885Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(SystemMessageActivity systemMessageActivity, o0O0ooO<SystemMessage> o0o0ooo, Continuation<? super w1> continuation) {
        super(2, continuation);
        this.f43884Oooo0oO = systemMessageActivity;
        this.f43885Oooo0oo = o0o0ooo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new w1(this.f43884Oooo0oO, this.f43885Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((w1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43883Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00oOoo o00oooo2 = this.f43884Oooo0oO.f22244Ooooo00;
            if (o00oooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00oooo2 = null;
            }
            o0O0ooO<SystemMessage> o0o0ooo = this.f43885Oooo0oo;
            this.f43883Oooo0o = 1;
            if (o00oooo2.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
                return coroutine_suspended;
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
