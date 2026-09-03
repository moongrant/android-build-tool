package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f10657OooO0Oo = {R.attr.listDivider};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Drawable f10658OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f10659OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f10660OooO0OO = new Rect();

    @SuppressLint({"UnknownNullness"})
    public Oooo0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f10657OooO0Oo);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f10658OooO00o = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f10659OooO0O0 = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        Drawable drawable = this.f10658OooO00o;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f10659OooO0O0 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f10658OooO00o == null) {
            return;
        }
        int i = this.f10659OooO0O0;
        Rect rect = this.f10660OooO0OO;
        int i2 = 0;
        if (i == 1) {
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
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f10658OooO00o.setBounds(paddingLeft, iRound - this.f10658OooO00o.getIntrinsicHeight(), width, iRound);
                this.f10658OooO00o.draw(canvas);
                i2++;
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
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f10658OooO00o.setBounds(iRound2 - this.f10658OooO00o.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f10658OooO00o.draw(canvas);
            i2++;
        }
        canvas.restore();
    }
}
