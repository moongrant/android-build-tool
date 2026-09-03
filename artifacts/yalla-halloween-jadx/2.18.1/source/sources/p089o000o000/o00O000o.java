package p089o000o000;

import androidx.annotation.IntRange;
import androidx.recyclerview.widget.OooO0O0;
import androidx.recyclerview.widget.OooOo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.oo0o0Oo;
import java.util.Objects;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00O000o<T, VH extends RecyclerView.oo0o0Oo> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f28931OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0o<T> f28932OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Flow<OooOo> f28933OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f28934OooO0Oo;

    public o00O000o(OooOo.OooO diffCallback) {
        MainCoroutineDispatcher mainDispatcher = Dispatchers.getMain();
        CoroutineDispatcher workerDispatcher = Dispatchers.getDefault();
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        OooO0o<T> oooO0o = new OooO0o<>(diffCallback, new OooO0O0(this), mainDispatcher, workerDispatcher);
        this.f28932OooO0O0 = oooO0o;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        registerAdapterDataObserver(new o00oOoo(this));
        OooO00o(new o00O000(this));
        this.f28933OooO0OO = oooO0o.f28647OooO;
        this.f28934OooO0Oo = oooO0o.f28656OooOO0;
    }

    public final void OooO00o(@NotNull Function1<? super OooOo, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OooO0o<T> oooO0o = this.f28932OooO0O0;
        Objects.requireNonNull(oooO0o);
        Intrinsics.checkNotNullParameter(listener, "listener");
        OooO0o.OooO00o oooO00o = oooO0o.f28654OooO0oO;
        Objects.requireNonNull(oooO00o);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO o00000oo2 = oooO00o.f28911OooO0o0;
        Objects.requireNonNull(o00000oo2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000oo2.f28713OooO0O0.add(listener);
        OooOo oooOoOooO0O0 = o00000oo2.OooO0O0();
        if (oooOoOooO0O0 != null) {
            listener.invoke(oooOoOooO0O0);
        }
    }

    @Nullable
    public final Object OooO0O0(@NotNull o0O0ooO<T> o0o0ooo, @NotNull Continuation<? super Unit> continuation) {
        OooO0o<T> oooO0o = this.f28932OooO0O0;
        oooO0o.f28655OooO0oo.incrementAndGet();
        Object objOooO0O0 = oooO0o.f28654OooO0oO.OooO0O0(o0o0ooo, continuation);
        if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objOooO0O0 = Unit.INSTANCE;
        }
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }

    @Nullable
    public final T getItem(@IntRange(from = ULong.MIN_VALUE) int i) {
        OooO0o<T> oooO0o = this.f28932OooO0O0;
        Objects.requireNonNull(oooO0o);
        try {
            oooO0o.f28652OooO0o = true;
            return oooO0o.f28654OooO0oO.OooO0Oo(i);
        } finally {
            oooO0o.f28652OooO0o = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f28932OooO0O0.f28654OooO0oO.f28908OooO0OO.getSize();
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
        this.f28931OooO00o = true;
        super.setStateRestorationPolicy(strategy);
    }
}
