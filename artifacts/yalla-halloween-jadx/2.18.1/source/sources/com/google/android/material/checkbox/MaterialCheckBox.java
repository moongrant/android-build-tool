package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.OooO0OO;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p352o0OOOOoO.OooOOO0;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final int f16744OoooO = Oooo000.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final int[][] f16745OoooOO0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f16746OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public ColorStateList f16747OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f16748OoooO0O;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16747OoooO00 == null) {
            int[][] iArr = f16745OoooOO0;
            int iOooO0OO = o0O0000O.OooO0OO(this, OooO0o.colorControlActivated);
            int iOooO0OO2 = o0O0000O.OooO0OO(this, OooO0o.colorSurface);
            int iOooO0OO3 = o0O0000O.OooO0OO(this, OooO0o.colorOnSurface);
            this.f16747OoooO00 = new ColorStateList(iArr, new int[]{o0O0000O.OooO0o0(iOooO0OO2, iOooO0OO, 1.0f), o0O0000O.OooO0o0(iOooO0OO2, iOooO0OO3, 0.54f), o0O0000O.OooO0o0(iOooO0OO2, iOooO0OO3, 0.38f), o0O0000O.OooO0o0(iOooO0OO2, iOooO0OO3, 0.38f)});
        }
        return this.f16747OoooO00;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16746OoooO0 && OooO0OO.OooO00o.OooO00o(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableOooO00o;
        if (!this.f16748OoooO0O || !TextUtils.isEmpty(getText()) || (drawableOooO00o = OooO0OO.OooO00o(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableOooO00o.getIntrinsicWidth()) / 2) * (o00Ooo.OooO0o(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableOooO00o.getBounds();
            o0OOO0o.OooO0O0.OooO0o(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f16748OoooO0O = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f16746OoooO0 = z;
        if (z) {
            OooO0OO.OooO00o.OooO0OO(this, getMaterialThemeColorsTintList());
        } else {
            OooO0OO.OooO00o.OooO0OO(this, null);
        }
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.checkboxStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f16744OoooO;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.MaterialCheckBox, i, i2, new int[0]);
        int i3 = Oooo0.MaterialCheckBox_buttonTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            OooO0OO.OooO00o.OooO0OO(this, o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i3));
        }
        this.f16746OoooO0 = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialCheckBox_useMaterialThemeColors, false);
        this.f16748OoooO0O = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialCheckBox_centerIfNoTextEnabled, true);
        typedArrayOooO0Oo.recycle();
    }
}
