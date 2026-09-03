package o0O0000O;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends o0O00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35046OooO00o;

    public OooO0o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35046OooO00o = context;
    }

    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String installerPackageName = this.f35046OooO00o.getPackageManager().getInstallerPackageName(this.f35046OooO00o.getPackageName());
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        Objects.requireNonNull(model);
        Intrinsics.checkNotNullParameter(installerPackageName, "<set-?>");
        model.f35020OooO0OO = installerPackageName;
    }
}
