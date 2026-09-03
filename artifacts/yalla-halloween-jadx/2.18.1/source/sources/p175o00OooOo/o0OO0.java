package p175o00OooOo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p418o0Oo0oo.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f32730OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f32731OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Paint f32732OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f32733OooO0Oo = 1;

    public o0OO0(Context context) {
        this.f32731OooO0O0 = 0;
        this.f32730OooO00o = context;
        this.f32731OooO0O0 = oo000o.OooO00o(context, 72);
        Paint paint = new Paint();
        this.f32732OooO0OO = paint;
        paint.setColor(context.getResources().getColor(R.color.color_alpha_8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        recyclerView.getChildAdapterPosition(view);
        rect.set(0, 0, 0, this.f32733OooO0Oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            float bottom = childAt.getBottom();
            float bottom2 = childAt.getBottom() + this.f32733OooO0Oo;
            int i2 = i < childCount + (-1) ? this.f32731OooO0O0 : 0;
            this.f32732OooO0OO.setColor(this.f32730OooO00o.getResources().getColor(R.color.color_alpha_12_A4_line));
            canvas.drawRect(i2, bottom, width, bottom2, this.f32732OooO0OO);
            i++;
        }
    }

    public o0OO0(Context context, @ColorInt int i, int i2) {
        this.f32731OooO0O0 = 0;
        this.f32730OooO00o = context;
        this.f32731OooO0O0 = oo000o.OooO00o(context, 72);
        Paint paint = new Paint();
        this.f32732OooO0OO = paint;
        paint.setColor(i);
    }
}
