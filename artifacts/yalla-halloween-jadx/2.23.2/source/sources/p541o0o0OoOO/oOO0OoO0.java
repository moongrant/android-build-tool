package p541o0o0OoOO;

import OooO0OO.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OoO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55264OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OoO0(int i) {
        super(0);
        this.f55264OooO0Oo = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strOooO00o = OooO00o.OooO00o("{\"order\":", this.f55264OooO0Oo + 1, "}");
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10032, strOooO00o);
        }
        return Unit.INSTANCE;
    }
}
