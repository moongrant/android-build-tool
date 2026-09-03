package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends o000OOo {
    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO() {
        return this.f10843OooO00o.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO0O0(View view) {
        return this.f10843OooO00o.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO0OO(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f10843OooO00o.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO0Oo(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f10843OooO00o.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO0o() {
        return this.f10843OooO00o.getHeight();
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO0o0(View view) {
        return this.f10843OooO00o.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO0oO() {
        RecyclerView.Oooo000 oooo000 = this.f10843OooO00o;
        return oooo000.getHeight() - oooo000.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooO0oo() {
        return this.f10843OooO00o.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooOO0() {
        return this.f10843OooO00o.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooOO0O() {
        return this.f10843OooO00o.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooOO0o() {
        RecyclerView.Oooo000 oooo000 = this.f10843OooO00o;
        return (oooo000.getHeight() - oooo000.getPaddingTop()) - oooo000.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooOOO(View view) {
        RecyclerView.Oooo000 oooo000 = this.f10843OooO00o;
        Rect rect = this.f10845OooO0OO;
        oooo000.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final int OooOOOO(View view) {
        RecyclerView.Oooo000 oooo000 = this.f10843OooO00o;
        Rect rect = this.f10845OooO0OO;
        oooo000.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.o000OOo
    public final void OooOOOo(int i) {
        this.f10843OooO00o.offsetChildrenVertical(i);
    }
}
