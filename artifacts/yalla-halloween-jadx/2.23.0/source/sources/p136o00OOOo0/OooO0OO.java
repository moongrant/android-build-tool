package p136o00OOOo0;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final File f37353OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f37354OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOo f37355OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37356OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f37357OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f37358OooO0o0;

    public OooO0OO(@Nullable File file, @NotNull String cloudFilePath, @NotNull OooOo uploadInfo) {
        Intrinsics.checkNotNullParameter(cloudFilePath, "cloudFilePath");
        Intrinsics.checkNotNullParameter(uploadInfo, "uploadInfo");
        this.f37353OooO00o = file;
        this.f37354OooO0O0 = cloudFilePath;
        this.f37355OooO0OO = uploadInfo;
    }

    @NotNull
    public final String OooO00o() {
        StringBuilder sbOooO00o = o00OO.OooO00o(this.f37355OooO0OO.f37396OooO0O0);
        sbOooO00o.append(this.f37354OooO0O0);
        return sbOooO00o.toString();
    }
}
