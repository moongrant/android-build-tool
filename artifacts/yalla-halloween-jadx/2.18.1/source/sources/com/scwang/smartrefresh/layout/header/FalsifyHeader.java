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
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p407o0Oo0OOo.ooOOOOoo;
import p411o0Oo0Ooo.oOo00OO0;
import p586o0oOoo00.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public class FalsifyHeader extends InternalAbstract implements ooOOOOoo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public oO000Oo0 f19653Oooo;

    public FalsifyHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO00o(@NonNull oO000Oo oo000oo, int i, int i2) {
        oO000Oo0 oo000oo0 = this.f19653Oooo;
        if (oo000oo0 != null) {
            ((SmartRefreshLayout.OooOo00) oo000oo0).OooO0Oo(RefreshState.None);
            ((SmartRefreshLayout.OooOo00) this.f19653Oooo).OooO0Oo(RefreshState.RefreshFinish);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, p407o0Oo0OOo.oO0OOo0o
    public final void OooO0o(@NonNull oO000Oo0 oo000oo0, int i, int i2) {
        this.f19653Oooo = oo000oo0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int iOooO0OO = oOo00OO0.OooO0OO(5.0f);
            Context context = getContext();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-858993460);
            paint.setStrokeWidth(oOo00OO0.OooO0OO(1.0f));
            float f = iOooO0OO;
            paint.setPathEffect(new DashPathEffect(new float[]{f, f, f, f}, 1.0f));
            canvas.drawRect(f, f, getWidth() - iOooO0OO, getBottom() - iOooO0OO, paint);
            TextView textView = new TextView(context);
            textView.setText(context.getString(o0OOO0o.srl_component_falsify, getClass().getSimpleName(), Float.valueOf(getHeight() / oOo00OO0.f39170OooO0O0)));
            textView.setTextColor(-858993460);
            textView.setGravity(17);
            textView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            textView.layout(0, 0, getWidth(), getHeight());
            textView.draw(canvas);
        }
    }

    public FalsifyHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
