package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f9609Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f9610OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f9611OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f9612OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f9613Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f9614Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final Paint f9615OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final Rect f9616Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f9617o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f9618o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f9619o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public float f9620o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float f9621o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f9622o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f9623oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f9624ooOO;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f9630Oooo0o;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f9630Oooo0o;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void OooO0OO(int i, float f, boolean z) {
        Rect rect = this.f9616Ooooooo;
        int height = getHeight();
        int left = this.f9632Oooo0oo.getLeft() - this.f9613Oooooo;
        int right = this.f9632Oooo0oo.getRight() + this.f9613Oooooo;
        int i2 = height - this.f9610OooooO0;
        rect.set(left, i2, right, height);
        super.OooO0OO(i, f, z);
        this.f9622o0OoOo0 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f9632Oooo0oo.getLeft() - this.f9613Oooooo, i2, this.f9632Oooo0oo.getRight() + this.f9613Oooooo, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f9624ooOO;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f9614Oooooo0);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f9609Ooooo0o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f9632Oooo0oo.getLeft() - this.f9613Oooooo;
        int right = this.f9632Oooo0oo.getRight() + this.f9613Oooooo;
        int i = height - this.f9610OooooO0;
        this.f9615OoooooO.setColor((this.f9622o0OoOo0 << 24) | (this.f9609Ooooo0o & 16777215));
        float f = height;
        canvas.drawRect(left, i, right, f, this.f9615OoooooO);
        if (this.f9624ooOO) {
            this.f9615OoooooO.setColor((-16777216) | (this.f9609Ooooo0o & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f9618o00Oo0, getWidth() - getPaddingRight(), f, this.f9615OoooooO);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f9619o00Ooo) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f9620o00o0O = x;
            this.f9621o00ooo = y;
            this.f9619o00Ooo = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f9620o00o0O) > this.f9623oo000o || Math.abs(y - this.f9621o00ooo) > this.f9623oo000o)) {
                this.f9619o00Ooo = true;
            }
        } else if (x < this.f9632Oooo0oo.getLeft() - this.f9613Oooooo) {
            ViewPager viewPager = this.f9630Oooo0o;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > this.f9632Oooo0oo.getRight() + this.f9613Oooooo) {
            ViewPager viewPager2 = this.f9630Oooo0o;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
        if (this.f9617o00O0O) {
            return;
        }
        this.f9624ooOO = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f9617o00O0O) {
            return;
        }
        this.f9624ooOO = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (this.f9617o00O0O) {
            return;
        }
        this.f9624ooOO = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f9624ooOO = z;
        this.f9617o00O0O = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f9611OooooOO;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.f9609Ooooo0o = i;
        this.f9615OoooooO.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(o000O000.OooO00o.OooO0O0(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f9612OooooOo;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f9615OoooooO = paint;
        this.f9616Ooooooo = new Rect();
        this.f9622o0OoOo0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f9624ooOO = false;
        this.f9617o00O0O = false;
        int i = this.f9641OoooOoO;
        this.f9609Ooooo0o = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f9610OooooO0 = (int) ((3.0f * f) + 0.5f);
        this.f9611OooooOO = (int) ((6.0f * f) + 0.5f);
        this.f9612OooooOo = (int) (64.0f * f);
        this.f9613Oooooo = (int) ((16.0f * f) + 0.5f);
        this.f9618o00Oo0 = (int) ((1.0f * f) + 0.5f);
        this.f9614Oooooo0 = (int) ((f * 32.0f) + 0.5f);
        this.f9623oo000o = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f9631Oooo0oO.setFocusable(true);
        this.f9631Oooo0oO.setOnClickListener(new OooO00o());
        this.f9629Oooo.setFocusable(true);
        this.f9629Oooo.setOnClickListener(new OooO0O0());
        if (getBackground() == null) {
            this.f9624ooOO = true;
        }
    }
}
