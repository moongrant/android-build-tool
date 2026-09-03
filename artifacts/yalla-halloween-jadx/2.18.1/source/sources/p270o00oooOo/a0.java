package p270o00oooOo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f34962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f34963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f34964OooO0OO;

    public a0(@NotNull String logPath, @NotNull String namePrefix) {
        Intrinsics.checkNotNullParameter(logPath, "logPath");
        Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
        this.f34962OooO00o = logPath;
        this.f34963OooO0O0 = namePrefix;
        this.f34964OooO0OO = ".xlog";
    }
}
