package p260o00ooOo0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000OO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0O0OOOo extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f34769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Paint f34770OooO0O0;

    public o0O0OOOo(int i) {
        Paint paint = new Paint();
        this.f34770OooO0O0 = paint;
        paint.setAntiAlias(true);
        paint.setColor(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildAdapterPosition(view) != 0) {
            int iOooO00o = o000OO00.OooO00o((float) 0.5d);
            outRect.top = iOooO00o;
            this.f34769OooO00o = iOooO00o;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c, parent, state);
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            if (parent.getChildAdapterPosition(childAt) != 0) {
                c.drawRect(parent.getPaddingLeft(), childAt.getTop() - this.f34769OooO00o, parent.getWidth() - parent.getPaddingRight(), childAt.getTop(), this.f34770OooO0O0);
            }
        }
    }
}
