package p501o0o00o;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.FacebookSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager$easyClosePage$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f41524Oooo0o;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f41525OooO00o;

        public OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
            this.f41525OooO00o = giftCustomMadeWebManager;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f41525OooO00o;
            giftCustomMadeWebManager.f20895OooO0Oo = false;
            SVGAView sVGAView = giftCustomMadeWebManager.f20894OooO0OO.f49677OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            TextView textView = this.f41525OooO00o.f20894OooO0OO.f49678OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            oOO00O.OooO00o(textView);
            this.f41525OooO00o.f20893OooO0O0.removeAllViews();
            oOO00O.OooO00o(this.f41525OooO00o.f20893OooO0O0);
            GiftCustomMadeWebManager giftCustomMadeWebManager2 = this.f41525OooO00o;
            Function0<Unit> function0 = giftCustomMadeWebManager2.f20898OooO0oO;
            if (function0 != null) {
                function0.invoke();
                giftCustomMadeWebManager2.f20898OooO0oO = null;
            }
            this.f41525OooO00o.f20900OooOO0 = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
            this.f41525OooO00o.f20900OooOO0 = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super o0OOO0o> continuation) {
        super(2, continuation);
        this.f41524Oooo0o = giftCustomMadeWebManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OOO0o(this.f41524Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), R.anim.easy_dialog_anim_exit_bottom_alpha);
        animationLoadAnimation.setAnimationListener(new OooO00o(this.f41524Oooo0o));
        this.f41524Oooo0o.f20893OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
