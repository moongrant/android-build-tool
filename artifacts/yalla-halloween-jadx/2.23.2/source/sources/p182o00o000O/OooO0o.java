package p182o00o000O;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final File f38403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f38404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Oooo000 f38405OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f38407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38408OooO0o0;

    public OooO0o(@Nullable File file, @NotNull String cloudFilePath, @NotNull Oooo000 uploadInfo) {
        Intrinsics.checkNotNullParameter(cloudFilePath, "cloudFilePath");
        Intrinsics.checkNotNullParameter(uploadInfo, "uploadInfo");
        this.f38403OooO00o = file;
        this.f38404OooO0O0 = cloudFilePath;
        this.f38405OooO0OO = uploadInfo;
    }

    @NotNull
    public final String OooO00o() {
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(this.f38405OooO0OO.f38465OooO0O0);
        sbOooO00o.append(this.f38404OooO0O0);
        return sbOooO00o.toString();
    }
}
