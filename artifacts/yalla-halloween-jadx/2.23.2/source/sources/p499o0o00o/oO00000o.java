package p499o0o00o;

import android.widget.LinearLayout;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p590o0oOooo0.t0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000o implements t0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f50018OooO00o;

    public oO00000o(RoomScreenShotManager roomScreenShotManager) {
        this.f50018OooO00o = roomScreenShotManager;
    }

    @Override // o0oOooo0.t0.OooO00o
    public final void OooO00o(@Nullable String str) {
        RoomScreenShotManager roomScreenShotManager = this.f50018OooO00o;
        roomScreenShotManager.f26362OooO0o = str;
        if (str == null) {
            return;
        }
        OooO00o.OooO0O0("202019");
        LinearLayout linearLayout = roomScreenShotManager.f26359OooO0O0;
        linearLayout.setVisibility(0);
        linearLayout.clearAnimation();
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(roomScreenShotManager.f49626OooO00o);
        oooO00o.f43123OooO = str;
        oooO00o.f43124OooO00o = 5;
        oooO00o.OooO00o(d1.OooO0Oo());
        oooO00o.f43151OooOoo0 = 2;
        oooO00o.OooO0o0(4);
        oooO00o.OooO0Oo(roomScreenShotManager.f26360OooO0OO);
        linearLayout.setEnabled(true);
        linearLayout.postDelayed(roomScreenShotManager.f26363OooO0o0, 3000L);
    }
}
