package com.common.support.atd.detectors;

import android.content.Context;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.sailfish_commons.logmodels.SecModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/common/support/atd/detectors/InstallerDetector;", "Lcom/common/support/atd/AbstractDetector;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InstallerDetector extends AbstractDetector {

    @NotNull
    private final Context context;

    public InstallerDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        sailfishSecModel.setAppInstallS(installerPackageName);
    }
}
