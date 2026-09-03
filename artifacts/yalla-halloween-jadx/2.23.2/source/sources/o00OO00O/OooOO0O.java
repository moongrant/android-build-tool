package o00OO00O;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f37073OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f37074OooO0O0;

    public OooOO0O(Function0<Unit> function0, Function0<Unit> function1) {
        this.f37073OooO00o = function0;
        this.f37074OooO0O0 = function1;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f37074OooO0O0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f37073OooO00o;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
