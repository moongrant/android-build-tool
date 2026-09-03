package p172o00OooO0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00000<Z> extends o0000Ooo<ImageView, Z> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Animatable f38313OooO0oo;

    public o00000(ImageView imageView) {
        super(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p172o00OooO0.o00000OO
    public final void OooO0O0(@NonNull Object obj) {
        OooO0o0(obj);
        if (!(obj instanceof Animatable)) {
            this.f38313OooO0oo = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f38313OooO0oo = animatable;
        animatable.start();
    }

    @Override // p172o00OooO0.o0O0O00, p172o00OooO0.o00000OO
    public final void OooO0OO(@Nullable Drawable drawable) {
        OooO0o0(null);
        this.f38313OooO0oo = null;
        ((ImageView) this.f38319OooO0o0).setImageDrawable(drawable);
    }

    @Override // p172o00OooO0.o0000Ooo, p172o00OooO0.o0O0O00, p172o00OooO0.o00000OO
    public final void OooO0Oo(@Nullable Drawable drawable) {
        super.OooO0Oo(drawable);
        Animatable animatable = this.f38313OooO0oo;
        if (animatable != null) {
            animatable.stop();
        }
        OooO0o0(null);
        this.f38313OooO0oo = null;
        ((ImageView) this.f38319OooO0o0).setImageDrawable(drawable);
    }

    public abstract void OooO0o0(@Nullable Z z);

    @Override // p172o00OooO0.o00000OO
    public final void OooOO0O(@Nullable Drawable drawable) {
        OooO0o0(null);
        this.f38313OooO0oo = null;
        ((ImageView) this.f38319OooO0o0).setImageDrawable(drawable);
    }

    @Override // p172o00OooO0.o0O0O00, com.bumptech.glide.manager.OooOo00
    public final void onStart() {
        Animatable animatable = this.f38313OooO0oo;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p172o00OooO0.o0O0O00, com.bumptech.glide.manager.OooOo00
    public final void onStop() {
        Animatable animatable = this.f38313OooO0oo;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
