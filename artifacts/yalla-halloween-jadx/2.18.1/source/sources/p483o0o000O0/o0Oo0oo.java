package p483o0o000O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;
import p497o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40879OooO0OO;

    public o0Oo0oo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40879OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        YCSDKOpenKit.setApplicationId(OooOOO0.OooO0o().OooOOO0());
        YCSDKOpenKit.setApplicationKey(OooOOO0.OooO0o().OooOOO());
        YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
        YCSDKOpenKit.INSTANCE.sdkInitialize(this.f40879OooO0OO);
    }
}
