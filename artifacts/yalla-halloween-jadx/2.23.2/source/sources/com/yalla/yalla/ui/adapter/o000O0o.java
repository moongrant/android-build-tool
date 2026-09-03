package com.yalla.yalla.ui.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O0o extends oO0o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final List<Fragment> f27075OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(@NotNull FragmentManager fragmentManager, @NotNull List<Fragment> fragmentList) {
        super(fragmentManager, fragmentList);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        this.f27075OooO = fragmentList;
    }

    @Override // androidx.fragment.app.o0000Ooo
    public final long OooOOo(int i) {
        if (this.f27075OooO.size() == 2) {
            i++;
        }
        return i;
    }
}
