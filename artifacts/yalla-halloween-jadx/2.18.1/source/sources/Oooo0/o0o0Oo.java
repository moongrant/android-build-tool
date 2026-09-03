package Oooo0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
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
@DebugMetadata(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {276, 278}, m = "invokeSuspend", n = {}, s = {})
public final class o0o0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ float f748Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f749Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f750Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f751Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ float f752OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(boolean z, o0oOOo o0oooo2, float f, float f2, Continuation<? super o0o0Oo> continuation) {
        super(2, continuation);
        this.f750Oooo0oO = z;
        this.f751Oooo0oo = o0oooo2;
        this.f748Oooo = f;
        this.f752OoooO00 = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0o0Oo(this.f750Oooo0oO, this.f751Oooo0oo, this.f748Oooo, this.f752OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0o0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f749Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f750Oooo0oO) {
                o0oOOo o0oooo2 = this.f751Oooo0oo;
                float f = this.f748Oooo;
                this.f749Oooo0o = 1;
                if (p025Oooo0O0.o000OO.OooO00o(o0oooo2, f, p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                o0oOOo o0oooo3 = this.f751Oooo0oo;
                float f2 = this.f752OoooO00;
                this.f749Oooo0o = 2;
                if (p025Oooo0O0.o000OO.OooO00o(o0oooo3, f2, p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
