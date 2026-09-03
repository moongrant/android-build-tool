package p501o0o00o;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41487Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o000 o000Var) {
        super(1);
        this.f41487Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        o000 o000Var = this.f41487Oooo0o;
        o000Var.f41418OooOooo = false;
        o000Var.OooO0oO(true);
        return Unit.INSTANCE;
    }
}
