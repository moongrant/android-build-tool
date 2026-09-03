package p544o0o0OoOO;

import com.app.base.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class j6 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f44258Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f44258Oooo0o = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        RoomSettingActivity roomSettingActivity = this.f44258Oooo0o;
        RoomConfiguration roomConfiguration = roomSettingActivity.f22972Ooooo0o;
        if (roomConfiguration != null) {
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o00000OO.f32210OooO0Oo.OooO0Oo(roomConfiguration.getBarid(), iIntValue, new k6(roomSettingActivity, iIntValue));
        }
        return Unit.INSTANCE;
    }
}
