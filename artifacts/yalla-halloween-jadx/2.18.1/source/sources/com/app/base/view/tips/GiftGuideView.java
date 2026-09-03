package com.app.base.view.tips;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p189o00o00oO.o0OO00O;
import p206o00o0o0o.o000OO0O;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0014\u0015\u0016B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0017"}, d2 = {"Lcom/app/base/view/tips/GiftGuideView;", "Landroid/view/ViewGroup;", "Landroid/view/View$OnClickListener;", "Lcom/app/base/view/tips/GiftGuideView$OooO0OO;", "adapter", "", "setHollowAdapter", "Lcom/app/base/view/tips/GiftGuideView$OooO0O0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnDismissListener", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "OooO0OO", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftGuideView extends ViewGroup implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooO0OO f12230Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final View f12231Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Paint f12232Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f12233Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f12234OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12235OoooO00;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<Rect> f12236OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f12237OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f12238OooO0OO;

        public OooO00o(@NotNull List<Rect> hollowRect) {
            Intrinsics.checkNotNullParameter(hollowRect, "hollowRect");
            this.f12236OooO00o = hollowRect;
            this.f12237OooO0O0 = OooOo00.OooO00o(20.0f);
            this.f12238OooO0OO = oo000o.OooO0o0();
        }

        @Override // com.app.base.view.tips.GiftGuideView.OooO0OO
        public final void OooO00o(@NotNull View next, int i) {
            Intrinsics.checkNotNullParameter(next, "next");
            int i2 = R.drawable.pic_gift_tips_next;
            if (i != 0 && i != 1 && i == 2) {
                i2 = R.drawable.pic_gift_guide_get_it;
            }
            next.setBackgroundResource(i2);
        }

        public final Pair<Integer, Integer> OooO0O0(Rect rect, Canvas canvas, int i) {
            Drawable drawableOooO0O0 = o000O0O0.OooO0O0(i);
            int iOooO00o = OooOo00.OooO00o(6.0f);
            int iWidth = rect.width() + iOooO00o;
            int iHeight = rect.height() + iOooO00o;
            int iWidth2 = rect.left - ((iWidth - rect.width()) / 2);
            int iHeight2 = rect.top - ((iHeight - rect.height()) / 2);
            drawableOooO0O0.setBounds(new Rect(iWidth2, iHeight2, iWidth + iWidth2, iHeight + iHeight2));
            drawableOooO0O0.draw(canvas);
            return new Pair<>(Integer.valueOf(iWidth2), Integer.valueOf(iHeight2));
        }

        public final void OooO0OO(Rect rect) {
            int iOooO0oo = o000OO0O.OooO0oo();
            int iWidth = rect.width();
            int i = iOooO0oo - rect.left;
            rect.right = i;
            rect.left = i - iWidth;
        }
    }

    public interface OooO0O0 {
    }

    @StabilityInferred(parameters = 0)
    public static abstract class OooO0OO {
        public abstract void OooO00o(@NotNull View view, int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGuideView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(getContext());
        this.f12231Oooo0o = view;
        addView(view);
        Paint paint = new Paint();
        this.f12232Oooo0oO = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        setBackgroundColor(o000O0O0.OooO00o(R.color.color_alpha_70));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f12235OoooO00;
        if (i == 0) {
            o0O00000.OooO0OO("Select_gift_next");
        } else if (i == 1) {
            o0O00000.OooO0OO("Select_name_next");
        } else if (i == 2) {
            o0O00000.OooO0OO("Send_gift_got_it");
        }
        int i2 = this.f12235OoooO00;
        if (i2 == this.f12233Oooo0oo - 1) {
            OooO0O0 oooO0O0 = this.f12234OoooO0;
            if (oooO0O0 != null) {
                com.app.base.view.tips.OooO00o.OooOOO((com.app.base.view.tips.OooO00o) ((o0OO00O) oooO0O0).f33051OooO0o0);
                return;
            }
            return;
        }
        this.f12235OoooO00 = i2 + 1;
        OooO0OO oooO0OO = this.f12230Oooo;
        Intrinsics.checkNotNull(oooO0OO);
        oooO0OO.OooO00o(this.f12231Oooo0o, this.f12235OoooO00);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        OooO0OO oooO0OO = this.f12230Oooo;
        if (oooO0OO == null) {
            throw new IllegalStateException("Hollow Adapter can not be Null");
        }
        Intrinsics.checkNotNull(oooO0OO);
        Rect hollowRect = ((OooO00o) oooO0OO).f12236OooO00o.get(this.f12235OoooO00);
        canvas.save();
        canvas.clipRect(hollowRect);
        canvas.drawRect(hollowRect, this.f12232Oooo0oO);
        canvas.restore();
        OooO0OO oooO0OO2 = this.f12230Oooo;
        Intrinsics.checkNotNull(oooO0OO2);
        int i = this.f12235OoooO00;
        OooO00o oooO00o = (OooO00o) oooO0OO2;
        Objects.requireNonNull(oooO00o);
        Intrinsics.checkNotNullParameter(hollowRect, "hollowRect");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (i == 0) {
            oooO00o.OooO0O0(new Rect(hollowRect), canvas, R.drawable.pic_dot_line_step_one);
            Drawable drawableOooO0O0 = o000O0O0.OooO0O0(R.drawable.pic_gift_guide_arrow_left);
            int intrinsicHeight = drawableOooO0O0.getIntrinsicHeight();
            int intrinsicWidth = drawableOooO0O0.getIntrinsicWidth();
            int i2 = oooO00o.f12238OooO0OO ? (hollowRect.left - oooO00o.f12237OooO0O0) - intrinsicWidth : hollowRect.right + oooO00o.f12237OooO0O0;
            int iOooO00o = OooOo00.OooO00o(8.0f) + hollowRect.top;
            Rect rect = new Rect(i2, iOooO00o, intrinsicWidth + i2, intrinsicHeight + iOooO00o);
            drawableOooO0O0.setBounds(rect);
            drawableOooO0O0.draw(canvas);
            Drawable drawableOooO0O1 = o000O0O0.OooO0O0(R.drawable.pic_select_a_gift);
            int intrinsicWidth2 = drawableOooO0O1.getIntrinsicWidth();
            int intrinsicHeight2 = drawableOooO0O1.getIntrinsicHeight();
            if (oooO00o.f12238OooO0OO) {
                i2 = rect.right - intrinsicWidth2;
            }
            int iOooO00o2 = OooOo00.OooO00o(62.0f) + hollowRect.top;
            drawableOooO0O1.setBounds(new Rect(i2, iOooO00o2, intrinsicWidth2 + i2, intrinsicHeight2 + iOooO00o2));
            drawableOooO0O1.draw(canvas);
            return;
        }
        if (i == 1) {
            Pair<Integer, Integer> pairOooO0O0 = oooO00o.OooO0O0(hollowRect, canvas, R.drawable.pic_dot_line_step_two);
            Drawable drawableOooO0O2 = o000O0O0.OooO0O0(R.drawable.pic_gift_guide_arrow_down);
            int intrinsicWidth3 = drawableOooO0O2.getIntrinsicWidth();
            int intrinsicHeight3 = drawableOooO0O2.getIntrinsicHeight();
            int iWidth = ((hollowRect.width() / 2) + hollowRect.left) - (intrinsicWidth3 / 2);
            int iIntValue = (pairOooO0O0.getSecond().intValue() - oooO00o.f12237OooO0O0) - intrinsicHeight3;
            drawableOooO0O2.setBounds(new Rect(iWidth, iIntValue, intrinsicWidth3 + iWidth, intrinsicHeight3 + iIntValue));
            drawableOooO0O2.draw(canvas);
            Drawable drawableOooO0O3 = o000O0O0.OooO0O0(R.drawable.pic_select_a_receiver);
            int intrinsicWidth4 = drawableOooO0O3.getIntrinsicWidth();
            int intrinsicHeight4 = drawableOooO0O3.getIntrinsicHeight();
            int i3 = oooO00o.f12237OooO0O0;
            int iOooO00o3 = (iIntValue - OooOo00.OooO00o(28.0f)) - intrinsicHeight4;
            Rect rect2 = new Rect(i3, iOooO00o3, intrinsicWidth4 + i3, intrinsicHeight4 + iOooO00o3);
            if (oooO00o.f12238OooO0OO) {
                oooO00o.OooO0OO(rect2);
            }
            drawableOooO0O3.setBounds(rect2);
            drawableOooO0O3.draw(canvas);
            return;
        }
        Pair<Integer, Integer> pairOooO0O1 = oooO00o.OooO0O0(hollowRect, canvas, R.drawable.pic_dot_line_step_three);
        Drawable drawableOooO0O4 = o000O0O0.OooO0O0(R.drawable.pic_gift_guide_arrow_down);
        int intrinsicWidth5 = drawableOooO0O4.getIntrinsicWidth();
        int intrinsicHeight5 = drawableOooO0O4.getIntrinsicHeight();
        int iOooO00o4 = OooOo00.OooO00o(52.0f) + pairOooO0O1.getFirst().intValue();
        int iIntValue2 = (pairOooO0O1.getSecond().intValue() - oooO00o.f12237OooO0O0) - intrinsicHeight5;
        drawableOooO0O4.setBounds(new Rect(iOooO00o4, iIntValue2, intrinsicWidth5 + iOooO00o4, intrinsicHeight5 + iIntValue2));
        drawableOooO0O4.draw(canvas);
        Drawable drawableOooO0O5 = o000O0O0.OooO0O0(R.drawable.pic_send_step_three);
        int intrinsicWidth6 = drawableOooO0O5.getIntrinsicWidth();
        int intrinsicHeight6 = drawableOooO0O5.getIntrinsicHeight();
        int width = (canvas.getWidth() - oooO00o.f12237OooO0O0) - intrinsicWidth6;
        int iOooO00o5 = (iIntValue2 - OooOo00.OooO00o(26.0f)) - intrinsicHeight6;
        Rect rect3 = new Rect(width, iOooO00o5, intrinsicWidth6 + width, intrinsicHeight6 + iOooO00o5);
        if (oooO00o.f12238OooO0OO) {
            oooO00o.OooO0OO(rect3);
        }
        drawableOooO0O5.setBounds(rect3);
        drawableOooO0O5.draw(canvas);
        Drawable drawableOooO0O6 = o000O0O0.OooO0O0(R.drawable.pic_hourse_step_three);
        int intrinsicWidth7 = drawableOooO0O6.getIntrinsicWidth();
        int intrinsicHeight7 = drawableOooO0O6.getIntrinsicHeight();
        int width2 = (canvas.getWidth() - OooOo00.OooO00o(65.0f)) - intrinsicWidth7;
        int iOooO00o6 = (iOooO00o5 - intrinsicHeight7) - OooOo00.OooO00o(6.0f);
        Rect rect4 = new Rect(width2, iOooO00o6, intrinsicWidth7 + width2, intrinsicHeight7 + iOooO00o6);
        if (oooO00o.f12238OooO0OO) {
            oooO00o.OooO0OO(rect4);
        }
        drawableOooO0O6.setBounds(rect4);
        drawableOooO0O6.draw(canvas);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f12231Oooo0o.setOnClickListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f12231Oooo0o.getMeasuredWidth() / 2);
        int iOooO0oO = o000OO0O.OooO0oO() / 3;
        View view = this.f12231Oooo0o;
        view.layout(measuredWidth, iOooO0oO, view.getMeasuredWidth() + measuredWidth, this.f12231Oooo0o.getMeasuredHeight() + iOooO0oO);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f12231Oooo0o;
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getBackground().getIntrinsicWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f12231Oooo0o.getBackground().getIntrinsicHeight(), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void setHollowAdapter(@NotNull OooO0OO adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f12230Oooo = adapter;
        Objects.requireNonNull(adapter);
        this.f12233Oooo0oo = 3;
        this.f12235OoooO00 = 0;
        OooO0OO oooO0OO = this.f12230Oooo;
        Intrinsics.checkNotNull(oooO0OO);
        oooO0OO.OooO00o(this.f12231Oooo0o, 0);
        requestLayout();
        invalidate();
    }

    public final void setOnDismissListener(@NotNull OooO0O0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12234OoooO0 = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGuideView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View view = new View(getContext());
        this.f12231Oooo0o = view;
        addView(view);
        Paint paint = new Paint();
        this.f12232Oooo0oO = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        setBackgroundColor(o000O0O0.OooO00o(R.color.color_alpha_70));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGuideView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View view = new View(getContext());
        this.f12231Oooo0o = view;
        addView(view);
        Paint paint = new Paint();
        this.f12232Oooo0oO = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        setBackgroundColor(o000O0O0.OooO00o(R.color.color_alpha_70));
    }
}
