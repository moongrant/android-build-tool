package p395o0Oo00o;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43618OooO0Oo;

    public OooO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43618OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43618OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
    }
}
