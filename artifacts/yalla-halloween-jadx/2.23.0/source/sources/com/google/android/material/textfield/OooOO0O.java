package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.material.TextFieldImplKt;
import com.google.android.material.internal.CheckableImageButton;
import p029Oooo0oo.o0O00O0o;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000OO;
import p270o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public EditText f17961OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f17962OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f17963OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f17964OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f17965OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0OO f17966OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0o f17967OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public AnimatorSet f17968OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ValueAnimator f17969OooOOO0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.textfield.OooO0OO] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.OooO0o] */
    public OooOO0O(@NonNull o00Ooo o00ooo2) {
        super(o00ooo2);
        this.f17966OooOO0 = new View.OnClickListener() { // from class: com.google.android.material.textfield.OooO0OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooOO0O oooOO0O = this.f17958OooO0Oo;
                EditText editText = oooOO0O.f17961OooO;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                oooOO0O.OooOOo0();
            }
        };
        this.f17967OooOO0O = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.OooO0o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                OooOO0O oooOO0O = this.f17959OooO00o;
                oooOO0O.OooOo00(oooOO0O.OooOo0());
            }
        };
        Context context = o00ooo2.getContext();
        int i = o00000.motionDurationShort3;
        this.f17963OooO0o0 = o0O00OO.OooO00o.OooO0OO(i, context, 100);
        this.f17962OooO0o = o0O00OO.OooO00o.OooO0OO(i, o00ooo2.getContext(), TextFieldImplKt.AnimationDuration);
        this.f17964OooO0oO = o0O00OO.OooO00o.OooO0Oo(o00ooo2.getContext(), o00000.motionEasingLinearInterpolator, o0O000.OooO0O0.f41571OooO00o);
        this.f17965OooO0oo = o0O00OO.OooO00o.OooO0Oo(o00ooo2.getContext(), o00000.motionEasingEmphasizedInterpolator, o0O000.OooO0O0.f41574OooO0Oo);
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooO00o() {
        if (this.f18154OooO0O0.f18093OooOOoo != null) {
            return;
        }
        OooOo00(OooOo0());
    }

    @Override // com.google.android.material.textfield.oo000o
    public final int OooO0OO() {
        return o0000O0.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final int OooO0Oo() {
        return o00000OO.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final View.OnClickListener OooO0o() {
        return this.f17966OooOO0;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final View.OnFocusChangeListener OooO0o0() {
        return this.f17967OooOO0O;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final View.OnFocusChangeListener OooO0oO() {
        return this.f17967OooOO0O;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOO0(@Nullable EditText editText) {
        this.f17961OooO = editText;
        this.f18153OooO00o.setEndIconVisible(OooOo0());
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOOo(boolean z) {
        if (this.f18154OooO0O0.f18093OooOOoo == null) {
            return;
        }
        OooOo00(z);
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f17965OooO0oo);
        valueAnimatorOfFloat.setDuration(this.f17962OooO0o);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.OooO00o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OooOO0O oooOO0O = this.f17956OooO0Oo;
                oooOO0O.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = oooOO0O.f18156OooO0Oo;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f17964OooO0oO;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.f17963OooO0o0;
        valueAnimatorOfFloat2.setDuration(i);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.OooO0O0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OooOO0O oooOO0O = this.f17957OooO0Oo;
                oooOO0O.getClass();
                oooOO0O.f18156OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17968OooOO0o = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f17968OooOO0o.addListener(new OooO(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.OooO0O0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OooOO0O oooOO0O = this.f17957OooO0Oo;
                oooOO0O.getClass();
                oooOO0O.f18156OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f17969OooOOO0 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new OooOO0(this));
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOoo() {
        EditText editText = this.f17961OooO;
        if (editText != null) {
            editText.post(new o0O00O0o(this, 1));
        }
    }

    public final boolean OooOo0() {
        EditText editText = this.f17961OooO;
        return editText != null && (editText.hasFocus() || this.f18156OooO0Oo.hasFocus()) && this.f17961OooO.getText().length() > 0;
    }

    public final void OooOo00(boolean z) {
        boolean z2 = this.f18154OooO0O0.OooO0OO() == z;
        if (z && !this.f17968OooOO0o.isRunning()) {
            this.f17969OooOOO0.cancel();
            this.f17968OooOO0o.start();
            if (z2) {
                this.f17968OooOO0o.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f17968OooOO0o.cancel();
        this.f17969OooOOO0.start();
        if (z2) {
            this.f17969OooOOO0.end();
        }
    }
}
