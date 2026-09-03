package p187o00o00o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Oo0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Paint f33041OooO00o;

    public o00Oo0() {
        Paint paint = new Paint(1);
        this.f33041OooO00o = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Nullable
    public abstract o00O0O OooO0Oo(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        o00O0O o00o0oOooO0Oo = OooO0Oo(((RecyclerView.LayoutParams) view.getLayoutParams()).OooO00o());
        if (o00o0oOooO0Oo == null) {
            o00Ooo o00ooo2 = new o00Ooo(false, -10066330, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            o00o0oOooO0Oo = new o00O0O(o00ooo2, o00ooo2, o00ooo2, o00ooo2);
        }
        o00Ooo o00ooo3 = o00o0oOooO0Oo.f33037OooO00o;
        int iOooO00o = o00ooo3.f33042OooO00o ? OooOo00.OooO00o(o00ooo3.f33044OooO0OO) : 0;
        o00Ooo o00ooo4 = o00o0oOooO0Oo.f33038OooO0O0;
        int iOooO00o2 = o00ooo4.f33042OooO00o ? OooOo00.OooO00o(o00ooo4.f33044OooO0OO) : 0;
        o00Ooo o00ooo5 = o00o0oOooO0Oo.f33039OooO0OO;
        int iOooO00o3 = o00ooo5.f33042OooO00o ? OooOo00.OooO00o(o00ooo5.f33044OooO0OO) : 0;
        o00Ooo o00ooo6 = o00o0oOooO0Oo.f33040OooO0Oo;
        rect.set(iOooO00o, iOooO00o2, iOooO00o3, o00ooo6.f33042OooO00o ? OooOo00.OooO00o(o00ooo6.f33044OooO0OO) : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            o00O0O o00o0oOooO0Oo = OooO0Oo(((RecyclerView.LayoutParams) childAt.getLayoutParams()).OooO00o());
            if (o00o0oOooO0Oo == null) {
                return;
            }
            o00Ooo o00ooo2 = o00o0oOooO0Oo.f33037OooO00o;
            if (o00ooo2.f33042OooO00o) {
                int iOooO00o = OooOo00.OooO00o(o00ooo2.f33044OooO0OO);
                int iOooO00o2 = OooOo00.OooO00o(o00o0oOooO0Oo.f33037OooO00o.f33045OooO0Oo);
                int iOooO00o3 = OooOo00.OooO00o(o00o0oOooO0Oo.f33037OooO00o.f33046OooO0o0);
                int i2 = o00o0oOooO0Oo.f33037OooO00o.f33043OooO0O0;
                if (iOooO00o2 <= 0) {
                    iOooO00o2 = -iOooO00o;
                }
                int i3 = iOooO00o3 <= 0 ? iOooO00o : -iOooO00o3;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int top = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + iOooO00o2;
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i3;
                int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                this.f33041OooO00o.setColor(i2);
                canvas.drawRect(left - iOooO00o, top, left, bottom, this.f33041OooO00o);
            }
            o00Ooo o00ooo3 = o00o0oOooO0Oo.f33038OooO0O0;
            if (o00ooo3.f33042OooO00o) {
                int iOooO00o4 = OooOo00.OooO00o(o00ooo3.f33044OooO0OO);
                int iOooO00o5 = OooOo00.OooO00o(o00o0oOooO0Oo.f33038OooO0O0.f33045OooO0Oo);
                int iOooO00o6 = OooOo00.OooO00o(o00o0oOooO0Oo.f33038OooO0O0.f33046OooO0o0);
                int i4 = o00o0oOooO0Oo.f33038OooO0O0.f33043OooO0O0;
                if (iOooO00o5 <= 0) {
                    iOooO00o5 = -iOooO00o4;
                }
                int i5 = iOooO00o6 <= 0 ? iOooO00o4 : -iOooO00o6;
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left2 = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + iOooO00o5;
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i5;
                int top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                this.f33041OooO00o.setColor(i4);
                canvas.drawRect(left2, top2 - iOooO00o4, right, top2, this.f33041OooO00o);
            }
            o00Ooo o00ooo4 = o00o0oOooO0Oo.f33039OooO0OO;
            if (o00ooo4.f33042OooO00o) {
                int iOooO00o7 = OooOo00.OooO00o(o00ooo4.f33044OooO0OO);
                int iOooO00o8 = OooOo00.OooO00o(o00o0oOooO0Oo.f33039OooO0OO.f33045OooO0Oo);
                int iOooO00o9 = OooOo00.OooO00o(o00o0oOooO0Oo.f33039OooO0OO.f33046OooO0o0);
                int i6 = o00o0oOooO0Oo.f33039OooO0OO.f33043OooO0O0;
                if (iOooO00o8 <= 0) {
                    iOooO00o8 = -iOooO00o7;
                }
                int i7 = iOooO00o9 <= 0 ? iOooO00o7 : -iOooO00o9;
                RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int top3 = (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin) + iOooO00o8;
                int bottom2 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + i7;
                int right2 = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                this.f33041OooO00o.setColor(i6);
                canvas.drawRect(right2, top3, iOooO00o7 + right2, bottom2, this.f33041OooO00o);
            }
            o00Ooo o00ooo5 = o00o0oOooO0Oo.f33040OooO0Oo;
            if (o00ooo5.f33042OooO00o) {
                int iOooO00o10 = OooOo00.OooO00o(o00ooo5.f33044OooO0OO);
                int iOooO00o11 = OooOo00.OooO00o(o00o0oOooO0Oo.f33040OooO0Oo.f33045OooO0Oo);
                int iOooO00o12 = OooOo00.OooO00o(o00o0oOooO0Oo.f33040OooO0Oo.f33046OooO0o0);
                int i8 = o00o0oOooO0Oo.f33040OooO0Oo.f33043OooO0O0;
                if (iOooO00o11 <= 0) {
                    iOooO00o11 = -iOooO00o10;
                }
                int i9 = iOooO00o12 <= 0 ? iOooO00o10 : -iOooO00o12;
                RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left3 = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin) + iOooO00o11;
                int right3 = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin + i9;
                int bottom3 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                this.f33041OooO00o.setColor(i8);
                canvas.drawRect(left3, bottom3, right3, iOooO00o10 + bottom3, this.f33041OooO00o);
            }
        }
    }
}
