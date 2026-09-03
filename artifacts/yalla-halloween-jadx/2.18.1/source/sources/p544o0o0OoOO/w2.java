package p544o0o0OoOO;

import android.view.View;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class w2 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44333Oooo;

    public w2(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f44333Oooo = banEnterRoomListActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0OO<RoomBanEnterUser> oooO0OO = this.f44333Oooo.f22751OooooO0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setFirstLoading(true);
        this.f44333Oooo.OooOoo0();
    }
}
