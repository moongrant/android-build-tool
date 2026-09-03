package p119o00O0Oo0;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f30750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f30751OooO0O0;

    public o00Oo0(Function0<Unit> function0, Function0<Unit> function1) {
        this.f30750OooO00o = function0;
        this.f30751OooO0O0 = function1;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f30751OooO0O0;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f30750OooO00o;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
