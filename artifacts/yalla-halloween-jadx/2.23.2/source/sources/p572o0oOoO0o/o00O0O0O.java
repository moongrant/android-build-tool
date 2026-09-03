package p572o0oOoO0o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00O0O0O extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Paint f56431OooO00o;

    public o00O0O0O() {
        Paint paint = new Paint(1);
        this.f56431OooO00o = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Nullable
    public abstract o00O0O0 OooO0Oo(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        o00O0O0 o00o0o0OooO0Oo = OooO0Oo(((RecyclerView.LayoutParams) view.getLayoutParams()).OooO00o());
        if (o00o0o0OooO0Oo == null) {
            o00O0OO0 o00o0oo1 = new o00O0OO0(0.0f, -10066330, false);
            o00o0o0OooO0Oo = new o00O0O0(o00o0oo1, o00o0oo1, o00o0oo1, o00o0oo1);
        }
        o00O0OO0 o00o0oo2 = o00o0o0OooO0Oo.f56427OooO00o;
        int iOooO00o = o00o0oo2.f56432OooO00o ? o0000O0.OooO00o(o00o0oo2.f56434OooO0OO) : 0;
        o00O0OO0 o00o0oo3 = o00o0o0OooO0Oo.f56428OooO0O0;
        int iOooO00o2 = o00o0oo3.f56432OooO00o ? o0000O0.OooO00o(o00o0oo3.f56434OooO0OO) : 0;
        o00O0OO0 o00o0oo4 = o00o0o0OooO0Oo.f56429OooO0OO;
        int iOooO00o3 = o00o0oo4.f56432OooO00o ? o0000O0.OooO00o(o00o0oo4.f56434OooO0OO) : 0;
        o00O0OO0 o00o0oo5 = o00o0o0OooO0Oo.f56430OooO0Oo;
        rect.set(iOooO00o, iOooO00o2, iOooO00o3, o00o0oo5.f56432OooO00o ? o0000O0.OooO00o(o00o0oo5.f56434OooO0OO) : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            o00O0O0 o00o0o0OooO0Oo = OooO0Oo(((RecyclerView.LayoutParams) childAt.getLayoutParams()).OooO00o());
            if (o00o0o0OooO0Oo == null) {
                return;
            }
            o00O0OO0 o00o0oo1 = o00o0o0OooO0Oo.f56427OooO00o;
            boolean z = o00o0oo1.f56432OooO00o;
            Paint paint = this.f56431OooO00o;
            if (z) {
                int iOooO00o = o0000O0.OooO00o(o00o0oo1.f56434OooO0OO);
                int iOooO00o2 = o0000O0.OooO00o(o00o0oo1.f56435OooO0Oo);
                int iOooO00o3 = o0000O0.OooO00o(o00o0oo1.f56436OooO0o0);
                int i2 = o00o0oo1.f56433OooO0O0;
                if (iOooO00o2 <= 0) {
                    iOooO00o2 = -iOooO00o;
                }
                int i3 = iOooO00o3 <= 0 ? iOooO00o : -iOooO00o3;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int top = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + iOooO00o2;
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i3;
                int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                paint.setColor(i2);
                canvas.drawRect(left - iOooO00o, top, left, bottom, paint);
            }
            o00O0OO0 o00o0oo2 = o00o0o0OooO0Oo.f56428OooO0O0;
            if (o00o0oo2.f56432OooO00o) {
                int iOooO00o4 = o0000O0.OooO00o(o00o0oo2.f56434OooO0OO);
                int iOooO00o5 = o0000O0.OooO00o(o00o0oo2.f56435OooO0Oo);
                int iOooO00o6 = o0000O0.OooO00o(o00o0oo2.f56436OooO0o0);
                int i4 = o00o0oo2.f56433OooO0O0;
                if (iOooO00o5 <= 0) {
                    iOooO00o5 = -iOooO00o4;
                }
                int i5 = iOooO00o6 <= 0 ? iOooO00o4 : -iOooO00o6;
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left2 = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + iOooO00o5;
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i5;
                int top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                paint.setColor(i4);
                canvas.drawRect(left2, top2 - iOooO00o4, right, top2, paint);
            }
            o00O0OO0 o00o0oo3 = o00o0o0OooO0Oo.f56429OooO0OO;
            if (o00o0oo3.f56432OooO00o) {
                int iOooO00o7 = o0000O0.OooO00o(o00o0oo3.f56434OooO0OO);
                int iOooO00o8 = o0000O0.OooO00o(o00o0oo3.f56435OooO0Oo);
                int iOooO00o9 = o0000O0.OooO00o(o00o0oo3.f56436OooO0o0);
                int i6 = o00o0oo3.f56433OooO0O0;
                if (iOooO00o8 <= 0) {
                    iOooO00o8 = -iOooO00o7;
                }
                int i7 = iOooO00o9 <= 0 ? iOooO00o7 : -iOooO00o9;
                RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int top3 = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin) + iOooO00o8;
                int bottom2 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + i7;
                int right2 = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                paint.setColor(i6);
                canvas.drawRect(right2, top3, iOooO00o7 + right2, bottom2, paint);
            }
            o00O0OO0 o00o0oo4 = o00o0o0OooO0Oo.f56430OooO0Oo;
            if (o00o0oo4.f56432OooO00o) {
                int iOooO00o10 = o0000O0.OooO00o(o00o0oo4.f56434OooO0OO);
                int iOooO00o11 = o0000O0.OooO00o(o00o0oo4.f56435OooO0Oo);
                int iOooO00o12 = o0000O0.OooO00o(o00o0oo4.f56436OooO0o0);
                int i8 = o00o0oo4.f56433OooO0O0;
                if (iOooO00o11 <= 0) {
                    iOooO00o11 = -iOooO00o10;
                }
                int i9 = iOooO00o12 <= 0 ? iOooO00o10 : -iOooO00o12;
                RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left3 = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin) + iOooO00o11;
                int right3 = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin + i9;
                int bottom3 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                paint.setColor(i8);
                canvas.drawRect(left3, bottom3, right3, iOooO00o10 + bottom3, paint);
            }
        }
    }
}
