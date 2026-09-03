package com.common.support.atd.network.convertor;

import com.common.support.atd.utils.JsonUtilKt;
import com.common.support.okhttpforsdk.ResponseDataConvertor;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/common/support/atd/network/convertor/SysServerConvertor;", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "T", "Lo0ooOO0o/o00OO;", "call", "Lo0ooOO0o/o0O00oO0;", "responseBody", "Ljava/lang/reflect/Type;", "type", "convert", "(Lo0ooOO0o/o00OO;Lo0ooOO0o/o0O00oO0;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 7, 1})
public final class SysServerConvertor implements ResponseDataConvertor {
    @Override // com.common.support.okhttpforsdk.ResponseDataConvertor
    @Nullable
    public <T> T convert(@NotNull o00OO call, @NotNull o0O00oO0 responseBody, @Nullable Type type) throws JsonSyntaxException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        return (T) JsonUtilKt.getGson().OooO0Oo(responseBody.OooOo00(), type);
    }
}
