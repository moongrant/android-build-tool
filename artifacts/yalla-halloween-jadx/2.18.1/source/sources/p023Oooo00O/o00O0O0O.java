package p023Oooo00O;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0O implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oo00o f1164OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oo00o.OooO00o f1165OooO0O0;

    public o00O0O0O(oo00o oo00oVar, oo00o.OooO00o oooO00o) {
        this.f1164OooO00o = oo00oVar;
        this.f1165OooO0O0 = oooO00o;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        oO0Oo animation;
        oo00o oo00oVar = this.f1164OooO00o;
        oo00o.OooO00o deferredAnimation = this.f1165OooO0O0;
        Objects.requireNonNull(oo00oVar);
        Intrinsics.checkNotNullParameter(deferredAnimation, "deferredAnimation");
        oo00o<S>.C0010OooO00o<T, V>.OooO00o<T, V> c0010OooO00o = deferredAnimation.f1262OooO0OO;
        if (c0010OooO00o == 0 || (animation = c0010OooO00o.f1265Oooo0o) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(animation, "animation");
        oo00oVar.f1251OooO0oo.remove(animation);
    }
}
