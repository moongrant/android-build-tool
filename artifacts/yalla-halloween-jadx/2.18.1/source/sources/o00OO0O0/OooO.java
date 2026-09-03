package o00OO0O0;

import android.graphics.drawable.NinePatchDrawable;
import android.view.ViewGroup;
import com.weieyu.yalla.R;
import io.agora.rtc.Constants;
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

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.app.base.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1", f = "BaseRoomChatUserVH.kt", i = {}, l = {149, 150, Constants.ERR_PUBLISH_STREAM_CDN_ERROR}, m = "invokeSuspend", n = {}, s = {})
public final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f31371Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f31372Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f31373Oooo0oo;

    @DebugMetadata(c = "com.app.base.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1$1$1", f = "BaseRoomChatUserVH.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f31374Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ NinePatchDrawable f31375Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O oooOO0O, NinePatchDrawable ninePatchDrawable, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31374Oooo0o = oooOO0O;
            this.f31375Oooo0oO = ninePatchDrawable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31374Oooo0o, this.f31375Oooo0oO, continuation);
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
            this.f31374Oooo0o.f31392OooOO0O.setBackground(this.f31375Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.app.base.adapter.roomChat.BaseRoomChatUserVH$setBaseUserInfo$1$1$2", f = "BaseRoomChatUserVH.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f31376Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOO0O oooOO0O, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31376Oooo0o = oooOO0O;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31376Oooo0o, continuation);
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
            this.f31376Oooo0o.f31392OooOO0O.setBackgroundResource(R.drawable.ic_room_bubble_default);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(String str, OooOO0O oooOO0O, Continuation<? super OooO> continuation) {
        super(2, continuation);
        this.f31372Oooo0oO = str;
        this.f31373Oooo0oo = oooOO0O;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO(this.f31372Oooo0oO, this.f31373Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        OooO0O0 oooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f31371Oooo0o;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                    oooO0O0 = new OooO0O0(this.f31373Oooo0oo, null);
                    this.f31371Oooo0o = 3;
                    if (p254o00ooO0O.o0000O0.OooO0Oo(oooO0O0, this) == coroutine_suspended) {
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
        p617o0oo0o.o00O0O o00o0o2 = p617o0oo0o.o00O0O.f48558OooO00o;
        String str = this.f31372Oooo0oO;
        ViewGroup viewGroup = this.f31373Oooo0oo.f31392OooOO0O;
        this.f31371Oooo0o = 1;
        obj = o00o0o2.OooO00o(str, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) obj;
        if (ninePatchDrawable != null) {
            OooO00o oooO00o = new OooO00o(this.f31373Oooo0oo, ninePatchDrawable, null);
            this.f31371Oooo0o = 2;
            if (p254o00ooO0O.o0000O0.OooO0Oo(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            oooO0O0 = new OooO0O0(this.f31373Oooo0oo, null);
            this.f31371Oooo0o = 3;
            if (p254o00ooO0O.o0000O0.OooO0Oo(oooO0O0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
