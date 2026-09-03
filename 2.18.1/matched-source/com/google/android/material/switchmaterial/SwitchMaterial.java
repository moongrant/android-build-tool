package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p343o0OO0ooO.o0OOOO0o;
import p352o0OOOOoO.OooOOO0;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public static final int f17743o00000OO = Oooo000.Widget_MaterialComponents_CompoundButton_Switch;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public static final int[][] f17744o00000Oo = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @Nullable
    public ColorStateList f17745o00000;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    @NonNull
    public final o0OOOO0o f17746o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public boolean f17747o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17748o00000O0;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f17745o00000 == null) {
            int iOooO0OO = o0O0000O.OooO0OO(this, OooO0o.colorSurface);
            int iOooO0OO2 = o0O0000O.OooO0OO(this, OooO0o.colorControlActivated);
            float dimension = getResources().getDimension(OooOO0.mtrl_switch_thumb_elevation);
            if (this.f17746o000000o.f38019OooO00o) {
                dimension += o00Ooo.OooO0o0(this);
            }
            int iOooO00o = this.f17746o000000o.OooO00o(iOooO0OO, dimension);
            this.f17745o00000 = new ColorStateList(f17744o00000Oo, new int[]{o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 1.0f), iOooO00o, o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 0.38f), iOooO00o});
        }
        return this.f17745o00000;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f17748o00000O0 == null) {
            int[][] iArr = f17744o00000Oo;
            int iOooO0OO = o0O0000O.OooO0OO(this, OooO0o.colorSurface);
            int iOooO0OO2 = o0O0000O.OooO0OO(this, OooO0o.colorControlActivated);
            int iOooO0OO3 = o0O0000O.OooO0OO(this, OooO0o.colorOnSurface);
            this.f17748o00000O0 = new ColorStateList(iArr, new int[]{o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 0.54f), o0O0000O.OooO0o0(iOooO0OO, iOooO0OO3, 0.32f), o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 0.12f), o0O0000O.OooO0o0(iOooO0OO, iOooO0OO3, 0.12f)});
        }
        return this.f17748o00000O0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17747o00000O && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f17747o00000O && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f17747o00000O = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17743o00000OO;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f17746o000000o = new o0OOOO0o(context2);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.SwitchMaterial, i, i2, new int[0]);
        this.f17747o00000O = typedArrayOooO0Oo.getBoolean(Oooo0.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayOooO0Oo.recycle();
    }
}
