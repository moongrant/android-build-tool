package p003OooO0Oo;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Activity f101OooO00o;

    public OooOOO0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f101OooO00o = activity;
    }

    @Override // p003OooO0Oo.o00oO0o
    public final void OooO00o(@NotNull Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f101OooO00o.startActivityForResult(intent, i);
    }
}
