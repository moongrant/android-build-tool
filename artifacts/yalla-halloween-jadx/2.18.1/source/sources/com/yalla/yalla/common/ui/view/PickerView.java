package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import p444o0OoOo0O.o0O0OO0;
import p508o0o00oOo.o0000OO0;
import p516o0o0O000.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public class PickerView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Paint f20961Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f20962Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f20963Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO00o<Object> f20964Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f20965OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public GestureDetector f20966OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Rect f20967OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OverScroller f20968OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f20969OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f20970OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f20971OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f20972OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f20973OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f20974OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f20975Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f20976Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f20977OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f20978OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f20979OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public Typeface f20980Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f20981Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f20982OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f20983Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f20984o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public GradientDrawable f20985o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public GradientDrawable f20986o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final Layout.Alignment f20987o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public float f20988o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public OooO0O0 f20989o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f20990o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public Camera f20991o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f20992o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public Matrix f20993oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public Drawable f20994ooOO;

    public static abstract class OooO00o<T> {
        public abstract int OooO00o();

        public final String OooO0O0(int i) {
            return i + ZegoConstants.ZegoVideoDataAuxPublishingStream + "";
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    public PickerView(Context context) {
        this(context, null);
    }

    public final int OooO00o(int i) {
        if (this.f20964Oooo0oo.OooO00o() == 0) {
            return 0;
        }
        if (this.f20982OoooooO) {
            if (i < 0) {
                i %= this.f20964Oooo0oo.OooO00o();
                if (i != 0) {
                    i += this.f20964Oooo0oo.OooO00o();
                }
            } else if (i >= this.f20964Oooo0oo.OooO00o()) {
                i %= this.f20964Oooo0oo.OooO00o();
            }
        }
        if (i < 0) {
            return 0;
        }
        return i >= this.f20964Oooo0oo.OooO00o() ? this.f20964Oooo0oo.OooO00o() - 1 : i;
    }

    public final void OooO0O0(Canvas canvas, String str, float f) {
        this.f20961Oooo.setTextSize(this.f20979OooooOo);
        this.f20961Oooo.setColor(this.f20981Oooooo0);
        this.f20961Oooo.getTextBounds(str, 0, str.length(), this.f20967OoooO00);
        if (this.f20983Ooooooo) {
            while (getMeasuredWidth() < this.f20967OoooO00.width() && this.f20961Oooo.getTextSize() > 16.0f) {
                Paint paint = this.f20961Oooo;
                paint.setTextSize(paint.getTextSize() - 1.0f);
                this.f20961Oooo.getTextBounds(str, 0, str.length(), this.f20967OoooO00);
            }
        }
        float fHeight = ((this.f20967OoooO00.height() + this.f20978OooooOO) / 2) + f;
        if (this.f20992o0OoOo0) {
            float f2 = 2.0f / this.f20962Oooo0o;
            float f3 = this.f20988o00o0O;
            double dAtan = Math.atan((f3 - (f + (this.f20978OooooOO / 2))) / f3) * ((double) f2);
            this.f20991o00ooo.save();
            this.f20991o00ooo.rotateX((float) ((180.0d * dAtan) / 3.141592653589793d));
            this.f20991o00ooo.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -Math.abs((this.f20988o00o0O / (this.f20962Oooo0o + 2)) * ((float) Math.sin(dAtan))));
            this.f20991o00ooo.getMatrix(this.f20993oo000o);
            this.f20993oo000o.preTranslate((-getMeasuredWidth()) / 2, (-getMeasuredHeight()) / 2);
            this.f20993oo000o.postTranslate(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            canvas.save();
            canvas.concat(this.f20993oo000o);
        }
        Layout.Alignment alignment = this.f20987o00Ooo;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            this.f20961Oooo.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, getMeasuredWidth() / 2, fHeight, this.f20961Oooo);
        } else if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
            this.f20961Oooo.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(str, getMeasuredWidth(), fHeight, this.f20961Oooo);
        } else {
            this.f20961Oooo.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(str, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fHeight, this.f20961Oooo);
        }
        if (this.f20992o0OoOo0) {
            canvas.restore();
            this.f20991o00ooo.restore();
        }
    }

    public final void OooO0OO(int i) {
        int i2 = this.f20973OoooOoO + i;
        this.f20973OoooOoO = i2;
        if (Math.abs(i2) >= this.f20978OooooOO) {
            int i3 = this.f20963Oooo0oO;
            if ((i3 != 0 || i < 0) && (i3 != this.f20964Oooo0oo.OooO00o() - 1 || i > 0)) {
                int i4 = this.f20963Oooo0oO;
                OooO0o0(i4 - (this.f20973OoooOoO / this.f20978OooooOO));
                this.f20973OoooOoO -= (i4 - this.f20963Oooo0oO) * this.f20978OooooOO;
                return;
            }
            int iAbs = Math.abs(this.f20973OoooOoO);
            int i5 = this.f20976Ooooo0o;
            if (iAbs > i5) {
                if (this.f20973OoooOoO <= 0) {
                    i5 = -i5;
                }
                this.f20973OoooOoO = i5;
            }
        }
    }

    public final void OooO0Oo(int i) {
        int i2;
        int i3;
        int i4 = this.f20973OoooOoO;
        if (i4 != 0) {
            int i5 = -i4;
            int i6 = this.f20963Oooo0oO;
            if (i6 != 0 && i6 != this.f20964Oooo0oo.OooO00o() - 1) {
                int i7 = this.f20973OoooOoO;
                if (i7 > 0) {
                    int i8 = this.f20978OooooOO;
                    if (i7 > i8 / 3) {
                        i5 = i8 - i7;
                    }
                } else {
                    int iAbs = Math.abs(i7);
                    int i9 = this.f20978OooooOO;
                    if (iAbs > i9 / 3) {
                        i5 = -(i9 + this.f20973OoooOoO);
                    }
                }
            }
            if (this.f20964Oooo0oo.OooO00o() > 1) {
                if (this.f20963Oooo0oO == 0 && (i3 = this.f20973OoooOoO) < 0) {
                    int iAbs2 = Math.abs(i3);
                    int i10 = this.f20978OooooOO;
                    if (iAbs2 > i10 / 3) {
                        i5 = -(i10 + this.f20973OoooOoO);
                    }
                }
                if (this.f20963Oooo0oO == this.f20964Oooo0oo.OooO00o() - 1 && (i2 = this.f20973OoooOoO) > 0) {
                    int i11 = this.f20978OooooOO;
                    if (i2 > i11 / 3) {
                        i5 = i11 - i2;
                    }
                }
            }
            int i12 = this.f20973OoooOoO - (this.f20978OooooOO * this.f20963Oooo0oO);
            this.f20972OoooOo0 = i12;
            this.f20968OoooO0O.startScroll(0, i12, 0, i5, i);
            invalidate();
        }
        this.f20969OoooOO0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    public final void OooO0o0(int i) {
        boolean z;
        OooO0O0 oooO0O0;
        int iOooO00o = OooO00o(i);
        if (this.f20982OoooooO) {
            if (this.f20963Oooo0oO != i) {
                this.f20963Oooo0oO = i;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f20963Oooo0oO != iOooO00o) {
            this.f20963Oooo0oO = iOooO00o;
            z = true;
        } else {
            z = false;
        }
        if (!z || (oooO0O0 = this.f20989o00oO0O) == null) {
            return;
        }
        oooO0O0.OooO00o();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!this.f20968OoooO0O.computeScrollOffset()) {
            if (this.f20969OoooOO0) {
                OooO0Oo(SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            }
        } else {
            int currY = this.f20968OoooO0O.getCurrY();
            OooO0OO(currY - this.f20972OoooOo0);
            this.f20972OoooOo0 = currY;
            invalidate();
        }
    }

    public OooO00o getAdapter() {
        return this.f20964Oooo0oo;
    }

    public int getIndex() {
        return this.f20990o00oO0o;
    }

    public int getMaxCount() {
        return Integer.MAX_VALUE / this.f20978OooooOO;
    }

    public int getSelectedItemPosition() {
        return OooO00o(this.f20963Oooo0oO);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        OooO00o<Object> oooO00o = this.f20964Oooo0oo;
        Object obj = o000OOo.f42073OooO00o;
        Objects.requireNonNull(oooO00o, "adapter == null");
        if (this.f20964Oooo0oo.OooO00o() == 0 || this.f20978OooooOO == 0) {
            return;
        }
        if (!isInEditMode()) {
            this.f20994ooOO.setBounds(0, (getMeasuredHeight() - this.f20978OooooOO) / 2, getMeasuredWidth(), (getMeasuredHeight() + this.f20978OooooOO) / 2);
            this.f20994ooOO.draw(canvas);
        }
        float measuredHeight = ((getMeasuredHeight() - this.f20978OooooOO) / 2) + this.f20973OoooOoO;
        OooO0O0(canvas, this.f20964Oooo0oo.OooO0O0(OooO00o(this.f20963Oooo0oO)), measuredHeight);
        float f = measuredHeight - this.f20978OooooOO;
        int i = this.f20963Oooo0oO - 1;
        while (true) {
            if ((this.f20978OooooOO * (this.f20992o0OoOo0 ? 2 : 1)) + f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if ((i < 0 || i >= this.f20964Oooo0oo.OooO00o()) && !this.f20982OoooooO) {
                    break;
                }
                OooO0O0(canvas, this.f20964Oooo0oo.OooO0O0(OooO00o(i)), f);
                f -= this.f20978OooooOO;
                i--;
            } else {
                break;
            }
        }
        float measuredHeight2 = ((getMeasuredHeight() + this.f20978OooooOO) / 2) + this.f20973OoooOoO;
        int i2 = this.f20963Oooo0oO + 1;
        while (measuredHeight2 - (this.f20978OooooOO * (this.f20992o0OoOo0 ? 1 : 0)) < getMeasuredHeight()) {
            if ((i2 < 0 || i2 >= this.f20964Oooo0oo.OooO00o()) && !this.f20982OoooooO) {
                break;
            }
            OooO0O0(canvas, this.f20964Oooo0oo.OooO0O0(OooO00o(i2)), measuredHeight2);
            measuredHeight2 += this.f20978OooooOO;
            i2++;
        }
        this.f20985o00O0O.setBounds(0, 0, getMeasuredWidth(), (getMeasuredHeight() - this.f20978OooooOO) / 2);
        this.f20985o00O0O.draw(canvas);
        this.f20986o00Oo0.setBounds(0, (getMeasuredHeight() + this.f20978OooooOO) / 2, getMeasuredWidth(), getMeasuredHeight());
        this.f20986o00Oo0.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iCeil;
        super.onMeasure(i, i2);
        OooO00o<Object> oooO00o = this.f20964Oooo0oo;
        Object obj = o000OOo.f42073OooO00o;
        Objects.requireNonNull(oooO00o, "adapter == null");
        if (this.f20992o0OoOo0) {
            float fSin = this.f20978OooooOO / ((float) Math.sin(3.141592653589793d / ((double) ((this.f20962Oooo0o * 2) + 3))));
            this.f20988o00o0O = fSin;
            iCeil = (int) Math.ceil(fSin * 2.0f);
        } else {
            iCeil = ((this.f20962Oooo0o * 2) + 1) * this.f20978OooooOO;
        }
        int iResolveSizeAndState = View.resolveSizeAndState(iCeil, i2, 0);
        if (this.f20982OoooooO) {
            this.f20974OoooOoo = Integer.MIN_VALUE;
            this.f20975Ooooo00 = Integer.MAX_VALUE;
        } else {
            this.f20974OoooOoo = (-(this.f20964Oooo0oo.OooO00o() - 1)) * this.f20978OooooOO;
            this.f20975Ooooo00 = 0;
        }
        this.f20976Ooooo0o = this.f20978OooooOO * 2;
        setMeasuredDimension(i, iResolveSizeAndState);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[PHI: r9
      0x00b1: PHI (r9v20 int) = (r9v19 int), (r9v24 int) binds: [B:38:0x00ae, B:35:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.f20966OoooO0.onTouchEvent(motionEvent)) {
            invalidate();
            return true;
        }
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20969OoooOO0 = false;
            this.f20970OoooOOO = y;
            this.f20971OoooOOo = y;
            this.f20965OoooO = false;
            if (!this.f20968OoooO0O.isFinished()) {
                this.f20968OoooO0O.forceFinished(true);
                this.f20984o000oOoO = true;
            }
        } else if (action != 1) {
            if (action == 2 && (this.f20965OoooO || Math.abs(y - this.f20970OoooOOO) > this.f20977OooooO0)) {
                if (this.f20965OoooO) {
                    this.f20969OoooOO0 = false;
                    OooO0OO((int) (y - this.f20971OoooOOo));
                    this.f20971OoooOOo = y;
                } else {
                    this.f20965OoooO = true;
                    this.f20971OoooOOo = y;
                }
            }
        } else if (this.f20984o000oOoO || this.f20965OoooO || Math.abs(y - this.f20970OoooOOO) > this.f20977OooooO0) {
            this.f20965OoooO = false;
            this.f20984o000oOoO = false;
            OooO0OO((int) (y - this.f20971OoooOOo));
            OooO0Oo(SQLiteDatabase.MAX_SQL_CACHE_SIZE);
        } else {
            performClick();
            this.f20972OoooOo0 = this.f20973OoooOoO - (this.f20978OooooOO * this.f20963Oooo0oO);
            int measuredHeight = (getMeasuredHeight() - this.f20978OooooOO) / 2;
            int measuredHeight2 = getMeasuredHeight();
            int i2 = this.f20978OooooOO;
            int i3 = (measuredHeight2 + i2) / 2;
            float f = measuredHeight;
            if (y < f || y > i3) {
                if (y < f) {
                    i = ((((int) y) - i3) / i2) * i2;
                    if ((i / i2) + this.f20963Oooo0oO >= 0) {
                        this.f20968OoooO0O.startScroll(0, this.f20972OoooOo0, 0, -i, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
                    }
                } else {
                    i = ((((int) y) - measuredHeight) / i2) * i2;
                    if ((i / i2) + this.f20963Oooo0oO <= this.f20964Oooo0oo.OooO00o() - 1) {
                        this.f20968OoooO0O.startScroll(0, this.f20972OoooOo0, 0, -i, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
                    }
                }
            }
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public <T> void setAdapter(OooO00o<T> oooO00o) {
        Object obj = o000OOo.f42073OooO00o;
        Objects.requireNonNull(oooO00o, "adapter == null");
        if (oooO00o.OooO00o() > Integer.MAX_VALUE / this.f20978OooooOO) {
            throw new RuntimeException("getItemCount() is too large, max count can be PickerView.getMaxCount()");
        }
        new WeakReference(this);
        this.f20964Oooo0oo = oooO00o;
    }

    public void setAutoFitSize(boolean z) {
        if (this.f20983Ooooooo != z) {
            this.f20983Ooooooo = z;
            invalidate();
        }
    }

    public void setCurved(boolean z) {
        if (this.f20992o0OoOo0 != z) {
            this.f20992o0OoOo0 = z;
            invalidate();
            requestLayout();
        }
    }

    public void setCyclic(boolean z) {
        if (this.f20982OoooooO != z) {
            this.f20982OoooooO = z;
            invalidate();
        }
    }

    public void setIndex(int i) {
        this.f20990o00oO0o = i;
    }

    public void setItemHeight(int i) {
        if (this.f20978OooooOO != i) {
            this.f20978OooooOO = i;
            invalidate();
            requestLayout();
        }
    }

    public void setOnSelectedItemChangedListener(OooO0O0 oooO0O0) {
        this.f20989o00oO0O = oooO0O0;
    }

    public void setPreferredMaxOffsetItemCount(int i) {
        this.f20962Oooo0o = i;
    }

    public void setSelectedItemPosition(int i) {
        OooO00o<Object> oooO00o = this.f20964Oooo0oo;
        Object obj = o000OOo.f42073OooO00o;
        Objects.requireNonNull(oooO00o, "adapter must be set first");
        OooO0o0(i);
        invalidate();
    }

    public void setTextColor(int i) {
        if (this.f20981Oooooo0 != i) {
            this.f20981Oooooo0 = i;
            invalidate();
        }
    }

    public void setTextSize(int i) {
        if (this.f20979OooooOo != i) {
            this.f20979OooooOo = i;
            invalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (this.f20980Oooooo != typeface) {
            this.f20980Oooooo = typeface;
            this.f20961Oooo.setTypeface(typeface);
            invalidate();
        }
    }

    public PickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20962Oooo0o = 3;
        this.f20967OoooO00 = new Rect();
        this.f20981Oooooo0 = -16777216;
        int[] iArr = {-805635334, -1610941702, 1610283770};
        this.f20987o00Ooo = Layout.Alignment.ALIGN_CENTER;
        this.f20990o00oO0o = 0;
        new ArrayList();
        this.f20966OoooO0 = new GestureDetector(getContext(), new o0000OO0(this));
        this.f20968OoooO0O = new OverScroller(getContext());
        this.f20977OooooO0 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (isInEditMode()) {
            this.f20964Oooo0oo = new com.yalla.yalla.common.ui.view.OooO00o(this);
        } else {
            Context context2 = getContext();
            Object obj = o000OOo.f42073OooO00o;
            Intrinsics.checkNotNullParameter(context2, "context");
            this.f20994ooOO = context2.getDrawable(R.drawable.pickerview_selected_item);
        }
        this.f20985o00O0O = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        this.f20986o00Oo0 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0OO0.PickerView);
        int i2 = typedArrayObtainStyledAttributes.getInt(4, 3);
        this.f20962Oooo0o = i2;
        if (i2 <= 0) {
            this.f20962Oooo0o = 3;
        }
        Context c = getContext();
        Object obj2 = o000OOo.f42073OooO00o;
        Intrinsics.checkNotNullParameter(c, "c");
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24, c.getResources().getDisplayMetrics());
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iApplyDimension);
        this.f20978OooooOO = dimensionPixelSize;
        if (dimensionPixelSize <= 0) {
            this.f20978OooooOO = iApplyDimension;
        }
        Context c2 = getContext();
        Intrinsics.checkNotNullParameter(c2, "c");
        this.f20979OooooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) TypedValue.applyDimension(2, 14, c2.getResources().getDisplayMetrics()));
        this.f20981Oooooo0 = typedArrayObtainStyledAttributes.getColor(5, -16777216);
        this.f20982OoooooO = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.f20983Ooooooo = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f20992o0OoOo0 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f20961Oooo = paint;
        paint.setAntiAlias(true);
        this.f20991o00ooo = new Camera();
        this.f20993oo000o = new Matrix();
    }
}
