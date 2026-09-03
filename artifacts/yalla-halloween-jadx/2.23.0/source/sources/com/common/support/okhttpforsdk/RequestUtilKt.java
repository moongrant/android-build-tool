package com.common.support.okhttpforsdk;

import java.lang.reflect.Type;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o0;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a0\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\n¨\u0006\u000b"}, d2 = {"T", "Lo0ooO0oO/o0oOOo;", "Lo0ooO0oO/o00O00o0;", "call", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "dataConvertor", "Ljava/lang/reflect/Type;", "respType", "Lcom/common/support/okhttpforsdk/HttpResponse;", "toHttpResponse", "", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class RequestUtilKt {
    @NotNull
    public static final <T> HttpResponse<T> toHttpResponse(@NotNull o0oOOo o0oooo, @NotNull o00O00o0 call, @NotNull ResponseDataConvertor dataConvertor, @Nullable Type type) {
        Intrinsics.checkNotNullParameter(o0oooo, "<this>");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(dataConvertor, "dataConvertor");
        if (!o0oooo.OooO0oO()) {
            return new HttpResponse<>(o0oooo.f57345OooO0oO, null, null, 6, null);
        }
        o0O0o o0Var = o0oooo.f57347OooOO0;
        if (o0Var == null) {
            byte[] bArr = new byte[0];
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            o00000O o00000o = new o00000O();
            o00000o.ooOO(bArr);
            Intrinsics.checkNotNullParameter(o00000o, "<this>");
            o0Var = new o0(null, 0, o00000o);
        }
        return new HttpResponse<>(o0oooo.f57345OooO0oO, dataConvertor.convert(call, o0Var, type), null, 4, null);
    }

    @NotNull
    public static final <T> HttpResponse<T> toHttpResponse(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof SocketTimeoutException ? new HttpResponse<>(-200, null, th, 2, null) : new HttpResponse<>(-100, null, th, 2, null);
    }
}
