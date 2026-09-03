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
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
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
import androidx.annotation.CallSuper;
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
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.OooOO0;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0OOO0O.OooO0o;
import p012OooOo0.OooOO0O;
import p072o000O0o0.o0000OO0;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooOOO0;
import p337o0OO0o0.OooOo;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p338o0OO0o0O.OooOo00;
import p347o0OOO0o0.o00000;
import p347o0OOO0o0.o0O0O00;
import p427o0OoO0o.o000000;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.OooO00o.InterfaceC0106OooO00o, o00000, OooOO0<Chip> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f16753OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public InsetDrawable f16754OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public com.google.android.material.chip.OooO00o f16755OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public RippleDrawable f16756OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f16757OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f16758OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f16759OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f16760OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f16761OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f16762OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f16763Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Dimension(unit = 1)
    public int f16764Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public CharSequence f16765OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NonNull
    public final OooO0OO f16766OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f16767OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final RectF f16768Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final Rect f16769Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final OooO00o f16770OoooooO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public OooOO0.OooO00o<Chip> f16771o000oOoO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final int f16749Ooooooo = Oooo000.Widget_MaterialComponents_Chip_Action;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final Rect f16751o0OoOo0 = new Rect();

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final int[] f16752ooOO = {R.attr.state_selected};

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final int[] f16750o00O0O = {R.attr.state_checkable};

    public class OooO00o extends o0OOO0O.OooOO0 {
        public OooO00o() {
        }

        @Override // o0OOO0O.OooOO0
        public final void OooO00o(int i) {
        }

        @Override // o0OOO0O.OooOO0
        public final void OooO0O0(@NonNull Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            com.google.android.material.chip.OooO00o oooO00o = chip.f16755OoooO00;
            chip.setText(oooO00o.f16831o000Ooo ? oooO00o.f16837o00oO0o : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class OooO0O0 implements CompoundButton.OnCheckedChangeListener {
        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Chip chip = Chip.this;
            OooOO0.OooO00o<Chip> oooO00o = chip.f16771o000oOoO;
            if (oooO00o != null) {
                com.google.android.material.internal.OooO00o oooO00o2 = (com.google.android.material.internal.OooO00o) oooO00o;
                Objects.requireNonNull(oooO00o2);
                if (!z) {
                    com.google.android.material.internal.OooO0O0 oooO0O0 = oooO00o2.f17201OooO00o;
                    if (oooO0O0.OooO0o0(chip, oooO0O0.f17206OooO0o0)) {
                        oooO00o2.f17201OooO00o.OooO0Oo();
                    }
                } else if (oooO00o2.f17201OooO00o.OooO00o(chip)) {
                    oooO00o2.f17201OooO00o.OooO0Oo();
                }
            }
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f16757OoooOO0;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }

    public class OooO0OO extends o000000 {
        public OooO0OO(Chip chip) {
            super(chip);
        }

        @Override // p427o0OoO0o.o000000
        public final int OooOOOO(float f, float f2) {
            Chip chip = Chip.this;
            int i = Chip.f16749Ooooooo;
            return (chip.OooO0o0() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p427o0OoO0o.o000000
        public final void OooOOOo(@NonNull List<Integer> list) {
            boolean z = false;
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(0);
            Chip chip = Chip.this;
            int i = Chip.f16749Ooooooo;
            if (chip.OooO0o0()) {
                Chip chip2 = Chip.this;
                com.google.android.material.chip.OooO00o oooO00o = chip2.f16755OoooO00;
                if (oooO00o != null && oooO00o.f16842o0Oo0oo) {
                    z = true;
                }
                if (!z || chip2.f16753OoooO == null) {
                    return;
                }
                arrayList.add(1);
            }
        }

        @Override // p427o0OoO0o.o000000
        public final void OooOo0(@NonNull o0000OO0 o0000oo1) {
            o0000oo1.OooOooO(Chip.this.OooO0o());
            o0000oo1.Oooo00O(Chip.this.isClickable());
            o0000oo1.Oooo000(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                o0000oo1.OooooO0(text);
            } else {
                o0000oo1.Oooo0O0(text);
            }
        }

        @Override // p427o0OoO0o.o000000
        public final boolean OooOo00(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.OooO0oO();
            }
            return false;
        }

        @Override // p427o0OoO0o.o000000
        public final void OooOo0O(int i, @NonNull o0000OO0 o0000oo1) {
            if (i != 1) {
                o0000oo1.Oooo0O0("");
                o0000oo1.OooOoo0(Chip.f16751o0OoOo0);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                o0000oo1.Oooo0O0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i2 = OooOo.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                o0000oo1.Oooo0O0(context.getString(i2, objArr).trim());
            }
            o0000oo1.OooOoo0(Chip.this.getCloseIconTouchBoundsInt());
            o0000oo1.OooO0O0(o0000OO0.OooO00o.f28200OooO0oO);
            o0000oo1.Oooo0o0(Chip.this.isEnabled());
        }

        @Override // p427o0OoO0o.o000000
        public final void OooOo0o(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f16761OoooOoO = z;
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
        this.f16768Oooooo.setEmpty();
        if (OooO0o0() && this.f16753OoooO != null) {
            com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
            oooO00o.Oooo000(oooO00o.getBounds(), this.f16768Oooooo);
        }
        return this.f16768Oooooo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f16769Oooooo0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f16769Oooooo0;
    }

    @Nullable
    private OooO0o getTextAppearance() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16806o0000OO.f17328OooO0o;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f16760OoooOo0 != z) {
            this.f16760OoooOo0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f16759OoooOOo != z) {
            this.f16759OoooOOo = z;
            refreshDrawableState();
        }
    }

    public final void OooO() {
        if (OooO0o0()) {
            com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
            if ((oooO00o != null && oooO00o.f16842o0Oo0oo) && this.f16753OoooO != null) {
                ViewCompat.OooOo0o(this, this.f16766OooooOO);
                this.f16767OooooOo = true;
                return;
            }
        }
        ViewCompat.OooOo0o(this, null);
        this.f16767OooooOo = false;
    }

    @Override // com.google.android.material.chip.OooO00o.InterfaceC0106OooO00o
    public final void OooO00o() {
        OooO0Oo(this.f16764Ooooo0o);
        requestLayout();
        invalidateOutline();
    }

    public final boolean OooO0Oo(@Dimension int i) {
        this.f16764Ooooo0o = i;
        if (!this.f16762OoooOoo) {
            if (this.f16754OoooO0 != null) {
                OooO0oo();
            } else {
                OooOO0();
            }
            return false;
        }
        int iMax = Math.max(0, i - ((int) this.f16755OoooO00.f16833o00Oo0));
        int iMax2 = Math.max(0, i - this.f16755OoooO00.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f16754OoooO0 != null) {
                OooO0oo();
            } else {
                OooOO0();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f16754OoooO0 != null) {
            Rect rect = new Rect();
            this.f16754OoooO0.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                OooOO0();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f16754OoooO0 = new InsetDrawable((Drawable) this.f16755OoooO00, i2, i3, i2, i3);
        OooOO0();
        return true;
    }

    public final boolean OooO0o() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null && oooO00o.f16793o000000O;
    }

    public final boolean OooO0o0() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return (oooO00o == null || oooO00o.Oooo0() == null) ? false : true;
    }

    @CallSuper
    public final boolean OooO0oO() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f16753OoooO;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f16767OooooOo) {
            this.f16766OooooOO.OooOoO0(1, 1);
        }
        return z;
    }

    public final void OooO0oo() {
        if (this.f16754OoooO0 != null) {
            this.f16754OoooO0 = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            OooOO0();
        }
    }

    public final void OooOO0() {
        int[] iArr = o0OOO0OO.OooO0O0.f38129OooO00o;
        OooOO0O();
    }

    public final void OooOO0O() {
        this.f16756OoooO0O = new RippleDrawable(o0OOO0OO.OooO0O0.OooO0OO(this.f16755OoooO00.f16846oo000o), getBackgroundDrawable(), null);
        this.f16755OoooO00.oo000o();
        RippleDrawable rippleDrawable = this.f16756OoooO0O;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, rippleDrawable);
        OooOO0o();
    }

    public final void OooOO0o() {
        com.google.android.material.chip.OooO00o oooO00o;
        if (TextUtils.isEmpty(getText()) || (oooO00o = this.f16755OoooO00) == null) {
            return;
        }
        int iOooo00O = (int) (oooO00o.Oooo00O() + oooO00o.f16822o0000oo + oooO00o.f16801o00000oo);
        com.google.android.material.chip.OooO00o oooO00o2 = this.f16755OoooO00;
        int iOooOooO = (int) (oooO00o2.OooOooO() + oooO00o2.f16798o00000Oo + oooO00o2.f16800o00000oO);
        if (this.f16754OoooO0 != null) {
            Rect rect = new Rect();
            this.f16754OoooO0.getPadding(rect);
            iOooOooO += rect.left;
            iOooo00O += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO.OooOO0O(this, iOooOooO, paddingTop, iOooo00O, paddingBottom);
    }

    public final void OooOOO0() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            paint.drawableState = oooO00o.getState();
        }
        OooO0o textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.OooO0o0(getContext(), paint, this.f16770OoooooO);
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f16767OooooOo) {
            return this.f16766OooooOO.OooOOO(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.f16767OooooOo) {
            return super.dispatchKeyEvent(keyEvent);
        }
        OooO0OO oooO0OO = this.f16766OooooOO;
        Objects.requireNonNull(oooO0OO);
        boolean zOooOOo = false;
        int i2 = 0;
        zOooOOo = false;
        zOooOOo = false;
        zOooOOo = false;
        zOooOOo = false;
        zOooOOo = false;
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
                                while (i2 < repeatCount && oooO0OO.OooOOo(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zOooOOo = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = oooO0OO.f39883OooOO0o;
                                if (i != Integer.MIN_VALUE) {
                                    oooO0OO.OooOo00(i, 16, null);
                                }
                                zOooOOo = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = oooO0OO.f39883OooOO0o;
                    if (i != Integer.MIN_VALUE) {
                        oooO0OO.OooOo00(i, 16, null);
                    }
                    zOooOOo = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zOooOOo = oooO0OO.OooOOo(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zOooOOo = oooO0OO.OooOOo(1, null);
            }
        }
        if (!zOooOOo || this.f16766OooooOO.f39883OooOO0o == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        boolean zOooooo = false;
        int i2 = 0;
        zOooooo = false;
        if (oooO00o != null && com.google.android.material.chip.OooO00o.Oooo0o0(oooO00o.f16840o0OO00O)) {
            com.google.android.material.chip.OooO00o oooO00o2 = this.f16755OoooO00;
            ?? IsEnabled = isEnabled();
            if (this.f16761OoooOoO) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f16760OoooOo0) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f16759OoooOOo) {
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
            }
            if (this.f16761OoooOoO) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f16760OoooOo0) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f16759OoooOOo) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zOooooo = oooO00o2.Oooooo(iArr);
        }
        if (zOooooo) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f16765OooooO0)) {
            return this.f16765OooooO0;
        }
        if (!OooO0o()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f16776OoooO.f17205OooO0Oo) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f16754OoooO0;
        return insetDrawable == null ? this.f16755OoooO00 : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16791o00000;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16796o00000O0;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16832o00O0O;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooO00o.Oooo00o()) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public Drawable getChipDrawable() {
        return this.f16755OoooO00;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16822o0000oo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o == null || (drawable = oooO00o.f16843o0ooOO0) == null) {
            return null;
        }
        return o0OOO0o.OooO0Oo(drawable);
    }

    public float getChipIconSize() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16845o0ooOoO : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16844o0ooOOo;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16833o00Oo0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16798o00000Oo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16835o00o0O;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16838o00ooo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.Oooo0();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16792o000000;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16804o0000O00 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16829o000OOo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16790o0000 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16839o0O0O00;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16827o000O0o;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@NonNull Rect rect) {
        if (this.f16767OooooOo) {
            OooO0OO oooO0OO = this.f16766OooooOO;
            if (oooO0OO.f39883OooOO0o == 1 || oooO0OO.f39882OooOO0O == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public OooOo00 getHideMotionSpec() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16797o00000OO;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16813o0000Ooo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16799o00000o0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16846oo000o;
        }
        return null;
    }

    @NonNull
    public com.google.android.material.shape.OooO00o getShapeAppearanceModel() {
        return this.f16755OoooO00.f17510Oooo0o.f17534OooO00o;
    }

    @Nullable
    public OooOo00 getShowMotionSpec() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            return oooO00o.f16795o00000O;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16801o00000oo : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        return oooO00o != null ? oooO00o.f16800o00000oO : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0Oo(this, this.f16755OoooO00);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16752ooOO);
        }
        if (OooO0o()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16750o00O0O);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f16767OooooOo) {
            OooO0OO oooO0OO = this.f16766OooooOO;
            int i2 = oooO0OO.f39883OooOO0o;
            if (i2 != Integer.MIN_VALUE) {
                oooO0OO.OooOO0O(i2);
            }
            if (z) {
                oooO0OO.OooOOo(i, rect);
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
        accessibilityNodeInfo.setCheckable(OooO0o());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.f17182Oooo0oo) {
                i = -1;
                break;
            }
            int i2 = 0;
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                if (chipGroup.getChildAt(i2) instanceof Chip) {
                    if (((Chip) chipGroup.getChildAt(i2)) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(OooOOO0.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o0000OO0.OooO0OO.OooO00o(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).f28217OooO00o);
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
        if (this.f16763Ooooo00 != i) {
            this.f16763Ooooo00 = i;
            OooOO0o();
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
                } else if (this.f16759OoooOOo) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f16759OoooOOo) {
                    OooO0oO();
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
        this.f16765OooooO0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16756OoooO0O) {
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
        if (drawable == getBackgroundDrawable() || drawable == this.f16756OoooO0O) {
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Oooo0oo(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Oooo0oo(oooO00o.f16818o0000oO.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o == null) {
            this.f16758OoooOOO = z;
        } else if (oooO00o.f16793o000000O) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Oooo(drawable);
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Oooo(OooOO0O.OooO0O0(oooO00o.f16818o0000oO, i));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO00(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO00(OooOO0O.OooO00o(oooO00o.f16818o0000oO, i));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO0(oooO00o.f16818o0000oO.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO0O(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO0O(OooOO0O.OooO00o(oooO00o.f16818o0000oO, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.OooO00o oooO00o) {
        com.google.android.material.chip.OooO00o oooO00o2 = this.f16755OoooO00;
        if (oooO00o2 != oooO00o) {
            if (oooO00o2 != null) {
                oooO00o2.f16830o000OoO = new WeakReference<>(null);
            }
            this.f16755OoooO00 = oooO00o;
            oooO00o.f16831o000Ooo = false;
            Objects.requireNonNull(oooO00o);
            oooO00o.f16830o000OoO = new WeakReference<>(this);
            OooO0Oo(this.f16764Ooooo0o);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOO0(f);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOO0(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o000oOoO(drawable);
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o000oOoO(OooOO0O.OooO0O0(oooO00o.f16818o0000oO, i));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOOO(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOOO(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOOo(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOOo(OooOO0O.OooO00o(oooO00o.f16818o0000oO, i));
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOo0(oooO00o.f16818o0000oO.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOoO(f);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOoO(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOoo(f);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOoo(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Ooooo00(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Ooooo00(OooOO0O.OooO00o(oooO00o.f16818o0000oO, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Ooooo0o(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Ooooo0o(oooO00o.f16818o0000oO.getResources().getDimension(i));
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OooooO0(drawable);
        }
        OooO();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o == null || oooO00o.f16792o000000 == charSequence) {
            return;
        }
        o000O0Oo.OooO00o oooO00oOooO0OO = o000O0Oo.OooO00o.OooO0OO();
        oooO00o.f16792o000000 = (SpannableStringBuilder) oooO00oOooO0OO.OooO0Oo(charSequence, oooO00oOooO0OO.f28144OooO0OO);
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OooooOO(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OooooOO(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OooooO0(OooOO0O.OooO0O0(oooO00o.f16818o0000oO, i));
        }
        OooO();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OooooOo(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OooooOo(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Oooooo0(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Oooooo0(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooooO(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooooO(OooOO0O.OooO00o(oooO00o.f16818o0000oO, i));
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OooOOOO(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f16755OoooO00 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.f16827o000O0o = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f16762OoooOoo = z;
        OooO0Oo(this.f16764Ooooo0o);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable OooOo00 oooOo00) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.f16797o00000OO = oooOo00;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.f16797o00000OO = OooOo00.OooO0O0(oooO00o.f16818o0000oO, i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o0OoOo0(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o0OoOo0(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.ooOO(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.ooOO(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.internal.OooOO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable OooOO0.OooO00o<Chip> oooO00o) {
        this.f16771o000oOoO = oooO00o;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f16755OoooO00 == null) {
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.f16826o000O0O = i;
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
        this.f16757OoooOO0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f16753OoooO = onClickListener;
        OooO();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00O0O(colorStateList);
        }
        if (this.f16755OoooO00.f16789o000) {
            return;
        }
        OooOO0O();
    }

    public void setRippleColorResource(@ColorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00O0O(OooOO0O.OooO00o(oooO00o.f16818o0000oO, i));
            if (this.f16755OoooO00.f16789o000) {
                return;
            }
            OooOO0O();
        }
    }

    @Override // p347o0OOO0o0.o00000
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f16755OoooO00.setShapeAppearanceModel(oooO00o);
    }

    public void setShowMotionSpec(@Nullable OooOo00 oooOo00) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.f16795o00000O = oooOo00;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.f16795o00000O = OooOo00.OooO0O0(oooO00o.f16818o0000oO, i);
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(oooO00o.f16831o000Ooo ? null : charSequence, bufferType);
        com.google.android.material.chip.OooO00o oooO00o2 = this.f16755OoooO00;
        if (oooO00o2 != null) {
            oooO00o2.o00Oo0(charSequence);
        }
    }

    public void setTextAppearance(@Nullable OooO0o oooO0o) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00Ooo(oooO0o);
        }
        OooOOO0();
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00o0O(f);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00o0O(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00ooo(f);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00ooo(oooO00o.f16818o0000oO.getResources().getDimension(i));
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.Ooooooo(z);
        }
        OooO();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = f16749Ooooooo;
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16769Oooooo0 = new Rect();
        this.f16768Oooooo = new RectF();
        this.f16770OoooooO = new OooO00o();
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
        Context context3 = oooO00o.f16818o0000oO;
        int[] iArr = Oooo0.Chip;
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context3, attributeSet, iArr, i, i2, new int[0]);
        int i3 = Oooo0.Chip_shapeAppearance;
        oooO00o.o000Oo0 = typedArrayOooO0Oo.hasValue(i3);
        ColorStateList colorStateListOooO00o = o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_chipSurfaceColor);
        if (oooO00o.f16848ooOO != colorStateListOooO00o) {
            oooO00o.f16848ooOO = colorStateListOooO00o;
            oooO00o.onStateChange(oooO00o.getState());
        }
        oooO00o.OoooO0O(o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_chipBackgroundColor));
        oooO00o.OoooOoO(typedArrayOooO0Oo.getDimension(Oooo0.Chip_chipMinHeight, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        int i4 = Oooo0.Chip_chipCornerRadius;
        if (typedArrayOooO0Oo.hasValue(i4)) {
            oooO00o.OoooO(typedArrayOooO0Oo.getDimension(i4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        }
        oooO00o.Ooooo00(o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_chipStrokeColor));
        oooO00o.Ooooo0o(typedArrayOooO0Oo.getDimension(Oooo0.Chip_chipStrokeWidth, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.o00O0O(o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_rippleColor));
        oooO00o.o00Oo0(typedArrayOooO0Oo.getText(Oooo0.Chip_android_text));
        OooO0o oooO0oOooO0o0 = o0OOO0O.OooO0OO.OooO0o0(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_android_textAppearance);
        oooO0oOooO0o0.f38045OooOO0O = typedArrayOooO0Oo.getDimension(Oooo0.Chip_android_textSize, oooO0oOooO0o0.f38045OooOO0O);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 23) {
            oooO0oOooO0o0.f38044OooOO0 = o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_android_textColor);
        }
        oooO00o.o00Ooo(oooO0oOooO0o0);
        int i6 = typedArrayOooO0Oo.getInt(Oooo0.Chip_android_ellipsize, 0);
        if (i6 == 1) {
            oooO00o.f16827o000O0o = TextUtils.TruncateAt.START;
        } else if (i6 == 2) {
            oooO00o.f16827o000O0o = TextUtils.TruncateAt.MIDDLE;
        } else if (i6 == 3) {
            oooO00o.f16827o000O0o = TextUtils.TruncateAt.END;
        }
        oooO00o.OoooOo0(typedArrayOooO0Oo.getBoolean(Oooo0.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            oooO00o.OoooOo0(typedArrayOooO0Oo.getBoolean(Oooo0.Chip_chipIconEnabled, false));
        }
        oooO00o.o000oOoO(o0OOO0O.OooO0OO.OooO0Oo(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_chipIcon));
        int i7 = Oooo0.Chip_chipIconTint;
        if (typedArrayOooO0Oo.hasValue(i7)) {
            oooO00o.OoooOOo(o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, i7));
        }
        oooO00o.OoooOOO(typedArrayOooO0Oo.getDimension(Oooo0.Chip_chipIconSize, -1.0f));
        oooO00o.Ooooooo(typedArrayOooO0Oo.getBoolean(Oooo0.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            oooO00o.Ooooooo(typedArrayOooO0Oo.getBoolean(Oooo0.Chip_closeIconEnabled, false));
        }
        oooO00o.OooooO0(o0OOO0O.OooO0OO.OooO0Oo(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_closeIcon));
        oooO00o.OoooooO(o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_closeIconTint));
        oooO00o.OooooOo(typedArrayOooO0Oo.getDimension(Oooo0.Chip_closeIconSize, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.Oooo0oo(typedArrayOooO0Oo.getBoolean(Oooo0.Chip_android_checkable, false));
        oooO00o.OoooO0(typedArrayOooO0Oo.getBoolean(Oooo0.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            oooO00o.OoooO0(typedArrayOooO0Oo.getBoolean(Oooo0.Chip_checkedIconEnabled, false));
        }
        oooO00o.Oooo(o0OOO0O.OooO0OO.OooO0Oo(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_checkedIcon));
        int i8 = Oooo0.Chip_checkedIconTint;
        if (typedArrayOooO0Oo.hasValue(i8)) {
            oooO00o.OoooO00(o0OOO0O.OooO0OO.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, i8));
        }
        oooO00o.f16795o00000O = OooOo00.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_showMotionSpec);
        oooO00o.f16797o00000OO = OooOo00.OooO00o(oooO00o.f16818o0000oO, typedArrayOooO0Oo, Oooo0.Chip_hideMotionSpec);
        oooO00o.OoooOoo(typedArrayOooO0Oo.getDimension(Oooo0.Chip_chipStartPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.ooOO(typedArrayOooO0Oo.getDimension(Oooo0.Chip_iconStartPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.o0OoOo0(typedArrayOooO0Oo.getDimension(Oooo0.Chip_iconEndPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.o00ooo(typedArrayOooO0Oo.getDimension(Oooo0.Chip_textStartPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.o00o0O(typedArrayOooO0Oo.getDimension(Oooo0.Chip_textEndPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.Oooooo0(typedArrayOooO0Oo.getDimension(Oooo0.Chip_closeIconStartPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.OooooOO(typedArrayOooO0Oo.getDimension(Oooo0.Chip_closeIconEndPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.OoooOO0(typedArrayOooO0Oo.getDimension(Oooo0.Chip_chipEndPadding, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        oooO00o.f16826o000O0O = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayOooO0Oo.recycle();
        TypedArray typedArrayOooO0Oo2 = o000oOoO.OooO0Oo(context2, attributeSet, iArr, i, i2, new int[0]);
        this.f16762OoooOoo = typedArrayOooO0Oo2.getBoolean(Oooo0.Chip_ensureMinTouchTargetSize, false);
        this.f16764Ooooo0o = (int) Math.ceil(typedArrayOooO0Oo2.getDimension(Oooo0.Chip_chipMinTouchTargetSize, (float) Math.ceil(o00Ooo.OooO0O0(getContext(), 48))));
        typedArrayOooO0Oo2.recycle();
        setChipDrawable(oooO00o);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        oooO00o.OooOOOO(ViewCompat.OooOOO.OooO(this));
        TypedArray typedArrayOooO0Oo3 = o000oOoO.OooO0Oo(context2, attributeSet, iArr, i, i2, new int[0]);
        if (i5 < 23) {
            setTextColor(o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo3, Oooo0.Chip_android_textColor));
        }
        boolean zHasValue = typedArrayOooO0Oo3.hasValue(i3);
        typedArrayOooO0Oo3.recycle();
        this.f16766OooooOO = new OooO0OO(this);
        OooO();
        if (!zHasValue) {
            setOutlineProvider(new o0OO0oO.OooO00o(this));
        }
        setChecked(this.f16758OoooOOO);
        setText(oooO00o.f16837o00oO0o);
        setEllipsize(oooO00o.f16827o000O0o);
        OooOOO0();
        if (!this.f16755OoooO00.f16831o000Ooo) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        OooOO0o();
        if (this.f16762OoooOoo) {
            setMinHeight(this.f16764Ooooo0o);
        }
        this.f16763Ooooo00 = ViewCompat.OooO.OooO0Oo(this);
        super.setOnCheckedChangeListener(new OooO0O0());
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooO0(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.OoooOo0(z);
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
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00Ooo(new OooO0o(oooO00o.f16818o0000oO, i));
        }
        OooOOO0();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.OooO00o oooO00o = this.f16755OoooO00;
        if (oooO00o != null) {
            oooO00o.o00Ooo(new OooO0o(oooO00o.f16818o0000oO, i));
        }
        OooOOO0();
    }
}
