package p086o000OooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends Lambda implements Function1<OooOo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00Ooo f28509Oooo0o = new o00Ooo();

    public o00Ooo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOo oooOo) {
        OooOo anim = oooOo;
        Intrinsics.checkNotNullParameter(anim, "$this$anim");
        anim.f28403OooO00o = 0;
        anim.f28404OooO0O0 = 0;
        return Unit.INSTANCE;
    }
}
