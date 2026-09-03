package p586o0oOooO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000Ooo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class oO0o0000 extends o0000Ooo {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<? extends Fragment> f56717OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0000(@NotNull FragmentManager fragmentManager, @NotNull List<? extends Fragment> fragmentList) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        this.f56717OooO0oo = fragmentList;
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        return this.f56717OooO0oo.size();
    }

    @Override // androidx.fragment.app.o0000Ooo
    @NotNull
    public final Fragment OooOOo0(int i) {
        return this.f56717OooO0oo.get(i);
    }
}
