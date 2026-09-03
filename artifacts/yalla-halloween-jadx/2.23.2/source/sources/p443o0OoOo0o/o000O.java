package p443o0OoOo0o;

import com.yalla.android.videoplayer.PlayState;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p204o00o0o0O.o0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f47276OooO00o;

    public o000O(RoomFrameUIController roomFrameUIController) {
        this.f47276OooO00o = roomFrameUIController;
    }

    @Override // p204o00o0o0O.o0000O
    public final void OooO00o(@NotNull PlayState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f47276OooO00o.f23090OooO0oO = state;
    }
}
