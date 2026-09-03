package p634o0ooO0oO;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO implements o00O0OOO {
    @Override // p634o0ooO0oO.o00O0OOO
    @NotNull
    public final List<Cookie> loadForRequest(@NotNull o00OO url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return CollectionsKt.emptyList();
    }

    @Override // p634o0ooO0oO.o00O0OOO
    public final void saveFromResponse(@NotNull o00OO url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
