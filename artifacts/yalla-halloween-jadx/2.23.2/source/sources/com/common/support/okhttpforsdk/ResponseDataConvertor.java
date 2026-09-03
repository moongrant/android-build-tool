package com.common.support.okhttpforsdk;

import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "", "T", "Lo0ooOO0o/o00OO;", "call", "Lo0ooOO0o/o0O00oO0;", "responseBody", "Ljava/lang/reflect/Type;", "type", "convert", "(Lo0ooOO0o/o00OO;Lo0ooOO0o/o0O00oO0;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface ResponseDataConvertor {
    @Nullable
    <T> T convert(@NotNull o00OO call, @NotNull o0O00oO0 responseBody, @Nullable Type type);
}
