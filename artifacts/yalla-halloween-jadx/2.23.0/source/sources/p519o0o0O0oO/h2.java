package p519o0o0O0oO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p475o0o000.o0OoOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f52337OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f52337OooO0Oo = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OoOo0 o0oooo0 = OooO00o.f24972OooO;
        o0oooo0.f47480OooO0OO.setValue(Boolean.valueOf(this.f52337OooO0Oo.getRankWeek().getValue().intValue() > 0));
        o0oooo0.f47479OooO0O0.setValue(Boolean.TRUE);
        o0OO000.OooO00o("102209");
        return Unit.INSTANCE;
    }
}
