package p003OooO0o0;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f120OooO00o;

    public Oooo0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f120OooO00o = activity;
    }

    @Override // p003OooO0o0.o000OOo
    public final void OooO00o(int i, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f120OooO00o.startActivityForResult(intent, i);
    }
}
