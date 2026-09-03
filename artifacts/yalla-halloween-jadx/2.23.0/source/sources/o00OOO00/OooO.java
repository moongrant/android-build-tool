package o00OOO00;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO<Z> extends OooOOO<ImageView, Z> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Animatable f37332OooO0oo;

    public OooO(ImageView imageView) {
        super(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OOO00.OooOOO0
    public final void OooO0OO(@NonNull Object obj) {
        OooO0oO(obj);
        if (!(obj instanceof Animatable)) {
            this.f37332OooO0oo = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f37332OooO0oo = animatable;
        animatable.start();
    }

    @Override // o00OOO00.OooOOO, o00OOO00.OooO00o, o00OOO00.OooOOO0
    public final void OooO0o(@Nullable Drawable drawable) {
        super.OooO0o(drawable);
        Animatable animatable = this.f37332OooO0oo;
        if (animatable != null) {
            animatable.stop();
        }
        OooO0oO(null);
        this.f37332OooO0oo = null;
        ((ImageView) this.f37339OooO0o0).setImageDrawable(drawable);
    }

    @Override // o00OOO00.OooO00o, o00OOO00.OooOOO0
    public final void OooO0o0(@Nullable Drawable drawable) {
        OooO0oO(null);
        this.f37332OooO0oo = null;
        ((ImageView) this.f37339OooO0o0).setImageDrawable(drawable);
    }

    public abstract void OooO0oO(@Nullable Z z);

    @Override // o00OOO00.OooOOO0
    public final void OooOO0O(@Nullable Drawable drawable) {
        OooO0oO(null);
        this.f37332OooO0oo = null;
        ((ImageView) this.f37339OooO0o0).setImageDrawable(drawable);
    }

    @Override // o00OOO00.OooO00o, com.bumptech.glide.manager.Oooo000
    public final void onStart() {
        Animatable animatable = this.f37332OooO0oo;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // o00OOO00.OooO00o, com.bumptech.glide.manager.Oooo000
    public final void onStop() {
        Animatable animatable = this.f37332OooO0oo;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
