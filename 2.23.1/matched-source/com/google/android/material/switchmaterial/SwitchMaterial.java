package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.o00oO0o;
import java.util.WeakHashMap;
import o0O0O0O.OooO00o;
import p273o0O0000o.o00000;
import p273o0O0000o.o00000O;
import p273o0O0000o.o0000O0O;
import p273o0O0000o.o000OO;
import p275o0O000oo.OooOOO0;
import p424o0OoO00O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final int f17376OoooOoo = o0000O0O.Widget_MaterialComponents_CompoundButton_Switch;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final int[][] f17377Ooooo00 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NonNull
    public final o00O0O f17378OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17379OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17380OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f17381OoooOoO;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f17379OoooOOo == null) {
            int iOooO0OO = OooOOO0.OooO0OO(o00000.colorSurface, this);
            int iOooO0OO2 = OooOOO0.OooO0OO(o00000.colorControlActivated, this);
            float dimension = getResources().getDimension(o00000O.mtrl_switch_thumb_elevation);
            o00O0O o00o0o2 = this.f17378OoooOOO;
            if (o00o0o2.f46613OooO00o) {
                float fOooO = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
                    fOooO += ViewCompat.OooOOO.OooO((View) parent);
                }
                dimension += fOooO;
            }
            int iOooO00o = o00o0o2.OooO00o(dimension, iOooO0OO);
            this.f17379OoooOOo = new ColorStateList(f17377Ooooo00, new int[]{OooOOO0.OooO0o0(iOooO0OO, 1.0f, iOooO0OO2), iOooO00o, OooOOO0.OooO0o0(iOooO0OO, 0.38f, iOooO0OO2), iOooO00o});
        }
        return this.f17379OoooOOo;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f17380OoooOo0 == null) {
            int iOooO0OO = OooOOO0.OooO0OO(o00000.colorSurface, this);
            int iOooO0OO2 = OooOOO0.OooO0OO(o00000.colorControlActivated, this);
            int iOooO0OO3 = OooOOO0.OooO0OO(o00000.colorOnSurface, this);
            this.f17380OoooOo0 = new ColorStateList(f17377Ooooo00, new int[]{OooOOO0.OooO0o0(iOooO0OO, 0.54f, iOooO0OO2), OooOOO0.OooO0o0(iOooO0OO, 0.32f, iOooO0OO3), OooOOO0.OooO0o0(iOooO0OO, 0.12f, iOooO0OO2), OooOOO0.OooO0o0(iOooO0OO, 0.12f, iOooO0OO3)});
        }
        return this.f17380OoooOo0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17381OoooOoO && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f17381OoooOoO && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f17381OoooOoO = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17376OoooOoo;
        super(OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f17378OoooOOO = new o00O0O(context2);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.SwitchMaterial, i, i2, new int[0]);
        this.f17381OoooOoO = typedArrayOooO0Oo.getBoolean(o000OO.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayOooO0Oo.recycle();
    }
}
