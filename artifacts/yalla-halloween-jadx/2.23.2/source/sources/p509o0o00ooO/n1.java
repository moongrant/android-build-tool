package p509o0o00ooO;

import android.graphics.drawable.NinePatchDrawable;
import com.code.android.util.OooOOO;
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
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOO00O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1", f = "BaseRoomChatUserVH.kt", i = {}, l = {178, 179, 180}, m = "invokeSuspend", n = {}, s = {})
public final class n1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ p1 f50737OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f50738OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1$1$1", f = "BaseRoomChatUserVH.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p1 f50739OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ NinePatchDrawable f50740OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(p1 p1Var, NinePatchDrawable ninePatchDrawable, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50739OooO0Oo = p1Var;
            this.f50740OooO0o0 = ninePatchDrawable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50739OooO0Oo, this.f50740OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f50739OooO0Oo.f50758OooOO0.setBackground(this.f50740OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1$2", f = "BaseRoomChatUserVH.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p1 f50741OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p1 p1Var, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f50741OooO0Oo = p1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f50741OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f50741OooO0Oo.f50758OooOO0.setBackgroundResource(o0Oo0oo.ic_room_bubble_default);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(String str, p1 p1Var, Continuation<? super n1> continuation) {
        super(2, continuation);
        this.f50738OooO0o0 = str;
        this.f50737OooO0o = p1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new n1(this.f50738OooO0o0, this.f50737OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((n1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        OooO0O0 oooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50736OooO0Oo;
        p1 p1Var = this.f50737OooO0o;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                    oooO0O0 = new OooO0O0(p1Var, null);
                    this.f50736OooO0Oo = 3;
                    if (OooOOO.OooO0o0(oooO0O0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        oOO00O0 ooo00o0 = oOO00O0.f57177OooO00o;
        this.f50736OooO0Oo = 1;
        obj = ooo00o0.OooO00o(this.f50738OooO0o0, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) obj;
        if (ninePatchDrawable != null) {
            OooO00o oooO00o = new OooO00o(p1Var, ninePatchDrawable, null);
            this.f50736OooO0Oo = 2;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            oooO0O0 = new OooO0O0(p1Var, null);
            this.f50736OooO0Oo = 3;
            if (OooOOO.OooO0o0(oooO0O0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
