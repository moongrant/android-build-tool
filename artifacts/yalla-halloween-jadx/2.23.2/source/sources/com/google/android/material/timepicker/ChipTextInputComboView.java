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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.o0Oo0oo;
import com.google.android.material.internal.oo000o;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p272o0O0000o.o0000O00;
import p272o0O0000o.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Chip f17684OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final EditText f17685OooO0o0;

    public class OooO00o extends oo000o {
        public OooO00o() {
        }

        @Override // com.google.android.material.internal.oo000o, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (zIsEmpty) {
                chipTextInputComboView.f17684OooO0Oo.setText(ChipTextInputComboView.OooO00o(chipTextInputComboView, "00"));
                return;
            }
            String strOooO00o = ChipTextInputComboView.OooO00o(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f17684OooO0Oo;
            if (TextUtils.isEmpty(strOooO00o)) {
                strOooO00o = ChipTextInputComboView.OooO00o(chipTextInputComboView, "00");
            }
            chip.setText(strOooO00o);
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static String OooO00o(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f17684OooO0Oo.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17685OooO0o0.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip = this.f17684OooO0Oo;
        chip.setChecked(z);
        int i = z ? 0 : 4;
        EditText editText = this.f17685OooO0o0;
        editText.setVisibility(i);
        chip.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new o0Oo0oo(editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f17684OooO0Oo.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f17684OooO0Oo.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f17684OooO0Oo.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(o0000O00.material_time_chip, (ViewGroup) this, false);
        this.f17684OooO0Oo = chip;
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(o0000O00.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f17685OooO0o0 = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new OooO00o());
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(o0000Ooo.material_label);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        editText.setId(ViewCompat.OooO.OooO00o());
        ViewCompat.OooO.OooO0oo(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
