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
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes2.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f8257OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f8258OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f8259OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f8260OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f8261OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Paint f8262OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f8263OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Rect f8264OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f8265OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f8266OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f8267OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int f8268OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f8269Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f8270Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f8271Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f8272Oooo00o;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f8278OooO0Oo;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f8278OooO0Oo;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void OooO0OO(float f, int i, boolean z) {
        int height = getHeight();
        TextView textView = this.f8279OooO0o;
        int left = textView.getLeft();
        int i2 = this.f8263OooOoO0;
        int right = textView.getRight() + i2;
        int i3 = height - this.f8258OooOo0;
        Rect rect = this.f8264OooOoOO;
        rect.set(left - i2, i3, right, height);
        super.OooO0OO(f, i, z);
        this.f8266OooOoo0 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f8265OooOoo;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f8257OooOo);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f8259OooOo00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f8279OooO0o;
        int left = textView.getLeft();
        int i = this.f8263OooOoO0;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.f8258OooOo0;
        Paint paint = this.f8262OooOoO;
        paint.setColor((this.f8266OooOoo0 << 24) | (this.f8259OooOo00 & 16777215));
        float f = right;
        float f2 = height;
        canvas.drawRect(i2, i3, f, f2, paint);
        if (this.f8265OooOoo) {
            paint.setColor((this.f8259OooOo00 & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f8268OooOooo, getWidth() - getPaddingRight(), f2, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f8270Oooo000) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f8271Oooo00O = x;
            this.f8272Oooo00o = y;
            this.f8270Oooo000 = false;
        } else if (action == 1) {
            TextView textView = this.f8279OooO0o;
            int left = textView.getLeft();
            int i = this.f8263OooOoO0;
            if (x < left - i) {
                ViewPager viewPager = this.f8278OooO0Oo;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x > textView.getRight() + i) {
                ViewPager viewPager2 = this.f8278OooO0Oo;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x - this.f8271Oooo00O);
            int i2 = this.f8269Oooo0;
            if (fAbs > i2 || Math.abs(y - this.f8272Oooo00o) > i2) {
                this.f8270Oooo000 = true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
        if (this.f8267OooOooO) {
            return;
        }
        this.f8265OooOoo = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f8267OooOooO) {
            return;
        }
        this.f8265OooOoo = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (this.f8267OooOooO) {
            return;
        }
        this.f8265OooOoo = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f8265OooOoo = z;
        this.f8267OooOooO = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f8260OooOo0O;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.f8259OooOo00 = i;
        this.f8262OooOoO.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5271OooO00o;
        setTabIndicatorColor(ContextCompat.OooO0o.OooO00o(context, i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f8261OooOo0o;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f8262OooOoO = paint;
        this.f8264OooOoOO = new Rect();
        this.f8266OooOoo0 = 255;
        this.f8265OooOoo = false;
        this.f8267OooOooO = false;
        int i = this.f8290OooOOo0;
        this.f8259OooOo00 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f8258OooOo0 = (int) ((3.0f * f) + 0.5f);
        this.f8260OooOo0O = (int) ((6.0f * f) + 0.5f);
        this.f8261OooOo0o = (int) (64.0f * f);
        this.f8263OooOoO0 = (int) ((16.0f * f) + 0.5f);
        this.f8268OooOooo = (int) ((1.0f * f) + 0.5f);
        this.f8257OooOo = (int) ((f * 32.0f) + 0.5f);
        this.f8269Oooo0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f8280OooO0o0.setFocusable(true);
        this.f8280OooO0o0.setOnClickListener(new OooO00o());
        this.f8281OooO0oO.setFocusable(true);
        this.f8281OooO0oO.setOnClickListener(new OooO0O0());
        if (getBackground() == null) {
            this.f8265OooOoo = true;
        }
    }
}
