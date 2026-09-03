package p396o0Oo00o0;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43632OooO0Oo;

    public o000oOoO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43632OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43632OooO0Oo;
        FacebookSdk.sdkInitialize(context);
        AppEventsLogger.Companion companion = AppEventsLogger.INSTANCE;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        companion.activateApp((Application) context);
    }
}
