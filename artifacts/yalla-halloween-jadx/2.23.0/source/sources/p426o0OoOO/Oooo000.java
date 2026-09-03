package p426o0OoOO;

import android.animation.ObjectAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p591o0oo000O.OooO;
import p641o0ooOOOO.r3;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f45611OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(OooOo00 oooOo00) {
        super(1);
        this.f45611OooO0Oo = oooOo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean show = bool;
        OooOo00 oooOo00 = this.f45611OooO0Oo;
        if (oooOo00.f45595OooO0o != null) {
            Intrinsics.checkNotNullExpressionValue(show, "show");
            r3 r3Var = null;
            if (show.booleanValue()) {
                r3 r3Var2 = oooOo00.f45595OooO0o;
                if (r3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                } else {
                    r3Var = r3Var2;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(r3Var.f58717OooO00o, "translationX", 0.0f);
                objectAnimatorOfFloat.setStartDelay(600L);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.start();
            } else {
                r3 r3Var3 = oooOo00.f45595OooO0o;
                if (r3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    r3Var3 = null;
                }
                float width = r3Var3.f58717OooO00o.getWidth();
                if (OooO.OooO0o0()) {
                    width = -width;
                }
                r3 r3Var4 = oooOo00.f45595OooO0o;
                if (r3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                } else {
                    r3Var = r3Var4;
                }
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(r3Var.f58717OooO00o, "translationX", width);
                objectAnimatorOfFloat2.setDuration(500L);
                objectAnimatorOfFloat2.start();
            }
        }
        return Unit.INSTANCE;
    }
}
