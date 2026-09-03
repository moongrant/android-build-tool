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
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.o00Oo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O0O;
import p276o0O00OoO.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class BadgeDrawable extends Drawable implements o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f15816OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final WeakReference<Context> f15817OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o00Oo0 f15818OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f15819OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final Rect f15820OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final BadgeState f15821OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f15822OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f15823OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f15824OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f15825OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f15826OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f15827OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public WeakReference<FrameLayout> f15828OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @StyleRes
    public static final int f15815OooOOo0 = o0000O0O.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @AttrRes
    public static final int f15814OooOOo = o00000.badgeStyle;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(@NonNull Context context, @Nullable BadgeState.State state) {
        OooO oooO;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f15817OooO0Oo = weakReference;
        o00oO0o.OooO0OO(context, o00oO0o.f16849OooO0O0, "Theme.MaterialComponents");
        this.f15820OooO0oO = new Rect();
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f15818OooO0o = o00oo1;
        TextPaint textPaint = o00oo1.f16840OooO00o;
        textPaint.setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, state);
        this.f15821OooO0oo = badgeState;
        boolean zOooO00o = badgeState.OooO00o();
        BadgeState.State state2 = badgeState.f15831OooO0O0;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new OooO0O0(OooO0O0.OooO00o(zOooO00o ? state2.f15847OooOO0.intValue() : state2.f15846OooO0oo.intValue(), context, badgeState.OooO00o() ? state2.f15848OooOO0O.intValue() : state2.f15841OooO.intValue())));
        this.f15819OooO0o0 = materialShapeDrawable;
        OooO0oO();
        Context context2 = weakReference.get();
        if (context2 != null && o00oo1.f16844OooO0o != (oooO = new OooO(context2, state2.f15845OooO0oO.intValue()))) {
            o00oo1.OooO0O0(oooO, context2);
            textPaint.setColor(state2.f15843OooO0o.intValue());
            invalidateSelf();
            OooO();
            invalidateSelf();
        }
        this.f15823OooOO0O = ((int) Math.pow(10.0d, ((double) state2.f15850OooOOO) - 1.0d)) - 1;
        o00oo1.f16843OooO0Oo = true;
        OooO();
        invalidateSelf();
        o00oo1.f16843OooO0Oo = true;
        OooO0oO();
        OooO();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.f15844OooO0o0.intValue());
        if (materialShapeDrawable.f17105OooO0Oo.f17130OooO0OO != colorStateListValueOf) {
            materialShapeDrawable.OooOOO(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f15843OooO0o.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f15827OooOOOO;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f15827OooOOOO.get();
            WeakReference<FrameLayout> weakReference3 = this.f15828OooOOOo;
            OooO0oo(view, weakReference3 != null ? weakReference3.get() : null);
        }
        OooO();
        setVisible(state2.f15859OooOo00.booleanValue(), false);
    }

    public final void OooO() {
        Context context = this.f15817OooO0Oo.get();
        WeakReference<View> weakReference = this.f15827OooOOOO;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f15820OooO0oO;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference2 = this.f15828OooOOOo;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zOooO0o = OooO0o();
        BadgeState badgeState = this.f15821OooO0oo;
        float f = !zOooO0o ? badgeState.f15832OooO0OO : badgeState.f15833OooO0Oo;
        this.f15824OooOO0o = f;
        if (f != -1.0f) {
            this.f15825OooOOO = f;
            this.f15826OooOOO0 = f;
        } else {
            this.f15825OooOOO = Math.round((!OooO0o() ? badgeState.f15834OooO0o : badgeState.f15837OooO0oo) / 2.0f);
            this.f15826OooOOO0 = Math.round((!OooO0o() ? badgeState.f15835OooO0o0 : badgeState.f15836OooO0oO) / 2.0f);
        }
        if (OooO0o0() > 9) {
            this.f15826OooOOO0 = Math.max(this.f15826OooOOO0, (this.f15818OooO0o.OooO00o(OooO0O0()) / 2.0f) + badgeState.f15829OooO);
        }
        int iIntValue = OooO0o() ? badgeState.f15831OooO0O0.f15857OooOo.intValue() : badgeState.f15831OooO0O0.f15860OooOo0O.intValue();
        if (badgeState.f15840OooOO0o == 0) {
            iIntValue -= Math.round(this.f15825OooOOO);
        }
        BadgeState.State state = badgeState.f15831OooO0O0;
        int iIntValue2 = state.f15862OooOoO.intValue() + iIntValue;
        int iIntValue3 = state.f15856OooOOoo.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f15822OooOO0 = rect3.bottom - iIntValue2;
        } else {
            this.f15822OooOO0 = rect3.top + iIntValue2;
        }
        int iIntValue4 = OooO0o() ? state.f15861OooOo0o.intValue() : state.f15858OooOo0.intValue();
        if (badgeState.f15840OooOO0o == 1) {
            iIntValue4 += OooO0o() ? badgeState.f15839OooOO0O : badgeState.f15838OooOO0;
        }
        int iIntValue5 = state.f15863OooOoO0.intValue() + iIntValue4;
        int iIntValue6 = state.f15856OooOOoo.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            this.f15816OooO = ViewCompat.OooO.OooO0Oo(view) == 0 ? (rect3.left - this.f15826OooOOO0) + iIntValue5 : (rect3.right + this.f15826OooOOO0) - iIntValue5;
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            this.f15816OooO = ViewCompat.OooO.OooO0Oo(view) == 0 ? (rect3.right + this.f15826OooOOO0) - iIntValue5 : (rect3.left - this.f15826OooOOO0) + iIntValue5;
        }
        float f2 = this.f15816OooO;
        float f3 = this.f15822OooOO0;
        float f4 = this.f15826OooOOO0;
        float f5 = this.f15825OooOOO;
        rect2.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
        float f6 = this.f15824OooOO0o;
        MaterialShapeDrawable materialShapeDrawable = this.f15819OooO0o0;
        if (f6 != -1.0f) {
            materialShapeDrawable.setShapeAppearanceModel(materialShapeDrawable.f17105OooO0Oo.f17128OooO00o.OooO0oO(f6));
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
        int i = this.f15823OooOO0O;
        BadgeState badgeState = this.f15821OooO0oo;
        if (iOooO0o0 <= i) {
            return NumberFormat.getInstance(badgeState.f15831OooO0O0.f15852OooOOOO).format(OooO0o0());
        }
        Context context = this.f15817OooO0Oo.get();
        return context == null ? "" : String.format(badgeState.f15831OooO0O0.f15852OooOOOO, context.getString(o0000O0.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f15823OooOO0O), "+");
    }

    @Nullable
    public final CharSequence OooO0OO() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zOooO0o = OooO0o();
        BadgeState badgeState = this.f15821OooO0oo;
        if (!zOooO0o) {
            return badgeState.f15831OooO0O0.f15853OooOOOo;
        }
        if (badgeState.f15831OooO0O0.f15855OooOOo0 == 0 || (context = this.f15817OooO0Oo.get()) == null) {
            return null;
        }
        int iOooO0o0 = OooO0o0();
        int i = this.f15823OooOO0O;
        BadgeState.State state = badgeState.f15831OooO0O0;
        return iOooO0o0 <= i ? context.getResources().getQuantityString(state.f15855OooOOo0, OooO0o0(), Integer.valueOf(OooO0o0())) : context.getString(state.f15854OooOOo, Integer.valueOf(i));
    }

    @Nullable
    public final FrameLayout OooO0Oo() {
        WeakReference<FrameLayout> weakReference = this.f15828OooOOOo;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean OooO0o() {
        return this.f15821OooO0oo.OooO00o();
    }

    public final int OooO0o0() {
        if (OooO0o()) {
            return this.f15821OooO0oo.f15831OooO0O0.f15851OooOOO0;
        }
        return 0;
    }

    public final void OooO0oO() {
        Context context = this.f15817OooO0Oo.get();
        if (context == null) {
            return;
        }
        BadgeState badgeState = this.f15821OooO0oo;
        boolean zOooO00o = badgeState.OooO00o();
        BadgeState.State state = badgeState.f15831OooO0O0;
        this.f15819OooO0o0.setShapeAppearanceModel(new OooO0O0(OooO0O0.OooO00o(zOooO00o ? state.f15847OooOO0.intValue() : state.f15846OooO0oo.intValue(), context, badgeState.OooO00o() ? state.f15848OooOO0O.intValue() : state.f15841OooO.intValue())));
        invalidateSelf();
    }

    public final void OooO0oo(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f15827OooOOOO = new WeakReference<>(view);
        this.f15828OooOOOo = new WeakReference<>(frameLayout);
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
        this.f15819OooO0o0.draw(canvas);
        if (OooO0o()) {
            Rect rect = new Rect();
            String strOooO0O0 = OooO0O0();
            o00Oo0 o00oo1 = this.f15818OooO0o;
            o00oo1.f16840OooO00o.getTextBounds(strOooO0O0, 0, strOooO0O0.length(), rect);
            canvas.drawText(strOooO0O0, this.f15816OooO, this.f15822OooOO0 + (rect.height() / 2), o00oo1.f16840OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15821OooO0oo.f15831OooO0O0.f15849OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f15820OooO0oO.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f15820OooO0oO.width();
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
        BadgeState badgeState = this.f15821OooO0oo;
        badgeState.f15830OooO00o.f15849OooOO0o = i;
        badgeState.f15831OooO0O0.f15849OooOO0o = i;
        this.f15818OooO0o.f16840OooO00o.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
