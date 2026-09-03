package p545o0o0OoOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class c8 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f44365OooO00o;

    public c8(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f44365OooO00o = activity;
        a8 a8Var = activity.f11784o0000Ooo;
        Objects.requireNonNull(a8Var);
        Intrinsics.checkNotNullParameter(this, "manager");
        a8Var.f44357OooO0O0.add(this);
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();
}
