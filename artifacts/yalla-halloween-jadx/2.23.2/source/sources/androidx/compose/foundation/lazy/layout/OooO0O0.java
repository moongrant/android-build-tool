package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    @Nullable
    public static Object OooO00o(LazyLayoutItemProvider lazyLayoutItemProvider, int i) {
        return null;
    }

    public static int OooO0O0(LazyLayoutItemProvider lazyLayoutItemProvider, @NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return -1;
    }

    @NotNull
    public static Object OooO0OO(LazyLayoutItemProvider lazyLayoutItemProvider, int i) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i);
    }
}
