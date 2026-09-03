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
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class DefaultTimeBar extends View implements o000O000 {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f9532OoooO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f9533OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f9534OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f9535OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f9536OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Rect f9537OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f9538OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Paint f9539OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Paint f9540OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Paint f9541OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final Drawable f9542OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Paint f9543OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f9544OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f9545OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f9546OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f9547OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f9548OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final StringBuilder f9549OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f9550OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f9551OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f9552OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f9553OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0O0 f9554OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Formatter f9555OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final CopyOnWriteArraySet<o000O000.OooO00o> f9556OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float f9557OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Point f9558OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f9559OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f9560OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f9561Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f9562Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f9563Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Rect f9564Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final ValueAnimator f9565Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f9566Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f9567Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f9568Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public long f9569Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f9570Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f9571Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public boolean[] f9572OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public long[] f9573OoooO00;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public static int OooO0OO(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f9560OooOooo;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f9568Oooo0o;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f9559OooOooO);
    }

    private String getProgressText() {
        return o00.OooOoO0(this.f9549OooOo, this.f9555OooOoO0, this.f9570Oooo0oO);
    }

    private long getScrubberPosition() {
        Rect rect = this.f9536OooO0o0;
        if (rect.width() <= 0 || this.f9568Oooo0o == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f9537OooO0oO.width()) * this.f9568Oooo0o) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.o000O000
    public final void OooO00o(o000O000.OooO00o oooO00o) {
        this.f9556OooOoOO.add(oooO00o);
    }

    @Override // androidx.media3.ui.o000O000
    public final void OooO0O0(@Nullable long[] jArr, @Nullable boolean[] zArr, int i) {
        p080o000OoO.o00Oo0.OooO00o(i == 0 || !(jArr == null || zArr == null));
        this.f9561Oooo = i;
        this.f9573OoooO00 = jArr;
        this.f9572OoooO0 = zArr;
        OooO0oO();
    }

    public final boolean OooO0Oo(long j) {
        long j2 = this.f9568Oooo0o;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f9567Oooo0OO ? this.f9569Oooo0o0 : this.f9570Oooo0oO;
        long jOooOO0 = o00.OooOO0(j3 + j, 0L, j2);
        if (jOooOO0 == j3) {
            return false;
        }
        if (this.f9567Oooo0OO) {
            OooO0oo(jOooOO0);
        } else {
            OooO0o0(jOooOO0);
        }
        OooO0oO();
        return true;
    }

    public final void OooO0o(boolean z) {
        removeCallbacks(this.f9554OooOoO);
        this.f9567Oooo0OO = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<o000O000.OooO00o> it = this.f9556OooOoOO.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.f9569Oooo0o0, z);
        }
    }

    public final void OooO0o0(long j) {
        this.f9569Oooo0o0 = j;
        this.f9567Oooo0OO = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<o000O000.OooO00o> it = this.f9556OooOoOO.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    public final void OooO0oO() {
        Rect rect = this.f9535OooO0o;
        Rect rect2 = this.f9536OooO0o0;
        rect.set(rect2);
        Rect rect3 = this.f9537OooO0oO;
        rect3.set(rect2);
        long j = this.f9567Oooo0OO ? this.f9569Oooo0o0 : this.f9570Oooo0oO;
        if (this.f9568Oooo0o > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f9571Oooo0oo) / this.f9568Oooo0o)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f9568Oooo0o)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f9534OooO0Oo);
    }

    public final void OooO0oo(long j) {
        if (this.f9569Oooo0o0 == j) {
            return;
        }
        this.f9569Oooo0o0 = j;
        Iterator<o000O000.OooO00o> it = this.f9556OooOoOO.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9542OooOOO;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // androidx.media3.ui.o000O000
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f9536OooO0o0.width() / this.f9557OooOoo);
        if (iWidth != 0) {
            long j = this.f9568Oooo0o;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iWidth);
            }
        }
        return LongCompanionObject.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9542OooOOO;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.f9536OooO0o0;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iHeight + iCenterY;
        long j = this.f9568Oooo0o;
        Paint paint = this.f9539OooOO0;
        Rect rect2 = this.f9537OooO0oO;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f9535OooO0o;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f9533OooO);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.f9538OooO0oo);
            }
            if (this.f9561Oooo != 0) {
                long[] jArr = this.f9573OoooO00;
                jArr.getClass();
                boolean[] zArr = this.f9572OoooO0;
                zArr.getClass();
                int i6 = this.f9546OooOOo;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.f9561Oooo) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * o00.OooOO0(jArr[i9], 0L, this.f9568Oooo0o)) / this.f9568Oooo0o)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.f9541OooOO0o : this.f9540OooOO0O);
                    i9++;
                    i8 = i8;
                    i6 = i6;
                }
            }
        }
        if (this.f9568Oooo0o > 0) {
            int iOooO = o00.OooO(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f9542OooOOO;
            if (drawable == null) {
                if (this.f9567Oooo0OO || isFocused()) {
                    i = this.f9550OooOo0;
                } else {
                    i = isEnabled() ? this.f9548OooOOoo : this.f9551OooOo00;
                }
                canvas.drawCircle(iOooO, iCenterY2, (int) ((i * this.f9562Oooo0) / 2.0f), this.f9543OooOOO0);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f9562Oooo0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f9562Oooo0)) / 2;
                drawable.setBounds(iOooO - intrinsicWidth, iCenterY2 - intrinsicHeight, iOooO + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f9567Oooo0OO || z) {
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
        if (this.f9568Oooo0o <= 0) {
            return;
        }
        if (o00.f34910OooO00o >= 21) {
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
                            OooO0O0 oooO0O0 = this.f9554OooOoO;
                            removeCallbacks(oooO0O0);
                            postDelayed(oooO0O0, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (OooO0Oo(positionIncrement)) {
                            OooO0O0 oooO0O1 = this.f9554OooOoO;
                            removeCallbacks(oooO0O1);
                            postDelayed(oooO0O1, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f9567Oooo0OO) {
                            OooO0o(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f9567Oooo0OO) {
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
        int i7 = this.f9566Oooo0O0 ? 0 : this.f9552OooOo0O;
        int i8 = this.f9547OooOOo0;
        int i9 = this.f9544OooOOOO;
        int i10 = this.f9545OooOOOo;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f9534OooO0Oo;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f9536OooO0o0.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (o00.f34910OooO00o >= 29 && ((rect = this.f9564Oooo00O) == null || rect.width() != i5 || this.f9564Oooo00O.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f9564Oooo00O = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        OooO0oO();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f9545OooOOOo;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f9542OooOOO;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f9542OooOOO;
        if (drawable != null) {
            if (o00.f34910OooO00o >= 23 && drawable.setLayoutDirection(i)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f9568Oooo0o > 0) {
            Point point = this.f9558OooOoo0;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f9537OooO0oO;
            Rect rect2 = this.f9536OooO0o0;
            if (action == 0) {
                int i3 = i;
                if (this.f9534OooO0Oo.contains(i3, i2)) {
                    rect.right = o00.OooO(i3, rect2.left, rect2.right);
                    OooO0o0(getScrubberPosition());
                    OooO0oO();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f9567Oooo0OO) {
                    OooO0o(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f9567Oooo0OO) {
                        OooO0o(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f9567Oooo0OO) {
                if (i2 < this.f9553OooOo0o) {
                    int i4 = this.f9563Oooo000;
                    rect.right = o00.OooO(androidx.appcompat.widget.OooO00o.OooO00o(i, i4, 3, i4), rect2.left, rect2.right);
                } else {
                    this.f9563Oooo000 = i;
                    rect.right = o00.OooO(i, rect2.left, rect2.right);
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
        if (this.f9568Oooo0o <= 0) {
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
        this.f9540OooOO0O.setColor(i);
        invalidate(this.f9534OooO0Oo);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.f9533OooO.setColor(i);
        invalidate(this.f9534OooO0Oo);
    }

    @Override // androidx.media3.ui.o000O000
    public void setBufferedPosition(long j) {
        if (this.f9571Oooo0oo == j) {
            return;
        }
        this.f9571Oooo0oo = j;
        OooO0oO();
    }

    @Override // androidx.media3.ui.o000O000
    public void setDuration(long j) {
        if (this.f9568Oooo0o == j) {
            return;
        }
        this.f9568Oooo0o = j;
        if (this.f9567Oooo0OO && j == -9223372036854775807L) {
            OooO0o(true);
        }
        OooO0oO();
    }

    @Override // android.view.View, androidx.media3.ui.o000O000
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f9567Oooo0OO || z) {
            return;
        }
        OooO0o(true);
    }

    public void setKeyCountIncrement(int i) {
        p080o000OoO.o00Oo0.OooO00o(i > 0);
        this.f9559OooOooO = i;
        this.f9560OooOooo = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        p080o000OoO.o00Oo0.OooO00o(j > 0);
        this.f9559OooOooO = -1;
        this.f9560OooOooo = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.f9541OooOO0o.setColor(i);
        invalidate(this.f9534OooO0Oo);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.f9538OooO0oo.setColor(i);
        invalidate(this.f9534OooO0Oo);
    }

    @Override // androidx.media3.ui.o000O000
    public void setPosition(long j) {
        if (this.f9570Oooo0oO == j) {
            return;
        }
        this.f9570Oooo0oO = j;
        setContentDescription(getProgressText());
        OooO0oO();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.f9543OooOOO0.setColor(i);
        invalidate(this.f9534OooO0Oo);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.f9539OooOO0.setColor(i);
        invalidate(this.f9534OooO0Oo);
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
        this.f9534OooO0Oo = new Rect();
        this.f9536OooO0o0 = new Rect();
        this.f9535OooO0o = new Rect();
        this.f9537OooO0oO = new Rect();
        Paint paint = new Paint();
        this.f9538OooO0oo = paint;
        Paint paint2 = new Paint();
        this.f9533OooO = paint2;
        Paint paint3 = new Paint();
        this.f9539OooOO0 = paint3;
        Paint paint4 = new Paint();
        this.f9540OooOO0O = paint4;
        Paint paint5 = new Paint();
        this.f9541OooOO0o = paint5;
        Paint paint6 = new Paint();
        this.f9543OooOOO0 = paint6;
        paint6.setAntiAlias(true);
        this.f9556OooOoOO = new CopyOnWriteArraySet<>();
        this.f9558OooOoo0 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f9557OooOoo = f;
        this.f9553OooOo0o = OooO0OO(f, -50);
        int iOooO0OO = OooO0OO(f, 4);
        int iOooO0OO2 = OooO0OO(f, 26);
        int iOooO0OO3 = OooO0OO(f, 4);
        int iOooO0OO4 = OooO0OO(f, 12);
        int iOooO0OO5 = OooO0OO(f, 0);
        int iOooO0OO6 = OooO0OO(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o0000O0.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(o0000O0.DefaultTimeBar_scrubber_drawable);
                this.f9542OooOOO = drawable;
                if (drawable != null) {
                    int i3 = o00.f34910OooO00o;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iOooO0OO2 = Math.max(drawable.getMinimumHeight(), iOooO0OO2);
                }
                this.f9544OooOOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000O0.DefaultTimeBar_bar_height, iOooO0OO);
                this.f9545OooOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000O0.DefaultTimeBar_touch_target_height, iOooO0OO2);
                this.f9547OooOOo0 = typedArrayObtainStyledAttributes.getInt(o0000O0.DefaultTimeBar_bar_gravity, 0);
                this.f9546OooOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000O0.DefaultTimeBar_ad_marker_width, iOooO0OO3);
                this.f9548OooOOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000O0.DefaultTimeBar_scrubber_enabled_size, iOooO0OO4);
                this.f9551OooOo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000O0.DefaultTimeBar_scrubber_disabled_size, iOooO0OO5);
                this.f9550OooOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0000O0.DefaultTimeBar_scrubber_dragged_size, iOooO0OO6);
                int i4 = typedArrayObtainStyledAttributes.getInt(o0000O0.DefaultTimeBar_played_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(o0000O0.DefaultTimeBar_scrubber_color, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(o0000O0.DefaultTimeBar_buffered_color, -855638017);
                int i7 = typedArrayObtainStyledAttributes.getInt(o0000O0.DefaultTimeBar_unplayed_color, 872415231);
                int i8 = typedArrayObtainStyledAttributes.getInt(o0000O0.DefaultTimeBar_ad_marker_color, -1291845888);
                int i9 = typedArrayObtainStyledAttributes.getInt(o0000O0.DefaultTimeBar_played_ad_marker_color, 872414976);
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
            this.f9544OooOOOO = iOooO0OO;
            this.f9545OooOOOo = iOooO0OO2;
            this.f9547OooOOo0 = 0;
            this.f9546OooOOo = iOooO0OO3;
            this.f9548OooOOoo = iOooO0OO4;
            this.f9551OooOo00 = iOooO0OO5;
            this.f9550OooOo0 = iOooO0OO6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f9542OooOOO = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f9549OooOo = sb;
        this.f9555OooOoO0 = new Formatter(sb, Locale.getDefault());
        this.f9554OooOoO = new OooO0O0(0, this);
        Drawable drawable2 = this.f9542OooOOO;
        if (drawable2 != null) {
            this.f9552OooOo0O = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f9552OooOo0O = (Math.max(this.f9551OooOo00, Math.max(this.f9548OooOOoo, this.f9550OooOo0)) + 1) / 2;
        }
        this.f9562Oooo0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9565Oooo00o = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.OooO0OO
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10 = DefaultTimeBar.f9532OoooO0O;
                DefaultTimeBar defaultTimeBar = this.f9630OooO0Oo;
                defaultTimeBar.getClass();
                defaultTimeBar.f9562Oooo0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f9534OooO0Oo);
            }
        });
        this.f9568Oooo0o = -9223372036854775807L;
        this.f9560OooOooo = -9223372036854775807L;
        this.f9559OooOooO = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
