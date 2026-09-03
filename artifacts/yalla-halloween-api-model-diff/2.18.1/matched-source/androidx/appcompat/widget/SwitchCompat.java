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
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p069o0000oo0.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public static final Property<SwitchCompat, Float> f5205o000000 = new OooO00o();

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public static final int[] f5206o000000O = {R.attr.state_checked};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f5207Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Drawable f5208Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ColorStateList f5209Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public PorterDuff.Mode f5210Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public PorterDuff.Mode f5211OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Drawable f5212OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f5213OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ColorStateList f5214OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f5215OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f5216OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f5217OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f5218OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f5219OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public CharSequence f5220OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public CharSequence f5221Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public CharSequence f5222Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public CharSequence f5223OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f5224OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f5225OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f5226Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f5227Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public float f5228OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public VelocityTracker f5229Ooooooo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final Rect f5230o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f5231o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f5232o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f5233o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f5234o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f5235o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f5236o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f5237o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f5238o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    @Nullable
    public OooO0OO f5239o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public ObjectAnimator f5240o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public StaticLayout f5241o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @Nullable
    public OooOo.OooO00o f5242o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f5243o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final TextPaint f5244o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public ColorStateList f5245o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public StaticLayout f5246o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f5247oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    @NonNull
    public OooOOO f5248oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f5249ooOO;

    public class OooO00o extends Property<SwitchCompat, Float> {
        public OooO00o() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f5249ooOO);
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

    public static class OooO0OO extends EmojiCompat.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Reference<SwitchCompat> f5250OooO00o;

        public OooO0OO(SwitchCompat switchCompat) {
            this.f5250OooO00o = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooO
        public final void OooO00o() {
            SwitchCompat switchCompat = this.f5250OooO00o.get();
            if (switchCompat != null) {
                switchCompat.OooO0o0();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.OooO
        public final void OooO0O0() {
            SwitchCompat switchCompat = this.f5250OooO00o.get();
            if (switchCompat != null) {
                switchCompat.OooO0o0();
            }
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOO getEmojiTextViewHelper() {
        if (this.f5248oo0o0Oo == null) {
            this.f5248oo0o0Oo = new OooOOO(this);
        }
        return this.f5248oo0o0Oo;
    }

    private boolean getTargetCheckedState() {
        return this.f5249ooOO > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((o000O00O.OooO0O0(this) ? 1.0f - this.f5249ooOO : this.f5249ooOO) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f5212OoooO0;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f5230o000OOo;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f5208Oooo0o;
        Rect rectOooO0OO = drawable2 != null ? o0ooOOo.OooO0OO(drawable2) : o0ooOOo.f5480OooO0OO;
        return ((((this.f5232o00O0O - this.f5234o00Ooo) - rect.left) - rect.right) - rectOooO0OO.left) - rectOooO0OO.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f5222Ooooo0o = charSequence;
        this.f5223OooooO0 = OooO0OO(charSequence);
        this.f5241o0OOO0o = null;
        if (this.f5224OooooOO) {
            OooO0oo();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f5220OoooOoo = charSequence;
        this.f5221Ooooo00 = OooO0OO(charSequence);
        this.f5246o0ooOoO = null;
        if (this.f5224OooooOO) {
            OooO0oo();
        }
    }

    public final void OooO00o() {
        Drawable drawable = this.f5208Oooo0o;
        if (drawable != null) {
            if (this.f5207Oooo || this.f5213OoooO00) {
                Drawable drawableMutate = p084o000Ooo.o0OOO0o.OooO0o0(drawable).mutate();
                this.f5208Oooo0o = drawableMutate;
                if (this.f5207Oooo) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO0oo(drawableMutate, this.f5209Oooo0oO);
                }
                if (this.f5213OoooO00) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO(this.f5208Oooo0o, this.f5210Oooo0oo);
                }
                if (this.f5208Oooo0o.isStateful()) {
                    this.f5208Oooo0o.setState(getDrawableState());
                }
            }
        }
    }

    public final void OooO0O0() {
        Drawable drawable = this.f5212OoooO0;
        if (drawable != null) {
            if (this.f5215OoooOO0 || this.f5231o000oOoO) {
                Drawable drawableMutate = p084o000Ooo.o0OOO0o.OooO0o0(drawable).mutate();
                this.f5212OoooO0 = drawableMutate;
                if (this.f5215OoooOO0) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO0oo(drawableMutate, this.f5214OoooO0O);
                }
                if (this.f5231o000oOoO) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO(this.f5212OoooO0, this.f5211OoooO);
                }
                if (this.f5212OoooO0.isStateful()) {
                    this.f5212OoooO0.setState(getDrawableState());
                }
            }
        }
    }

    @Nullable
    public final CharSequence OooO0OO(@Nullable CharSequence charSequence) {
        TransformationMethod transformationMethodOooO0o0 = getEmojiTextViewHelper().f5096OooO0O0.f28303OooO00o.OooO0o0(this.f5242o0Oo0oo);
        return transformationMethodOooO0o0 != null ? transformationMethodOooO0o0.getTransformation(charSequence, this) : charSequence;
    }

    public final Layout OooO0Oo(CharSequence charSequence) {
        TextPaint textPaint = this.f5244o0ooOO0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, true);
    }

    public final void OooO0o() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object string = this.f5222Ooooo0o;
            if (string == null) {
                string = getResources().getString(OooOo00.OooOOO0.abc_capital_off);
            }
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            new androidx.core.view.OooO0o(o000OO0O.tag_state_description, CharSequence.class).OooO0o0(this, string);
        }
    }

    public final void OooO0o0() {
        setTextOnInternal(this.f5220OoooOoo);
        setTextOffInternal(this.f5222Ooooo0o);
        requestLayout();
    }

    public final void OooO0oO() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object string = this.f5220OoooOoo;
            if (string == null) {
                string = getResources().getString(OooOo00.OooOOO0.abc_capital_on);
            }
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            new androidx.core.view.OooO0o(o000OO0O.tag_state_description, CharSequence.class).OooO0o0(this, string);
        }
    }

    public final void OooO0oo() {
        if (this.f5239o0O0O00 == null && this.f5248oo0o0Oo.f5096OooO0O0.f28303OooO00o.OooO0O0() && EmojiCompat.OooO0OO()) {
            EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
            int iOooO0O0 = emojiCompatOooO00o.OooO0O0();
            if (iOooO0O0 == 3 || iOooO0O0 == 0) {
                OooO0OO oooO0OO = new OooO0OO(this);
                this.f5239o0O0O00 = oooO0OO;
                emojiCompatOooO00o.OooOO0(oooO0OO);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f5230o000OOo;
        int i3 = this.f5235o00o0O;
        int i4 = this.f5238o00ooo;
        int i5 = this.f5247oo000o;
        int i6 = this.f5237o00oO0o;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f5208Oooo0o;
        Rect rectOooO0OO = drawable != null ? o0ooOOo.OooO0OO(drawable) : o0ooOOo.f5480OooO0OO;
        Drawable drawable2 = this.f5212OoooO0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectOooO0OO != null) {
                int i8 = rectOooO0OO.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectOooO0OO.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectOooO0OO.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectOooO0OO.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f5212OoooO0.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f5212OoooO0.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f5208Oooo0o;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f5234o00Ooo + rect.right;
            this.f5208Oooo0o.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                o000Ooo.o0OOO0o.OooO0O0.OooO0o(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f5208Oooo0o;
        if (drawable != null) {
            o000Ooo.o0OOO0o.OooO0O0.OooO0o0(drawable, f, f2);
        }
        Drawable drawable2 = this.f5212OoooO0;
        if (drawable2 != null) {
            o000Ooo.o0OOO0o.OooO0O0.OooO0o0(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5208Oooo0o;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f5212OoooO0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!o000O00O.OooO0O0(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f5232o00O0O;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f5218OoooOo0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (o000O00O.OooO0O0(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f5232o00O0O;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f5218OoooOo0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.OooO0oO(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f5224OooooOO;
    }

    public boolean getSplitTrack() {
        return this.f5219OoooOoO;
    }

    public int getSwitchMinWidth() {
        return this.f5217OoooOOo;
    }

    public int getSwitchPadding() {
        return this.f5218OoooOo0;
    }

    public CharSequence getTextOff() {
        return this.f5222Ooooo0o;
    }

    public CharSequence getTextOn() {
        return this.f5220OoooOoo;
    }

    public Drawable getThumbDrawable() {
        return this.f5208Oooo0o;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getThumbPosition() {
        return this.f5249ooOO;
    }

    public int getThumbTextPadding() {
        return this.f5216OoooOOO;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f5209Oooo0oO;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f5210Oooo0oo;
    }

    public Drawable getTrackDrawable() {
        return this.f5212OoooO0;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f5214OoooO0O;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f5211OoooO;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5208Oooo0o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5212OoooO0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f5240o0OO00O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f5240o0OO00O.end();
        this.f5240o0OO00O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5206o000000O);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f5230o000OOo;
        Drawable drawable = this.f5212OoooO0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f5238o00ooo;
        int i2 = this.f5237o00oO0o;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f5208Oooo0o;
        if (drawable != null) {
            if (!this.f5219OoooOoO || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectOooO0OO = o0ooOOo.OooO0OO(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectOooO0OO.left;
                rect.right -= rectOooO0OO.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f5246o0ooOoO : this.f5241o0OOO0o;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f5245o0ooOOo;
            if (colorStateList != null) {
                this.f5244o0ooOO0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f5244o0ooOO0.drawableState = drawableState;
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
            CharSequence charSequence = isChecked() ? this.f5220OoooOoo : this.f5222Ooooo0o;
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
        if (this.f5208Oooo0o != null) {
            Rect rect = this.f5230o000OOo;
            Drawable drawable = this.f5212OoooO0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectOooO0OO = o0ooOOo.OooO0OO(this.f5208Oooo0o);
            iMax = Math.max(0, rectOooO0OO.left - rect.left);
            iMax2 = Math.max(0, rectOooO0OO.right - rect.right);
        } else {
            iMax = 0;
        }
        if (o000O00O.OooO0O0(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f5232o00O0O + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f5232o00O0O) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f5233o00Oo0;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f5233o00Oo0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f5233o00Oo0;
        }
        this.f5235o00o0O = paddingLeft;
        this.f5238o00ooo = paddingTop;
        this.f5237o00oO0o = height;
        this.f5247oo000o = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.f5224OooooOO) {
            if (this.f5246o0ooOoO == null) {
                this.f5246o0ooOoO = (StaticLayout) OooO0Oo(this.f5221Ooooo00);
            }
            if (this.f5241o0OOO0o == null) {
                this.f5241o0OOO0o = (StaticLayout) OooO0Oo(this.f5223OooooO0);
            }
        }
        Rect rect = this.f5230o000OOo;
        Drawable drawable = this.f5208Oooo0o;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f5208Oooo0o.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f5208Oooo0o.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f5224OooooOO) {
            iMax = (this.f5216OoooOOO * 2) + Math.max(this.f5246o0ooOoO.getWidth(), this.f5241o0OOO0o.getWidth());
        } else {
            iMax = 0;
        }
        this.f5234o00Ooo = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f5212OoooO0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f5212OoooO0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f5208Oooo0o;
        if (drawable3 != null) {
            Rect rectOooO0OO = o0ooOOo.OooO0OO(drawable3);
            iMax2 = Math.max(iMax2, rectOooO0OO.left);
            iMax3 = Math.max(iMax3, rectOooO0OO.right);
        }
        int iMax4 = this.f5236o00oO0O ? Math.max(this.f5217OoooOOo, (this.f5234o00Ooo * 2) + iMax2 + iMax3) : this.f5217OoooOOo;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f5232o00O0O = iMax4;
        this.f5233o00Oo0 = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f5220OoooOoo : this.f5222Ooooo0o;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        this.f5229Ooooooo.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked != 0) {
            float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (actionMasked == 1) {
                if (this.f5225OooooOo == 2) {
                    this.f5225OooooOo = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.f5229Ooooooo.computeCurrentVelocity(1000);
                        xVelocity = this.f5229Ooooooo.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f5243o0OoOo0) {
                            targetCheckedState = o000O00O.OooO0O0(this) ? xVelocity > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : xVelocity < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
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
                this.f5225OooooOo = 0;
                this.f5229Ooooooo.clear();
            } else if (actionMasked == 2) {
                int i = this.f5225OooooOo;
                if (i == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.f5226Oooooo) > this.f5227Oooooo0 || Math.abs(y - this.f5228OoooooO) > this.f5227Oooooo0) {
                        this.f5225OooooOo = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f5226Oooooo = x;
                        this.f5228OoooooO = y;
                        return true;
                    }
                } else if (i == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f3 = x2 - this.f5226Oooooo;
                    if (thumbScrollRange != 0) {
                        f = f3 / thumbScrollRange;
                    } else {
                        f = f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1.0f : -1.0f;
                    }
                    if (o000O00O.OooO0O0(this)) {
                        f = -f;
                    }
                    float f4 = this.f5249ooOO;
                    float f5 = f + f4;
                    if (f5 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        f2 = f5 > 1.0f ? 1.0f : f5;
                    }
                    if (f2 != f4) {
                        this.f5226Oooooo = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f5225OooooOo == 2) {
                    this.f5225OooooOo = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.f5229Ooooooo.computeCurrentVelocity(1000);
                        xVelocity = this.f5229Ooooooo.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f5243o0OoOo0) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (o000O00O.OooO0O0(this)) {
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
                this.f5225OooooOo = 0;
                this.f5229Ooooooo.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                if (this.f5208Oooo0o != null) {
                    int thumbOffset = getThumbOffset();
                    this.f5208Oooo0o.getPadding(this.f5230o000OOo);
                    int i2 = this.f5238o00ooo;
                    int i3 = this.f5227Oooooo0;
                    int i4 = i2 - i3;
                    int i5 = (this.f5235o00o0O + thumbOffset) - i3;
                    int i6 = this.f5234o00Ooo + i5;
                    Rect rect = this.f5230o000OOo;
                    int i7 = i6 + rect.left + rect.right + i3;
                    int i8 = this.f5237o00oO0o + i3;
                    if (x3 > i5 && x3 < i7 && y2 > i4 && y2 < i8) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.f5225OooooOo = 1;
                    this.f5226Oooooo = x3;
                    this.f5228OoooooO = y2;
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
            OooO0oO();
        } else {
            OooO0o();
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(this)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f5205o000000, zIsChecked ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                this.f5240o0OO00O = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                OooO0O0.OooO00o(this.f5240o0OO00O, true);
                this.f5240o0OO00O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f5240o0OO00O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0oo(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
        setTextOnInternal(this.f5220OoooOoo);
        setTextOffInternal(this.f5222Ooooo0o);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f5236o00oO0O = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f5224OooooOO != z) {
            this.f5224OooooOO = z;
            requestLayout();
            if (z) {
                OooO0oo();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f5219OoooOoO = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f5217OoooOOo = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f5218OoooOo0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f5244o0ooOO0.getTypeface() == null || this.f5244o0ooOO0.getTypeface().equals(typeface)) && (this.f5244o0ooOO0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f5244o0ooOO0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        OooO0o();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            OooO0oO();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5208Oooo0o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5208Oooo0o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f5249ooOO = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f5216OoooOOO = i;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f5209Oooo0oO = colorStateList;
        this.f5207Oooo = true;
        OooO00o();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f5210Oooo0oo = mode;
        this.f5213OoooO00 = true;
        OooO00o();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5212OoooO0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5212OoooO0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f5214OoooO0O = colorStateList;
        this.f5215OoooOO0 = true;
        OooO0O0();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f5211OoooO = mode;
        this.f5231o000oOoO = true;
        OooO0O0();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5208Oooo0o || drawable == this.f5212OoooO0;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Typeface typeface;
        Typeface typefaceCreate;
        int resourceId;
        super(context, attributeSet, i);
        this.f5209Oooo0oO = null;
        this.f5210Oooo0oo = null;
        this.f5207Oooo = false;
        this.f5213OoooO00 = false;
        this.f5214OoooO0O = null;
        this.f5211OoooO = null;
        this.f5215OoooOO0 = false;
        this.f5231o000oOoO = false;
        this.f5229Ooooooo = VelocityTracker.obtain();
        this.f5236o00oO0O = true;
        this.f5230o000OOo = new Rect();
        o00000OO.OooO00o(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f5244o0ooOO0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = OooOo00.OooOOOO.SwitchCompat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o0000O0 o0000o1 = new o0000O0(context, typedArrayObtainStyledAttributes);
        ViewCompat.OooOo0O(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        Drawable drawableOooO0oO = o0000o1.OooO0oO(OooOo00.OooOOOO.SwitchCompat_android_thumb);
        this.f5208Oooo0o = drawableOooO0oO;
        if (drawableOooO0oO != null) {
            drawableOooO0oO.setCallback(this);
        }
        Drawable drawableOooO0oO2 = o0000o1.OooO0oO(OooOo00.OooOOOO.SwitchCompat_track);
        this.f5212OoooO0 = drawableOooO0oO2;
        if (drawableOooO0oO2 != null) {
            drawableOooO0oO2.setCallback(this);
        }
        setTextOnInternal(o0000o1.OooOOOO(OooOo00.OooOOOO.SwitchCompat_android_textOn));
        setTextOffInternal(o0000o1.OooOOOO(OooOo00.OooOOOO.SwitchCompat_android_textOff));
        this.f5224OooooOO = o0000o1.OooO00o(OooOo00.OooOOOO.SwitchCompat_showText, true);
        this.f5216OoooOOO = o0000o1.OooO0o(OooOo00.OooOOOO.SwitchCompat_thumbTextPadding, 0);
        this.f5217OoooOOo = o0000o1.OooO0o(OooOo00.OooOOOO.SwitchCompat_switchMinWidth, 0);
        this.f5218OoooOo0 = o0000o1.OooO0o(OooOo00.OooOOOO.SwitchCompat_switchPadding, 0);
        this.f5219OoooOoO = o0000o1.OooO00o(OooOo00.OooOOOO.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListOooO0OO = o0000o1.OooO0OO(OooOo00.OooOOOO.SwitchCompat_thumbTint);
        if (colorStateListOooO0OO != null) {
            this.f5209Oooo0oO = colorStateListOooO0OO;
            this.f5207Oooo = true;
        }
        PorterDuff.Mode modeOooO0Oo = o0ooOOo.OooO0Oo(o0000o1.OooOO0(OooOo00.OooOOOO.SwitchCompat_thumbTintMode, -1), null);
        if (this.f5210Oooo0oo != modeOooO0Oo) {
            this.f5210Oooo0oo = modeOooO0Oo;
            this.f5213OoooO00 = true;
        }
        if (this.f5207Oooo || this.f5213OoooO00) {
            OooO00o();
        }
        ColorStateList colorStateListOooO0OO2 = o0000o1.OooO0OO(OooOo00.OooOOOO.SwitchCompat_trackTint);
        if (colorStateListOooO0OO2 != null) {
            this.f5214OoooO0O = colorStateListOooO0OO2;
            this.f5215OoooOO0 = true;
        }
        PorterDuff.Mode modeOooO0Oo2 = o0ooOOo.OooO0Oo(o0000o1.OooOO0(OooOo00.OooOOOO.SwitchCompat_trackTintMode, -1), null);
        if (this.f5211OoooO != modeOooO0Oo2) {
            this.f5211OoooO = modeOooO0Oo2;
            this.f5231o000oOoO = true;
        }
        if (this.f5215OoooOO0 || this.f5231o000oOoO) {
            OooO0O0();
        }
        int iOooOOO0 = o0000o1.OooOOO0(OooOo00.OooOOOO.SwitchCompat_switchTextAppearance, 0);
        if (iOooOOO0 != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iOooOOO0, OooOo00.OooOOOO.TextAppearance);
            int i2 = OooOo00.OooOOOO.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = p012OooOo0.OooOO0O.OooO00o(context, resourceId)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(i2) : colorStateList;
            if (colorStateList != null) {
                this.f5245o0ooOOo = colorStateList;
            } else {
                this.f5245o0ooOOo = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(OooOo00.OooOOOO.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes2.getInt(OooOo00.OooOOOO.TextAppearance_android_typeface, -1);
            int i4 = typedArrayObtainStyledAttributes2.getInt(OooOo00.OooOOOO.TextAppearance_android_textStyle, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 != 2) {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (i4 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(i4);
                } else {
                    typefaceCreate = Typeface.create(typeface, i4);
                }
                setSwitchTypeface(typefaceCreate);
                int i5 = i4 & (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0));
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(OooOo00.OooOOOO.TextAppearance_textAllCaps, false)) {
                this.f5242o0Oo0oo = new OooOo.OooO00o(getContext());
            } else {
                this.f5242o0Oo0oo = null;
            }
            setTextOnInternal(this.f5220OoooOoo);
            setTextOffInternal(this.f5222Ooooo0o);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new o00O0O(this).OooO0oo(attributeSet, i);
        o0000o1.OooOOoo();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5227Oooooo0 = viewConfiguration.getScaledTouchSlop();
        this.f5243o0OoOo0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
