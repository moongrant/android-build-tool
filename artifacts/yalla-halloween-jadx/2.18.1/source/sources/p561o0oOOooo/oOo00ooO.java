package p561o0oOOooo;

import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p251o00ooO.o000Oo0;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00ooO extends Lambda implements Function2<Integer, o000Oo0, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f44940Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44941Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(oOo000Oo ooo000oo, int i) {
        super(2);
        this.f44940Oooo0o = ooo000oo;
        this.f44941Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, o000Oo0 o000oo1) {
        Integer num2 = num;
        if (num2 != null && num2.intValue() == 0) {
            this.f44940Oooo0o.OooO(this.f44941Oooo0oO, AppEventsConstants.EVENT_PARAM_VALUE_NO, false, false);
            return null;
        }
        if (num2 == null || num2.intValue() != 1 || this.f44940Oooo0o.f44927OooO0o0 == null) {
            return null;
        }
        if (o000O00O.OooO().OooOOOo()) {
            o00O000.OooO().OooOOoo(Integer.valueOf(this.f44941Oooo0oO + 1));
            return null;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f44940Oooo0o.f44365OooO00o);
        oo0ooo0.OooOo0(R.string.no_mic_available);
        oo0ooo0.OooOOo(true);
        oo0ooo0.OooOOO0();
        return null;
    }
}
