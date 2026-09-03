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
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final int f16867OoooooO = o0000O0O.Widget_Material3_CompoundButton_MaterialSwitch;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final int[] f16868Ooooooo = {o00000.state_with_icon};

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Drawable f16869OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public Drawable f16870OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public Drawable f16871OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public Drawable f16872OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16873OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public ColorStateList f16874Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f16875Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16876OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16877OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f16878OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int[] f16879Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int[] f16880Oooooo0;

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
        if (this.f16873OoooOoo == null && this.f16874Ooooo00 == null && this.f16876OooooO0 == null && this.f16877OooooOO == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f16873OoooOoo;
        if (colorStateList != null) {
            OooO0oo(this.f16869OoooOOO, colorStateList, this.f16880Oooooo0, this.f16879Oooooo, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f16874Ooooo00;
        if (colorStateList2 != null) {
            OooO0oo(this.f16870OoooOOo, colorStateList2, this.f16880Oooooo0, this.f16879Oooooo, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f16876OooooO0;
        if (colorStateList3 != null) {
            OooO0oo(this.f16871OoooOo0, colorStateList3, this.f16880Oooooo0, this.f16879Oooooo, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f16877OooooOO;
        if (colorStateList4 != null) {
            OooO0oo(this.f16872OoooOoO, colorStateList4, this.f16880Oooooo0, this.f16879Oooooo, thumbPosition);
        }
    }

    public final void OooO0o() {
        this.f16869OoooOOO = OooO00o.OooO0O0(this.f16869OoooOOO, this.f16873OoooOoo, getThumbTintMode());
        this.f16870OoooOOo = OooO00o.OooO0O0(this.f16870OoooOOo, this.f16874Ooooo00, this.f16875Ooooo0o);
        OooO();
        super.setThumbDrawable(OooO00o.OooO00o(this.f16869OoooOOO, this.f16870OoooOOo));
        refreshDrawableState();
    }

    public final void OooO0oO() {
        this.f16871OoooOo0 = OooO00o.OooO0O0(this.f16871OoooOo0, this.f16876OooooO0, getTrackTintMode());
        this.f16872OoooOoO = OooO00o.OooO0O0(this.f16872OoooOoO, this.f16877OooooOO, this.f16878OooooOo);
        OooO();
        Drawable layerDrawable = this.f16871OoooOo0;
        if (layerDrawable != null && this.f16872OoooOoO != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f16871OoooOo0, this.f16872OoooOoO});
        } else if (layerDrawable == null) {
            layerDrawable = this.f16872OoooOoO;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f16869OoooOOO;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f16870OoooOOo;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f16874Ooooo00;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f16875Ooooo0o;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f16873OoooOoo;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f16872OoooOoO;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f16877OooooOO;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f16878OooooOo;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f16871OoooOo0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f16876OooooO0;
    }

    @Override // android.view.View
    public final void invalidate() {
        OooO();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f16870OoooOOo != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16868Ooooooo);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f16880Oooooo0 = iArr;
        this.f16879Oooooo = OooO00o.OooO0OO(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f16869OoooOOO = drawable;
        OooO0o();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f16870OoooOOo = drawable;
        OooO0o();
    }

    public void setThumbIconResource(@DrawableRes int i) {
        setThumbIconDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f16874Ooooo00 = colorStateList;
        OooO0o();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f16875Ooooo0o = mode;
        OooO0o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f16873OoooOoo = colorStateList;
        OooO0o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        OooO0o();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f16872OoooOoO = drawable;
        OooO0oO();
    }

    public void setTrackDecorationResource(@DrawableRes int i) {
        setTrackDecorationDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f16877OooooOO = colorStateList;
        OooO0oO();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f16878OooooOo = mode;
        OooO0oO();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f16871OoooOo0 = drawable;
        OooO0oO();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f16876OooooO0 = colorStateList;
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
        int i2 = f16867OoooooO;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f16869OoooOOO = super.getThumbDrawable();
        this.f16873OoooOoo = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f16871OoooOo0 = super.getTrackDrawable();
        this.f16876OooooO0 = super.getTrackTintList();
        super.setTrackTintList(null);
        o000Oo0 o000oo0OooO0o0 = o00oO0o.OooO0o0(context2, attributeSet, o000OO.MaterialSwitch, i, i2, new int[0]);
        this.f16870OoooOOo = o000oo0OooO0o0.OooO0o0(o000OO.MaterialSwitch_thumbIcon);
        this.f16874Ooooo00 = o000oo0OooO0o0.OooO0O0(o000OO.MaterialSwitch_thumbIconTint);
        this.f16875Ooooo0o = oo0o0Oo.OooO0oO(o000oo0OooO0o0.OooO0oo(o000OO.MaterialSwitch_thumbIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f16872OoooOoO = o000oo0OooO0o0.OooO0o0(o000OO.MaterialSwitch_trackDecoration);
        this.f16877OooooOO = o000oo0OooO0o0.OooO0O0(o000OO.MaterialSwitch_trackDecorationTint);
        this.f16878OooooOo = oo0o0Oo.OooO0oO(o000oo0OooO0o0.OooO0oo(o000OO.MaterialSwitch_trackDecorationTintMode, -1), PorterDuff.Mode.SRC_IN);
        o000oo0OooO0o0.OooOOO();
        setEnforceSwitchWidth(false);
        OooO0o();
        OooO0oO();
    }
}
