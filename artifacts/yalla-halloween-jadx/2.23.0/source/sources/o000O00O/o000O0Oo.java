package o000O00O;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.o0O0O00;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000O0Oo<T, VH extends RecyclerView.o0O0O00> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f34532OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o<T> f34533OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Flow<OooOo> f34534OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SharedFlow f34535OooO0Oo;

    public o000O0Oo(androidx.recyclerview.widget.OooOo.OooO diffCallback) {
        MainCoroutineDispatcher mainDispatcher = Dispatchers.getMain();
        CoroutineDispatcher workerDispatcher = Dispatchers.getDefault();
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        p400o0Oo0OO.OooOO0O oooOO0O = (p400o0Oo0OO.OooOO0O) this;
        OooO00o<T> oooO00o = new OooO00o<>(diffCallback, new androidx.recyclerview.widget.OooO0O0(oooOO0O), mainDispatcher, workerDispatcher);
        this.f34533OooO0O0 = oooO00o;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        registerAdapterDataObserver(new o000O00O(oooOO0O));
        OooO00o(new o000O0(oooOO0O));
        this.f34534OooO0OO = oooO00o.f34425OooO;
        this.f34535OooO0Oo = oooO00o.f34434OooOO0;
    }

    public final void OooO00o(@NotNull Function1<? super OooOo, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OooO00o<T> oooO00o = this.f34533OooO0O0;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        OooO0o oooO0o = oooO00o.f34432OooO0oO;
        oooO0o.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        androidx.paging.OooOo00 oooOo00 = oooO0o.f7375OooO0o;
        oooOo00.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooOo00.f7172OooO00o.add(listener);
        OooOo value = oooOo00.f7173OooO0O0.getValue();
        if (value != null) {
            listener.invoke(value);
        }
    }

    @MainThread
    @Nullable
    public final T OooO0O0(@IntRange(from = ULong.MIN_VALUE) int i) {
        OooO00o<T> oooO00o = this.f34533OooO0O0;
        oooO00o.getClass();
        try {
            oooO00o.f34430OooO0o = true;
            return (T) oooO00o.f34432OooO0oO.OooO0O0(i);
        } finally {
            oooO00o.f34430OooO0o = false;
        }
    }

    @Nullable
    public final Object OooO0OO(@NotNull androidx.paging.o0OOO0o<T> o0ooo0o2, @NotNull Continuation<? super Unit> continuation) {
        OooO00o<T> oooO00o = this.f34533OooO0O0;
        oooO00o.f34433OooO0oo.incrementAndGet();
        OooO0o oooO0o = oooO00o.f34432OooO0oO;
        oooO0o.getClass();
        Object objOooO00o = oooO0o.f7378OooO0oo.OooO00o(0, new androidx.paging.oo0o0Oo(oooO0o, o0ooo0o2, null), continuation);
        if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objOooO00o = Unit.INSTANCE;
        }
        if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objOooO00o = Unit.INSTANCE;
        }
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f34533OooO0O0.f34432OooO0oO.f7376OooO0o0.getSize();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setStateRestorationPolicy(@NotNull RecyclerView.Adapter.StateRestorationPolicy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f34532OooO00o = true;
        super.setStateRestorationPolicy(strategy);
    }
}
