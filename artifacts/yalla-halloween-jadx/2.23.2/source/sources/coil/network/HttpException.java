package coil.network;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O00o00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class HttpException extends RuntimeException {
    public HttpException(@NotNull o0O00o00 o0o00o01) {
        super("HTTP " + o0o00o01.f57850OooO0oO + ": " + o0o00o01.f57848OooO0o);
    }
}
