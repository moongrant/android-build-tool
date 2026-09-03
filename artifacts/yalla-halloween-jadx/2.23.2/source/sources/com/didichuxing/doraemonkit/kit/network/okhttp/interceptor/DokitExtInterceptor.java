package com.didichuxing.doraemonkit.kit.network.okhttp.interceptor;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor;", "Lo0ooOO0o/o0OoOoOo;", "Lo0ooOO0o/o0OoOoOo$OooO00o;", "chain", "Lo0ooOO0o/o0O00o00;", "intercept", "<init>", "()V", "Companion", "DokitExtInterceptorProxy", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public final class DokitExtInterceptor implements o0OoOoOo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DokitExtInterceptor";

    @Nullable
    private static DokitExtInterceptorProxy dokitExtInterceptorProxy;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor$Companion;", "", "()V", "TAG", "", "dokitExtInterceptorProxy", "Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor$DokitExtInterceptorProxy;", "getDokitExtInterceptorProxy", "()Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor$DokitExtInterceptorProxy;", "setDokitExtInterceptorProxy", "(Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor$DokitExtInterceptorProxy;)V", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final DokitExtInterceptorProxy getDokitExtInterceptorProxy() {
            return DokitExtInterceptor.dokitExtInterceptorProxy;
        }

        public final void setDokitExtInterceptorProxy(@Nullable DokitExtInterceptorProxy dokitExtInterceptorProxy) {
            DokitExtInterceptor.dokitExtInterceptorProxy = dokitExtInterceptorProxy;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/didichuxing/doraemonkit/kit/network/okhttp/interceptor/DokitExtInterceptor$DokitExtInterceptorProxy;", "", "Lo0ooOO0o/o0OoOoOo$OooO00o;", "chain", "Lo0ooOO0o/o0O00o00;", "intercept", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
    public interface DokitExtInterceptorProxy {
        @NotNull
        o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain);
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0O00o00 o0o00o00OooO0OO = chain.OooO0OO(chain.OooO00o());
        Intrinsics.checkNotNullExpressionValue(o0o00o00OooO0OO, "chain.proceed(chain.request())");
        return o0o00o00OooO0OO;
    }
}
