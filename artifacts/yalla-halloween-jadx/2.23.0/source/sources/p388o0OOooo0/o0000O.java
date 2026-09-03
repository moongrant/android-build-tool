package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.track.TrackAgent;
import com.common.support.track.TrackConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44382OooO0Oo;

    public o0000O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44382OooO0Oo = context;
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        TrackAgent.INSTANCE.init(this.f44382OooO0Oo, new TrackConfig.Builder());
    }
}
