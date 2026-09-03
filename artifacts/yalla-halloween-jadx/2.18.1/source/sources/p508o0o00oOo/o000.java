package p508o0o00oOo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f41814OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Paint f41815OooO0O0;

    public o000(int i, int i2) {
        this.f41814OooO00o = i;
        Paint paint = new Paint(1);
        this.f41815OooO0O0 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.Oooo000 layoutManager = parent.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (parent.getChildAdapterPosition(view) != linearLayoutManager.getItemCount() - 1) {
            if (linearLayoutManager.getOrientation() != 0) {
                outRect.set(0, 0, 0, this.f41814OooO00o);
            } else if (oo000o.OooO0o0()) {
                outRect.set(this.f41814OooO00o, 0, 0, 0);
            } else {
                outRect.set(0, 0, this.f41814OooO00o, 0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c, parent, state);
        RecyclerView.Oooo000 layoutManager = parent.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).getOrientation() == 1) {
            int paddingLeft = parent.getPaddingLeft();
            int measuredWidth = parent.getMeasuredWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "parent.getChildAt(i)");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                c.drawRect(paddingLeft, bottom, measuredWidth, this.f41814OooO00o + bottom, this.f41815OooO0O0);
            }
            return;
        }
        int paddingTop = parent.getPaddingTop();
        int measuredHeight = parent.getMeasuredHeight() - parent.getPaddingBottom();
        int childCount2 = parent.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = parent.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt2, "parent.getChildAt(i)");
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int left = childAt2.getLeft() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams2)).rightMargin;
            int i3 = this.f41814OooO00o + left;
            if (oo000o.OooO0o0()) {
                c.drawRect(i3, paddingTop, left, measuredHeight, this.f41815OooO0O0);
            } else {
                c.drawRect(left, paddingTop, i3, measuredHeight, this.f41815OooO0O0);
            }
        }
    }
}
