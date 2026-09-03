package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final OooO mBackgroundTintHelper;
    private boolean mHasLevel;
    private final OooOo mImageHelper;

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        OooO oooO = this.mBackgroundTintHelper;
        if (oooO != null) {
            oooO.OooO00o();
        }
        OooOo oooOo = this.mImageHelper;
        if (oooOo != null) {
            oooOo.OooO00o();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO oooO = this.mBackgroundTintHelper;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.mBackgroundTintHelper;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        o000O000 o000o001;
        OooOo oooOo = this.mImageHelper;
        if (oooOo == null || (o000o001 = oooOo.f2993OooO0O0) == null) {
            return null;
        }
        return o000o001.f3265OooO00o;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        o000O000 o000o001;
        OooOo oooOo = this.mImageHelper;
        if (oooOo == null || (o000o001 = oooOo.f2993OooO0O0) == null) {
            return null;
        }
        return o000o001.f3266OooO0O0;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.mImageHelper.f2992OooO00o.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO oooO = this.mBackgroundTintHelper;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.mBackgroundTintHelper;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        OooOo oooOo = this.mImageHelper;
        if (oooOo != null) {
            oooOo.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        OooOo oooOo = this.mImageHelper;
        if (oooOo != null && drawable != null && !this.mHasLevel) {
            oooOo.f2994OooO0OO = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        OooOo oooOo2 = this.mImageHelper;
        if (oooOo2 != null) {
            oooOo2.OooO00o();
            if (this.mHasLevel) {
                return;
            }
            OooOo oooOo3 = this.mImageHelper;
            ImageView imageView = oooOo3.f2992OooO00o;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(oooOo3.f2994OooO0OO);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        OooOo oooOo = this.mImageHelper;
        if (oooOo != null) {
            oooOo.OooO0OO(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        OooOo oooOo = this.mImageHelper;
        if (oooOo != null) {
            oooOo.OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.mBackgroundTintHelper;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.mBackgroundTintHelper;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        OooOo oooOo = this.mImageHelper;
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
        OooOo oooOo = this.mImageHelper;
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

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000.OooO00o(context);
        this.mHasLevel = false;
        o0000O.OooO00o(getContext(), this);
        OooO oooO = new OooO(this);
        this.mBackgroundTintHelper = oooO;
        oooO.OooO0Oo(attributeSet, i);
        OooOo oooOo = new OooOo(this);
        this.mImageHelper = oooOo;
        oooOo.OooO0O0(attributeSet, i);
    }
}
