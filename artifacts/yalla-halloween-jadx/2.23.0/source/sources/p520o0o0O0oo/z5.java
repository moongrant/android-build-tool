package p520o0o0O0oo;

import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager;
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
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager$try2ExitPage$1", f = "GiftLayoutHideSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class z5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftLayoutHideSelectViewManager f53418OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager, Continuation<? super z5> continuation) {
        super(2, continuation);
        this.f53418OooO0Oo = giftLayoutHideSelectViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new z5(this.f53418OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((z5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = this.f53418OooO0Oo;
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftLayoutHideSelectViewManager.f28008OooO00o.f53375OooO0oO), new y5(giftLayoutHideSelectViewManager, null));
        return Unit.INSTANCE;
    }
}
