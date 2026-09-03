package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000000O extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43629OooO0Oo;

    public o000000O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43629OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        YCSDKOpenKit.setApplicationId(o00Ooo.OooO0o().OooOOO0());
        YCSDKOpenKit.setApplicationKey(o00Ooo.OooO0o().OooOOO());
        YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
        YCSDKOpenKit.INSTANCE.sdkInitialize(this.f43629OooO0Oo);
    }
}
