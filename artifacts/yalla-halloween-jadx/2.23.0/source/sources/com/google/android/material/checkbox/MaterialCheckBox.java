package com.google.android.material.checkbox;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.o000Oo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import p013OooOo0o.o00Oo0;
import p028Oooo0oO.o0O00o0;
import p053o00000oo.o00Ooo;
import p079o000Oo0o.o00;
import p079o000Oo0o.o000O;
import p079o000Oo0o.o000OO00;
import p079o000Oo0o.o000OOo0;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000OO;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;
import p272o0O000oo.OooOOO;
import p545o0oO0Ooo.b1;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f16662OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[][] f16663OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @SuppressLint({"DiscouragedApi"})
    public static final int f16664Oooo000;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OooO0O0> f16665OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<OooO0OO> f16666OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16667OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f16668OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f16669OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public CharSequence f16670OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f16671OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Drawable f16672OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Drawable f16673OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16674OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f16675OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public ColorStateList f16676OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public CharSequence f16677OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f16678OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f16679OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int[] f16680OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f16681OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public final o000OOo0 f16682OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f16683OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o f16684OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final int f16661OooOoo0 = o0000O0O.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f16660OooOoo = {o00000.state_indeterminate};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CheckedState {
    }

    public class OooO00o extends o000OO00 {
        public OooO00o() {
        }

        @Override // p079o000Oo0o.o000OO00
        public final void OooO00o(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.f16674OooOOo;
            if (colorStateList != null) {
                o00Ooo.OooO0O0.OooO0oo(drawable, colorStateList);
            }
        }

        @Override // p079o000Oo0o.o000OO00
        public final void OooO0O0(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f16674OooOOo;
            if (colorStateList != null) {
                o00Ooo.OooO0O0.OooO0oO(drawable, colorStateList.getColorForState(materialCheckBox.f16680OooOo0O, colorStateList.getDefaultColor()));
            }
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    public interface OooO0OO {
        void OooO00o();
    }

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f16686OooO0Oo;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f16686OooO0Oo = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @NonNull
        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.f16686OooO0Oo;
            if (i != 1) {
                str = i != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return o0O00o0.OooO0O0(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f16686OooO0Oo));
        }
    }

    static {
        int i = o00000.state_error;
        f16662OooOooO = new int[]{i};
        f16663OooOooo = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f16664Oooo000 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i = this.f16678OooOo0;
        if (i == 1) {
            return getResources().getString(o0000O0.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(o0000O0.mtrl_checkbox_state_description_unchecked) : getResources().getString(o0000O0.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16667OooOO0 == null) {
            int iOooO0OO = OooOOO.OooO0OO(o00000.colorControlActivated, this);
            int iOooO0OO2 = OooOOO.OooO0OO(o00000.colorError, this);
            int iOooO0OO3 = OooOOO.OooO0OO(o00000.colorSurface, this);
            int iOooO0OO4 = OooOOO.OooO0OO(o00000.colorOnSurface, this);
            this.f16667OooOO0 = new ColorStateList(f16663OooOooo, new int[]{OooOOO.OooO0o0(iOooO0OO3, 1.0f, iOooO0OO2), OooOOO.OooO0o0(iOooO0OO3, 1.0f, iOooO0OO), OooOOO.OooO0o0(iOooO0OO3, 0.54f, iOooO0OO4), OooOOO.OooO0o0(iOooO0OO3, 0.38f, iOooO0OO4), OooOOO.OooO0o0(iOooO0OO3, 0.38f, iOooO0OO4)});
        }
        return this.f16667OooOO0;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f16674OooOOo;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void OooO0O0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        o00 o00Var;
        this.f16672OooOOOO = o0O00O0.OooO00o.OooO0O0(this.f16672OooOOOO, this.f16674OooOOo, androidx.core.widget.OooO0O0.OooO0O0(this));
        this.f16673OooOOOo = o0O00O0.OooO00o.OooO0O0(this.f16673OooOOOo, this.f16676OooOOoo, this.f16679OooOo00);
        if (this.f16675OooOOo0) {
            o000OOo0 o000ooo1 = this.f16682OooOoO;
            if (o000ooo1 != null) {
                Drawable drawable = o000ooo1.f35078OooO0Oo;
                OooO00o oooO00o = this.f16684OooOoOO;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (oooO00o.f34999OooO00o == null) {
                        oooO00o.f34999OooO00o = new o000O(oooO00o);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(oooO00o.f34999OooO00o);
                }
                ArrayList<o000OO00> arrayList = o000ooo1.f35005OooO0oo;
                o000OOo0.OooO0O0 oooO0O0 = o000ooo1.f35003OooO0o0;
                if (arrayList != null && oooO00o != null) {
                    arrayList.remove(oooO00o);
                    if (o000ooo1.f35005OooO0oo.size() == 0 && (o00Var = o000ooo1.f35004OooO0oO) != null) {
                        oooO0O0.f35008OooO0O0.removeListener(o00Var);
                        o000ooo1.f35004OooO0oO = null;
                    }
                }
                Drawable drawable2 = o000ooo1.f35078OooO0Oo;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (oooO00o.f34999OooO00o == null) {
                        oooO00o.f34999OooO00o = new o000O(oooO00o);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(oooO00o.f34999OooO00o);
                } else if (oooO00o != null) {
                    if (o000ooo1.f35005OooO0oo == null) {
                        o000ooo1.f35005OooO0oo = new ArrayList<>();
                    }
                    if (!o000ooo1.f35005OooO0oo.contains(oooO00o)) {
                        o000ooo1.f35005OooO0oo.add(oooO00o);
                        if (o000ooo1.f35004OooO0oO == null) {
                            o000ooo1.f35004OooO0oO = new o00(o000ooo1);
                        }
                        oooO0O0.f35008OooO0O0.addListener(o000ooo1.f35004OooO0oO);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f16672OooOOOO;
                if ((drawable3 instanceof AnimatedStateListDrawable) && o000ooo1 != null) {
                    int i = o0000Ooo.checked;
                    int i2 = o0000Ooo.unchecked;
                    ((AnimatedStateListDrawable) drawable3).addTransition(i, i2, o000ooo1, false);
                    ((AnimatedStateListDrawable) this.f16672OooOOOO).addTransition(o0000Ooo.indeterminate, i2, o000ooo1, false);
                }
            }
        }
        Drawable drawable4 = this.f16672OooOOOO;
        if (drawable4 != null && (colorStateList2 = this.f16674OooOOo) != null) {
            o00Ooo.OooO0O0.OooO0oo(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f16673OooOOOo;
        if (drawable5 != null && (colorStateList = this.f16676OooOOoo) != null) {
            o00Ooo.OooO0O0.OooO0oo(drawable5, colorStateList);
        }
        super.setButtonDrawable(o0O00O0.OooO00o.OooO00o(this.f16672OooOOOO, this.f16673OooOOOo));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f16672OooOOOO;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f16673OooOOOo;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f16676OooOOoo;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f16679OooOo00;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f16674OooOOo;
    }

    public int getCheckedState() {
        return this.f16678OooOo0;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f16670OooOOO;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f16678OooOo0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16668OooOO0O && this.f16674OooOOo == null && this.f16676OooOOoo == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16660OooOoo);
        }
        if (this.f16671OooOOO0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16662OooOooO);
        }
        this.f16680OooOo0O = o0O00O0.OooO00o.OooO0OO(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableOooO00o;
        if (!this.f16669OooOO0o || !TextUtils.isEmpty(getText()) || (drawableOooO00o = androidx.core.widget.OooO0OO.OooO00o(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableOooO00o.getIntrinsicWidth()) / 2) * (oo0o0Oo.OooO0o(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableOooO00o.getBounds();
            o00Ooo.OooO0O0.OooO0o(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f16671OooOOO0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f16670OooOOO));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f16686OooO0Oo);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16686OooO0Oo = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f16673OooOOOo = drawable;
        OooO0O0();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i) {
        setButtonIconDrawable(o00Oo0.OooO00o(getContext(), i));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f16676OooOOoo == colorStateList) {
            return;
        }
        this.f16676OooOOoo = colorStateList;
        OooO0O0();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f16679OooOo00 == mode) {
            return;
        }
        this.f16679OooOo00 = mode;
        OooO0O0();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f16674OooOOo == colorStateList) {
            return;
        }
        this.f16674OooOOo = colorStateList;
        OooO0O0();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        OooO0O0();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f16669OooOO0o = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f16678OooOo0 != i) {
            this.f16678OooOo0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f16677OooOo == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f16681OooOo0o) {
                return;
            }
            this.f16681OooOo0o = true;
            LinkedHashSet<OooO0O0> linkedHashSet = this.f16665OooO;
            if (linkedHashSet != null) {
                Iterator<OooO0O0> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o();
                }
            }
            if (this.f16678OooOo0 != 2 && (onCheckedChangeListener = this.f16683OooOoO0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f16681OooOo0o = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f16670OooOOO = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f16671OooOOO0 == z) {
            return;
        }
        this.f16671OooOOO0 = z;
        refreshDrawableState();
        Iterator<OooO0OO> it = this.f16666OooO0oo.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f16683OooOoO0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f16677OooOo = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f16668OooOO0O = z;
        if (z) {
            androidx.core.widget.OooO0O0.OooO0OO(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.OooO0O0.OooO0OO(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f16672OooOOOO = drawable;
        this.f16675OooOOo0 = false;
        OooO0O0();
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i) {
        o000OOo0 o000ooo1;
        int next;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, f16661OooOoo0), attributeSet, i);
        this.f16666OooO0oo = new LinkedHashSet<>();
        this.f16665OooO = new LinkedHashSet<>();
        Context context2 = getContext();
        int i2 = o00000OO.mtrl_checkbox_button_checked_unchecked;
        if (Build.VERSION.SDK_INT >= 24) {
            o000ooo1 = new o000OOo0(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
            Drawable drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, i2, theme);
            o000ooo1.f35078OooO0Oo = drawableOooO00o;
            drawableOooO00o.setCallback(o000ooo1.f35001OooO);
            new o000OOo0.OooO0OO(o000ooo1.f35078OooO0Oo.getConstantState());
        } else {
            int i3 = o000OOo0.f35000OooOO0;
            try {
                XmlResourceParser xml = context2.getResources().getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    Resources resources2 = context2.getResources();
                    Resources.Theme theme2 = context2.getTheme();
                    o000OOo0 o000ooo2 = new o000OOo0(context2);
                    o000ooo2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                    o000ooo1 = o000ooo2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e) {
                Log.e("AnimatedVDCompat", "parser error", e);
                o000ooo1 = null;
            } catch (XmlPullParserException e2) {
                Log.e("AnimatedVDCompat", "parser error", e2);
                o000ooo1 = null;
            }
        }
        this.f16682OooOoO = o000ooo1;
        this.f16684OooOoOO = new OooO00o();
        Context context3 = getContext();
        this.f16672OooOOOO = androidx.core.widget.OooO0OO.OooO00o(this);
        this.f16674OooOOo = getSuperButtonTintList();
        setSupportButtonTintList(null);
        o000Oo0 o000oo0OooO0o0 = o00oO0o.OooO0o0(context3, attributeSet, o000OO.MaterialCheckBox, i, f16661OooOoo0, new int[0]);
        this.f16673OooOOOo = o000oo0OooO0o0.OooO0o0(o000OO.MaterialCheckBox_buttonIcon);
        if (this.f16672OooOOOO != null && b1.OooO0O0(context3, o00000.isMaterial3Theme, false)) {
            if (o000oo0OooO0o0.OooO(o000OO.MaterialCheckBox_android_button, 0) == f16664Oooo000 && o000oo0OooO0o0.OooO(o000OO.MaterialCheckBox_buttonCompat, 0) == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f16672OooOOOO = o00Oo0.OooO00o(context3, o00000OO.mtrl_checkbox_button);
                this.f16675OooOOo0 = true;
                if (this.f16673OooOOOo == null) {
                    this.f16673OooOOOo = o00Oo0.OooO00o(context3, o00000OO.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f16676OooOOoo = c1.OooO0O0(context3, o000oo0OooO0o0, o000OO.MaterialCheckBox_buttonIconTint);
        this.f16679OooOo00 = oo0o0Oo.OooO0oO(o000oo0OooO0o0.OooO0oo(o000OO.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f16668OooOO0O = o000oo0OooO0o0.OooO00o(o000OO.MaterialCheckBox_useMaterialThemeColors, false);
        this.f16669OooOO0o = o000oo0OooO0o0.OooO00o(o000OO.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f16671OooOOO0 = o000oo0OooO0o0.OooO00o(o000OO.MaterialCheckBox_errorShown, false);
        this.f16670OooOOO = o000oo0OooO0o0.OooOO0O(o000OO.MaterialCheckBox_errorAccessibilityLabel);
        int i4 = o000OO.MaterialCheckBox_checkedState;
        if (o000oo0OooO0o0.OooOO0o(i4)) {
            setCheckedState(o000oo0OooO0o0.OooO0oo(i4, 0));
        }
        o000oo0OooO0o0.OooOOO();
        OooO0O0();
    }
}
