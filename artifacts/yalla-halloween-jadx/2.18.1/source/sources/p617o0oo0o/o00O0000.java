package p617o0oo0o;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0OoOo0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000<T> extends o0OoOo0.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO0OO<T> f48552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f48553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Map<Integer, Boolean> f48554OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f48555OooO0oO;

    public o00O0000(@NotNull OooO0OO<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f48552OooO0Oo = adapter;
        this.f48554OooO0o0 = new LinkedHashMap();
        this.f48555OooO0oO = true;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final boolean OooO(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.oo0o0Oo viewHolder, @NotNull RecyclerView.oo0o0Oo target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = target.getAbsoluteAdapterPosition();
        if (OooOO0o(absoluteAdapterPosition) || OooOO0o(absoluteAdapterPosition2)) {
            return false;
        }
        this.f48552OooO0Oo.getData().add(absoluteAdapterPosition2, this.f48552OooO0Oo.getData().remove(absoluteAdapterPosition));
        this.f48552OooO0Oo.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
        Function1<? super Integer, Unit> function1 = this.f48553OooO0o;
        if (function1 == null) {
            return true;
        }
        function1.invoke(Integer.valueOf(absoluteAdapterPosition));
        return true;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final int OooO0o0(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.oo0o0Oo viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int i = recyclerView.getLayoutManager() instanceof GridLayoutManager ? 15 : 3;
        int i2 = (i << 16) | ((12 | i) << 0) | 3072;
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        return OooOO0o(absoluteAdapterPosition) ? absoluteAdapterPosition : i2;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final boolean OooO0oO() {
        return this.f48555OooO0oO;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final void OooOO0(@NotNull RecyclerView.oo0o0Oo viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        if (this.f48552OooO0Oo.getData().size() > absoluteAdapterPosition) {
            this.f48552OooO0Oo.getData().remove(absoluteAdapterPosition);
        }
        this.f48552OooO0Oo.notifyItemRemoved(absoluteAdapterPosition);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.Boolean>] */
    public final void OooOO0O(int i) {
        this.f48554OooO0o0.clear();
        this.f48554OooO0o0.put(Integer.valueOf(i), Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.Boolean>] */
    public final boolean OooOO0o(int i) {
        if (this.f48554OooO0o0.containsKey(Integer.valueOf(i))) {
            return oOO00O.OooO0OO((Boolean) this.f48554OooO0o0.get(Integer.valueOf(i)));
        }
        return false;
    }
}
