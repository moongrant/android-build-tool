package p495o0o00Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f49626OooO00o;

    public OooOO0O(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f49626OooO00o = activity;
        OooO oooO = activity.f22983OoooO0;
        oooO.getClass();
        Intrinsics.checkNotNullParameter(this, "manager");
        oooO.f49616OooO0O0.add(this);
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();
}
