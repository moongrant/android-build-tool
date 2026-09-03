package p502o0o00oOO;

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
import p579o0oOoo.oO0000Oo;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1", f = "BaseRoomChatUserVH.kt", i = {}, l = {178, 179, 180}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f49440OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f49441OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f49442OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1$1$1", f = "BaseRoomChatUserVH.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0 f49443OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ NinePatchDrawable f49444OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OOO0 o0ooo1, NinePatchDrawable ninePatchDrawable, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f49443OooO0Oo = o0ooo1;
            this.f49444OooO0o0 = ninePatchDrawable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f49443OooO0Oo, this.f49444OooO0o0, continuation);
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
            this.f49443OooO0Oo.f49456OooOO0.setBackground(this.f49444OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1$2", f = "BaseRoomChatUserVH.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0 f49445OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OOO0 o0ooo1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f49445OooO0Oo = o0ooo1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f49445OooO0Oo, continuation);
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
            this.f49445OooO0Oo.f49456OooOO0.setBackgroundResource(oOo00OO0.ic_room_bubble_default);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(String str, o0OOO0 o0ooo1, Continuation<? super o0OO> continuation) {
        super(2, continuation);
        this.f49442OooO0o0 = str;
        this.f49441OooO0o = o0ooo1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO(this.f49442OooO0o0, this.f49441OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        OooO0O0 oooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f49440OooO0Oo;
        o0OOO0 o0ooo1 = this.f49441OooO0o;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                    oooO0O0 = new OooO0O0(o0ooo1, null);
                    this.f49440OooO0Oo = 3;
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
        oO0000Oo oo0000oo = oO0000Oo.f56526OooO00o;
        this.f49440OooO0Oo = 1;
        obj = oo0000oo.OooO00o(this.f49442OooO0o0, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) obj;
        if (ninePatchDrawable != null) {
            OooO00o oooO00o = new OooO00o(o0ooo1, ninePatchDrawable, null);
            this.f49440OooO0Oo = 2;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            oooO0O0 = new OooO0O0(o0ooo1, null);
            this.f49440OooO0Oo = 3;
            if (OooOOO.OooO0o0(oooO0O0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
