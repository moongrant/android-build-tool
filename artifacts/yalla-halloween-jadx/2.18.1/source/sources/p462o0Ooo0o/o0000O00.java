package p462o0Ooo0o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class o0000O00 extends o00000 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<? extends Fragment> f40440OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(@NotNull FragmentManager fragmentManager, @NotNull List<? extends Fragment> fragmentList) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        this.f40440OooO0oo = fragmentList;
    }

    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        return this.f40440OooO0oo.size();
    }

    @Override // androidx.fragment.app.o00000
    @NotNull
    public final Fragment OooOOOo(int i) {
        return this.f40440OooO0oo.get(i);
    }
}
