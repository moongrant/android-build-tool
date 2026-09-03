package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49900OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49899OooO0Oo = oo0o;
        this.f49900OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue = this.f49900OooO0o0.getUserId().getValue().longValue();
        this.f49899OooO0Oo.getClass();
        o00O00.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(2, jLongValue, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : Boolean.TRUE, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
        return Unit.INSTANCE;
    }
}
