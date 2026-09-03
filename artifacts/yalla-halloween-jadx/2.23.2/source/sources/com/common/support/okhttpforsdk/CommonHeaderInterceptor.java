package com.common.support.okhttpforsdk;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B,\u0012#\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0006¢\u0006\u0002\b\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R1\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/common/support/okhttpforsdk/CommonHeaderInterceptor;", "Lo0ooOO0o/o0OoOoOo;", "Lo0ooOO0o/o0OoOoOo$OooO00o;", "chain", "Lo0ooOO0o/o0O00o00;", "intercept", "Lkotlin/Function1;", "Lo0ooOO0o/o0O00O0o;", "", "", "Lkotlin/ExtensionFunctionType;", "headersFunc", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CommonHeaderInterceptor implements o0OoOoOo {

    @NotNull
    private final Function1<o0O00O0o, Map<String, String>> headersFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonHeaderInterceptor(@NotNull Function1<? super o0O00O0o, ? extends Map<String, String>> headersFunc) {
        Intrinsics.checkNotNullParameter(headersFunc, "headersFunc");
        this.headersFunc = headersFunc;
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0O00O0o o0o00o0oOooO00o = chain.OooO00o();
        o0o00o0oOooO00o.getClass();
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0oOooO00o);
        Map<String, String> mapInvoke = this.headersFunc.invoke(chain.OooO00o());
        for (String str : mapInvoke.keySet()) {
            String str2 = mapInvoke.get(str);
            if (str2 != null) {
                oooO00o.OooO0oo(str);
                oooO00o.OooO00o(str, str2);
            }
        }
        return chain.OooO0OO(oooO00o.OooO0O0());
    }
}
