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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p060o0000o.OooO;
import p060o0000o.OooOO0O;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements OooOO0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f7422Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextPaint f7423Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Path f7424Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f7425Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ViewOutlineProvider f7426OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f7427OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f7428OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f7429OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public RectF f7430OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f7431OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f7432OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f7433OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f7434OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public String f7435OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f7436Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public Rect f7437Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f7438OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f7439OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f7440OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public String f7441Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f7442Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f7443OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f7444Ooooooo;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public float f7445o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public float f7446o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public float f7447o000000o;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public float f7448o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f7449o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public float f7450o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public float f7451o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public Drawable f7452o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public Matrix f7453o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public float f7454o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public Matrix f7455o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public Bitmap f7456o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public float f7457o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public Rect f7458o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public Paint f7459o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f7460o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f7461o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public float f7462o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public float f7463o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public float f7464o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public BitmapShader f7465oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public Paint f7466oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f7467ooOO;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f7427OoooO0) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f7429OoooO0O);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f7423Oooo0o = new TextPaint();
        this.f7424Oooo0oO = new Path();
        this.f7425Oooo0oo = 65535;
        this.f7422Oooo = 65535;
        this.f7428OoooO00 = false;
        this.f7427OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7429OoooO0O = Float.NaN;
        this.f7449o000oOoO = 48.0f;
        this.f7431OoooOOO = Float.NaN;
        this.f7434OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7435OoooOoo = "Hello World";
        this.f7436Ooooo00 = true;
        this.f7437Ooooo0o = new Rect();
        this.f7438OooooO0 = 1;
        this.f7439OooooOO = 1;
        this.f7440OooooOo = 1;
        this.f7442Oooooo0 = 1;
        this.f7443OoooooO = 8388659;
        this.f7444Ooooooo = 0;
        this.f7461o0OoOo0 = false;
        this.f7454o00oO0O = Float.NaN;
        this.f7462o0ooOO0 = Float.NaN;
        this.f7463o0ooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7464o0ooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7459o0OOO0o = new Paint();
        this.f7460o0Oo0oo = 0;
        this.f7448o000OOo = Float.NaN;
        this.f7445o000000 = Float.NaN;
        this.f7446o000000O = Float.NaN;
        this.f7447o000000o = Float.NaN;
        OooO0OO(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.f7431OoooOOO) ? 1.0f : this.f7449o000oOoO / this.f7431OoooOOO;
        TextPaint textPaint = this.f7423Oooo0o;
        String str = this.f7435OoooOoo;
        return ((this.f7463o0ooOOo + 1.0f) * ((((Float.isNaN(this.f7450o00O0O) ? getMeasuredWidth() : this.f7450o00O0O) - getPaddingLeft()) - getPaddingRight()) - (textPaint.measureText(str, 0, str.length()) * f))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.f7431OoooOOO) ? 1.0f : this.f7449o000oOoO / this.f7431OoooOOO;
        Paint.FontMetrics fontMetrics = this.f7423Oooo0o.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f7451o00Oo0) ? getMeasuredHeight() : this.f7451o00Oo0) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((1.0f - this.f7464o0ooOoO) * (measuredHeight - ((f2 - f3) * f))) / 2.0f) - (f * f3);
    }

    @Override // p060o0000o.OooOO0O
    public final void OooO00o(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f7467ooOO = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.f7450o00O0O = f5;
        float f6 = f4 - f2;
        this.f7451o00Oo0 = f6;
        if (this.f7455o00oO0o != null) {
            this.f7450o00O0O = f5;
            this.f7451o00Oo0 = f6;
            OooO0Oo();
        }
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f7461o0OoOo0) {
            if (this.f7458o0OO00O == null) {
                this.f7466oo0o0Oo = new Paint();
                this.f7458o0OO00O = new Rect();
                this.f7466oo0o0Oo.set(this.f7423Oooo0o);
                this.f7457o0O0O00 = this.f7466oo0o0Oo.getTextSize();
            }
            this.f7450o00O0O = f5;
            this.f7451o00Oo0 = f6;
            Paint paint = this.f7466oo0o0Oo;
            String str = this.f7435OoooOoo;
            paint.getTextBounds(str, 0, str.length(), this.f7458o0OO00O);
            int iWidth = this.f7458o0OO00O.width();
            float fHeight = this.f7458o0OO00O.height() * 1.3f;
            float f7 = (f5 - this.f7439OooooOO) - this.f7438OooooO0;
            float f8 = (f6 - this.f7442Oooooo0) - this.f7440OooooOo;
            float f9 = iWidth;
            if (f9 * f8 > fHeight * f7) {
                this.f7423Oooo0o.setTextSize((this.f7457o0O0O00 * f7) / f9);
            } else {
                this.f7423Oooo0o.setTextSize((this.f7457o0O0O00 * f8) / fHeight);
            }
            if (this.f7428OoooO00 || !Float.isNaN(this.f7431OoooOOO)) {
                OooO0O0(Float.isNaN(this.f7431OoooOOO) ? 1.0f : this.f7449o000oOoO / this.f7431OoooOOO);
            }
        }
    }

    public final void OooO0O0(float f) {
        if (this.f7428OoooO00 || f != 1.0f) {
            this.f7424Oooo0oO.reset();
            String str = this.f7435OoooOoo;
            int length = str.length();
            this.f7423Oooo0o.getTextBounds(str, 0, length, this.f7437Ooooo0o);
            this.f7423Oooo0o.getTextPath(str, 0, length, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f7424Oooo0oO);
            if (f != 1.0f) {
                Log.v("MotionLabel", OooO.OooO00o() + " scale " + f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f7424Oooo0oO.transform(matrix);
            }
            Rect rect = this.f7437Ooooo0o;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f7436Ooooo00 = false;
        }
    }

    public final void OooO0OO(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(OooOo00.OooO00o.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f7423Oooo0o;
        int i = typedValue.data;
        this.f7425Oooo0oo = i;
        textPaint.setColor(i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == o000O00.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == o000O00.MotionLabel_android_fontFamily) {
                    this.f7441Oooooo = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == o000O00.MotionLabel_scaleFromTextSize) {
                    this.f7431OoooOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f7431OoooOOO);
                } else if (index == o000O00.MotionLabel_android_textSize) {
                    this.f7449o000oOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f7449o000oOoO);
                } else if (index == o000O00.MotionLabel_android_textStyle) {
                    this.f7432OoooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f7432OoooOOo);
                } else if (index == o000O00.MotionLabel_android_typeface) {
                    this.f7433OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, this.f7433OoooOo0);
                } else if (index == o000O00.MotionLabel_android_textColor) {
                    this.f7425Oooo0oo = typedArrayObtainStyledAttributes.getColor(index, this.f7425Oooo0oo);
                } else if (index == o000O00.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f7429OoooO0O);
                    this.f7429OoooO0O = dimension;
                    setRound(dimension);
                } else if (index == o000O00.MotionLabel_borderRoundPercent) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f7427OoooO0);
                    this.f7427OoooO0 = f;
                    setRoundPercent(f);
                } else if (index == o000O00.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == o000O00.MotionLabel_android_autoSizeTextType) {
                    this.f7444Ooooooo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.MotionLabel_textOutlineColor) {
                    this.f7422Oooo = typedArrayObtainStyledAttributes.getInt(index, this.f7422Oooo);
                    this.f7428OoooO00 = true;
                } else if (index == o000O00.MotionLabel_textOutlineThickness) {
                    this.f7434OoooOoO = typedArrayObtainStyledAttributes.getDimension(index, this.f7434OoooOoO);
                    this.f7428OoooO00 = true;
                } else if (index == o000O00.MotionLabel_textBackground) {
                    this.f7452o00Ooo = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f7428OoooO00 = true;
                } else if (index == o000O00.MotionLabel_textBackgroundPanX) {
                    this.f7448o000OOo = typedArrayObtainStyledAttributes.getFloat(index, this.f7448o000OOo);
                } else if (index == o000O00.MotionLabel_textBackgroundPanY) {
                    this.f7445o000000 = typedArrayObtainStyledAttributes.getFloat(index, this.f7445o000000);
                } else if (index == o000O00.MotionLabel_textPanX) {
                    this.f7463o0ooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f7463o0ooOOo);
                } else if (index == o000O00.MotionLabel_textPanY) {
                    this.f7464o0ooOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f7464o0ooOoO);
                } else if (index == o000O00.MotionLabel_textBackgroundRotate) {
                    this.f7447o000000o = typedArrayObtainStyledAttributes.getFloat(index, this.f7447o000000o);
                } else if (index == o000O00.MotionLabel_textBackgroundZoom) {
                    this.f7446o000000O = typedArrayObtainStyledAttributes.getFloat(index, this.f7446o000000O);
                } else if (index == o000O00.MotionLabel_textureHeight) {
                    this.f7454o00oO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f7454o00oO0O);
                } else if (index == o000O00.MotionLabel_textureWidth) {
                    this.f7462o0ooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f7462o0ooOO0);
                } else if (index == o000O00.MotionLabel_textureEffect) {
                    this.f7460o0Oo0oo = typedArrayObtainStyledAttributes.getInt(index, this.f7460o0Oo0oo);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f7452o00Ooo != null) {
            this.f7455o00oO0o = new Matrix();
            int intrinsicWidth = this.f7452o00Ooo.getIntrinsicWidth();
            int intrinsicHeight = this.f7452o00Ooo.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f7462o0ooOO0) ? 128 : (int) this.f7462o0ooOO0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f7454o00oO0O) ? 128 : (int) this.f7454o00oO0O;
            }
            if (this.f7460o0Oo0oo != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f7456o00ooo = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f7456o00ooo);
            this.f7452o00Ooo.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f7452o00Ooo.setFilterBitmap(true);
            this.f7452o00Ooo.draw(canvas);
            if (this.f7460o0Oo0oo != 0) {
                Bitmap bitmap = this.f7456o00ooo;
                System.nanoTime();
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i3 = 0; i3 < 4 && width >= 32 && height >= 32; i3++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.f7456o00ooo = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.f7456o00ooo;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f7465oo000o = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f7438OooooO0 = getPaddingLeft();
        this.f7439OooooOO = getPaddingRight();
        this.f7440OooooOo = getPaddingTop();
        this.f7442Oooooo0 = getPaddingBottom();
        String str = this.f7441Oooooo;
        int i4 = this.f7433OoooOo0;
        int i5 = this.f7432OoooOOo;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i5);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            this.f7423Oooo0o.setColor(this.f7425Oooo0oo);
            this.f7423Oooo0o.setStrokeWidth(this.f7434OoooOoO);
            this.f7423Oooo0o.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f7423Oooo0o.setFlags(128);
            setTextSize(this.f7449o000oOoO);
            this.f7423Oooo0o.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i4 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i4 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i4 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (i5 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typefaceCreate, i5);
            setTypeface(typefaceDefaultFromStyle);
            int i6 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i5;
            this.f7423Oooo0o.setFakeBoldText((i6 & 1) != 0);
            TextPaint textPaint2 = this.f7423Oooo0o;
            if ((i6 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
        } else {
            this.f7423Oooo0o.setFakeBoldText(false);
            this.f7423Oooo0o.setTextSkewX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            setTypeface(typefaceCreate);
        }
        this.f7423Oooo0o.setColor(this.f7425Oooo0oo);
        this.f7423Oooo0o.setStrokeWidth(this.f7434OoooOoO);
        this.f7423Oooo0o.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7423Oooo0o.setFlags(128);
        setTextSize(this.f7449o000oOoO);
        this.f7423Oooo0o.setAntiAlias(true);
    }

    public final void OooO0Oo() {
        boolean zIsNaN = Float.isNaN(this.f7448o000OOo);
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f2 = zIsNaN ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f7448o000OOo;
        float f3 = Float.isNaN(this.f7445o000000) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f7445o000000;
        float f4 = Float.isNaN(this.f7446o000000O) ? 1.0f : this.f7446o000000O;
        if (!Float.isNaN(this.f7447o000000o)) {
            f = this.f7447o000000o;
        }
        this.f7455o00oO0o.reset();
        float width = this.f7456o00ooo.getWidth();
        float height = this.f7456o00ooo.getHeight();
        float f5 = Float.isNaN(this.f7462o0ooOO0) ? this.f7450o00O0O : this.f7462o0ooOO0;
        float f6 = Float.isNaN(this.f7454o00oO0O) ? this.f7451o00Oo0 : this.f7454o00oO0O;
        float f7 = f4 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.f7455o00oO0o.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.f7454o00oO0O)) {
            f11 = this.f7454o00oO0O / 2.0f;
        }
        if (!Float.isNaN(this.f7462o0ooOO0)) {
            f9 = this.f7462o0ooOO0 / 2.0f;
        }
        this.f7455o00oO0o.postTranslate((((f2 * f9) + f5) - f8) * 0.5f, (((f3 * f11) + f6) - f10) * 0.5f);
        this.f7455o00oO0o.postRotate(f, f5 / 2.0f, f6 / 2.0f);
        this.f7465oo000o.setLocalMatrix(this.f7455o00oO0o);
    }

    public float getRound() {
        return this.f7429OoooO0O;
    }

    public float getRoundPercent() {
        return this.f7427OoooO0;
    }

    public float getScaleFromTextSize() {
        return this.f7431OoooOOO;
    }

    public float getTextBackgroundPanX() {
        return this.f7448o000OOo;
    }

    public float getTextBackgroundPanY() {
        return this.f7445o000000;
    }

    public float getTextBackgroundRotate() {
        return this.f7447o000000o;
    }

    public float getTextBackgroundZoom() {
        return this.f7446o000000O;
    }

    public int getTextOutlineColor() {
        return this.f7422Oooo;
    }

    public float getTextPanX() {
        return this.f7463o0ooOOo;
    }

    public float getTextPanY() {
        return this.f7464o0ooOoO;
    }

    public float getTextureHeight() {
        return this.f7454o00oO0O;
    }

    public float getTextureWidth() {
        return this.f7462o0ooOO0;
    }

    public Typeface getTypeface() {
        return this.f7423Oooo0o.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f7431OoooOOO);
        float f = zIsNaN ? 1.0f : this.f7449o000oOoO / this.f7431OoooOOO;
        this.f7450o00O0O = i3 - i;
        this.f7451o00Oo0 = i4 - i2;
        if (this.f7461o0OoOo0) {
            if (this.f7458o0OO00O == null) {
                this.f7466oo0o0Oo = new Paint();
                this.f7458o0OO00O = new Rect();
                this.f7466oo0o0Oo.set(this.f7423Oooo0o);
                this.f7457o0O0O00 = this.f7466oo0o0Oo.getTextSize();
            }
            Paint paint = this.f7466oo0o0Oo;
            String str = this.f7435OoooOoo;
            paint.getTextBounds(str, 0, str.length(), this.f7458o0OO00O);
            int iWidth = this.f7458o0OO00O.width();
            int iHeight = (int) (this.f7458o0OO00O.height() * 1.3f);
            float f2 = (this.f7450o00O0O - this.f7439OooooOO) - this.f7438OooooO0;
            float f3 = (this.f7451o00Oo0 - this.f7442Oooooo0) - this.f7440OooooOo;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    this.f7423Oooo0o.setTextSize((this.f7457o0O0O00 * f2) / f4);
                } else {
                    this.f7423Oooo0o.setTextSize((this.f7457o0O0O00 * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f7428OoooO00 || !zIsNaN) {
            float f8 = i;
            float f9 = i2;
            float f10 = i3;
            float f11 = i4;
            if (this.f7455o00oO0o != null) {
                this.f7450o00O0O = f10 - f8;
                this.f7451o00Oo0 = f11 - f9;
                OooO0Oo();
            }
            OooO0O0(f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f7431OoooOOO) ? 1.0f : this.f7449o000oOoO / this.f7431OoooOOO;
        super.onDraw(canvas);
        if (!this.f7428OoooO00 && f == 1.0f) {
            canvas.drawText(this.f7435OoooOoo, this.f7467ooOO + this.f7438OooooO0 + getHorizontalOffset(), this.f7440OooooOo + getVerticalOffset(), this.f7423Oooo0o);
            return;
        }
        if (this.f7436Ooooo00) {
            OooO0O0(f);
        }
        if (this.f7453o00o0O == null) {
            this.f7453o00o0O = new Matrix();
        }
        if (!this.f7428OoooO00) {
            float horizontalOffset = this.f7438OooooO0 + getHorizontalOffset();
            float verticalOffset = this.f7440OooooOo + getVerticalOffset();
            this.f7453o00o0O.reset();
            this.f7453o00o0O.preTranslate(horizontalOffset, verticalOffset);
            this.f7424Oooo0oO.transform(this.f7453o00o0O);
            this.f7423Oooo0o.setColor(this.f7425Oooo0oo);
            this.f7423Oooo0o.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f7423Oooo0o.setStrokeWidth(this.f7434OoooOoO);
            canvas.drawPath(this.f7424Oooo0oO, this.f7423Oooo0o);
            this.f7453o00o0O.reset();
            this.f7453o00o0O.preTranslate(-horizontalOffset, -verticalOffset);
            this.f7424Oooo0oO.transform(this.f7453o00o0O);
            return;
        }
        this.f7459o0OOO0o.set(this.f7423Oooo0o);
        this.f7453o00o0O.reset();
        float horizontalOffset2 = this.f7438OooooO0 + getHorizontalOffset();
        float verticalOffset2 = this.f7440OooooOo + getVerticalOffset();
        this.f7453o00o0O.postTranslate(horizontalOffset2, verticalOffset2);
        this.f7453o00o0O.preScale(f, f);
        this.f7424Oooo0oO.transform(this.f7453o00o0O);
        if (this.f7465oo000o != null) {
            this.f7423Oooo0o.setFilterBitmap(true);
            this.f7423Oooo0o.setShader(this.f7465oo000o);
        } else {
            this.f7423Oooo0o.setColor(this.f7425Oooo0oo);
        }
        this.f7423Oooo0o.setStyle(Paint.Style.FILL);
        this.f7423Oooo0o.setStrokeWidth(this.f7434OoooOoO);
        canvas.drawPath(this.f7424Oooo0oO, this.f7423Oooo0o);
        if (this.f7465oo000o != null) {
            this.f7423Oooo0o.setShader(null);
        }
        this.f7423Oooo0o.setColor(this.f7422Oooo);
        this.f7423Oooo0o.setStyle(Paint.Style.STROKE);
        this.f7423Oooo0o.setStrokeWidth(this.f7434OoooOoO);
        canvas.drawPath(this.f7424Oooo0oO, this.f7423Oooo0o);
        this.f7453o00o0O.reset();
        this.f7453o00o0O.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f7424Oooo0oO.transform(this.f7453o00o0O);
        this.f7423Oooo0o.set(this.f7459o0OOO0o);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f7461o0OoOo0 = false;
        this.f7438OooooO0 = getPaddingLeft();
        this.f7439OooooOO = getPaddingRight();
        this.f7440OooooOo = getPaddingTop();
        this.f7442Oooooo0 = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f7423Oooo0o;
            String str = this.f7435OoooOoo;
            textPaint.getTextBounds(str, 0, str.length(), this.f7437Ooooo0o);
            if (mode != 1073741824) {
                size = (int) (this.f7437Ooooo0o.width() + 0.99999f);
            }
            size += this.f7438OooooO0 + this.f7439OooooOO;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f7423Oooo0o.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f7440OooooOo + this.f7442Oooooo0 + fontMetricsInt;
            }
        } else if (this.f7444Ooooooo != 0) {
            this.f7461o0OoOo0 = true;
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
        if (i != this.f7443OoooooO) {
            invalidate();
        }
        this.f7443OoooooO = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f7464o0ooOoO = -1.0f;
        } else if (i2 != 80) {
            this.f7464o0ooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            this.f7464o0ooOoO = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f7463o0ooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        return;
                    }
                }
            }
            this.f7463o0ooOOo = 1.0f;
            return;
        }
        this.f7463o0ooOOo = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f7429OoooO0O = f;
            float f2 = this.f7427OoooO0;
            this.f7427OoooO0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f7429OoooO0O != f;
        this.f7429OoooO0O = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7424Oooo0oO == null) {
                this.f7424Oooo0oO = new Path();
            }
            if (this.f7430OoooOO0 == null) {
                this.f7430OoooOO0 = new RectF();
            }
            if (this.f7426OoooO == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f7426OoooO = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f7430OoooOO0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
            this.f7424Oooo0oO.reset();
            Path path = this.f7424Oooo0oO;
            RectF rectF = this.f7430OoooOO0;
            float f3 = this.f7429OoooO0O;
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
        boolean z = this.f7427OoooO0 != f;
        this.f7427OoooO0 = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7424Oooo0oO == null) {
                this.f7424Oooo0oO = new Path();
            }
            if (this.f7430OoooOO0 == null) {
                this.f7430OoooOO0 = new RectF();
            }
            if (this.f7426OoooO == null) {
                OooO00o oooO00o = new OooO00o();
                this.f7426OoooO = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f7427OoooO0) / 2.0f;
            this.f7430OoooOO0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width, height);
            this.f7424Oooo0oO.reset();
            this.f7424Oooo0oO.addRoundRect(this.f7430OoooOO0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f7431OoooOOO = f;
    }

    public void setText(CharSequence charSequence) {
        this.f7435OoooOoo = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f7448o000OOo = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f7445o000000 = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f7447o000000o = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f7446o000000O = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f7425Oooo0oo = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f7422Oooo = i;
        this.f7428OoooO00 = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f7434OoooOoO = f;
        this.f7428OoooO00 = true;
        if (Float.isNaN(f)) {
            this.f7434OoooOoO = 1.0f;
            this.f7428OoooO00 = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f7463o0ooOOo = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f7464o0ooOoO = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f7449o000oOoO = f;
        Log.v("MotionLabel", OooO.OooO00o() + "  " + f + " / " + this.f7431OoooOOO);
        TextPaint textPaint = this.f7423Oooo0o;
        if (!Float.isNaN(this.f7431OoooOOO)) {
            f = this.f7431OoooOOO;
        }
        textPaint.setTextSize(f);
        OooO0O0(Float.isNaN(this.f7431OoooOOO) ? 1.0f : this.f7449o000oOoO / this.f7431OoooOOO);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f7454o00oO0O = f;
        OooO0Oo();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f7462o0ooOO0 = f;
        OooO0Oo();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f7423Oooo0o.getTypeface() != typeface) {
            this.f7423Oooo0o.setTypeface(typeface);
        }
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7423Oooo0o = new TextPaint();
        this.f7424Oooo0oO = new Path();
        this.f7425Oooo0oo = 65535;
        this.f7422Oooo = 65535;
        this.f7428OoooO00 = false;
        this.f7427OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7429OoooO0O = Float.NaN;
        this.f7449o000oOoO = 48.0f;
        this.f7431OoooOOO = Float.NaN;
        this.f7434OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7435OoooOoo = "Hello World";
        this.f7436Ooooo00 = true;
        this.f7437Ooooo0o = new Rect();
        this.f7438OooooO0 = 1;
        this.f7439OooooOO = 1;
        this.f7440OooooOo = 1;
        this.f7442Oooooo0 = 1;
        this.f7443OoooooO = 8388659;
        this.f7444Ooooooo = 0;
        this.f7461o0OoOo0 = false;
        this.f7454o00oO0O = Float.NaN;
        this.f7462o0ooOO0 = Float.NaN;
        this.f7463o0ooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7464o0ooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7459o0OOO0o = new Paint();
        this.f7460o0Oo0oo = 0;
        this.f7448o000OOo = Float.NaN;
        this.f7445o000000 = Float.NaN;
        this.f7446o000000O = Float.NaN;
        this.f7447o000000o = Float.NaN;
        OooO0OO(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7423Oooo0o = new TextPaint();
        this.f7424Oooo0oO = new Path();
        this.f7425Oooo0oo = 65535;
        this.f7422Oooo = 65535;
        this.f7428OoooO00 = false;
        this.f7427OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7429OoooO0O = Float.NaN;
        this.f7449o000oOoO = 48.0f;
        this.f7431OoooOOO = Float.NaN;
        this.f7434OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7435OoooOoo = "Hello World";
        this.f7436Ooooo00 = true;
        this.f7437Ooooo0o = new Rect();
        this.f7438OooooO0 = 1;
        this.f7439OooooOO = 1;
        this.f7440OooooOo = 1;
        this.f7442Oooooo0 = 1;
        this.f7443OoooooO = 8388659;
        this.f7444Ooooooo = 0;
        this.f7461o0OoOo0 = false;
        this.f7454o00oO0O = Float.NaN;
        this.f7462o0ooOO0 = Float.NaN;
        this.f7463o0ooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7464o0ooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7459o0OOO0o = new Paint();
        this.f7460o0Oo0oo = 0;
        this.f7448o000OOo = Float.NaN;
        this.f7445o000000 = Float.NaN;
        this.f7446o000000O = Float.NaN;
        this.f7447o000000o = Float.NaN;
        OooO0OO(context, attributeSet);
    }
}
