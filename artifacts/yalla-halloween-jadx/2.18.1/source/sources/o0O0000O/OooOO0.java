package o0O0000O;

import android.os.Build;
import com.common.support.atd.YS;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends o0O00000.OooO00o {
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(model, "model");
        boolean zB = true;
        try {
            zB = YS.B();
        } catch (Throwable th) {
            th.printStackTrace();
            String TAGS = Build.TAGS;
            Intrinsics.checkNotNullExpressionValue(TAGS, "TAGS");
            Process processExec = null;
            if (!StringsKt__StringsKt.contains$default(TAGS, "test-keys", false, 2, (Object) null)) {
                String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
                int i = 0;
                while (true) {
                    if (i >= 9) {
                        z = false;
                        break;
                    }
                    String str = strArr[i];
                    i++;
                    if (new File(str).exists()) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    try {
                        processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                        z2 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                    } catch (Throwable unused) {
                        if (processExec == null) {
                            z2 = false;
                        }
                        if (!z2) {
                            try {
                                if (new File("/system/app/Superuser.apk").exists()) {
                                    z3 = true;
                                } else if (OooO0O0("/system/xbin/which", "su")) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (!z3) {
                                zB = false;
                            }
                        }
                        model.f35021OooO0Oo = zB;
                    }
                    processExec.destroy();
                    if (!z2) {
                        if (new File("/system/app/Superuser.apk").exists()) {
                            z3 = true;
                        } else if (OooO0O0("/system/xbin/which", "su") || OooO0O0("/system/bin/which", "su") || OooO0O0("which", "su")) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            zB = false;
                        }
                    }
                }
            }
        }
        model.f35021OooO0Oo = zB;
    }

    public final boolean OooO0O0(String... strArr) {
        Process processExec;
        boolean z = false;
        try {
            processExec = Runtime.getRuntime().exec(strArr);
            try {
                if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                    z = true;
                }
            } catch (Throwable unused) {
                if (processExec != null) {
                }
                return z;
            }
        } catch (Throwable unused2) {
            processExec = null;
        }
        processExec.destroy();
        return z;
    }
}
