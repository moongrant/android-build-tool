package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f46672Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O(int i) {
        super(2);
        this.f46672Oooo0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOo00o00.OooO0o0(ooo00o, this.f46672Oooo0o | 1);
        return Unit.INSTANCE;
    }
}
