package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.KotlinVersion;
import p400o0Oo0O.OooO;
import p400o0Oo0O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public class HorizontalProgressWheelView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Paint f20447Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Rect f20448Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO00o f20449Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f20450Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20451OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f20452OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Paint f20453OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f20454OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f20455OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f20456OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f20457o000oOoO;

    public interface OooO00o {
        void OooO00o();

        void OooO0O0(float f);

        void OooO0OO();
    }

    public HorizontalProgressWheelView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f20448Oooo0o);
        int iWidth = this.f20448Oooo0o.width();
        int i = this.f20452OoooO0;
        int i2 = this.f20451OoooO;
        int i3 = iWidth / (i + i2);
        float f = this.f20457o000oOoO % (i2 + i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                this.f20447Oooo.setAlpha((int) ((i4 / i5) * 255.0f));
            } else if (i4 > (i3 * 3) / 4) {
                this.f20447Oooo.setAlpha((int) (((i3 - i4) / i5) * 255.0f));
            } else {
                this.f20447Oooo.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            float f2 = -f;
            Rect rect = this.f20448Oooo0o;
            float f3 = rect.left + f2 + ((this.f20452OoooO0 + this.f20451OoooO) * i4);
            float fCenterY = rect.centerY() - (this.f20454OoooO0O / 4.0f);
            Rect rect2 = this.f20448Oooo0o;
            canvas.drawLine(f3, fCenterY, f2 + rect2.left + ((this.f20452OoooO0 + this.f20451OoooO) * i4), (this.f20454OoooO0O / 4.0f) + rect2.centerY(), this.f20447Oooo);
        }
        canvas.drawLine(this.f20448Oooo0o.centerX(), this.f20448Oooo0o.centerY() - (this.f20454OoooO0O / 2.0f), this.f20448Oooo0o.centerX(), (this.f20454OoooO0O / 2.0f) + this.f20448Oooo0o.centerY(), this.f20453OoooO00);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20450Oooo0oo = motionEvent.getX();
        } else if (action == 1) {
            OooO00o oooO00o = this.f20449Oooo0oO;
            if (oooO00o != null) {
                this.f20455OoooOO0 = false;
                oooO00o.OooO00o();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f20450Oooo0oo;
            if (x != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (!this.f20455OoooOO0) {
                    this.f20455OoooOO0 = true;
                    OooO00o oooO00o2 = this.f20449Oooo0oO;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO0OO();
                    }
                }
                this.f20457o000oOoO -= x;
                postInvalidate();
                this.f20450Oooo0oo = motionEvent.getX();
                OooO00o oooO00o3 = this.f20449Oooo0oO;
                if (oooO00o3 != null) {
                    oooO00o3.OooO0O0(-x);
                }
            }
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int i) {
        this.f20456OoooOOO = i;
        invalidate();
    }

    public void setScrollingListener(OooO00o oooO00o) {
        this.f20449Oooo0oO = oooO00o;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20448Oooo0o = new Rect();
        this.f20456OoooOOO = o000O000.OooO00o.OooO0O0(getContext(), OooO.ucrop_color_widget_rotate_mid_line);
        this.f20452OoooO0 = getContext().getResources().getDimensionPixelSize(OooOO0.ucrop_width_horizontal_wheel_progress_line);
        this.f20454OoooO0O = getContext().getResources().getDimensionPixelSize(OooOO0.ucrop_height_horizontal_wheel_progress_line);
        this.f20451OoooO = getContext().getResources().getDimensionPixelSize(OooOO0.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f20447Oooo = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f20447Oooo.setStrokeWidth(this.f20452OoooO0);
        this.f20447Oooo.setColor(getResources().getColor(OooO.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f20447Oooo);
        this.f20453OoooO00 = paint2;
        paint2.setColor(this.f20456OoooOOO);
        this.f20453OoooO00.setStrokeCap(Paint.Cap.ROUND);
        this.f20453OoooO00.setStrokeWidth(getContext().getResources().getDimensionPixelSize(OooOO0.ucrop_width_middle_wheel_progress_line));
    }

    @TargetApi(21)
    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20448Oooo0o = new Rect();
    }
}
