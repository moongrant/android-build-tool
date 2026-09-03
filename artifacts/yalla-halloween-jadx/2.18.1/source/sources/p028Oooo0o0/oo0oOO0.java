package p028Oooo0o0;

import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oo0oOO0 extends WindowInsetsAnimationCompat.Callback implements Runnable, oo000o, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f2238Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o0OO000 f2239Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public WindowInsetsCompat f2240OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(@NotNull o0OO000 composeInsets) {
        super(!composeInsets.f2192OooOOoo ? 1 : 0);
        Intrinsics.checkNotNullParameter(composeInsets, "composeInsets");
        this.f2239Oooo0oo = composeInsets;
    }

    @Override // o000O0O0.oo000o
    @NotNull
    public final WindowInsetsCompat OooO00o(@NotNull View view, @NotNull WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (this.f2238Oooo) {
            this.f2240OoooO00 = insets;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
            return insets;
        }
        this.f2239Oooo0oo.OooO00o(insets, 0);
        if (!this.f2239Oooo0oo.f2192OooOOoo) {
            return insets;
        }
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.f7917OooO0O0;
        Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void OooO0O0(@NotNull WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f2238Oooo = false;
        WindowInsetsCompat windowInsetsCompat = this.f2240OoooO00;
        if (animation.f7890OooO00o.OooO00o() != 0 && windowInsetsCompat != null) {
            this.f2239Oooo0oo.OooO00o(windowInsetsCompat, animation.f7890OooO00o.OooO0OO());
        }
        this.f2240OoooO00 = null;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void OooO0OO(@NotNull WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f2238Oooo = true;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NotNull
    public final WindowInsetsCompat OooO0Oo(@NotNull WindowInsetsCompat insets, @NotNull List<WindowInsetsAnimationCompat> runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        this.f2239Oooo0oo.OooO00o(insets, 0);
        if (!this.f2239Oooo0oo.f2192OooOOoo) {
            return insets;
        }
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.f7917OooO0O0;
        Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NotNull
    public final WindowInsetsAnimationCompat.OooO00o OooO0o0(@NotNull WindowInsetsAnimationCompat animation, @NotNull WindowInsetsAnimationCompat.OooO00o bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f2238Oooo = false;
        Intrinsics.checkNotNullExpressionValue(bounds, "super.onStart(animation, bounds)");
        return bounds;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2238Oooo) {
            this.f2238Oooo = false;
            WindowInsetsCompat windowInsetsCompat = this.f2240OoooO00;
            if (windowInsetsCompat != null) {
                this.f2239Oooo0oo.OooO00o(windowInsetsCompat, 0);
                this.f2240OoooO00 = null;
            }
        }
    }
}
