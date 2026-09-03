package p401o0Oo0OO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000OO;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class o00Oo0 extends o00000OO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<? extends Fragment> f44460OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(@NotNull FragmentManager fragmentManager, @NotNull List<? extends Fragment> fragmentList) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        this.f44460OooO0oo = fragmentList;
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0OO() {
        return this.f44460OooO0oo.size();
    }

    @Override // androidx.fragment.app.o00000OO
    @NotNull
    public final Fragment OooOOo0(int i) {
        return this.f44460OooO0oo.get(i);
    }
}
