package p520o0o0O0oo;

import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager$try2ExitPage$1", f = "GiftLayoutShowSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class b6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftLayoutShowSelectViewManager f53251OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager, Continuation<? super b6> continuation) {
        super(2, continuation);
        this.f53251OooO0Oo = giftLayoutShowSelectViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b6(this.f53251OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = this.f53251OooO0Oo;
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutShowSelectViewManager.f28028OooO00o), new a6(giftLayoutShowSelectViewManager, null));
        return Unit.INSTANCE;
    }
}
