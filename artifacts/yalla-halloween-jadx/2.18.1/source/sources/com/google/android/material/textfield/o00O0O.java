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
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o0000O0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.o00Ooo;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class o00O0O extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final CheckableImageButton f18020Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final TextInputLayout f18021Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final AppCompatTextView f18022Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public CharSequence f18023Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f18024OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public PorterDuff.Mode f18025OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ColorStateList f18026OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View.OnLongClickListener f18027OoooO0O;

    public o00O0O(TextInputLayout textInputLayout, o0000O0 o0000o1) {
        super(textInputLayout.getContext());
        this.f18021Oooo0o = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(p337o0OO0o0.OooOOOO.design_text_input_start_icon, (ViewGroup) this, false);
        this.f18020Oooo = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f18022Oooo0oO = appCompatTextView;
        if (o0OOO0O.OooO0OO.OooO0oO(getContext())) {
            o000O0O0.OooOO0.OooO0oO((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        OooO0OO(null);
        OooO0Oo(null);
        int i = p337o0OO0o0.Oooo0.TextInputLayout_startIconTint;
        if (o0000o1.OooOOOo(i)) {
            this.f18026OoooO00 = o0OOO0O.OooO0OO.OooO0O0(getContext(), o0000o1, i);
        }
        int i2 = p337o0OO0o0.Oooo0.TextInputLayout_startIconTintMode;
        if (o0000o1.OooOOOo(i2)) {
            this.f18025OoooO0 = o00Ooo.OooO0oO(o0000o1.OooOO0(i2, -1), null);
        }
        int i3 = p337o0OO0o0.Oooo0.TextInputLayout_startIconDrawable;
        if (o0000o1.OooOOOo(i3)) {
            OooO0O0(o0000o1.OooO0oO(i3));
            int i4 = p337o0OO0o0.Oooo0.TextInputLayout_startIconContentDescription;
            if (o0000o1.OooOOOo(i4)) {
                OooO00o(o0000o1.OooOOOO(i4));
            }
            checkableImageButton.setCheckable(o0000o1.OooO00o(p337o0OO0o0.Oooo0.TextInputLayout_startIconCheckable, true));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(p337o0OO0o0.OooOOO0.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOO0O.OooO0o(appCompatTextView, 1);
        TextViewCompat.OooO0o(appCompatTextView, o0000o1.OooOOO0(p337o0OO0o0.Oooo0.TextInputLayout_prefixTextAppearance, 0));
        int i5 = p337o0OO0o0.Oooo0.TextInputLayout_prefixTextColor;
        if (o0000o1.OooOOOo(i5)) {
            appCompatTextView.setTextColor(o0000o1.OooO0OO(i5));
        }
        CharSequence charSequenceOooOOOO = o0000o1.OooOOOO(p337o0OO0o0.Oooo0.TextInputLayout_prefixText);
        this.f18023Oooo0oo = TextUtils.isEmpty(charSequenceOooOOOO) ? null : charSequenceOooOOOO;
        appCompatTextView.setText(charSequenceOooOOOO);
        OooO0oO();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void OooO00o(@Nullable CharSequence charSequence) {
        if (this.f18020Oooo.getContentDescription() != charSequence) {
            this.f18020Oooo.setContentDescription(charSequence);
        }
    }

    public final void OooO0O0(@Nullable Drawable drawable) {
        this.f18020Oooo.setImageDrawable(drawable);
        if (drawable != null) {
            OooOo.OooO00o(this.f18021Oooo0o, this.f18020Oooo, this.f18026OoooO00, this.f18025OoooO0);
            OooO0o0(true);
            OooOo.OooO0OO(this.f18021Oooo0o, this.f18020Oooo, this.f18026OoooO00);
        } else {
            OooO0o0(false);
            OooO0OO(null);
            OooO0Oo(null);
            OooO00o(null);
        }
    }

    public final void OooO0OO(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f18020Oooo;
        View.OnLongClickListener onLongClickListener = this.f18027OoooO0O;
        checkableImageButton.setOnClickListener(onClickListener);
        OooOo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public final void OooO0Oo(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f18027OoooO0O = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f18020Oooo;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooOo.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public final void OooO0o() {
        EditText editText = this.f18021Oooo0o.f17933OoooO00;
        if (editText == null) {
            return;
        }
        int iOooO0o = 0;
        if (!(this.f18020Oooo.getVisibility() == 0)) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            iOooO0o = ViewCompat.OooO.OooO0o(editText);
        }
        AppCompatTextView appCompatTextView = this.f18022Oooo0oO;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        ViewCompat.OooO.OooOO0O(appCompatTextView, iOooO0o, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void OooO0o0(boolean z) {
        if ((this.f18020Oooo.getVisibility() == 0) != z) {
            this.f18020Oooo.setVisibility(z ? 0 : 8);
            OooO0o();
            OooO0oO();
        }
    }

    public final void OooO0oO() {
        int i = (this.f18023Oooo0oo == null || this.f18024OoooO) ? 8 : 0;
        setVisibility(this.f18020Oooo.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.f18022Oooo0oO.setVisibility(i);
        this.f18021Oooo0o.OooOo0O();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0o();
    }
}
