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
import androidx.core.view.o000O0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import java.util.WeakHashMap;
import o0O00o00.Oooo0;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o00000;
import p272o0O000oo.OooOOO;
import p274o0O00OoO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f16571OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MaterialButton f16572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public OooO0O0 f16573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f16574OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f16579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16581OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f16582OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f16584OooOOO0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f16588OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RippleDrawable f16589OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f16590OooOo00;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f16583OooOOO = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f16585OooOOOO = false;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f16586OooOOOo = false;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f16587OooOOo = true;

    public OooO00o(MaterialButton materialButton, @NonNull OooO0O0 oooO0O0) {
        this.f16572OooO00o = materialButton;
        this.f16573OooO0O0 = oooO0O0;
    }

    @Nullable
    public final Oooo0 OooO00o() {
        RippleDrawable rippleDrawable = this.f16589OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f16589OooOOoo.getNumberOfLayers() > 2 ? (Oooo0) this.f16589OooOOoo.getDrawable(2) : (Oooo0) this.f16589OooOOoo.getDrawable(1);
    }

    @Nullable
    public final MaterialShapeDrawable OooO0O0(boolean z) {
        RippleDrawable rippleDrawable = this.f16589OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f16589OooOOoo.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void OooO0OO(@NonNull OooO0O0 oooO0O0) {
        this.f16573OooO0O0 = oooO0O0;
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
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        MaterialButton materialButton = this.f16572OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iOooO0o0 = ViewCompat.OooO.OooO0o0(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f16577OooO0o0;
        int i4 = this.f16576OooO0o;
        this.f16576OooO0o = i2;
        this.f16577OooO0o0 = i;
        if (!this.f16585OooOOOO) {
            OooO0o0();
        }
        ViewCompat.OooO.OooOO0O(materialButton, iOooO0o, (paddingTop + i) - i3, iOooO0o0, (paddingBottom + i2) - i4);
    }

    public final void OooO0o() {
        int iOooO0OO = 0;
        MaterialShapeDrawable materialShapeDrawableOooO0O0 = OooO0O0(false);
        MaterialShapeDrawable materialShapeDrawableOooO0O1 = OooO0O0(true);
        if (materialShapeDrawableOooO0O0 != null) {
            float f = this.f16579OooO0oo;
            ColorStateList colorStateList = this.f16581OooOO0O;
            materialShapeDrawableOooO0O0.OooOo00(f);
            materialShapeDrawableOooO0O0.OooOOoo(colorStateList);
            if (materialShapeDrawableOooO0O1 != null) {
                float f2 = this.f16579OooO0oo;
                if (this.f16583OooOOO) {
                    iOooO0OO = OooOOO.OooO0OO(o00000.colorSurface, this.f16572OooO00o);
                }
                materialShapeDrawableOooO0O1.OooOo00(f2);
                materialShapeDrawableOooO0O1.OooOOoo(ColorStateList.valueOf(iOooO0OO));
            }
        }
    }

    public final void OooO0o0() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f16573OooO0O0);
        MaterialButton materialButton = this.f16572OooO00o;
        materialShapeDrawable.OooOO0O(materialButton.getContext());
        o00Ooo.OooO0O0.OooO0oo(materialShapeDrawable, this.f16580OooOO0);
        PorterDuff.Mode mode = this.f16571OooO;
        if (mode != null) {
            o00Ooo.OooO0O0.OooO(materialShapeDrawable, mode);
        }
        float f = this.f16579OooO0oo;
        ColorStateList colorStateList = this.f16581OooOO0O;
        materialShapeDrawable.OooOo00(f);
        materialShapeDrawable.OooOOoo(colorStateList);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f16573OooO0O0);
        materialShapeDrawable2.setTint(0);
        float f2 = this.f16579OooO0oo;
        int iOooO0OO = this.f16583OooOOO ? OooOOO.OooO0OO(o00000.colorSurface, materialButton) : 0;
        materialShapeDrawable2.OooOo00(f2);
        materialShapeDrawable2.OooOOoo(ColorStateList.valueOf(iOooO0OO));
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f16573OooO0O0);
        this.f16584OooOOO0 = materialShapeDrawable3;
        o00Ooo.OooO0O0.OooO0oO(materialShapeDrawable3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(OooO0OO.OooO0OO(this.f16582OooOO0o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f16574OooO0OO, this.f16577OooO0o0, this.f16575OooO0Oo, this.f16576OooO0o), this.f16584OooOOO0);
        this.f16589OooOOoo = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable materialShapeDrawableOooO0O0 = OooO0O0(false);
        if (materialShapeDrawableOooO0O0 != null) {
            materialShapeDrawableOooO0O0.OooOOO0(this.f16590OooOo00);
            materialShapeDrawableOooO0O0.setState(materialButton.getDrawableState());
        }
    }
}
