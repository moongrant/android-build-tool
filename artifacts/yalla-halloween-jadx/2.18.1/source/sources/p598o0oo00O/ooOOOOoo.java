package p598o0oo00O;

import coil.request.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO0.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOOOoo implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f47892OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f47893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f47894OooO0Oo;

    public ooOOOOoo(o0O00OO o0o00oo2, o0O00OO o0o00oo3, o0O00OO o0o00oo4) {
        this.f47892OooO0O0 = o0o00oo2;
        this.f47893OooO0OO = o0o00oo3;
        this.f47894OooO0Oo = o0o00oo4;
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void OooO00o(@NotNull OooO00o request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void OooO0O0(@NotNull OooO00o request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void OooO0OO(@NotNull OooO00o request, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f47892OooO0O0.setValue(Boolean.FALSE);
    }

    @Override // coil.request.OooO00o.OooO0O0
    public final void OooO0Oo(@NotNull OooO00o request, @NotNull OooOOO0.OooO00o metadata) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f47893OooO0OO.setValue(Boolean.FALSE);
        this.f47894OooO0Oo.setValue(Boolean.TRUE);
    }
}
