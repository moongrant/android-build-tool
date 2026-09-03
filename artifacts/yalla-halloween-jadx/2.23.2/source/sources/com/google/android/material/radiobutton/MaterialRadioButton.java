package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.OooO0O0;
import com.google.android.material.internal.o00oO0o;
import o0O0O0O.OooO00o;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p274o0O000oo.OooOOO0;
import p276o0O00OoO.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int f17014OooOO0 = o0000O0O.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int[][] f17015OooOO0O = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f17016OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17017OooO0oo;

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17017OooO0oo == null) {
            int iOooO0OO = OooOOO0.OooO0OO(o00000.colorControlActivated, this);
            int iOooO0OO2 = OooOOO0.OooO0OO(o00000.colorOnSurface, this);
            int iOooO0OO3 = OooOOO0.OooO0OO(o00000.colorSurface, this);
            this.f17017OooO0oo = new ColorStateList(f17015OooOO0O, new int[]{OooOOO0.OooO0o0(iOooO0OO3, 1.0f, iOooO0OO), OooOOO0.OooO0o0(iOooO0OO3, 0.54f, iOooO0OO2), OooOOO0.OooO0o0(iOooO0OO3, 0.38f, iOooO0OO2), OooOOO0.OooO0o0(iOooO0OO3, 0.38f, iOooO0OO2)});
        }
        return this.f17017OooO0oo;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17016OooO && OooO0O0.OooO00o(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f17016OooO = z;
        if (z) {
            OooO0O0.OooO0OO(this, getMaterialThemeColorsTintList());
        } else {
            OooO0O0.OooO0OO(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17014OooOO0;
        super(OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.MaterialRadioButton, i, i2, new int[0]);
        int i3 = o000OO.MaterialRadioButton_buttonTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            OooO0O0.OooO0OO(this, OooO0o.OooO00o(context2, typedArrayOooO0Oo, i3));
        }
        this.f17016OooO = typedArrayOooO0Oo.getBoolean(o000OO.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayOooO0Oo.recycle();
    }
}
