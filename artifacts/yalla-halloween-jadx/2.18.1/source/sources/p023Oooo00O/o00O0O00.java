package p023Oooo00O;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oo00o f1162OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oo00o f1163OooO0O0;

    public o00O0O00(oo00o oo00oVar, oo00o oo00oVar2) {
        this.f1162OooO00o = oo00oVar;
        this.f1163OooO0O0 = oo00oVar2;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        oo00o oo00oVar = this.f1162OooO00o;
        oo00o transition = this.f1163OooO0O0;
        Objects.requireNonNull(oo00oVar);
        Intrinsics.checkNotNullParameter(transition, "transition");
        oo00oVar.f1243OooO.remove(transition);
    }
}
