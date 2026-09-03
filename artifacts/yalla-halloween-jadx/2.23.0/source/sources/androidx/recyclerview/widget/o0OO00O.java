package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends o0O0O00 {
    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO() {
        return this.f7813OooO00o.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0O0(View view) {
        return this.f7813OooO00o.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0OO(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f7813OooO00o.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0Oo(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f7813OooO00o.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0o() {
        return this.f7813OooO00o.getWidth();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0o0(View view) {
        return this.f7813OooO00o.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0oO() {
        RecyclerView.Oooo000 oooo000 = this.f7813OooO00o;
        return oooo000.getWidth() - oooo000.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooO0oo() {
        return this.f7813OooO00o.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0() {
        return this.f7813OooO00o.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0O() {
        return this.f7813OooO00o.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOO0o() {
        RecyclerView.Oooo000 oooo000 = this.f7813OooO00o;
        return (oooo000.getWidth() - oooo000.getPaddingLeft()) - oooo000.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOOO(View view) {
        RecyclerView.Oooo000 oooo000 = this.f7813OooO00o;
        Rect rect = this.f7815OooO0OO;
        oooo000.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final int OooOOOO(View view) {
        RecyclerView.Oooo000 oooo000 = this.f7813OooO00o;
        Rect rect = this.f7815OooO0OO;
        oooo000.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.o0O0O00
    public final void OooOOOo(int i) {
        this.f7813OooO00o.offsetChildrenHorizontal(i);
    }
}
