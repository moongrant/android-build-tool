package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O000 extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44390OooO0Oo;

    public o000O000(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44390OooO0Oo = context;
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        YCSDKOpenKit.setApplicationId(o00Oo0.OooO0o().OooOOO0());
        YCSDKOpenKit.setApplicationKey(o00Oo0.OooO0o().OooOOO());
        YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
        YCSDKOpenKit.INSTANCE.sdkInitialize(this.f44390OooO0Oo);
    }
}
