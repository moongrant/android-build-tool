package p439o0OoOo0O;

import com.code.android.videoplayer.PlayState;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p152o00OoO.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O implements OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f46098OooO00o;

    public o000000O(RoomFrameUIController roomFrameUIController) {
        this.f46098OooO00o = roomFrameUIController;
    }

    @Override // p152o00OoO.OooOO0O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f46098OooO00o.f23550OooO0oO = state;
    }
}
