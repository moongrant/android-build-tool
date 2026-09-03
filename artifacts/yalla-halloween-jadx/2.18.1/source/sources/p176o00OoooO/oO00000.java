package p176o00OoooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o0000OO.OooOOOO;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class oO00000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32777Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f32778Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<String> f32779Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f32780Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(String str, o0O00OO<String> o0o00oo2, int i, int i2) {
        super(2);
        this.f32778Oooo0o = str;
        this.f32779Oooo0oO = o0o00oo2;
        this.f32780Oooo0oo = i;
        this.f32777Oooo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        OooOOOO.OooO0O0(this.f32778Oooo0o, this.f32779Oooo0oO, this.f32780Oooo0oo, ooo00o, this.f32777Oooo | 1);
        return Unit.INSTANCE;
    }
}
