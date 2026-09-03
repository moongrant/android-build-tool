package p539o0o0OoOO;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class q1 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f55648OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f55649OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Paint f55650OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f55651OooO0Oo = 1;

    public q1(Context context) {
        this.f55649OooO0O0 = 0;
        this.f55648OooO00o = context;
        this.f55649OooO0O0 = o0Oo0oo.OooO00o(context, 72);
        Paint paint = new Paint();
        this.f55650OooO0OO = paint;
        paint.setColor(context.getResources().getColor(oO00O0o.color_alpha_8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        recyclerView.getChildAdapterPosition(view);
        rect.set(0, 0, 0, this.f55651OooO0Oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            float bottom = childAt.getBottom();
            float bottom2 = childAt.getBottom() + this.f55651OooO0Oo;
            int i2 = i < childCount + (-1) ? this.f55649OooO0O0 : 0;
            Paint paint = this.f55650OooO0OO;
            paint.setColor(this.f55648OooO00o.getResources().getColor(oO00O0o.color_alpha_12_A4_line));
            canvas.drawRect(i2, bottom, width, bottom2, paint);
            i++;
        }
    }

    public q1(Context context, @ColorInt int i) {
        this.f55649OooO0O0 = 0;
        this.f55648OooO00o = context;
        this.f55649OooO0O0 = o0Oo0oo.OooO00o(context, 72);
        Paint paint = new Paint();
        this.f55650OooO0OO = paint;
        paint.setColor(i);
    }
}
