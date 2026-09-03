package p490o0o00OOO;

import com.google.firebase.messaging.o0OO00O;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48632OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(o000O o000o) {
        super(0);
        this.f48632OooO0Oo = o000o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O o000o = this.f48632OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102200");
        o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
        o0o0o00OooO0o0.getClass();
        o0OO00O.OooO00o("userVehicleMessageDot", o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
        SharedMainMessageManager.INSTANCE.getUserVehicleMessageDot().postValue(Boolean.FALSE);
        int i = VehicleStoreActivity.f27043OooOo;
        VehicleStoreActivity.OooO00o.OooO00o(o000o.f48470OooO00o, false);
        return Unit.INSTANCE;
    }
}
