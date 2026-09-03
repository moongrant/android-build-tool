package com.common.support.atd.detectors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.atd.YS;
import com.common.support.atd.utils.UtilsKt;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.facebook.internal.ServerProtocol;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0003J\u001b\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/common/support/atd/detectors/EmulatorDetector;", "Lcom/common/support/atd/AbstractDetector;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "andyFiles", "", "", "[Ljava/lang/String;", "genyFiles", "noxFiles", "pipes", "qemuDrivers", "x86Files", "advancedCheck", "", "basicCheck", "checkFiles", "files", "([Ljava/lang/String;)Z", "checkQEmuDrivers", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "isEmulator", "packageNameCheck", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EmulatorDetector extends AbstractDetector {

    @NotNull
    private final String[] andyFiles;

    @NotNull
    private final Context context;

    @NotNull
    private final String[] genyFiles;

    @NotNull
    private final String[] noxFiles;

    @NotNull
    private final String[] pipes;

    @NotNull
    private final String[] qemuDrivers;

    @NotNull
    private final String[] x86Files;

    public EmulatorDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.qemuDrivers = new String[]{"goldfish"};
        this.genyFiles = new String[]{"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
        this.pipes = new String[]{"/dev/socket/qemud", "/dev/qemu_pipe"};
        this.x86Files = new String[]{"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
        this.andyFiles = new String[]{"fstab.andy", "ueventd.andy.rc"};
        this.noxFiles = new String[]{"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};
    }

    private final boolean advancedCheck() {
        return checkFiles(this.genyFiles) || checkFiles(this.andyFiles) || checkFiles(this.noxFiles) || checkFiles(this.pipes) || checkFiles(this.x86Files) || checkQEmuDrivers();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:109:0x0229  */
    /* JADX WARN: Code duplicated, block: B:119:0x0249  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    @SuppressLint({"HardwareIds"})
    private final boolean basicCheck() {
        int i;
        Object obj;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String PRODUCT = Build.PRODUCT;
        int i2 = (Intrinsics.areEqual(PRODUCT, "sdk_x86_64") || Intrinsics.areEqual(PRODUCT, "sdk_google_phone_x86") || Intrinsics.areEqual(PRODUCT, "sdk_google_phone_x86_64") || Intrinsics.areEqual(PRODUCT, "sdk_google_phone_arm64") || Intrinsics.areEqual(PRODUCT, "vbox86p")) ? 1 : 0;
        String MANUFACTURER = Build.MANUFACTURER;
        if (Intrinsics.areEqual(MANUFACTURER, "unknown")) {
            i2++;
        }
        String str4 = Build.BRAND;
        if (Intrinsics.areEqual(str4, "generic") || StringsKt.OooOO0o(str4, "android") || Intrinsics.areEqual(str4, "generic_arm64") || Intrinsics.areEqual(str4, "generic_x86") || Intrinsics.areEqual(str4, "generic_x86_64")) {
            i2++;
        }
        String DEVICE = Build.DEVICE;
        if (Intrinsics.areEqual(DEVICE, "generic") || Intrinsics.areEqual(DEVICE, "generic_arm64") || Intrinsics.areEqual(DEVICE, "generic_x86") || Intrinsics.areEqual(DEVICE, "generic_x86_64") || Intrinsics.areEqual(DEVICE, "vbox86p")) {
            i2++;
        }
        String MODEL = Build.MODEL;
        if (Intrinsics.areEqual(MODEL, ServerProtocol.DIALOG_PARAM_SDK_VERSION) || Intrinsics.areEqual(MODEL, "Android SDK built for arm64") || Intrinsics.areEqual(MODEL, "Android SDK built for armv7") || Intrinsics.areEqual(MODEL, "Android SDK built for x86") || Intrinsics.areEqual(MODEL, "Android SDK built for x86_64")) {
            i2++;
        }
        String HARDWARE = Build.HARDWARE;
        if (Intrinsics.areEqual(HARDWARE, "ranchu")) {
            i2++;
        }
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.OooO0o(FINGERPRINT, "sdk_google_phone_arm64")) {
            i2++;
        } else {
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt.OooO0o(FINGERPRINT, "sdk_google_phone_armv7")) {
                i2++;
            }
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.Oooo00o(FINGERPRINT, "generic")) {
            i = i2;
            obj = "google_sdk";
            str = str4;
            str2 = "generic";
            str3 = "BRAND";
            z = true;
        } else {
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            if (StringsKt.OooO0o(MODEL, "google_sdk")) {
                i = i2;
                obj = "google_sdk";
                str = str4;
                str2 = "generic";
                str3 = "BRAND";
            } else {
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                Locale ROOT = Locale.ROOT;
                i = i2;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = MODEL.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (StringsKt.OooO0o(lowerCase, "droid4x")) {
                    obj = "google_sdk";
                    str2 = "generic";
                    str = str4;
                    str3 = "BRAND";
                } else {
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    if (StringsKt.OooO0o(MODEL, "Emulator")) {
                        obj = "google_sdk";
                        str2 = "generic";
                        str = str4;
                        str3 = "BRAND";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (StringsKt.OooO0o(MODEL, "Android SDK built for x86")) {
                            obj = "google_sdk";
                            str2 = "generic";
                            str = str4;
                            str3 = "BRAND";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (StringsKt.OooO0o(MANUFACTURER, "Genymotion") || Intrinsics.areEqual(HARDWARE, "goldfish") || Intrinsics.areEqual(HARDWARE, "vbox86") || Intrinsics.areEqual(PRODUCT, ServerProtocol.DIALOG_PARAM_SDK_VERSION)) {
                                obj = "google_sdk";
                                str2 = "generic";
                                str = str4;
                                str3 = "BRAND";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                if (StringsKt.Oooo00o(PRODUCT, "google_sdk") || Intrinsics.areEqual(PRODUCT, "sdk_x86") || Intrinsics.areEqual(PRODUCT, "vbox86p")) {
                                    obj = "google_sdk";
                                    str2 = "generic";
                                    str = str4;
                                    str3 = "BRAND";
                                } else {
                                    String BOARD = Build.BOARD;
                                    Intrinsics.checkNotNullExpressionValue(BOARD, "BOARD");
                                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                    String lowerCase2 = BOARD.toLowerCase(ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                                    if (StringsKt.OooO0o(lowerCase2, "nox")) {
                                        obj = "google_sdk";
                                    } else {
                                        String BOOTLOADER = Build.BOOTLOADER;
                                        obj = "google_sdk";
                                        Intrinsics.checkNotNullExpressionValue(BOOTLOADER, "BOOTLOADER");
                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                        String lowerCase3 = BOOTLOADER.toLowerCase(ROOT);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
                                        if (!StringsKt.OooO0o(lowerCase3, "nox")) {
                                            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                            String lowerCase4 = HARDWARE.toLowerCase(ROOT);
                                            Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.String).toLowerCase(locale)");
                                            if (!StringsKt.OooO0o(lowerCase4, "nox")) {
                                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                String lowerCase5 = PRODUCT.toLowerCase(ROOT);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.String).toLowerCase(locale)");
                                                if (!StringsKt.OooO0o(lowerCase5, "nox")) {
                                                    String SERIAL = Build.SERIAL;
                                                    Intrinsics.checkNotNullExpressionValue(SERIAL, "SERIAL");
                                                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                    String lowerCase6 = SERIAL.toLowerCase(ROOT);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.String).toLowerCase(locale)");
                                                    if (!StringsKt.OooO0o(lowerCase6, "nox")) {
                                                        String HOST = Build.HOST;
                                                        Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                        if (!StringsKt.OooO0o(HOST, "Droid4x-B uildStation")) {
                                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                            if (!StringsKt.Oooo00o(MANUFACTURER, "iToolsAVM")) {
                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                if (!StringsKt.Oooo00o(DEVICE, "iToolsAVM")) {
                                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                    if (!StringsKt.Oooo00o(MODEL, "iToolsAVM")) {
                                                                        str = str4;
                                                                        str3 = "BRAND";
                                                                        Intrinsics.checkNotNullExpressionValue(str, str3);
                                                                        str2 = "generic";
                                                                        if (!StringsKt.Oooo00o(str, str2)) {
                                                                            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                                                            if (!StringsKt.Oooo00o(HARDWARE, "vbox86")) {
                                                                                z = false;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    str2 = "generic";
                                    str = str4;
                                    str3 = "BRAND";
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        }
        if (z) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(str, str3);
        if (StringsKt.Oooo00o(str, str2)) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.Oooo00o(DEVICE, str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z3 = z2 | z;
        if (z3) {
            return true;
        }
        return Intrinsics.areEqual(obj, PRODUCT) || z3 || i >= 2;
    }

    private final boolean checkFiles(String[] files) {
        for (String str : files) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    private final boolean checkQEmuDrivers() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    String str = new String(bArr, Charsets.UTF_8);
                    for (String str2 : this.qemuDrivers) {
                        if (StringsKt.OooO0o(str, str2)) {
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    private final boolean isEmulator(Context context) {
        return basicCheck() || advancedCheck() || packageNameCheck(context);
    }

    private final boolean packageNameCheck(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
                if (StringsKt.Oooo00o(str, "com.bluestacks.")) {
                    return true;
                }
            }
            List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
            Intrinsics.checkNotNullExpressionValue(installedApplications, "packageManager\n         …ageManager.GET_META_DATA)");
            Iterator<ApplicationInfo> it2 = installedApplications.iterator();
            while (it2.hasNext()) {
                String packageName = it2.next().packageName;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (StringsKt.Oooo00o(packageName, "com.vphone.") || StringsKt.Oooo00o(packageName, "com.bignox.") || StringsKt.Oooo00o(packageName, "com.nox.mopen.app") || StringsKt.Oooo00o(packageName, "me.haima.") || StringsKt.Oooo00o(packageName, "com.bluestacks.")) {
                    return true;
                }
                if (StringsKt.Oooo00o(packageName, "cn.itools.")) {
                    String PRODUCT = Build.PRODUCT;
                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                    if (StringsKt.Oooo00o(PRODUCT, "iToolsAVM")) {
                        return true;
                    }
                }
                if (StringsKt.Oooo00o(packageName, "com.kop.") || StringsKt.Oooo00o(packageName, "com.kaopu.") || StringsKt.Oooo00o(packageName, "com.microvirt.") || Intrinsics.areEqual(packageName, "com.google.android.launcher.layouts.genymotion")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        boolean zIsEmulator;
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        try {
            zIsEmulator = YS.C();
        } catch (Throwable th) {
            th.printStackTrace();
            zIsEmulator = isEmulator(this.context);
        }
        sailfishSecModel.setEmulator(zIsEmulator);
        resultForApi.setA6(UtilsKt.toInt(sailfishSecModel.getEmulator()));
    }
}
