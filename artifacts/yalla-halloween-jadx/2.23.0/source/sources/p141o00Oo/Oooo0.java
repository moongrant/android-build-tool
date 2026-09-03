package p141o00Oo;

import androidx.compose.foundation.gestures.OooO00o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.slider.core.CustomSliderKt$CustomSlider$3$gestureEndAction$1$1", f = "CustomSlider.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f37478OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37479OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f37480OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f37481OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f37482OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f37483OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(o000OOo o000ooo2, float f, float f2, float f3, Function0<Unit> function0, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f37481OooO0o0 = o000ooo2;
        this.f37480OooO0o = f;
        this.f37482OooO0oO = f2;
        this.f37483OooO0oo = f3;
        this.f37478OooO = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo0(this.f37481OooO0o0, this.f37480OooO0o, this.f37482OooO0oO, this.f37483OooO0oo, this.f37478OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f37479OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o000OOo o000ooo2 = this.f37481OooO0o0;
            this.f37479OooO0Oo = 1;
            float f = o0OoOo0.f37572OooO00o;
            Object objOooO00o = OooO00o.OooO00o(o000ooo2, null, new o00Oo0(this.f37480OooO0o, this.f37482OooO0oO, this.f37483OooO0oo, null), this, 1, null);
            if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO00o = Unit.INSTANCE;
            }
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Function0<Unit> function0 = this.f37478OooO;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
