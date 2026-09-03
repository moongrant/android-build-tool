package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p072o000O0o0.o0000O0O;
import p072o000O0o0.o0000OO0;
import p072o000O0o0.o000OO;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final OooOO0 f17861OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0OO f17862OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f17863OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0o f17864OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO f17865OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0116OooOO0O f17866OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOOO0 f17867OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f17868OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f17869OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f17870OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public StateListDrawable f17871OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MaterialShapeDrawable f17872OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ValueAnimator f17873OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public AccessibilityManager f17874OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ValueAnimator f17875OooOOoo;

    public class OooO implements TextInputLayout.OooOO0 {
        public OooO() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0
        public final void OooO00o(@NonNull TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewOooO0Oo = OooOO0O.OooO0Oo(textInputLayout.getEditText());
            OooOO0O oooOO0O = OooOO0O.this;
            int boxBackgroundMode = oooOO0O.f17893OooO00o.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextViewOooO0Oo.setDropDownBackgroundDrawable(oooOO0O.f17872OooOOOo);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextViewOooO0Oo.setDropDownBackgroundDrawable(oooOO0O.f17871OooOOOO);
            }
            OooOO0O.this.OooO(autoCompleteTextViewOooO0Oo);
            OooOO0O oooOO0O2 = OooOO0O.this;
            Objects.requireNonNull(oooOO0O2);
            autoCompleteTextViewOooO0Oo.setOnTouchListener(new OooOOOO(oooOO0O2, autoCompleteTextViewOooO0Oo));
            autoCompleteTextViewOooO0Oo.setOnFocusChangeListener(oooOO0O2.f17862OooO0o);
            autoCompleteTextViewOooO0Oo.setOnDismissListener(new com.google.android.material.textfield.OooOOO0(oooOO0O2));
            autoCompleteTextViewOooO0Oo.setThreshold(0);
            autoCompleteTextViewOooO0Oo.removeTextChangedListener(OooOO0O.this.f17863OooO0o0);
            autoCompleteTextViewOooO0Oo.addTextChangedListener(OooOO0O.this.f17863OooO0o0);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!(autoCompleteTextViewOooO0Oo.getKeyListener() != null) && OooOO0O.this.f17874OooOOo0.isTouchExplorationEnabled()) {
                CheckableImageButton checkableImageButton = OooOO0O.this.f17895OooO0OO;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOoo(checkableImageButton, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(OooOO0O.this.f17864OooO0oO);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class OooO00o extends com.google.android.material.internal.Oooo0 {

        /* JADX INFO: renamed from: com.google.android.material.textfield.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0115OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f17878Oooo0o;

            public RunnableC0115OooO00o(AutoCompleteTextView autoCompleteTextView) {
                this.f17878Oooo0o = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsPopupShowing = this.f17878Oooo0o.isPopupShowing();
                OooOO0O.OooO0o(OooOO0O.this, zIsPopupShowing);
                OooOO0O.this.f17868OooOO0o = zIsPopupShowing;
            }
        }

        public OooO00o() {
        }

        @Override // com.google.android.material.internal.Oooo0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewOooO0Oo = OooOO0O.OooO0Oo(OooOO0O.this.f17893OooO00o.getEditText());
            if (OooOO0O.this.f17874OooOOo0.isTouchExplorationEnabled() && OooOO0O.OooO0o0(autoCompleteTextViewOooO0Oo) && !OooOO0O.this.f17895OooO0OO.hasFocus()) {
                autoCompleteTextViewOooO0Oo.dismissDropDown();
            }
            autoCompleteTextViewOooO0Oo.post(new RunnableC0115OooO00o(autoCompleteTextViewOooO0Oo));
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {
        public OooO0O0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            OooOO0O.this.f17895OooO0OO.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class OooO0OO implements View.OnFocusChangeListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            OooOO0O.this.f17893OooO00o.setEndIconActivated(z);
            if (z) {
                return;
            }
            OooOO0O.OooO0o(OooOO0O.this, false);
            OooOO0O.this.f17868OooOO0o = false;
        }
    }

    public class OooO0o extends TextInputLayout.OooO {
        public OooO0o(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooO, androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            super.OooO0Oo(view, o0000oo1);
            if (!OooOO0O.OooO0o0(OooOO0O.this.f17893OooO00o.getEditText())) {
                o0000oo1.Oooo000(Spinner.class.getName());
            }
            if (o0000oo1.OooOo0()) {
                o0000oo1.Oooo(null);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0o0(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.OooO0o0(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewOooO0Oo = OooOO0O.OooO0Oo(OooOO0O.this.f17893OooO00o.getEditText());
            if (accessibilityEvent.getEventType() == 1 && OooOO0O.this.f17874OooOOo0.isEnabled() && !OooOO0O.OooO0o0(OooOO0O.this.f17893OooO00o.getEditText())) {
                OooOO0O.OooO0oO(OooOO0O.this, autoCompleteTextViewOooO0Oo);
                OooOO0O.OooO0oo(OooOO0O.this);
            }
        }
    }

    public class OooOO0 implements TextInputLayout.OooOO0O {

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f17884Oooo0o;

            public OooO00o(AutoCompleteTextView autoCompleteTextView) {
                this.f17884Oooo0o = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f17884Oooo0o.removeTextChangedListener(OooOO0O.this.f17863OooO0o0);
            }
        }

        public OooOO0() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0O
        public final void OooO00o(@NonNull TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new OooO00o(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == OooOO0O.this.f17862OooO0o) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(OooOO0O.this.f17866OooOO0);
                OooOO0O oooOO0O = OooOO0O.this;
                AccessibilityManager accessibilityManager = oooOO0O.f17874OooOOo0;
                if (accessibilityManager != null) {
                    o0000O0O.OooO0O0(accessibilityManager, oooOO0O.f17867OooOO0O);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.OooOO0O$OooOO0O, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0116OooOO0O implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0116OooOO0O() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            OooOO0O.this.OooOO0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            OooOO0O oooOO0O = OooOO0O.this;
            AccessibilityManager accessibilityManager = oooOO0O.f17874OooOOo0;
            if (accessibilityManager != null) {
                o0000O0O.OooO0O0(accessibilityManager, oooOO0O.f17867OooOO0O);
            }
        }
    }

    public class OooOOO implements View.OnClickListener {
        public OooOOO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooOO0O.OooO0oO(OooOO0O.this, (AutoCompleteTextView) OooOO0O.this.f17893OooO00o.getEditText());
        }
    }

    public class OooOOO0 implements o000OO {
        public OooOOO0() {
        }
    }

    public OooOO0O(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        super(textInputLayout, i);
        this.f17863OooO0o0 = new OooO00o();
        this.f17862OooO0o = new OooO0OO();
        this.f17864OooO0oO = new OooO0o(this.f17893OooO00o);
        this.f17865OooO0oo = new OooO();
        this.f17861OooO = new OooOO0();
        this.f17866OooOO0 = new ViewOnAttachStateChangeListenerC0116OooOO0O();
        this.f17867OooOO0O = new OooOOO0();
        this.f17868OooOO0o = false;
        this.f17870OooOOO0 = false;
        this.f17869OooOOO = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView OooO0Oo(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static void OooO0o(OooOO0O oooOO0O, boolean z) {
        if (oooOO0O.f17870OooOOO0 != z) {
            oooOO0O.f17870OooOOO0 = z;
            oooOO0O.f17875OooOOoo.cancel();
            oooOO0O.f17873OooOOo.start();
        }
    }

    public static boolean OooO0o0(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void OooO0oO(OooOO0O oooOO0O, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(oooOO0O);
        if (autoCompleteTextView == null) {
            return;
        }
        if (oooOO0O.OooOOO0()) {
            oooOO0O.f17868OooOO0o = false;
        }
        if (oooOO0O.f17868OooOO0o) {
            oooOO0O.f17868OooOO0o = false;
            return;
        }
        boolean z = oooOO0O.f17870OooOOO0;
        boolean z2 = !z;
        if (z != z2) {
            oooOO0O.f17870OooOOO0 = z2;
            oooOO0O.f17875OooOOoo.cancel();
            oooOO0O.f17873OooOOo.start();
        }
        if (!oooOO0O.f17870OooOOO0) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public static void OooO0oo(OooOO0O oooOO0O) {
        oooOO0O.f17868OooOO0o = true;
        oooOO0O.f17869OooOOO = System.currentTimeMillis();
    }

    public final void OooO(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f17893OooO00o.getBoxBackgroundMode();
        MaterialShapeDrawable boxBackground = this.f17893OooO00o.getBoxBackground();
        int iOooO0OO = o0O0000O.OooO0OO(autoCompleteTextView, p337o0OO0o0.OooO0o.colorControlHighlight);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode != 2) {
            if (boxBackgroundMode == 1) {
                int boxBackgroundColor = this.f17893OooO00o.getBoxBackgroundColor();
                RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{o0O0000O.OooO0o0(iOooO0OO, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOo0(autoCompleteTextView, rippleDrawable);
                return;
            }
            return;
        }
        int iOooO0OO2 = o0O0000O.OooO0OO(autoCompleteTextView, p337o0OO0o0.OooO0o.colorSurface);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(boxBackground.f17510Oooo0o.f17534OooO00o);
        int iOooO0o0 = o0O0000O.OooO0o0(iOooO0OO, iOooO0OO2, 0.1f);
        materialShapeDrawable.OooOOOo(new ColorStateList(iArr, new int[]{iOooO0o0, 0}));
        materialShapeDrawable.setTint(iOooO0OO2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iOooO0o0, iOooO0OO2});
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(boxBackground.f17510Oooo0o.f17534OooO00o);
        materialShapeDrawable2.setTint(-1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable, materialShapeDrawable2), boxBackground});
        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(autoCompleteTextView, layerDrawable);
    }

    @Override // com.google.android.material.textfield.OooOo00
    public final void OooO00o() {
        float dimensionPixelOffset = this.f17894OooO0O0.getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f17894OooO0O0.getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f17894OooO0O0.getResources().getDimensionPixelOffset(p337o0OO0o0.OooOO0.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable materialShapeDrawableOooOO0o = OooOO0o(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable materialShapeDrawableOooOO0o2 = OooOO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f17872OooOOOo = materialShapeDrawableOooOO0o;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f17871OooOOOO = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, materialShapeDrawableOooOO0o);
        this.f17871OooOOOO.addState(new int[0], materialShapeDrawableOooOO0o2);
        int i = this.f17896OooO0Oo;
        if (i == 0) {
            i = p337o0OO0o0.OooOO0O.mtrl_dropdown_arrow;
        }
        this.f17893OooO00o.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f17893OooO00o;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(p337o0OO0o0.OooOo.exposed_dropdown_menu_content_description));
        this.f17893OooO00o.setEndIconOnClickListener(new OooOOO());
        this.f17893OooO00o.OooO00o(this.f17865OooO0oo);
        this.f17893OooO00o.OooO0O0(this.f17861OooO);
        this.f17875OooOOoo = OooOO0O(67, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        ValueAnimator valueAnimatorOooOO0O = OooOO0O(50, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17873OooOOo = valueAnimatorOooOO0O;
        valueAnimatorOooOO0O.addListener(new com.google.android.material.textfield.OooOOO(this));
        this.f17874OooOOo0 = (AccessibilityManager) this.f17894OooO0O0.getSystemService("accessibility");
        this.f17893OooO00o.addOnAttachStateChangeListener(this.f17866OooOO0);
        OooOO0();
    }

    @Override // com.google.android.material.textfield.OooOo00
    public final boolean OooO0O0(int i) {
        return i != 0;
    }

    public final void OooOO0() {
        TextInputLayout textInputLayout;
        if (this.f17874OooOOo0 == null || (textInputLayout = this.f17893OooO00o) == null) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOO0O.OooO0O0(textInputLayout)) {
            o0000O0O.OooO00o(this.f17874OooOOo0, this.f17867OooOO0O);
        }
    }

    public final ValueAnimator OooOO0O(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(p338o0OO0o0O.OooO0o.f37972OooO00o);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0());
        return valueAnimatorOfFloat;
    }

    public final MaterialShapeDrawable OooOO0o(float f, float f2, float f3, int i) {
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o();
        c0110OooO00o.OooO0o(f);
        c0110OooO00o.OooO0oO(f);
        c0110OooO00o.OooO0Oo(f2);
        c0110OooO00o.OooO0o0(f2);
        com.google.android.material.shape.OooO00o OooO00o2 = c0110OooO00o.OooO00o();
        Context context = this.f17894OooO0O0;
        String str = MaterialShapeDrawable.f17507Ooooooo;
        int iOooO0O0 = o0OOO0O.OooO0O0.OooO0O0(context, p337o0OO0o0.OooO0o.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.OooOOO0(context);
        materialShapeDrawable.OooOOOo(ColorStateList.valueOf(iOooO0O0));
        materialShapeDrawable.OooOOOO(f3);
        materialShapeDrawable.setShapeAppearanceModel(OooO00o2);
        MaterialShapeDrawable.OooO0O0 oooO0O0 = materialShapeDrawable.f17510Oooo0o;
        if (oooO0O0.f17541OooO0oo == null) {
            oooO0O0.f17541OooO0oo = new Rect();
        }
        materialShapeDrawable.f17510Oooo0o.f17541OooO0oo.set(0, i, 0, i);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    public final boolean OooOOO0() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17869OooOOO;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }
}
