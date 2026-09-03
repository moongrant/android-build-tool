package p522o0o0O0o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f42960Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f42961Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f42962Oooo0oO = 800;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f42963Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function1<Animator, Unit> f42964OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(View view, Function1 function1, Function1 function2, Function1 function3) {
        super(1);
        this.f42961Oooo0o = view;
        this.f42963Oooo0oo = function1;
        this.f42960Oooo = function2;
        this.f42964OoooO00 = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        View view = this.f42961Oooo0o;
        long j = this.f42962Oooo0oO;
        o000OO o000oo2 = new o000OO(this.f42963Oooo0oo);
        o0000O o0000o2 = new o0000O(this.f42960Oooo);
        o0000OO0 o0000oo1 = new o0000OO0(this.f42964OoooO00);
        Intrinsics.checkNotNullParameter(view, "<this>");
        ObjectAnimator objectAnimatorOooO00o = o000Oo0.OooO00o(view, 80.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float[] values = {1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", Arrays.copyOf(values, 2));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(this, \"alpha\", *values)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOooO00o, objectAnimatorOfFloat);
        animatorSet.setDuration(j);
        animatorSet.addListener(new o0000oo(o000oo2, o0000o2, o0000oo1, null));
        animatorSet.start();
        return Unit.INSTANCE;
    }
}
