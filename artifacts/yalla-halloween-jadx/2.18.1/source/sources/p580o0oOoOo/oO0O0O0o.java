package p580o0oOoOo;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o0O0O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog$TopTabContainer$1$1$1$1", f = "LiveRoomMemberUserRankDialog.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
public final class oO0O0O0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f46625Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f46626Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f46627Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O0o(OooOO0 oooOO1, int i, Continuation<? super oO0O0O0o> continuation) {
        super(2, continuation);
        this.f46626Oooo0oO = oooOO1;
        this.f46627Oooo0oo = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0O0O0o(this.f46626Oooo0oO, this.f46627Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0O0O0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46625Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOO0 oooOO1 = this.f46626Oooo0oO;
            int i2 = this.f46627Oooo0oo;
            this.f46625Oooo0o = 1;
            OooOO0.OooO0OO oooO0OO = OooOO0.f35352OooO0oo;
            if (oooOO1.OooO0Oo(i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this) == coroutine_suspended) {
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
