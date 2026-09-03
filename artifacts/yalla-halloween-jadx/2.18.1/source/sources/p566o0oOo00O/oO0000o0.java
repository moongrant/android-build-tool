package p566o0oOo00O;

import android.view.View;
import com.app.base.model.RoomIndexModel;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import kotlin.jvm.internal.Intrinsics;
import o00OO0.OooOO0O;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserRoomsActivity f45357Oooo;

    public oO0000o0(UserRoomsActivity userRoomsActivity) {
        this.f45357Oooo = userRoomsActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooOO0O<RoomIndexModel> oooOO0O = this.f45357Oooo.f23565OooooO0;
        Intrinsics.checkNotNull(oooOO0O);
        oooOO0O.setFirstLoading(true);
        this.f45357Oooo.OooOooo();
    }
}
