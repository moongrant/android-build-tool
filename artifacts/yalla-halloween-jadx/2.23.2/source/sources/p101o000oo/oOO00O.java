package p101o000oo;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.paging.OooOo00;
import androidx.paging.o0OOO0o;
import androidx.paging.oo0o0Oo;
import androidx.recyclerview.widget.OooO0O0;
import androidx.recyclerview.widget.Oooo000;
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
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oOO00O<T, VH extends RecyclerView.o0O0O00> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f35582OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000oOoO<T> f35583OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Flow<oo0o0Oo> f35584OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SharedFlow f35585OooO0Oo;

    public oOO00O(Oooo000.OooO diffCallback) {
        MainCoroutineDispatcher mainDispatcher = Dispatchers.getMain();
        CoroutineDispatcher workerDispatcher = Dispatchers.getDefault();
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        h3 h3Var = (h3) this;
        o000oOoO<T> o000oooo2 = new o000oOoO<>(diffCallback, new OooO0O0(h3Var), mainDispatcher, workerDispatcher);
        this.f35583OooO0O0 = o000oooo2;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        registerAdapterDataObserver(new o00O00(h3Var));
        OooO00o(new o00O00O(h3Var));
        this.f35584OooO0OO = o000oooo2.f35485OooO;
        this.f35585OooO0Oo = o000oooo2.f35494OooOO0;
    }

    public final void OooO00o(@NotNull Function1<? super oo0o0Oo, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oOoO<T> o000oooo2 = this.f35583OooO0O0;
        o000oooo2.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00Oo0 o00oo1 = o000oooo2.f35492OooO0oO;
        o00oo1.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        OooOo00 oooOo00 = o00oo1.f10469OooO0o;
        oooOo00.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooOo00.f10266OooO00o.add(listener);
        oo0o0Oo value = oooOo00.f10267OooO0O0.getValue();
        if (value != null) {
            listener.invoke(value);
        }
    }

    @MainThread
    @Nullable
    public final T OooO0O0(@IntRange(from = ULong.MIN_VALUE) int i) {
        o000oOoO<T> o000oooo2 = this.f35583OooO0O0;
        o000oooo2.getClass();
        try {
            o000oooo2.f35490OooO0o = true;
            return (T) o000oooo2.f35492OooO0oO.OooO0O0(i);
        } finally {
            o000oooo2.f35490OooO0o = false;
        }
    }

    @Nullable
    public final Object OooO0OO(@NotNull o0OOO0o<T> o0ooo0o2, @NotNull Continuation<? super Unit> continuation) {
        o000oOoO<T> o000oooo2 = this.f35583OooO0O0;
        o000oooo2.f35493OooO0oo.incrementAndGet();
        o00Oo0 o00oo1 = o000oooo2.f35492OooO0oO;
        o00oo1.getClass();
        Object objOooO00o = o00oo1.f10472OooO0oo.OooO00o(0, new oo0o0Oo(o00oo1, o0ooo0o2, null), continuation);
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
        return this.f35583OooO0O0.f35492OooO0oO.f10470OooO0o0.getSize();
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
        this.f35582OooO00o = true;
        super.setStateRestorationPolicy(strategy);
    }
}
