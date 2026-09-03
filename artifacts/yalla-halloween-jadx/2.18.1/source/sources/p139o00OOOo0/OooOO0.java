package p139o00OOOo0;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31703Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f31704Oooo0o;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f31706Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ String f31707OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ String f31710OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ Integer f31711OoooOO0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f31705Oooo0oO = 1;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f31709OoooO00 = 1;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ long f31708OoooO0 = 50;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(Function1 function1, String str, int i, String str2, String str3, Integer num) {
        super(3);
        this.f31704Oooo0o = function1;
        this.f31706Oooo0oo = str;
        this.f31703Oooo = i;
        this.f31710OoooO0O = str2;
        this.f31707OoooO = str3;
        this.f31711OoooOO0 = num;
    }

    public static final void OooO00o(o0O00OO<Long> o0o00oo2, long j, long j2, o0O00OO<Boolean> o0o00oo3, o0O00OO<Boolean> o0o00oo4) {
        if (o0o00oo2.getValue().longValue() < j) {
            o0o00oo2.setValue(Long.valueOf(j));
        } else if (o0o00oo2.getValue().longValue() > j2) {
            o0o00oo2.setValue(Long.valueOf(j2));
        }
        o0o00oo3.setValue(Boolean.valueOf(o0o00oo2.getValue().longValue() > j));
        o0o00oo4.setValue(Boolean.valueOf(o0o00oo2.getValue().longValue() < j2));
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
            long j = this.f31705Oooo0oO;
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Long.valueOf(j));
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o;
            Object value = o0o00oo3.getValue();
            String str = this.f31706Oooo0oo;
            int i = this.f31703Oooo;
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(value);
            Object objOooO0o2 = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                StringBuilder sb = new StringBuilder();
                sb.append(o0O0O00.OooO0Oo((((long) i) * ((Number) o0o00oo3.getValue()).longValue()) + ""));
                sb.append(' ');
                objOooO0o2 = o0OOO00.OooO0Oo(OooOo.OooO00o(str, sb.toString()));
                ooo00o2.Oooo00o(objOooO0o2);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo4 = (o0O00OO) objOooO0o2;
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o3 = ooo00o2.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00o2.Oooo00o(objOooO0o3);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo5 = (o0O00OO) objOooO0o3;
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o4 = ooo00o2.OooO0o();
            if (objOooO0o4 == c0323OooO00o) {
                objOooO0o4 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00o2.Oooo00o(objOooO0o4);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo6 = (o0O00OO) objOooO0o4;
            OooO00o(o0o00oo3, this.f31709OoooO00, this.f31708OoooO0, o0o00oo5, o0o00oo6);
            String strOooO0OO = o000O0O0.OooO0OO(R.string.choose_quantity);
            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Confirm);
            o000OOo0 o000ooo0OooO00o = o00O0000.OooO00o(ooo00o2, -1384211806, new OooO0o(this.f31710OoooO0O, this.f31707OoooO, this.f31711OoooOO0, o0o00oo3, this.f31709OoooO00, this.f31708OoooO0, o0o00oo5, o0o00oo6, o0o00oo4));
            Function1<Long, Unit> function1 = this.f31704Oooo0o;
            ooo00o2.OooO0o0(511388516);
            boolean zOooo0oo2 = ooo00o2.Oooo0oo(function1) | ooo00o2.Oooo0oo(o0o00oo3);
            Object objOooO0o5 = ooo00o2.OooO0o();
            if (zOooo0oo2 || objOooO0o5 == c0323OooO00o) {
                objOooO0o5 = new OooO(function1, o0o00oo3);
                ooo00o2.Oooo00o(objOooO0o5);
            }
            ooo00o2.Oooo0o0();
            o0O0oo0o.OooO0Oo(it, strOooO0OO, null, o000ooo0OooO00o, true, false, null, null, strOooO0OO2, false, null, false, (Function0) objOooO0o5, null, false, null, null, null, null, ooo00o2, (iIntValue & 14) | 27648, 0, 519908);
        }
        return Unit.INSTANCE;
    }
}
