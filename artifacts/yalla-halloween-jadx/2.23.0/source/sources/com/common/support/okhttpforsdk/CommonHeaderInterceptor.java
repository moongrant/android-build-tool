package com.common.support.okhttpforsdk;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B,\u0012#\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0006¢\u0006\u0002\b\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R1\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/common/support/okhttpforsdk/CommonHeaderInterceptor;", "Lo0ooO0oO/o00OOO00;", "Lo0ooO0oO/o00OOO00$OooO00o;", "chain", "Lo0ooO0oO/o0oOOo;", "intercept", "Lkotlin/Function1;", "Lo0ooO0oO/o00OOOOo;", "", "", "Lkotlin/ExtensionFunctionType;", "headersFunc", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CommonHeaderInterceptor implements o00OOO00 {

    @NotNull
    private final Function1<o00OOOOo, Map<String, String>> headersFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonHeaderInterceptor(@NotNull Function1<? super o00OOOOo, ? extends Map<String, String>> headersFunc) {
        Intrinsics.checkNotNullParameter(headersFunc, "headersFunc");
        this.headersFunc = headersFunc;
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o00OOOOo o00oooooOooO00o = chain.OooO00o();
        o00oooooOooO00o.getClass();
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00oooooOooO00o);
        Map<String, String> mapInvoke = this.headersFunc.invoke(chain.OooO00o());
        for (String str : mapInvoke.keySet()) {
            String str2 = mapInvoke.get(str);
            if (str2 != null) {
                oooO00o.OooO0oo(str);
                oooO00o.OooO00o(str, str2);
            }
        }
        return chain.OooO0O0(oooO00o.OooO0O0());
    }
}
