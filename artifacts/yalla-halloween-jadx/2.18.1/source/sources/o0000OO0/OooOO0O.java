package o0000OO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f27442Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f27443Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f27444Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f27445Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(o00OOOO0 o00oooo1, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.f27443Oooo0o = o00oooo1;
        this.f27444Oooo0oO = function2;
        this.f27445Oooo0oo = i;
        this.f27442Oooo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        OooO0OO.OooO0O0(this.f27443Oooo0o, this.f27444Oooo0oO, ooo00o, this.f27445Oooo0oo | 1, this.f27442Oooo);
        return Unit.INSTANCE;
    }
}
