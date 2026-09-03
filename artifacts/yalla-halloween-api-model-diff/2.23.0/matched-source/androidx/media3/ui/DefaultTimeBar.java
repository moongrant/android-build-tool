package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.LongCompanionObject;
import p037OoooOo0.o000O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultTimeBar extends View implements o000O000 {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f6467OoooO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f6468OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f6469OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f6470OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f6471OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Rect f6472OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f6473OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Paint f6474OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Paint f6475OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Paint f6476OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final Drawable f6477OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Paint f6478OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f6479OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f6480OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f6481OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f6482OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f6483OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final StringBuilder f6484OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f6485OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f6486OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f6487OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f6488OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final o000O f6489OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Formatter f6490OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final CopyOnWriteArraySet<o000O000.OooO00o> f6491OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float f6492OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Point f6493OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f6494OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f6495OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f6496Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f6497Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f6498Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Rect f6499Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final ValueAnimator f6500Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f6501Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f6502Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f6503Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public long f6504Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f6505Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f6506Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public boolean[] f6507OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public long[] f6508OoooO00;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public static int OooO0OO(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f6495OooOooo;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f6503Oooo0o;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f6494OooOooO);
    }

    private String getProgressText() {
        return o000O000.OooO0o.OooO0Oo(this.f6484OooOo, this.f6490OooOoO0, this.f6505Oooo0oO);
    }

    private long getScrubberPosition() {
        Rect rect = this.f6471OooO0o0;
        if (rect.width() <= 0 || this.f6503Oooo0o == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f6472OooO0oO.width()) * this.f6503Oooo0o) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.o000O000
    public final void OooO00o(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        o000O000.OooO00o.OooO00o(i == 0 || !(jArr == null || zArr == null));
        this.f6496Oooo = i;
        this.f6508OoooO00 = jArr;
        this.f6507OoooO0 = zArr;
        OooO0oO();
    }

    @Override // androidx.media3.ui.o000O000
    public final void OooO0O0(o000O000.OooO00o oooO00o) {
        this.f6491OooOoOO.add(oooO00o);
    }

    public final boolean OooO0Oo(long j) {
        long j2 = this.f6503Oooo0o;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f6502Oooo0OO ? this.f6504Oooo0o0 : this.f6505Oooo0oO;
        int i = o000O000.OooO0o.f34423OooO00o;
        long jMax = Math.max(0L, Math.min(j + j3, j2));
        if (jMax == j3) {
            return false;
        }
        if (this.f6502Oooo0OO) {
            OooO0oo(jMax);
        } else {
            OooO0o0(jMax);
        }
        OooO0oO();
        return true;
    }

    public final void OooO0o(boolean z) {
        removeCallbacks(this.f6489OooOoO);
        this.f6502Oooo0OO = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<o000O000.OooO00o> it = this.f6491OooOoOO.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO(this.f6504Oooo0o0, z);
        }
    }

    public final void OooO0o0(long j) {
        this.f6504Oooo0o0 = j;
        this.f6502Oooo0OO = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<o000O000.OooO00o> it = this.f6491OooOoOO.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(j);
        }
    }

    public final void OooO0oO() {
        Rect rect = this.f6470OooO0o;
        Rect rect2 = this.f6471OooO0o0;
        rect.set(rect2);
        Rect rect3 = this.f6472OooO0oO;
        rect3.set(rect2);
        long j = this.f6502Oooo0OO ? this.f6504Oooo0o0 : this.f6505Oooo0oO;
        if (this.f6503Oooo0o > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f6506Oooo0oo) / this.f6503Oooo0o)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f6503Oooo0o)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f6469OooO0Oo);
    }

    public final void OooO0oo(long j) {
        if (this.f6504Oooo0o0 == j) {
            return;
        }
        this.f6504Oooo0o0 = j;
        Iterator<o000O000.OooO00o> it = this.f6491OooOoOO.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(j);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6477OooOOO;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // androidx.media3.ui.o000O000
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f6471OooO0o0.width() / this.f6492OooOoo);
        if (iWidth != 0) {
            long j = this.f6503Oooo0o;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iWidth);
            }
        }
        return LongCompanionObject.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6477OooOOO;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.f6471OooO0o0;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iHeight + iCenterY;
        long j = this.f6503Oooo0o;
        Paint paint = this.f6474OooOO0;
        Rect rect2 = this.f6472OooO0oO;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f6470OooO0o;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f6468OooO);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.f6473OooO0oo);
            }
            if (this.f6496Oooo != 0) {
                long[] jArr = this.f6508OoooO00;
                jArr.getClass();
                boolean[] zArr = this.f6507OoooO0;
                zArr.getClass();
                int i6 = this.f6481OooOOo;
                int i7 = i6 / 2;
                int i8 = 0;
                while (i8 < this.f6496Oooo) {
                    long j2 = jArr[i8];
                    int i9 = i6;
                    long j3 = this.f6503Oooo0o;
                    int i10 = o000O000.OooO0o.f34423OooO00o;
                    int iMin = Math.min(rect.width() - i9, Math.max(0, ((int) ((((long) rect.width()) * Math.max(0L, Math.min(j2, j3))) / this.f6503Oooo0o)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i9, i2, zArr[i8] ? this.f6476OooOO0o : this.f6475OooOO0O);
                    i8++;
                    i6 = i9;
                }
            }
        }
        if (this.f6503Oooo0o > 0) {
            int i11 = rect2.right;
            int i12 = rect2.left;
            int i13 = rect.right;
            int i14 = o000O000.OooO0o.f34423OooO00o;
            int iMax3 = Math.max(i12, Math.min(i11, i13));
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f6477OooOOO;
            if (drawable == null) {
                if (this.f6502Oooo0OO || isFocused()) {
                    i = this.f6485OooOo0;
                } else {
                    i = isEnabled() ? this.f6483OooOOoo : this.f6486OooOo00;
                }
                canvas.drawCircle(iMax3, iCenterY2, (int) ((i * this.f6497Oooo0) / 2.0f), this.f6478OooOOO0);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f6497Oooo0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f6497Oooo0)) / 2;
                drawable.setBounds(iMax3 - intrinsicWidth, iCenterY2 - intrinsicHeight, iMax3 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f6502Oooo0OO || z) {
            return;
        }
        OooO0o(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f6503Oooo0o <= 0) {
            return;
        }
        if (o000O000.OooO0o.f34423OooO00o >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (OooO0Oo(positionIncrement)) {
                            o000O o000o = this.f6489OooOoO;
                            removeCallbacks(o000o);
                            postDelayed(o000o, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (OooO0Oo(positionIncrement)) {
                            o000O o000o2 = this.f6489OooOoO;
                            removeCallbacks(o000o2);
                            postDelayed(o000o2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f6502Oooo0OO) {
                            OooO0o(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f6502Oooo0OO) {
                OooO0o(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f6501Oooo0O0 ? 0 : this.f6487OooOo0O;
        int i8 = this.f6482OooOOo0;
        int i9 = this.f6479OooOOOO;
        int i10 = this.f6480OooOOOo;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f6469OooO0Oo;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f6471OooO0o0.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (o000O000.OooO0o.f34423OooO00o >= 29 && ((rect = this.f6499Oooo00O) == null || rect.width() != i5 || this.f6499Oooo00O.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f6499Oooo00O = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        OooO0oO();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f6480OooOOOo;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f6477OooOOO;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f6477OooOOO;
        if (drawable != null) {
            if (o000O000.OooO0o.f34423OooO00o >= 23 && drawable.setLayoutDirection(i)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f6503Oooo0o > 0) {
            Point point = this.f6493OooOoo0;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f6472OooO0oO;
            Rect rect2 = this.f6471OooO0o0;
            if (action == 0) {
                int i3 = i;
                if (this.f6469OooO0Oo.contains(i3, i2)) {
                    int i4 = rect2.left;
                    int i5 = rect2.right;
                    int i6 = o000O000.OooO0o.f34423OooO00o;
                    rect.right = Math.max(i4, Math.min(i3, i5));
                    OooO0o0(getScrubberPosition());
                    OooO0oO();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f6502Oooo0OO) {
                    OooO0o(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f6502Oooo0OO) {
                        OooO0o(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f6502Oooo0OO) {
                if (i2 < this.f6488OooOo0o) {
                    int i7 = this.f6498Oooo000;
                    int iOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(i, i7, 3, i7);
                    int i8 = rect2.left;
                    int i9 = rect2.right;
                    int i10 = o000O000.OooO0o.f34423OooO00o;
                    rect.right = Math.max(i8, Math.min(iOooO00o, i9));
                } else {
                    this.f6498Oooo000 = i;
                    int i11 = i;
                    int i12 = rect2.left;
                    int i13 = rect2.right;
                    int i14 = o000O000.OooO0o.f34423OooO00o;
                    rect.right = Math.max(i12, Math.min(i11, i13));
                }
                OooO0oo(getScrubberPosition());
                OooO0oO();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f6503Oooo0o <= 0) {
            return false;
        }
        if (i == 8192) {
            if (OooO0Oo(-getPositionIncrement())) {
                OooO0o(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (OooO0Oo(getPositionIncrement())) {
                OooO0o(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.f6475OooOO0O.setColor(i);
        invalidate(this.f6469OooO0Oo);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f6468OooO.setColor(i);
        invalidate(this.f6469OooO0Oo);
    }

    @Override // androidx.media3.ui.o000O000
    public void setBufferedPosition(long j) {
        if (this.f6506Oooo0oo == j) {
            return;
        }
        this.f6506Oooo0oo = j;
        OooO0oO();
    }

    @Override // androidx.media3.ui.o000O000
    public void setDuration(long j) {
        if (this.f6503Oooo0o == j) {
            return;
        }
        this.f6503Oooo0o = j;
        if (this.f6502Oooo0OO && j == -9223372036854775807L) {
            OooO0o(true);
        }
        OooO0oO();
    }

    @Override // android.view.View, androidx.media3.ui.o000O000
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f6502Oooo0OO || z) {
            return;
        }
        OooO0o(true);
    }

    public void setKeyCountIncrement(int i) {
        o000O000.OooO00o.OooO00o(i > 0);
        this.f6494OooOooO = i;
        this.f6495OooOooo = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        o000O000.OooO00o.OooO00o(j > 0);
        this.f6494OooOooO = -1;
        this.f6495OooOooo = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f6476OooOO0o.setColor(i);
        invalidate(this.f6469OooO0Oo);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f6473OooO0oo.setColor(i);
        invalidate(this.f6469OooO0Oo);
    }

    @Override // androidx.media3.ui.o000O000
    public void setPosition(long j) {
        if (this.f6505Oooo0oO == j) {
            return;
        }
        this.f6505Oooo0oO = j;
        setContentDescription(getProgressText());
        OooO0oO();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f6478OooOOO0.setColor(i);
        invalidate(this.f6469OooO0Oo);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f6474OooOO0.setColor(i);
        invalidate(this.f6469OooO0Oo);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i, @Nullable AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f6469OooO0Oo = new Rect();
        this.f6471OooO0o0 = new Rect();
        this.f6470OooO0o = new Rect();
        this.f6472OooO0oO = new Rect();
        Paint paint = new Paint();
        this.f6473OooO0oo = paint;
        Paint paint2 = new Paint();
        this.f6468OooO = paint2;
        Paint paint3 = new Paint();
        this.f6474OooOO0 = paint3;
        Paint paint4 = new Paint();
        this.f6475OooOO0O = paint4;
        Paint paint5 = new Paint();
        this.f6476OooOO0o = paint5;
        Paint paint6 = new Paint();
        this.f6478OooOOO0 = paint6;
        paint6.setAntiAlias(true);
        this.f6491OooOoOO = new CopyOnWriteArraySet<>();
        this.f6493OooOoo0 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f6492OooOoo = f;
        this.f6488OooOo0o = OooO0OO(f, -50);
        int iOooO0OO = OooO0OO(f, 4);
        int iOooO0OO2 = OooO0OO(f, 26);
        int iOooO0OO3 = OooO0OO(f, 4);
        int iOooO0OO4 = OooO0OO(f, 12);
        int iOooO0OO5 = OooO0OO(f, 0);
        int iOooO0OO6 = OooO0OO(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o0000oo.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(o0000oo.DefaultTimeBar_scrubber_drawable);
                this.f6477OooOOO = drawable;
                if (drawable != null) {
                    int i3 = o000O000.OooO0o.f34423OooO00o;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iOooO0OO2 = Math.max(drawable.getMinimumHeight(), iOooO0OO2);
                }
                this.f6479OooOOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000oo.DefaultTimeBar_bar_height, iOooO0OO);
                this.f6480OooOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000oo.DefaultTimeBar_touch_target_height, iOooO0OO2);
                this.f6482OooOOo0 = typedArrayObtainStyledAttributes.getInt(o0000oo.DefaultTimeBar_bar_gravity, 0);
                this.f6481OooOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000oo.DefaultTimeBar_ad_marker_width, iOooO0OO3);
                this.f6483OooOOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000oo.DefaultTimeBar_scrubber_enabled_size, iOooO0OO4);
                this.f6486OooOo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000oo.DefaultTimeBar_scrubber_disabled_size, iOooO0OO5);
                this.f6485OooOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000oo.DefaultTimeBar_scrubber_dragged_size, iOooO0OO6);
                int i4 = typedArrayObtainStyledAttributes.getInt(o0000oo.DefaultTimeBar_played_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(o0000oo.DefaultTimeBar_scrubber_color, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(o0000oo.DefaultTimeBar_buffered_color, -855638017);
                int i7 = typedArrayObtainStyledAttributes.getInt(o0000oo.DefaultTimeBar_unplayed_color, 872415231);
                int i8 = typedArrayObtainStyledAttributes.getInt(o0000oo.DefaultTimeBar_ad_marker_color, -1291845888);
                int i9 = typedArrayObtainStyledAttributes.getInt(o0000oo.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f6479OooOOOO = iOooO0OO;
            this.f6480OooOOOo = iOooO0OO2;
            this.f6482OooOOo0 = 0;
            this.f6481OooOOo = iOooO0OO3;
            this.f6483OooOOoo = iOooO0OO4;
            this.f6486OooOo00 = iOooO0OO5;
            this.f6485OooOo0 = iOooO0OO6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f6477OooOOO = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f6484OooOo = sb;
        this.f6490OooOoO0 = new Formatter(sb, Locale.getDefault());
        this.f6489OooOoO = new o000O(this, 1);
        Drawable drawable2 = this.f6477OooOOO;
        if (drawable2 != null) {
            this.f6487OooOo0O = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f6487OooOo0O = (Math.max(this.f6486OooOo00, Math.max(this.f6483OooOOoo, this.f6485OooOo0)) + 1) / 2;
        }
        this.f6497Oooo0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f6500Oooo00o = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.OooO0O0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10 = DefaultTimeBar.f6467OoooO0O;
                DefaultTimeBar defaultTimeBar = this.f6561OooO0Oo;
                defaultTimeBar.getClass();
                defaultTimeBar.f6497Oooo0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f6469OooO0Oo);
            }
        });
        this.f6503Oooo0o = -9223372036854775807L;
        this.f6495OooOooo = -9223372036854775807L;
        this.f6494OooOooO = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
