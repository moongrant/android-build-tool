package com.common.support.apm.sailfishhttp.cookie;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O0OOO;
import p634o0ooO0oO.o00OO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/common/support/apm/sailfishhttp/cookie/AuthCookieJar;", "Lo0ooO0oO/o00O0OOO;", "", "Lokhttp3/Cookie;", "cookies", "", "isCookieValid", "Lo0ooO0oO/o00OO;", "url", "loadForRequest", "", "saveFromResponse", "Ljava/util/List;", "", "lockObject", "Ljava/lang/Object;", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class AuthCookieJar implements o00O0OOO {

    @NotNull
    private List<Cookie> cookies = CollectionsKt.emptyList();

    @NotNull
    private final Object lockObject = new Object();

    private final boolean isCookieValid(List<Cookie> cookies) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Cookie cookie : cookies) {
            if (StringsKt.OooO0o(cookie.name(), "OauthHMAC")) {
                z = true;
            } else if (StringsKt.OooO0o(cookie.name(), "OauthExpires")) {
                z2 = true;
            } else if (StringsKt.OooO0o(cookie.name(), "BearerToken")) {
                z3 = true;
            }
        }
        return z && z2 && z3;
    }

    @Override // p634o0ooO0oO.o00O0OOO
    @NotNull
    public List<Cookie> loadForRequest(@NotNull o00OO url) {
        List<Cookie> list;
        Intrinsics.checkNotNullParameter(url, "url");
        synchronized (this.lockObject) {
            if (this.cookies.isEmpty()) {
                this.cookies = CookieManager.INSTANCE.getCookies();
            }
            list = this.cookies;
        }
        return list;
    }

    @Override // p634o0ooO0oO.o00O0OOO
    public void saveFromResponse(@NotNull o00OO url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        if (isCookieValid(cookies)) {
            synchronized (this.lockObject) {
                this.cookies = cookies;
                CookieManager.INSTANCE.saveCookies(cookies);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
