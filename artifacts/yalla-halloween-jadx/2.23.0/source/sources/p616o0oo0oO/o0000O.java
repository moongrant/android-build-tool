package p616o0oo0oO;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O extends o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LazyListItemInfo f57097OooO00o;

    public o0000O(@NotNull LazyListItemInfo lazyListItem) {
        Intrinsics.checkNotNullParameter(lazyListItem, "lazyListItem");
        this.f57097OooO00o = lazyListItem;
    }

    @Override // p616o0oo0oO.o000O00O
    public final int OooO00o() {
        return this.f57097OooO00o.getIndex();
    }

    @Override // p616o0oo0oO.o000O00O
    public final int OooO0O0() {
        return this.f57097OooO00o.getOffset();
    }

    @Override // p616o0oo0oO.o000O00O
    public final int OooO0OO() {
        return this.f57097OooO00o.getSize();
    }
}
