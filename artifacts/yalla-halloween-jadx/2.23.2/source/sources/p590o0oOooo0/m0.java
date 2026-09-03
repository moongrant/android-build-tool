package p590o0oOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00O0O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class m0<T> extends o00O0O.OooO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000oo<T> f57147OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f57148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f57149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f57150OooO0o0;

    public m0(@NotNull MomentSendImageAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f57147OooO0OO = adapter;
        this.f57148OooO0Oo = new LinkedHashMap();
        this.f57149OooO0o = true;
    }

    @Override // androidx.recyclerview.widget.o00O0O.OooO0o
    public final int OooO0O0(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.o0O0O00 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int i = recyclerView.getLayoutManager() instanceof GridLayoutManager ? 15 : 3;
        int i2 = (i << 16) | ((12 | i) << 0) | 3072;
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        return OooO0oo(absoluteAdapterPosition) ? absoluteAdapterPosition : i2;
    }

    @Override // androidx.recyclerview.widget.o00O0O.OooO0o
    public final boolean OooO0Oo() {
        return this.f57149OooO0o;
    }

    @Override // androidx.recyclerview.widget.o00O0O.OooO0o
    public final boolean OooO0o(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.o0O0O00 viewHolder, @NotNull RecyclerView.o0O0O00 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = target.getAbsoluteAdapterPosition();
        if (OooO0oo(absoluteAdapterPosition) || OooO0oo(absoluteAdapterPosition2)) {
            return false;
        }
        o0000oo<T> o0000ooVar = this.f57147OooO0OO;
        List<T> list = o0000ooVar.f13189OooOOoo;
        list.add(absoluteAdapterPosition2, list.remove(absoluteAdapterPosition));
        o0000ooVar.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
        Function1<? super Integer, Unit> function1 = this.f57150OooO0o0;
        if (function1 == null) {
            return true;
        }
        function1.invoke(Integer.valueOf(absoluteAdapterPosition));
        return true;
    }

    @Override // androidx.recyclerview.widget.o00O0O.OooO0o
    public final void OooO0oO(@NotNull RecyclerView.o0O0O00 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        o0000oo<T> o0000ooVar = this.f57147OooO0OO;
        if (o0000ooVar.f13189OooOOoo.size() > absoluteAdapterPosition) {
            o0000ooVar.f13189OooOOoo.remove(absoluteAdapterPosition);
        }
        o0000ooVar.notifyItemRemoved(absoluteAdapterPosition);
    }

    public final boolean OooO0oo(int i) {
        LinkedHashMap linkedHashMap = this.f57148OooO0Oo;
        if (linkedHashMap.containsKey(Integer.valueOf(i))) {
            return o0OoOo0.OooO00o((Boolean) linkedHashMap.get(Integer.valueOf(i)));
        }
        return false;
    }
}
