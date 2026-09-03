package p023Oooo00O;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f1059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o f1060OooO0O0;

    public o000O0(o000Oo0 o000oo1, o000Oo0.OooO00o oooO00o) {
        this.f1059OooO00o = o000oo1;
        this.f1060OooO0O0 = oooO00o;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o000Oo0 o000oo1 = this.f1059OooO00o;
        o000Oo0.OooO00o<?, ?> animation = this.f1060OooO0O0;
        Objects.requireNonNull(o000oo1);
        Intrinsics.checkNotNullParameter(animation, "animation");
        o000oo1.f1089OooO00o.OooOO0O(animation);
    }
}
