package p533o0o0Oo0;

import OooO0OO.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f54763OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(int i) {
        super(0);
        this.f54763OooO0Oo = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strOooO00o = OooO00o.OooO00o("{\"order\":", this.f54763OooO0Oo + 1, "}");
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10032, strOooO00o);
        }
        return Unit.INSTANCE;
    }
}
