package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.internal.o00Oo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;
import p545o0oO0Ooo.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class BadgeDrawable extends Drawable implements o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f16288OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final WeakReference<Context> f16289OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o00Oo0 f16290OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f16291OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final Rect f16292OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final BadgeState f16293OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f16294OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f16295OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f16296OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f16297OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f16298OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f16299OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public WeakReference<FrameLayout> f16300OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @StyleRes
    public static final int f16287OooOOo0 = o0000O0O.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @AttrRes
    public static final int f16286OooOOo = o00000.badgeStyle;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(@NonNull Context context, @Nullable BadgeState.State state) {
        d1 d1Var;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f16289OooO0Oo = weakReference;
        o00oO0o.OooO0OO(context, o00oO0o.f17322OooO0O0, "Theme.MaterialComponents");
        this.f16292OooO0oO = new Rect();
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f16290OooO0o = o00oo1;
        TextPaint textPaint = o00oo1.f17313OooO00o;
        textPaint.setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, state);
        this.f16293OooO0oo = badgeState;
        boolean zOooO00o = badgeState.OooO00o();
        BadgeState.State state2 = badgeState.f16303OooO0O0;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new OooO0O0(OooO0O0.OooO00o(zOooO00o ? state2.f16319OooOO0.intValue() : state2.f16318OooO0oo.intValue(), context, badgeState.OooO00o() ? state2.f16320OooOO0O.intValue() : state2.f16313OooO.intValue())));
        this.f16291OooO0o0 = materialShapeDrawable;
        OooO0oO();
        Context context2 = weakReference.get();
        if (context2 != null && o00oo1.f17317OooO0o != (d1Var = new d1(context2, state2.f16317OooO0oO.intValue()))) {
            o00oo1.OooO0O0(d1Var, context2);
            textPaint.setColor(state2.f16315OooO0o.intValue());
            invalidateSelf();
            OooO();
            invalidateSelf();
        }
        this.f16295OooOO0O = ((int) Math.pow(10.0d, ((double) state2.f16322OooOOO) - 1.0d)) - 1;
        o00oo1.f17316OooO0Oo = true;
        OooO();
        invalidateSelf();
        o00oo1.f17316OooO0Oo = true;
        OooO0oO();
        OooO();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.f16316OooO0o0.intValue());
        if (materialShapeDrawable.f17582OooO0Oo.f17607OooO0OO != colorStateListValueOf) {
            materialShapeDrawable.OooOOO(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f16315OooO0o.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f16299OooOOOO;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f16299OooOOOO.get();
            WeakReference<FrameLayout> weakReference3 = this.f16300OooOOOo;
            OooO0oo(view, weakReference3 != null ? weakReference3.get() : null);
        }
        OooO();
        setVisible(state2.f16331OooOo00.booleanValue(), false);
    }

    public final void OooO() {
        Context context = this.f16289OooO0Oo.get();
        WeakReference<View> weakReference = this.f16299OooOOOO;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f16292OooO0oO;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference2 = this.f16300OooOOOo;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zOooO0o = OooO0o();
        BadgeState badgeState = this.f16293OooO0oo;
        float f = !zOooO0o ? badgeState.f16304OooO0OO : badgeState.f16305OooO0Oo;
        this.f16296OooOO0o = f;
        if (f != -1.0f) {
            this.f16297OooOOO = f;
            this.f16298OooOOO0 = f;
        } else {
            this.f16297OooOOO = Math.round((!OooO0o() ? badgeState.f16306OooO0o : badgeState.f16309OooO0oo) / 2.0f);
            this.f16298OooOOO0 = Math.round((!OooO0o() ? badgeState.f16307OooO0o0 : badgeState.f16308OooO0oO) / 2.0f);
        }
        if (OooO0o0() > 9) {
            this.f16298OooOOO0 = Math.max(this.f16298OooOOO0, (this.f16290OooO0o.OooO00o(OooO0O0()) / 2.0f) + badgeState.f16301OooO);
        }
        int iIntValue = OooO0o() ? badgeState.f16303OooO0O0.f16329OooOo.intValue() : badgeState.f16303OooO0O0.f16332OooOo0O.intValue();
        if (badgeState.f16312OooOO0o == 0) {
            iIntValue -= Math.round(this.f16297OooOOO);
        }
        BadgeState.State state = badgeState.f16303OooO0O0;
        int iIntValue2 = state.f16334OooOoO.intValue() + iIntValue;
        int iIntValue3 = state.f16328OooOOoo.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f16294OooOO0 = rect3.bottom - iIntValue2;
        } else {
            this.f16294OooOO0 = rect3.top + iIntValue2;
        }
        int iIntValue4 = OooO0o() ? state.f16333OooOo0o.intValue() : state.f16330OooOo0.intValue();
        if (badgeState.f16312OooOO0o == 1) {
            iIntValue4 += OooO0o() ? badgeState.f16311OooOO0O : badgeState.f16310OooOO0;
        }
        int iIntValue5 = state.f16335OooOoO0.intValue() + iIntValue4;
        int iIntValue6 = state.f16328OooOOoo.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            this.f16288OooO = ViewCompat.OooO.OooO0Oo(view) == 0 ? (rect3.left - this.f16298OooOOO0) + iIntValue5 : (rect3.right + this.f16298OooOOO0) - iIntValue5;
        } else {
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            this.f16288OooO = ViewCompat.OooO.OooO0Oo(view) == 0 ? (rect3.right + this.f16298OooOOO0) - iIntValue5 : (rect3.left - this.f16298OooOOO0) + iIntValue5;
        }
        float f2 = this.f16288OooO;
        float f3 = this.f16294OooOO0;
        float f4 = this.f16298OooOOO0;
        float f5 = this.f16297OooOOO;
        rect2.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
        float f6 = this.f16296OooOO0o;
        MaterialShapeDrawable materialShapeDrawable = this.f16291OooO0o0;
        if (f6 != -1.0f) {
            materialShapeDrawable.setShapeAppearanceModel(materialShapeDrawable.f17582OooO0Oo.f17605OooO00o.OooO0oO(f6));
        }
        if (rect.equals(rect2)) {
            return;
        }
        materialShapeDrawable.setBounds(rect2);
    }

    @Override // com.google.android.material.internal.o00Oo0.OooO0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o() {
        invalidateSelf();
    }

    @NonNull
    public final String OooO0O0() {
        int iOooO0o0 = OooO0o0();
        int i = this.f16295OooOO0O;
        BadgeState badgeState = this.f16293OooO0oo;
        if (iOooO0o0 <= i) {
            return NumberFormat.getInstance(badgeState.f16303OooO0O0.f16324OooOOOO).format(OooO0o0());
        }
        Context context = this.f16289OooO0Oo.get();
        return context == null ? "" : String.format(badgeState.f16303OooO0O0.f16324OooOOOO, context.getString(o0000O0.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f16295OooOO0O), "+");
    }

    @Nullable
    public final CharSequence OooO0OO() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zOooO0o = OooO0o();
        BadgeState badgeState = this.f16293OooO0oo;
        if (!zOooO0o) {
            return badgeState.f16303OooO0O0.f16325OooOOOo;
        }
        if (badgeState.f16303OooO0O0.f16327OooOOo0 == 0 || (context = this.f16289OooO0Oo.get()) == null) {
            return null;
        }
        int iOooO0o0 = OooO0o0();
        int i = this.f16295OooOO0O;
        BadgeState.State state = badgeState.f16303OooO0O0;
        return iOooO0o0 <= i ? context.getResources().getQuantityString(state.f16327OooOOo0, OooO0o0(), Integer.valueOf(OooO0o0())) : context.getString(state.f16326OooOOo, Integer.valueOf(i));
    }

    @Nullable
    public final FrameLayout OooO0Oo() {
        WeakReference<FrameLayout> weakReference = this.f16300OooOOOo;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean OooO0o() {
        return this.f16293OooO0oo.OooO00o();
    }

    public final int OooO0o0() {
        if (OooO0o()) {
            return this.f16293OooO0oo.f16303OooO0O0.f16323OooOOO0;
        }
        return 0;
    }

    public final void OooO0oO() {
        Context context = this.f16289OooO0Oo.get();
        if (context == null) {
            return;
        }
        BadgeState badgeState = this.f16293OooO0oo;
        boolean zOooO00o = badgeState.OooO00o();
        BadgeState.State state = badgeState.f16303OooO0O0;
        this.f16291OooO0o0.setShapeAppearanceModel(new OooO0O0(OooO0O0.OooO00o(zOooO00o ? state.f16319OooOO0.intValue() : state.f16318OooO0oo.intValue(), context, badgeState.OooO00o() ? state.f16320OooOO0O.intValue() : state.f16313OooO.intValue())));
        invalidateSelf();
    }

    public final void OooO0oo(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f16299OooOOOO = new WeakReference<>(view);
        this.f16300OooOOOo = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        OooO();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f16291OooO0o0.draw(canvas);
        if (OooO0o()) {
            Rect rect = new Rect();
            String strOooO0O0 = OooO0O0();
            o00Oo0 o00oo1 = this.f16290OooO0o;
            o00oo1.f17313OooO00o.getTextBounds(strOooO0O0, 0, strOooO0O0.length(), rect);
            canvas.drawText(strOooO0O0, this.f16288OooO, this.f16294OooOO0 + (rect.height() / 2), o00oo1.f17313OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16293OooO0oo.f16303OooO0O0.f16321OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f16292OooO0oO.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f16292OooO0oO.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.o00Oo0.OooO0O0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        BadgeState badgeState = this.f16293OooO0oo;
        badgeState.f16302OooO00o.f16321OooOO0o = i;
        badgeState.f16303OooO0O0.f16321OooOO0o = i;
        this.f16290OooO0o.f17313OooO00o.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
