package p650o0ooo;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
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
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog$easyClosePage$1", f = "GiftBlindHistoryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftBlindHistoryDialog f58650OooO0Oo;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftBlindHistoryDialog f58651OooO00o;

        public OooO00o(GiftBlindHistoryDialog giftBlindHistoryDialog) {
            this.f58651OooO00o = giftBlindHistoryDialog;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            SVGAView svgaLoading = this.f58651OooO00o.OooOOO0().f44684OooO0O0;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooO0O0(svgaLoading);
            o00Ooo.OooO0Oo().OooOO0O();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(GiftBlindHistoryDialog giftBlindHistoryDialog, Continuation<? super o0O0OOO0> continuation) {
        super(2, continuation);
        this.f58650OooO0Oo = giftBlindHistoryDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0OOO0(this.f58650OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0OOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oo000o.easy_dialog_anim_exit_bottom_alpha).setAnimationListener(new OooO00o(this.f58650OooO0Oo));
        return Unit.INSTANCE;
    }
}
