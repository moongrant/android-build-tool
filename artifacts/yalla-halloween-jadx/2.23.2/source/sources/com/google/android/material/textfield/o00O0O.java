package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O00;
import p272o0O0000o.o0000Ooo;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class o00O0O extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public View.OnLongClickListener f17588OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TextInputLayout f17589OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f17590OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17591OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ColorStateList f17592OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PorterDuff.Mode f17593OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f17594OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0o f17595OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f17596OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ColorStateList f17597OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.OooOOO0> f17598OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public PorterDuff.Mode f17599OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f17600OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public View.OnLongClickListener f17601OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f17602OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public CharSequence f17603OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public o0000O.OooO0o f17604OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f17605OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f17606OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public EditText f17607OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17608OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o f17609OooOoO0;

    public class OooO00o extends com.google.android.material.internal.oo000o {
        public OooO00o() {
        }

        @Override // com.google.android.material.internal.oo000o, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            o00O0O.this.OooO0O0().OooO00o();
        }

        @Override // com.google.android.material.internal.oo000o, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            o00O0O.this.OooO0O0().OooO0O0();
        }
    }

    public class OooO0O0 implements TextInputLayout.OooOO0O {
        public OooO0O0() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0O
        public final void OooO00o(@NonNull TextInputLayout textInputLayout) {
            o00O0O o00o0o2 = o00O0O.this;
            if (o00o0o2.f17607OooOo0O == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = o00o0o2.f17607OooOo0O;
            OooO00o oooO00o = o00o0o2.f17609OooOoO0;
            if (editText != null) {
                editText.removeTextChangedListener(oooO00o);
                if (o00o0o2.f17607OooOo0O.getOnFocusChangeListener() == o00o0o2.OooO0O0().OooO0o0()) {
                    o00o0o2.f17607OooOo0O.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            o00o0o2.f17607OooOo0O = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(oooO00o);
            }
            o00o0o2.OooO0O0().OooOOO0(o00o0o2.f17607OooOo0O);
            o00o0o2.OooO(o00o0o2.OooO0O0());
        }
    }

    public class OooO0OO implements View.OnAttachStateChangeListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            o00O0O o00o0o2 = o00O0O.this;
            if (o00o0o2.f17604OooOo == null || (accessibilityManager = o00o0o2.f17608OooOo0o) == null) {
                return;
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(o00o0o2)) {
                o0000O.OooO0OO.OooO00o(accessibilityManager, o00o0o2.f17604OooOo);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            o00O0O o00o0o2 = o00O0O.this;
            o0000O.OooO0o oooO0o = o00o0o2.f17604OooOo;
            if (oooO0o == null || (accessibilityManager = o00o0o2.f17608OooOo0o) == null) {
                return;
            }
            o0000O.OooO0OO.OooO0O0(accessibilityManager, oooO0o);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseArray<o00Oo0> f17613OooO00o = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O0O f17614OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f17615OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f17616OooO0Oo;

        public OooO0o(o00O0O o00o0o2, o000Oo0 o000oo1) {
            this.f17614OooO0O0 = o00o0o2;
            this.f17615OooO0OO = o000oo1.OooO(o000OO.TextInputLayout_endIconDrawable, 0);
            this.f17616OooO0Oo = o000oo1.OooO(o000OO.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public o00O0O(TextInputLayout textInputLayout, o000Oo0 o000oo1) {
        CharSequence charSequenceOooOO0O;
        super(textInputLayout.getContext());
        this.f17596OooOO0o = 0;
        this.f17598OooOOO0 = new LinkedHashSet<>();
        this.f17609OooOoO0 = new OooO00o();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f17608OooOo0o = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f17589OooO0Oo = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f17591OooO0o0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonOooO00o = OooO00o(this, layoutInflaterFrom, o0000Ooo.text_input_error_icon);
        this.f17590OooO0o = checkableImageButtonOooO00o;
        CheckableImageButton checkableImageButtonOooO00o2 = OooO00o(frameLayout, layoutInflaterFrom, o0000Ooo.text_input_end_icon);
        this.f17594OooOO0 = checkableImageButtonOooO00o2;
        this.f17595OooOO0O = new OooO0o(this, o000oo1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f17606OooOo00 = appCompatTextView;
        int i = o000OO.TextInputLayout_errorIconTint;
        if (o000oo1.OooOO0o(i)) {
            this.f17592OooO0oO = p276o0O00OoO.OooO0o.OooO0O0(getContext(), o000oo1, i);
        }
        int i2 = o000OO.TextInputLayout_errorIconTintMode;
        if (o000oo1.OooOO0o(i2)) {
            this.f17593OooO0oo = com.google.android.material.internal.oo0o0Oo.OooO0oO(o000oo1.OooO0oo(i2, -1), null);
        }
        int i3 = o000OO.TextInputLayout_errorIconDrawable;
        if (o000oo1.OooOO0o(i3)) {
            OooO0oo(o000oo1.OooO0o0(i3));
        }
        checkableImageButtonOooO00o.setContentDescription(getResources().getText(o0000O0.error_icon_content_description));
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOoo(checkableImageButtonOooO00o, 2);
        checkableImageButtonOooO00o.setClickable(false);
        checkableImageButtonOooO00o.setPressable(false);
        checkableImageButtonOooO00o.setFocusable(false);
        int i4 = o000OO.TextInputLayout_passwordToggleEnabled;
        if (!o000oo1.OooOO0o(i4)) {
            int i5 = o000OO.TextInputLayout_endIconTint;
            if (o000oo1.OooOO0o(i5)) {
                this.f17597OooOOO = p276o0O00OoO.OooO0o.OooO0O0(getContext(), o000oo1, i5);
            }
            int i6 = o000OO.TextInputLayout_endIconTintMode;
            if (o000oo1.OooOO0o(i6)) {
                this.f17599OooOOOO = com.google.android.material.internal.oo0o0Oo.OooO0oO(o000oo1.OooO0oo(i6, -1), null);
            }
        }
        int i7 = o000OO.TextInputLayout_endIconMode;
        if (o000oo1.OooOO0o(i7)) {
            OooO0o(o000oo1.OooO0oo(i7, 0));
            int i8 = o000OO.TextInputLayout_endIconContentDescription;
            if (o000oo1.OooOO0o(i8) && checkableImageButtonOooO00o2.getContentDescription() != (charSequenceOooOO0O = o000oo1.OooOO0O(i8))) {
                checkableImageButtonOooO00o2.setContentDescription(charSequenceOooOO0O);
            }
            checkableImageButtonOooO00o2.setCheckable(o000oo1.OooO00o(o000OO.TextInputLayout_endIconCheckable, true));
        } else if (o000oo1.OooOO0o(i4)) {
            int i9 = o000OO.TextInputLayout_passwordToggleTint;
            if (o000oo1.OooOO0o(i9)) {
                this.f17597OooOOO = p276o0O00OoO.OooO0o.OooO0O0(getContext(), o000oo1, i9);
            }
            int i10 = o000OO.TextInputLayout_passwordToggleTintMode;
            if (o000oo1.OooOO0o(i10)) {
                this.f17599OooOOOO = com.google.android.material.internal.oo0o0Oo.OooO0oO(o000oo1.OooO0oo(i10, -1), null);
            }
            OooO0o(o000oo1.OooO00o(i4, false) ? 1 : 0);
            CharSequence charSequenceOooOO0O2 = o000oo1.OooOO0O(o000OO.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonOooO00o2.getContentDescription() != charSequenceOooOO0O2) {
                checkableImageButtonOooO00o2.setContentDescription(charSequenceOooOO0O2);
            }
        }
        int iOooO0Oo = o000oo1.OooO0Oo(o000OO.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(o00000O.mtrl_min_touch_target_size));
        if (iOooO0Oo < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iOooO0Oo != this.f17600OooOOOo) {
            this.f17600OooOOOo = iOooO0Oo;
            checkableImageButtonOooO00o2.setMinimumWidth(iOooO0Oo);
            checkableImageButtonOooO00o2.setMinimumHeight(iOooO0Oo);
            checkableImageButtonOooO00o.setMinimumWidth(iOooO0Oo);
            checkableImageButtonOooO00o.setMinimumHeight(iOooO0Oo);
        }
        int i11 = o000OO.TextInputLayout_endIconScaleType;
        if (o000oo1.OooOO0o(i11)) {
            ImageView.ScaleType scaleTypeOooO0O0 = o00Ooo.OooO0O0(o000oo1.OooO0oo(i11, -1));
            this.f17602OooOOo0 = scaleTypeOooO0O0;
            checkableImageButtonOooO00o2.setScaleType(scaleTypeOooO0O0);
            checkableImageButtonOooO00o.setScaleType(scaleTypeOooO0O0);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(o0000Ooo.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.OooOO0O.OooO0o(appCompatTextView, 1);
        appCompatTextView.setTextAppearance(o000oo1.OooO(o000OO.TextInputLayout_suffixTextAppearance, 0));
        int i12 = o000OO.TextInputLayout_suffixTextColor;
        if (o000oo1.OooOO0o(i12)) {
            appCompatTextView.setTextColor(o000oo1.OooO0O0(i12));
        }
        CharSequence charSequenceOooOO0O3 = o000oo1.OooOO0O(o000OO.TextInputLayout_suffixText);
        this.f17603OooOOoo = TextUtils.isEmpty(charSequenceOooOO0O3) ? null : charSequenceOooOO0O3;
        appCompatTextView.setText(charSequenceOooOO0O3);
        OooOOO0();
        frameLayout.addView(checkableImageButtonOooO00o2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonOooO00o);
        textInputLayout.f17557Ooooo0o.add(oooO0O0);
        if (textInputLayout.f17511OooO0oO != null) {
            oooO0O0.OooO00o(textInputLayout);
        }
        addOnAttachStateChangeListener(new OooO0OO());
    }

    public final void OooO(o00Oo0 o00oo1) {
        if (this.f17607OooOo0O == null) {
            return;
        }
        if (o00oo1.OooO0o0() != null) {
            this.f17607OooOo0O.setOnFocusChangeListener(o00oo1.OooO0o0());
        }
        if (o00oo1.OooO0oO() != null) {
            this.f17594OooOO0.setOnFocusChangeListener(o00oo1.OooO0oO());
        }
    }

    public final CheckableImageButton OooO00o(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(o0000O00.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (p276o0O00OoO.OooO0o.OooO0o0(getContext())) {
            androidx.core.view.o00O0O.OooO0oo((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o00Oo0 OooO0O0() {
        o00Oo0 oooOOO0;
        int i = this.f17596OooOO0o;
        OooO0o oooO0o = this.f17595OooOO0O;
        SparseArray<o00Oo0> sparseArray = oooO0o.f17613OooO00o;
        o00Oo0 o0oo0oo2 = sparseArray.get(i);
        if (o0oo0oo2 == null) {
            o00O0O o00o0o2 = oooO0o.f17614OooO0O0;
            if (i == -1) {
                oooOOO0 = new OooOOO0(o00o0o2);
            } else if (i != 0) {
                if (i == 1) {
                    o0oo0oo2 = new o0Oo0oo(o00o0o2, oooO0o.f17616OooO0Oo);
                } else if (i == 2) {
                    oooOOO0 = new OooOO0O(o00o0o2);
                } else {
                    if (i != 3) {
                        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid end icon mode: ", i));
                    }
                    oooOOO0 = new o0OoOo0(o00o0o2);
                }
                sparseArray.append(i, o0oo0oo2);
            } else {
                oooOOO0 = new o0ooOOo(o00o0o2);
            }
            o0oo0oo2 = oooOOO0;
            sparseArray.append(i, o0oo0oo2);
        }
        return o0oo0oo2;
    }

    public final boolean OooO0OO() {
        return this.f17591OooO0o0.getVisibility() == 0 && this.f17594OooOO0.getVisibility() == 0;
    }

    public final boolean OooO0Oo() {
        return this.f17590OooO0o.getVisibility() == 0;
    }

    public final void OooO0o(int i) {
        if (this.f17596OooOO0o == i) {
            return;
        }
        o00Oo0 o00oo0OooO0O0 = OooO0O0();
        o0000O.OooO0o oooO0o = this.f17604OooOo;
        AccessibilityManager accessibilityManager = this.f17608OooOo0o;
        if (oooO0o != null && accessibilityManager != null) {
            o0000O.OooO0OO.OooO0O0(accessibilityManager, oooO0o);
        }
        this.f17604OooOo = null;
        o00oo0OooO0O0.OooOOoo();
        this.f17596OooOO0o = i;
        Iterator<TextInputLayout.OooOOO0> it = this.f17598OooOOO0.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
        OooO0oO(i != 0);
        o00Oo0 o00oo0OooO0O1 = OooO0O0();
        int iOooO0Oo = this.f17595OooOO0O.f17615OooO0OO;
        if (iOooO0Oo == 0) {
            iOooO0Oo = o00oo0OooO0O1.OooO0Oo();
        }
        Drawable drawableOooO00o = iOooO0Oo != 0 ? p013OooOo0o.o00Oo0.OooO00o(getContext(), iOooO0Oo) : null;
        CheckableImageButton checkableImageButton = this.f17594OooOO0;
        checkableImageButton.setImageDrawable(drawableOooO00o);
        TextInputLayout textInputLayout = this.f17589OooO0Oo;
        if (drawableOooO00o != null) {
            o00Ooo.OooO00o(textInputLayout, checkableImageButton, this.f17597OooOOO, this.f17599OooOOOO);
            o00Ooo.OooO0OO(textInputLayout, checkableImageButton, this.f17597OooOOO);
        }
        int iOooO0OO = o00oo0OooO0O1.OooO0OO();
        CharSequence text = iOooO0OO != 0 ? getResources().getText(iOooO0OO) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(o00oo0OooO0O1.OooOO0O());
        if (!o00oo0OooO0O1.OooO(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        o00oo0OooO0O1.OooOOo();
        o0000O.OooO0o oooO0oOooO0oo = o00oo0OooO0O1.OooO0oo();
        this.f17604OooOo = oooO0oOooO0oo;
        if (oooO0oOooO0oo != null && accessibilityManager != null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(this)) {
                o0000O.OooO0OO.OooO00o(accessibilityManager, this.f17604OooOo);
            }
        }
        View.OnClickListener onClickListenerOooO0o = o00oo0OooO0O1.OooO0o();
        View.OnLongClickListener onLongClickListener = this.f17601OooOOo;
        checkableImageButton.setOnClickListener(onClickListenerOooO0o);
        o00Ooo.OooO0Oo(checkableImageButton, onLongClickListener);
        EditText editText = this.f17607OooOo0O;
        if (editText != null) {
            o00oo0OooO0O1.OooOOO0(editText);
            OooO(o00oo0OooO0O1);
        }
        o00Ooo.OooO00o(textInputLayout, checkableImageButton, this.f17597OooOOO, this.f17599OooOOOO);
        OooO0o0(true);
    }

    public final void OooO0o0(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        o00Oo0 o00oo0OooO0O0 = OooO0O0();
        boolean zOooOO0O = o00oo0OooO0O0.OooOO0O();
        CheckableImageButton checkableImageButton = this.f17594OooOO0;
        boolean z3 = true;
        if (!zOooOO0O || (zIsChecked = checkableImageButton.isChecked()) == o00oo0OooO0O0.OooOO0o()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!(o00oo0OooO0O0 instanceof o0OoOo0) || (zIsActivated = checkableImageButton.isActivated()) == o00oo0OooO0O0.OooOO0()) {
            z3 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z3) {
            o00Ooo.OooO0OO(this.f17589OooO0Oo, checkableImageButton, this.f17597OooOOO);
        }
    }

    public final void OooO0oO(boolean z) {
        if (OooO0OO() != z) {
            this.f17594OooOO0.setVisibility(z ? 0 : 8);
            OooOO0();
            OooOO0o();
            this.f17589OooO0Oo.OooOOOo();
        }
    }

    public final void OooO0oo(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f17590OooO0o;
        checkableImageButton.setImageDrawable(drawable);
        OooOO0O();
        o00Ooo.OooO00o(this.f17589OooO0Oo, checkableImageButton, this.f17592OooO0oO, this.f17593OooO0oo);
    }

    public final void OooOO0() {
        this.f17591OooO0o0.setVisibility((this.f17594OooOO0.getVisibility() != 0 || OooO0Oo()) ? 8 : 0);
        setVisibility(OooO0OO() || OooO0Oo() || ((this.f17603OooOOoo == null || this.f17605OooOo0) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    public final void OooOO0O() {
        CheckableImageButton checkableImageButton = this.f17590OooO0o;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f17589OooO0Oo;
        checkableImageButton.setVisibility(drawable != null && textInputLayout.f17517OooOOO0.f17668OooOOo0 && textInputLayout.OooOOO0() ? 0 : 8);
        OooOO0();
        OooOO0o();
        if (this.f17596OooOO0o != 0) {
            return;
        }
        textInputLayout.OooOOOo();
    }

    public final void OooOO0o() {
        int iOooO0o0;
        TextInputLayout textInputLayout = this.f17589OooO0Oo;
        if (textInputLayout.f17511OooO0oO == null) {
            return;
        }
        if (OooO0OO() || OooO0Oo()) {
            iOooO0o0 = 0;
        } else {
            EditText editText = textInputLayout.f17511OooO0oO;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            iOooO0o0 = ViewCompat.OooO.OooO0o0(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(o00000O.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f17511OooO0oO.getPaddingTop();
        int paddingBottom = textInputLayout.f17511OooO0oO.getPaddingBottom();
        WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
        ViewCompat.OooO.OooOO0O(this.f17606OooOo00, dimensionPixelSize, paddingTop, iOooO0o0, paddingBottom);
    }

    public final void OooOOO0() {
        AppCompatTextView appCompatTextView = this.f17606OooOo00;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.f17603OooOOoo == null || this.f17605OooOo0) ? 8 : 0;
        if (visibility != i) {
            OooO0O0().OooOOOo(i == 0);
        }
        OooOO0();
        appCompatTextView.setVisibility(i);
        this.f17589OooO0Oo.OooOOOo();
    }
}
