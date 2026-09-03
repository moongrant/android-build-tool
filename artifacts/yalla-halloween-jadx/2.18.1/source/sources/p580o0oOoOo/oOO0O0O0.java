package p580o0oOoOo;

import android.app.Activity;
import com.weieyu.yalla.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o000OO00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o00oOoo;
import p255o00ooO0o.oo0oOO0;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o0OO00O;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oOO0O0O0 f46673Oooo0o = new oOO0O0O0();

    public oOO0O0O0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        OooOo.OooO0OO("102231", MapsKt.mapOf(new Pair("type", Integer.valueOf(!oooO0o.OooO0Oo() ? 1 : 0))));
        if (o00OO00O.f43313OooooOo.OooO00o().OooOOOO() && !oooO0o.OooO0OO()) {
            o00oOoo.OooO00o(R.string.request_permission_open_apply_mic);
        } else if (oooO0o.OooO0Oo()) {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
                oo0ooo0.OooOo0(R.string.close_apply_mic_confirm_tip);
                oo0ooo0.OooOo(ooooO000.f46744Oooo0o);
                oo0ooo0.OooOOOo(R.string.Turn_Off);
                oo0ooo0.OooOo0o(oOO0.f46660Oooo0o);
                oo0ooo0.OooOOO0();
            }
        } else {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            o0OO00O o0oo00oOooO0o0 = OooOOO0.OooO0o0();
            StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "roomFirstOpenApplyMic");
            sbOooO00o.append(OooOOO.f41216OooO00o.OooOo().getValue());
            if (o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), true)) {
                o00O000 o00o002 = o00O000.f34346OooO00o;
                Activity activityOooO0O1 = o00O000.OooO0O0();
                if (activityOooO0O1 != null) {
                    oo0oOO0 oo0ooo1 = new oo0oOO0(activityOooO0O1);
                    oo0ooo1.OooOo0O(o000O0O0.OooO0OO(R.string.first_open_apply_mic_tip));
                    oo0ooo1.OooOo(oOO0O000.f46670Oooo0o);
                    oo0ooo1.OooOOo0(o000O0O0.OooO0OO(R.string.Turn_On));
                    oo0ooo1.OooOo0o(oOO0O00O.f46671Oooo0o);
                    oo0ooo1.OooOO0O(oOO0O0.f46669Oooo0o);
                    oo0ooo1.OooOOO0();
                }
            } else {
                o00O o00o2 = o00O.f43140OooO00o;
                o00O.f43155OooOOo.setValue(Boolean.FALSE);
                p159o00OoOO.o00O000.OooO().OooOoOO(true);
            }
        }
        return Unit.INSTANCE;
    }
}
