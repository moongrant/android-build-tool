package o0OOO0OO;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.MaterialShapeDrawable;
import p084o000Ooo.o0Oo0oo;
import p347o0OOO0o0.o00000;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o extends Drawable implements o00000, o0Oo0oo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f38126Oooo0o;

    public OooO00o(com.google.android.material.shape.OooO00o oooO00o) {
        this.f38126Oooo0o = new OooO0O0(new MaterialShapeDrawable(oooO00o));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        OooO0O0 oooO0O0 = this.f38126Oooo0o;
        if (oooO0O0.f38128OooO0O0) {
            oooO0O0.f38127OooO00o.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f38126Oooo0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f38126Oooo0o.f38127OooO00o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.f38126Oooo0o = new OooO0O0(this.f38126Oooo0o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f38126Oooo0o.f38127OooO00o.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f38126Oooo0o.f38127OooO00o.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zOooO0Oo = o0OOO0OO.OooO0O0.OooO0Oo(iArr);
        OooO0O0 oooO0O0 = this.f38126Oooo0o;
        if (oooO0O0.f38128OooO0O0 == zOooO0Oo) {
            return zOnStateChange;
        }
        oooO0O0.f38128OooO0O0 = zOooO0Oo;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f38126Oooo0o.f38127OooO00o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f38126Oooo0o.f38127OooO00o.setColorFilter(colorFilter);
    }

    @Override // p347o0OOO0o0.o00000
    public final void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f38126Oooo0o.f38127OooO00o.setShapeAppearanceModel(oooO00o);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        this.f38126Oooo0o.f38127OooO00o.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        this.f38126Oooo0o.f38127OooO00o.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f38126Oooo0o.f38127OooO00o.setTintMode(mode);
    }

    public static final class OooO0O0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public MaterialShapeDrawable f38127OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f38128OooO0O0;

        public OooO0O0(MaterialShapeDrawable materialShapeDrawable) {
            this.f38127OooO00o = materialShapeDrawable;
            this.f38128OooO0O0 = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new OooO00o(new OooO0O0(this), null);
        }

        public OooO0O0(@NonNull OooO0O0 oooO0O0) {
            this.f38127OooO00o = (MaterialShapeDrawable) oooO0O0.f38127OooO00o.f17510Oooo0o.newDrawable();
            this.f38128OooO0O0 = oooO0O0.f38128OooO0O0;
        }
    }

    public OooO00o(OooO0O0 oooO0O0, C0375OooO00o c0375OooO00o) {
        this.f38126Oooo0o = oooO0O0;
    }
}
