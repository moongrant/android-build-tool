package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import java.util.WeakHashMap;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p274o0O000oo.OooOOO0;
import p277o0O00Ooo.OooOOOO;
import p280o0O00o0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16098OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MaterialButton f16099OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public OooO0O0 f16100OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f16101OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16102OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16103OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16104OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16105OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f16106OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16107OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16108OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f16109OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f16111OooOOO0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f16115OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RippleDrawable f16116OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f16117OooOo00;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f16110OooOOO = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f16112OooOOOO = false;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f16113OooOOOo = false;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f16114OooOOo = true;

    public OooO00o(MaterialButton materialButton, @NonNull OooO0O0 oooO0O0) {
        this.f16099OooO00o = materialButton;
        this.f16100OooO0O0 = oooO0O0;
    }

    @Nullable
    public final o0OoOo0 OooO00o() {
        RippleDrawable rippleDrawable = this.f16116OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f16116OooOOoo.getNumberOfLayers() > 2 ? (o0OoOo0) this.f16116OooOOoo.getDrawable(2) : (o0OoOo0) this.f16116OooOOoo.getDrawable(1);
    }

    @Nullable
    public final MaterialShapeDrawable OooO0O0(boolean z) {
        RippleDrawable rippleDrawable = this.f16116OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f16116OooOOoo.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void OooO0OO(@NonNull OooO0O0 oooO0O0) {
        this.f16100OooO0O0 = oooO0O0;
        if (OooO0O0(false) != null) {
            OooO0O0(false).setShapeAppearanceModel(oooO0O0);
        }
        if (OooO0O0(true) != null) {
            OooO0O0(true).setShapeAppearanceModel(oooO0O0);
        }
        if (OooO00o() != null) {
            OooO00o().setShapeAppearanceModel(oooO0O0);
        }
    }

    public final void OooO0Oo(@Dimension int i, @Dimension int i2) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        MaterialButton materialButton = this.f16099OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iOooO0o0 = ViewCompat.OooO.OooO0o0(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f16104OooO0o0;
        int i4 = this.f16103OooO0o;
        this.f16103OooO0o = i2;
        this.f16104OooO0o0 = i;
        if (!this.f16112OooOOOO) {
            OooO0o0();
        }
        ViewCompat.OooO.OooOO0O(materialButton, iOooO0o, (paddingTop + i) - i3, iOooO0o0, (paddingBottom + i2) - i4);
    }

    public final void OooO0o() {
        int iOooO0OO = 0;
        MaterialShapeDrawable materialShapeDrawableOooO0O0 = OooO0O0(false);
        MaterialShapeDrawable materialShapeDrawableOooO0O1 = OooO0O0(true);
        if (materialShapeDrawableOooO0O0 != null) {
            float f = this.f16106OooO0oo;
            ColorStateList colorStateList = this.f16108OooOO0O;
            materialShapeDrawableOooO0O0.OooOo00(f);
            materialShapeDrawableOooO0O0.OooOOoo(colorStateList);
            if (materialShapeDrawableOooO0O1 != null) {
                float f2 = this.f16106OooO0oo;
                if (this.f16110OooOOO) {
                    iOooO0OO = OooOOO0.OooO0OO(o00000.colorSurface, this.f16099OooO00o);
                }
                materialShapeDrawableOooO0O1.OooOo00(f2);
                materialShapeDrawableOooO0O1.OooOOoo(ColorStateList.valueOf(iOooO0OO));
            }
        }
    }

    public final void OooO0o0() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f16100OooO0O0);
        MaterialButton materialButton = this.f16099OooO00o;
        materialShapeDrawable.OooOO0O(materialButton.getContext());
        o00Ooo.OooO0O0.OooO0oo(materialShapeDrawable, this.f16107OooOO0);
        PorterDuff.Mode mode = this.f16098OooO;
        if (mode != null) {
            o00Ooo.OooO0O0.OooO(materialShapeDrawable, mode);
        }
        float f = this.f16106OooO0oo;
        ColorStateList colorStateList = this.f16108OooOO0O;
        materialShapeDrawable.OooOo00(f);
        materialShapeDrawable.OooOOoo(colorStateList);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f16100OooO0O0);
        materialShapeDrawable2.setTint(0);
        float f2 = this.f16106OooO0oo;
        int iOooO0OO = this.f16110OooOOO ? OooOOO0.OooO0OO(o00000.colorSurface, materialButton) : 0;
        materialShapeDrawable2.OooOo00(f2);
        materialShapeDrawable2.OooOOoo(ColorStateList.valueOf(iOooO0OO));
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f16100OooO0O0);
        this.f16111OooOOO0 = materialShapeDrawable3;
        o00Ooo.OooO0O0.OooO0oO(materialShapeDrawable3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(OooOOOO.OooO0OO(this.f16109OooOO0o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f16101OooO0OO, this.f16104OooO0o0, this.f16102OooO0Oo, this.f16103OooO0o), this.f16111OooOOO0);
        this.f16116OooOOoo = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable materialShapeDrawableOooO0O0 = OooO0O0(false);
        if (materialShapeDrawableOooO0O0 != null) {
            materialShapeDrawableOooO0O0.OooOOO0(this.f16117OooOo00);
            materialShapeDrawableOooO0O0.setState(materialButton.getDrawableState());
        }
    }
}
