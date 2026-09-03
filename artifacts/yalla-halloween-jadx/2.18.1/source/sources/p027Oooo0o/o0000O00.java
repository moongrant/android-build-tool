package p027Oooo0o;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 extends Lambda implements Function1<o000O000.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<o000OO> f1836Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000OO f1837Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(List<o000OO> list, o000OO o000oo2) {
        super(1);
        this.f1836Oooo0o = list;
        this.f1837Oooo0oO = o000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000O000.OooO00o oooO00o) {
        o000O000.OooO00o invoke = oooO00o;
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        List<o000OO> list = this.f1836Oooo0o;
        o000OO o000oo2 = this.f1837Oooo0oO;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o000OO o000oo3 = list.get(i);
            if (o000oo3 != o000oo2) {
                o000oo3.OooO0o(invoke);
            }
        }
        o000OO o000oo4 = this.f1837Oooo0oO;
        if (o000oo4 != null) {
            o000oo4.OooO0o(invoke);
        }
        return Unit.INSTANCE;
    }
}
