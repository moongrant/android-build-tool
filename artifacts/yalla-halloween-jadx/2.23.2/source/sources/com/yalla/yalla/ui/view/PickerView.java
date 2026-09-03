package com.yalla.yalla.ui.view;

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
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import p562o0oOo000.o00000;
import p562o0oOo000.o0Oo0oo;
import p587o0oOooOO.w0;
import p590o0oOooo0.h0;

/* JADX INFO: loaded from: classes4.dex */
public class PickerView extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public GestureDetector f30000OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f30001OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o<Object> f30002OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f30003OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Paint f30004OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Rect f30005OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OverScroller f30006OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f30007OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f30008OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f30009OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f30010OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f30011OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f30012OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f30013OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30014OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f30015OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f30016OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f30017OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f30018OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f30019OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f30020OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f30021OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Typeface f30022OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f30023OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Drawable f30024OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f30025OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public GradientDrawable f30026OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public GradientDrawable f30027OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public Matrix f30028Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Layout.Alignment f30029Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f30030Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Camera f30031Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f30032Oooo0O0;

    public static abstract class OooO00o<T> {
        public static String OooO0O0(int i) {
            return i + ZegoConstants.ZegoVideoDataAuxPublishingStream;
        }

        public abstract int OooO00o();
    }

    public interface OooO0O0 {
    }

    public PickerView(Context context) {
        this(context, null);
    }

    public final int OooO00o(int i) {
        if (this.f30002OooO0o.OooO00o() == 0) {
            return 0;
        }
        if (this.f30021OooOoO) {
            if (i < 0) {
                i %= this.f30002OooO0o.OooO00o();
                if (i != 0) {
                    i += this.f30002OooO0o.OooO00o();
                }
            } else if (i >= this.f30002OooO0o.OooO00o()) {
                i %= this.f30002OooO0o.OooO00o();
            }
        }
        if (i < 0) {
            return 0;
        }
        return i >= this.f30002OooO0o.OooO00o() ? this.f30002OooO0o.OooO00o() - 1 : i;
    }

    public final void OooO0O0(Canvas canvas, String str, float f) {
        this.f30004OooO0oO.setTextSize(this.f30020OooOo0o);
        this.f30004OooO0oO.setColor(this.f30016OooOo);
        Paint paint = this.f30004OooO0oO;
        int length = str.length();
        Rect rect = this.f30005OooO0oo;
        paint.getTextBounds(str, 0, length, rect);
        if (this.f30023OooOoOO) {
            while (getMeasuredWidth() < rect.width() && this.f30004OooO0oO.getTextSize() > 16.0f) {
                Paint paint2 = this.f30004OooO0oO;
                paint2.setTextSize(paint2.getTextSize() - 1.0f);
                this.f30004OooO0oO.getTextBounds(str, 0, str.length(), rect);
            }
        }
        float fHeight = ((rect.height() + this.f30019OooOo0O) / 2) + f;
        if (this.f30025OooOoo0) {
            float f2 = 2.0f / this.f30001OooO0Oo;
            float f3 = this.f30030Oooo00O;
            double dAtan = Math.atan((f3 - (f + (this.f30019OooOo0O / 2))) / f3) * ((double) f2);
            this.f30031Oooo00o.save();
            this.f30031Oooo00o.rotateX((float) ((180.0d * dAtan) / 3.141592653589793d));
            this.f30031Oooo00o.translate(0.0f, 0.0f, -Math.abs((this.f30030Oooo00O / (this.f30001OooO0Oo + 2)) * ((float) Math.sin(dAtan))));
            this.f30031Oooo00o.getMatrix(this.f30028Oooo0);
            this.f30028Oooo0.preTranslate((-getMeasuredWidth()) / 2, (-getMeasuredHeight()) / 2);
            this.f30028Oooo0.postTranslate(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            canvas.save();
            canvas.concat(this.f30028Oooo0);
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        Layout.Alignment alignment2 = this.f30029Oooo000;
        if (alignment2 == alignment) {
            this.f30004OooO0oO.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, getMeasuredWidth() / 2, fHeight, this.f30004OooO0oO);
        } else if (alignment2 == Layout.Alignment.ALIGN_OPPOSITE) {
            this.f30004OooO0oO.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(str, getMeasuredWidth(), fHeight, this.f30004OooO0oO);
        } else {
            this.f30004OooO0oO.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(str, 0.0f, fHeight, this.f30004OooO0oO);
        }
        if (this.f30025OooOoo0) {
            canvas.restore();
            this.f30031Oooo00o.restore();
        }
    }

    public final void OooO0OO(int i) {
        int i2 = this.f30014OooOOo0 + i;
        this.f30014OooOOo0 = i2;
        if (Math.abs(i2) >= this.f30019OooOo0O) {
            int i3 = this.f30003OooO0o0;
            if ((i3 == 0 && i >= 0) || (i3 == this.f30002OooO0o.OooO00o() - 1 && i <= 0)) {
                int iAbs = Math.abs(this.f30014OooOOo0);
                int i4 = this.f30018OooOo00;
                if (iAbs > i4) {
                    if (this.f30014OooOOo0 <= 0) {
                        i4 = -i4;
                    }
                    this.f30014OooOOo0 = i4;
                    return;
                }
                return;
            }
            int i5 = this.f30003OooO0o0;
            int i6 = i5 - (this.f30014OooOOo0 / this.f30019OooOo0O);
            int iOooO00o = OooO00o(i6);
            if (this.f30021OooOoO) {
                if (this.f30003OooO0o0 != i6) {
                    this.f30003OooO0o0 = i6;
                }
            } else if (this.f30003OooO0o0 != iOooO00o) {
                this.f30003OooO0o0 = iOooO00o;
            }
            this.f30014OooOOo0 -= (i5 - this.f30003OooO0o0) * this.f30019OooOo0O;
        }
    }

    public final void OooO0Oo(int i) {
        int i2;
        int i3;
        int i4 = this.f30014OooOOo0;
        if (i4 != 0) {
            int i5 = -i4;
            int i6 = this.f30003OooO0o0;
            if (i6 != 0 && i6 != this.f30002OooO0o.OooO00o() - 1) {
                int i7 = this.f30014OooOOo0;
                if (i7 > 0) {
                    int i8 = this.f30019OooOo0O;
                    if (i7 > i8 / 3) {
                        i5 = i8 - i7;
                    }
                } else {
                    int iAbs = Math.abs(i7);
                    int i9 = this.f30019OooOo0O;
                    if (iAbs > i9 / 3) {
                        i5 = -(i9 + this.f30014OooOOo0);
                    }
                }
            }
            if (this.f30002OooO0o.OooO00o() > 1) {
                if (this.f30003OooO0o0 == 0 && (i3 = this.f30014OooOOo0) < 0) {
                    int iAbs2 = Math.abs(i3);
                    int i10 = this.f30019OooOo0O;
                    if (iAbs2 > i10 / 3) {
                        i5 = -(i10 + this.f30014OooOOo0);
                    }
                }
                if (this.f30003OooO0o0 == this.f30002OooO0o.OooO00o() - 1 && (i2 = this.f30014OooOOo0) > 0) {
                    int i11 = this.f30019OooOo0O;
                    if (i2 > i11 / 3) {
                        i5 = i11 - i2;
                    }
                }
            }
            int i12 = this.f30014OooOOo0 - (this.f30019OooOo0O * this.f30003OooO0o0);
            this.f30012OooOOOo = i12;
            this.f30006OooOO0.startScroll(0, i12, 0, i5, i);
            invalidate();
        }
        this.f30008OooOO0o = false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!this.f30006OooOO0.computeScrollOffset()) {
            if (this.f30008OooOO0o) {
                OooO0Oo(SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            }
        } else {
            int currY = this.f30006OooOO0.getCurrY();
            OooO0OO(currY - this.f30012OooOOOo);
            this.f30012OooOOOo = currY;
            invalidate();
        }
    }

    public OooO00o getAdapter() {
        return this.f30002OooO0o;
    }

    public int getIndex() {
        return this.f30032Oooo0O0;
    }

    public int getMaxCount() {
        return Integer.MAX_VALUE / this.f30019OooOo0O;
    }

    public int getSelectedItemPosition() {
        return OooO00o(this.f30003OooO0o0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        OooO00o<Object> oooO00o = this.f30002OooO0o;
        Object obj = h0.f57119OooO00o;
        if (oooO00o == null) {
            throw new NullPointerException("adapter == null");
        }
        if (oooO00o.OooO00o() == 0 || this.f30019OooOo0O == 0) {
            return;
        }
        if (!isInEditMode()) {
            this.f30024OooOoo.setBounds(0, (getMeasuredHeight() - this.f30019OooOo0O) / 2, getMeasuredWidth(), (getMeasuredHeight() + this.f30019OooOo0O) / 2);
            this.f30024OooOoo.draw(canvas);
        }
        float fOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(getMeasuredHeight(), this.f30019OooOo0O, 2, this.f30014OooOOo0);
        int i = this.f30003OooO0o0;
        OooO00o<Object> oooO00o2 = this.f30002OooO0o;
        int iOooO00o = OooO00o(i);
        oooO00o2.getClass();
        OooO0O0(canvas, OooO00o.OooO0O0(iOooO00o), fOooO00o);
        float f = fOooO00o - this.f30019OooOo0O;
        int i2 = this.f30003OooO0o0 - 1;
        while (true) {
            if ((this.f30019OooOo0O * (this.f30025OooOoo0 ? 2 : 1)) + f > 0.0f) {
                if ((i2 < 0 || i2 >= this.f30002OooO0o.OooO00o()) == true && !this.f30021OooOoO) {
                    break;
                }
                OooO00o<Object> oooO00o3 = this.f30002OooO0o;
                int iOooO00o2 = OooO00o(i2);
                oooO00o3.getClass();
                OooO0O0(canvas, OooO00o.OooO0O0(iOooO00o2), f);
                f -= this.f30019OooOo0O;
                i2--;
            } else {
                break;
            }
        }
        float measuredHeight = ((getMeasuredHeight() + this.f30019OooOo0O) / 2) + this.f30014OooOOo0;
        int i3 = this.f30003OooO0o0 + 1;
        while (measuredHeight - (this.f30019OooOo0O * (this.f30025OooOoo0 ? 1 : 0)) < getMeasuredHeight()) {
            if ((i3 < 0 || i3 >= this.f30002OooO0o.OooO00o()) == true && !this.f30021OooOoO) {
                break;
            }
            OooO00o<Object> oooO00o4 = this.f30002OooO0o;
            int iOooO00o3 = OooO00o(i3);
            oooO00o4.getClass();
            OooO0O0(canvas, OooO00o.OooO0O0(iOooO00o3), measuredHeight);
            measuredHeight += this.f30019OooOo0O;
            i3++;
        }
        this.f30026OooOooO.setBounds(0, 0, getMeasuredWidth(), (getMeasuredHeight() - this.f30019OooOo0O) / 2);
        this.f30026OooOooO.draw(canvas);
        this.f30027OooOooo.setBounds(0, (getMeasuredHeight() + this.f30019OooOo0O) / 2, getMeasuredWidth(), getMeasuredHeight());
        this.f30027OooOooo.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iCeil;
        super.onMeasure(i, i2);
        OooO00o<Object> oooO00o = this.f30002OooO0o;
        Object obj = h0.f57119OooO00o;
        if (oooO00o == null) {
            throw new NullPointerException("adapter == null");
        }
        if (this.f30025OooOoo0) {
            float fSin = this.f30019OooOo0O / ((float) Math.sin(3.141592653589793d / ((double) ((this.f30001OooO0Oo * 2) + 3))));
            this.f30030Oooo00O = fSin;
            iCeil = (int) Math.ceil(fSin * 2.0f);
        } else {
            iCeil = ((this.f30001OooO0Oo * 2) + 1) * this.f30019OooOo0O;
        }
        int iResolveSizeAndState = View.resolveSizeAndState(iCeil, i2, 0);
        if (this.f30021OooOoO) {
            this.f30013OooOOo = Integer.MIN_VALUE;
            this.f30015OooOOoo = Integer.MAX_VALUE;
        } else {
            this.f30013OooOOo = (-(this.f30002OooO0o.OooO00o() - 1)) * this.f30019OooOo0O;
            this.f30015OooOOoo = 0;
        }
        this.f30018OooOo00 = this.f30019OooOo0O * 2;
        setMeasuredDimension(i, iResolveSizeAndState);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00af A[PHI: r9
      0x00af: PHI (r9v20 int) = (r9v19 int), (r9v24 int) binds: [B:38:0x00ac, B:35:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.f30000OooO.onTouchEvent(motionEvent)) {
            invalidate();
            return true;
        }
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30008OooOO0o = false;
            this.f30009OooOOO = y;
            this.f30011OooOOOO = y;
            this.f30007OooOO0O = false;
            if (!this.f30006OooOO0.isFinished()) {
                this.f30006OooOO0.forceFinished(true);
                this.f30010OooOOO0 = true;
            }
        } else if (action != 1) {
            if (action == 2 && (this.f30007OooOO0O || Math.abs(y - this.f30009OooOOO) > this.f30017OooOo0)) {
                if (this.f30007OooOO0O) {
                    this.f30008OooOO0o = false;
                    OooO0OO((int) (y - this.f30011OooOOOO));
                    this.f30011OooOOOO = y;
                } else {
                    this.f30007OooOO0O = true;
                    this.f30011OooOOOO = y;
                }
            }
        } else if (this.f30010OooOOO0 || this.f30007OooOO0O || Math.abs(y - this.f30009OooOOO) > this.f30017OooOo0) {
            this.f30007OooOO0O = false;
            this.f30010OooOOO0 = false;
            OooO0OO((int) (y - this.f30011OooOOOO));
            OooO0Oo(SQLiteDatabase.MAX_SQL_CACHE_SIZE);
        } else {
            performClick();
            this.f30012OooOOOo = this.f30014OooOOo0 - (this.f30019OooOo0O * this.f30003OooO0o0);
            int measuredHeight = (getMeasuredHeight() - this.f30019OooOo0O) / 2;
            int measuredHeight2 = getMeasuredHeight();
            int i2 = this.f30019OooOo0O;
            int i3 = (measuredHeight2 + i2) / 2;
            float f = measuredHeight;
            if (y < f || y > i3) {
                if (y < f) {
                    i = ((((int) y) - i3) / i2) * i2;
                    if ((i / i2) + this.f30003OooO0o0 >= 0) {
                        this.f30006OooOO0.startScroll(0, this.f30012OooOOOo, 0, -i, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
                    }
                } else {
                    i = ((((int) y) - measuredHeight) / i2) * i2;
                    if ((i / i2) + this.f30003OooO0o0 <= this.f30002OooO0o.OooO00o() - 1) {
                        this.f30006OooOO0.startScroll(0, this.f30012OooOOOo, 0, -i, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
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
        Object obj = h0.f57119OooO00o;
        if (oooO00o == null) {
            throw new NullPointerException("adapter == null");
        }
        if (oooO00o.OooO00o() > Integer.MAX_VALUE / this.f30019OooOo0O) {
            throw new RuntimeException("getItemCount() is too large, max count can be PickerView.getMaxCount()");
        }
        new WeakReference(this);
        this.f30002OooO0o = oooO00o;
    }

    public void setAutoFitSize(boolean z) {
        if (this.f30023OooOoOO != z) {
            this.f30023OooOoOO = z;
            invalidate();
        }
    }

    public void setCurved(boolean z) {
        if (this.f30025OooOoo0 != z) {
            this.f30025OooOoo0 = z;
            invalidate();
            requestLayout();
        }
    }

    public void setCyclic(boolean z) {
        if (this.f30021OooOoO != z) {
            this.f30021OooOoO = z;
            invalidate();
        }
    }

    public void setIndex(int i) {
        this.f30032Oooo0O0 = i;
    }

    public void setItemHeight(int i) {
        if (this.f30019OooOo0O != i) {
            this.f30019OooOo0O = i;
            invalidate();
            requestLayout();
        }
    }

    public void setOnSelectedItemChangedListener(OooO0O0 oooO0O0) {
    }

    public void setPreferredMaxOffsetItemCount(int i) {
        this.f30001OooO0Oo = i;
    }

    public void setSelectedItemPosition(int i) {
        OooO00o<Object> oooO00o = this.f30002OooO0o;
        Object obj = h0.f57119OooO00o;
        if (oooO00o == null) {
            throw new NullPointerException("adapter must be set first");
        }
        int iOooO00o = OooO00o(i);
        if (this.f30021OooOoO) {
            if (this.f30003OooO0o0 != i) {
                this.f30003OooO0o0 = i;
            }
        } else if (this.f30003OooO0o0 != iOooO00o) {
            this.f30003OooO0o0 = iOooO00o;
        }
        invalidate();
    }

    public void setTextColor(int i) {
        if (this.f30016OooOo != i) {
            this.f30016OooOo = i;
            invalidate();
        }
    }

    public void setTextSize(int i) {
        if (this.f30020OooOo0o != i) {
            this.f30020OooOo0o = i;
            invalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (this.f30022OooOoO0 != typeface) {
            this.f30022OooOoO0 = typeface;
            this.f30004OooO0oO.setTypeface(typeface);
            invalidate();
        }
    }

    public PickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30001OooO0Oo = 3;
        this.f30005OooO0oo = new Rect();
        this.f30016OooOo = -16777216;
        int[] iArr = {-805635334, -1610941702, 1610283770};
        this.f30029Oooo000 = Layout.Alignment.ALIGN_CENTER;
        this.f30032Oooo0O0 = 0;
        new ArrayList();
        this.f30000OooO = new GestureDetector(getContext(), new w0(this));
        this.f30006OooOO0 = new OverScroller(getContext());
        this.f30017OooOo0 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (isInEditMode()) {
            this.f30002OooO0o = new OooO0OO(this);
        } else {
            Context context2 = getContext();
            int i2 = o0Oo0oo.pickerview_selected_item;
            Object obj = h0.f57119OooO00o;
            Intrinsics.checkNotNullParameter(context2, "context");
            this.f30024OooOoo = context2.getDrawable(i2);
        }
        this.f30026OooOooO = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        this.f30027OooOooo = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00000.PickerView);
        int i3 = typedArrayObtainStyledAttributes.getInt(o00000.PickerView_preferredMaxOffsetItemCount, 3);
        this.f30001OooO0Oo = i3;
        if (i3 <= 0) {
            this.f30001OooO0Oo = 3;
        }
        Context c = getContext();
        Object obj2 = h0.f57119OooO00o;
        Intrinsics.checkNotNullParameter(c, "c");
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24, c.getResources().getDisplayMetrics());
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00000.PickerView_itemHeight, iApplyDimension);
        this.f30019OooOo0O = dimensionPixelSize;
        if (dimensionPixelSize <= 0) {
            this.f30019OooOo0O = iApplyDimension;
        }
        Context c2 = getContext();
        Intrinsics.checkNotNullParameter(c2, "c");
        this.f30020OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00000.PickerView_textSize, (int) TypedValue.applyDimension(2, 14, c2.getResources().getDisplayMetrics()));
        this.f30016OooOo = typedArrayObtainStyledAttributes.getColor(o00000.PickerView_textColor, -16777216);
        this.f30021OooOoO = typedArrayObtainStyledAttributes.getBoolean(o00000.PickerView_isCyclic, false);
        this.f30023OooOoOO = typedArrayObtainStyledAttributes.getBoolean(o00000.PickerView_autoFitSize, true);
        this.f30025OooOoo0 = typedArrayObtainStyledAttributes.getBoolean(o00000.PickerView_curved, false);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f30004OooO0oO = paint;
        paint.setAntiAlias(true);
        this.f30031Oooo00o = new Camera();
        this.f30028Oooo0 = new Matrix();
    }
}
