package p361o0OOOooo;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo extends RecyclerView.OooOo {
    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int iOooO00o = ((RecyclerView.LayoutParams) layoutParams).OooO00o() % 3;
        if (iOooO00o == 0) {
            outRect.right = 4;
        } else if (iOooO00o == 1) {
            outRect.right = 2;
            outRect.left = 2;
        } else if (iOooO00o == 2) {
            outRect.left = 4;
        }
        outRect.bottom = 4;
    }
}
