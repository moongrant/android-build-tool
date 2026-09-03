package p177o00OoooO;

import android.view.View;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p504o0o00o0.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO000O0O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32812Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32813OoooO00;

    public /* synthetic */ oO000O0O(Object obj, int i) {
        this.f32812Oooo = i;
        this.f32813OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        switch (this.f32812Oooo) {
            case 0:
                oO0OoOO0 oo0oooo0 = (oO0OoOO0) this.f32813OoooO00;
                Iterator<RoomLoginInformation.MIC> it = oo0oooo0.f32887o00o0O.getData().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (!it.next().isSelectedForSendHats) {
                        z = true;
                    }
                }
                Iterator<RoomLoginInformation.MIC> it2 = oo0oooo0.f32887o00o0O.getData().iterator();
                while (it2.hasNext()) {
                    it2.next().isSelectedForSendHats = z;
                }
                oo0oooo0.f32887o00o0O.notifyDataSetChanged();
                oo0oooo0.OooO0OO();
                oo0oooo0.OooO0O0();
                break;
            default:
                o00000O this_apply = (o00000O) this.f32813OoooO00;
                ShareToFriendsActivity.OooO00o oooO00o = ShareToFriendsActivity.f22228o00oO0o;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
                break;
        }
    }
}
