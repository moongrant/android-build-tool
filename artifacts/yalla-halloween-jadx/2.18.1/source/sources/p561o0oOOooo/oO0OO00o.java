package p561o0oOOooo;

import com.app.base.mixedroom.model.RoomConfiguration;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import p062o0000o0O.o0ooOOo;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.o00O0;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f44915Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44916Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00o(oOo000Oo ooo000oo, int i) {
        super(0);
        this.f44915Oooo0o = ooo000oo;
        this.f44916Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        Integer value = oooO00o.OooO00o().f43329OooOOOO.getValue();
        if (value != null && value.intValue() == 1) {
            o00O0 o00o1 = new o00O0(this.f44915Oooo0o.f44365OooO00o);
            o00o1.OooOOO(o000O0O0.OooO0OO(R.string.host_take_mic));
            o00o1.OooOOO(o000O0O0.OooO0OO(R.string.host_lock_mic));
            o00o1.OooOOoo((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(new oO00o0(this.f44915Oooo0o, this.f44916Oooo0oO), 2));
            o00o1.OooOOO0();
            return null;
        }
        if (value != null && value.intValue() == 0) {
            RoomConfiguration roomConfiguration = o000O00O.OooO().f32427Oooo;
            if (roomConfiguration != null && !roomConfiguration.isGuestlive()) {
                oOo000Oo ooo000oo = this.f44915Oooo0o;
                ooo000oo.f44923OooO0O0.runOnUiThread(new o0ooOOo(ooo000oo, 2));
                return null;
            }
            if (this.f44915Oooo0o.f44927OooO0o0 == null) {
                return null;
            }
            if (o000O00O.OooO().OooOOo0()) {
                oOo000Oo.OooO0OO(this.f44915Oooo0o, this.f44916Oooo0oO);
                return null;
            }
            this.f44915Oooo0o.OooO(this.f44916Oooo0oO, AppEventsConstants.EVENT_PARAM_VALUE_NO, false, false);
            return null;
        }
        if (value == null || value.intValue() != 2) {
            if (o000O00O.OooO().OooOOo0()) {
                oOo000Oo.OooO0OO(this.f44915Oooo0o, this.f44916Oooo0oO);
                return null;
            }
            oOo000Oo ooo000oo2 = this.f44915Oooo0o;
            if (ooo000oo2.f44927OooO0o0 == null) {
                return null;
            }
            ooo000oo2.OooO(this.f44916Oooo0oO, AppEventsConstants.EVENT_PARAM_VALUE_NO, false, false);
            return null;
        }
        if (!Intrinsics.areEqual(oooO00o.OooO00o().f43349Oooo00O.getValue(), Boolean.TRUE)) {
            if (o000O00O.OooO().OooOOo0()) {
                oOo000Oo.OooO0OO(this.f44915Oooo0o, this.f44916Oooo0oO);
                return null;
            }
            this.f44915Oooo0o.OooO(this.f44916Oooo0oO, AppEventsConstants.EVENT_PARAM_VALUE_NO, false, false);
            return null;
        }
        o00O0 o00o2 = new o00O0(this.f44915Oooo0o.f44365OooO00o);
        o00o2.OooOOO(o000O0O0.OooO0OO(R.string.host_take_mic));
        o00o2.OooOOO(o000O0O0.OooO0OO(R.string.host_lock_mic));
        o00o2.OooOOoo(new oOo00ooO(this.f44915Oooo0o, this.f44916Oooo0oO));
        o00o2.OooOOO0();
        return null;
    }
}
