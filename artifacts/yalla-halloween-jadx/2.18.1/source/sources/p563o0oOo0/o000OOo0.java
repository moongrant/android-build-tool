package p563o0oOo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p462o0Ooo0o.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo0 extends o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final List<Fragment> f45058OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(@NotNull FragmentManager fragmentManager, @NotNull List<Fragment> fragmentList) {
        super(fragmentManager, fragmentList);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        this.f45058OooO = fragmentList;
    }

    @Override // androidx.fragment.app.o00000
    public final long OooOOo0(int i) {
        if (this.f45058OooO.size() == 2) {
            i++;
        }
        return i;
    }
}
