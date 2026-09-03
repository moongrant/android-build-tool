package o0O00000;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<OooO00o> f35032OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35033OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0O00.OooO00o f35034OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(@NotNull List<? extends OooO00o> detectors, int i, @NotNull o0O00.OooO00o model) {
        Intrinsics.checkNotNullParameter(detectors, "detectors");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f35032OooO00o = detectors;
        this.f35033OooO0O0 = i;
        this.f35034OooO0OO = model;
    }

    @NotNull
    public final o0O00.OooO00o OooO00o() {
        this.f35032OooO00o.get(this.f35033OooO0O0).OooO00o(this.f35034OooO0OO);
        if (this.f35033OooO0O0 < this.f35032OooO00o.size() - 1) {
            new OooO0OO(this.f35032OooO00o, this.f35033OooO0O0 + 1, this.f35034OooO0OO).OooO00o();
        }
        return this.f35034OooO0OO;
    }
}
