package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final OooO00o f3081OoooOO0 = new OooO00o();

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final int[] f3082o000oOoO = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Drawable f3083OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Drawable f3084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PorterDuff.Mode f3085OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ColorStateList f3086OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f3087OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f3088OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ColorStateList f3089OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public PorterDuff.Mode f3090OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f3091OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f3092OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f3093OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f3094OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f3095OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public CharSequence f3096OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f3097OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public CharSequence f3098OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f3099OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public CharSequence f3100OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public CharSequence f3101OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f3102OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f3103OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f3104OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f3105OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final VelocityTracker f3106OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f3107OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f3108OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f3109OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f3110OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public p014OooOoO.OooO f3111Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f3112Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f3113Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f3114Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f3115Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f3116Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f3117Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ColorStateList f3118Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final TextPaint f3119Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public StaticLayout f3120Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public StaticLayout f3121Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Rect f3122OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NonNull
    public OooOOOO f3123OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ObjectAnimator f3124OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public OooO0OO f3125OoooO0O;

    public class OooO00o extends Property<SwitchCompat, Float> {
        public OooO00o() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f3107OooOoo);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    @RequiresApi(18)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public static class OooO0OO extends EmojiCompat.OooOO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakReference f3126OooO0Oo;

        public OooO0OO(SwitchCompat switchCompat) {
            this.f3126OooO0Oo = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOO0
        public final void onFailed(@Nullable Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f3126OooO0Oo.get();
            if (switchCompat != null) {
                switchCompat.OooO0Oo();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooOO0
        public final void onInitialized() {
            SwitchCompat switchCompat = (SwitchCompat) this.f3126OooO0Oo.get();
            if (switchCompat != null) {
                switchCompat.OooO0Oo();
            }
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOOO getEmojiTextViewHelper() {
        if (this.f3123OoooO0 == null) {
            this.f3123OoooO0 = new OooOOOO(this);
        }
        return this.f3123OoooO0;
    }

    private boolean getTargetCheckedState() {
        return this.f3107OooOoo > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((o0O0ooO.OooO00o(this) ? 1.0f - this.f3107OooOoo : this.f3107OooOoo) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3083OooO;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3122OoooO;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3084OooO0Oo;
        Rect rectOooO0O0 = drawable2 != null ? o000000.OooO0O0(drawable2) : o000000.f3197OooO0OO;
        return ((((this.f3109OooOooO - this.f3113Oooo000) - rect.left) - rect.right) - rectOooO0O0.left) - rectOooO0O0.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3101OooOo00 = charSequence;
        OooOOOO emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodOooO0o0 = emojiTextViewHelper.f2992OooO0O0.f33769OooO00o.OooO0o0(this.f3111Oooo);
        if (transformationMethodOooO0o0 != null) {
            charSequence = transformationMethodOooO0o0.getTransformation(charSequence, this);
        }
        this.f3100OooOo0 = charSequence;
        this.f3121Oooo0oo = null;
        if (this.f3102OooOo0O) {
            OooO0o0();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3096OooOOo = charSequence;
        OooOOOO emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodOooO0o0 = emojiTextViewHelper.f2992OooO0O0.f33769OooO00o.OooO0o0(this.f3111Oooo);
        if (transformationMethodOooO0o0 != null) {
            charSequence = transformationMethodOooO0o0.getTransformation(charSequence, this);
        }
        this.f3098OooOOoo = charSequence;
        this.f3120Oooo0oO = null;
        if (this.f3102OooOo0O) {
            OooO0o0();
        }
    }

    public final void OooO00o() {
        Drawable drawable = this.f3084OooO0Oo;
        if (drawable != null) {
            if (this.f3087OooO0oO || this.f3088OooO0oo) {
                Drawable drawableMutate = drawable.mutate();
                this.f3084OooO0Oo = drawableMutate;
                if (this.f3087OooO0oO) {
                    o00000oo.o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f3086OooO0o0);
                }
                if (this.f3088OooO0oo) {
                    o00000oo.o00Ooo.OooO0O0.OooO(this.f3084OooO0Oo, this.f3085OooO0o);
                }
                if (this.f3084OooO0Oo.isStateful()) {
                    this.f3084OooO0Oo.setState(getDrawableState());
                }
            }
        }
    }

    public final void OooO0O0() {
        Drawable drawable = this.f3083OooO;
        if (drawable != null) {
            if (this.f3091OooOO0o || this.f3093OooOOO0) {
                Drawable drawableMutate = drawable.mutate();
                this.f3083OooO = drawableMutate;
                if (this.f3091OooOO0o) {
                    o00000oo.o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f3089OooOO0);
                }
                if (this.f3093OooOOO0) {
                    o00000oo.o00Ooo.OooO0O0.OooO(this.f3083OooO, this.f3090OooOO0O);
                }
                if (this.f3083OooO.isStateful()) {
                    this.f3083OooO.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout OooO0OO(CharSequence charSequence) {
        TextPaint textPaint = this.f3119Oooo0o0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void OooO0Oo() {
        setTextOnInternal(this.f3096OooOOo);
        setTextOffInternal(this.f3101OooOo00);
        requestLayout();
    }

    public final void OooO0o0() {
        if (this.f3125OoooO0O == null && this.f3123OoooO0.f2992OooO0O0.f33769OooO00o.OooO0O0() && EmojiCompat.OooO0OO()) {
            EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
            int iOooO0O0 = emojiCompatOooO00o.OooO0O0();
            if (iOooO0O0 == 3 || iOooO0O0 == 0) {
                OooO0OO oooO0OO = new OooO0OO(this);
                this.f3125OoooO0O = oooO0OO;
                emojiCompatOooO00o.OooO(oooO0OO);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f3114Oooo00O;
        int i4 = this.f3115Oooo00o;
        int i5 = this.f3112Oooo0;
        int i6 = this.f3116Oooo0O0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f3084OooO0Oo;
        Rect rectOooO0O0 = drawable != null ? o000000.OooO0O0(drawable) : o000000.f3197OooO0OO;
        Drawable drawable2 = this.f3083OooO;
        Rect rect = this.f3122OoooO;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectOooO0O0 != null) {
                int i8 = rectOooO0O0.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectOooO0O0.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectOooO0O0.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectOooO0O0.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f3083OooO.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3083OooO.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3084OooO0Oo;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f3113Oooo000 + rect.right;
            this.f3084OooO0Oo.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                o00000oo.o00Ooo.OooO0O0.OooO0o(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3084OooO0Oo;
        if (drawable != null) {
            o00000oo.o00Ooo.OooO0O0.OooO0o0(drawable, f, f2);
        }
        Drawable drawable2 = this.f3083OooO;
        if (drawable2 != null) {
            o00000oo.o00Ooo.OooO0O0.OooO0o0(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3084OooO0Oo;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f3083OooO;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!o0O0ooO.OooO00o(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3109OooOooO;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3095OooOOOo : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (o0O0ooO.OooO00o(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3109OooOooO;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3095OooOOOo : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.OooO0o0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3102OooOo0O;
    }

    public boolean getSplitTrack() {
        return this.f3097OooOOo0;
    }

    public int getSwitchMinWidth() {
        return this.f3094OooOOOO;
    }

    public int getSwitchPadding() {
        return this.f3095OooOOOo;
    }

    public CharSequence getTextOff() {
        return this.f3101OooOo00;
    }

    public CharSequence getTextOn() {
        return this.f3096OooOOo;
    }

    public Drawable getThumbDrawable() {
        return this.f3084OooO0Oo;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getThumbPosition() {
        return this.f3107OooOoo;
    }

    public int getThumbTextPadding() {
        return this.f3092OooOOO;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f3086OooO0o0;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f3085OooO0o;
    }

    public Drawable getTrackDrawable() {
        return this.f3083OooO;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f3089OooOO0;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f3090OooOO0O;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3084OooO0Oo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3083OooO;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3124OoooO00;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3124OoooO00.end();
        this.f3124OoooO00 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3082o000oOoO);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3083OooO;
        Rect rect = this.f3122OoooO;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f3115Oooo00o;
        int i2 = this.f3116Oooo0O0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f3084OooO0Oo;
        if (drawable != null) {
            if (!this.f3097OooOOo0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectOooO0O0 = o000000.OooO0O0(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectOooO0O0.left;
                rect.right -= rectOooO0O0.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3120Oooo0oO : this.f3121Oooo0oo;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3118Oooo0o;
            TextPaint textPaint = this.f3119Oooo0o0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3096OooOOo : this.f3101OooOo00;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f3084OooO0Oo != null) {
            Drawable drawable = this.f3083OooO;
            Rect rect = this.f3122OoooO;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectOooO0O0 = o000000.OooO0O0(this.f3084OooO0Oo);
            iMax = Math.max(0, rectOooO0O0.left - rect.left);
            iMax2 = Math.max(0, rectOooO0O0.right - rect.right);
        } else {
            iMax = 0;
        }
        if (o0O0ooO.OooO00o(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f3109OooOooO + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f3109OooOooO) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f3110OooOooo;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f3110OooOooo + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f3110OooOooo;
        }
        this.f3114Oooo00O = paddingLeft;
        this.f3115Oooo00o = paddingTop;
        this.f3116Oooo0O0 = height;
        this.f3112Oooo0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.f3102OooOo0O) {
            if (this.f3120Oooo0oO == null) {
                this.f3120Oooo0oO = OooO0OO(this.f3098OooOOoo);
            }
            if (this.f3121Oooo0oo == null) {
                this.f3121Oooo0oo = OooO0OO(this.f3100OooOo0);
            }
        }
        Drawable drawable = this.f3084OooO0Oo;
        int intrinsicHeight2 = 0;
        Rect rect = this.f3122OoooO;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3084OooO0Oo.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3084OooO0Oo.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f3102OooOo0O) {
            iMax = (this.f3092OooOOO * 2) + Math.max(this.f3120Oooo0oO.getWidth(), this.f3121Oooo0oo.getWidth());
        } else {
            iMax = 0;
        }
        this.f3113Oooo000 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f3083OooO;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3083OooO.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f3084OooO0Oo;
        if (drawable3 != null) {
            Rect rectOooO0O0 = o000000.OooO0O0(drawable3);
            iMax2 = Math.max(iMax2, rectOooO0O0.left);
            iMax3 = Math.max(iMax3, rectOooO0O0.right);
        }
        int iMax4 = this.f3117Oooo0OO ? Math.max(this.f3094OooOOOO, (this.f3113Oooo000 * 2) + iMax2 + iMax3) : this.f3094OooOOOO;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3109OooOooO = iMax4;
        this.f3110OooOooo = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3096OooOOo : this.f3101OooOo00;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.f3106OooOoOO;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3099OooOo;
        boolean z2 = false;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.f3103OooOo0o == 2) {
                    this.f3103OooOo0o = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f3108OooOoo0) {
                            targetCheckedState = o0O0ooO.OooO00o(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f3103OooOo0o = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f3103OooOo0o;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.f3105OooOoO0) > i || Math.abs(y - this.f3104OooOoO) > i) {
                        this.f3103OooOo0o = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f3105OooOoO0 = x;
                        this.f3104OooOoO = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f3 = x2 - this.f3105OooOoO0;
                    if (thumbScrollRange != 0) {
                        f = f3 / thumbScrollRange;
                    } else {
                        f = f3 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (o0O0ooO.OooO00o(this)) {
                        f = -f;
                    }
                    float f4 = this.f3107OooOoo;
                    float f5 = f + f4;
                    if (f5 >= 0.0f) {
                        f2 = f5 > 1.0f ? 1.0f : f5;
                    }
                    if (f2 != f4) {
                        this.f3105OooOoO0 = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f3103OooOo0o == 2) {
                    this.f3103OooOo0o = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f3108OooOoo0) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (o0O0ooO.OooO00o(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f3103OooOo0o = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                if (this.f3084OooO0Oo != null) {
                    int thumbOffset = getThumbOffset();
                    Drawable drawable = this.f3084OooO0Oo;
                    Rect rect = this.f3122OoooO;
                    drawable.getPadding(rect);
                    int i3 = this.f3115Oooo00o - i;
                    int i4 = (this.f3114Oooo00O + thumbOffset) - i;
                    int i5 = this.f3113Oooo000 + i4 + rect.left + rect.right + i;
                    int i6 = this.f3116Oooo0O0 + i;
                    if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.f3103OooOo0o = 1;
                    this.f3105OooOoO0 = x3;
                    this.f3104OooOoO = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f3096OooOOo;
                if (string == null) {
                    string = getResources().getString(p012OooOo0O.o000oOoO.abc_capital_on);
                }
                WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
                new androidx.core.view.o000O000(o00000O0.OooO.tag_state_description).OooO0o0(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f3101OooOo00;
            if (string2 == null) {
                string2 = getResources().getString(p012OooOo0O.o000oOoO.abc_capital_off);
            }
            WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap2 = ViewCompat.f5344OooO00o;
            new androidx.core.view.o000O000(o00000O0.OooO.tag_state_description).OooO0o0(this, string2);
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap3 = ViewCompat.f5344OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(this)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3081OoooOO0, zIsChecked ? 1.0f : 0.0f);
                this.f3124OoooO00 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                OooO0O0.OooO00o(this.f3124OoooO00, true);
                this.f3124OoooO00.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f3124OoooO00;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
        setTextOnInternal(this.f3096OooOOo);
        setTextOffInternal(this.f3101OooOo00);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f3117Oooo0OO = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f3102OooOo0O != z) {
            this.f3102OooOo0O = z;
            requestLayout();
            if (z) {
                OooO0o0();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f3097OooOOo0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3094OooOOOO = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3095OooOOOo = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3119Oooo0o0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f3101OooOo00;
        if (string == null) {
            string = getResources().getString(p012OooOo0O.o000oOoO.abc_capital_off);
        }
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        new androidx.core.view.o000O000(o00000O0.OooO.tag_state_description).OooO0o0(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f3096OooOOo;
        if (string == null) {
            string = getResources().getString(p012OooOo0O.o000oOoO.abc_capital_on);
        }
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        new androidx.core.view.o000O000(o00000O0.OooO.tag_state_description).OooO0o0(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3084OooO0Oo;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3084OooO0Oo = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f3107OooOoo = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3092OooOOO = i;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f3086OooO0o0 = colorStateList;
        this.f3087OooO0oO = true;
        OooO00o();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f3085OooO0o = mode;
        this.f3088OooO0oo = true;
        OooO00o();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3083OooO;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3083OooO = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f3089OooOO0 = colorStateList;
        this.f3091OooOO0o = true;
        OooO0O0();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f3090OooOO0O = mode;
        this.f3093OooOOO0 = true;
        OooO0O0();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3084OooO0Oo || drawable == this.f3083OooO;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Typeface typeface;
        Typeface typefaceCreate;
        int resourceId;
        super(context, attributeSet, i);
        this.f3086OooO0o0 = null;
        this.f3085OooO0o = null;
        this.f3087OooO0oO = false;
        this.f3088OooO0oo = false;
        this.f3089OooOO0 = null;
        this.f3090OooOO0O = null;
        this.f3091OooOO0o = false;
        this.f3093OooOOO0 = false;
        this.f3106OooOoOO = VelocityTracker.obtain();
        this.f3117Oooo0OO = true;
        this.f3122OoooO = new Rect();
        o0000O.OooO00o(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f3119Oooo0o0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = p012OooOo0O.o00O0O.SwitchCompat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o000Oo0 o000oo1 = new o000Oo0(context, typedArrayObtainStyledAttributes);
        ViewCompat.OooOOO(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        Drawable drawableOooO0o0 = o000oo1.OooO0o0(p012OooOo0O.o00O0O.SwitchCompat_android_thumb);
        this.f3084OooO0Oo = drawableOooO0o0;
        if (drawableOooO0o0 != null) {
            drawableOooO0o0.setCallback(this);
        }
        Drawable drawableOooO0o1 = o000oo1.OooO0o0(p012OooOo0O.o00O0O.SwitchCompat_track);
        this.f3083OooO = drawableOooO0o1;
        if (drawableOooO0o1 != null) {
            drawableOooO0o1.setCallback(this);
        }
        setTextOnInternal(o000oo1.OooOO0O(p012OooOo0O.o00O0O.SwitchCompat_android_textOn));
        setTextOffInternal(o000oo1.OooOO0O(p012OooOo0O.o00O0O.SwitchCompat_android_textOff));
        this.f3102OooOo0O = o000oo1.OooO00o(p012OooOo0O.o00O0O.SwitchCompat_showText, true);
        this.f3092OooOOO = o000oo1.OooO0Oo(p012OooOo0O.o00O0O.SwitchCompat_thumbTextPadding, 0);
        this.f3094OooOOOO = o000oo1.OooO0Oo(p012OooOo0O.o00O0O.SwitchCompat_switchMinWidth, 0);
        this.f3095OooOOOo = o000oo1.OooO0Oo(p012OooOo0O.o00O0O.SwitchCompat_switchPadding, 0);
        this.f3097OooOOo0 = o000oo1.OooO00o(p012OooOo0O.o00O0O.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListOooO0O0 = o000oo1.OooO0O0(p012OooOo0O.o00O0O.SwitchCompat_thumbTint);
        if (colorStateListOooO0O0 != null) {
            this.f3086OooO0o0 = colorStateListOooO0O0;
            this.f3087OooO0oO = true;
        }
        PorterDuff.Mode modeOooO0OO = o000000.OooO0OO(o000oo1.OooO0oo(p012OooOo0O.o00O0O.SwitchCompat_thumbTintMode, -1), null);
        if (this.f3085OooO0o != modeOooO0OO) {
            this.f3085OooO0o = modeOooO0OO;
            this.f3088OooO0oo = true;
        }
        if (this.f3087OooO0oO || this.f3088OooO0oo) {
            OooO00o();
        }
        ColorStateList colorStateListOooO0O1 = o000oo1.OooO0O0(p012OooOo0O.o00O0O.SwitchCompat_trackTint);
        if (colorStateListOooO0O1 != null) {
            this.f3089OooOO0 = colorStateListOooO0O1;
            this.f3091OooOO0o = true;
        }
        PorterDuff.Mode modeOooO0OO2 = o000000.OooO0OO(o000oo1.OooO0oo(p012OooOo0O.o00O0O.SwitchCompat_trackTintMode, -1), null);
        if (this.f3090OooOO0O != modeOooO0OO2) {
            this.f3090OooOO0O = modeOooO0OO2;
            this.f3093OooOOO0 = true;
        }
        if (this.f3091OooOO0o || this.f3093OooOOO0) {
            OooO0O0();
        }
        int iOooO = o000oo1.OooO(p012OooOo0O.o00O0O.SwitchCompat_switchTextAppearance, 0);
        if (iOooO != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iOooO, p012OooOo0O.o00O0O.TextAppearance);
            int i2 = p012OooOo0O.o00O0O.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.OooO0O0(resourceId, context)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(i2) : colorStateList;
            if (colorStateList != null) {
                this.f3118Oooo0o = colorStateList;
            } else {
                this.f3118Oooo0o = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(p012OooOo0O.o00O0O.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes2.getInt(p012OooOo0O.o00O0O.TextAppearance_android_typeface, -1);
            int i4 = typedArrayObtainStyledAttributes2.getInt(p012OooOo0O.o00O0O.TextAppearance_android_textStyle, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 != 2) {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i4 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(i4);
                } else {
                    typefaceCreate = Typeface.create(typeface, i4);
                }
                setSwitchTypeface(typefaceCreate);
                int i5 = i4 & (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0));
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(p012OooOo0O.o00O0O.TextAppearance_textAllCaps, false)) {
                this.f3111Oooo = new p014OooOoO.OooO(getContext());
            } else {
                this.f3111Oooo = null;
            }
            setTextOnInternal(this.f3096OooOOo);
            setTextOffInternal(this.f3101OooOo00);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new o00Oo0(this).OooO0o(attributeSet, i);
        o000oo1.OooOOO();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3099OooOo = viewConfiguration.getScaledTouchSlop();
        this.f3108OooOoo0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
