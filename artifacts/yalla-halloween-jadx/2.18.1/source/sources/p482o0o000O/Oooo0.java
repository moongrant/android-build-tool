package p482o0o000O;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.util.NetWork;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0 extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40867OooO0OO;

    public Oooo0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40867OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        Context context = this.f40867OooO0OO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        NetWork.f26259OooO00o = ((Application) context).getApplicationContext();
    }
}
