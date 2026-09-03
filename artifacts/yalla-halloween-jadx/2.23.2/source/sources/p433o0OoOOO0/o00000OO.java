package p433o0OoOOO0;

import android.animation.ObjectAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.oO0000o0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f46859OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(o00000O0 o00000o1) {
        super(1);
        this.f46859OooO0Oo = o00000o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        o00000O0 o00000o1 = this.f46859OooO0Oo;
        if (o00000o1.f46854OooO0o != null) {
            Intrinsics.checkNotNull(bool2);
            oO0000o0 oo0000o0 = null;
            if (bool2.booleanValue()) {
                oO0000o0 oo0000o1 = o00000o1.f46854OooO0o;
                if (oo0000o1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                } else {
                    oo0000o0 = oo0000o1;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(oo0000o0.f44754OooO00o, "translationX", 0.0f);
                objectAnimatorOfFloat.setStartDelay(600L);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.start();
            } else {
                oO0000o0 oo0000o2 = o00000o1.f46854OooO0o;
                if (oo0000o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    oo0000o2 = null;
                }
                float width = oo0000o2.f44754OooO00o.getWidth();
                if (OooOo00.OooO0o0()) {
                    width = -width;
                }
                oO0000o0 oo0000o3 = o00000o1.f46854OooO0o;
                if (oo0000o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                } else {
                    oo0000o0 = oo0000o3;
                }
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(oo0000o0.f44754OooO00o, "translationX", width);
                objectAnimatorOfFloat2.setDuration(500L);
                objectAnimatorOfFloat2.start();
            }
        }
        return Unit.INSTANCE;
    }
}
