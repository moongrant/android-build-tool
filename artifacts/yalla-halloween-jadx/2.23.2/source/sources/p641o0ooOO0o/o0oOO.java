package p641o0ooOO0o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oOO implements o0O00o0 {
    @Override // p641o0ooOO0o.o0O00o0
    @NotNull
    public final List<Cookie> loadForRequest(@NotNull o0O000O url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return CollectionsKt.emptyList();
    }

    @Override // p641o0ooOO0o.o0O00o0
    public final void saveFromResponse(@NotNull o0O000O url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
