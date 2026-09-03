package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ImageView f5103OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0000O00 f5104OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000O00 f5105OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f5106OooO0Oo = 0;

    public OooOo00(@NonNull ImageView imageView) {
        this.f5103OooO00o = imageView;
    }

    public final void OooO00o() {
        Drawable drawable = this.f5103OooO00o.getDrawable();
        if (drawable != null) {
            o0ooOOo.OooO00o(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f5105OooO0OO == null) {
                    this.f5105OooO0OO = new o0000O00();
                }
                o0000O00 o0000o00 = this.f5105OooO0OO;
                o0000o00.f5369OooO00o = null;
                o0000o00.f5372OooO0Oo = false;
                o0000o00.f5370OooO0O0 = null;
                o0000o00.f5371OooO0OO = false;
                ColorStateList colorStateListOooO00o = androidx.core.widget.OooOO0O.OooO00o(this.f5103OooO00o);
                if (colorStateListOooO00o != null) {
                    o0000o00.f5372OooO0Oo = true;
                    o0000o00.f5369OooO00o = colorStateListOooO00o;
                }
                PorterDuff.Mode modeOooO0O0 = androidx.core.widget.OooOO0O.OooO0O0(this.f5103OooO00o);
                if (modeOooO0O0 != null) {
                    o0000o00.f5371OooO0OO = true;
                    o0000o00.f5370OooO0O0 = modeOooO0O0;
                }
                if (o0000o00.f5372OooO0Oo || o0000o00.f5371OooO0OO) {
                    OooOO0O.OooO0o(drawable, o0000o00, this.f5103OooO00o.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            o0000O00 o0000o01 = this.f5104OooO0O0;
            if (o0000o01 != null) {
                OooOO0O.OooO0o(drawable, o0000o01, this.f5103OooO00o.getDrawableState());
            }
        }
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int iOooOOO0;
        Context context = this.f5103OooO00o.getContext();
        int[] iArr = OooOo00.OooOOOO.AppCompatImageView;
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(context, attributeSet, iArr, i);
        ImageView imageView = this.f5103OooO00o;
        ViewCompat.OooOo0O(imageView, imageView.getContext(), iArr, attributeSet, o0000o0OooOOo.f5367OooO0O0, i);
        try {
            Drawable drawable3 = this.f5103OooO00o.getDrawable();
            if (drawable3 == null && (iOooOOO0 = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.AppCompatImageView_srcCompat, -1)) != -1 && (drawable3 = p012OooOo0.OooOO0O.OooO0O0(this.f5103OooO00o.getContext(), iOooOOO0)) != null) {
                this.f5103OooO00o.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                o0ooOOo.OooO00o(drawable3);
            }
            int i2 = OooOo00.OooOOOO.AppCompatImageView_tint;
            if (o0000o0OooOOo.OooOOOo(i2)) {
                ImageView imageView2 = this.f5103OooO00o;
                ColorStateList colorStateListOooO0OO = o0000o0OooOOo.OooO0OO(i2);
                int i3 = Build.VERSION.SDK_INT;
                androidx.core.widget.OooOO0O.OooO0OO(imageView2, colorStateListOooO0OO);
                if (i3 == 21 && (drawable2 = imageView2.getDrawable()) != null && androidx.core.widget.OooOO0O.OooO00o(imageView2) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            int i4 = OooOo00.OooOOOO.AppCompatImageView_tintMode;
            if (o0000o0OooOOo.OooOOOo(i4)) {
                ImageView imageView3 = this.f5103OooO00o;
                PorterDuff.Mode modeOooO0Oo = o0ooOOo.OooO0Oo(o0000o0OooOOo.OooOO0(i4, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                androidx.core.widget.OooOO0O.OooO0Oo(imageView3, modeOooO0Oo);
                if (i5 == 21 && (drawable = imageView3.getDrawable()) != null && androidx.core.widget.OooOO0O.OooO00o(imageView3) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
        } finally {
            o0000o0OooOOo.OooOOoo();
        }
    }

    public final void OooO0OO(int i) {
        if (i != 0) {
            Drawable drawableOooO0O0 = p012OooOo0.OooOO0O.OooO0O0(this.f5103OooO00o.getContext(), i);
            if (drawableOooO0O0 != null) {
                o0ooOOo.OooO00o(drawableOooO0O0);
            }
            this.f5103OooO00o.setImageDrawable(drawableOooO0O0);
        } else {
            this.f5103OooO00o.setImageDrawable(null);
        }
        OooO00o();
    }

    public final void OooO0Oo(ColorStateList colorStateList) {
        if (this.f5104OooO0O0 == null) {
            this.f5104OooO0O0 = new o0000O00();
        }
        o0000O00 o0000o00 = this.f5104OooO0O0;
        o0000o00.f5369OooO00o = colorStateList;
        o0000o00.f5372OooO0Oo = true;
        OooO00o();
    }

    public final void OooO0o0(PorterDuff.Mode mode) {
        if (this.f5104OooO0O0 == null) {
            this.f5104OooO0O0 = new o0000O00();
        }
        o0000O00 o0000o00 = this.f5104OooO0O0;
        o0000o00.f5370OooO0O0 = mode;
        o0000o00.f5371OooO0OO = true;
        OooO00o();
    }
}
