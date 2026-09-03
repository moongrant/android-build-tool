package p600o0oo00OO;

import com.yalla.yalla.model.VisitorUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f47999Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f48000Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ VisitorUserInfoModel f48001Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f48002Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o000OO00 o000oo01, VisitorUserInfoModel visitorUserInfoModel, Function0<Unit> function0, int i) {
        super(2);
        this.f48000Oooo0o = o000oo01;
        this.f48001Oooo0oO = visitorUserInfoModel;
        this.f48002Oooo0oo = function0;
        this.f47999Oooo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o000OO00.OooO0o0(this.f48000Oooo0o, this.f48001Oooo0oO, this.f48002Oooo0oo, ooo00o, this.f47999Oooo | 1);
        return Unit.INSTANCE;
    }
}
