package p179o00o00;

import com.qiniu.android.storage.Configuration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Configuration f38396OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f38397OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f38398OooO0OO;

    public OooOOOO() {
        Configuration configurationBuild = new Configuration.Builder().resumeUploadVersion(Configuration.RESUME_UPLOAD_VERSION_V2).useConcurrentResumeUpload(true).concurrentTaskCount(3).build();
        Intrinsics.checkNotNullExpressionValue(configurationBuild, "build(...)");
        this.f38396OooO00o = configurationBuild;
        this.f38397OooO0O0 = 2.147483648E9d;
    }
}
