package p540o0o0OoO0;

import android.content.Context;
import com.code.android.util.OooOOO;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p442o0OoOo0O.o0000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog$TaskItem$1$2$1", f = "LiveRoomMemberTaskDialog.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0o00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f54806OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f54807OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog$TaskItem$1$2$1$1", f = "LiveRoomMemberTaskDialog.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f54808OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54808OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f54808OooO0Oo = 1;
                if (DelayKt.delay(400L, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(Context context, Continuation<? super o0O0o00O> continuation) {
        super(2, continuation);
        this.f54807OooO0o0 = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0o00O(this.f54807OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0o00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0000 o0000Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f54806OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = new OooO00o(null);
            this.f54806OooO0Oo = 1;
            if (OooOOO.OooO0Oo(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Context context = this.f54807OooO0o0;
        MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
        if (mixedRoomActivity != null && (o0000Var = mixedRoomActivity.f22983OoooO0.f49614OooO) != null) {
            o0000Var.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
