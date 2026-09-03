package p501o0o00o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
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
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager$try2ExitPage$1", f = "GiftBlindWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindWebManager f41519Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(GiftBlindWebManager giftBlindWebManager, Continuation<? super o00oO0o> continuation) {
        super(2, continuation);
        this.f41519Oooo0o = giftBlindWebManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00oO0o(this.f41519Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GiftBlindWebManager giftBlindWebManager = this.f41519Oooo0o;
        o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(giftBlindWebManager.f20886OooO00o), new Oooo0(giftBlindWebManager, null));
        return Unit.INSTANCE;
    }
}
