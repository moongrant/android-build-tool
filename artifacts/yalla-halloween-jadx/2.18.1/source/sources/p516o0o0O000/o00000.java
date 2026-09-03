package p516o0o0O000;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {
    public static final void OooO00o(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f9010OooO0OO = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f9012OooO0o = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.f9013OooO0o0 = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.f9011OooO0Oo = 0L;
        }
        RecyclerView.ItemAnimator itemAnimator5 = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.o00000 o00000Var = itemAnimator5 instanceof androidx.recyclerview.widget.o00000 ? (androidx.recyclerview.widget.o00000) itemAnimator5 : null;
        if (o00000Var == null) {
            return;
        }
        o00000Var.f9140OooO0oO = false;
    }

    public static final void OooO0O0(@NotNull RecyclerView recyclerView, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f9010OooO0OO = j;
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f9012OooO0o = j2;
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.f9013OooO0o0 = j3;
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 == null) {
            return;
        }
        itemAnimator4.f9011OooO0Oo = j4;
    }
}
