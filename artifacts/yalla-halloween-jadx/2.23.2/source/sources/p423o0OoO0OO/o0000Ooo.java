package p423o0OoO0OO;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p511o0o0O.o0000;
import p511o0o0O.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f46639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46640OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f46641OooO0o0 = 800;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46642OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f46643OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(GiftNumberView giftNumberView, p511o0o0O.o0000Ooo o0000ooo, o0000 o0000Var, o0000O00 o0000o00) {
        super(1);
        this.f46639OooO0Oo = giftNumberView;
        this.f46640OooO0o = o0000ooo;
        this.f46642OooO0oO = o0000Var;
        this.f46643OooO0oo = o0000o00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        o00000O0 o00000o1 = new o00000O0(this.f46640OooO0o);
        o00000O o00000o = new o00000O(this.f46642OooO0oO);
        o00000OO o00000oo2 = new o00000OO(this.f46643OooO0oo);
        View view = this.f46639OooO0Oo;
        Intrinsics.checkNotNullParameter(view, "<this>");
        float[] values = {80.0f, 0.0f};
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "TranslationY", Arrays.copyOf(values, 2));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        float[] values2 = {1.0f, 0.0f};
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(values2, "values");
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", Arrays.copyOf(values2, 2));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(this.f46641OooO0o0);
        animatorSet.addListener(new o000000(o00000o1, o00000o, o00000oo2, null));
        animatorSet.start();
        return Unit.INSTANCE;
    }
}
