package p244o00oo0O;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import p334o0OO00o.o0O0o0;
import p334o0OO00o.o0oOo0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0o0 f34186OooO00o = new o0O0o0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0oOo0O0 f34187OooO0O0 = new o0oOo0O0();

    @Override // p244o00oo0O.oo0o0Oo
    public Animator[] OooO00o(View view) {
        return new ObjectAnimator[]{ObjectAnimator.ofFloat(view, "scaleX", 0.5f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 0.5f, 1.0f)};
    }
}
