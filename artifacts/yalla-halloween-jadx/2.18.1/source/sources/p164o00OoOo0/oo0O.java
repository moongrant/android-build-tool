package p164o00OoOo0;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00OOO0;
import p143o00OOooo.o00OOO0O;
import p161o00OoOOO.o0oOO;
import p177o00Ooooo.oO0OO00o;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0O extends o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f32542OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public RoomLoginInformation f32543OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public oO0OO00o f32544OooO0OO;

    public oo0O(@NotNull MixedRoomActivity activity, @NotNull o00OO00O liveDataSource) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        this.f32542OooO00o = activity;
        liveDataSource.f43324OooOO0.observe(activity, new o00OO0OO(this, 0));
        LiveEventBus.get("ROOM_SHOW_ROOMINFO").observe(activity, new o00OOO0O(this, 1));
        LiveEventBus.get("ROOM_DISMISS_ROOMINFO").observe(activity, new o00OOO0(this, 1));
    }

    public final void OooO00o(int i) {
        RoomLoginInformation roomLoginInformation = this.f32543OooO0O0;
        oO0OO00o oo0oo00o = new oO0OO00o();
        Bundle bundle = new Bundle();
        bundle.putSerializable("Room_Information_Key", roomLoginInformation);
        bundle.putSerializable("Room_Configuration_Key", null);
        bundle.putSerializable("INDEX", Integer.valueOf(i));
        oo0oo00o.setArguments(bundle);
        this.f32544OooO0OO = oo0oo00o;
        oo0oo00o.show(this.f32542OooO00o.getSupportFragmentManager(), (String) null);
    }
}
