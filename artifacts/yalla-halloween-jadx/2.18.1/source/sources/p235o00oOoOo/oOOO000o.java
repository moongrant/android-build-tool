package p235o00oOoOo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p237o00oOoo0.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class oOOO000o<Z> extends oOOO0OO0<ImageView, Z> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Animatable f34016Oooo;

    public oOOO000o(ImageView imageView) {
        super(imageView);
    }

    public final void OooO00o(Drawable drawable) {
        ((ImageView) this.f34018Oooo0o).setImageDrawable(drawable);
    }

    public abstract void OooO0O0(@Nullable Z z);

    public final void OooO0OO(@Nullable Z z) {
        OooO0O0(z);
        if (!(z instanceof Animatable)) {
            this.f34016Oooo = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f34016Oooo = animatable;
        animatable.start();
    }

    @Override // p235o00oOoOo.oOOO0OO0, p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    public final void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f34016Oooo;
        if (animatable != null) {
            animatable.stop();
        }
        OooO0OO(null);
        OooO00o(drawable);
    }

    @Override // p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    public final void onLoadFailed(@Nullable Drawable drawable) {
        super.onLoadFailed(drawable);
        OooO0OO(null);
        OooO00o(drawable);
    }

    @Override // p235o00oOoOo.oOOO0OO0, p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    public final void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        OooO0OO(null);
        OooO00o(drawable);
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public final void onResourceReady(@NonNull Z z, @Nullable o0O000Oo<? super Z> o0o000oo2) {
        OooO0OO(z);
    }

    @Override // p235o00oOoOo.oOO0Oo00, p231o00oOo0o.o0OO00O
    public final void onStart() {
        Animatable animatable = this.f34016Oooo;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p235o00oOoOo.oOO0Oo00, p231o00oOo0o.o0OO00O
    public final void onStop() {
        Animatable animatable = this.f34016Oooo;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
