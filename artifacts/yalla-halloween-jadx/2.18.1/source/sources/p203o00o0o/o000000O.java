package p203o00o0o;

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

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f33236OooO0o0 = {R.attr.listDivider};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Paint f33237OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Drawable f33238OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33239OooO0OO = 1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33240OooO0Oo = 1;

    public o000000O(Context context) {
        this.f33237OooO00o = new Paint();
        Paint paint = new Paint(1);
        this.f33237OooO00o = paint;
        paint.setColor(520093696);
        this.f33237OooO00o.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f33236OooO0o0);
        this.f33238OooO0O0 = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        rect.set(0, 0, 0, this.f33239OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.onDraw(canvas, recyclerView, o0ooo0o2);
        int i = 0;
        if (this.f33240OooO0Oo == 1) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i2 = this.f33239OooO0OO + bottom;
                Drawable drawable = this.f33238OooO0O0;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, measuredWidth, i2);
                    this.f33238OooO0O0.draw(canvas);
                }
                Paint paint = this.f33237OooO00o;
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
            int i3 = this.f33239OooO0OO + right;
            Drawable drawable2 = this.f33238OooO0O0;
            if (drawable2 != null) {
                drawable2.setBounds(right, paddingTop, i3, measuredHeight);
                this.f33238OooO0O0.draw(canvas);
            }
            Paint paint2 = this.f33237OooO00o;
            if (paint2 != null) {
                canvas.drawRect(right, paddingTop, i3, measuredHeight, paint2);
            }
            i++;
        }
    }
}
