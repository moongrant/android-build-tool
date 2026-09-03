package p560o0oOo0;

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

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f56232OooO0o0 = {R.attr.listDivider};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Paint f56233OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Drawable f56234OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f56235OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f56236OooO0Oo;

    public Oooo000(Context context) {
        this.f56233OooO00o = new Paint();
        this.f56235OooO0OO = 1;
        this.f56236OooO0Oo = 1;
        Paint paint = new Paint(1);
        this.f56233OooO00o = paint;
        paint.setColor(520093696);
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f56232OooO0o0);
        this.f56234OooO0O0 = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        rect.set(0, 0, 0, this.f56235OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.onDraw(canvas, recyclerView, o0ooo0o2);
        int i = this.f56236OooO0Oo;
        Paint paint = this.f56233OooO00o;
        Drawable drawable = this.f56234OooO0O0;
        int i2 = this.f56235OooO0OO;
        if (i == 1) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i4 = i2 + bottom;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, measuredWidth, i4);
                    drawable.draw(canvas);
                }
                if (paint != null) {
                    canvas.drawRect(paddingLeft, bottom, measuredWidth, i4, paint);
                }
            }
            return;
        }
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount2 = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt2 = recyclerView.getChildAt(i5);
            int right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt2.getLayoutParams())).rightMargin;
            int i6 = i2 + right;
            if (drawable != null) {
                drawable.setBounds(right, paddingTop, i6, measuredHeight);
                drawable.draw(canvas);
            }
            if (paint != null) {
                canvas.drawRect(right, paddingTop, i6, measuredHeight, paint);
            }
        }
    }

    public Oooo000(Context context, int i) {
        this.f56233OooO00o = new Paint();
        this.f56235OooO0OO = 1;
        this.f56236OooO0Oo = 1;
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        this.f56236OooO0Oo = i;
        Paint paint = new Paint(1);
        this.f56233OooO00o = paint;
        paint.setColor(520093696);
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f56232OooO0o0);
        this.f56234OooO0O0 = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Oooo000(Context context, int i, int i2) {
        this(context, 0);
        this.f56235OooO0OO = i;
        Paint paint = new Paint(1);
        this.f56233OooO00o = paint;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
    }
}
