package p086o000OooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo extends Lambda implements Function1<o00000O0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0000Ooo f28439Oooo0o = new o0000Ooo();

    public o0000Ooo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0 o00000o1) {
        o00000O0 navOptions = o00000o1;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.f28429OooO0O0 = true;
        return Unit.INSTANCE;
    }
}
