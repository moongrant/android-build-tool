package p438o0OoOo00;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p434o0OoOOo0.o00O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 extends o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f46092OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO0o f46093OooO0O0;

    public o0O0O00(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46092OooO00o = activity;
        LiveEventBus.get("ROOM_SHOW_ROOMINFO").observe(activity, new o0OO00O(this));
        LiveEventBus.get("ROOM_DISMISS_ROOMINFO").observe(activity, new oo0o0Oo(this));
    }

    public final void OooO00o(int i) {
        OooO0o oooO0o = new OooO0o();
        Bundle bundle = new Bundle();
        bundle.putSerializable("INDEX", Integer.valueOf(i));
        oooO0o.setArguments(bundle);
        this.f46093OooO0O0 = oooO0o;
        oooO0o.show(this.f46092OooO00o.getSupportFragmentManager(), (String) null);
    }
}
