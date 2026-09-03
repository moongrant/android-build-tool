package p645o0ooOOoo;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p441o0OoOo00.o0OO00O;
import p525o0o0OO0.o00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class n3 extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f58113OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00OO f58114OooO0O0;

    public n3(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f58113OooO00o = activity;
        LiveEventBus.get("ROOM_SHOW_ROOMINFO").observe(activity, new l3(this, 0));
        LiveEventBus.get("ROOM_DISMISS_ROOMINFO").observe(activity, new m3(this, 0));
    }

    public final void OooO00o(int i) {
        o00OO o00oo2 = new o00OO();
        Bundle bundle = new Bundle();
        bundle.putSerializable("INDEX", Integer.valueOf(i));
        o00oo2.setArguments(bundle);
        this.f58114OooO0O0 = o00oo2;
        o00oo2.show(this.f58113OooO00o.getSupportFragmentManager(), (String) null);
    }
}
