package p476o0o0000o;

import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;
import p351o0OOOo0O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 implements FlowCollector<Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f47592OooO0Oo;

    public o000OO00(RoomLiveService roomLiveService) {
        this.f47592OooO0Oo = roomLiveService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Integer num, Continuation continuation) {
        int iIntValue = num.intValue();
        OooOO0 oooOO1 = this.f47592OooO0Oo.f25063OooO0oO;
        if (oooOO1 != null) {
            Boxing.boxInt(oooOO1.OooOO0(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
