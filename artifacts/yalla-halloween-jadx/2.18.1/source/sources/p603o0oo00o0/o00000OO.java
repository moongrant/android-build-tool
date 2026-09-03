package p603o0oo00o0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f48277OooO0o0 = {R.attr.listDivider};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Paint f48278OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Drawable f48279OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f48280OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48281OooO0Oo;

    public o00000OO(Context context) {
        this.f48278OooO00o = new Paint();
        this.f48280OooO0OO = 1;
        this.f48281OooO0Oo = 1;
        Paint paint = new Paint(1);
        this.f48278OooO00o = paint;
        paint.setColor(520093696);
        this.f48278OooO00o.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f48277OooO0o0);
        this.f48279OooO0O0 = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        rect.set(0, 0, 0, this.f48280OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.onDraw(canvas, recyclerView, o0ooo0o2);
        int i = 0;
        if (this.f48281OooO0Oo == 1) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i2 = this.f48280OooO0OO + bottom;
                Drawable drawable = this.f48279OooO0O0;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, measuredWidth, i2);
                    this.f48279OooO0O0.draw(canvas);
                }
                Paint paint = this.f48278OooO00o;
                if (paint != null) {
                    canvas.drawRect(paddingLeft, bottom, measuredWidth, i2, paint);
                }
                i++;
            }
            return;
        }
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            int right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt2.getLayoutParams())).rightMargin;
            int i3 = this.f48280OooO0OO + right;
            Drawable drawable2 = this.f48279OooO0O0;
            if (drawable2 != null) {
                drawable2.setBounds(right, paddingTop, i3, measuredHeight);
                this.f48279OooO0O0.draw(canvas);
            }
            Paint paint2 = this.f48278OooO00o;
            if (paint2 != null) {
                canvas.drawRect(right, paddingTop, i3, measuredHeight, paint2);
            }
            i++;
        }
    }

    public o00000OO(Context context, int i) {
        this.f48278OooO00o = new Paint();
        this.f48280OooO0OO = 1;
        this.f48281OooO0Oo = 1;
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        this.f48281OooO0Oo = i;
        Paint paint = new Paint(1);
        this.f48278OooO00o = paint;
        paint.setColor(520093696);
        this.f48278OooO00o.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f48277OooO0o0);
        this.f48279OooO0O0 = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public o00000OO(Context context, int i, int i2, int i3) {
        this(context, 0);
        this.f48280OooO0OO = i2;
        Paint paint = new Paint(1);
        this.f48278OooO00o = paint;
        paint.setColor(-16777216);
        this.f48278OooO00o.setStyle(Paint.Style.FILL);
    }
}
