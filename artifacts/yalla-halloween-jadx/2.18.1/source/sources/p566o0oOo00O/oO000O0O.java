package p566o0oOo00O;

import com.yalla.yalla.ui.activity.user.VipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O00o0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000O0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f45361Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f45362Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f45363Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0O(VipActivity vipActivity, o00O00o0 o00o00o1, int i) {
        super(2);
        this.f45361Oooo0o = vipActivity;
        this.f45362Oooo0oO = o00o00o1;
        this.f45363Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        VipActivity.OooOoO0(this.f45361Oooo0o, this.f45362Oooo0oO, ooo00o, this.f45363Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
