package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.OooO00o;
import com.google.android.material.internal.OooO0O0;
import com.google.android.material.internal.OooOOO0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import io.agora.rtc.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import o0000O.o0Oo0oo;
import o0000O0O.oo000o;
import o0O000.OooOOO;
import o0O00o00.Oooo0;
import p013OooOo0o.o00Oo0;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;
import p271o0O000o.OooO0o;
import p274o0O00OoO.OooO0OO;
import p545o0oO0Ooo.c1;
import p545o0oO0Ooo.d1;
import p545o0oO0Ooo.f1;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.OooO00o.InterfaceC0220OooO00o, Oooo0, OooOOO0<Chip> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public InsetDrawable f16691OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public com.google.android.material.chip.OooO00o f16692OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public RippleDrawable f16693OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f16694OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f16695OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f16696OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooOOO0.OooO00o<Chip> f16697OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f16698OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f16699OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f16700OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f16701OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f16702OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Rect f16703OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public CharSequence f16704OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Dimension(unit = 1)
    public int f16705OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f16706OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f16707OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO00o f16708OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final RectF f16709OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final int f16687OooOoOO = o0000O0O.Widget_MaterialComponents_Chip_Action;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final Rect f16689OooOoo0 = new Rect();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f16688OooOoo = {R.attr.state_selected};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f16690OooOooO = {R.attr.state_checkable};

    public class OooO00o extends f1 {
        public OooO00o() {
        }

        @Override // p545o0oO0Ooo.f1
        public final void OooO00o(int i) {
        }

        @Override // p545o0oO0Ooo.f1
        public final void OooO0O0(@NonNull Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            com.google.android.material.chip.OooO00o oooO00o = chip.f16692OooO0oo;
            chip.setText(oooO00o.f16760o00000 ? oooO00o.f16734Oooo00o : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class OooO0O0 extends p056o0000Oo0.OooO0O0 {
        public OooO0O0(Chip chip) {
            super(chip);
        }

        @Override // p056o0000Oo0.OooO0O0
        public final boolean OooO(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f16694OooOO0O;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    if (chip.f16707OooOo0o) {
                        chip.f16706OooOo0O.OooOOO(1, 1);
                    }
                }
            }
            return z;
        }

        @Override // p056o0000Oo0.OooO0O0
        public final int OooO0Oo(float f, float f2) {
            int i = Chip.f16687OooOoOO;
            Chip chip = Chip.this;
            return (chip.OooO0o0() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p056o0000Oo0.OooO0O0
        public final void OooO0o0(@NonNull ArrayList arrayList) {
            boolean z = false;
            arrayList.add(0);
            int i = Chip.f16687OooOoOO;
            Chip chip = Chip.this;
            if (chip.OooO0o0()) {
                com.google.android.material.chip.OooO00o oooO00o = chip.f16692OooO0oo;
                if (oooO00o != null && oooO00o.f16739Oooo0oO) {
                    z = true;
                }
                if (!z || chip.f16694OooOO0O == null) {
                    return;
                }
                arrayList.add(1);
            }
        }

        @Override // p056o0000Oo0.OooO0O0
        public final void OooOO0(@NonNull o0Oo0oo o0oo0oo2) {
            Chip chip = Chip.this;
            com.google.android.material.chip.OooO00o oooO00o = chip.f16692OooO0oo;
            o0oo0oo2.f34022OooO00o.setCheckable(oooO00o != null && oooO00o.f16741OoooO);
            o0oo0oo2.f34022OooO00o.setClickable(chip.isClickable());
            o0oo0oo2.OooOO0(chip.getAccessibilityClassName());
            o0oo0oo2.OooOOo0(chip.getText());
        }

        @Override // p056o0000Oo0.OooO0O0
        public final void OooOO0O(int i, @NonNull o0Oo0oo o0oo0oo2) {
            if (i != 1) {
                o0oo0oo2.OooOOO0("");
                o0oo0oo2.OooO(Chip.f16689OooOoo0);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                o0oo0oo2.OooOOO0(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                int i2 = o0000O0.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                o0oo0oo2.OooOOO0(context.getString(i2, objArr).trim());
            }
            o0oo0oo2.OooO(chip.getCloseIconTouchBoundsInt());
            o0oo0oo2.OooO0O0(o0Oo0oo.OooO00o.f34028OooO0oO);
            o0oo0oo2.f34022OooO00o.setEnabled(chip.isEnabled());
        }

        @Override // p056o0000Oo0.OooO0O0
        public final void OooOO0o(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f16701OooOOo0 = z;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f16709OooOoO0;
        rectF.setEmpty();
        if (OooO0o0() && this.f16694OooOO0O != null) {
            com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
            Rect bounds = oooO00o.getBounds();
            rectF.setEmpty();
            if (oooO00o.Ooooo0o()) {
                float f = oooO00o.f16757Oooooo0 + oooO00o.f16755OooooOo + oooO00o.f16742OoooO0 + oooO00o.f16754OooooOO + oooO00o.f16753OooooO0;
                if (o00Ooo.OooO0OO.OooO00o(oooO00o) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f16703OooOo;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    @Nullable
    private d1 getTextAppearance() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16769o00Oo0.f17317OooO0o;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f16699OooOOOo != z) {
            this.f16699OooOOOo = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f16698OooOOOO != z) {
            this.f16698OooOOOO = z;
            refreshDrawableState();
        }
    }

    public final void OooO() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            paint.drawableState = oooO00o.getState();
        }
        d1 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.OooO0o0(getContext(), paint, this.f16708OooOoO);
        }
    }

    @Override // com.google.android.material.chip.OooO00o.InterfaceC0220OooO00o
    public final void OooO00o() {
        OooO0Oo(this.f16705OooOo00);
        requestLayout();
        invalidateOutline();
    }

    public final void OooO0Oo(@Dimension int i) {
        this.f16705OooOo00 = i;
        if (!this.f16700OooOOo) {
            InsetDrawable insetDrawable = this.f16691OooO;
            if (insetDrawable == null) {
                int[] iArr = OooO0OO.f41776OooO00o;
                OooO0oO();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f16691OooO = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = OooO0OO.f41776OooO00o;
                    OooO0oO();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f16692OooO0oo.f16726OooOoo));
        int iMax2 = Math.max(0, i - this.f16692OooO0oo.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f16691OooO;
            if (insetDrawable2 == null) {
                int[] iArr3 = OooO0OO.f41776OooO00o;
                OooO0oO();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f16691OooO = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = OooO0OO.f41776OooO00o;
                    OooO0oO();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f16691OooO != null) {
            Rect rect = new Rect();
            this.f16691OooO.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = OooO0OO.f41776OooO00o;
                OooO0oO();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f16691OooO = new InsetDrawable((Drawable) this.f16692OooO0oo, i2, i3, i2, i3);
        int[] iArr6 = OooO0OO.f41776OooO00o;
        OooO0oO();
    }

    public final void OooO0o() {
        if (OooO0o0()) {
            com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
            if ((oooO00o != null && oooO00o.f16739Oooo0oO) && this.f16694OooOO0O != null) {
                ViewCompat.OooOOOO(this, this.f16706OooOo0O);
                this.f16707OooOo0o = true;
                return;
            }
        }
        ViewCompat.OooOOOO(this, null);
        this.f16707OooOo0o = false;
    }

    public final boolean OooO0o0() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            Drawable drawable = oooO00o.f16740Oooo0oo;
            if ((drawable != null ? o00Ooo.OooO0Oo(drawable) : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0oO() {
        this.f16693OooOO0 = new RippleDrawable(OooO0OO.OooO0OO(this.f16692OooO0oo.f16733Oooo00O), getBackgroundDrawable(), null);
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o.f16766o000OOo) {
            oooO00o.f16766o000OOo = false;
            oooO00o.f16761o000000 = null;
            oooO00o.onStateChange(oooO00o.getState());
        }
        RippleDrawable rippleDrawable = this.f16693OooOO0;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, rippleDrawable);
        OooO0oo();
    }

    public final void OooO0oo() {
        com.google.android.material.chip.OooO00o oooO00o;
        if (TextUtils.isEmpty(getText()) || (oooO00o = this.f16692OooO0oo) == null) {
            return;
        }
        int iOooOoOO = (int) (oooO00o.OooOoOO() + oooO00o.f16757Oooooo0 + oooO00o.f16753OooooO0);
        com.google.android.material.chip.OooO00o oooO00o2 = this.f16692OooO0oo;
        int iOooOoO = (int) (oooO00o2.OooOoO() + oooO00o2.f16749OoooOoO + oooO00o2.f16752Ooooo0o);
        if (this.f16691OooO != null) {
            Rect rect = new Rect();
            this.f16691OooO.getPadding(rect);
            iOooOoO += rect.left;
            iOooOoOO += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO.OooOO0O(this, iOooOoO, paddingTop, iOooOoOO, paddingBottom);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f16707OooOo0o) {
            return this.f16706OooOo0O.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.f16707OooOo0o) {
            return super.dispatchKeyEvent(keyEvent);
        }
        OooO0O0 oooO0O0 = this.f16706OooOo0O;
        oooO0O0.getClass();
        boolean zOooO0oO = false;
        int i2 = 0;
        zOooO0oO = false;
        zOooO0oO = false;
        zOooO0oO = false;
        zOooO0oO = false;
        zOooO0oO = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && oooO0O0.OooO0oO(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zOooO0oO = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = oooO0O0.f34143OooO;
                                if (i != Integer.MIN_VALUE) {
                                    oooO0O0.OooO(i, 16, null);
                                }
                                zOooO0oO = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = oooO0O0.f34143OooO;
                    if (i != Integer.MIN_VALUE) {
                        oooO0O0.OooO(i, 16, null);
                    }
                    zOooO0oO = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zOooO0oO = oooO0O0.OooO0oO(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zOooO0oO = oooO0O0.OooO0oO(1, null);
            }
        }
        if (!zOooO0oO || oooO0O0.f34143OooO == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        boolean zOooo000 = false;
        if (oooO00o != null && com.google.android.material.chip.OooO00o.OooOooO(oooO00o.f16740Oooo0oo)) {
            com.google.android.material.chip.OooO00o oooO00o2 = this.f16692OooO0oo;
            ?? IsEnabled = isEnabled();
            if (this.f16701OooOOo0) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f16699OooOOOo) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f16698OooOOOO) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f16701OooOOo0) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f16699OooOOOo) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f16698OooOOOO) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(oooO00o2.f16775o0O0O00, iArr)) {
                oooO00o2.f16775o0O0O00 = iArr;
                if (oooO00o2.Ooooo0o()) {
                    zOooo000 = oooO00o2.Oooo000(oooO00o2.getState(), iArr);
                }
            }
        }
        if (zOooo000) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f16704OooOo0)) {
            return this.f16704OooOo0;
        }
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (!(oooO00o != null && oooO00o.f16741OoooO)) {
            return isClickable() ? "android.widget.Button" : AndroidComposeViewAccessibilityDelegateCompat.ClassName;
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f16716OooOO0O.f17206OooO0Oo) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f16691OooO;
        return insetDrawable == null ? this.f16692OooO0oo : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16767o000oOoO;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16746OoooOOO;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16727OooOoo0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return Math.max(0.0f, oooO00o.OooOoo0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f16692OooO0oo;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16757Oooooo0;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || (drawable = oooO00o.f16735Oooo0O0) == null) {
            return null;
        }
        return o00Ooo.OooO0Oo(drawable);
    }

    public float getChipIconSize() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16738Oooo0o0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16736Oooo0OO;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16726OooOoo;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16749OoooOoO;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16729OooOooo;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16732Oooo000;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || (drawable = oooO00o.f16740Oooo0oo) == null) {
            return null;
        }
        return o00Ooo.OooO0Oo(drawable);
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16744OoooO0O;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16755OooooOo;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16742OoooO0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16754OooooOO;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16743OoooO00;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16763o000000o;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@NonNull Rect rect) {
        if (this.f16707OooOo0o) {
            OooO0O0 oooO0O0 = this.f16706OooOo0O;
            if (oooO0O0.f34143OooO == 1 || oooO0O0.f34151OooO0oo == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public OooOOO getHideMotionSpec() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16748OoooOo0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16751Ooooo00;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16750OoooOoo;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16733Oooo00O;
        }
        return null;
    }

    @NonNull
    public com.google.android.material.shape.OooO0O0 getShapeAppearanceModel() {
        return this.f16692OooO0oo.f17582OooO0Oo.f17605OooO00o;
    }

    @Nullable
    public OooOOO getShowMotionSpec() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16747OoooOOo;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16753OooooO0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            return oooO00o.f16752Ooooo0o;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O00o00.OooOOO.OooO0Oo(this, this.f16692OooO0oo);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16688OooOoo);
        }
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null && oooO00o.f16741OoooO) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16690OooOooO);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f16707OooOo0o) {
            OooO0O0 oooO0O0 = this.f16706OooOo0O;
            int i2 = oooO0O0.f34143OooO;
            if (i2 != Integer.MIN_VALUE) {
                oooO0O0.OooO00o(i2);
            }
            if (z) {
                oooO0O0.OooO0oO(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        accessibilityNodeInfo.setCheckable(oooO00o != null && oooO00o.f16741OoooO);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f17139OooO0o) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if (childAt instanceof Chip) {
                        if (!(chipGroup.getChildAt(i2).getVisibility() == 0)) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(o0000Ooo.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o0Oo0oo.OooO0o.OooO00o(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).f34045OooO00o);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f16702OooOOoo != i) {
            this.f16702OooOOoo = i;
            OooO0oo();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f16698OooOOOO) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f16698OooOOOO) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f16694OooOO0O;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f16707OooOo0o) {
                        this.f16706OooOo0O.OooOOO(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f16704OooOo0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16693OooOO0) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16693OooOO0) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo00O(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo00O(oooO00o.f16756Oooooo.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null) {
            this.f16696OooOOO = z;
        } else if (oooO00o.f16741OoooO) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo00o(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo00o(o00Oo0.OooO00o(oooO00o.f16756Oooooo, i));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0(ContextCompat.OooO0O0(i, oooO00o.f16756Oooooo));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0O0(oooO00o.f16756Oooooo.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16727OooOoo0 == colorStateList) {
            return;
        }
        oooO00o.f16727OooOoo0 = colorStateList;
        oooO00o.onStateChange(oooO00o.getState());
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        ColorStateList colorStateListOooO0O0;
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16727OooOoo0 == (colorStateListOooO0O0 = ContextCompat.OooO0O0(i, oooO00o.f16756Oooooo))) {
            return;
        }
        oooO00o.f16727OooOoo0 = colorStateListOooO0O0;
        oooO00o.onStateChange(oooO00o.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0OO(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0OO(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.OooO00o oooO00o) {
        com.google.android.material.chip.OooO00o oooO00o2 = this.f16692OooO0oo;
        if (oooO00o2 != oooO00o) {
            if (oooO00o2 != null) {
                oooO00o2.f16762o000000O = new WeakReference<>(null);
            }
            this.f16692OooO0oo = oooO00o;
            oooO00o.f16760o00000 = false;
            oooO00o.f16762o000000O = new WeakReference<>(this);
            OooO0Oo(this.f16705OooOo00);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16757Oooooo0 == f) {
            return;
        }
        oooO00o.f16757Oooooo0 = f;
        oooO00o.invalidateSelf();
        oooO00o.OooOooo();
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            float dimension = oooO00o.f16756Oooooo.getResources().getDimension(i);
            if (oooO00o.f16757Oooooo0 != dimension) {
                oooO00o.f16757Oooooo0 = dimension;
                oooO00o.invalidateSelf();
                oooO00o.OooOooo();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0o0(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@DrawableRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0o0(o00Oo0.OooO00o(oooO00o.f16756Oooooo, i));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0o(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0o(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0oO(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0oO(ContextCompat.OooO0O0(i, oooO00o.f16756Oooooo));
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0oo(oooO00o.f16756Oooooo.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16726OooOoo == f) {
            return;
        }
        oooO00o.f16726OooOoo = f;
        oooO00o.invalidateSelf();
        oooO00o.OooOooo();
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            float dimension = oooO00o.f16756Oooooo.getResources().getDimension(i);
            if (oooO00o.f16726OooOoo != dimension) {
                oooO00o.f16726OooOoo = dimension;
                oooO00o.invalidateSelf();
                oooO00o.OooOooo();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16749OoooOoO == f) {
            return;
        }
        oooO00o.f16749OoooOoO = f;
        oooO00o.invalidateSelf();
        oooO00o.OooOooo();
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            float dimension = oooO00o.f16756Oooooo.getResources().getDimension(i);
            if (oooO00o.f16749OoooOoO != dimension) {
                oooO00o.f16749OoooOoO = dimension;
                oooO00o.invalidateSelf();
                oooO00o.OooOooo();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo(ContextCompat.OooO0O0(i, oooO00o.f16756Oooooo));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO00(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO00(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO0(drawable);
        }
        OooO0o();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16744OoooO0O == charSequence) {
            return;
        }
        String str = o0000O0O.OooO00o.f34090OooO0Oo;
        Locale locale = Locale.getDefault();
        int i = oo000o.f34114OooO00o;
        o0000O0O.OooO00o oooO00o2 = oo000o.OooO00o.OooO00o(locale) == 1 ? o0000O0O.OooO00o.f34093OooO0oO : o0000O0O.OooO00o.f34091OooO0o;
        oooO00o.f16744OoooO0O = oooO00o2.OooO0OO(charSequence, oooO00o2.f34096OooO0OO);
        oooO00o.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO0O(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO0O(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO0(o00Oo0.OooO00o(oooO00o.f16756Oooooo, i));
        }
        OooO0o();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooO(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOO0(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOO0(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.o000oOoO(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.o000oOoO(ContextCompat.OooO0O0(i, oooO00o.f16756Oooooo));
        }
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OooOOO0(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f16692OooO0oo == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.f16763o000000o = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f16700OooOOo = z;
        OooO0Oo(this.f16705OooOo00);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable OooOOO oooOOO) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.f16748OoooOo0 = oooOOO;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.f16748OoooOo0 = OooOOO.OooO0O0(i, oooO00o.f16756Oooooo);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOOo(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOOo(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOo0(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOo0(oooO00o.f16756Oooooo.getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.internal.OooOOO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable OooOOO0.OooO00o<Chip> oooO00o) {
        this.f16697OooOOO0 = oooO00o;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f16692OooO0oo == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.f16765o00000O0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f16695OooOO0o = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f16694OooOO0O = onClickListener;
        OooO0o();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOoO(colorStateList);
        }
        if (this.f16692OooO0oo.f16766o000OOo) {
            return;
        }
        OooO0oO();
    }

    public void setRippleColorResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOoO(ContextCompat.OooO0O0(i, oooO00o.f16756Oooooo));
            if (this.f16692OooO0oo.f16766o000OOo) {
                return;
            }
            OooO0oO();
        }
    }

    @Override // o0O00o00.Oooo0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        this.f16692OooO0oo.setShapeAppearanceModel(oooO0O0);
    }

    public void setShowMotionSpec(@Nullable OooOOO oooOOO) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.f16747OoooOOo = oooOOO;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.f16747OoooOOo = OooOOO.OooO0O0(i, oooO00o.f16756Oooooo);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(oooO00o.f16760o00000 ? null : charSequence, bufferType);
        com.google.android.material.chip.OooO00o oooO00o2 = this.f16692OooO0oo;
        if (oooO00o2 == null || TextUtils.equals(oooO00o2.f16734Oooo00o, charSequence)) {
            return;
        }
        oooO00o2.f16734Oooo00o = charSequence;
        oooO00o2.f16769o00Oo0.f17316OooO0Oo = true;
        oooO00o2.invalidateSelf();
        oooO00o2.OooOooo();
    }

    public void setTextAppearance(@Nullable d1 d1Var) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.f16769o00Oo0.OooO0O0(d1Var, oooO00o.f16756Oooooo);
        }
        OooO();
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16753OooooO0 == f) {
            return;
        }
        oooO00o.f16753OooooO0 = f;
        oooO00o.invalidateSelf();
        oooO00o.OooOooo();
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            float dimension = oooO00o.f16756Oooooo.getResources().getDimension(i);
            if (oooO00o.f16753OooooO0 != dimension) {
                oooO00o.f16753OooooO0 = dimension;
                oooO00o.invalidateSelf();
                oooO00o.OooOooo();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            com.google.android.material.internal.o00Oo0 o00oo1 = oooO00o.f16769o00Oo0;
            d1 d1Var = o00oo1.f17317OooO0o;
            if (d1Var != null) {
                d1Var.f55822OooOO0O = fApplyDimension;
                o00oo1.f17313OooO00o.setTextSize(fApplyDimension);
                oooO00o.OooO00o();
            }
        }
        OooO();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o == null || oooO00o.f16752Ooooo0o == f) {
            return;
        }
        oooO00o.f16752Ooooo0o = f;
        oooO00o.invalidateSelf();
        oooO00o.OooOooo();
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            float dimension = oooO00o.f16756Oooooo.getResources().getDimension(i);
            if (oooO00o.f16752Ooooo0o != dimension) {
                oooO00o.f16752Ooooo0o = dimension;
                oooO00o.invalidateSelf();
                oooO00o.OooOooo();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o00000.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.OoooOOO(z);
        }
        OooO0o();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int i2 = f16687OooOoOO;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16703OooOo = new Rect();
        this.f16709OooOoO0 = new RectF();
        this.f16708OooOoO = new OooO00o();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        com.google.android.material.chip.OooO00o oooO00o = new com.google.android.material.chip.OooO00o(context2, attributeSet, i);
        Context context3 = oooO00o.f16756Oooooo;
        int[] iArr = o000OO.Chip;
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context3, attributeSet, iArr, i, i2, new int[0]);
        int i3 = o000OO.Chip_shapeAppearance;
        oooO00o.f16764o00000O = typedArrayOooO0Oo.hasValue(i3);
        int i4 = o000OO.Chip_chipSurfaceColor;
        Context context4 = oooO00o.f16756Oooooo;
        ColorStateList colorStateListOooO00o = c1.OooO00o(context4, typedArrayOooO0Oo, i4);
        if (oooO00o.f16725OooOoOO != colorStateListOooO00o) {
            oooO00o.f16725OooOoOO = colorStateListOooO00o;
            oooO00o.onStateChange(oooO00o.getState());
        }
        ColorStateList colorStateListOooO00o2 = c1.OooO00o(context4, typedArrayOooO0Oo, o000OO.Chip_chipBackgroundColor);
        if (oooO00o.f16727OooOoo0 != colorStateListOooO00o2) {
            oooO00o.f16727OooOoo0 = colorStateListOooO00o2;
            oooO00o.onStateChange(oooO00o.getState());
        }
        float dimension = typedArrayOooO0Oo.getDimension(o000OO.Chip_chipMinHeight, 0.0f);
        if (oooO00o.f16726OooOoo != dimension) {
            oooO00o.f16726OooOoo = dimension;
            oooO00o.invalidateSelf();
            oooO00o.OooOooo();
        }
        int i5 = o000OO.Chip_chipCornerRadius;
        if (typedArrayOooO0Oo.hasValue(i5)) {
            oooO00o.Oooo0OO(typedArrayOooO0Oo.getDimension(i5, 0.0f));
        }
        oooO00o.Oooo(c1.OooO00o(context4, typedArrayOooO0Oo, o000OO.Chip_chipStrokeColor));
        oooO00o.OoooO00(typedArrayOooO0Oo.getDimension(o000OO.Chip_chipStrokeWidth, 0.0f));
        oooO00o.OoooOoO(c1.OooO00o(context4, typedArrayOooO0Oo, o000OO.Chip_rippleColor));
        String text = typedArrayOooO0Oo.getText(o000OO.Chip_android_text);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(oooO00o.f16734Oooo00o, text);
        com.google.android.material.internal.o00Oo0 o00oo1 = oooO00o.f16769o00Oo0;
        if (!zEquals) {
            oooO00o.f16734Oooo00o = text;
            o00oo1.f17316OooO0Oo = true;
            oooO00o.invalidateSelf();
            oooO00o.OooOooo();
        }
        int i6 = o000OO.Chip_android_textAppearance;
        d1 d1Var = (!typedArrayOooO0Oo.hasValue(i6) || (resourceId = typedArrayOooO0Oo.getResourceId(i6, 0)) == 0) ? null : new d1(context4, resourceId);
        d1Var.f55822OooOO0O = typedArrayOooO0Oo.getDimension(o000OO.Chip_android_textSize, d1Var.f55822OooOO0O);
        o00oo1.OooO0O0(d1Var, context4);
        int i7 = typedArrayOooO0Oo.getInt(o000OO.Chip_android_ellipsize, 0);
        if (i7 == 1) {
            oooO00o.f16763o000000o = TextUtils.TruncateAt.START;
        } else if (i7 == 2) {
            oooO00o.f16763o000000o = TextUtils.TruncateAt.MIDDLE;
        } else if (i7 == 3) {
            oooO00o.f16763o000000o = TextUtils.TruncateAt.END;
        }
        oooO00o.Oooo0oo(typedArrayOooO0Oo.getBoolean(o000OO.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            oooO00o.Oooo0oo(typedArrayOooO0Oo.getBoolean(o000OO.Chip_chipIconEnabled, false));
        }
        oooO00o.Oooo0o0(c1.OooO0Oo(context4, typedArrayOooO0Oo, o000OO.Chip_chipIcon));
        int i8 = o000OO.Chip_chipIconTint;
        if (typedArrayOooO0Oo.hasValue(i8)) {
            oooO00o.Oooo0oO(c1.OooO00o(context4, typedArrayOooO0Oo, i8));
        }
        oooO00o.Oooo0o(typedArrayOooO0Oo.getDimension(o000OO.Chip_chipIconSize, -1.0f));
        oooO00o.OoooOOO(typedArrayOooO0Oo.getBoolean(o000OO.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            oooO00o.OoooOOO(typedArrayOooO0Oo.getBoolean(o000OO.Chip_closeIconEnabled, false));
        }
        oooO00o.OoooO0(c1.OooO0Oo(context4, typedArrayOooO0Oo, o000OO.Chip_closeIcon));
        oooO00o.o000oOoO(c1.OooO00o(context4, typedArrayOooO0Oo, o000OO.Chip_closeIconTint));
        oooO00o.OoooO(typedArrayOooO0Oo.getDimension(o000OO.Chip_closeIconSize, 0.0f));
        oooO00o.Oooo00O(typedArrayOooO0Oo.getBoolean(o000OO.Chip_android_checkable, false));
        oooO00o.Oooo0O0(typedArrayOooO0Oo.getBoolean(o000OO.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            oooO00o.Oooo0O0(typedArrayOooO0Oo.getBoolean(o000OO.Chip_checkedIconEnabled, false));
        }
        oooO00o.Oooo00o(c1.OooO0Oo(context4, typedArrayOooO0Oo, o000OO.Chip_checkedIcon));
        int i9 = o000OO.Chip_checkedIconTint;
        if (typedArrayOooO0Oo.hasValue(i9)) {
            oooO00o.Oooo0(c1.OooO00o(context4, typedArrayOooO0Oo, i9));
        }
        oooO00o.f16747OoooOOo = OooOOO.OooO00o(context4, typedArrayOooO0Oo, o000OO.Chip_showMotionSpec);
        oooO00o.f16748OoooOo0 = OooOOO.OooO00o(context4, typedArrayOooO0Oo, o000OO.Chip_hideMotionSpec);
        float dimension2 = typedArrayOooO0Oo.getDimension(o000OO.Chip_chipStartPadding, 0.0f);
        if (oooO00o.f16749OoooOoO != dimension2) {
            oooO00o.f16749OoooOoO = dimension2;
            oooO00o.invalidateSelf();
            oooO00o.OooOooo();
        }
        oooO00o.OoooOo0(typedArrayOooO0Oo.getDimension(o000OO.Chip_iconStartPadding, 0.0f));
        oooO00o.OoooOOo(typedArrayOooO0Oo.getDimension(o000OO.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayOooO0Oo.getDimension(o000OO.Chip_textStartPadding, 0.0f);
        if (oooO00o.f16752Ooooo0o != dimension3) {
            oooO00o.f16752Ooooo0o = dimension3;
            oooO00o.invalidateSelf();
            oooO00o.OooOooo();
        }
        float dimension4 = typedArrayOooO0Oo.getDimension(o000OO.Chip_textEndPadding, 0.0f);
        if (oooO00o.f16753OooooO0 != dimension4) {
            oooO00o.f16753OooooO0 = dimension4;
            oooO00o.invalidateSelf();
            oooO00o.OooOooo();
        }
        oooO00o.OoooOO0(typedArrayOooO0Oo.getDimension(o000OO.Chip_closeIconStartPadding, 0.0f));
        oooO00o.OoooO0O(typedArrayOooO0Oo.getDimension(o000OO.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayOooO0Oo.getDimension(o000OO.Chip_chipEndPadding, 0.0f);
        if (oooO00o.f16757Oooooo0 != dimension5) {
            oooO00o.f16757Oooooo0 = dimension5;
            oooO00o.invalidateSelf();
            oooO00o.OooOooo();
        }
        oooO00o.f16765o00000O0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayOooO0Oo.recycle();
        TypedArray typedArrayOooO0Oo2 = o00oO0o.OooO0Oo(context2, attributeSet, iArr, i, i2, new int[0]);
        this.f16700OooOOo = typedArrayOooO0Oo2.getBoolean(o000OO.Chip_ensureMinTouchTargetSize, false);
        this.f16705OooOo00 = (int) Math.ceil(typedArrayOooO0Oo2.getDimension(o000OO.Chip_chipMinTouchTargetSize, (float) Math.ceil(oo0o0Oo.OooO0O0(48, getContext()))));
        typedArrayOooO0Oo2.recycle();
        setChipDrawable(oooO00o);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        oooO00o.OooOOO0(ViewCompat.OooOOO.OooO(this));
        TypedArray typedArrayOooO0Oo3 = o00oO0o.OooO0Oo(context2, attributeSet, iArr, i, i2, new int[0]);
        boolean zHasValue = typedArrayOooO0Oo3.hasValue(i3);
        typedArrayOooO0Oo3.recycle();
        this.f16706OooOo0O = new OooO0O0(this);
        OooO0o();
        if (!zHasValue) {
            setOutlineProvider(new OooO0o(this));
        }
        setChecked(this.f16696OooOOO);
        setText(oooO00o.f16734Oooo00o);
        setEllipsize(oooO00o.f16763o000000o);
        OooO();
        if (!this.f16692OooO0oo.f16760o00000) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        OooO0oo();
        if (this.f16700OooOOo) {
            setMinHeight(this.f16705OooOo00);
        }
        this.f16702OooOOoo = ViewCompat.OooO.OooO0Oo(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0O000o.OooO0OO
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip chip = this.f41663OooO00o;
                OooOOO0.OooO00o<Chip> oooO00o2 = chip.f16697OooOOO0;
                if (oooO00o2 != null) {
                    OooO0O0 oooO0O0 = ((OooO00o) oooO00o2).f17202OooO00o;
                    if (!z ? oooO0O0.OooO0o0(chip, oooO0O0.f17207OooO0o0) : oooO0O0.OooO00o(chip)) {
                        oooO0O0.OooO0Oo();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f16695OooOO0o;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0O0(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            oooO00o.Oooo0oo(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            Context context2 = oooO00o.f16756Oooooo;
            oooO00o.f16769o00Oo0.OooO0O0(new d1(context2, i), context2);
        }
        OooO();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.OooO00o oooO00o = this.f16692OooO0oo;
        if (oooO00o != null) {
            Context context = oooO00o.f16756Oooooo;
            oooO00o.f16769o00Oo0.OooO0O0(new d1(context, i), context);
        }
        OooO();
    }
}
