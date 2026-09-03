package p579o0oOoOOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f45987Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i) {
        super(2);
        this.f45987Oooo0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        l.OooO0O0(ooo00o, this.f45987Oooo0o | 1);
        return Unit.INSTANCE;
    }
}
