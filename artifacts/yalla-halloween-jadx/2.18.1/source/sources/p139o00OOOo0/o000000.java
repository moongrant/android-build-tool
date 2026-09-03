package p139o00OOOo0;

import androidx.compose.ui.platform.o00OO0O0;
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
import p617o0oo0o.o00O000;
import p710ooOO.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.app.base.dialog.baseDialog.EditFeeDialogUtilKt$EditFeeContent$2", f = "EditFeeDialogUtil.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
public final class o000000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f31739Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f31740Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f31741Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o0000Ooo o0000ooo, o00OO0O0 o00oo0o1, Continuation<? super o000000> continuation) {
        super(2, continuation);
        this.f31740Oooo0oO = o0000ooo;
        this.f31741Oooo0oo = o00oo0o1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000000(this.f31740Oooo0oO, this.f31741Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f31739Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f31740Oooo0oO.OooO00o();
            o00OO0O0 o00oo0o1 = this.f31741Oooo0oo;
            if (o00oo0o1 != null) {
                this.f31739Oooo0o = 1;
                if (o00O000.OooO00o(o00oo0o1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
