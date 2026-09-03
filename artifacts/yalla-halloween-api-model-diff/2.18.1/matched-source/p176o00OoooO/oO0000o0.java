package p176o00OoooO;

import android.view.View;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p502o0o00o0.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0000o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32790Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f32791Oooo0oO;

    public /* synthetic */ oO0000o0(Object obj, int i) {
        this.f32790Oooo0o = i;
        this.f32791Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        switch (this.f32790Oooo0o) {
            case 0:
                oO000O0O oo000o0o = (oO000O0O) this.f32791Oooo0oO;
                Iterator<RoomLoginInformation.MIC> it = oo000o0o.f32817o00O0O.getData().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (!it.next().isSelectedForSendHats) {
                        z = true;
                    }
                }
                Iterator<RoomLoginInformation.MIC> it2 = oo000o0o.f32817o00O0O.getData().iterator();
                while (it2.hasNext()) {
                    it2.next().isSelectedForSendHats = z;
                }
                oo000o0o.f32817o00O0O.notifyDataSetChanged();
                oo000o0o.OooO0OO();
                oo000o0o.OooO0O0();
                break;
            default:
                o00000O this_apply = (o00000O) this.f32791Oooo0oO;
                ShareToFriendsActivity.OooO00o oooO00o = ShareToFriendsActivity.f22209o00o0O;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
                break;
        }
    }
}
