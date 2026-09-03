package p600o0oo00OO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ float f48031Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O f48032Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48033Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f48034Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f48035OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f48036OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o0000O o0000o2, int i, String str, float f, int i2, int i3) {
        super(2);
        this.f48032Oooo0o = o0000o2;
        this.f48033Oooo0oO = i;
        this.f48034Oooo0oo = str;
        this.f48031Oooo = f;
        this.f48036OoooO00 = i2;
        this.f48035OoooO0 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o0000O.OooO(this.f48032Oooo0o, this.f48033Oooo0oO, this.f48034Oooo0oo, this.f48031Oooo, ooo00o, this.f48036OoooO00 | 1, this.f48035OoooO0);
        return Unit.INSTANCE;
    }
}
