package p490o0o00OOO;

import android.support.v4.media.session.OooO0o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f48618OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(long j) {
        super(0);
        this.f48618OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10017, OooO0o.OooO0O0(new StringBuilder("{\"to\":"), this.f48618OooO0Oo, "}"));
        }
        return Unit.INSTANCE;
    }
}
