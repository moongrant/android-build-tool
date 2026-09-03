package p587o0oOooOO;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.RecyclerView;
import o0OO0.OooO0o;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f56879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f56880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Paint f56881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f56882OooO0Oo = 1;

    public n0(Context context) {
        this.f56880OooO0O0 = 0;
        this.f56879OooO00o = context;
        this.f56880OooO0O0 = OooO0o.OooO0O0(context, 72);
        Paint paint = new Paint();
        this.f56881OooO0OO = paint;
        paint.setColor(context.getResources().getColor(o0OOO0o.color_alpha_8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        recyclerView.getChildAdapterPosition(view);
        rect.set(0, 0, 0, this.f56882OooO0Oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            float bottom = childAt.getBottom();
            float bottom2 = childAt.getBottom() + this.f56882OooO0Oo;
            int i2 = i < childCount + (-1) ? this.f56880OooO0O0 : 0;
            Paint paint = this.f56881OooO0OO;
            paint.setColor(this.f56879OooO00o.getResources().getColor(o0OOO0o.color_alpha_12_A4_line));
            canvas.drawRect(i2, bottom, width, bottom2, paint);
            i++;
        }
    }

    public n0(Context context, @ColorInt int i) {
        this.f56880OooO0O0 = 0;
        this.f56879OooO00o = context;
        this.f56880OooO0O0 = OooO0o.OooO0O0(context, 72);
        Paint paint = new Paint();
        this.f56881OooO0OO = paint;
        paint.setColor(i);
    }
}
