package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.o000Oo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import o0O00O0.OooO00o;
import p013OooOo0o.o00Oo0;
import p052o00000oO.OooOO0;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final int f17340OoooooO = o0000O0O.Widget_Material3_CompoundButton_MaterialSwitch;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final int[] f17341Ooooooo = {o00000.state_with_icon};

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Drawable f17342OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public Drawable f17343OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public Drawable f17344OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public Drawable f17345OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17346OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public ColorStateList f17347Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f17348Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17349OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17350OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f17351OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int[] f17352Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int[] f17353Oooooo0;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    public static void OooO0oo(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        o00Ooo.OooO0O0.OooO0oO(drawable, OooOO0.OooO0O0(colorStateList.getColorForState(iArr, 0), f, colorStateList.getColorForState(iArr2, 0)));
    }

    public final void OooO() {
        if (this.f17346OoooOoo == null && this.f17347Ooooo00 == null && this.f17349OooooO0 == null && this.f17350OooooOO == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f17346OoooOoo;
        if (colorStateList != null) {
            OooO0oo(this.f17342OoooOOO, colorStateList, this.f17353Oooooo0, this.f17352Oooooo, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f17347Ooooo00;
        if (colorStateList2 != null) {
            OooO0oo(this.f17343OoooOOo, colorStateList2, this.f17353Oooooo0, this.f17352Oooooo, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f17349OooooO0;
        if (colorStateList3 != null) {
            OooO0oo(this.f17344OoooOo0, colorStateList3, this.f17353Oooooo0, this.f17352Oooooo, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f17350OooooOO;
        if (colorStateList4 != null) {
            OooO0oo(this.f17345OoooOoO, colorStateList4, this.f17353Oooooo0, this.f17352Oooooo, thumbPosition);
        }
    }

    public final void OooO0o() {
        this.f17342OoooOOO = OooO00o.OooO0O0(this.f17342OoooOOO, this.f17346OoooOoo, getThumbTintMode());
        this.f17343OoooOOo = OooO00o.OooO0O0(this.f17343OoooOOo, this.f17347Ooooo00, this.f17348Ooooo0o);
        OooO();
        super.setThumbDrawable(OooO00o.OooO00o(this.f17342OoooOOO, this.f17343OoooOOo));
        refreshDrawableState();
    }

    public final void OooO0oO() {
        this.f17344OoooOo0 = OooO00o.OooO0O0(this.f17344OoooOo0, this.f17349OooooO0, getTrackTintMode());
        this.f17345OoooOoO = OooO00o.OooO0O0(this.f17345OoooOoO, this.f17350OooooOO, this.f17351OooooOo);
        OooO();
        Drawable layerDrawable = this.f17344OoooOo0;
        if (layerDrawable != null && this.f17345OoooOoO != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f17344OoooOo0, this.f17345OoooOoO});
        } else if (layerDrawable == null) {
            layerDrawable = this.f17345OoooOoO;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f17342OoooOOO;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f17343OoooOOo;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f17347Ooooo00;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f17348Ooooo0o;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f17346OoooOoo;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f17345OoooOoO;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f17350OooooOO;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f17351OooooOo;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f17344OoooOo0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f17349OooooO0;
    }

    @Override // android.view.View
    public final void invalidate() {
        OooO();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f17343OoooOOo != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17341Ooooooo);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f17353Oooooo0 = iArr;
        this.f17352Oooooo = OooO00o.OooO0OO(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f17342OoooOOO = drawable;
        OooO0o();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f17343OoooOOo = drawable;
        OooO0o();
    }

    public void setThumbIconResource(@DrawableRes int i) {
        setThumbIconDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f17347Ooooo00 = colorStateList;
        OooO0o();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f17348Ooooo0o = mode;
        OooO0o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f17346OoooOoo = colorStateList;
        OooO0o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        OooO0o();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f17345OoooOoO = drawable;
        OooO0oO();
    }

    public void setTrackDecorationResource(@DrawableRes int i) {
        setTrackDecorationDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f17350OooooOO = colorStateList;
        OooO0oO();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f17351OooooOo = mode;
        OooO0oO();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f17344OoooOo0 = drawable;
        OooO0oO();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f17349OooooO0 = colorStateList;
        OooO0oO();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        OooO0oO();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17340OoooooO;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f17342OoooOOO = super.getThumbDrawable();
        this.f17346OoooOoo = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f17344OoooOo0 = super.getTrackDrawable();
        this.f17349OooooO0 = super.getTrackTintList();
        super.setTrackTintList(null);
        o000Oo0 o000oo0OooO0o0 = o00oO0o.OooO0o0(context2, attributeSet, o000OO.MaterialSwitch, i, i2, new int[0]);
        this.f17343OoooOOo = o000oo0OooO0o0.OooO0o0(o000OO.MaterialSwitch_thumbIcon);
        this.f17347Ooooo00 = o000oo0OooO0o0.OooO0O0(o000OO.MaterialSwitch_thumbIconTint);
        this.f17348Ooooo0o = oo0o0Oo.OooO0oO(o000oo0OooO0o0.OooO0oo(o000OO.MaterialSwitch_thumbIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f17345OoooOoO = o000oo0OooO0o0.OooO0o0(o000OO.MaterialSwitch_trackDecoration);
        this.f17350OooooOO = o000oo0OooO0o0.OooO0O0(o000OO.MaterialSwitch_trackDecorationTint);
        this.f17351OooooOo = oo0o0Oo.OooO0oO(o000oo0OooO0o0.OooO0oo(o000OO.MaterialSwitch_trackDecorationTintMode, -1), PorterDuff.Mode.SRC_IN);
        o000oo0OooO0o0.OooOOO();
        setEnforceSwitchWidth(false);
        OooO0o();
        OooO0oO();
    }
}
