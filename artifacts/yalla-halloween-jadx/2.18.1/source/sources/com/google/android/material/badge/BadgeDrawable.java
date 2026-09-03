package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.OooOo;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class BadgeDrawable extends Drawable implements OooOo.OooO0O0 {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @StyleRes
    public static final int f16477OoooOoO = Oooo000.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @AttrRes
    public static final int f16478OoooOoo = OooO0o.badgeStyle;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public final Rect f16479Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final WeakReference<Context> f16480Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f16481Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final OooOo f16482Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f16483OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f16484OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NonNull
    public final BadgeState f16485OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f16486OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f16487OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f16488OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f16489OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public WeakReference<FrameLayout> f16490OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f16491o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(@NonNull Context context, @Nullable BadgeState.State state) {
        o0OOO0O.OooO0o oooO0o;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f16480Oooo0o = weakReference;
        o000oOoO.OooO0OO(context, o000oOoO.f17356OooO0O0, "Theme.MaterialComponents");
        this.f16479Oooo = new Rect();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f16481Oooo0oO = materialShapeDrawable;
        OooOo oooOo = new OooOo(this);
        this.f16482Oooo0oo = oooOo;
        oooOo.f17324OooO00o.setTextAlign(Paint.Align.CENTER);
        int i = Oooo000.TextAppearance_MaterialComponents_Badge;
        Context context3 = weakReference.get();
        if (context3 != null && oooOo.f17328OooO0o != (oooO0o = new o0OOO0O.OooO0o(context3, i)) && (context2 = weakReference.get()) != null) {
            oooOo.OooO0O0(oooO0o, context2);
            OooO0oo();
        }
        BadgeState badgeState = new BadgeState(context, state);
        this.f16485OoooO00 = badgeState;
        this.f16483OoooO = ((int) Math.pow(10.0d, ((double) badgeState.f16493OooO0O0.f16502OoooO0) - 1.0d)) - 1;
        oooOo.f17327OooO0Oo = true;
        OooO0oo();
        invalidateSelf();
        oooOo.f17327OooO0Oo = true;
        OooO0oo();
        invalidateSelf();
        oooOo.f17324OooO00o.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState.f16493OooO0O0.f16499Oooo0oO.intValue());
        if (materialShapeDrawable.f17510Oooo0o.f17536OooO0OO != colorStateListValueOf) {
            materialShapeDrawable.OooOOOo(colorStateListValueOf);
            invalidateSelf();
        }
        oooOo.f17324OooO00o.setColor(badgeState.f16493OooO0O0.f16500Oooo0oo.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f16489OoooOOo;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f16489OoooOOo.get();
            WeakReference<FrameLayout> weakReference3 = this.f16490OoooOo0;
            OooO0oO(view, weakReference3 != null ? weakReference3.get() : null);
        }
        OooO0oo();
        setVisible(badgeState.f16493OooO0O0.f16507OoooOOo.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.OooOo.OooO0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o() {
        invalidateSelf();
    }

    @NonNull
    public final String OooO0O0() {
        if (OooO0o0() <= this.f16483OoooO) {
            return NumberFormat.getInstance(this.f16485OoooO00.f16493OooO0O0.f16504OoooO0O).format(OooO0o0());
        }
        Context context = this.f16480Oooo0o.get();
        return context == null ? "" : String.format(this.f16485OoooO00.f16493OooO0O0.f16504OoooO0O, context.getString(p337o0OO0o0.OooOo.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f16483OoooO), "+");
    }

    @Nullable
    public final CharSequence OooO0OO() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!OooO0o()) {
            return this.f16485OoooO00.f16493OooO0O0.f16501OoooO;
        }
        if (this.f16485OoooO00.f16493OooO0O0.f16505OoooOO0 == 0 || (context = this.f16480Oooo0o.get()) == null) {
            return null;
        }
        int iOooO0o0 = OooO0o0();
        int i = this.f16483OoooO;
        return iOooO0o0 <= i ? context.getResources().getQuantityString(this.f16485OoooO00.f16493OooO0O0.f16505OoooOO0, OooO0o0(), Integer.valueOf(OooO0o0())) : context.getString(this.f16485OoooO00.f16493OooO0O0.f16514o000oOoO, Integer.valueOf(i));
    }

    @Nullable
    public final FrameLayout OooO0Oo() {
        WeakReference<FrameLayout> weakReference = this.f16490OoooOo0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean OooO0o() {
        return this.f16485OoooO00.f16493OooO0O0.f16503OoooO00 != -1;
    }

    public final int OooO0o0() {
        if (OooO0o()) {
            return this.f16485OoooO00.f16493OooO0O0.f16503OoooO00;
        }
        return 0;
    }

    public final void OooO0oO(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f16489OoooOOo = new WeakReference<>(view);
        this.f16490OoooOo0 = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        OooO0oo();
        invalidateSelf();
    }

    public final void OooO0oo() {
        Context context = this.f16480Oooo0o.get();
        WeakReference<View> weakReference = this.f16489OoooOOo;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f16479Oooo);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f16490OoooOo0;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        int iIntValue = this.f16485OoooO00.f16493OooO0O0.f16513OooooO0.intValue() + (OooO0o() ? this.f16485OoooO00.f16493OooO0O0.f16511Ooooo00.intValue() : this.f16485OoooO00.f16493OooO0O0.f16509OoooOoO.intValue());
        int iIntValue2 = this.f16485OoooO00.f16493OooO0O0.f16506OoooOOO.intValue();
        if (iIntValue2 == 8388691 || iIntValue2 == 8388693) {
            this.f16486OoooO0O = rect2.bottom - iIntValue;
        } else {
            this.f16486OoooO0O = rect2.top + iIntValue;
        }
        if (OooO0o0() <= 9) {
            float f = !OooO0o() ? this.f16485OoooO00.f16494OooO0OO : this.f16485OoooO00.f16495OooO0Oo;
            this.f16487OoooOO0 = f;
            this.f16488OoooOOO = f;
            this.f16491o000oOoO = f;
        } else {
            float f2 = this.f16485OoooO00.f16495OooO0Oo;
            this.f16487OoooOO0 = f2;
            this.f16488OoooOOO = f2;
            this.f16491o000oOoO = (this.f16482Oooo0oo.OooO00o(OooO0O0()) / 2.0f) + this.f16485OoooO00.f16496OooO0o0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(OooO0o() ? OooOO0.mtrl_badge_text_horizontal_edge_offset : OooOO0.mtrl_badge_horizontal_edge_offset);
        int iIntValue3 = this.f16485OoooO00.f16493OooO0O0.f16512Ooooo0o.intValue() + (OooO0o() ? this.f16485OoooO00.f16493OooO0O0.f16510OoooOoo.intValue() : this.f16485OoooO00.f16493OooO0O0.f16508OoooOo0.intValue());
        int iIntValue4 = this.f16485OoooO00.f16493OooO0O0.f16506OoooOOO.intValue();
        if (iIntValue4 == 8388659 || iIntValue4 == 8388691) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            this.f16484OoooO0 = ViewCompat.OooO.OooO0Oo(view) == 0 ? (rect2.left - this.f16491o000oOoO) + dimensionPixelSize + iIntValue3 : ((rect2.right + this.f16491o000oOoO) - dimensionPixelSize) - iIntValue3;
        } else {
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            this.f16484OoooO0 = ViewCompat.OooO.OooO0Oo(view) == 0 ? ((rect2.right + this.f16491o000oOoO) - dimensionPixelSize) - iIntValue3 : (rect2.left - this.f16491o000oOoO) + dimensionPixelSize + iIntValue3;
        }
        Rect rect3 = this.f16479Oooo;
        float f3 = this.f16484OoooO0;
        float f4 = this.f16486OoooO0O;
        float f5 = this.f16491o000oOoO;
        float f6 = this.f16488OoooOOO;
        rect3.set((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
        MaterialShapeDrawable materialShapeDrawable = this.f16481Oooo0oO;
        materialShapeDrawable.setShapeAppearanceModel(materialShapeDrawable.f17510Oooo0o.f17534OooO00o.OooO0oO(this.f16487OoooOO0));
        if (rect.equals(this.f16479Oooo)) {
            return;
        }
        this.f16481Oooo0oO.setBounds(this.f16479Oooo);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f16481Oooo0oO.draw(canvas);
        if (OooO0o()) {
            Rect rect = new Rect();
            String strOooO0O0 = OooO0O0();
            this.f16482Oooo0oo.f17324OooO00o.getTextBounds(strOooO0O0, 0, strOooO0O0.length(), rect);
            canvas.drawText(strOooO0O0, this.f16484OoooO0, this.f16486OoooO0O + (rect.height() / 2), this.f16482Oooo0oo.f17324OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16485OoooO00.f16493OooO0O0.f16497Oooo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f16479Oooo.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f16479Oooo.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.OooOo.OooO0O0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        BadgeState badgeState = this.f16485OoooO00;
        badgeState.f16492OooO00o.f16497Oooo = i;
        badgeState.f16493OooO0O0.f16497Oooo = i;
        this.f16482Oooo0oo.f17324OooO00o.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
