package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinearLayout f18120OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f18121OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f18122OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f18123OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f18124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f18125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f18126OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Context f18127OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18128OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f18129OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public FrameLayout f18130OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Animator f18131OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f18132OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f18133OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f18134OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public CharSequence f18135OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f18136OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f18137OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public CharSequence f18138OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f18139OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f18140OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f18141OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f18142OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CharSequence f18143OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f18144OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f18145OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f18146OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Typeface f18147OooOoo0;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f18148OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f18149OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TextView f18150OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f18151OooO0oO;

        public OooO00o(int i, TextView textView, int i2, TextView textView2) {
            this.f18148OooO0Oo = i;
            this.f18150OooO0o0 = textView;
            this.f18149OooO0o = i2;
            this.f18151OooO0oO = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i = this.f18148OooO0Oo;
            o0ooOOo o0ooooo = o0ooOOo.this;
            o0ooooo.f18132OooOOO = i;
            o0ooooo.f18131OooOO0o = null;
            TextView textView = this.f18150OooO0o0;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f18149OooO0o == 1 && (appCompatTextView = o0ooooo.f18136OooOOo) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f18151OooO0oO;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f18151OooO0oO;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public o0ooOOo(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f18127OooO0oO = context;
        this.f18128OooO0oo = textInputLayout;
        this.f18133OooOOO0 = context.getResources().getDimensionPixelSize(o00000O.design_textinput_caption_translate_y);
        int i = o00000.motionDurationShort4;
        this.f18121OooO00o = o0O00OO.OooO00o.OooO0OO(i, context, 217);
        this.f18122OooO0O0 = o0O00OO.OooO00o.OooO0OO(o00000.motionDurationMedium4, context, 167);
        this.f18123OooO0OO = o0O00OO.OooO00o.OooO0OO(i, context, 167);
        int i2 = o00000.motionEasingEmphasizedDecelerateInterpolator;
        this.f18124OooO0Oo = o0O00OO.OooO00o.OooO0Oo(context, i2, o0O000.OooO0O0.f41574OooO0Oo);
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f41571OooO00o;
        this.f18126OooO0o0 = o0O00OO.OooO00o.OooO0Oo(context, i2, linearInterpolator);
        this.f18125OooO0o = o0O00OO.OooO00o.OooO0Oo(context, o00000.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void OooO(int i, int i2, boolean z) {
        TextView textViewOooO0o0;
        TextView textViewOooO0o1;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f18131OooOO0o = animatorSet;
            ArrayList arrayList = new ArrayList();
            OooO0Oo(arrayList, this.f18139OooOo, this.f18145OooOoO0, 2, i, i2);
            OooO0Oo(arrayList, this.f18137OooOOo0, this.f18136OooOOo, 1, i, i2);
            o0O000.OooO0OO.OooO00o(animatorSet, arrayList);
            animatorSet.addListener(new OooO00o(i2, OooO0o0(i), i, OooO0o0(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewOooO0o1 = OooO0o0(i2)) != null) {
                textViewOooO0o1.setVisibility(0);
                textViewOooO0o1.setAlpha(1.0f);
            }
            if (i != 0 && (textViewOooO0o0 = OooO0o0(i)) != null) {
                textViewOooO0o0.setVisibility(4);
                if (i == 1) {
                    textViewOooO0o0.setText((CharSequence) null);
                }
            }
            this.f18132OooOOO = i2;
        }
        TextInputLayout textInputLayout = this.f18128OooO0oo;
        textInputLayout.OooOOo0();
        textInputLayout.OooOo00(z, false);
        textInputLayout.OooOo0o();
    }

    public final void OooO00o(TextView textView, int i) {
        if (this.f18120OooO == null && this.f18130OooOO0O == null) {
            Context context = this.f18127OooO0oO;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f18120OooO = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f18120OooO;
            TextInputLayout textInputLayout = this.f18128OooO0oo;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f18130OooOO0O = new FrameLayout(context);
            this.f18120OooO.addView(this.f18130OooOO0O, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                OooO0O0();
            }
        }
        if (i == 0 || i == 1) {
            this.f18130OooOO0O.setVisibility(0);
            this.f18130OooOO0O.addView(textView);
        } else {
            this.f18120OooO.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f18120OooO.setVisibility(0);
        this.f18129OooOO0++;
    }

    public final void OooO0O0() {
        LinearLayout linearLayout = this.f18120OooO;
        TextInputLayout textInputLayout = this.f18128OooO0oo;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f18127OooO0oO;
            boolean zOooO0o0 = c1.OooO0o0(context);
            LinearLayout linearLayout2 = this.f18120OooO;
            int i = o00000O.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            int iOooO0o = ViewCompat.OooO.OooO0o(editText);
            if (zOooO0o0) {
                iOooO0o = context.getResources().getDimensionPixelSize(i);
            }
            int i2 = o00000O.material_helper_text_font_1_3_padding_top;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(o00000O.material_helper_text_default_padding_top);
            if (zOooO0o0) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            }
            int iOooO0o0 = ViewCompat.OooO.OooO0o0(editText);
            if (zOooO0o0) {
                iOooO0o0 = context.getResources().getDimensionPixelSize(i);
            }
            ViewCompat.OooO.OooOO0O(linearLayout2, iOooO0o, dimensionPixelSize, iOooO0o0, 0);
        }
    }

    public final void OooO0OO() {
        Animator animator = this.f18131OooOO0o;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void OooO0Oo(@NonNull ArrayList arrayList, boolean z, @Nullable TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f18123OooO0OO;
            objectAnimatorOfFloat.setDuration(z2 ? this.f18122OooO0O0 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f18126OooO0o0 : this.f18125OooO0o);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f18133OooOOO0, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f18121OooO00o);
            objectAnimatorOfFloat2.setInterpolator(this.f18124OooO0Oo);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final void OooO0o() {
        this.f18135OooOOOo = null;
        OooO0OO();
        if (this.f18132OooOOO == 1) {
            if (!this.f18139OooOo || TextUtils.isEmpty(this.f18143OooOo0o)) {
                this.f18134OooOOOO = 0;
            } else {
                this.f18134OooOOOO = 2;
            }
        }
        OooO(this.f18132OooOOO, this.f18134OooOOOO, OooO0oo(this.f18136OooOOo, ""));
    }

    @Nullable
    public final TextView OooO0o0(int i) {
        if (i == 1) {
            return this.f18136OooOOo;
        }
        if (i != 2) {
            return null;
        }
        return this.f18145OooOoO0;
    }

    public final void OooO0oO(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f18120OooO;
        if (linearLayout == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (!z || (frameLayout = this.f18130OooOO0O) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f18129OooOO0 - 1;
        this.f18129OooOO0 = i2;
        LinearLayout linearLayout2 = this.f18120OooO;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean OooO0oo(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        TextInputLayout textInputLayout = this.f18128OooO0oo;
        return ViewCompat.OooOO0O.OooO0OO(textInputLayout) && textInputLayout.isEnabled() && !(this.f18134OooOOOO == this.f18132OooOOO && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }
}
