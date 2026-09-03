package p544o0o0OoOO;

import android.view.View;
import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;
import p522o0o0O0o.oo0oOO0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class b3 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44205Oooo;

    public b3(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f44205Oooo = banEnterRoomListActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f44205Oooo;
        boolean z = !banEnterRoomListActivity.f22747OoooOoO;
        banEnterRoomListActivity.f22747OoooOoO = z;
        if (z) {
            TextView textView = banEnterRoomListActivity.f22748OoooOoo;
            if (textView != null) {
                textView.setText(oo0oOO0.OooO0OO(R.string.Done));
            }
        } else {
            TextView textView2 = banEnterRoomListActivity.f22748OoooOoo;
            if (textView2 != null) {
                textView2.setText(oo0oOO0.OooO0OO(R.string.Edit));
            }
        }
        OooO0OO<RoomBanEnterUser> oooO0OO = this.f44205Oooo.f22751OooooO0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.notifyDataSetChanged();
    }
}
