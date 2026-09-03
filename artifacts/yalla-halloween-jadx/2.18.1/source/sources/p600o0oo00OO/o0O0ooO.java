package p600o0oo00OO;

import com.yalla.yalla.model.VisitorUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f48061Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f48062Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ VisitorUserInfoModel f48063Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f48064Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(o000OO00 o000oo01, VisitorUserInfoModel visitorUserInfoModel, Function0<Unit> function0, int i) {
        super(2);
        this.f48062Oooo0o = o000oo01;
        this.f48063Oooo0oO = visitorUserInfoModel;
        this.f48064Oooo0oo = function0;
        this.f48061Oooo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o000OO00.OooO0o(this.f48062Oooo0o, this.f48063Oooo0oO, this.f48064Oooo0oo, ooo00o, this.f48061Oooo | 1);
        return Unit.INSTANCE;
    }
}
