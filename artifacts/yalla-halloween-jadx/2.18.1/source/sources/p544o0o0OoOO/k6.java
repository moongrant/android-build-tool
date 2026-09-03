package p544o0o0OoOO;

import com.app.base.view.pop.memberFee.MemberFeeModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p159o00OoOO.o00O000;
import p160o00OoOO0.o00OO0O0;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class k6 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f44263OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f44264OooO0O0;

    public k6(RoomSettingActivity roomSettingActivity, int i) {
        this.f44263OooO00o = roomSettingActivity;
        this.f44264OooO0O0 = i;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        if (this.f44263OooO00o.f22972Ooooo0o == null) {
            return;
        }
        o00OO00O.f43313OooooOo.OooO00o().f43338OooOo0o.postValue(Integer.valueOf(this.f44264OooO0O0));
        MemberFeeModel memberFeeModel = this.f44263OooO00o.f22974OooooOO;
        if (memberFeeModel != null) {
            memberFeeModel.setFee(this.f44264OooO0O0);
        }
        o00O000.OooO().OooOo0(this.f44264OooO0O0 + "");
    }
}
