package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48671OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48670OooO0Oo = o000o;
        this.f48671OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue = this.f48671OooO0o0.getUserId().getValue().longValue();
        this.f48670OooO0Oo.getClass();
        oo0oOO0.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(2, jLongValue, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : Boolean.TRUE, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
        return Unit.INSTANCE;
    }
}
