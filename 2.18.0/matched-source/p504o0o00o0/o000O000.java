package p504o0o00o0;

import android.graphics.Typeface;
import android.view.View;
import com.android.billingclient.api.o0000;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p143o00OOooO.o000O0o;
import p393o0OOooOo.o0O00000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41603Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f41604OoooO00;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f41603Oooo = i;
        this.f41604OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41603Oooo) {
            case 0:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f41604OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Room_Canceljoiningattention");
                Long value = o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue();
                if (value != null) {
                    this$0.OooOO0o().unJoinRoomAndUnFollowRoom(String.valueOf(value.longValue())).observe(this$0.f20898OoooOOO, new o000O0o(this$0, 1));
                }
                Objects.requireNonNull(this$0);
                break;
            default:
                PasswordActivity this$1 = (PasswordActivity) this.f41604OoooO00;
                PasswordActivity.OooO00o oooO00o = PasswordActivity.f21800ooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOooO().f49845OooO0OO.setText("");
                this$1.OooOooO().f49845OooO0OO.setTypeface(Typeface.MONOSPACE);
                o0000.OooOO0(this$1.OooOooO().f49845OooO0OO);
                break;
        }
    }
}
