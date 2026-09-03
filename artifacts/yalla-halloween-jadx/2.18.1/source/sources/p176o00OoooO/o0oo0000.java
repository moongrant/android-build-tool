package p176o00OoooO;

import com.weieyu.yalla.R;
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
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0oo0000 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f32771Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f32772Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f32773Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f32774Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f32775OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0oo0000(String str, Function1<? super String, Unit> function1, String str2, String str3, int i) {
        super(3);
        this.f32772Oooo0o = str;
        this.f32773Oooo0oO = function1;
        this.f32774Oooo0oo = str2;
        this.f32771Oooo = str3;
        this.f32775OoooO00 = i;
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
            String str = this.f32774Oooo0oo;
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                if (str == null) {
                    str = "";
                }
                objOooO0o = o0OOO00.OooO0Oo(str);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o;
            String strOooO0OO = o000O0O0.OooO0OO(R.string.button_send);
            boolean z = ((CharSequence) o0o00oo3.getValue()).length() > 0;
            String str2 = this.f32772Oooo0o;
            o000OOo0 o000ooo0OooO00o = o00O0000.OooO00o(ooo00o2, -75330285, new o0o0000(this.f32771Oooo, o0o00oo3, this.f32775OoooO00));
            Function1<String, Unit> function1 = this.f32773Oooo0oO;
            ooo00o2.OooO0o0(511388516);
            boolean zOooo0oo = ooo00o2.Oooo0oo(function1) | ooo00o2.Oooo0oo(o0o00oo3);
            Object objOooO0o2 = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new oO0Oo(function1, o0o00oo3);
                ooo00o2.Oooo00o(objOooO0o2);
            }
            ooo00o2.Oooo0o0();
            o0O0oo0o.OooO0Oo(it, str2, null, o000ooo0OooO00o, true, false, null, null, strOooO0OO, z, null, false, (Function0) objOooO0o2, null, false, null, null, null, null, ooo00o2, (iIntValue & 14) | 27648, 0, 519396);
        }
        return Unit.INSTANCE;
    }
}
