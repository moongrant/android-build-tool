package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ImageView f2990OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000O000 f2991OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f2992OooO0OO = 0;

    public OooOo(@NonNull ImageView imageView) {
        this.f2990OooO00o = imageView;
    }

    public final void OooO00o() {
        o000O000 o000o001;
        ImageView imageView = this.f2990OooO00o;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            o000000.OooO00o(drawable);
        }
        if (drawable == null || (o000o001 = this.f2991OooO0O0) == null) {
            return;
        }
        OooOOO0.OooO0o0(drawable, o000o001, imageView.getDrawableState());
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        int iOooO;
        ImageView imageView = this.f2990OooO00o;
        Context context = imageView.getContext();
        int[] iArr = p012OooOo0O.o00O0O.AppCompatImageView;
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(context, attributeSet, iArr, i);
        ViewCompat.OooOOO(imageView, imageView.getContext(), iArr, attributeSet, o000oo0OooOOO0.f3324OooO0O0, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iOooO = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = p013OooOo0o.o00Oo0.OooO00o(imageView.getContext(), iOooO)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                o000000.OooO00o(drawable);
            }
            int i2 = p012OooOo0O.o00O0O.AppCompatImageView_tint;
            if (o000oo0OooOOO0.OooOO0o(i2)) {
                androidx.core.widget.OooOO0.OooO0OO(imageView, o000oo0OooOOO0.OooO0O0(i2));
            }
            int i3 = p012OooOo0O.o00O0O.AppCompatImageView_tintMode;
            if (o000oo0OooOOO0.OooOO0o(i3)) {
                androidx.core.widget.OooOO0.OooO0Oo(imageView, o000000.OooO0OO(o000oo0OooOOO0.OooO0oo(i3, -1), null));
            }
        } finally {
            o000oo0OooOOO0.OooOOO();
        }
    }

    public final void OooO0OO(int i) {
        ImageView imageView = this.f2990OooO00o;
        if (i != 0) {
            Drawable drawableOooO00o = p013OooOo0o.o00Oo0.OooO00o(imageView.getContext(), i);
            if (drawableOooO00o != null) {
                o000000.OooO00o(drawableOooO00o);
            }
            imageView.setImageDrawable(drawableOooO00o);
        } else {
            imageView.setImageDrawable(null);
        }
        OooO00o();
    }
}
