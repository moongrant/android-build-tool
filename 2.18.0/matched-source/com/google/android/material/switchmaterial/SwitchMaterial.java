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
import p338o0OO0o0.OooO0o;
import p338o0OO0o0.OooOO0;
import p338o0OO0o0.Oooo0;
import p338o0OO0o0.Oooo000;
import p344o0OO0ooO.o0OOOO00;
import p353o0OOOOoO.OooOOO0;
import p396o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    @NonNull
    public final o0OOOO00 f17764o00000O;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17765o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17766o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public boolean f17767o00000o0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public static final int f17763o0000Ooo = Oooo000.Widget_MaterialComponents_CompoundButton_Switch;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public static final int[][] f17762o00000oO = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f17765o00000OO == null) {
            int iOooO0OO = o0O0000O.OooO0OO(this, OooO0o.colorSurface);
            int iOooO0OO2 = o0O0000O.OooO0OO(this, OooO0o.colorControlActivated);
            float dimension = getResources().getDimension(OooOO0.mtrl_switch_thumb_elevation);
            if (this.f17764o00000O.f38039OooO00o) {
                dimension += o00Ooo.OooO0o0(this);
            }
            int iOooO00o = this.f17764o00000O.OooO00o(iOooO0OO, dimension);
            this.f17765o00000OO = new ColorStateList(f17762o00000oO, new int[]{o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 1.0f), iOooO00o, o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 0.38f), iOooO00o});
        }
        return this.f17765o00000OO;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f17766o00000Oo == null) {
            int[][] iArr = f17762o00000oO;
            int iOooO0OO = o0O0000O.OooO0OO(this, OooO0o.colorSurface);
            int iOooO0OO2 = o0O0000O.OooO0OO(this, OooO0o.colorControlActivated);
            int iOooO0OO3 = o0O0000O.OooO0OO(this, OooO0o.colorOnSurface);
            this.f17766o00000Oo = new ColorStateList(iArr, new int[]{o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 0.54f), o0O0000O.OooO0o0(iOooO0OO, iOooO0OO3, 0.32f), o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 0.12f), o0O0000O.OooO0o0(iOooO0OO, iOooO0OO3, 0.12f)});
        }
        return this.f17766o00000Oo;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17767o00000o0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f17767o00000o0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f17767o00000o0 = z;
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
        int i2 = f17763o0000Ooo;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f17764o00000O = new o0OOOO00(context2);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.SwitchMaterial, i, i2, new int[0]);
        this.f17767o00000o0 = typedArrayOooO0Oo.getBoolean(Oooo0.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayOooO0Oo.recycle();
    }
}
