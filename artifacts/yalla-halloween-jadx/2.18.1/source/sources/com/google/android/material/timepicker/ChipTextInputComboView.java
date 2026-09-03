package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.Oooo0;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.textfield.TextInputLayout;
import p337o0OO0o0.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Chip f18037Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final EditText f18038Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO00o f18039Oooo0oo;

    public class OooO00o extends Oooo0 {
        public OooO00o() {
        }

        @Override // com.google.android.material.internal.Oooo0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f18037Oooo0o.setText(ChipTextInputComboView.OooO00o(chipTextInputComboView, "00"));
            } else {
                ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
                chipTextInputComboView2.f18037Oooo0o.setText(ChipTextInputComboView.OooO00o(chipTextInputComboView2, editable));
            }
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static String OooO00o(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void OooO0O0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f18038Oooo0oO.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18037Oooo0o.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooO0O0();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        this.f18037Oooo0o.setChecked(z);
        this.f18038Oooo0oO.setVisibility(z ? 0 : 4);
        this.f18037Oooo0o.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            o00Ooo.OooO0oo(this.f18038Oooo0oO);
            if (TextUtils.isEmpty(this.f18038Oooo0oO.getText())) {
                return;
            }
            EditText editText = this.f18038Oooo0oO;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f18037Oooo0o.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f18037Oooo0o.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f18037Oooo0o.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(OooOOOO.material_time_chip, (ViewGroup) this, false);
        this.f18037Oooo0o = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(OooOOOO.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f18038Oooo0oO = editText;
        editText.setVisibility(4);
        OooO00o oooO00o = new OooO00o();
        this.f18039Oooo0oo = oooO00o;
        editText.addTextChangedListener(oooO00o);
        OooO0O0();
        addView(chip);
        addView(textInputLayout);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
