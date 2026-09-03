package p587o0oOoo0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000OOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ooOOOOoo f47036Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f47037Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(ooOOOOoo oooooooo, int i) {
        super(2);
        this.f47036Oooo0o = oooooooo;
        this.f47037Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        ooOOOOoo.OooO0o(this.f47036Oooo0o, ooo00o, this.f47037Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
