package com.common.support.apm.sailfishhttp.convertor;

import com.common.support.apm.otlp.biz.HttpTracer;
import com.common.support.apm.sailfishhttp.HttpTracerCache;
import com.common.support.apm.utils.JsonUtilKt;
import com.common.support.okhttpforsdk.ResponseDataConvertor;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o0O0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/common/support/apm/sailfishhttp/convertor/SysServerConvertor;", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "T", "Lo0ooO0oO/o00O00o0;", "call", "Lo0ooO0oO/o0O0o;", "responseBody", "Ljava/lang/reflect/Type;", "type", "convert", "(Lo0ooO0oO/o00O00o0;Lo0ooO0oO/o0O0o;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class SysServerConvertor implements ResponseDataConvertor {
    @Override // com.common.support.okhttpforsdk.ResponseDataConvertor
    @Nullable
    public <T> T convert(@NotNull o00O00o0 call, @NotNull o0O0o responseBody, @Nullable Type type) throws JsonSyntaxException, JsonIOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        HttpTracer andRemove$sailfish_release = HttpTracerCache.INSTANCE.getAndRemove$sailfish_release(call.hashCode());
        if (andRemove$sailfish_release != null) {
            andRemove$sailfish_release.serializationStart$sailfish_release();
        }
        try {
            try {
                T t = (T) JsonUtilKt.getGson().OooO0Oo(responseBody.OooOOo(), type);
                if (andRemove$sailfish_release != null) {
                    andRemove$sailfish_release.serializationEnd$sailfish_release();
                }
                if (andRemove$sailfish_release != null) {
                    andRemove$sailfish_release.end();
                }
                return t;
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            if (andRemove$sailfish_release != null) {
                andRemove$sailfish_release.end();
            }
            throw th;
        }
    }
}
