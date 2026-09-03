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
import androidx.media3.ui.o000O000;
import com.yalla.android.videoplayer.view.YLTimeBar;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.LongCompanionObject;
import o0OOo000.OooO;
import p080o000OoO.o000OO00;
import p080o000OoO.o00O0O;
import p366o0OOo00o.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public class YLTimeBar extends View implements o000O000 {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ int f22085Oooo00o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f22086OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f22087OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f22088OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f22089OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Rect f22090OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f22091OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Paint f22092OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Drawable f22093OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f22094OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f22095OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f22096OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f22097OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f22098OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f22099OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f22100OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final StringBuilder f22101OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f22102OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o0OoOo0 f22103OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Formatter f22104OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final CopyOnWriteArraySet<o000O000.OooO00o> f22105OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Point f22106OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f22107OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f22108OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f22109OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f22110OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Rect f22111OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f22112OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f22113OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f22114Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f22115Oooo00O;

    public YLTimeBar(Context context) {
        this(context, null);
    }

    public static int OooO0OO(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f22107OooOoO;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f22113OooOooo;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f22108OooOoO0);
    }

    private String getProgressText() {
        return o000OO00.OooOoO0(this.f22101OooOOoo, this.f22104OooOo00, this.f22114Oooo000);
    }

    private long getScrubberPosition() {
        Rect rect = this.f22089OooO0o0;
        if (rect.width() <= 0 || this.f22113OooOooo == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f22090OooO0oO.width()) * this.f22113OooOooo) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.o000O000
    public final void OooO00o(o000O000.OooO00o oooO00o) {
        this.f22105OooOo0O.add(oooO00o);
    }

    @Override // androidx.media3.ui.o000O000
    public final void OooO0O0(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
    }

    public final boolean OooO0Oo(long j) {
        long j2 = this.f22113OooOooo;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f22110OooOoo ? this.f22112OooOooO : this.f22114Oooo000;
        long jOooOO0 = o000OO00.OooOO0(j3 + j, 0L, j2);
        if (jOooOO0 == j3) {
            return false;
        }
        if (this.f22110OooOoo) {
            OooO0oo(jOooOO0);
        } else {
            OooO0o0(jOooOO0);
        }
        OooO0oO();
        return true;
    }

    public final void OooO0o(boolean z) {
        removeCallbacks(this.f22103OooOo0);
        this.f22110OooOoo = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<o000O000.OooO00o> it = this.f22105OooOo0O.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.f22112OooOooO, z);
        }
    }

    public final void OooO0o0(long j) {
        this.f22112OooOooO = j;
        this.f22110OooOoo = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<o000O000.OooO00o> it = this.f22105OooOo0O.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    public final void OooO0oO() {
        Rect rect = this.f22088OooO0o;
        Rect rect2 = this.f22089OooO0o0;
        rect.set(rect2);
        Rect rect3 = this.f22090OooO0oO;
        rect3.set(rect2);
        long j = this.f22110OooOoo ? this.f22112OooOooO : this.f22114Oooo000;
        if (this.f22113OooOooo > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f22115Oooo00O) / this.f22113OooOooo)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f22113OooOooo)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f22087OooO0Oo);
    }

    public final void OooO0oo(long j) {
        if (this.f22112OooOooO == j) {
            return;
        }
        this.f22112OooOooO = j;
        Iterator<o000O000.OooO00o> it = this.f22105OooOo0O.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22093OooOO0O;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // androidx.media3.ui.o000O000
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f22089OooO0o0.width() / this.f22102OooOo);
        if (iWidth != 0) {
            long j = this.f22113OooOooo;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iWidth);
            }
        }
        return LongCompanionObject.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22093OooOO0O;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f22089OooO0o0;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        long j = this.f22113OooOooo;
        Paint paint = this.f22092OooOO0;
        Rect rect2 = this.f22090OooO0oO;
        int i2 = this.f22094OooOO0o;
        if (j <= 0) {
            float f = i2 / 2.0f;
            canvas.drawRoundRect(rect.left, iCenterY, rect.right, i, f, f, paint);
        } else {
            Rect rect3 = this.f22088OooO0o;
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
                canvas.drawRoundRect(iMax2, iCenterY, i4, i, f3, f3, this.f22086OooO);
            }
            if (rect2.width() > 0) {
                float f4 = i2 / 2.0f;
                canvas.drawRoundRect(rect2.left, iCenterY, rect2.right, i, f4, f4, this.f22091OooO0oo);
            }
        }
        if (this.f22113OooOooo > 0) {
            int iOooO = o000OO00.OooO(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f22093OooOO0O;
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
            drawable.setBounds(iOooO - intrinsicWidth, iCenterY2 - intrinsicHeight, iOooO + intrinsicWidth, iCenterY2 + intrinsicHeight);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f22110OooOoo || z) {
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
        if (this.f22113OooOooo <= 0) {
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
                            o0OoOo0 o0oooo1 = this.f22103OooOo0;
                            removeCallbacks(o0oooo1);
                            postDelayed(o0oooo1, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (OooO0Oo(positionIncrement)) {
                            o0OoOo0 o0oooo2 = this.f22103OooOo0;
                            removeCallbacks(o0oooo2);
                            postDelayed(o0oooo2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f22110OooOoo) {
                            OooO0o(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f22110OooOoo) {
                OooO0o(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f22096OooOOO0;
        int i8 = (i6 - i7) / 2;
        int i9 = this.f22094OooOO0o;
        int i10 = (i6 - i9) / 2;
        Rect rect2 = this.f22087OooO0Oo;
        rect2.set(paddingLeft, i8, paddingRight, i7 + i8);
        int i11 = rect2.left;
        int i12 = this.f22100OooOOo0;
        this.f22089OooO0o0.set(i11 + i12, i10, rect2.right - i12, i9 + i10);
        if (o000OO00.f34965OooO00o >= 29 && ((rect = this.f22111OooOoo0) == null || rect.width() != i5 || this.f22111OooOoo0.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f22111OooOoo0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        OooO0oO();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f22096OooOOO0;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f22093OooOO0O;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f22093OooOO0O;
        if (drawable != null) {
            if (o000OO00.f34965OooO00o >= 23 && drawable.setLayoutDirection(i)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f22113OooOooo > 0) {
            Point point = this.f22106OooOo0o;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f22090OooO0oO;
            Rect rect2 = this.f22089OooO0o0;
            if (action == 0) {
                int i3 = i;
                if (this.f22087OooO0Oo.contains(i3, i2)) {
                    rect.right = o000OO00.OooO(i3, rect2.left, rect2.right);
                    OooO0o0(getScrubberPosition());
                    OooO0oO();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f22110OooOoo) {
                    OooO0o(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f22110OooOoo) {
                        OooO0o(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f22110OooOoo) {
                if (i2 < this.f22099OooOOo) {
                    int i4 = this.f22109OooOoOO;
                    rect.right = o000OO00.OooO(OooO00o.OooO00o(i, i4, 3, i4), rect2.left, rect2.right);
                } else {
                    this.f22109OooOoOO = i;
                    rect.right = o000OO00.OooO(i, rect2.left, rect2.right);
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
        if (this.f22113OooOooo <= 0) {
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

    @Override // androidx.media3.ui.o000O000
    public void setBufferedPosition(long j) {
        if (this.f22115Oooo00O == j) {
            return;
        }
        this.f22115Oooo00O = j;
        OooO0oO();
    }

    @Override // androidx.media3.ui.o000O000
    public void setDuration(long j) {
        if (this.f22113OooOooo == j) {
            return;
        }
        this.f22113OooOooo = j;
        if (this.f22110OooOoo && j == -9223372036854775807L) {
            OooO0o(true);
        }
        OooO0oO();
    }

    @Override // android.view.View, androidx.media3.ui.o000O000
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f22110OooOoo || z) {
            return;
        }
        OooO0o(true);
    }

    public void setKeyCountIncrement(int i) {
        o00O0O.OooO00o(i > 0);
        this.f22108OooOoO0 = i;
        this.f22107OooOoO = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        o00O0O.OooO00o(j > 0);
        this.f22108OooOoO0 = -1;
        this.f22107OooOoO = j;
    }

    @Override // androidx.media3.ui.o000O000
    public void setPosition(long j) {
        if (this.f22114Oooo000 == j) {
            return;
        }
        this.f22114Oooo000 = j;
        setContentDescription(getProgressText());
        OooO0oO();
    }

    public YLTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [o0OOo00o.o0OoOo0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public YLTimeBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        ?? r2;
        super(context, attributeSet, i);
        this.f22087OooO0Oo = new Rect();
        this.f22089OooO0o0 = new Rect();
        this.f22088OooO0o = new Rect();
        this.f22090OooO0oO = new Rect();
        Paint paint = new Paint();
        this.f22091OooO0oo = paint;
        Paint paint2 = new Paint();
        this.f22086OooO = paint2;
        Paint paint3 = new Paint();
        this.f22092OooOO0 = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        this.f22105OooOo0O = new CopyOnWriteArraySet<>();
        this.f22106OooOo0o = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f22102OooOo = f;
        this.f22099OooOOo = OooO0OO(f, -50);
        int iOooO0OO = OooO0OO(f, 4);
        int iOooO0OO2 = OooO0OO(f, 26);
        int iOooO0OO3 = OooO0OO(f, 12);
        int iOooO0OO4 = OooO0OO(f, 0);
        int iOooO0OO5 = OooO0OO(f, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, OooO.DefaultTimeBar, i, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(OooO.DefaultTimeBar_scrubber_drawable);
                this.f22093OooOO0O = drawable;
                if (drawable != null) {
                    int i2 = o000OO00.f34965OooO00o;
                    if (i2 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i2 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iOooO0OO2 = Math.max(drawable.getMinimumHeight(), iOooO0OO2);
                }
                this.f22094OooOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.DefaultTimeBar_bar_height, iOooO0OO);
                this.f22096OooOOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.DefaultTimeBar_touch_target_height, iOooO0OO2);
                this.f22095OooOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.DefaultTimeBar_scrubber_enabled_size, iOooO0OO3);
                this.f22097OooOOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.DefaultTimeBar_scrubber_disabled_size, iOooO0OO4);
                this.f22098OooOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooO.DefaultTimeBar_scrubber_dragged_size, iOooO0OO5);
                int i3 = typedArrayObtainStyledAttributes.getInt(OooO.DefaultTimeBar_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(OooO.DefaultTimeBar_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(OooO.DefaultTimeBar_buffered_color, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(OooO.DefaultTimeBar_unplayed_color, 872415231);
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
            this.f22094OooOO0o = iOooO0OO;
            this.f22096OooOOO0 = iOooO0OO2;
            this.f22095OooOOO = iOooO0OO3;
            this.f22097OooOOOO = iOooO0OO4;
            this.f22098OooOOOo = iOooO0OO5;
            paint.setColor(-1);
            paint4.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            this.f22093OooOO0O = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f22101OooOOoo = sb;
        this.f22104OooOo00 = new Formatter(sb, Locale.getDefault());
        this.f22103OooOo0 = new Runnable() { // from class: o0OOo00o.o0OoOo0
            @Override // java.lang.Runnable
            public final void run() {
                int i7 = YLTimeBar.f22085Oooo00o;
                this.f43072OooO0Oo.OooO0o(false);
            }
        };
        Drawable drawable2 = this.f22093OooOO0O;
        if (drawable2 != null) {
            r2 = 1;
            this.f22100OooOOo0 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            r2 = 1;
            this.f22100OooOOo0 = (Math.max(this.f22097OooOOOO, Math.max(this.f22095OooOOO, this.f22098OooOOOo)) + 1) / 2;
        }
        this.f22113OooOooo = -9223372036854775807L;
        this.f22107OooOoO = -9223372036854775807L;
        this.f22108OooOoO0 = 20;
        setFocusable((boolean) r2);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(r2);
        }
    }
}
