package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.OooO;
import o000000O.OooO0OO;
import org.jctools.util.Pow2;
import p012OooOo0O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f4847OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TextPaint f4848OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f4849OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Path f4850OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f4851OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f4852OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f4853OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ViewOutlineProvider f4854OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public RectF f4855OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f4856OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f4857OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f4858OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f4859OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f4860OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f4861OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f4862OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f4863OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f4864OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Rect f4865OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f4866OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f4867OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f4868OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f4869OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f4870OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f4871OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f4872OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f4873OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public float f4874OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f4875Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public BitmapShader f4876Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Drawable f4877Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Matrix f4878Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Bitmap f4879Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public Matrix f4880Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public float f4881Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f4882Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f4883Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f4884Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Paint f4885Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f4886OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Paint f4887OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Rect f4888OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f4889OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f4890OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f4891OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f4892o000oOoO;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            int width = motionLabel.getWidth();
            int height = motionLabel.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f4847OooO) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionLabel motionLabel = MotionLabel.this;
            outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.f4853OooOO0);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f4848OooO0Oo = new TextPaint();
        this.f4850OooO0o0 = new Path();
        this.f4849OooO0o = 65535;
        this.f4851OooO0oO = 65535;
        this.f4852OooO0oo = false;
        this.f4847OooO = 0.0f;
        this.f4853OooOO0 = Float.NaN;
        this.f4857OooOOO0 = 48.0f;
        this.f4856OooOOO = Float.NaN;
        this.f4861OooOOo0 = 0.0f;
        this.f4860OooOOo = "Hello World";
        this.f4862OooOOoo = true;
        this.f4865OooOo00 = new Rect();
        this.f4864OooOo0 = 1;
        this.f4866OooOo0O = 1;
        this.f4867OooOo0o = 1;
        this.f4863OooOo = 1;
        this.f4868OooOoO = 8388659;
        this.f4870OooOoOO = 0;
        this.f4872OooOoo0 = false;
        this.f4881Oooo0OO = Float.NaN;
        this.f4883Oooo0o0 = Float.NaN;
        this.f4882Oooo0o = 0.0f;
        this.f4884Oooo0oO = 0.0f;
        this.f4885Oooo0oo = new Paint();
        this.f4875Oooo = 0;
        this.f4886OoooO = Float.NaN;
        this.f4890OoooOO0 = Float.NaN;
        this.f4892o000oOoO = Float.NaN;
        this.f4891OoooOOO = Float.NaN;
        OooO0OO(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.f4856OooOOO) ? 1.0f : this.f4857OooOOO0 / this.f4856OooOOO;
        String str = this.f4860OooOOo;
        return ((this.f4882Oooo0o + 1.0f) * ((((Float.isNaN(this.f4873OooOooO) ? getMeasuredWidth() : this.f4873OooOooO) - getPaddingLeft()) - getPaddingRight()) - (this.f4848OooO0Oo.measureText(str, 0, str.length()) * f))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.f4856OooOOO) ? 1.0f : this.f4857OooOOO0 / this.f4856OooOOO;
        Paint.FontMetrics fontMetrics = this.f4848OooO0Oo.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f4874OooOooo) ? getMeasuredHeight() : this.f4874OooOooo) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((1.0f - this.f4884Oooo0oO) * (measuredHeight - ((f2 - f3) * f))) / 2.0f) - (f * f3);
    }

    @Override // o000000O.OooO0OO
    public final void OooO00o(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f4871OooOoo = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.f4873OooOooO = f5;
        float f6 = f4 - f2;
        this.f4874OooOooo = f6;
        if (this.f4880Oooo0O0 != null) {
            this.f4873OooOooO = f5;
            this.f4874OooOooo = f6;
            OooO0Oo();
        }
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(i6, Pow2.MAX_POW2));
            super.layout(i, i5, i2, i4);
        }
        if (this.f4872OooOoo0) {
            Rect rect = this.f4888OoooO00;
            TextPaint textPaint = this.f4848OooO0Oo;
            if (rect == null) {
                this.f4887OoooO0 = new Paint();
                this.f4888OoooO00 = new Rect();
                this.f4887OoooO0.set(textPaint);
                this.f4889OoooO0O = this.f4887OoooO0.getTextSize();
            }
            this.f4873OooOooO = f5;
            this.f4874OooOooo = f6;
            Paint paint = this.f4887OoooO0;
            String str = this.f4860OooOOo;
            paint.getTextBounds(str, 0, str.length(), this.f4888OoooO00);
            int iWidth = this.f4888OoooO00.width();
            float fHeight = this.f4888OoooO00.height() * 1.3f;
            float f7 = (f5 - this.f4866OooOo0O) - this.f4864OooOo0;
            float f8 = (f6 - this.f4863OooOo) - this.f4867OooOo0o;
            float f9 = iWidth;
            if (f9 * f8 > fHeight * f7) {
                textPaint.setTextSize((this.f4889OoooO0O * f7) / f9);
            } else {
                textPaint.setTextSize((this.f4889OoooO0O * f8) / fHeight);
            }
            if (this.f4852OooO0oo || !Float.isNaN(this.f4856OooOOO)) {
                OooO0O0(Float.isNaN(this.f4856OooOOO) ? 1.0f : this.f4857OooOOO0 / this.f4856OooOOO);
            }
        }
    }

    public final void OooO0O0(float f) {
        if (this.f4852OooO0oo || f != 1.0f) {
            this.f4850OooO0o0.reset();
            String str = this.f4860OooOOo;
            int length = str.length();
            TextPaint textPaint = this.f4848OooO0Oo;
            Rect rect = this.f4865OooOo00;
            textPaint.getTextBounds(str, 0, length, rect);
            this.f4848OooO0Oo.getTextPath(str, 0, length, 0.0f, 0.0f, this.f4850OooO0o0);
            if (f != 1.0f) {
                Log.v("MotionLabel", o000000O.OooO00o.OooO00o() + " scale " + f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f4850OooO0o0.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f4862OooOOoo = false;
        }
    }

    public final void OooO0OO(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(OooOOO0.colorPrimary, typedValue, true);
        int i = typedValue.data;
        this.f4849OooO0o = i;
        TextPaint textPaint = this.f4848OooO0Oo;
        textPaint.setColor(i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == OooO.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == OooO.MotionLabel_android_fontFamily) {
                    this.f4869OooOoO0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == OooO.MotionLabel_scaleFromTextSize) {
                    this.f4856OooOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f4856OooOOO);
                } else if (index == OooO.MotionLabel_android_textSize) {
                    this.f4857OooOOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f4857OooOOO0);
                } else if (index == OooO.MotionLabel_android_textStyle) {
                    this.f4858OooOOOO = typedArrayObtainStyledAttributes.getInt(index, this.f4858OooOOOO);
                } else if (index == OooO.MotionLabel_android_typeface) {
                    this.f4859OooOOOo = typedArrayObtainStyledAttributes.getInt(index, this.f4859OooOOOo);
                } else if (index == OooO.MotionLabel_android_textColor) {
                    this.f4849OooO0o = typedArrayObtainStyledAttributes.getColor(index, this.f4849OooO0o);
                } else if (index == OooO.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f4853OooOO0);
                    this.f4853OooOO0 = dimension;
                    setRound(dimension);
                } else if (index == OooO.MotionLabel_borderRoundPercent) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f4847OooO);
                    this.f4847OooO = f;
                    setRoundPercent(f);
                } else if (index == OooO.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == OooO.MotionLabel_android_autoSizeTextType) {
                    this.f4870OooOoOO = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == OooO.MotionLabel_textOutlineColor) {
                    this.f4851OooO0oO = typedArrayObtainStyledAttributes.getInt(index, this.f4851OooO0oO);
                    this.f4852OooO0oo = true;
                } else if (index == OooO.MotionLabel_textOutlineThickness) {
                    this.f4861OooOOo0 = typedArrayObtainStyledAttributes.getDimension(index, this.f4861OooOOo0);
                    this.f4852OooO0oo = true;
                } else if (index == OooO.MotionLabel_textBackground) {
                    this.f4877Oooo000 = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f4852OooO0oo = true;
                } else if (index == OooO.MotionLabel_textBackgroundPanX) {
                    this.f4886OoooO = typedArrayObtainStyledAttributes.getFloat(index, this.f4886OoooO);
                } else if (index == OooO.MotionLabel_textBackgroundPanY) {
                    this.f4890OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4890OoooOO0);
                } else if (index == OooO.MotionLabel_textPanX) {
                    this.f4882Oooo0o = typedArrayObtainStyledAttributes.getFloat(index, this.f4882Oooo0o);
                } else if (index == OooO.MotionLabel_textPanY) {
                    this.f4884Oooo0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f4884Oooo0oO);
                } else if (index == OooO.MotionLabel_textBackgroundRotate) {
                    this.f4891OoooOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f4891OoooOOO);
                } else if (index == OooO.MotionLabel_textBackgroundZoom) {
                    this.f4892o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f4892o000oOoO);
                } else if (index == OooO.MotionLabel_textureHeight) {
                    this.f4881Oooo0OO = typedArrayObtainStyledAttributes.getDimension(index, this.f4881Oooo0OO);
                } else if (index == OooO.MotionLabel_textureWidth) {
                    this.f4883Oooo0o0 = typedArrayObtainStyledAttributes.getDimension(index, this.f4883Oooo0o0);
                } else if (index == OooO.MotionLabel_textureEffect) {
                    this.f4875Oooo = typedArrayObtainStyledAttributes.getInt(index, this.f4875Oooo);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f4877Oooo000 != null) {
            this.f4880Oooo0O0 = new Matrix();
            int intrinsicWidth = this.f4877Oooo000.getIntrinsicWidth();
            int intrinsicHeight = this.f4877Oooo000.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f4883Oooo0o0) ? 128 : (int) this.f4883Oooo0o0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f4881Oooo0OO) ? 128 : (int) this.f4881Oooo0OO;
            }
            if (this.f4875Oooo != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f4879Oooo00o = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f4879Oooo00o);
            this.f4877Oooo000.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f4877Oooo000.setFilterBitmap(true);
            this.f4877Oooo000.draw(canvas);
            if (this.f4875Oooo != 0) {
                Bitmap bitmap = this.f4879Oooo00o;
                System.nanoTime();
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i3 = 0; i3 < 4 && width >= 32 && height >= 32; i3++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.f4879Oooo00o = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.f4879Oooo00o;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f4876Oooo0 = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f4864OooOo0 = getPaddingLeft();
        this.f4866OooOo0O = getPaddingRight();
        this.f4867OooOo0o = getPaddingTop();
        this.f4863OooOo = getPaddingBottom();
        String str = this.f4869OooOoO0;
        int i4 = this.f4859OooOOOo;
        int i5 = this.f4858OooOOOO;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i5);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.f4849OooO0o);
            textPaint.setStrokeWidth(this.f4861OooOOo0);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.f4857OooOOO0);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i4 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i4 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i4 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i5 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typefaceCreate, i5);
            setTypeface(typefaceDefaultFromStyle);
            int i6 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i5;
            textPaint.setFakeBoldText((i6 & 1) != 0);
            textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.f4849OooO0o);
        textPaint.setStrokeWidth(this.f4861OooOOo0);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.f4857OooOOO0);
        textPaint.setAntiAlias(true);
    }

    public final void OooO0Oo() {
        float f = Float.isNaN(this.f4886OoooO) ? 0.0f : this.f4886OoooO;
        float f2 = Float.isNaN(this.f4890OoooOO0) ? 0.0f : this.f4890OoooOO0;
        float f3 = Float.isNaN(this.f4892o000oOoO) ? 1.0f : this.f4892o000oOoO;
        float f4 = Float.isNaN(this.f4891OoooOOO) ? 0.0f : this.f4891OoooOOO;
        this.f4880Oooo0O0.reset();
        float width = this.f4879Oooo00o.getWidth();
        float height = this.f4879Oooo00o.getHeight();
        float f5 = Float.isNaN(this.f4883Oooo0o0) ? this.f4873OooOooO : this.f4883Oooo0o0;
        float f6 = Float.isNaN(this.f4881Oooo0OO) ? this.f4874OooOooo : this.f4881Oooo0OO;
        float f7 = f3 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.f4880Oooo0O0.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.f4881Oooo0OO)) {
            f11 = this.f4881Oooo0OO / 2.0f;
        }
        if (!Float.isNaN(this.f4883Oooo0o0)) {
            f9 = this.f4883Oooo0o0 / 2.0f;
        }
        this.f4880Oooo0O0.postTranslate((((f * f9) + f5) - f8) * 0.5f, (((f2 * f11) + f6) - f10) * 0.5f);
        this.f4880Oooo0O0.postRotate(f4, f5 / 2.0f, f6 / 2.0f);
        this.f4876Oooo0.setLocalMatrix(this.f4880Oooo0O0);
    }

    public float getRound() {
        return this.f4853OooOO0;
    }

    public float getRoundPercent() {
        return this.f4847OooO;
    }

    public float getScaleFromTextSize() {
        return this.f4856OooOOO;
    }

    public float getTextBackgroundPanX() {
        return this.f4886OoooO;
    }

    public float getTextBackgroundPanY() {
        return this.f4890OoooOO0;
    }

    public float getTextBackgroundRotate() {
        return this.f4891OoooOOO;
    }

    public float getTextBackgroundZoom() {
        return this.f4892o000oOoO;
    }

    public int getTextOutlineColor() {
        return this.f4851OooO0oO;
    }

    public float getTextPanX() {
        return this.f4882Oooo0o;
    }

    public float getTextPanY() {
        return this.f4884Oooo0oO;
    }

    public float getTextureHeight() {
        return this.f4881Oooo0OO;
    }

    public float getTextureWidth() {
        return this.f4883Oooo0o0;
    }

    public Typeface getTypeface() {
        return this.f4848OooO0Oo.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f4856OooOOO);
        float f = zIsNaN ? 1.0f : this.f4857OooOOO0 / this.f4856OooOOO;
        this.f4873OooOooO = i3 - i;
        this.f4874OooOooo = i4 - i2;
        if (this.f4872OooOoo0) {
            Rect rect = this.f4888OoooO00;
            TextPaint textPaint = this.f4848OooO0Oo;
            if (rect == null) {
                this.f4887OoooO0 = new Paint();
                this.f4888OoooO00 = new Rect();
                this.f4887OoooO0.set(textPaint);
                this.f4889OoooO0O = this.f4887OoooO0.getTextSize();
            }
            Paint paint = this.f4887OoooO0;
            String str = this.f4860OooOOo;
            paint.getTextBounds(str, 0, str.length(), this.f4888OoooO00);
            int iWidth = this.f4888OoooO00.width();
            int iHeight = (int) (this.f4888OoooO00.height() * 1.3f);
            float f2 = (this.f4873OooOooO - this.f4866OooOo0O) - this.f4864OooOo0;
            float f3 = (this.f4874OooOooo - this.f4863OooOo) - this.f4867OooOo0o;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    textPaint.setTextSize((this.f4889OoooO0O * f2) / f4);
                } else {
                    textPaint.setTextSize((this.f4889OoooO0O * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f4852OooO0oo || !zIsNaN) {
            float f8 = i;
            float f9 = i2;
            float f10 = i3;
            float f11 = i4;
            if (this.f4880Oooo0O0 != null) {
                this.f4873OooOooO = f10 - f8;
                this.f4874OooOooo = f11 - f9;
                OooO0Oo();
            }
            OooO0O0(f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f4856OooOOO) ? 1.0f : this.f4857OooOOO0 / this.f4856OooOOO;
        super.onDraw(canvas);
        boolean z = this.f4852OooO0oo;
        TextPaint textPaint = this.f4848OooO0Oo;
        if (!z && f == 1.0f) {
            canvas.drawText(this.f4860OooOOo, this.f4871OooOoo + this.f4864OooOo0 + getHorizontalOffset(), this.f4867OooOo0o + getVerticalOffset(), textPaint);
            return;
        }
        if (this.f4862OooOOoo) {
            OooO0O0(f);
        }
        if (this.f4878Oooo00O == null) {
            this.f4878Oooo00O = new Matrix();
        }
        if (!this.f4852OooO0oo) {
            float horizontalOffset = this.f4864OooOo0 + getHorizontalOffset();
            float verticalOffset = this.f4867OooOo0o + getVerticalOffset();
            this.f4878Oooo00O.reset();
            this.f4878Oooo00O.preTranslate(horizontalOffset, verticalOffset);
            this.f4850OooO0o0.transform(this.f4878Oooo00O);
            textPaint.setColor(this.f4849OooO0o);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.f4861OooOOo0);
            canvas.drawPath(this.f4850OooO0o0, textPaint);
            this.f4878Oooo00O.reset();
            this.f4878Oooo00O.preTranslate(-horizontalOffset, -verticalOffset);
            this.f4850OooO0o0.transform(this.f4878Oooo00O);
            return;
        }
        Paint paint = this.f4885Oooo0oo;
        paint.set(textPaint);
        this.f4878Oooo00O.reset();
        float horizontalOffset2 = this.f4864OooOo0 + getHorizontalOffset();
        float verticalOffset2 = this.f4867OooOo0o + getVerticalOffset();
        this.f4878Oooo00O.postTranslate(horizontalOffset2, verticalOffset2);
        this.f4878Oooo00O.preScale(f, f);
        this.f4850OooO0o0.transform(this.f4878Oooo00O);
        if (this.f4876Oooo0 != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.f4876Oooo0);
        } else {
            textPaint.setColor(this.f4849OooO0o);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.f4861OooOOo0);
        canvas.drawPath(this.f4850OooO0o0, textPaint);
        if (this.f4876Oooo0 != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.f4851OooO0oO);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.f4861OooOOo0);
        canvas.drawPath(this.f4850OooO0o0, textPaint);
        this.f4878Oooo00O.reset();
        this.f4878Oooo00O.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f4850OooO0o0.transform(this.f4878Oooo00O);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f4872OooOoo0 = false;
        this.f4864OooOo0 = getPaddingLeft();
        this.f4866OooOo0O = getPaddingRight();
        this.f4867OooOo0o = getPaddingTop();
        this.f4863OooOo = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.f4860OooOOo;
            int length = str.length();
            TextPaint textPaint = this.f4848OooO0Oo;
            Rect rect = this.f4865OooOo00;
            textPaint.getTextBounds(str, 0, length, rect);
            if (mode != 1073741824) {
                size = (int) (rect.width() + 0.99999f);
            }
            size += this.f4864OooOo0 + this.f4866OooOo0O;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f4867OooOo0o + this.f4863OooOo + fontMetricsInt;
            }
        } else if (this.f4870OooOoOO != 0) {
            this.f4872OooOoo0 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f4868OooOoO) {
            invalidate();
        }
        this.f4868OooOoO = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f4884Oooo0oO = -1.0f;
        } else if (i2 != 80) {
            this.f4884Oooo0oO = 0.0f;
        } else {
            this.f4884Oooo0oO = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f4882Oooo0o = 0.0f;
                        return;
                    }
                }
            }
            this.f4882Oooo0o = 1.0f;
            return;
        }
        this.f4882Oooo0o = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f4853OooOO0 = f;
            float f2 = this.f4847OooO;
            this.f4847OooO = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f4853OooOO0 != f;
        this.f4853OooOO0 = f;
        if (f != 0.0f) {
            if (this.f4850OooO0o0 == null) {
                this.f4850OooO0o0 = new Path();
            }
            if (this.f4855OooOO0o == null) {
                this.f4855OooOO0o = new RectF();
            }
            if (this.f4854OooOO0O == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f4854OooOO0O = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f4855OooOO0o.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f4850OooO0o0.reset();
            Path path = this.f4850OooO0o0;
            RectF rectF = this.f4855OooOO0o;
            float f3 = this.f4853OooOO0;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.f4847OooO != f;
        this.f4847OooO = f;
        if (f != 0.0f) {
            if (this.f4850OooO0o0 == null) {
                this.f4850OooO0o0 = new Path();
            }
            if (this.f4855OooOO0o == null) {
                this.f4855OooOO0o = new RectF();
            }
            if (this.f4854OooOO0O == null) {
                OooO00o oooO00o = new OooO00o();
                this.f4854OooOO0O = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f4847OooO) / 2.0f;
            this.f4855OooOO0o.set(0.0f, 0.0f, width, height);
            this.f4850OooO0o0.reset();
            this.f4850OooO0o0.addRoundRect(this.f4855OooOO0o, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f4856OooOOO = f;
    }

    public void setText(CharSequence charSequence) {
        this.f4860OooOOo = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f4886OoooO = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f4890OoooOO0 = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f4891OoooOOO = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f4892o000oOoO = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f4849OooO0o = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f4851OooO0oO = i;
        this.f4852OooO0oo = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f4861OooOOo0 = f;
        this.f4852OooO0oo = true;
        if (Float.isNaN(f)) {
            this.f4861OooOOo0 = 1.0f;
            this.f4852OooO0oo = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f4882Oooo0o = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f4884Oooo0oO = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f4857OooOOO0 = f;
        Log.v("MotionLabel", o000000O.OooO00o.OooO00o() + "  " + f + " / " + this.f4856OooOOO);
        if (!Float.isNaN(this.f4856OooOOO)) {
            f = this.f4856OooOOO;
        }
        this.f4848OooO0Oo.setTextSize(f);
        OooO0O0(Float.isNaN(this.f4856OooOOO) ? 1.0f : this.f4857OooOOO0 / this.f4856OooOOO);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f4881Oooo0OO = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f4883Oooo0o0 = f;
        OooO0Oo();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.f4848OooO0Oo;
        if (textPaint.getTypeface() != typeface) {
            textPaint.setTypeface(typeface);
        }
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4848OooO0Oo = new TextPaint();
        this.f4850OooO0o0 = new Path();
        this.f4849OooO0o = 65535;
        this.f4851OooO0oO = 65535;
        this.f4852OooO0oo = false;
        this.f4847OooO = 0.0f;
        this.f4853OooOO0 = Float.NaN;
        this.f4857OooOOO0 = 48.0f;
        this.f4856OooOOO = Float.NaN;
        this.f4861OooOOo0 = 0.0f;
        this.f4860OooOOo = "Hello World";
        this.f4862OooOOoo = true;
        this.f4865OooOo00 = new Rect();
        this.f4864OooOo0 = 1;
        this.f4866OooOo0O = 1;
        this.f4867OooOo0o = 1;
        this.f4863OooOo = 1;
        this.f4868OooOoO = 8388659;
        this.f4870OooOoOO = 0;
        this.f4872OooOoo0 = false;
        this.f4881Oooo0OO = Float.NaN;
        this.f4883Oooo0o0 = Float.NaN;
        this.f4882Oooo0o = 0.0f;
        this.f4884Oooo0oO = 0.0f;
        this.f4885Oooo0oo = new Paint();
        this.f4875Oooo = 0;
        this.f4886OoooO = Float.NaN;
        this.f4890OoooOO0 = Float.NaN;
        this.f4892o000oOoO = Float.NaN;
        this.f4891OoooOOO = Float.NaN;
        OooO0OO(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4848OooO0Oo = new TextPaint();
        this.f4850OooO0o0 = new Path();
        this.f4849OooO0o = 65535;
        this.f4851OooO0oO = 65535;
        this.f4852OooO0oo = false;
        this.f4847OooO = 0.0f;
        this.f4853OooOO0 = Float.NaN;
        this.f4857OooOOO0 = 48.0f;
        this.f4856OooOOO = Float.NaN;
        this.f4861OooOOo0 = 0.0f;
        this.f4860OooOOo = "Hello World";
        this.f4862OooOOoo = true;
        this.f4865OooOo00 = new Rect();
        this.f4864OooOo0 = 1;
        this.f4866OooOo0O = 1;
        this.f4867OooOo0o = 1;
        this.f4863OooOo = 1;
        this.f4868OooOoO = 8388659;
        this.f4870OooOoOO = 0;
        this.f4872OooOoo0 = false;
        this.f4881Oooo0OO = Float.NaN;
        this.f4883Oooo0o0 = Float.NaN;
        this.f4882Oooo0o = 0.0f;
        this.f4884Oooo0oO = 0.0f;
        this.f4885Oooo0oo = new Paint();
        this.f4875Oooo = 0;
        this.f4886OoooO = Float.NaN;
        this.f4890OoooOO0 = Float.NaN;
        this.f4892o000oOoO = Float.NaN;
        this.f4891OoooOOO = Float.NaN;
        OooO0OO(context, attributeSet);
    }
}
