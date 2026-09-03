package p023Oooo00O;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0O0 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oo00o f1319OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oo00o.OooO0o f1320OooO0O0;

    public oo0o0O0(oo00o oo00oVar, oo00o.OooO0o oooO0o) {
        this.f1319OooO00o = oo00oVar;
        this.f1320OooO0O0 = oooO0o;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        oo00o oo00oVar = this.f1319OooO00o;
        oo00o.OooO0o animation = this.f1320OooO0O0;
        Objects.requireNonNull(oo00oVar);
        Intrinsics.checkNotNullParameter(animation, "animation");
        oo00oVar.f1251OooO0oo.remove(animation);
    }
}
