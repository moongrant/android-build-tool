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
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p378o0OOoOO.o00O0O;
import p378o0OOoOO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0012\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u0002J\u0010\u0010!\u001a\u00020\u00042\b\b\u0001\u0010 \u001a\u00020\u0002J\u0010\u0010#\u001a\u00020\u00042\b\b\u0001\u0010\"\u001a\u00020\u0002J\u0010\u0010%\u001a\u00020\u00042\b\b\u0001\u0010$\u001a\u00020\u0002J\u0012\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&H\u0002R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00066"}, d2 = {"Lcom/yalla/support/statebutton/StateButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "normalStrokeColor", "", "setNormalStrokeColor", "pressedStrokeColor", "setPressedStrokeColor", "unableStrokeColor", "setUnableStrokeColor", "normalStrokeWidth", "setNormalStrokeWidth", "pressedStrokeWidth", "setPressedStrokeWidth", "unableStrokeWidth", "setUnableStrokeWidth", "", "radius", "setRadius", "", "round", "setRound", "", "radii", "normalBackgroundColor", "setNormalBackgroundColor", "pressedBackgroundColor", "setPressedBackgroundColor", "unableBackgroundColor", "setUnableBackgroundColor", "duration", "setAnimationDuration", "normalTextColor", "setNormalTextColor", "pressedTextColor", "setPressedTextColor", "unableTextColor", "setUnableTextColor", "Landroid/util/AttributeSet;", "attrs", "setup", "Landroid/content/res/ColorStateList;", "OooOO0", "Landroid/content/res/ColorStateList;", "getMTextColorStateList", "()Landroid/content/res/ColorStateList;", "setMTextColorStateList", "(Landroid/content/res/ColorStateList;)V", "mTextColorStateList", "Landroid/content/Context;", "context", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "StateButton_release"}, k = 1, mv = {1, 4, 0})
public final class StateButton extends AppCompatButton {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f22174OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f22175OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f22176OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ColorStateList mTextColorStateList;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f22178OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f22179OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f22180OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f22181OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f22182OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f22183OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f22184OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f22185OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f22186OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f22187OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f22188OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f22189OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f22190OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f22191OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public GradientDrawable f22192OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public GradientDrawable f22193OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public GradientDrawable f22194OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int[] f22195OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int[] f22196OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int[] f22197OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final StateListDrawable f22198OooOooo;

    @JvmOverloads
    public StateButton(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    private final void setup(AttributeSet attrs) {
        int color;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, o00Oo0.StateButton);
        if (getBackground() instanceof ColorDrawable) {
            Drawable background = getBackground();
            if (background == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            }
            color = ((ColorDrawable) background).getColor();
        } else {
            color = 0;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        Unit unit = Unit.INSTANCE;
        this.f22193OooOoO0 = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(color);
        this.f22192OooOoO = gradientDrawable2;
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(color);
        this.f22194OooOoOO = gradientDrawable3;
        int color2 = typedArrayObtainStyledAttributes.getColor(o00Oo0.StateButton_pressedBackgroundColor, -2147483647);
        if (color2 != -2147483647) {
            GradientDrawable gradientDrawable4 = this.f22192OooOoO;
            if (gradientDrawable4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
            }
            gradientDrawable4.setColor(color2);
        }
        int color3 = typedArrayObtainStyledAttributes.getColor(o00Oo0.StateButton_unableBackgroundColor, -2147483647);
        if (color3 != -2147483647) {
            GradientDrawable gradientDrawable5 = this.f22194OooOoOO;
            if (gradientDrawable5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
            }
            gradientDrawable5.setColor(color3);
        }
        this.f22179OooOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00Oo0.StateButton_radius, 0);
        this.f22181OooOOO0 = typedArrayObtainStyledAttributes.getBoolean(o00Oo0.StateButton_roundCorner, false);
        GradientDrawable gradientDrawable6 = this.f22193OooOoO0;
        if (gradientDrawable6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        gradientDrawable6.setCornerRadius(this.f22179OooOO0o);
        GradientDrawable gradientDrawable7 = this.f22192OooOoO;
        if (gradientDrawable7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        gradientDrawable7.setCornerRadius(this.f22179OooOO0o);
        GradientDrawable gradientDrawable8 = this.f22194OooOoOO;
        if (gradientDrawable8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        gradientDrawable8.setCornerRadius(this.f22179OooOO0o);
        int i = o00Oo0.StateButton_strokeDashWidth;
        this.f22180OooOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(i, 0);
        this.f22182OooOOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(i, 0);
        this.f22183OooOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00Oo0.StateButton_normalStrokeWidth, 0);
        this.f22185OooOOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00Oo0.StateButton_pressedStrokeWidth, 0);
        this.f22184OooOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00Oo0.StateButton_unableStrokeWidth, 0);
        this.f22186OooOOoo = typedArrayObtainStyledAttributes.getColor(o00Oo0.StateButton_normalStrokeColor, 0);
        this.f22189OooOo00 = typedArrayObtainStyledAttributes.getColor(o00Oo0.StateButton_pressedStrokeColor, 0);
        this.f22188OooOo0 = typedArrayObtainStyledAttributes.getColor(o00Oo0.StateButton_unableStrokeColor, 0);
        GradientDrawable gradientDrawable9 = this.f22193OooOoO0;
        if (gradientDrawable9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        OooO00o(gradientDrawable9, this.f22186OooOOoo, this.f22183OooOOOo);
        GradientDrawable gradientDrawable10 = this.f22192OooOoO;
        if (gradientDrawable10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        OooO00o(gradientDrawable10, this.f22189OooOo00, this.f22185OooOOo0);
        GradientDrawable gradientDrawable11 = this.f22194OooOoOO;
        if (gradientDrawable11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        OooO00o(gradientDrawable11, this.f22188OooOo0, this.f22184OooOOo);
        ColorStateList textColors = getTextColors();
        int currentTextColor = getCurrentTextColor();
        int[] iArr = this.f22196OooOoo0;
        int colorForState = textColors.getColorForState(iArr, currentTextColor);
        ColorStateList textColors2 = getTextColors();
        int currentTextColor2 = getCurrentTextColor();
        int[] iArr2 = this.f22195OooOoo;
        int colorForState2 = textColors2.getColorForState(iArr2, currentTextColor2);
        ColorStateList textColors3 = getTextColors();
        int currentTextColor3 = getCurrentTextColor();
        int[] iArr3 = this.f22197OooOooO;
        int colorForState3 = textColors3.getColorForState(iArr3, currentTextColor3);
        this.f22175OooO0oO = colorForState;
        this.f22176OooO0oo = typedArrayObtainStyledAttributes.getColor(o00Oo0.StateButton_pressedTextColor, colorForState2);
        this.f22174OooO = typedArrayObtainStyledAttributes.getColor(o00Oo0.StateButton_unableTextColor, colorForState3);
        OooO0O0();
        int integer = typedArrayObtainStyledAttributes.getInteger(o00Oo0.StateButton_animationDuration, this.f22178OooOO0O);
        this.f22178OooOO0O = integer;
        StateListDrawable stateListDrawable = this.f22198OooOooo;
        stateListDrawable.setEnterFadeDuration(integer);
        stateListDrawable.setExitFadeDuration(this.f22178OooOO0O);
        GradientDrawable gradientDrawable12 = this.f22192OooOoO;
        if (gradientDrawable12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        stateListDrawable.addState(iArr2, gradientDrawable12);
        GradientDrawable gradientDrawable13 = this.f22194OooOoOO;
        if (gradientDrawable13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        stateListDrawable.addState(iArr3, gradientDrawable13);
        GradientDrawable gradientDrawable14 = this.f22193OooOoO0;
        if (gradientDrawable14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        stateListDrawable.addState(iArr, gradientDrawable14);
        setBackgroundDrawable(stateListDrawable);
        typedArrayObtainStyledAttributes.recycle();
        setStateListAnimator(null);
    }

    public final void OooO00o(GradientDrawable gradientDrawable, int i, int i2) {
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setStroke(i2, i, this.f22180OooOOO, this.f22182OooOOOO);
    }

    public final void OooO0O0() {
        ColorStateList colorStateList = new ColorStateList(new int[][]{this.f22196OooOoo0, this.f22195OooOoo, this.f22197OooOooO}, new int[]{this.f22175OooO0oO, this.f22176OooO0oo, this.f22174OooO});
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
        setRound(this.f22181OooOOO0);
    }

    public final void setAnimationDuration(@IntRange(from = ULong.MIN_VALUE) int duration) {
        this.f22178OooOO0O = duration;
        this.f22198OooOooo.setEnterFadeDuration(duration);
    }

    public final void setMTextColorStateList(@Nullable ColorStateList colorStateList) {
        this.mTextColorStateList = colorStateList;
    }

    public final void setNormalBackgroundColor(@ColorInt int normalBackgroundColor) {
        this.f22190OooOo0O = normalBackgroundColor;
        GradientDrawable gradientDrawable = this.f22193OooOoO0;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setColor(this.f22190OooOo0O);
    }

    public final void setNormalStrokeColor(@ColorInt int normalStrokeColor) {
        this.f22186OooOOoo = normalStrokeColor;
        GradientDrawable gradientDrawable = this.f22193OooOoO0;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        OooO00o(gradientDrawable, this.f22186OooOOoo, this.f22183OooOOOo);
    }

    public final void setNormalStrokeWidth(int normalStrokeWidth) {
        this.f22183OooOOOo = normalStrokeWidth;
        GradientDrawable gradientDrawable = this.f22193OooOoO0;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        OooO00o(gradientDrawable, this.f22186OooOOoo, this.f22183OooOOOo);
    }

    public final void setNormalTextColor(@ColorInt int normalTextColor) {
        this.f22175OooO0oO = normalTextColor;
        OooO0O0();
    }

    public final void setPressedBackgroundColor(@ColorInt int pressedBackgroundColor) {
        this.f22191OooOo0o = pressedBackgroundColor;
        GradientDrawable gradientDrawable = this.f22192OooOoO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setColor(this.f22191OooOo0o);
    }

    public final void setPressedStrokeColor(@ColorInt int pressedStrokeColor) {
        this.f22189OooOo00 = pressedStrokeColor;
        GradientDrawable gradientDrawable = this.f22192OooOoO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        OooO00o(gradientDrawable, this.f22189OooOo00, this.f22185OooOOo0);
    }

    public final void setPressedStrokeWidth(int pressedStrokeWidth) {
        this.f22185OooOOo0 = pressedStrokeWidth;
        GradientDrawable gradientDrawable = this.f22192OooOoO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        OooO00o(gradientDrawable, this.f22189OooOo00, this.f22185OooOOo0);
    }

    public final void setPressedTextColor(@ColorInt int pressedTextColor) {
        this.f22176OooO0oo = pressedTextColor;
        OooO0O0();
    }

    public final void setRadius(@FloatRange(from = 0.0d) float radius) {
        this.f22179OooOO0o = radius;
        GradientDrawable gradientDrawable = this.f22193OooOoO0;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setCornerRadius(this.f22179OooOO0o);
        GradientDrawable gradientDrawable2 = this.f22192OooOoO;
        if (gradientDrawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable2);
        gradientDrawable2.setCornerRadius(this.f22179OooOO0o);
        GradientDrawable gradientDrawable3 = this.f22194OooOoOO;
        if (gradientDrawable3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable3);
        gradientDrawable3.setCornerRadius(this.f22179OooOO0o);
    }

    public final void setRound(boolean round) {
        this.f22181OooOOO0 = round;
        int measuredHeight = getMeasuredHeight();
        if (this.f22181OooOOO0) {
            setRadius(measuredHeight / 2.0f);
        }
    }

    public final void setUnableBackgroundColor(@ColorInt int unableBackgroundColor) {
        this.f22187OooOo = unableBackgroundColor;
        GradientDrawable gradientDrawable = this.f22194OooOoOO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setColor(this.f22187OooOo);
    }

    public final void setUnableStrokeColor(@ColorInt int unableStrokeColor) {
        this.f22188OooOo0 = unableStrokeColor;
        GradientDrawable gradientDrawable = this.f22194OooOoOO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        OooO00o(gradientDrawable, this.f22188OooOo0, this.f22184OooOOo);
    }

    public final void setUnableStrokeWidth(int unableStrokeWidth) {
        this.f22184OooOOo = unableStrokeWidth;
        GradientDrawable gradientDrawable = this.f22194OooOoOO;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        OooO00o(gradientDrawable, this.f22188OooOo0, this.f22184OooOOo);
    }

    public final void setUnableTextColor(@ColorInt int unableTextColor) {
        this.f22174OooO = unableTextColor;
        OooO0O0();
    }

    @JvmOverloads
    public StateButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ StateButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? o00O0O.buttonStyle : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22196OooOoo0 = new int[]{R.attr.state_enabled};
        this.f22195OooOoo = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.f22197OooOooO = new int[]{-16842910};
        this.f22198OooOooo = new StateListDrawable();
        setup(attributeSet);
    }

    public final void setRadius(@Nullable float[] radii) {
        GradientDrawable gradientDrawable = this.f22193OooOoO0;
        if (gradientDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNormalBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable);
        gradientDrawable.setCornerRadii(radii);
        GradientDrawable gradientDrawable2 = this.f22192OooOoO;
        if (gradientDrawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPressedBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable2);
        gradientDrawable2.setCornerRadii(radii);
        GradientDrawable gradientDrawable3 = this.f22194OooOoOO;
        if (gradientDrawable3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUnableBackground");
        }
        Intrinsics.checkNotNull(gradientDrawable3);
        gradientDrawable3.setCornerRadii(radii);
    }
}
