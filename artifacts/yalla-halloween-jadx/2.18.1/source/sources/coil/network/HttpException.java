package coil.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public final class HttpException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(@NotNull o00OOOO0 response) {
        super("HTTP " + response.f51443OoooO00 + ": " + ((Object) response.f51437Oooo));
        Intrinsics.checkNotNullParameter(response, "response");
    }
}
