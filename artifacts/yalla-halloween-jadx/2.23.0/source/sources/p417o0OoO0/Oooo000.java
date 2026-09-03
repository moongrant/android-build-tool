package p417o0OoO0;

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
import p520o0o0O0oo.a7;
import p520o0o0O0oo.y6;
import p520o0o0O0oo.z6;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f45447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f45449OooO0o0 = 800;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45450OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f45451OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(GiftNumberView giftNumberView, y6 y6Var, z6 z6Var, a7 a7Var) {
        super(1);
        this.f45447OooO0Oo = giftNumberView;
        this.f45448OooO0o = y6Var;
        this.f45450OooO0oO = z6Var;
        this.f45451OooO0oo = a7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        OooOOOO oooOOOO = new OooOOOO(this.f45448OooO0o);
        OooOo00 oooOo00 = new OooOo00(this.f45450OooO0oO);
        OooOo oooOo = new OooOo(this.f45451OooO0oo);
        View view = this.f45447OooO0Oo;
        Intrinsics.checkNotNullParameter(view, "<this>");
        float[] values = {80.0f, 0.0f};
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "TranslationY", Arrays.copyOf(values, 2));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(this, \"TranslationY\", *values)");
        float[] values2 = {1.0f, 0.0f};
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(values2, "values");
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", Arrays.copyOf(values2, 2));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(this, \"alpha\", *values)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(this.f45449OooO0o0);
        animatorSet.addListener(new OooOO0O(oooOOOO, oooOo00, oooOo, null));
        animatorSet.start();
        return Unit.INSTANCE;
    }
}
