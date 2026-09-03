package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class o0O0O00 extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public PorterDuff.Mode f18107OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TextInputLayout f18108OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public CharSequence f18109OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AppCompatTextView f18110OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CheckableImageButton f18111OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ColorStateList f18112OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f18113OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f18114OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public View.OnLongClickListener f18115OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f18116OooOOO0;

    public o0O0O00(TextInputLayout textInputLayout, o000Oo0 o000oo1) {
        CharSequence charSequenceOooOO0O;
        super(textInputLayout.getContext());
        this.f18108OooO0Oo = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(o0000O00.design_text_input_start_icon, (ViewGroup) this, false);
        this.f18111OooO0oO = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f18110OooO0o0 = appCompatTextView;
        if (c1.OooO0o0(getContext())) {
            androidx.core.view.o00O0O.OooO0oO((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f18115OooOO0o;
        checkableImageButton.setOnClickListener(null);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
        this.f18115OooOO0o = null;
        checkableImageButton.setOnLongClickListener(null);
        o00oO0o.OooO0Oo(checkableImageButton, null);
        int i = o000OO.TextInputLayout_startIconTint;
        if (o000oo1.OooOO0o(i)) {
            this.f18112OooO0oo = c1.OooO0O0(getContext(), o000oo1, i);
        }
        int i2 = o000OO.TextInputLayout_startIconTintMode;
        if (o000oo1.OooOO0o(i2)) {
            this.f18107OooO = com.google.android.material.internal.oo0o0Oo.OooO0oO(o000oo1.OooO0oo(i2, -1), null);
        }
        int i3 = o000OO.TextInputLayout_startIconDrawable;
        if (o000oo1.OooOO0o(i3)) {
            OooO00o(o000oo1.OooO0o0(i3));
            int i4 = o000OO.TextInputLayout_startIconContentDescription;
            if (o000oo1.OooOO0o(i4) && checkableImageButton.getContentDescription() != (charSequenceOooOO0O = o000oo1.OooOO0O(i4))) {
                checkableImageButton.setContentDescription(charSequenceOooOO0O);
            }
            checkableImageButton.setCheckable(o000oo1.OooO00o(o000OO.TextInputLayout_startIconCheckable, true));
        }
        int iOooO0Oo = o000oo1.OooO0Oo(o000OO.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(o00000O.mtrl_min_touch_target_size));
        if (iOooO0Oo < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iOooO0Oo != this.f18113OooOO0) {
            this.f18113OooOO0 = iOooO0Oo;
            checkableImageButton.setMinimumWidth(iOooO0Oo);
            checkableImageButton.setMinimumHeight(iOooO0Oo);
        }
        int i5 = o000OO.TextInputLayout_startIconScaleType;
        if (o000oo1.OooOO0o(i5)) {
            ImageView.ScaleType scaleTypeOooO0O0 = o00oO0o.OooO0O0(o000oo1.OooO0oo(i5, -1));
            this.f18114OooOO0O = scaleTypeOooO0O0;
            checkableImageButton.setScaleType(scaleTypeOooO0O0);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(o0000Ooo.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOO0O.OooO0o(appCompatTextView, 1);
        appCompatTextView.setTextAppearance(o000oo1.OooO(o000OO.TextInputLayout_prefixTextAppearance, 0));
        int i6 = o000OO.TextInputLayout_prefixTextColor;
        if (o000oo1.OooOO0o(i6)) {
            appCompatTextView.setTextColor(o000oo1.OooO0O0(i6));
        }
        CharSequence charSequenceOooOO0O2 = o000oo1.OooOO0O(o000OO.TextInputLayout_prefixText);
        this.f18109OooO0o = TextUtils.isEmpty(charSequenceOooOO0O2) ? null : charSequenceOooOO0O2;
        appCompatTextView.setText(charSequenceOooOO0O2);
        OooO0Oo();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void OooO00o(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f18111OooO0oO;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f18112OooO0oo;
            PorterDuff.Mode mode = this.f18107OooO;
            TextInputLayout textInputLayout = this.f18108OooO0Oo;
            o00oO0o.OooO00o(textInputLayout, checkableImageButton, colorStateList, mode);
            OooO0O0(true);
            o00oO0o.OooO0OO(textInputLayout, checkableImageButton, this.f18112OooO0oo);
            return;
        }
        OooO0O0(false);
        View.OnLongClickListener onLongClickListener = this.f18115OooOO0o;
        checkableImageButton.setOnClickListener(null);
        o00oO0o.OooO0Oo(checkableImageButton, onLongClickListener);
        this.f18115OooOO0o = null;
        checkableImageButton.setOnLongClickListener(null);
        o00oO0o.OooO0Oo(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void OooO0O0(boolean z) {
        CheckableImageButton checkableImageButton = this.f18111OooO0oO;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            OooO0OO();
            OooO0Oo();
        }
    }

    public final void OooO0OO() {
        EditText editText = this.f18108OooO0Oo.f17986OooO0oO;
        if (editText == null) {
            return;
        }
        int iOooO0o = 0;
        if (!(this.f18111OooO0oO.getVisibility() == 0)) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            iOooO0o = ViewCompat.OooO.OooO0o(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(o00000O.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
        ViewCompat.OooO.OooOO0O(this.f18110OooO0o0, iOooO0o, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void OooO0Oo() {
        int i = (this.f18109OooO0o == null || this.f18116OooOOO0) ? 8 : 0;
        setVisibility(this.f18111OooO0oO.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.f18110OooO0o0.setVisibility(i);
        this.f18108OooO0Oo.OooOOOo();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0OO();
    }
}
