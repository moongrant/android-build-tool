package p539o0o0OoO;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomUserActionRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$OperationRecordItem$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
public final class o00O0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserRecordModel f54558OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(RoomUserRecordModel roomUserRecordModel) {
        super(0);
        this.f54558OooO0Oo = roomUserRecordModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activityOooO0O0, String.valueOf(this.f54558OooO0Oo.getUserId()), false, 12);
        }
        return Unit.INSTANCE;
    }
}
