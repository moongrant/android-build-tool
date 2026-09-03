package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.OooO0OO;
import com.google.android.material.internal.o000oOoO;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p352o0OOOOoO.OooOOO0;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f17505OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public ColorStateList f17506OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final int f17504OoooO0O = Oooo000.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final int[][] f17503OoooO = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17506OoooO00 == null) {
            int iOooO0OO = o0O0000O.OooO0OO(this, OooO0o.colorControlActivated);
            int iOooO0OO2 = o0O0000O.OooO0OO(this, OooO0o.colorOnSurface);
            int iOooO0OO3 = o0O0000O.OooO0OO(this, OooO0o.colorSurface);
            this.f17506OoooO00 = new ColorStateList(f17503OoooO, new int[]{o0O0000O.OooO0o0(iOooO0OO3, iOooO0OO, 1.0f), o0O0000O.OooO0o0(iOooO0OO3, iOooO0OO2, 0.54f), o0O0000O.OooO0o0(iOooO0OO3, iOooO0OO2, 0.38f), o0O0000O.OooO0o0(iOooO0OO3, iOooO0OO2, 0.38f)});
        }
        return this.f17506OoooO00;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17505OoooO0 && OooO0OO.OooO00o.OooO00o(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f17505OoooO0 = z;
        if (z) {
            OooO0OO.OooO00o.OooO0OO(this, getMaterialThemeColorsTintList());
        } else {
            OooO0OO.OooO00o.OooO0OO(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17504OoooO0O;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.MaterialRadioButton, i, i2, new int[0]);
        int i3 = Oooo0.MaterialRadioButton_buttonTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            OooO0OO.OooO00o.OooO0OO(this, o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i3));
        }
        this.f17505OoooO0 = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayOooO0Oo.recycle();
    }
}
