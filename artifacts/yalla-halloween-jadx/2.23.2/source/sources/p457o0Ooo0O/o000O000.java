package p457o0Ooo0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p363o0OOo00O.OooO0o;
import p460o0Ooo0o.o00OOO00;
import p460o0Ooo0o.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000O000 f47691OooO0Oo = new o000O000();

    public o000O000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        oo0o0O0.OooO00o("_ChangeVoice", "background voice change: " + iIntValue);
        OooO0o oooO0o = o00OOO00.f47803OooO00o;
        o00OOO00.f47803OooO00o.OooO0oO(((float) iIntValue) / 100.0f);
        return Unit.INSTANCE;
    }
}
