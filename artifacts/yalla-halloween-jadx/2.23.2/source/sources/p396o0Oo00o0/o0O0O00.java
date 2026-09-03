package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.track.TrackAgent;
import com.common.support.track.TrackConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43636OooO0Oo;

    public o0O0O00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43636OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        TrackAgent.INSTANCE.init(this.f43636OooO0Oo, new TrackConfig.Builder());
    }
}
