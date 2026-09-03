package com.yalla.support.statebutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.appcompat.widget.AppCompatButton;
import com.umeng.analytics.pro.d;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p476o0Ooooo.o00O000;
import p476o0Ooooo.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0006J\u0010\u0010\"\u001a\u00020\u00042\b\b\u0001\u0010!\u001a\u00020\u0006J\u0010\u0010$\u001a\u00020\u00042\b\b\u0001\u0010#\u001a\u00020\u0006J\u0010\u0010&\u001a\u00020\u00042\b\b\u0001\u0010%\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020\u00042\b\b\u0001\u0010'\u001a\u00020\u0006R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00066"}, d2 = {"Lcom/yalla/support/statebutton/StateButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Landroid/util/AttributeSet;", "attrs", "", "setup", "", "normalStrokeColor", "setNormalStrokeColor", "pressedStrokeColor", "setPressedStrokeColor", "unableStrokeColor", "setUnableStrokeColor", "normalStrokeWidth", "setNormalStrokeWidth", "pressedStrokeWidth", "setPressedStrokeWidth", "unableStrokeWidth", "setUnableStrokeWidth", "", "radius", "setRadius", "", "round", "setRound", "", "radii", "normalBackgroundColor", "setNormalBackgroundColor", "pressedBackgroundColor", "setPressedBackgroundColor", "unableBackgroundColor", "setUnableBackgroundColor", "duration", "setAnimationDuration", "normalTextColor", "setNormalTextColor", "pressedTextColor", "setPressedTextColor", "unableTextColor", "setUnableTextColor", "Landroid/content/res/ColorStateList;", "OoooO0O", "Landroid/content/res/ColorStateList;", "getMTextColorStateList", "()Landroid/content/res/ColorStateList;", "setMTextColorStateList", "(Landroid/content/res/ColorStateList;)V", "mTextColorStateList", "Landroid/content/Context;", d.R, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "StateButton_release"}, k = 1, mv = {1, 4, 0})
public final class StateButton extends AppCompatButton {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f20533Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20534OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f20535OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f20536OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ColorStateList mTextColorStateList;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f20538OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f20539OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f20540OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f20541OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f20542OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f20543OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f20544Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f20545Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f20546OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f20547OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f20548OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public GradientDrawable f20549Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f20550Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public GradientDrawable f20551OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public GradientDrawable f20552Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f20553o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final int[] f20554o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final StateListDrawable f20555o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final int[] f20556o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final int[] f20557ooOO;

    @JvmOverloads
    public StateButton(@NotNull Context context) {
        this(context, null, o00oOoo.buttonStyle);
    }

    private final void setup(AttributeSet attrs) {
        int color;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, o00O000.StateButton);
        if (getBackground() instanceof ColorDrawable) {
            Drawable background = getBackground();
            Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            color = ((ColorDrawable) background).getColor();
        } else {
            color = 0;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        Unit unit = Unit.INSTANCE;
        this.f20549Oooooo = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(color);
        this.f20551OoooooO = gradientDrawable2;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(color);
        this.f20552Ooooooo = gradientDrawable3;
        int color2 = typedArrayObtainStyledAttributes.getColor(o00O000.StateButton_pressedBackgroundColor, -2147483647);
        if (color2 != -2147483647) {
            GradientDrawable gradientDrawable4 = this.f20551OoooooO;
            if (gradientDrawable4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
            }
            gradientDrawable4.setColor(color2);
        }
        int color3 = typedArrayObtainStyledAttributes.getColor(o00O000.StateButton_unableBackgroundColor, -2147483647);
        if (color3 != -2147483647) {
            GradientDrawable gradientDrawable5 = this.f20552Ooooooo;
            if (gradientDrawable5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
            }
            gradientDrawable5.setColor(color3);
        }
        this.f20538OoooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O000.StateButton_radius, 0);
        this.f20553o000oOoO = typedArrayObtainStyledAttributes.getBoolean(o00O000.StateButton_roundCorner, false);
        GradientDrawable gradientDrawable6 = this.f20549Oooooo;
        if (gradientDrawable6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        gradientDrawable6.setCornerRadius(this.f20538OoooOO0);
        GradientDrawable gradientDrawable7 = this.f20551OoooooO;
        if (gradientDrawable7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        gradientDrawable7.setCornerRadius(this.f20538OoooOO0);
        GradientDrawable gradientDrawable8 = this.f20552Ooooooo;
        if (gradientDrawable8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        gradientDrawable8.setCornerRadius(this.f20538OoooOO0);
        int i = o00O000.StateButton_strokeDashWidth;
        this.f20539OoooOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(i, 0);
        this.f20540OoooOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(i, 0);
        this.f20541OoooOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O000.StateButton_normalStrokeWidth, 0);
        this.f20542OoooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O000.StateButton_pressedStrokeWidth, 0);
        this.f20543OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O000.StateButton_unableStrokeWidth, 0);
        this.f20544Ooooo00 = typedArrayObtainStyledAttributes.getColor(o00O000.StateButton_normalStrokeColor, 0);
        this.f20545Ooooo0o = typedArrayObtainStyledAttributes.getColor(o00O000.StateButton_pressedStrokeColor, 0);
        this.f20546OooooO0 = typedArrayObtainStyledAttributes.getColor(o00O000.StateButton_unableStrokeColor, 0);
        GradientDrawable gradientDrawable9 = this.f20549Oooooo;
        if (gradientDrawable9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        OooO00o(gradientDrawable9, this.f20544Ooooo00, this.f20541OoooOo0);
        GradientDrawable gradientDrawable10 = this.f20551OoooooO;
        if (gradientDrawable10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        OooO00o(gradientDrawable10, this.f20545Ooooo0o, this.f20542OoooOoO);
        GradientDrawable gradientDrawable11 = this.f20552Ooooooo;
        if (gradientDrawable11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        OooO00o(gradientDrawable11, this.f20546OooooO0, this.f20543OoooOoo);
        int colorForState = getTextColors().getColorForState(this.f20556o0OoOo0, getCurrentTextColor());
        int colorForState2 = getTextColors().getColorForState(this.f20557ooOO, getCurrentTextColor());
        int colorForState3 = getTextColors().getColorForState(this.f20554o00O0O, getCurrentTextColor());
        this.f20533Oooo = colorForState;
        this.f20536OoooO00 = typedArrayObtainStyledAttributes.getColor(o00O000.StateButton_pressedTextColor, colorForState2);
        this.f20535OoooO0 = typedArrayObtainStyledAttributes.getColor(o00O000.StateButton_unableTextColor, colorForState3);
        OooO0O0();
        int integer = typedArrayObtainStyledAttributes.getInteger(o00O000.StateButton_animationDuration, this.f20534OoooO);
        this.f20534OoooO = integer;
        this.f20555o00Oo0.setEnterFadeDuration(integer);
        this.f20555o00Oo0.setExitFadeDuration(this.f20534OoooO);
        StateListDrawable stateListDrawable = this.f20555o00Oo0;
        int[] iArr = this.f20557ooOO;
        GradientDrawable gradientDrawable12 = this.f20551OoooooO;
        if (gradientDrawable12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        stateListDrawable.addState(iArr, gradientDrawable12);
        StateListDrawable stateListDrawable2 = this.f20555o00Oo0;
        int[] iArr2 = this.f20554o00O0O;
        GradientDrawable gradientDrawable13 = this.f20552Ooooooo;
        if (gradientDrawable13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        stateListDrawable2.addState(iArr2, gradientDrawable13);
        StateListDrawable stateListDrawable3 = this.f20555o00Oo0;
        int[] iArr3 = this.f20556o0OoOo0;
        GradientDrawable gradientDrawable14 = this.f20549Oooooo;
        if (gradientDrawable14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        stateListDrawable3.addState(iArr3, gradientDrawable14);
        setBackgroundDrawable(this.f20555o00Oo0);
        typedArrayObtainStyledAttributes.recycle();
        setStateListAnimator(null);
    }

    public final void OooO00o(GradientDrawable gradientDrawable, int i, int i2) {
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setStroke(i2, i, this.f20539OoooOOO, this.f20540OoooOOo);
    }

    public final void OooO0O0() {
        ColorStateList colorStateList = new ColorStateList(new int[][]{this.f20556o0OoOo0, this.f20557ooOO, this.f20554o00O0O}, new int[]{this.f20533Oooo, this.f20536OoooO00, this.f20535OoooO0});
        this.mTextColorStateList = colorStateList;
        setTextColor(colorStateList);
    }

    @Nullable
    public final ColorStateList getMTextColorStateList() {
        return this.mTextColorStateList;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setRound(this.f20553o000oOoO);
    }

    public final void setAnimationDuration(@IntRange(from = ULong.MIN_VALUE) int duration) {
        this.f20534OoooO = duration;
        this.f20555o00Oo0.setEnterFadeDuration(duration);
    }

    public final void setMTextColorStateList(@Nullable ColorStateList colorStateList) {
        this.mTextColorStateList = colorStateList;
    }

    public final void setNormalBackgroundColor(@ColorInt int normalBackgroundColor) {
        this.f20547OooooOO = normalBackgroundColor;
        GradientDrawable gradientDrawable = this.f20549Oooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setColor(this.f20547OooooOO);
    }

    public final void setNormalStrokeColor(@ColorInt int normalStrokeColor) {
        this.f20544Ooooo00 = normalStrokeColor;
        GradientDrawable gradientDrawable = this.f20549Oooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        OooO00o(gradientDrawable, this.f20544Ooooo00, this.f20541OoooOo0);
    }

    public final void setNormalStrokeWidth(int normalStrokeWidth) {
        this.f20541OoooOo0 = normalStrokeWidth;
        GradientDrawable gradientDrawable = this.f20549Oooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        OooO00o(gradientDrawable, this.f20544Ooooo00, this.f20541OoooOo0);
    }

    public final void setNormalTextColor(@ColorInt int normalTextColor) {
        this.f20533Oooo = normalTextColor;
        OooO0O0();
    }

    public final void setPressedBackgroundColor(@ColorInt int pressedBackgroundColor) {
        this.f20548OooooOo = pressedBackgroundColor;
        GradientDrawable gradientDrawable = this.f20551OoooooO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setColor(this.f20548OooooOo);
    }

    public final void setPressedStrokeColor(@ColorInt int pressedStrokeColor) {
        this.f20545Ooooo0o = pressedStrokeColor;
        GradientDrawable gradientDrawable = this.f20551OoooooO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        OooO00o(gradientDrawable, this.f20545Ooooo0o, this.f20542OoooOoO);
    }

    public final void setPressedStrokeWidth(int pressedStrokeWidth) {
        this.f20542OoooOoO = pressedStrokeWidth;
        GradientDrawable gradientDrawable = this.f20551OoooooO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        OooO00o(gradientDrawable, this.f20545Ooooo0o, this.f20542OoooOoO);
    }

    public final void setPressedTextColor(@ColorInt int pressedTextColor) {
        this.f20536OoooO00 = pressedTextColor;
        OooO0O0();
    }

    public final void setRadius(@FloatRange(from = 0.0d) float radius) {
        this.f20538OoooOO0 = radius;
        GradientDrawable gradientDrawable = this.f20549Oooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setCornerRadius(this.f20538OoooOO0);
        GradientDrawable gradientDrawable2 = this.f20551OoooooO;
        if (gradientDrawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable2);
        gradientDrawable2.setCornerRadius(this.f20538OoooOO0);
        GradientDrawable gradientDrawable3 = this.f20552Ooooooo;
        if (gradientDrawable3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable3);
        gradientDrawable3.setCornerRadius(this.f20538OoooOO0);
    }

    public final void setRound(boolean round) {
        this.f20553o000oOoO = round;
        int measuredHeight = getMeasuredHeight();
        if (this.f20553o000oOoO) {
            setRadius(measuredHeight / 2.0f);
        }
    }

    public final void setUnableBackgroundColor(@ColorInt int unableBackgroundColor) {
        this.f20550Oooooo0 = unableBackgroundColor;
        GradientDrawable gradientDrawable = this.f20552Ooooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setColor(this.f20550Oooooo0);
    }

    public final void setUnableStrokeColor(@ColorInt int unableStrokeColor) {
        this.f20546OooooO0 = unableStrokeColor;
        GradientDrawable gradientDrawable = this.f20552Ooooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        OooO00o(gradientDrawable, this.f20546OooooO0, this.f20543OoooOoo);
    }

    public final void setUnableStrokeWidth(int unableStrokeWidth) {
        this.f20543OoooOoo = unableStrokeWidth;
        GradientDrawable gradientDrawable = this.f20552Ooooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        OooO00o(gradientDrawable, this.f20546OooooO0, this.f20543OoooOoo);
    }

    public final void setUnableTextColor(@ColorInt int unableTextColor) {
        this.f20535OoooO0 = unableTextColor;
        OooO0O0();
    }

    @JvmOverloads
    public StateButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00oOoo.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20556o0OoOo0 = new int[]{R.attr.state_enabled};
        this.f20557ooOO = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.f20554o00O0O = new int[]{-16842910};
        this.f20555o00Oo0 = new StateListDrawable();
        setup(attributeSet);
    }

    public final void setRadius(@Nullable float[] radii) {
        GradientDrawable gradientDrawable = this.f20549Oooooo;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setCornerRadii(radii);
        GradientDrawable gradientDrawable2 = this.f20551OoooooO;
        if (gradientDrawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable2);
        gradientDrawable2.setCornerRadii(radii);
        GradientDrawable gradientDrawable3 = this.f20552Ooooooo;
        if (gradientDrawable3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable3);
        gradientDrawable3.setCornerRadii(radii);
    }
}
