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
import androidx.core.view.o000OOo0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinearLayout f17651OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f17652OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f17653OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f17654OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f17655OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f17656OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f17657OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Context f17658OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f17659OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17660OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public FrameLayout f17661OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Animator f17662OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f17663OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f17664OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f17665OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public CharSequence f17666OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17667OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f17668OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public CharSequence f17669OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f17670OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f17671OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f17672OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f17673OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CharSequence f17674OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f17675OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17676OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17677OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Typeface f17678OooOoo0;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f17679OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f17680OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TextView f17681OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f17682OooO0oO;

        public OooO00o(int i, TextView textView, int i2, TextView textView2) {
            this.f17679OooO0Oo = i;
            this.f17681OooO0o0 = textView;
            this.f17680OooO0o = i2;
            this.f17682OooO0oO = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i = this.f17679OooO0Oo;
            oo000o oo000oVar = oo000o.this;
            oo000oVar.f17663OooOOO = i;
            oo000oVar.f17662OooOO0o = null;
            TextView textView = this.f17681OooO0o0;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f17680OooO0o == 1 && (appCompatTextView = oo000oVar.f17667OooOOo) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f17682OooO0oO;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f17682OooO0oO;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public oo000o(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f17658OooO0oO = context;
        this.f17659OooO0oo = textInputLayout;
        this.f17664OooOOO0 = context.getResources().getDimensionPixelSize(o00000O.design_textinput_caption_translate_y);
        int i = o00000.motionDurationShort4;
        this.f17652OooO00o = o0O00OOO.OooO00o.OooO0OO(i, context, 217);
        this.f17653OooO0O0 = o0O00OOO.OooO00o.OooO0OO(o00000.motionDurationMedium4, context, 167);
        this.f17654OooO0OO = o0O00OOO.OooO00o.OooO0OO(i, context, 167);
        int i2 = o00000.motionEasingEmphasizedDecelerateInterpolator;
        this.f17655OooO0Oo = o0O00OOO.OooO00o.OooO0Oo(context, i2, o0O000.OooO0O0.f40883OooO0Oo);
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
        this.f17657OooO0o0 = o0O00OOO.OooO00o.OooO0Oo(context, i2, linearInterpolator);
        this.f17656OooO0o = o0O00OOO.OooO00o.OooO0Oo(context, o00000.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void OooO(int i, int i2, boolean z) {
        TextView textViewOooO0o0;
        TextView textViewOooO0o1;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f17662OooOO0o = animatorSet;
            ArrayList arrayList = new ArrayList();
            OooO0Oo(arrayList, this.f17670OooOo, this.f17676OooOoO0, 2, i, i2);
            OooO0Oo(arrayList, this.f17668OooOOo0, this.f17667OooOOo, 1, i, i2);
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
            this.f17663OooOOO = i2;
        }
        TextInputLayout textInputLayout = this.f17659OooO0oo;
        textInputLayout.OooOOo0();
        textInputLayout.OooOo00(z, false);
        textInputLayout.OooOo0o();
    }

    public final void OooO00o(TextView textView, int i) {
        if (this.f17651OooO == null && this.f17661OooOO0O == null) {
            Context context = this.f17658OooO0oO;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f17651OooO = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f17651OooO;
            TextInputLayout textInputLayout = this.f17659OooO0oo;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f17661OooOO0O = new FrameLayout(context);
            this.f17651OooO.addView(this.f17661OooOO0O, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                OooO0O0();
            }
        }
        if (i == 0 || i == 1) {
            this.f17661OooOO0O.setVisibility(0);
            this.f17661OooOO0O.addView(textView);
        } else {
            this.f17651OooO.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f17651OooO.setVisibility(0);
        this.f17660OooOO0++;
    }

    public final void OooO0O0() {
        LinearLayout linearLayout = this.f17651OooO;
        TextInputLayout textInputLayout = this.f17659OooO0oo;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f17658OooO0oO;
            boolean zOooO0o0 = p276o0O00OoO.OooO0o.OooO0o0(context);
            LinearLayout linearLayout2 = this.f17651OooO;
            int i = o00000O.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
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
        Animator animator = this.f17662OooOO0o;
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
            int i4 = this.f17654OooO0OO;
            objectAnimatorOfFloat.setDuration(z2 ? this.f17653OooO0O0 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f17657OooO0o0 : this.f17656OooO0o);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f17664OooOOO0, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f17652OooO00o);
            objectAnimatorOfFloat2.setInterpolator(this.f17655OooO0Oo);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final void OooO0o() {
        this.f17666OooOOOo = null;
        OooO0OO();
        if (this.f17663OooOOO == 1) {
            if (!this.f17670OooOo || TextUtils.isEmpty(this.f17674OooOo0o)) {
                this.f17665OooOOOO = 0;
            } else {
                this.f17665OooOOOO = 2;
            }
        }
        OooO(this.f17663OooOOO, this.f17665OooOOOO, OooO0oo(this.f17667OooOOo, ""));
    }

    @Nullable
    public final TextView OooO0o0(int i) {
        if (i == 1) {
            return this.f17667OooOOo;
        }
        if (i != 2) {
            return null;
        }
        return this.f17676OooOoO0;
    }

    public final void OooO0oO(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f17651OooO;
        if (linearLayout == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (!z || (frameLayout = this.f17661OooOO0O) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f17660OooOO0 - 1;
        this.f17660OooOO0 = i2;
        LinearLayout linearLayout2 = this.f17651OooO;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean OooO0oo(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        TextInputLayout textInputLayout = this.f17659OooO0oo;
        return ViewCompat.OooOO0O.OooO0OO(textInputLayout) && textInputLayout.isEnabled() && !(this.f17665OooOOOO == this.f17663OooOOO && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }
}
