package p476o0o0000o;

import com.code.android.util.o000000;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import p351o0OOOo0O.OooOO0;
import p533o0o0Oo0.oo0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 implements FlowCollector<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f47588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f47589OooO0o0;

    public o000O0O0(oo0O oo0o, RoomLiveService roomLiveService) {
        this.f47588OooO0Oo = oo0o;
        this.f47589OooO0o0 = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Boolean bool, Continuation continuation) {
        OooOO0 oooOO1;
        boolean zBooleanValue = bool.booleanValue();
        oo0O oo0o = this.f47588OooO0Oo;
        if (oo0o.f54838OooO0OO.getValue().longValue() > 0 && (oooOO1 = this.f47589OooO0o0.f25063OooO0oO) != null) {
            oooOO1.OooO0o(o000000.OooO0OO(oo0o.f54838OooO0OO.getValue()), zBooleanValue);
        }
        return Unit.INSTANCE;
    }
}
