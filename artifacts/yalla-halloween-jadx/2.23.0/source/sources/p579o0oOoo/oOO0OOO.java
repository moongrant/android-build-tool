package p579o0oOoo;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00000;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class oOO0OOO {
    public static final void OooO00o(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7627OooO0OO = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f7629OooO0o = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.f7630OooO0o0 = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.f7628OooO0Oo = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator5 = recyclerView.getItemAnimator();
        o00000 o00000Var = itemAnimator5 instanceof o00000 ? (o00000) itemAnimator5 : null;
        if (o00000Var == null) {
            return;
        }
        o00000Var.f7758OooO0oO = false;
    }

    public static final void OooO0O0(@NotNull RecyclerView recyclerView, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7627OooO0OO = j;
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f7629OooO0o = j2;
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.f7630OooO0o0 = j3;
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 == null) {
            return;
        }
        itemAnimator4.f7628OooO0Oo = j4;
    }
}
