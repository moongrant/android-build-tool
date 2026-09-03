package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f17898OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f17899OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f17900OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LinearLayout f17901OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f17902OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Animator f17903OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public FrameLayout f17904OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f17905OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f17906OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public CharSequence f17907OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f17908OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17909OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f17910OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public CharSequence f17911OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17912OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public CharSequence f17913OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f17914OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f17915OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f17916OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Typeface f17917OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ColorStateList f17918OooOo00;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ TextView f17919Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f17920Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f17921Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f17922Oooo0oo;

        public OooO00o(int i, TextView textView, int i2, TextView textView2) {
            this.f17920Oooo0o = i;
            this.f17921Oooo0oO = textView;
            this.f17922Oooo0oo = i2;
            this.f17919Oooo = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            Oooo000 oooo000 = Oooo000.this;
            oooo000.f17906OooO0oo = this.f17920Oooo0o;
            oooo000.f17903OooO0o = null;
            TextView textView = this.f17921Oooo0oO;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f17922Oooo0oo == 1 && (appCompatTextView = Oooo000.this.f17909OooOO0o) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f17919Oooo;
            if (textView2 != null) {
                textView2.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                this.f17919Oooo.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f17919Oooo;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public Oooo000(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f17899OooO00o = context;
        this.f17900OooO0O0 = textInputLayout;
        this.f17905OooO0oO = context.getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.design_textinput_caption_translate_y);
    }

    public final void OooO() {
        this.f17907OooOO0 = null;
        OooO0OO();
        if (this.f17906OooO0oo == 1) {
            if (!this.f17915OooOOo0 || TextUtils.isEmpty(this.f17913OooOOOo)) {
                this.f17898OooO = 0;
            } else {
                this.f17898OooO = 2;
            }
        }
        OooOO0o(this.f17906OooO0oo, this.f17898OooO, OooOO0O(this.f17909OooOO0o, ""));
    }

    public final void OooO00o(TextView textView, int i) {
        if (this.f17901OooO0OO == null && this.f17904OooO0o0 == null) {
            LinearLayout linearLayout = new LinearLayout(this.f17899OooO00o);
            this.f17901OooO0OO = linearLayout;
            linearLayout.setOrientation(0);
            this.f17900OooO0O0.addView(this.f17901OooO0OO, -1, -2);
            this.f17904OooO0o0 = new FrameLayout(this.f17899OooO00o);
            this.f17901OooO0OO.addView(this.f17904OooO0o0, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f17900OooO0O0.getEditText() != null) {
                OooO0O0();
            }
        }
        if (i == 0 || i == 1) {
            this.f17904OooO0o0.setVisibility(0);
            this.f17904OooO0o0.addView(textView);
        } else {
            this.f17901OooO0OO.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f17901OooO0OO.setVisibility(0);
        this.f17902OooO0Oo++;
    }

    public final void OooO0O0() {
        if ((this.f17901OooO0OO == null || this.f17900OooO0O0.getEditText() == null) ? false : true) {
            EditText editText = this.f17900OooO0O0.getEditText();
            boolean zOooO0oO = o0OOO0O.OooO0OO.OooO0oO(this.f17899OooO00o);
            LinearLayout linearLayout = this.f17901OooO0OO;
            int i = p337o0OO0o0.OooOO0.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO.OooOO0O(linearLayout, OooO0oo(zOooO0oO, i, ViewCompat.OooO.OooO0o(editText)), OooO0oo(zOooO0oO, p337o0OO0o0.OooOO0.material_helper_text_font_1_3_padding_top, this.f17899OooO00o.getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.material_helper_text_default_padding_top)), OooO0oo(zOooO0oO, i, ViewCompat.OooO.OooO0o0(editText)), 0);
        }
    }

    public final void OooO0OO() {
        Animator animator = this.f17903OooO0o;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void OooO0Oo(@NonNull List<Animator> list, boolean z, @Nullable TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(p338o0OO0o0O.OooO0o.f37972OooO00o);
            list.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f17905OooO0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(p338o0OO0o0O.OooO0o.f37975OooO0Oo);
                list.add(objectAnimatorOfFloat2);
            }
        }
    }

    @Nullable
    public final TextView OooO0o(int i) {
        if (i == 1) {
            return this.f17909OooOO0o;
        }
        if (i != 2) {
            return null;
        }
        return this.f17914OooOOo;
    }

    public final boolean OooO0o0() {
        return (this.f17898OooO != 1 || this.f17909OooOO0o == null || TextUtils.isEmpty(this.f17907OooOO0)) ? false : true;
    }

    @ColorInt
    public final int OooO0oO() {
        AppCompatTextView appCompatTextView = this.f17909OooOO0o;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public final int OooO0oo(boolean z, @DimenRes int i, int i2) {
        return z ? this.f17899OooO00o.getResources().getDimensionPixelSize(i) : i2;
    }

    public final void OooOO0(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f17901OooO0OO;
        if (linearLayout == null) {
            return;
        }
        if (!(i == 0 || i == 1) || (frameLayout = this.f17904OooO0o0) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f17902OooO0Oo - 1;
        this.f17902OooO0Oo = i2;
        LinearLayout linearLayout2 = this.f17901OooO0OO;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean OooOO0O(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f17900OooO0O0;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooOO0O.OooO0OO(textInputLayout) && this.f17900OooO0O0.isEnabled() && !(this.f17898OooO == this.f17906OooO0oo && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void OooOO0o(int i, int i2, boolean z) {
        TextView textViewOooO0o;
        TextView textViewOooO0o2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f17903OooO0o = animatorSet;
            ArrayList arrayList = new ArrayList();
            OooO0Oo(arrayList, this.f17915OooOOo0, this.f17914OooOOo, 2, i, i2);
            OooO0Oo(arrayList, this.f17908OooOO0O, this.f17909OooOO0o, 1, i, i2);
            p338o0OO0o0O.OooO.OooO00o(animatorSet, arrayList);
            animatorSet.addListener(new OooO00o(i2, OooO0o(i), i, OooO0o(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewOooO0o2 = OooO0o(i2)) != null) {
                textViewOooO0o2.setVisibility(0);
                textViewOooO0o2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewOooO0o = OooO0o(i)) != null) {
                textViewOooO0o.setVisibility(4);
                if (i == 1) {
                    textViewOooO0o.setText((CharSequence) null);
                }
            }
            this.f17906OooO0oo = i2;
        }
        this.f17900OooO0O0.OooOo0o();
        this.f17900OooO0O0.OooOoOO(z, false);
        this.f17900OooO0O0.Oooo000();
    }
}
