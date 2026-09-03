package com.common.support.okhttpforsdk;

import java.lang.reflect.Type;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0O0O0O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a0\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\n¨\u0006\u000b"}, d2 = {"T", "Lo0ooOO0o/o0O00o00;", "Lo0ooOO0o/o00OO;", "call", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "dataConvertor", "Ljava/lang/reflect/Type;", "respType", "Lcom/common/support/okhttpforsdk/HttpResponse;", "toHttpResponse", "", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class RequestUtilKt {
    @NotNull
    public static final <T> HttpResponse<T> toHttpResponse(@NotNull o0O00o00 o0o00o01, @NotNull o00OO call, @NotNull ResponseDataConvertor dataConvertor, @Nullable Type type) {
        Intrinsics.checkNotNullParameter(o0o00o01, "<this>");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(dataConvertor, "dataConvertor");
        if (!o0o00o01.OooO0oO()) {
            return new HttpResponse<>(o0o00o01.f57850OooO0oO, null, null, 6, null);
        }
        o0O00oO0 o0o0o0o = o0o00o01.f57852OooOO0;
        if (o0o0o0o == null) {
            byte[] bArr = new byte[0];
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            oo0OOoo oo0oooo = new oo0OOoo();
            oo0oooo.o00Ooo(bArr);
            Intrinsics.checkNotNullParameter(oo0oooo, "<this>");
            o0o0o0o = new o0O0O0O(null, 0, oo0oooo);
        }
        return new HttpResponse<>(o0o00o01.f57850OooO0oO, dataConvertor.convert(call, o0o0o0o, type), null, 4, null);
    }

    @NotNull
    public static final <T> HttpResponse<T> toHttpResponse(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof SocketTimeoutException ? new HttpResponse<>(-200, null, th, 2, null) : new HttpResponse<>(-100, null, th, 2, null);
    }
}
