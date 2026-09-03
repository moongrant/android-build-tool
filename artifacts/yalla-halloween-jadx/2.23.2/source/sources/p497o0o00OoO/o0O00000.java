package p497o0o00OoO;

import androidx.appcompat.widget.o0000O0O;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49876OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(oo0O oo0o) {
        super(0);
        this.f49876OooO0Oo = oo0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49876OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102200");
        oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
        oo0ooo0oOooO0o0.getClass();
        o0000O0O.OooO0O0("userVehicleMessageDot", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
        SharedMainMessageManager.INSTANCE.getUserVehicleMessageDot().postValue(Boolean.FALSE);
        int i = VehicleStoreActivity.f26578OooOo;
        VehicleStoreActivity.OooO00o.OooO00o(oo0o.f49626OooO00o, false);
        return Unit.INSTANCE;
    }
}
