package p495o0o00Ooo;

import android.widget.LinearLayout;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import org.jetbrains.annotations.Nullable;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p579o0oOoo.oOOO00Oo;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo implements oOOO00Oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f48968OooO00o;

    public oo0OOoo(RoomScreenShotManager roomScreenShotManager) {
        this.f48968OooO00o = roomScreenShotManager;
    }

    @Override // o0oOoo.oOOO00Oo.OooO00o
    public final void OooO00o(@Nullable String str) {
        RoomScreenShotManager roomScreenShotManager = this.f48968OooO00o;
        roomScreenShotManager.f26816OooO0o = str;
        if (str == null) {
            return;
        }
        o0OO000.OooO00o("202019");
        LinearLayout linearLayout = roomScreenShotManager.f26813OooO0O0;
        linearLayout.setVisibility(0);
        linearLayout.clearAnimation();
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(roomScreenShotManager.f48470OooO00o);
        oooO00o.f43908OooO = str;
        oooO00o.f43909OooO00o = 5;
        oooO00o.OooO00o(OooO.OooO0Oo());
        oooO00o.f43936OooOoo0 = 2;
        oooO00o.OooO0o0(4);
        oooO00o.OooO0Oo(roomScreenShotManager.f26814OooO0OO);
        linearLayout.setEnabled(true);
        linearLayout.postDelayed(roomScreenShotManager.f26817OooO0o0, 3000L);
    }
}
