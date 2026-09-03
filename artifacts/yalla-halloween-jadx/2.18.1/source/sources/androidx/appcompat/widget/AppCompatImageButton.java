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
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f4938Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooOo00 f4939Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f4940Oooo0oo;

    public AppCompatImageButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO0o oooO0o = this.f4938Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 != null) {
            oooOo00.OooO00o();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO0o oooO0o = this.f4938Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO0o oooO0o = this.f4938Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        o0000O00 o0000o00;
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 == null || (o0000o00 = oooOo00.f5104OooO0O0) == null) {
            return null;
        }
        return o0000o00.f5369OooO00o;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        o0000O00 o0000o00;
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 == null || (o0000o00 = oooOo00.f5104OooO0O0) == null) {
            return null;
        }
        return o0000o00.f5370OooO0O0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.f4939Oooo0oO.f5103OooO00o.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO0o oooO0o = this.f4938Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO0o oooO0o = this.f4938Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 != null) {
            oooOo00.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 != null && drawable != null && !this.f4940Oooo0oo) {
            Objects.requireNonNull(oooOo00);
            oooOo00.f5106OooO0Oo = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        OooOo00 oooOo01 = this.f4939Oooo0oO;
        if (oooOo01 != null) {
            oooOo01.OooO00o();
            if (this.f4940Oooo0oo) {
                return;
            }
            OooOo00 oooOo02 = this.f4939Oooo0oO;
            if (oooOo02.f5103OooO00o.getDrawable() != null) {
                oooOo02.f5103OooO00o.getDrawable().setLevel(oooOo02.f5106OooO0Oo);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f4940Oooo0oo = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        this.f4939Oooo0oO.OooO0OO(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 != null) {
            oooOo00.OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO0o oooO0o = this.f4938Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0o oooO0o = this.f4938Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 != null) {
            oooOo00.OooO0Oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        OooOo00 oooOo00 = this.f4939Oooo0oO;
        if (oooOo00 != null) {
            oooOo00.OooO0o0(mode);
        }
    }

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0000.OooO00o(context);
        this.f4940Oooo0oo = false;
        o00000OO.OooO00o(this, getContext());
        OooO0o oooO0o = new OooO0o(this);
        this.f4938Oooo0o = oooO0o;
        oooO0o.OooO0Oo(attributeSet, i);
        OooOo00 oooOo00 = new OooOo00(this);
        this.f4939Oooo0oO = oooOo00;
        oooOo00.OooO0O0(attributeSet, i);
    }
}
