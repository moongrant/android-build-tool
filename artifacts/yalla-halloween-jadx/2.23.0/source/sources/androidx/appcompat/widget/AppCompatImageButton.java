package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f2832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f2833OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo f2834OooO0o0;

    public AppCompatImageButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO oooO = this.f2832OooO0Oo;
        if (oooO != null) {
            oooO.OooO00o();
        }
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo != null) {
            oooOo.OooO00o();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO oooO = this.f2832OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.f2832OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        o000O000 o000o001;
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo == null || (o000o001 = oooOo.f2993OooO0O0) == null) {
            return null;
        }
        return o000o001.f3265OooO00o;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        o000O000 o000o001;
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo == null || (o000o001 = oooOo.f2993OooO0O0) == null) {
            return null;
        }
        return o000o001.f3266OooO0O0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.f2834OooO0o0.f2992OooO00o.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO oooO = this.f2832OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.f2832OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo != null) {
            oooOo.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo != null && drawable != null && !this.f2833OooO0o) {
            oooOo.f2994OooO0OO = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (oooOo != null) {
            oooOo.OooO00o();
            if (this.f2833OooO0o) {
                return;
            }
            ImageView imageView = oooOo.f2992OooO00o;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(oooOo.f2994OooO0OO);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f2833OooO0o = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.f2834OooO0o0.OooO0OO(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo != null) {
            oooOo.OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f2832OooO0Oo;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f2832OooO0Oo;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo != null) {
            if (oooOo.f2993OooO0O0 == null) {
                oooOo.f2993OooO0O0 = new o000O000();
            }
            o000O000 o000o001 = oooOo.f2993OooO0O0;
            o000o001.f3265OooO00o = colorStateList;
            o000o001.f3268OooO0Oo = true;
            oooOo.OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        OooOo oooOo = this.f2834OooO0o0;
        if (oooOo != null) {
            if (oooOo.f2993OooO0O0 == null) {
                oooOo.f2993OooO0O0 = new o000O000();
            }
            o000O000 o000o001 = oooOo.f2993OooO0O0;
            o000o001.f3266OooO0O0 = mode;
            o000o001.f3267OooO0OO = true;
            oooOo.OooO00o();
        }
    }

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000.OooO00o(context);
        this.f2833OooO0o = false;
        o0000O.OooO00o(getContext(), this);
        OooO oooO = new OooO(this);
        this.f2832OooO0Oo = oooO;
        oooO.OooO0Oo(attributeSet, i);
        OooOo oooOo = new OooOo(this);
        this.f2834OooO0o0 = oooOo;
        oooOo.OooO0O0(attributeSet, i);
    }
}
