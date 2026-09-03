package p489o0o00OO0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f48470OooO00o;

    public OooO(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f48470OooO00o = activity;
        OooO0OO oooO0OO = activity.f23452OoooO0;
        oooO0OO.getClass();
        Intrinsics.checkNotNullParameter(this, "manager");
        oooO0OO.f48474OooO0O0.add(this);
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();
}
