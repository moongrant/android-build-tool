package coil.network;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class HttpException extends RuntimeException {
    public HttpException(@NotNull o0oOOo o0oooo) {
        super("HTTP " + o0oooo.f57345OooO0oO + ": " + o0oooo.f57343OooO0o);
    }
}
