package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;
import o0000O.o0O0O00;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000OO;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOOO f17637OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f17638OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f17639OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f17640OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public AutoCompleteTextView f17641OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOo00 f17642OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final androidx.compose.ui.graphics.colorspace.OooOO0O f17643OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f17644OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f17645OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f17646OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f17647OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public AccessibilityManager f17648OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ValueAnimator f17649OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ValueAnimator f17650OooOOo0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.OooOo00] */
    public o0OoOo0(@NonNull o00O0O o00o0o2) {
        super(o00o0o2);
        this.f17637OooO = new OooOOOO(this, 0);
        this.f17642OooOO0 = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.OooOo00
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                o0OoOo0 o0oooo1 = this.f17500OooO00o;
                o0oooo1.f17644OooOO0o = z;
                o0oooo1.OooOOo0();
                if (z) {
                    return;
                }
                o0oooo1.OooOo00(false);
                o0oooo1.f17646OooOOO0 = false;
            }
        };
        this.f17643OooOO0O = new androidx.compose.ui.graphics.colorspace.OooOO0O(this);
        this.f17647OooOOOO = LongCompanionObject.MAX_VALUE;
        Context context = o00o0o2.getContext();
        int i = o00000.motionDurationShort3;
        this.f17638OooO0o = o0O00OOO.OooO00o.OooO0OO(i, context, 67);
        this.f17639OooO0o0 = o0O00OOO.OooO00o.OooO0OO(i, o00o0o2.getContext(), 50);
        this.f17640OooO0oO = o0O00OOO.OooO00o.OooO0Oo(o00o0o2.getContext(), o00000.motionEasingLinearInterpolator, o0O000.OooO0O0.f40880OooO00o);
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final boolean OooO(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooO00o() {
        if (this.f17648OooOOOo.isTouchExplorationEnabled()) {
            if ((this.f17641OooO0oo.getInputType() != 0) && !this.f17620OooO0Oo.hasFocus()) {
                this.f17641OooO0oo.dismissDropDown();
            }
        }
        this.f17641OooO0oo.post(new p045Oooooo.o00oO0o(this, 2));
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final int OooO0OO() {
        return o0000O0.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final int OooO0Oo() {
        return o00000OO.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final View.OnClickListener OooO0o() {
        return this.f17637OooO;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final View.OnFocusChangeListener OooO0o0() {
        return this.f17642OooOO0;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final o0000O.OooO0o OooO0oo() {
        return this.f17643OooOO0O;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final boolean OooOO0() {
        return this.f17644OooOO0o;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final boolean OooOO0o() {
        return this.f17645OooOOO;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooOOO(@NonNull o0O0O00 o0o0o00) {
        if (!(this.f17641OooO0oo.getInputType() != 0)) {
            o0o0o00.OooOO0O(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? o0o0o00.f33510OooO00o.isShowingHintText() : o0o0o00.OooO0o0(4)) {
            o0o0o00.OooOOOO(null);
        }
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooOOO0(@Nullable EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f17641OooO0oo = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.Oooo000
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o0OoOo0 o0oooo1 = this.f17502OooO0Oo;
                o0oooo1.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - o0oooo1.f17647OooOOOO;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        o0oooo1.f17646OooOOO0 = false;
                    }
                    o0oooo1.OooOo0();
                    o0oooo1.f17646OooOOO0 = true;
                    o0oooo1.f17647OooOOOO = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f17641OooO0oo.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.Oooo0
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                o0OoOo0 o0oooo1 = this.f17501OooO00o;
                o0oooo1.f17646OooOOO0 = true;
                o0oooo1.f17647OooOOOO = System.currentTimeMillis();
                o0oooo1.OooOo00(false);
            }
        });
        this.f17641OooO0oo.setThreshold(0);
        TextInputLayout textInputLayout = this.f17617OooO00o;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!(editText.getInputType() != 0) && this.f17648OooOOOo.isTouchExplorationEnabled()) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOoo(this.f17620OooO0Oo, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.o00Oo0
    @SuppressLint({"WrongConstant"})
    public final void OooOOOO(@NonNull AccessibilityEvent accessibilityEvent) {
        if (this.f17648OooOOOo.isEnabled()) {
            boolean z = false;
            if (this.f17641OooO0oo.getInputType() != 0) {
                return;
            }
            if (accessibilityEvent.getEventType() == 32768 && this.f17645OooOOO && !this.f17641OooO0oo.isPopupShowing()) {
                z = true;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                OooOo0();
                this.f17646OooOOO0 = true;
                this.f17647OooOOOO = System.currentTimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooOOo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f17640OooO0oO;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f17638OooO0o);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.OooOo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0OoOo0 o0oooo1 = this.f17499OooO0Oo;
                o0oooo1.getClass();
                o0oooo1.f17620OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f17649OooOOo = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f17639OooO0o0);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.OooOo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0OoOo0 o0oooo1 = this.f17499OooO0Oo;
                o0oooo1.getClass();
                o0oooo1.f17620OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f17650OooOOo0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new o000oOoO(this));
        this.f17648OooOOOo = (AccessibilityManager) this.f17619OooO0OO.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.o00Oo0
    @SuppressLint({"ClickableViewAccessibility"})
    public final void OooOOoo() {
        AutoCompleteTextView autoCompleteTextView = this.f17641OooO0oo;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f17641OooO0oo.setOnDismissListener(null);
        }
    }

    public final void OooOo0() {
        if (this.f17641OooO0oo == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17647OooOOOO;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f17646OooOOO0 = false;
        }
        if (this.f17646OooOOO0) {
            this.f17646OooOOO0 = false;
            return;
        }
        OooOo00(!this.f17645OooOOO);
        if (!this.f17645OooOOO) {
            this.f17641OooO0oo.dismissDropDown();
        } else {
            this.f17641OooO0oo.requestFocus();
            this.f17641OooO0oo.showDropDown();
        }
    }

    public final void OooOo00(boolean z) {
        if (this.f17645OooOOO != z) {
            this.f17645OooOOO = z;
            this.f17649OooOOo.cancel();
            this.f17650OooOOo0.start();
        }
    }
}
