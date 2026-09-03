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
import p273o0O0000o.o00000;
import p273o0O0000o.o0000O0O;
import p273o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final int f16874OoooooO = o0000O0O.Widget_Material3_CompoundButton_MaterialSwitch;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final int[] f16875Ooooooo = {o00000.state_with_icon};

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Drawable f16876OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public Drawable f16877OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public Drawable f16878OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public Drawable f16879OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16880OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public ColorStateList f16881Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f16882Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16883OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f16884OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f16885OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int[] f16886Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int[] f16887Oooooo0;

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
        if (this.f16880OoooOoo == null && this.f16881Ooooo00 == null && this.f16883OooooO0 == null && this.f16884OooooOO == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f16880OoooOoo;
        if (colorStateList != null) {
            OooO0oo(this.f16876OoooOOO, colorStateList, this.f16887Oooooo0, this.f16886Oooooo, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f16881Ooooo00;
        if (colorStateList2 != null) {
            OooO0oo(this.f16877OoooOOo, colorStateList2, this.f16887Oooooo0, this.f16886Oooooo, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f16883OooooO0;
        if (colorStateList3 != null) {
            OooO0oo(this.f16878OoooOo0, colorStateList3, this.f16887Oooooo0, this.f16886Oooooo, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f16884OooooOO;
        if (colorStateList4 != null) {
            OooO0oo(this.f16879OoooOoO, colorStateList4, this.f16887Oooooo0, this.f16886Oooooo, thumbPosition);
        }
    }

    public final void OooO0o() {
        this.f16876OoooOOO = OooO00o.OooO0O0(this.f16876OoooOOO, this.f16880OoooOoo, getThumbTintMode());
        this.f16877OoooOOo = OooO00o.OooO0O0(this.f16877OoooOOo, this.f16881Ooooo00, this.f16882Ooooo0o);
        OooO();
        super.setThumbDrawable(OooO00o.OooO00o(this.f16876OoooOOO, this.f16877OoooOOo));
        refreshDrawableState();
    }

    public final void OooO0oO() {
        this.f16878OoooOo0 = OooO00o.OooO0O0(this.f16878OoooOo0, this.f16883OooooO0, getTrackTintMode());
        this.f16879OoooOoO = OooO00o.OooO0O0(this.f16879OoooOoO, this.f16884OooooOO, this.f16885OooooOo);
        OooO();
        Drawable layerDrawable = this.f16878OoooOo0;
        if (layerDrawable != null && this.f16879OoooOoO != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f16878OoooOo0, this.f16879OoooOoO});
        } else if (layerDrawable == null) {
            layerDrawable = this.f16879OoooOoO;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f16876OoooOOO;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f16877OoooOOo;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f16881Ooooo00;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f16882Ooooo0o;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f16880OoooOoo;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f16879OoooOoO;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f16884OooooOO;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f16885OooooOo;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f16878OoooOo0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f16883OooooO0;
    }

    @Override // android.view.View
    public final void invalidate() {
        OooO();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f16877OoooOOo != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16875Ooooooo);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f16887Oooooo0 = iArr;
        this.f16886Oooooo = OooO00o.OooO0OO(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f16876OoooOOO = drawable;
        OooO0o();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f16877OoooOOo = drawable;
        OooO0o();
    }

    public void setThumbIconResource(@DrawableRes int i) {
        setThumbIconDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f16881Ooooo00 = colorStateList;
        OooO0o();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f16882Ooooo0o = mode;
        OooO0o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f16880OoooOoo = colorStateList;
        OooO0o();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        OooO0o();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f16879OoooOoO = drawable;
        OooO0oO();
    }

    public void setTrackDecorationResource(@DrawableRes int i) {
        setTrackDecorationDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f16884OooooOO = colorStateList;
        OooO0oO();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f16885OooooOo = mode;
        OooO0oO();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f16878OoooOo0 = drawable;
        OooO0oO();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f16883OooooO0 = colorStateList;
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
        int i2 = f16874OoooooO;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f16876OoooOOO = super.getThumbDrawable();
        this.f16880OoooOoo = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f16878OoooOo0 = super.getTrackDrawable();
        this.f16883OooooO0 = super.getTrackTintList();
        super.setTrackTintList(null);
        o000Oo0 o000oo0OooO0o0 = o00oO0o.OooO0o0(context2, attributeSet, o000OO.MaterialSwitch, i, i2, new int[0]);
        this.f16877OoooOOo = o000oo0OooO0o0.OooO0o0(o000OO.MaterialSwitch_thumbIcon);
        this.f16881Ooooo00 = o000oo0OooO0o0.OooO0O0(o000OO.MaterialSwitch_thumbIconTint);
        this.f16882Ooooo0o = oo0o0Oo.OooO0oO(o000oo0OooO0o0.OooO0oo(o000OO.MaterialSwitch_thumbIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f16879OoooOoO = o000oo0OooO0o0.OooO0o0(o000OO.MaterialSwitch_trackDecoration);
        this.f16884OooooOO = o000oo0OooO0o0.OooO0O0(o000OO.MaterialSwitch_trackDecorationTint);
        this.f16885OooooOo = oo0o0Oo.OooO0oO(o000oo0OooO0o0.OooO0oo(o000OO.MaterialSwitch_trackDecorationTintMode, -1), PorterDuff.Mode.SRC_IN);
        o000oo0OooO0o0.OooOOO();
        setEnforceSwitchWidth(false);
        OooO0o();
        OooO0oO();
    }
}
