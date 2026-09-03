package p037OoooOo0;

import androidx.media3.common.Player;
import androidx.media3.exoplayer.OooO;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.o00O0OOO;
import p080o000OoO.o00000;
import p559o0oOOoo0.o0O000O;
import p569o0oOo0Oo.o0O0OO0;
import p597o0oo00O.OooOOOO;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0000 implements o000O0.OooO0OO, o00000.OooO00o, o0O000O, o0O0OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1571OooO0o0;

    public /* synthetic */ o00O0000(Object obj, int i) {
        this.f1570OooO0Oo = i;
        this.f1571OooO0o0 = obj;
    }

    public final void OooO00o(String content) {
        MomentSendActivity this$0 = (MomentSendActivity) this.f1571OooO0o0;
        int i = MomentSendActivity.f25728Oooo0OO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        OooOOOO.OooO0O0("onMaskAdd content = " + content);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this$0.f25741OooOooo > this$0.f25740OooOooO) {
            this$0.f25741OooOooo = timeInMillis;
            if (Intrinsics.areEqual(content, "@")) {
                this$0.OooOo().f44318OooO0o.OooO0oO(true);
            }
        }
    }

    @Override // o0ooOO0.o000O0.OooO0OO
    public final Object OooO0O0(o000O0.OooO00o oooO00o) {
        ((o00oOoo) this.f1571OooO0o0).f1582OooOOO = oooO00o;
        return "SurfaceOutputImpl close future complete";
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f1570OooO0Oo;
        Object obj = this.f1571OooO0o0;
        switch (i) {
            case 3:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) obj;
                int i2 = RoomMoraGameListDialog.f27497OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                RoomMoraGameListDialog.OooOO0o(0L, true);
                break;
            default:
                MainRoomRecommendFragment.initView$lambda$3((MainRoomRecommendFragment) obj);
                break;
        }
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        o00O0OOO o00o0ooo2 = (o00O0OOO) this.f1571OooO0o0;
        int i = OooO.f7126Ooooooo;
        ((Player.OooO0OO) obj).onIsPlayingChanged(o00o0ooo2.OooOO0O());
    }
}
