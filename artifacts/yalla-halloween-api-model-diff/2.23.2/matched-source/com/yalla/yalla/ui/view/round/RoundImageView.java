package com.yalla.yalla.ui.view.round;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0007R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00061"}, d2 = {"Lcom/yalla/yalla/ui/view/round/RoundImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "getBorderWidth", "borderWidth", "", "setBorderWidth", "", "getBorderColor", "borderColor", "setBorderColor", "", "displayBorder", "setDisplayBorder", "getLeftTopRadius", "leftTopRadius", "setLeftTopRadius", "getRightTopRadius", "rightTopRadius", "setRightTopRadius", "getLeftBottomRadius", "leftBottomRadius", "setLeftBottomRadius", "getRightBottomRadius", "rightBottomRadius", "setRightBottomRadius", "radius", "setRadius", "Lcom/yalla/yalla/ui/view/round/DisplayType;", "displayType", "setDisplayType", "gradientType", "setGradientType", "gradientContent", "setGradientContent", "mOrientation", "setOrientation", "<set-?>", "OooOOO0", "Lcom/yalla/yalla/ui/view/round/DisplayType;", "getDisplayType", "()Lcom/yalla/yalla/ui/view/round/DisplayType;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoundImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public static final DisplayType[] f30798OooOoO = {DisplayType.NORMAL, DisplayType.CIRCLE, DisplayType.ROUND_RECT};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f30799OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Paint f30800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f30801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f30802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f30803OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f30804OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f30805OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f30806OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f30807OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f30808OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public DisplayType displayType;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f30810OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f30811OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f30812OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30813OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f30814OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Shader f30815OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float[] f30816OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int[] f30817OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f30818OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f30819OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f30820OooOoO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayType.values().length];
            try {
                iArr[DisplayType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayType.ROUND_RECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Path OooO0OO() {
        Path path = new Path();
        float f = this.f30802OooO0o0 / 2;
        int i = OooO00o.$EnumSwitchMapping$0[this.displayType.ordinal()];
        if (i == 1) {
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f, Path.Direction.CW);
        } else if (i != 2) {
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(f, f);
            path.addRect(rectF, Path.Direction.CW);
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            rectF2.inset(f, f);
            float f2 = this.f30799OooO;
            float f3 = this.f30805OooOO0;
            float f4 = this.f30807OooOO0o;
            float f5 = this.f30806OooOO0O;
            path.addRoundRect(rectF2, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f30801OooO0o;
        boolean z2 = true;
        if (colorStateList != null) {
            Intrinsics.checkNotNull(colorStateList);
            int colorForState = colorStateList.getColorForState(drawableState, 0);
            if (this.f30803OooO0oO != colorForState) {
                this.f30803OooO0oO = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ColorStateList colorStateList2 = this.f30808OooOOO;
        if (colorStateList2 != null) {
            Intrinsics.checkNotNull(colorStateList2);
            int colorForState2 = colorStateList2.getColorForState(drawableState, 0);
            if (colorForState2 != this.f30813OooOOo0) {
                this.f30813OooOOo0 = colorForState2;
                z = true;
            }
        }
        ColorStateList colorStateList3 = this.f30810OooOOOO;
        if (colorStateList3 != null) {
            Intrinsics.checkNotNull(colorStateList3);
            int colorForState3 = colorStateList3.getColorForState(drawableState, 0);
            if (colorForState3 != this.f30812OooOOo) {
                this.f30812OooOOo = colorForState3;
                z = true;
            }
        }
        ColorStateList colorStateList4 = this.f30811OooOOOo;
        if (colorStateList4 != null) {
            Intrinsics.checkNotNull(colorStateList4);
            int colorForState4 = colorStateList4.getColorForState(drawableState, 0);
            if (colorForState4 != this.f30814OooOOoo) {
                this.f30814OooOOoo = colorForState4;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            ColorStateList colorStateList5 = this.f30808OooOOO;
            if (colorStateList5 != null && this.f30810OooOOOO != null && this.f30811OooOOOo != null) {
                this.f30817OooOo00 = new int[]{this.f30813OooOOo0, this.f30812OooOOo, this.f30814OooOOoo};
                this.f30816OooOo0 = new float[]{0.0f, 0.5f, 1.0f};
            } else if (colorStateList5 != null && this.f30811OooOOOo != null) {
                this.f30817OooOo00 = new int[]{this.f30813OooOOo0, this.f30814OooOOoo};
                this.f30816OooOo0 = new float[]{0.0f, 1.0f};
            } else if (colorStateList5 != null && this.f30810OooOOOO != null) {
                this.f30817OooOo00 = new int[]{this.f30813OooOOo0, this.f30812OooOOo};
                this.f30816OooOo0 = new float[]{0.0f, 0.5f};
            } else if (this.f30810OooOOOO != null && this.f30811OooOOOo != null) {
                this.f30817OooOo00 = new int[]{this.f30812OooOOo, this.f30814OooOOoo};
                this.f30816OooOo0 = new float[]{0.5f, 1.0f};
            }
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: getBorderColor, reason: from getter */
    public final int getF30803OooO0oO() {
        return this.f30803OooO0oO;
    }

    /* JADX INFO: renamed from: getBorderWidth, reason: from getter */
    public final float getF30802OooO0o0() {
        return this.f30802OooO0o0;
    }

    @NotNull
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: getLeftBottomRadius, reason: from getter */
    public final float getF30806OooOO0O() {
        return this.f30806OooOO0O;
    }

    /* JADX INFO: renamed from: getLeftTopRadius, reason: from getter */
    public final float getF30799OooO() {
        return this.f30799OooO;
    }

    /* JADX INFO: renamed from: getRightBottomRadius, reason: from getter */
    public final float getF30807OooOO0o() {
        return this.f30807OooOO0o;
    }

    /* JADX INFO: renamed from: getRightTopRadius, reason: from getter */
    public final float getF30805OooOO0() {
        return this.f30805OooOO0;
    }

    @Override // android.view.View
    public final void invalidate() {
        postInvalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(@NotNull Canvas canvas) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        int[] iArr3;
        float[] fArr3;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getDrawable() == null || getWidth() <= 0 || getHeight() <= 0) {
            super.onDraw(canvas);
            return;
        }
        float fMin = Math.min(getWidth(), getHeight()) / 2.0f;
        this.f30799OooO = Math.min(this.f30799OooO, fMin);
        this.f30805OooOO0 = Math.min(this.f30805OooOO0, fMin);
        this.f30806OooOO0O = Math.min(this.f30806OooOO0O, fMin);
        this.f30807OooOO0o = Math.min(this.f30807OooOO0o, fMin);
        this.f30802OooO0o0 = Math.min(this.f30802OooO0o0, fMin / 2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        super.onDraw(canvas2);
        Paint paint = this.f30800OooO0Oo;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.f30800OooO0Oo;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.f30800OooO0Oo;
        Intrinsics.checkNotNull(paint3);
        paint3.setDither(true);
        if (this.displayType != DisplayType.NORMAL) {
            Paint paint4 = this.f30800OooO0Oo;
            Intrinsics.checkNotNull(paint4);
            paint4.setStyle(Paint.Style.FILL);
            Paint paint5 = this.f30800OooO0Oo;
            Intrinsics.checkNotNull(paint5);
            paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path pathOooO0OO = OooO0OO();
            pathOooO0OO.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            Paint paint6 = this.f30800OooO0Oo;
            Intrinsics.checkNotNull(paint6);
            canvas2.drawPath(pathOooO0OO, paint6);
            Paint paint7 = this.f30800OooO0Oo;
            Intrinsics.checkNotNull(paint7);
            paint7.setXfermode(null);
        }
        if (this.f30818OooOo0O != 0) {
            int i = this.f30819OooOo0o;
            if (i != 0) {
                if (i == 1) {
                    float width = (getWidth() > getHeight() ? getWidth() : getHeight()) / 2.0f;
                    float width2 = getWidth() / 2.0f;
                    float height = getHeight() / 2.0f;
                    int[] iArr4 = this.f30817OooOo00;
                    if (iArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mColors");
                        iArr3 = null;
                    } else {
                        iArr3 = iArr4;
                    }
                    float[] fArr4 = this.f30816OooOo0;
                    if (fArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                        fArr3 = null;
                    } else {
                        fArr3 = fArr4;
                    }
                    this.f30815OooOo = new RadialGradient(width2, height, width, iArr3, fArr3, Shader.TileMode.CLAMP);
                } else if (i == 2) {
                    float width3 = getWidth() / 2.0f;
                    float height2 = getHeight() / 2.0f;
                    int[] iArr5 = this.f30817OooOo00;
                    if (iArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mColors");
                        iArr5 = null;
                    }
                    float[] fArr5 = this.f30816OooOo0;
                    if (fArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                        fArr5 = null;
                    }
                    this.f30815OooOo = new SweepGradient(width3, height2, iArr5, fArr5);
                }
            } else if (this.f30820OooOoO0 == 1) {
                float height3 = getHeight();
                int[] iArr6 = this.f30817OooOo00;
                if (iArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mColors");
                    iArr2 = null;
                } else {
                    iArr2 = iArr6;
                }
                float[] fArr6 = this.f30816OooOo0;
                if (fArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                    fArr2 = null;
                } else {
                    fArr2 = fArr6;
                }
                this.f30815OooOo = new LinearGradient(0.0f, 0.0f, 0.0f, height3, iArr2, fArr2, Shader.TileMode.CLAMP);
            } else {
                float width4 = getWidth();
                int[] iArr7 = this.f30817OooOo00;
                if (iArr7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mColors");
                    iArr = null;
                } else {
                    iArr = iArr7;
                }
                float[] fArr7 = this.f30816OooOo0;
                if (fArr7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                    fArr = null;
                } else {
                    fArr = fArr7;
                }
                this.f30815OooOo = new LinearGradient(0.0f, 0.0f, width4, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
            }
        }
        if (this.f30804OooO0oo) {
            Paint paint8 = this.f30800OooO0Oo;
            Intrinsics.checkNotNull(paint8);
            paint8.setStyle(Paint.Style.STROKE);
            Paint paint9 = this.f30800OooO0Oo;
            Intrinsics.checkNotNull(paint9);
            paint9.setStrokeWidth(this.f30802OooO0o0);
            if (this.f30818OooOo0O == 1) {
                Paint paint10 = this.f30800OooO0Oo;
                Intrinsics.checkNotNull(paint10);
                paint10.setShader(this.f30815OooOo);
            } else {
                Paint paint11 = this.f30800OooO0Oo;
                Intrinsics.checkNotNull(paint11);
                paint11.setShader(null);
                Paint paint12 = this.f30800OooO0Oo;
                Intrinsics.checkNotNull(paint12);
                paint12.setColor(this.f30803OooO0oO);
            }
            Path pathOooO0OO2 = OooO0OO();
            Paint paint13 = this.f30800OooO0Oo;
            Intrinsics.checkNotNull(paint13);
            canvas2.drawPath(pathOooO0OO2, paint13);
        }
        Paint paint14 = this.f30800OooO0Oo;
        if (paint14 != null) {
            paint14.setAlpha(255);
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f30800OooO0Oo);
        bitmapCreateBitmap.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.displayType != DisplayType.CIRCLE) {
            super.onMeasure(i, i2);
            return;
        }
        if (size >= size2) {
            i = i2;
        }
        if (size > 0) {
            i2 = i;
        }
        super.onMeasure(i2, i2);
    }

    @Override // android.view.View
    public final void postInvalidate() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            super.invalidate();
        } else {
            super.postInvalidate();
        }
    }

    public final void setBorderColor(int borderColor) {
        if (this.f30803OooO0oO != borderColor) {
            this.f30803OooO0oO = borderColor;
            if (this.f30804OooO0oo) {
                postInvalidate();
            }
        }
    }

    public final void setBorderWidth(float borderWidth) {
        if (this.f30802OooO0o0 == borderWidth) {
            return;
        }
        this.f30802OooO0o0 = borderWidth;
        if (this.f30804OooO0oo) {
            postInvalidate();
        }
    }

    public final void setDisplayBorder(boolean displayBorder) {
        if (this.f30804OooO0oo != displayBorder) {
            this.f30804OooO0oo = displayBorder;
            postInvalidate();
        }
    }

    public final void setDisplayType(@NotNull DisplayType displayType) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        if (this.displayType != displayType) {
            this.displayType = displayType;
        }
    }

    public final void setGradientContent(int gradientContent) {
        if (this.f30818OooOo0O != gradientContent) {
            this.f30818OooOo0O = gradientContent;
            postInvalidate();
        }
    }

    public final void setGradientType(int gradientType) {
        if (this.f30819OooOo0o != gradientType) {
            this.f30819OooOo0o = gradientType;
            postInvalidate();
        }
    }

    public final void setLeftBottomRadius(float leftBottomRadius) {
        if (this.f30806OooOO0O == leftBottomRadius) {
            return;
        }
        this.f30806OooOO0O = leftBottomRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setLeftTopRadius(float leftTopRadius) {
        if (this.f30799OooO == leftTopRadius) {
            return;
        }
        this.f30799OooO = leftTopRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setOrientation(int mOrientation) {
        if (this.f30820OooOoO0 != mOrientation) {
            this.f30820OooOoO0 = mOrientation;
            postInvalidate();
        }
    }

    public final void setRadius(float radius) {
        if (this.f30799OooO == radius) {
            if (this.f30805OooOO0 == radius) {
                if (this.f30806OooOO0O == radius) {
                    if (this.f30807OooOO0o == radius) {
                        return;
                    }
                }
            }
        }
        this.f30799OooO = radius;
        this.f30805OooOO0 = radius;
        this.f30806OooOO0O = radius;
        this.f30807OooOO0o = radius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setRightBottomRadius(float rightBottomRadius) {
        if (this.f30807OooOO0o == rightBottomRadius) {
            return;
        }
        this.f30807OooOO0o = rightBottomRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setRightTopRadius(float rightTopRadius) {
        if (this.f30805OooOO0 == rightTopRadius) {
            return;
        }
        this.f30805OooOO0 = rightTopRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30802OooO0o0 = 2.0f;
        this.f30803OooO0oO = Color.parseColor("#8A2BE2");
        DisplayType displayType = DisplayType.NORMAL;
        this.displayType = displayType;
        setLayerType(2, null);
        this.f30800OooO0Oo = new Paint();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00000.RoundImageView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f30802OooO0o0 = typedArrayObtainStyledAttributes.getDimension(o00000.RoundImageView_borderWidth, this.f30802OooO0o0);
            this.f30801OooO0o = typedArrayObtainStyledAttributes.getColorStateList(o00000.RoundImageView_borderColor);
            this.f30804OooO0oo = typedArrayObtainStyledAttributes.getBoolean(o00000.RoundImageView_displayBorder, this.f30804OooO0oo);
            float dimension = typedArrayObtainStyledAttributes.getDimension(o00000.RoundImageView_android_radius, 0.0f);
            if (dimension > 0.0f) {
                this.f30807OooOO0o = dimension;
                this.f30805OooOO0 = dimension;
                this.f30806OooOO0O = dimension;
                this.f30799OooO = dimension;
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(o00000.RoundImageView_displayType, -1);
            this.displayType = i2 >= 0 ? f30798OooOoO[i2] : displayType;
            this.f30819OooOo0o = typedArrayObtainStyledAttributes.getInt(o00000.RoundImageView_android_type, 0);
            this.f30808OooOOO = typedArrayObtainStyledAttributes.getColorStateList(o00000.RoundImageView_android_startColor);
            this.f30810OooOOOO = typedArrayObtainStyledAttributes.getColorStateList(o00000.RoundImageView_android_centerColor);
            this.f30811OooOOOo = typedArrayObtainStyledAttributes.getColorStateList(o00000.RoundImageView_android_endColor);
            this.f30818OooOo0O = typedArrayObtainStyledAttributes.getInt(o00000.RoundImageView_gradientContent, 0);
            this.f30820OooOoO0 = typedArrayObtainStyledAttributes.getInt(o00000.RoundImageView_android_orientation, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
