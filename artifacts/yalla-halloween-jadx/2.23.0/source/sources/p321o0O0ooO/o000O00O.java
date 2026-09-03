package p321o0O0ooO;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f42843OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f42844OooO0O0;

    public o000O00O(Function0<Unit> function0, Function0<Unit> function1) {
        this.f42843OooO00o = function0;
        this.f42844OooO0O0 = function1;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f42844OooO0O0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f42843OooO00o;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
