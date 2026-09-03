package p544o0o0OoOO;

import android.view.View;
import com.app.base.model.MoraHistoryModel;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class q5 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameHistoryActivity f44298Oooo;

    public q5(RoomMoraGameHistoryActivity roomMoraGameHistoryActivity) {
        this.f44298Oooo = roomMoraGameHistoryActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0OO<MoraHistoryModel> oooO0OO = this.f44298Oooo.f22947Oooooo;
        if (oooO0OO != null) {
            oooO0OO.setFirstLoading(true);
        }
        this.f44298Oooo.OooOoOO();
    }
}
