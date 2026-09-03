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
import com.umeng.analytics.pro.d;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p447o0OoOo0O.o0O0OOOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0007R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00061"}, d2 = {"Lcom/yalla/yalla/ui/view/round/RoundImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "getBorderWidth", "borderWidth", "", "setBorderWidth", "", "getBorderColor", "borderColor", "setBorderColor", "", "displayBorder", "setDisplayBorder", "getLeftTopRadius", "leftTopRadius", "setLeftTopRadius", "getRightTopRadius", "rightTopRadius", "setRightTopRadius", "getLeftBottomRadius", "leftBottomRadius", "setLeftBottomRadius", "getRightBottomRadius", "rightBottomRadius", "setRightBottomRadius", "radius", "setRadius", "Lcom/yalla/yalla/ui/view/round/DisplayType;", "displayType", "setDisplayType", "gradientType", "setGradientType", "gradientContent", "setGradientContent", "mOrientation", "setOrientation", "<set-?>", "Ooooo00", "Lcom/yalla/yalla/ui/view/round/DisplayType;", "getDisplayType", "()Lcom/yalla/yalla/ui/view/round/DisplayType;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoundImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public static final DisplayType[] f25257o00Ooo = {DisplayType.NORMAL, DisplayType.CIRCLE, DisplayType.ROUND_RECT};

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f25258OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Paint f25259OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f25260OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f25261OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f25262OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f25263OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f25264OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f25265OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public DisplayType displayType;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f25267Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f25268OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f25269OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f25270OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f25271Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f25272Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int[] f25273OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public float[] f25274Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f25275o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public Shader f25276o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f25277o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f25278o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f25279ooOO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayType.values().length];
            iArr[DisplayType.CIRCLE.ordinal()] = 1;
            iArr[DisplayType.ROUND_RECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Path OooO0OO() {
        Path path = new Path();
        float f = this.f25258OoooO / 2;
        int i = OooO00o.$EnumSwitchMapping$0[this.displayType.ordinal()];
        if (i == 1) {
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f, Path.Direction.CW);
        } else if (i != 2) {
            RectF rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
            rectF.inset(f, f);
            path.addRect(rectF, Path.Direction.CW);
        } else {
            RectF rectF2 = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
            rectF2.inset(f, f);
            float f2 = this.f25262OoooOOo;
            float f3 = this.f25263OoooOo0;
            float f4 = this.f25265OoooOoo;
            float f5 = this.f25264OoooOoO;
            path.addRoundRect(rectF2, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f25260OoooOO0;
        if (colorStateList != null) {
            Intrinsics.checkNotNull(colorStateList);
            int colorForState = colorStateList.getColorForState(drawableState, 0);
            if (this.f25275o000oOoO != colorForState) {
                this.f25275o000oOoO = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ColorStateList colorStateList2 = this.f25267Ooooo0o;
        if (colorStateList2 != null) {
            Intrinsics.checkNotNull(colorStateList2);
            int colorForState2 = colorStateList2.getColorForState(drawableState, 0);
            if (colorForState2 != this.f25270OooooOo) {
                this.f25270OooooOo = colorForState2;
                z = true;
            }
        }
        ColorStateList colorStateList3 = this.f25268OooooO0;
        if (colorStateList3 != null) {
            Intrinsics.checkNotNull(colorStateList3);
            int colorForState3 = colorStateList3.getColorForState(drawableState, 0);
            if (colorForState3 != this.f25272Oooooo0) {
                this.f25272Oooooo0 = colorForState3;
                z = true;
            }
        }
        ColorStateList colorStateList4 = this.f25269OooooOO;
        if (colorStateList4 != null) {
            Intrinsics.checkNotNull(colorStateList4);
            int colorForState4 = colorStateList4.getColorForState(drawableState, 0);
            if (colorForState4 != this.f25271Oooooo) {
                this.f25271Oooooo = colorForState4;
                z = true;
            }
        }
        if (z) {
            ColorStateList colorStateList5 = this.f25267Ooooo0o;
            if (colorStateList5 != null && this.f25268OooooO0 != null && this.f25269OooooOO != null) {
                this.f25273OoooooO = new int[]{this.f25270OooooOo, this.f25272Oooooo0, this.f25271Oooooo};
                this.f25274Ooooooo = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, 1.0f};
            } else if (colorStateList5 != null && this.f25269OooooOO != null) {
                this.f25273OoooooO = new int[]{this.f25270OooooOo, this.f25271Oooooo};
                this.f25274Ooooooo = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f};
            } else if (colorStateList5 != null && this.f25268OooooO0 != null) {
                this.f25273OoooooO = new int[]{this.f25270OooooOo, this.f25272Oooooo0};
                this.f25274Ooooooo = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f};
            } else if (this.f25268OooooO0 != null && this.f25269OooooOO != null) {
                this.f25273OoooooO = new int[]{this.f25272Oooooo0, this.f25271Oooooo};
                this.f25274Ooooooo = new float[]{0.5f, 1.0f};
            }
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: getBorderColor, reason: from getter */
    public final int getF25275o000oOoO() {
        return this.f25275o000oOoO;
    }

    /* JADX INFO: renamed from: getBorderWidth, reason: from getter */
    public final float getF25258OoooO() {
        return this.f25258OoooO;
    }

    @NotNull
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: getLeftBottomRadius, reason: from getter */
    public final float getF25264OoooOoO() {
        return this.f25264OoooOoO;
    }

    /* JADX INFO: renamed from: getLeftTopRadius, reason: from getter */
    public final float getF25262OoooOOo() {
        return this.f25262OoooOOo;
    }

    /* JADX INFO: renamed from: getRightBottomRadius, reason: from getter */
    public final float getF25265OoooOoo() {
        return this.f25265OoooOoo;
    }

    /* JADX INFO: renamed from: getRightTopRadius, reason: from getter */
    public final float getF25263OoooOo0() {
        return this.f25263OoooOo0;
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
        this.f25262OoooOOo = Math.min(this.f25262OoooOOo, fMin);
        this.f25263OoooOo0 = Math.min(this.f25263OoooOo0, fMin);
        this.f25264OoooOoO = Math.min(this.f25264OoooOoO, fMin);
        this.f25265OoooOoo = Math.min(this.f25265OoooOoo, fMin);
        this.f25258OoooO = Math.min(this.f25258OoooO, fMin / 2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        super.onDraw(canvas2);
        Paint paint = this.f25259OoooO0O;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.f25259OoooO0O;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.f25259OoooO0O;
        Intrinsics.checkNotNull(paint3);
        paint3.setDither(true);
        if (this.displayType != DisplayType.NORMAL) {
            Paint paint4 = this.f25259OoooO0O;
            Intrinsics.checkNotNull(paint4);
            paint4.setStyle(Paint.Style.FILL);
            Paint paint5 = this.f25259OoooO0O;
            Intrinsics.checkNotNull(paint5);
            paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path pathOooO0OO = OooO0OO();
            pathOooO0OO.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            Paint paint6 = this.f25259OoooO0O;
            Intrinsics.checkNotNull(paint6);
            canvas2.drawPath(pathOooO0OO, paint6);
            Paint paint7 = this.f25259OoooO0O;
            Intrinsics.checkNotNull(paint7);
            paint7.setXfermode(null);
        }
        if (this.f25278o0OoOo0 != 0) {
            int i = this.f25279ooOO;
            if (i != 0) {
                if (i == 1) {
                    float width = (getWidth() > getHeight() ? getWidth() : getHeight()) / 2.0f;
                    float width2 = getWidth() / 2.0f;
                    float height = getHeight() / 2.0f;
                    int[] iArr4 = this.f25273OoooooO;
                    if (iArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mColors");
                        iArr3 = null;
                    } else {
                        iArr3 = iArr4;
                    }
                    float[] fArr4 = this.f25274Ooooooo;
                    if (fArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                        fArr3 = null;
                    } else {
                        fArr3 = fArr4;
                    }
                    this.f25276o00O0O = new RadialGradient(width2, height, width, iArr3, fArr3, Shader.TileMode.CLAMP);
                } else if (i == 2) {
                    float width3 = getWidth() / 2.0f;
                    float height2 = getHeight() / 2.0f;
                    int[] iArr5 = this.f25273OoooooO;
                    if (iArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mColors");
                        iArr5 = null;
                    }
                    float[] fArr5 = this.f25274Ooooooo;
                    if (fArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                        fArr5 = null;
                    }
                    this.f25276o00O0O = new SweepGradient(width3, height2, iArr5, fArr5);
                }
            } else if (this.f25277o00Oo0 == 1) {
                float height3 = getHeight();
                int[] iArr6 = this.f25273OoooooO;
                if (iArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mColors");
                    iArr2 = null;
                } else {
                    iArr2 = iArr6;
                }
                float[] fArr6 = this.f25274Ooooooo;
                if (fArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                    fArr2 = null;
                } else {
                    fArr2 = fArr6;
                }
                this.f25276o00O0O = new LinearGradient(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, height3, iArr2, fArr2, Shader.TileMode.CLAMP);
            } else {
                float width4 = getWidth();
                int[] iArr7 = this.f25273OoooooO;
                if (iArr7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mColors");
                    iArr = null;
                } else {
                    iArr = iArr7;
                }
                float[] fArr7 = this.f25274Ooooooo;
                if (fArr7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPoints");
                    fArr = null;
                } else {
                    fArr = fArr7;
                }
                this.f25276o00O0O = new LinearGradient(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, iArr, fArr, Shader.TileMode.CLAMP);
            }
        }
        if (this.f25261OoooOOO) {
            Paint paint8 = this.f25259OoooO0O;
            Intrinsics.checkNotNull(paint8);
            paint8.setStyle(Paint.Style.STROKE);
            Paint paint9 = this.f25259OoooO0O;
            Intrinsics.checkNotNull(paint9);
            paint9.setStrokeWidth(this.f25258OoooO);
            if (this.f25278o0OoOo0 == 1) {
                Paint paint10 = this.f25259OoooO0O;
                Intrinsics.checkNotNull(paint10);
                paint10.setShader(this.f25276o00O0O);
            } else {
                Paint paint11 = this.f25259OoooO0O;
                Intrinsics.checkNotNull(paint11);
                paint11.setShader(null);
                Paint paint12 = this.f25259OoooO0O;
                Intrinsics.checkNotNull(paint12);
                paint12.setColor(this.f25275o000oOoO);
            }
            Path pathOooO0OO2 = OooO0OO();
            Paint paint13 = this.f25259OoooO0O;
            Intrinsics.checkNotNull(paint13);
            canvas2.drawPath(pathOooO0OO2, paint13);
        }
        Paint paint14 = this.f25259OoooO0O;
        if (paint14 != null) {
            paint14.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        }
        canvas.drawBitmap(bitmapCreateBitmap, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f25259OoooO0O);
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
        if (this.f25275o000oOoO != borderColor) {
            this.f25275o000oOoO = borderColor;
            if (this.f25261OoooOOO) {
                postInvalidate();
            }
        }
    }

    public final void setBorderWidth(float borderWidth) {
        if (this.f25258OoooO == borderWidth) {
            return;
        }
        this.f25258OoooO = borderWidth;
        if (this.f25261OoooOOO) {
            postInvalidate();
        }
    }

    public final void setDisplayBorder(boolean displayBorder) {
        if (this.f25261OoooOOO != displayBorder) {
            this.f25261OoooOOO = displayBorder;
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
        if (this.f25278o0OoOo0 != gradientContent) {
            this.f25278o0OoOo0 = gradientContent;
            postInvalidate();
        }
    }

    public final void setGradientType(int gradientType) {
        if (this.f25279ooOO != gradientType) {
            this.f25279ooOO = gradientType;
            postInvalidate();
        }
    }

    public final void setLeftBottomRadius(float leftBottomRadius) {
        if (this.f25264OoooOoO == leftBottomRadius) {
            return;
        }
        this.f25264OoooOoO = leftBottomRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setLeftTopRadius(float leftTopRadius) {
        if (this.f25262OoooOOo == leftTopRadius) {
            return;
        }
        this.f25262OoooOOo = leftTopRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setOrientation(int mOrientation) {
        if (this.f25277o00Oo0 != mOrientation) {
            this.f25277o00Oo0 = mOrientation;
            postInvalidate();
        }
    }

    public final void setRadius(float radius) {
        if (this.f25262OoooOOo == radius) {
            if (this.f25263OoooOo0 == radius) {
                if (this.f25264OoooOoO == radius) {
                    if (this.f25265OoooOoo == radius) {
                        return;
                    }
                }
            }
        }
        this.f25262OoooOOo = radius;
        this.f25263OoooOo0 = radius;
        this.f25264OoooOoO = radius;
        this.f25265OoooOoo = radius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setRightBottomRadius(float rightBottomRadius) {
        if (this.f25265OoooOoo == rightBottomRadius) {
            return;
        }
        this.f25265OoooOoo = rightBottomRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    public final void setRightTopRadius(float rightTopRadius) {
        if (this.f25263OoooOo0 == rightTopRadius) {
            return;
        }
        this.f25263OoooOo0 = rightTopRadius;
        if (this.displayType != DisplayType.NORMAL) {
            postInvalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25258OoooO = 2.0f;
        this.f25275o000oOoO = Color.parseColor("#8A2BE2");
        DisplayType displayType = DisplayType.NORMAL;
        this.displayType = displayType;
        setLayerType(2, null);
        this.f25259OoooO0O = new Paint();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0OOOo.RoundImageView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "ctx.obtainStyledAttribut…styleable.RoundImageView)");
            this.f25258OoooO = typedArrayObtainStyledAttributes.getDimension(7, this.f25258OoooO);
            this.f25260OoooOO0 = typedArrayObtainStyledAttributes.getColorStateList(6);
            this.f25261OoooOOO = typedArrayObtainStyledAttributes.getBoolean(10, this.f25261OoooOOO);
            float dimension = typedArrayObtainStyledAttributes.getDimension(4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            if (dimension > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f25265OoooOoo = dimension;
                this.f25263OoooOo0 = dimension;
                this.f25264OoooOoO = dimension;
                this.f25262OoooOOo = dimension;
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(11, -1);
            this.displayType = i2 >= 0 ? f25257o00Ooo[i2] : displayType;
            this.f25279ooOO = typedArrayObtainStyledAttributes.getInt(3, 0);
            this.f25267Ooooo0o = typedArrayObtainStyledAttributes.getColorStateList(1);
            this.f25268OooooO0 = typedArrayObtainStyledAttributes.getColorStateList(5);
            this.f25269OooooOO = typedArrayObtainStyledAttributes.getColorStateList(2);
            this.f25278o0OoOo0 = typedArrayObtainStyledAttributes.getInt(12, 0);
            this.f25277o00Oo0 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
