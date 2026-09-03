package com.yalla.android.videoplayer.view;

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
import androidx.annotation.Nullable;
import androidx.appcompat.widget.OooO00o;
import com.google.android.exoplayer2.ui.o0000O0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.LongCompanionObject;
import p042OooooO0.o00O0O0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p359o0OOOooo.o000O;

/* JADX INFO: loaded from: classes4.dex */
public class YLTimeBar extends View implements o0000O0 {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f22549Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f22550OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f22551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f22552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f22553OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Rect f22554OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f22555OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Paint f22556OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Drawable f22557OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f22558OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f22559OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f22560OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f22561OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f22562OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f22563OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f22564OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f22565OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Point f22566OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Formatter f22567OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final StringBuilder f22568OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o00O0O0O f22569OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final CopyOnWriteArraySet<o0000O0.OooO00o> f22570OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f22571OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f22572OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f22573OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Rect f22574OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f22575OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final float f22576OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f22577OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f22578Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f22579Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f22580Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f22581Oooo00o;

    public YLTimeBar(Context context) {
        this(context, null);
    }

    public static int OooO0OO(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f22573OooOoOO;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f22580Oooo00O;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f22571OooOoO);
    }

    private String getProgressText() {
        return o0O00.OooOo(this.f22568OooOo00, this.f22567OooOo0, this.f22581Oooo00o);
    }

    private long getScrubberPosition() {
        Rect rect = this.f22553OooO0o0;
        if (rect.width() <= 0 || this.f22580Oooo00O == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f22554OooO0oO.width()) * this.f22580Oooo00O) / ((long) rect.width());
    }

    @Override // com.google.android.exoplayer2.ui.o0000O0
    public final void OooO00o(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
    }

    @Override // com.google.android.exoplayer2.ui.o0000O0
    public final void OooO0O0(o0000O0.OooO00o oooO00o) {
        this.f22570OooOo0o.add(oooO00o);
    }

    public final boolean OooO0Oo(long j) {
        long j2 = this.f22580Oooo00O;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f22577OooOooo ? this.f22579Oooo000 : this.f22581Oooo00o;
        long jOooOO0 = o0O00.OooOO0(j3 + j, 0L, j2);
        if (jOooOO0 == j3) {
            return false;
        }
        if (this.f22577OooOooo) {
            OooO0oo(jOooOO0);
        } else {
            OooO0o0(jOooOO0);
        }
        OooO0oO();
        return true;
    }

    public final void OooO0o(boolean z) {
        removeCallbacks(this.f22569OooOo0O);
        this.f22577OooOooo = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<o0000O0.OooO00o> it = this.f22570OooOo0o.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.f22579Oooo000, z);
        }
    }

    public final void OooO0o0(long j) {
        this.f22579Oooo000 = j;
        this.f22577OooOooo = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<o0000O0.OooO00o> it = this.f22570OooOo0o.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    public final void OooO0oO() {
        Rect rect = this.f22552OooO0o;
        Rect rect2 = this.f22553OooO0o0;
        rect.set(rect2);
        Rect rect3 = this.f22554OooO0oO;
        rect3.set(rect2);
        long j = this.f22577OooOooo ? this.f22579Oooo000 : this.f22581Oooo00o;
        if (this.f22580Oooo00O > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f22578Oooo0) / this.f22580Oooo00O)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f22580Oooo00O)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f22551OooO0Oo);
    }

    public final void OooO0oo(long j) {
        if (this.f22579Oooo000 == j) {
            return;
        }
        this.f22579Oooo000 = j;
        Iterator<o0000O0.OooO00o> it = this.f22570OooOo0o.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22557OooOO0O;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // com.google.android.exoplayer2.ui.o0000O0
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f22553OooO0o0.width() / this.f22572OooOoO0);
        if (iWidth != 0) {
            long j = this.f22580Oooo00O;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iWidth);
            }
        }
        return LongCompanionObject.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22557OooOO0O;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f22553OooO0o0;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        long j = this.f22580Oooo00O;
        Paint paint = this.f22556OooOO0;
        Rect rect2 = this.f22554OooO0oO;
        int i2 = this.f22558OooOO0o;
        if (j <= 0) {
            float f = i2 / 2.0f;
            canvas.drawRoundRect(rect.left, iCenterY, rect.right, i, f, f, paint);
        } else {
            Rect rect3 = this.f22552OooO0o;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                float f2 = i2 / 2.0f;
                canvas.drawRoundRect(rect2.left, iCenterY, i5, i, f2, f2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                float f3 = i2 / 2.0f;
                canvas.drawRoundRect(iMax2, iCenterY, i4, i, f3, f3, this.f22550OooO);
            }
            if (rect2.width() > 0) {
                float f4 = i2 / 2.0f;
                canvas.drawRoundRect(rect2.left, iCenterY, rect2.right, i, f4, f4, this.f22555OooO0oo);
            }
        }
        if (this.f22580Oooo00O > 0) {
            int iOooO = o0O00.OooO(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f22557OooOO0O;
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float f5 = this.f22576OooOooO;
            int i6 = ((int) (intrinsicWidth * f5)) / 2;
            int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * f5)) / 2;
            drawable.setBounds(iOooO - i6, iCenterY2 - intrinsicHeight, iOooO + i6, iCenterY2 + intrinsicHeight);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f22577OooOooo || z) {
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
        if (this.f22580Oooo00O <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
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
                            o00O0O0O o00o0o0o2 = this.f22569OooOo0O;
                            removeCallbacks(o00o0o0o2);
                            postDelayed(o00o0o0o2, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (OooO0Oo(positionIncrement)) {
                            o00O0O0O o00o0o0o3 = this.f22569OooOo0O;
                            removeCallbacks(o00o0o0o3);
                            postDelayed(o00o0o0o3, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f22577OooOooo) {
                            OooO0o(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f22577OooOooo) {
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
        int i7 = this.f22559OooOOO;
        int i8 = this.f22558OooOO0o;
        int i9 = this.f22560OooOOO0;
        int i10 = this.f22563OooOOo;
        if (i7 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i9;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i8) - Math.max(i10 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - i9) / 2;
            paddingBottom2 = (i6 - i8) / 2;
        }
        Rect rect2 = this.f22551OooO0Oo;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i9 + paddingBottom);
        this.f22553OooO0o0.set(rect2.left + i10, paddingBottom2, rect2.right - i10, i8 + paddingBottom2);
        if (o0O00.f40595OooO00o >= 29 && ((rect = this.f22574OooOoo) == null || rect.width() != i5 || this.f22574OooOoo.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f22574OooOoo = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        OooO0oO();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f22560OooOOO0;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f22557OooOO0O;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f22557OooOO0O;
        if (drawable != null) {
            if (o0O00.f40595OooO00o >= 23 && drawable.setLayoutDirection(i)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f22580Oooo00O > 0) {
            Point point = this.f22566OooOo;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f22554OooO0oO;
            Rect rect2 = this.f22553OooO0o0;
            if (action == 0) {
                int i3 = i;
                if (this.f22551OooO0Oo.contains(i3, i2)) {
                    rect.right = o0O00.OooO(i3, rect2.left, rect2.right);
                    OooO0o0(getScrubberPosition());
                    OooO0oO();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f22577OooOooo) {
                    OooO0o(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f22577OooOooo) {
                        OooO0o(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f22577OooOooo) {
                if (i2 < this.f22565OooOOoo) {
                    int i4 = this.f22575OooOoo0;
                    rect.right = o0O00.OooO(OooO00o.OooO00o(i, i4, 3, i4), rect2.left, rect2.right);
                } else {
                    this.f22575OooOoo0 = i;
                    rect.right = o0O00.OooO(i, rect2.left, rect2.right);
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
        if (this.f22580Oooo00O <= 0) {
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

    @Override // com.google.android.exoplayer2.ui.o0000O0
    public void setBufferedPosition(long j) {
        if (this.f22578Oooo0 == j) {
            return;
        }
        this.f22578Oooo0 = j;
        OooO0oO();
    }

    @Override // com.google.android.exoplayer2.ui.o0000O0
    public void setDuration(long j) {
        if (this.f22580Oooo00O == j) {
            return;
        }
        this.f22580Oooo00O = j;
        if (this.f22577OooOooo && j == -9223372036854775807L) {
            OooO0o(true);
        }
        OooO0oO();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.o0000O0
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f22577OooOooo || z) {
            return;
        }
        OooO0o(true);
    }

    public void setKeyCountIncrement(int i) {
        o00O000o.OooO00o(i > 0);
        this.f22571OooOoO = i;
        this.f22573OooOoOO = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        o00O000o.OooO00o(j > 0);
        this.f22571OooOoO = -1;
        this.f22573OooOoOO = j;
    }

    @Override // com.google.android.exoplayer2.ui.o0000O0
    public void setPosition(long j) {
        if (this.f22581Oooo00o == j) {
            return;
        }
        this.f22581Oooo00o = j;
        setContentDescription(getProgressText());
        OooO0oO();
    }

    public YLTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YLTimeBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22551OooO0Oo = new Rect();
        this.f22553OooO0o0 = new Rect();
        this.f22552OooO0o = new Rect();
        this.f22554OooO0oO = new Rect();
        Paint paint = new Paint();
        this.f22555OooO0oo = paint;
        Paint paint2 = new Paint();
        this.f22550OooO = paint2;
        Paint paint3 = new Paint();
        this.f22556OooOO0 = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        this.f22570OooOo0o = new CopyOnWriteArraySet<>();
        this.f22566OooOo = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f22572OooOoO0 = f;
        this.f22565OooOOoo = OooO0OO(f, -50);
        int iOooO0OO = OooO0OO(f, 4);
        int iOooO0OO2 = OooO0OO(f, 26);
        int iOooO0OO3 = OooO0OO(f, 12);
        int iOooO0OO4 = OooO0OO(f, 0);
        int iOooO0OO5 = OooO0OO(f, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o000O.DefaultTimeBar, i, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(o000O.DefaultTimeBar_scrubber_drawable);
                this.f22557OooOO0O = drawable;
                if (drawable != null) {
                    int i2 = o0O00.f40595OooO00o;
                    if (i2 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i2 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iOooO0OO2 = Math.max(drawable.getMinimumHeight(), iOooO0OO2);
                }
                this.f22558OooOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O.DefaultTimeBar_bar_height, iOooO0OO);
                this.f22560OooOOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O.DefaultTimeBar_touch_target_height, iOooO0OO2);
                this.f22559OooOOO = typedArrayObtainStyledAttributes.getInt(o000O.DefaultTimeBar_bar_gravity, 0);
                this.f22561OooOOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O.DefaultTimeBar_scrubber_enabled_size, iOooO0OO3);
                this.f22562OooOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O.DefaultTimeBar_scrubber_disabled_size, iOooO0OO4);
                this.f22564OooOOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O.DefaultTimeBar_scrubber_dragged_size, iOooO0OO5);
                int i3 = typedArrayObtainStyledAttributes.getInt(o000O.DefaultTimeBar_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(o000O.DefaultTimeBar_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(o000O.DefaultTimeBar_buffered_color, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(o000O.DefaultTimeBar_unplayed_color, 872415231);
                paint.setColor(i3);
                paint4.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f22558OooOO0o = iOooO0OO;
            this.f22560OooOOO0 = iOooO0OO2;
            this.f22559OooOOO = 0;
            this.f22561OooOOOO = iOooO0OO3;
            this.f22562OooOOOo = iOooO0OO4;
            this.f22564OooOOo0 = iOooO0OO5;
            paint.setColor(-1);
            paint4.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            this.f22557OooOO0O = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f22568OooOo00 = sb;
        this.f22567OooOo0 = new Formatter(sb, Locale.getDefault());
        this.f22569OooOo0O = new o00O0O0O(this, 1);
        Drawable drawable2 = this.f22557OooOO0O;
        if (drawable2 != null) {
            this.f22563OooOOo = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22563OooOOo = (Math.max(this.f22562OooOOOo, Math.max(this.f22561OooOOOO, this.f22564OooOOo0)) + 1) / 2;
        }
        this.f22576OooOooO = 1.0f;
        this.f22580Oooo00O = -9223372036854775807L;
        this.f22573OooOoOO = -9223372036854775807L;
        this.f22571OooOoO = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
