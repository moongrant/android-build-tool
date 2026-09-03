package p139o00OOOo0;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f31791Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Integer f31792Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(RoomUserInfoModel roomUserInfoModel, Integer num) {
        super(3);
        this.f31791Oooo0o = roomUserInfoModel;
        this.f31792Oooo0oO = num;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
        o0O00OO<Boolean> it = o0o00oo2;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o;
            o0O0oo0o.OooO0Oo(it, null, null, o00O0000.OooO00o(ooo00o2, -1237078161, new o000O00O(this.f31791Oooo0o, this.f31792Oooo0oO, o0o00oo3)), false, false, null, null, null, false, null, false, new o000O0(o0o00oo3, this.f31791Oooo0o), null, false, null, o000O0Oo.f31786Oooo0o, null, null, ooo00o2, (iIntValue & 14) | 3072, 1572864, 454646);
        }
        return Unit.INSTANCE;
    }
}
