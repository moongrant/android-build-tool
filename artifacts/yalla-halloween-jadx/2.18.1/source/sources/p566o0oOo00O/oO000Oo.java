package p566o0oOo00O;

import com.yalla.yalla.ui.activity.user.VipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o0O0O0O.OooOO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f45365Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f45366Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f45367Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(VipActivity vipActivity, OooOO0 oooOO1, int i) {
        super(2);
        this.f45365Oooo0o = vipActivity;
        this.f45366Oooo0oO = oooOO1;
        this.f45367Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        VipActivity.OooOoo0(this.f45365Oooo0o, this.f45366Oooo0oO, ooo00o, this.f45367Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
