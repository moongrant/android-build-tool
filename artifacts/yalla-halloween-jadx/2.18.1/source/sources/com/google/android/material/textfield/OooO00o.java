package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public AnimatorSet f17843OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f17844OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C0113OooO00o f17845OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0OO f17846OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0o f17847OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ValueAnimator f17848OooOO0;

    public class OooO implements View.OnClickListener {
        public OooO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Editable text = OooO00o.this.f17893OooO00o.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            OooO00o.this.f17893OooO00o.OooOOOo();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0113OooO00o implements TextWatcher {
        public C0113OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            if (OooO00o.this.f17893OooO00o.getSuffixText() != null) {
                return;
            }
            OooO00o oooO00o = OooO00o.this;
            oooO00o.OooO0o0(OooO00o.OooO0Oo(oooO00o));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class OooO0O0 implements View.OnFocusChangeListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.OooO0o0(OooO00o.OooO0Oo(oooO00o));
        }
    }

    public class OooO0OO implements TextInputLayout.OooOO0 {
        public OooO0OO() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0
        public final void OooO00o(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(OooO00o.OooO0Oo(OooO00o.this));
            editText.setOnFocusChangeListener(OooO00o.this.f17844OooO0o);
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f17895OooO0OO.setOnFocusChangeListener(oooO00o.f17844OooO0o);
            editText.removeTextChangedListener(OooO00o.this.f17845OooO0o0);
            editText.addTextChangedListener(OooO00o.this.f17845OooO0o0);
        }
    }

    public class OooO0o implements TextInputLayout.OooOO0O {

        /* JADX INFO: renamed from: com.google.android.material.textfield.OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0114OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ EditText f17854Oooo0o;

            public RunnableC0114OooO00o(EditText editText) {
                this.f17854Oooo0o = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f17854Oooo0o.removeTextChangedListener(OooO00o.this.f17845OooO0o0);
                OooO00o.this.OooO0o0(true);
            }
        }

        public OooO0o() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0O
        public final void OooO00o(@NonNull TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC0114OooO00o(editText));
            if (editText.getOnFocusChangeListener() == OooO00o.this.f17844OooO0o) {
                editText.setOnFocusChangeListener(null);
            }
            View.OnFocusChangeListener onFocusChangeListener = OooO00o.this.f17895OooO0OO.getOnFocusChangeListener();
            OooO00o oooO00o = OooO00o.this;
            if (onFocusChangeListener == oooO00o.f17844OooO0o) {
                oooO00o.f17895OooO0OO.setOnFocusChangeListener(null);
            }
        }
    }

    public class OooOO0 implements ValueAnimator.AnimatorUpdateListener {
        public OooOO0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            OooO00o.this.f17895OooO0OO.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public OooO00o(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        super(textInputLayout, i);
        this.f17845OooO0o0 = new C0113OooO00o();
        this.f17844OooO0o = new OooO0O0();
        this.f17846OooO0oO = new OooO0OO();
        this.f17847OooO0oo = new OooO0o();
    }

    public static boolean OooO0Oo(OooO00o oooO00o) {
        EditText editText = oooO00o.f17893OooO00o.getEditText();
        return editText != null && (editText.hasFocus() || oooO00o.f17895OooO0OO.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // com.google.android.material.textfield.OooOo00
    public final void OooO00o() {
        TextInputLayout textInputLayout = this.f17893OooO00o;
        int i = this.f17896OooO0Oo;
        if (i == 0) {
            i = p337o0OO0o0.OooOO0O.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f17893OooO00o;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(p337o0OO0o0.OooOo.clear_text_end_icon_content_description));
        this.f17893OooO00o.setEndIconCheckable(false);
        this.f17893OooO00o.setEndIconOnClickListener(new OooO());
        this.f17893OooO00o.OooO00o(this.f17846OooO0oO);
        this.f17893OooO00o.OooO0O0(this.f17847OooO0oo);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(p338o0OO0o0O.OooO0o.f37975OooO0Oo);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.textfield.OooO0o(this));
        ValueAnimator valueAnimatorOooO0o = OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17843OooO = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOooO0o);
        this.f17843OooO.addListener(new com.google.android.material.textfield.OooO0O0(this));
        ValueAnimator valueAnimatorOooO0o2 = OooO0o(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17848OooOO0 = valueAnimatorOooO0o2;
        valueAnimatorOooO0o2.addListener(new com.google.android.material.textfield.OooO0OO(this));
    }

    @Override // com.google.android.material.textfield.OooOo00
    public final void OooO0OO(boolean z) {
        if (this.f17893OooO00o.getSuffixText() == null) {
            return;
        }
        OooO0o0(z);
    }

    public final ValueAnimator OooO0o(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(p338o0OO0o0O.OooO0o.f37972OooO00o);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new OooOO0());
        return valueAnimatorOfFloat;
    }

    public final void OooO0o0(boolean z) {
        boolean z2 = this.f17893OooO00o.OooOO0O() == z;
        if (z && !this.f17843OooO.isRunning()) {
            this.f17848OooOO0.cancel();
            this.f17843OooO.start();
            if (z2) {
                this.f17843OooO.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f17843OooO.cancel();
        this.f17848OooOO0.start();
        if (z2) {
            this.f17848OooOO0.end();
        }
    }
}
