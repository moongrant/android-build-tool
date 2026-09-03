package p587o0oOooOO;

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
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class x0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f57016OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Paint f57017OooO0O0;

    public x0(int i, int i2) {
        this.f57016OooO00o = i;
        Paint paint = new Paint(1);
        this.f57017OooO0O0 = paint;
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
            int orientation = linearLayoutManager.getOrientation();
            int i = this.f57016OooO00o;
            if (orientation != 0) {
                outRect.set(0, 0, 0, i);
            } else if (OooOo00.OooO0o0()) {
                outRect.set(i, 0, 0, 0);
            } else {
                outRect.set(0, 0, i, 0);
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
        int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
        Paint paint = this.f57017OooO0O0;
        int i = this.f57016OooO00o;
        if (orientation == 1) {
            int paddingLeft = parent.getPaddingLeft();
            int measuredWidth = parent.getMeasuredWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = parent.getChildAt(i2);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                c.drawRect(paddingLeft, bottom, measuredWidth, i + bottom, paint);
            }
            return;
        }
        int paddingTop = parent.getPaddingTop();
        int measuredHeight = parent.getMeasuredHeight() - parent.getPaddingBottom();
        int childCount2 = parent.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt2 = parent.getChildAt(i3);
            Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int left = childAt2.getLeft() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams2)).rightMargin;
            int i4 = i + left;
            if (OooOo00.OooO0o0()) {
                c.drawRect(i4, paddingTop, left, measuredHeight, paint);
            } else {
                c.drawRect(left, paddingTop, i4, measuredHeight, paint);
            }
        }
    }
}
