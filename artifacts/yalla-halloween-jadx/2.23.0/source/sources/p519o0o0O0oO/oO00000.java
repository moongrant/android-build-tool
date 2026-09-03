package p519o0o0O0oO;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.facebook.FacebookSdk;
import com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p584o0oOooO0.oO000o00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog$easyClosePage$1", f = "GiftBlindHistoryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftBlindHistoryDialog f52793OooO0Oo;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftBlindHistoryDialog f52794OooO00o;

        public OooO00o(GiftBlindHistoryDialog giftBlindHistoryDialog) {
            this.f52794OooO00o = giftBlindHistoryDialog;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            SVGAView sVGAView = this.f52794OooO00o.OooOOO0().f58155OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView);
            o00Oo0.OooO0Oo().OooOO0O();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(GiftBlindHistoryDialog giftBlindHistoryDialog, Continuation<? super oO00000> continuation) {
        super(2, continuation);
        this.f52793OooO0Oo = giftBlindHistoryDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO00000(this.f52793OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO00000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oO000o00.easy_dialog_anim_exit_bottom_alpha).setAnimationListener(new OooO00o(this.f52793OooO0Oo));
        return Unit.INSTANCE;
    }
}
