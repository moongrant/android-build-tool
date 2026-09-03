package p579o0oOoo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0OoOo0;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p564o0oOo0OO.o000O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oOO0Oo00<T> extends o0OoOo0.OooO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000O<T> f56664OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f56665OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f56666OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f56667OooO0o0;

    public oOO0Oo00(@NotNull MomentSendImageAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f56664OooO0OO = adapter;
        this.f56665OooO0Oo = new LinkedHashMap();
        this.f56666OooO0o = true;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final int OooO0O0(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.o0O0O00 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int i = recyclerView.getLayoutManager() instanceof GridLayoutManager ? 15 : 3;
        int i2 = (i << 16) | ((12 | i) << 0) | 3072;
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        return OooO0oo(absoluteAdapterPosition) ? absoluteAdapterPosition : i2;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final boolean OooO0Oo() {
        return this.f56666OooO0o;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final boolean OooO0o(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.o0O0O00 viewHolder, @NotNull RecyclerView.o0O0O00 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = target.getAbsoluteAdapterPosition();
        if (OooO0oo(absoluteAdapterPosition) || OooO0oo(absoluteAdapterPosition2)) {
            return false;
        }
        o000O<T> o000o = this.f56664OooO0OO;
        List<T> list = o000o.f10111OooOOoo;
        list.add(absoluteAdapterPosition2, list.remove(absoluteAdapterPosition));
        o000o.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
        Function1<? super Integer, Unit> function1 = this.f56667OooO0o0;
        if (function1 == null) {
            return true;
        }
        function1.invoke(Integer.valueOf(absoluteAdapterPosition));
        return true;
    }

    @Override // androidx.recyclerview.widget.o0OoOo0.OooO0o
    public final void OooO0oO(@NotNull RecyclerView.o0O0O00 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        o000O<T> o000o = this.f56664OooO0OO;
        if (o000o.f10111OooOOoo.size() > absoluteAdapterPosition) {
            o000o.f10111OooOOoo.remove(absoluteAdapterPosition);
        }
        o000o.notifyItemRemoved(absoluteAdapterPosition);
    }

    public final boolean OooO0oo(int i) {
        LinkedHashMap linkedHashMap = this.f56665OooO0Oo;
        if (linkedHashMap.containsKey(Integer.valueOf(i))) {
            return com.code.android.util.o0OoOo0.OooO00o((Boolean) linkedHashMap.get(Integer.valueOf(i)));
        }
        return false;
    }
}
