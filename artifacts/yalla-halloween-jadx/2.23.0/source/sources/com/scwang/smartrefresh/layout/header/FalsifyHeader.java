package com.scwang.smartrefresh.layout.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import o0OO0o.OooO;
import o0OO0o.OooOO0O;
import o0OO0o.OooOOO0;
import org.jctools.util.Pow2;
import p335o0OO0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class FalsifyHeader extends InternalAbstract implements OooO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOO0O f21468OooO0oO;

    public FalsifyHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO00o(@NonNull OooOO0O oooOO0O, int i, int i2) {
        this.f21468OooO0oO = oooOO0O;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, o0OO0o.OooOO0
    public final void OooO0o(@NonNull OooOOO0 oooOOO0, int i, int i2) {
        OooOO0O oooOO0O = this.f21468OooO0oO;
        if (oooOO0O != null) {
            ((SmartRefreshLayout.OooOOO) oooOO0O).OooO0Oo(RefreshState.None);
            ((SmartRefreshLayout.OooOOO) this.f21468OooO0oO).OooO0Oo(RefreshState.RefreshFinish);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int iOooO0OO = OooOo00.OooO0OO(5.0f);
            Context context = getContext();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-858993460);
            paint.setStrokeWidth(OooOo00.OooO0OO(1.0f));
            float f = iOooO0OO;
            paint.setPathEffect(new DashPathEffect(new float[]{f, f, f, f}, 1.0f));
            canvas.drawRect(f, f, getWidth() - iOooO0OO, getBottom() - iOooO0OO, paint);
            TextView textView = new TextView(context);
            textView.setText(context.getString(p333o0OO0o0o.OooOOO0.srl_component_falsify, getClass().getSimpleName(), Float.valueOf(getHeight() / OooOo00.f43255OooO0O0)));
            textView.setTextColor(-858993460);
            textView.setGravity(17);
            textView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(getHeight(), Pow2.MAX_POW2));
            textView.layout(0, 0, getWidth(), getHeight());
            textView.draw(canvas);
        }
    }

    public FalsifyHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
