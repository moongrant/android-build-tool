package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o000O00O;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000OO;
import p270o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOo00 f18064OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f18065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f18066OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f18067OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public AutoCompleteTextView f18068OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOo f18069OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Oooo000 f18070OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f18071OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f18072OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f18073OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f18074OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public AccessibilityManager f18075OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ValueAnimator f18076OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ValueAnimator f18077OooOOo0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.OooOo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.Oooo000] */
    public o00Oo0(@NonNull o00Ooo o00ooo2) {
        super(o00ooo2);
        this.f18064OooO = new OooOo00(this, 0);
        this.f18069OooOO0 = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.OooOo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                o00Oo0 o00oo1 = this.f17973OooO00o;
                o00oo1.f18071OooOO0o = z;
                o00oo1.OooOOo0();
                if (z) {
                    return;
                }
                o00oo1.OooOo00(false);
                o00oo1.f18073OooOOO0 = false;
            }
        };
        this.f18070OooOO0O = new o0000O.OooO0o() { // from class: com.google.android.material.textfield.Oooo000
            @Override // o0000O.OooO0o
            public final void onTouchExplorationStateChanged(boolean z) {
                o00Oo0 o00oo1 = this.f17977OooO0Oo;
                AutoCompleteTextView autoCompleteTextView = o00oo1.f18068OooO0oo;
                if (autoCompleteTextView != null) {
                    if (autoCompleteTextView.getInputType() != 0) {
                        return;
                    }
                    int i = z ? 2 : 1;
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    ViewCompat.OooO0o.OooOOoo(o00oo1.f18156OooO0Oo, i);
                }
            }
        };
        this.f18074OooOOOO = LongCompanionObject.MAX_VALUE;
        Context context = o00ooo2.getContext();
        int i = o00000.motionDurationShort3;
        this.f18065OooO0o = o0O00OO.OooO00o.OooO0OO(i, context, 67);
        this.f18066OooO0o0 = o0O00OO.OooO00o.OooO0OO(i, o00ooo2.getContext(), 50);
        this.f18067OooO0oO = o0O00OO.OooO00o.OooO0Oo(o00ooo2.getContext(), o00000.motionEasingLinearInterpolator, o0O000.OooO0O0.f41571OooO00o);
    }

    @Override // com.google.android.material.textfield.oo000o
    public final boolean OooO(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooO00o() {
        if (this.f18075OooOOOo.isTouchExplorationEnabled()) {
            if ((this.f18068OooO0oo.getInputType() != 0) && !this.f18156OooO0Oo.hasFocus()) {
                this.f18068OooO0oo.dismissDropDown();
            }
        }
        this.f18068OooO0oo.post(new o000O00O(this, 2));
    }

    @Override // com.google.android.material.textfield.oo000o
    public final int OooO0OO() {
        return o0000O0.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final int OooO0Oo() {
        return o00000OO.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final View.OnClickListener OooO0o() {
        return this.f18064OooO;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final View.OnFocusChangeListener OooO0o0() {
        return this.f18069OooOO0;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final o0000O.OooO0o OooO0oo() {
        return this.f18070OooOO0O;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final boolean OooOO0() {
        return this.f18071OooOO0o;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final boolean OooOO0o() {
        return this.f18072OooOOO;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOO(@NonNull o0000O.o0Oo0oo o0oo0oo2) {
        boolean zIsShowingHintText = true;
        if (!(this.f18068OooO0oo.getInputType() != 0)) {
            o0oo0oo2.OooOO0(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            zIsShowingHintText = o0oo0oo2.f34022OooO00o.isShowingHintText();
        } else {
            Bundle bundleOooO00o = o0000O.o0Oo0oo.OooO0O0.OooO00o(o0oo0oo2.f34022OooO00o);
            if (bundleOooO00o == null || (bundleOooO00o.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                zIsShowingHintText = false;
            }
        }
        if (zIsShowingHintText) {
            o0oo0oo2.OooOOO(null);
        }
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOO0(@Nullable EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f18068OooO0oo = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.o000oOoO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o00Oo0 o00oo1 = this.f18062OooO0Oo;
                o00oo1.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - o00oo1.f18074OooOOOO;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        o00oo1.f18073OooOOO0 = false;
                    }
                    o00oo1.OooOo0();
                    o00oo1.f18073OooOOO0 = true;
                    o00oo1.f18074OooOOOO = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f18068OooO0oo.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.o0OoOo0
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                o00Oo0 o00oo1 = this.f18119OooO00o;
                o00oo1.f18073OooOOO0 = true;
                o00oo1.f18074OooOOOO = System.currentTimeMillis();
                o00oo1.OooOo00(false);
            }
        });
        this.f18068OooO0oo.setThreshold(0);
        TextInputLayout textInputLayout = this.f18153OooO00o;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!(editText.getInputType() != 0) && this.f18075OooOOOo.isTouchExplorationEnabled()) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOoo(this.f18156OooO0Oo, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.oo000o
    @SuppressLint({"WrongConstant"})
    public final void OooOOOO(@NonNull AccessibilityEvent accessibilityEvent) {
        if (this.f18075OooOOOo.isEnabled()) {
            boolean z = false;
            if (this.f18068OooO0oo.getInputType() != 0) {
                return;
            }
            if (accessibilityEvent.getEventType() == 32768 && this.f18072OooOOO && !this.f18068OooO0oo.isPopupShowing()) {
                z = true;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                OooOo0();
                this.f18073OooOOO0 = true;
                this.f18074OooOOOO = System.currentTimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f18067OooO0oO;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f18065OooO0o);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.Oooo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o00Oo0 o00oo1 = this.f17976OooO0Oo;
                o00oo1.getClass();
                o00oo1.f18156OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f18076OooOOo = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f18066OooO0o0);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.Oooo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o00Oo0 o00oo1 = this.f17976OooO0Oo;
                o00oo1.getClass();
                o00oo1.f18156OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f18077OooOOo0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new o00O0O(this));
        this.f18075OooOOOo = (AccessibilityManager) this.f18155OooO0OO.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.oo000o
    @SuppressLint({"ClickableViewAccessibility"})
    public final void OooOOoo() {
        AutoCompleteTextView autoCompleteTextView = this.f18068OooO0oo;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f18068OooO0oo.setOnDismissListener(null);
        }
    }

    public final void OooOo0() {
        if (this.f18068OooO0oo == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f18074OooOOOO;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f18073OooOOO0 = false;
        }
        if (this.f18073OooOOO0) {
            this.f18073OooOOO0 = false;
            return;
        }
        OooOo00(!this.f18072OooOOO);
        if (!this.f18072OooOOO) {
            this.f18068OooO0oo.dismissDropDown();
        } else {
            this.f18068OooO0oo.requestFocus();
            this.f18068OooO0oo.showDropDown();
        }
    }

    public final void OooOo00(boolean z) {
        if (this.f18072OooOOO != z) {
            this.f18072OooOOO = z;
            this.f18076OooOOo.cancel();
            this.f18077OooOOo0.start();
        }
    }
}
