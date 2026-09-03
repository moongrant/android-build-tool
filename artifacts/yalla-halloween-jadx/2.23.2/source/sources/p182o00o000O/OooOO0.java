package p182o00o000O;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends Lambda implements Function2<Integer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function3<Integer, Integer, Long, Unit> f38409OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOo.OooO00o oooO00o) {
        super(2);
        this.f38409OooO0Oo = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        this.f38409OooO0Oo.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), 0L);
        return Unit.INSTANCE;
    }
}
