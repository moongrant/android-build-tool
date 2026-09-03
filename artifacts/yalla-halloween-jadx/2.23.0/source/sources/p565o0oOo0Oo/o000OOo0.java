package p565o0oOo0Oo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000O0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o000OOo0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Paint f56209OooO00o;

    public o000OOo0() {
        Paint paint = new Paint(1);
        this.f56209OooO00o = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Nullable
    public abstract o000OO00 OooO0Oo(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        o000OO00 o000oo00OooO0Oo = OooO0Oo(((RecyclerView.LayoutParams) view.getLayoutParams()).OooO00o());
        if (o000oo00OooO0Oo == null) {
            o00 o00Var = new o00(0.0f, -10066330, false);
            o000oo00OooO0Oo = new o000OO00(o00Var, o00Var, o00Var, o00Var);
        }
        o00 o00Var2 = o000oo00OooO0Oo.f56205OooO00o;
        int iOooO00o = o00Var2.f56200OooO00o ? o0000O0.OooO00o(o00Var2.f56202OooO0OO) : 0;
        o00 o00Var3 = o000oo00OooO0Oo.f56206OooO0O0;
        int iOooO00o2 = o00Var3.f56200OooO00o ? o0000O0.OooO00o(o00Var3.f56202OooO0OO) : 0;
        o00 o00Var4 = o000oo00OooO0Oo.f56207OooO0OO;
        int iOooO00o3 = o00Var4.f56200OooO00o ? o0000O0.OooO00o(o00Var4.f56202OooO0OO) : 0;
        o00 o00Var5 = o000oo00OooO0Oo.f56208OooO0Oo;
        rect.set(iOooO00o, iOooO00o2, iOooO00o3, o00Var5.f56200OooO00o ? o0000O0.OooO00o(o00Var5.f56202OooO0OO) : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            o000OO00 o000oo00OooO0Oo = OooO0Oo(((RecyclerView.LayoutParams) childAt.getLayoutParams()).OooO00o());
            if (o000oo00OooO0Oo == null) {
                return;
            }
            o00 o00Var = o000oo00OooO0Oo.f56205OooO00o;
            boolean z = o00Var.f56200OooO00o;
            Paint paint = this.f56209OooO00o;
            if (z) {
                int iOooO00o = o0000O0.OooO00o(o00Var.f56202OooO0OO);
                int iOooO00o2 = o0000O0.OooO00o(o00Var.f56203OooO0Oo);
                int iOooO00o3 = o0000O0.OooO00o(o00Var.f56204OooO0o0);
                int i2 = o00Var.f56201OooO0O0;
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
            o00 o00Var2 = o000oo00OooO0Oo.f56206OooO0O0;
            if (o00Var2.f56200OooO00o) {
                int iOooO00o4 = o0000O0.OooO00o(o00Var2.f56202OooO0OO);
                int iOooO00o5 = o0000O0.OooO00o(o00Var2.f56203OooO0Oo);
                int iOooO00o6 = o0000O0.OooO00o(o00Var2.f56204OooO0o0);
                int i4 = o00Var2.f56201OooO0O0;
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
            o00 o00Var3 = o000oo00OooO0Oo.f56207OooO0OO;
            if (o00Var3.f56200OooO00o) {
                int iOooO00o7 = o0000O0.OooO00o(o00Var3.f56202OooO0OO);
                int iOooO00o8 = o0000O0.OooO00o(o00Var3.f56203OooO0Oo);
                int iOooO00o9 = o0000O0.OooO00o(o00Var3.f56204OooO0o0);
                int i6 = o00Var3.f56201OooO0O0;
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
            o00 o00Var4 = o000oo00OooO0Oo.f56208OooO0Oo;
            if (o00Var4.f56200OooO00o) {
                int iOooO00o10 = o0000O0.OooO00o(o00Var4.f56202OooO0OO);
                int iOooO00o11 = o0000O0.OooO00o(o00Var4.f56203OooO0Oo);
                int iOooO00o12 = o0000O0.OooO00o(o00Var4.f56204OooO0o0);
                int i8 = o00Var4.f56201OooO0O0;
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
