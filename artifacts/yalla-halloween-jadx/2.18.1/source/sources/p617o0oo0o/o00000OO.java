package p617o0oo0o;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00000OO f48476OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f48477OooO0O0 = new MutableLiveData<>(Boolean.TRUE);

    public static final class OooO00o extends RecyclerView.o00O0O {
        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                o00000OO o00000oo2 = o00000OO.f48476OooO00o;
                o00000OO.f48477OooO0O0.setValue(Boolean.TRUE);
            } else {
                if (i != 1) {
                    return;
                }
                o00000OO o00000oo3 = o00000OO.f48476OooO00o;
                o00000OO.f48477OooO0O0.setValue(Boolean.FALSE);
            }
        }
    }

    public static final void OooO00o(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.addOnScrollListener(new OooO00o());
    }
}
