package com.common.support.atd.detectors;

import android.os.Build;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.atd.YS;
import com.common.support.atd.utils.UtilsKt;
import com.common.support.sailfish_commons.logmodels.SecModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/common/support/atd/detectors/RootDetector;", "Lcom/common/support/atd/AbstractDetector;", "()V", "canExecuteCommand", "", "command", "", "", "([Ljava/lang/String;)Z", "cr1", "cr2", "cr3", "cr4", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RootDetector extends AbstractDetector {
    private final boolean canExecuteCommand(String... command) {
        boolean z = false;
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(command);
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                z = true;
            }
        } catch (Throwable unused) {
            if (processExec != null) {
            }
            return z;
        }
        processExec.destroy();
        return z;
    }

    private final boolean cr1() {
        String TAGS = Build.TAGS;
        Intrinsics.checkNotNullExpressionValue(TAGS, "TAGS");
        return StringsKt.OooO0o(TAGS, "test-keys");
    }

    private final boolean cr2() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i = 0; i < 9; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    private final boolean cr3() {
        boolean z = false;
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                z = true;
            }
        } catch (Throwable unused) {
            if (processExec != null) {
            }
            return z;
        }
        processExec.destroy();
        return z;
    }

    private final boolean cr4() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return canExecuteCommand("/system/xbin/which", "su") || canExecuteCommand("/system/bin/which", "su") || canExecuteCommand("which", "su");
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        boolean zB;
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        try {
            zB = YS.B();
        } catch (Throwable th) {
            th.printStackTrace();
            zB = cr1() || cr2() || cr3() || cr4();
        }
        sailfishSecModel.setRoot(zB);
        resultForApi.setA4(UtilsKt.toInt(sailfishSecModel.getRoot()));
    }
}
