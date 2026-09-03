package p388o0OOooo0;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000000O extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44378OooO0Oo;

    public o000000O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44378OooO0Oo = context;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Context context = this.f44378OooO0Oo;
        FacebookSdk.sdkInitialize(context);
        AppEventsLogger.Companion companion = AppEventsLogger.INSTANCE;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        companion.activateApp((Application) context);
    }
}
