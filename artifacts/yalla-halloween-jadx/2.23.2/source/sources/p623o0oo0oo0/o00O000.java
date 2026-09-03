package p623o0oo0oo0;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O000 extends oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LazyListItemInfo f57641OooO00o;

    public o00O000(@NotNull LazyListItemInfo lazyListItem) {
        Intrinsics.checkNotNullParameter(lazyListItem, "lazyListItem");
        this.f57641OooO00o = lazyListItem;
    }

    @Override // p623o0oo0oo0.oo00o
    public final int OooO00o() {
        return this.f57641OooO00o.getIndex();
    }

    @Override // p623o0oo0oo0.oo00o
    public final int OooO0O0() {
        return this.f57641OooO00o.getOffset();
    }

    @Override // p623o0oo0oo0.oo00o
    public final int OooO0OO() {
        return this.f57641OooO00o.getSize();
    }
}
