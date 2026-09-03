package p651o0ooOoOO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p449o0OoOoOo.o0OOo000;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class kj implements o0OOo000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO f51149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f51150OooO0O0;

    public kj(@NotNull o00OO okHttpClient, @NotNull o00OOO00 originalRequest) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f51149OooO00o = okHttpClient;
        this.f51150OooO0O0 = originalRequest;
    }

    @Override // o0OoOoOo.o0OOo000.OooO00o
    @NotNull
    public final o0OOo000 OooO00o() {
        return new jj(this.f51149OooO00o, this.f51150OooO0O0);
    }
}
