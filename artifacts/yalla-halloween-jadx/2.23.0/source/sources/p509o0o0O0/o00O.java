package p509o0o0O0;

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
import p510o0o0O00.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentInputFacePanelKt$MomentInputFacePanel$4$1", f = "MomentInputFacePanel.kt", i = {}, l = {111, 114}, m = "invokeSuspend", n = {}, s = {})
public final class o00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f50724OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f50725OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f50726OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(boolean z, boolean z2, o0O0O00 o0o0o00, Continuation<? super o00O> continuation) {
        super(2, continuation);
        this.f50725OooO0o0 = z;
        this.f50724OooO0o = z2;
        this.f50726OooO0oO = o0o0o00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O(this.f50725OooO0o0, this.f50724OooO0o, this.f50726OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50723OooO0Oo;
        o0O0O00 o0o0o00 = this.f50726OooO0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f50725OooO0o0) {
                if (this.f50724OooO0o) {
                    this.f50723OooO0Oo = 1;
                    if (o0o0o00.OooO(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f50723OooO0Oo = 2;
                    if (DelayKt.delay(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0o0o00.f51431OooO00o.invoke(Boxing.boxBoolean(true));
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            o0o0o00.f51431OooO00o.invoke(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }
}
