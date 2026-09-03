package p558o0oOOoo;

import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import o00OOO.OooO00o;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p616o0oo0Ooo.oO0O00;
import p617o0oo0o.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0000O implements o0O0ooO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomScreenShotManager f44746OooO00o;

    public o0O0000O(RoomScreenShotManager roomScreenShotManager) {
        this.f44746OooO00o = roomScreenShotManager;
    }

    @Override // o0oo0o.o0O0ooO.OooO00o
    public final void OooO00o(@Nullable String str) {
        RoomScreenShotManager roomScreenShotManager = this.f44746OooO00o;
        roomScreenShotManager.f23138OooO0o = str;
        if (str == null) {
            return;
        }
        o0O00000.OooO0OO("Screenshot_create");
        roomScreenShotManager.f23135OooO0O0.setVisibility(0);
        roomScreenShotManager.f23135OooO0O0.clearAnimation();
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(roomScreenShotManager.f44365OooO00o);
        oooO00o.f48426OooO = str;
        oooO00o.f48427OooO00o = 5;
        oooO00o.OooO00o(OooO00o.OooO0o());
        oooO00o.f48454OooOoo0 = 2;
        oooO00o.OooO0oO(4);
        oooO00o.OooO0o(roomScreenShotManager.f23136OooO0OO);
        roomScreenShotManager.f23135OooO0O0.setEnabled(true);
        roomScreenShotManager.f23135OooO0O0.postDelayed(roomScreenShotManager.f23139OooO0o0, 3000L);
    }
}
