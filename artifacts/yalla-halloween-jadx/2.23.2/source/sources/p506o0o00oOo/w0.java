package p506o0o00oOo;

import android.view.View;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p507o0o00oo.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserRoomsActivity f50598OooO0oO;

    public w0(UserRoomsActivity userRoomsActivity) {
        this.f50598OooO0oO = userRoomsActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserRoomsActivity userRoomsActivity = this.f50598OooO0oO;
        o0ooOOo<RoomIndexModel> o0ooooo = userRoomsActivity.f26901OooOo0O;
        Intrinsics.checkNotNull(o0ooooo);
        o0ooooo.Oooo00O(true);
        userRoomsActivity.f26902OooOo0o = 1;
        userRoomsActivity.OooOoO0(true);
    }
}
