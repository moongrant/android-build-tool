package p502o0o00o0;

import android.graphics.Typeface;
import android.view.View;
import com.android.billingclient.api.o0000;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p142o00OOooO.o000O0o;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41584Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41585Oooo0oO;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f41584Oooo0o = i;
        this.f41585Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41584Oooo0o) {
            case 0:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f41585Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Room_Canceljoiningattention");
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value != null) {
                    this$0.OooOO0o().unJoinRoomAndUnFollowRoom(String.valueOf(value.longValue())).observe(this$0.f20878OoooO, new o000O0o(this$0, 1));
                }
                Objects.requireNonNull(this$0);
                break;
            default:
                PasswordActivity this$1 = (PasswordActivity) this.f41585Oooo0oO;
                PasswordActivity.OooO00o oooO00o = PasswordActivity.f21781OoooooO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOooO().f49908OooO0OO.setText("");
                this$1.OooOooO().f49908OooO0OO.setTypeface(Typeface.MONOSPACE);
                o0000.OooOO0(this$1.OooOooO().f49908OooO0OO);
                break;
        }
    }
}
