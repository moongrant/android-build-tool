package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f9004OooO0Oo = {R.attr.listDivider};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Drawable f9005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f9006OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f9007OooO0OO = new Rect();

    public Oooo000(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f9004OooO0Oo);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f9005OooO00o = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f9006OooO0O0 = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        Drawable drawable = this.f9005OooO00o;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f9006OooO0O0 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f9005OooO00o == null) {
            return;
        }
        int i = 0;
        if (this.f9006OooO0O0 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f9007OooO0OO);
                int iRound = Math.round(childAt.getTranslationY()) + this.f9007OooO0OO.bottom;
                this.f9005OooO00o.setBounds(paddingLeft, iRound - this.f9005OooO00o.getIntrinsicHeight(), width, iRound);
                this.f9005OooO00o.draw(canvas);
                i++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.f9007OooO0OO);
            int iRound2 = Math.round(childAt2.getTranslationX()) + this.f9007OooO0OO.right;
            this.f9005OooO00o.setBounds(iRound2 - this.f9005OooO00o.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f9005OooO00o.draw(canvas);
            i++;
        }
        canvas.restore();
    }
}
