package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0OO;
import kotlin.Metadata;
import o00OO000.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132o00O0ooo.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", "T", "Lo00O0ooo/o00O00;", "Lo00OO000/OooO0o;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public abstract class GenericViewTarget<T extends View> implements o00O00<T>, OooO0o, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f11723OooO0Oo;

    @Override // p132o00O0ooo.o00O000o
    public final void OooO00o(@NotNull Drawable drawable) {
        OooO0oO(drawable);
    }

    @Override // p132o00O0ooo.o00O000o
    public final void OooO0O0(@Nullable Drawable drawable) {
        OooO0oO(drawable);
    }

    @Override // p132o00O0ooo.o00O000o
    public final void OooO0OO(@Nullable Drawable drawable) {
        OooO0oO(drawable);
    }

    @Override // o00OO000.OooO0o
    @Nullable
    public abstract Drawable OooO0Oo();

    public final void OooO0o() {
        Object objOooO0Oo = OooO0Oo();
        Animatable animatable = objOooO0Oo instanceof Animatable ? (Animatable) objOooO0Oo : null;
        if (animatable == null) {
            return;
        }
        if (this.f11723OooO0Oo) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public abstract void OooO0o0(@Nullable Drawable drawable);

    public final void OooO0oO(@Nullable Drawable drawable) {
        Object objOooO0Oo = OooO0Oo();
        Animatable animatable = objOooO0Oo instanceof Animatable ? (Animatable) objOooO0Oo : null;
        if (animatable != null) {
            animatable.stop();
        }
        OooO0o0(drawable);
        OooO0o();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO00o(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO0O0(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO0OO(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO0Oo(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        this.f11723OooO0Oo = true;
        OooO0o();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        this.f11723OooO0Oo = false;
        OooO0o();
    }
}
