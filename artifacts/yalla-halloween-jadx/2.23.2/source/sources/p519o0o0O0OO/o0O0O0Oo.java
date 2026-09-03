package p519o0o0O0OO;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p518o0o0O0O0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentInputFacePanelKt$MomentInputFacePanel$4$1", f = "MomentInputFacePanel.kt", i = {}, l = {111, 114}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0O0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f52343OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f52344OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52345OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f52346OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(boolean z, boolean z2, OooO0OO oooO0OO, Continuation<? super o0O0O0Oo> continuation) {
        super(2, continuation);
        this.f52345OooO0o0 = z;
        this.f52344OooO0o = z2;
        this.f52346OooO0oO = oooO0OO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0O0Oo(this.f52345OooO0o0, this.f52344OooO0o, this.f52346OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0O0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f52343OooO0Oo;
        OooO0OO oooO0OO = this.f52346OooO0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f52345OooO0o0) {
                if (this.f52344OooO0o) {
                    this.f52343OooO0Oo = 1;
                    if (oooO0OO.OooOO0(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f52343OooO0Oo = 2;
                    if (DelayKt.delay(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO0OO.f51833OooO00o.invoke(Boxing.boxBoolean(true));
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            oooO0OO.f51833OooO00o.invoke(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }
}
