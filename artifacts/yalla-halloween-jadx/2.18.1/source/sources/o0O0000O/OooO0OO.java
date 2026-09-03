package o0O0000O;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.common.support.atd.YS;
import com.facebook.internal.ServerProtocol;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends o0O00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String[] f35040OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String[] f35041OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String[] f35042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String[] f35043OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String[] f35044OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String[] f35045OooO0oO;

    public OooO0OO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35039OooO00o = context;
        this.f35040OooO0O0 = new String[]{"goldfish"};
        this.f35041OooO0OO = new String[]{"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
        this.f35042OooO0Oo = new String[]{"/dev/socket/qemud", "/dev/qemu_pipe"};
        this.f35044OooO0o0 = new String[]{"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
        this.f35043OooO0o = new String[]{"fstab.andy", "ueventd.andy.rc"};
        this.f35045OooO0oO = new String[]{"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};
    }

    /* JADX WARN: Code duplicated, block: B:111:0x023f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:114:0x0254  */
    /* JADX WARN: Code duplicated, block: B:124:0x0274  */
    /* JADX WARN: Code duplicated, block: B:133:0x0285  */
    /* JADX WARN: Code duplicated, block: B:170:0x0317  */
    /* JADX WARN: Code duplicated, block: B:177:0x0342 A[Catch: all -> 0x03e6, TRY_ENTER, TryCatch #1 {all -> 0x03e6, blocks: (B:173:0x032d, B:174:0x033a, B:177:0x0342, B:180:0x0359, B:181:0x0368, B:183:0x036e, B:186:0x0384, B:189:0x038d, B:192:0x0396, B:195:0x039f, B:198:0x03a6, B:200:0x03ae, B:204:0x03be, B:207:0x03c7, B:210:0x03d0, B:213:0x03d9), top: B:232:0x032d }] */
    /* JADX WARN: Code duplicated, block: B:183:0x036e A[Catch: all -> 0x03e6, TryCatch #1 {all -> 0x03e6, blocks: (B:173:0x032d, B:174:0x033a, B:177:0x0342, B:180:0x0359, B:181:0x0368, B:183:0x036e, B:186:0x0384, B:189:0x038d, B:192:0x0396, B:195:0x039f, B:198:0x03a6, B:200:0x03ae, B:204:0x03be, B:207:0x03c7, B:210:0x03d0, B:213:0x03d9), top: B:232:0x032d }] */
    /* JADX WARN: Code duplicated, block: B:200:0x03ae A[Catch: all -> 0x03e6, TryCatch #1 {all -> 0x03e6, blocks: (B:173:0x032d, B:174:0x033a, B:177:0x0342, B:180:0x0359, B:181:0x0368, B:183:0x036e, B:186:0x0384, B:189:0x038d, B:192:0x0396, B:195:0x039f, B:198:0x03a6, B:200:0x03ae, B:204:0x03be, B:207:0x03c7, B:210:0x03d0, B:213:0x03d9), top: B:232:0x032d }] */
    /* JADX WARN: Code duplicated, block: B:203:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:225:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:244:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[LOOP:2: B:174:0x033a->B:246:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x03ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o oooO00o) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        boolean z2;
        boolean zC;
        boolean z3;
        PackageManager packageManager;
        boolean z4;
        Iterator<ResolveInfo> it;
        Iterator<ApplicationInfo> it2;
        String packageName;
        String str7;
        String str8;
        String str9;
        boolean z5;
        boolean z6;
        o0O00.OooO00o model = oooO00o;
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            zC = YS.C();
        } catch (Throwable th) {
            th.printStackTrace();
            Context context = this.f35039OooO00o;
            String PRODUCT = Build.PRODUCT;
            int i = (Intrinsics.areEqual(PRODUCT, "sdk_x86_64") || Intrinsics.areEqual(PRODUCT, "sdk_google_phone_x86") || Intrinsics.areEqual(PRODUCT, "sdk_google_phone_x86_64") || Intrinsics.areEqual(PRODUCT, "sdk_google_phone_arm64") || Intrinsics.areEqual(PRODUCT, "vbox86p")) ? 1 : 0;
            String MANUFACTURER = Build.MANUFACTURER;
            if (Intrinsics.areEqual(MANUFACTURER, "unknown")) {
                i++;
            }
            String str10 = Build.BRAND;
            if (Intrinsics.areEqual(str10, "generic") || StringsKt.OooO(str10, "android") || Intrinsics.areEqual(str10, "generic_arm64") || Intrinsics.areEqual(str10, "generic_x86") || Intrinsics.areEqual(str10, "generic_x86_64")) {
                i++;
            }
            String str11 = Build.DEVICE;
            if (Intrinsics.areEqual(str11, "generic") || Intrinsics.areEqual(str11, "generic_arm64") || Intrinsics.areEqual(str11, "generic_x86") || Intrinsics.areEqual(str11, "generic_x86_64") || Intrinsics.areEqual(str11, "vbox86p")) {
                i++;
            }
            String MODEL = Build.MODEL;
            if (Intrinsics.areEqual(MODEL, ServerProtocol.DIALOG_PARAM_SDK_VERSION) || Intrinsics.areEqual(MODEL, "Android SDK built for arm64") || Intrinsics.areEqual(MODEL, "Android SDK built for armv7") || Intrinsics.areEqual(MODEL, "Android SDK built for x86") || Intrinsics.areEqual(MODEL, "Android SDK built for x86_64")) {
                i++;
            }
            String HARDWARE = Build.HARDWARE;
            if (Intrinsics.areEqual(HARDWARE, "ranchu")) {
                i++;
            }
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt__StringsKt.contains$default(FINGERPRINT, "sdk_google_phone_arm64", false, 2, (Object) null)) {
                i++;
            } else {
                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                if (StringsKt__StringsKt.contains$default(FINGERPRINT, "sdk_google_phone_armv7", false, 2, (Object) null)) {
                    i++;
                }
            }
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            int i2 = i;
            if (StringsKt.OooOoOO(FINGERPRINT, "generic")) {
                str = "DEVICE";
                str2 = "PRODUCT";
                str3 = "BRAND";
                str4 = str10;
                str5 = "generic";
                str6 = str11;
                z = true;
            } else {
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (StringsKt__StringsKt.contains$default(MODEL, "google_sdk", false, 2, (Object) null)) {
                    str = "DEVICE";
                    str2 = "PRODUCT";
                    str3 = "BRAND";
                    str4 = str10;
                    str5 = "generic";
                    str6 = str11;
                } else {
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = MODEL.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt__StringsKt.contains$default(lowerCase, "droid4x", false, 2, (Object) null)) {
                        str2 = "PRODUCT";
                        str5 = "generic";
                        str3 = "BRAND";
                        str4 = str10;
                        str = "DEVICE";
                        str6 = str11;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (StringsKt__StringsKt.contains$default(MODEL, "Emulator", false, 2, (Object) null)) {
                            str2 = "PRODUCT";
                            str5 = "generic";
                            str3 = "BRAND";
                            str4 = str10;
                            str = "DEVICE";
                            str6 = str11;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            if (StringsKt__StringsKt.contains$default(MODEL, "Android SDK built for x86", false, 2, (Object) null)) {
                                str2 = "PRODUCT";
                                str5 = "generic";
                                str3 = "BRAND";
                                str4 = str10;
                                str = "DEVICE";
                                str6 = str11;
                            } else {
                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                if (StringsKt__StringsKt.contains$default(MANUFACTURER, "Genymotion", false, 2, (Object) null) || Intrinsics.areEqual(HARDWARE, "goldfish") || Intrinsics.areEqual(HARDWARE, "vbox86") || Intrinsics.areEqual(PRODUCT, ServerProtocol.DIALOG_PARAM_SDK_VERSION)) {
                                    str2 = "PRODUCT";
                                    str5 = "generic";
                                    str3 = "BRAND";
                                    str4 = str10;
                                    str = "DEVICE";
                                    str6 = str11;
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                    if (StringsKt.OooOoOO(PRODUCT, "google_sdk") || Intrinsics.areEqual(PRODUCT, "sdk_x86") || Intrinsics.areEqual(PRODUCT, "vbox86p")) {
                                        str2 = "PRODUCT";
                                        str5 = "generic";
                                        str3 = "BRAND";
                                        str4 = str10;
                                        str = "DEVICE";
                                        str6 = str11;
                                    } else {
                                        String BOARD = Build.BOARD;
                                        Intrinsics.checkNotNullExpressionValue(BOARD, "BOARD");
                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                        String lowerCase2 = BOARD.toLowerCase(ROOT);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                                        if (StringsKt__StringsKt.contains$default(lowerCase2, "nox", false, 2, (Object) null)) {
                                            str2 = "PRODUCT";
                                            str5 = "generic";
                                            str3 = "BRAND";
                                            str4 = str10;
                                            str = "DEVICE";
                                            str6 = str11;
                                        } else {
                                            String BOOTLOADER = Build.BOOTLOADER;
                                            Intrinsics.checkNotNullExpressionValue(BOOTLOADER, "BOOTLOADER");
                                            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                            String lowerCase3 = BOOTLOADER.toLowerCase(ROOT);
                                            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
                                            if (StringsKt__StringsKt.contains$default(lowerCase3, "nox", false, 2, (Object) null)) {
                                                str2 = "PRODUCT";
                                                str5 = "generic";
                                                str3 = "BRAND";
                                                str4 = str10;
                                                str = "DEVICE";
                                                str6 = str11;
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                String lowerCase4 = HARDWARE.toLowerCase(ROOT);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.String).toLowerCase(locale)");
                                                if (StringsKt__StringsKt.contains$default(lowerCase4, "nox", false, 2, (Object) null)) {
                                                    str2 = "PRODUCT";
                                                    str5 = "generic";
                                                    str3 = "BRAND";
                                                    str4 = str10;
                                                    str = "DEVICE";
                                                    str6 = str11;
                                                } else {
                                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                    String lowerCase5 = PRODUCT.toLowerCase(ROOT);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.String).toLowerCase(locale)");
                                                    if (StringsKt__StringsKt.contains$default(lowerCase5, "nox", false, 2, (Object) null)) {
                                                        str2 = "PRODUCT";
                                                    } else {
                                                        String SERIAL = Build.SERIAL;
                                                        str2 = "PRODUCT";
                                                        Intrinsics.checkNotNullExpressionValue(SERIAL, "SERIAL");
                                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                        String lowerCase6 = SERIAL.toLowerCase(ROOT);
                                                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.String).toLowerCase(locale)");
                                                        if (!StringsKt__StringsKt.contains$default(lowerCase6, "nox", false, 2, (Object) null)) {
                                                            String HOST = Build.HOST;
                                                            Intrinsics.checkNotNullExpressionValue(HOST, "HOST");
                                                            if (!StringsKt__StringsKt.contains$default(HOST, "Droid4x-B uildStation", false, 2, (Object) null)) {
                                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                if (!StringsKt.OooOoOO(MANUFACTURER, "iToolsAVM")) {
                                                                    str = "DEVICE";
                                                                    str6 = str11;
                                                                    Intrinsics.checkNotNullExpressionValue(str6, str);
                                                                    if (StringsKt.OooOoOO(str6, "iToolsAVM")) {
                                                                        str5 = "generic";
                                                                        str3 = "BRAND";
                                                                        str4 = str10;
                                                                    } else {
                                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                        if (StringsKt.OooOoOO(MODEL, "iToolsAVM")) {
                                                                            str5 = "generic";
                                                                            str3 = "BRAND";
                                                                            str4 = str10;
                                                                        } else {
                                                                            str3 = "BRAND";
                                                                            str4 = str10;
                                                                            Intrinsics.checkNotNullExpressionValue(str4, str3);
                                                                            str5 = "generic";
                                                                            if (!StringsKt.OooOoOO(str4, str5)) {
                                                                                Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                                                                if (!StringsKt.OooOoOO(HARDWARE, "vbox86")) {
                                                                                    z = false;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    str5 = "generic";
                                                    str3 = "BRAND";
                                                    str4 = str10;
                                                    str = "DEVICE";
                                                    str6 = str11;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
            }
            if (z) {
                z2 = true;
            } else {
                Intrinsics.checkNotNullExpressionValue(str4, str3);
                if (StringsKt.OooOoOO(str4, str5)) {
                    Intrinsics.checkNotNullExpressionValue(str6, str);
                    if (StringsKt.OooOoOO(str6, str5)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                boolean z7 = z6 | z;
                if (z7 || (Intrinsics.areEqual("google_sdk", PRODUCT) || z7) || i2 >= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                if (!OooO0O0(this.f35041OooO0OO) && !OooO0O0(this.f35043OooO0o) && !OooO0O0(this.f35045OooO0oO) && !OooO0O0(this.f35042OooO0Oo) && !OooO0O0(this.f35044OooO0o0)) {
                    File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                    int i3 = 0;
                    loop0: while (true) {
                        if (i3 >= 2) {
                            z5 = false;
                            break;
                        }
                        File file = fileArr[i3];
                        if (file.exists() && file.canRead()) {
                            byte[] bArr = new byte[1024];
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                fileInputStream.read(bArr);
                                fileInputStream.close();
                                String str12 = new String(bArr, Charsets.UTF_8);
                                for (String str13 : this.f35040OooO0O0) {
                                    if (StringsKt__StringsKt.contains$default(str12, str13, false, 2, (Object) null)) {
                                        z5 = true;
                                        break loop0;
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        i3++;
                    }
                    if (!z5) {
                        z3 = false;
                    }
                    if (!z3) {
                        packageManager = context.getPackageManager();
                        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                        try {
                            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                            intent.addCategory("android.intent.category.LAUNCHER");
                            try {
                                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
                                it = listQueryIntentActivities.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        str9 = it.next().activityInfo.packageName;
                                        Intrinsics.checkNotNullExpressionValue(str9, "resolveInfo.activityInfo.packageName");
                                        if (StringsKt.OooOoOO(str9, "com.bluestacks.")) {
                                        }
                                    } else {
                                        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                                        Intrinsics.checkNotNullExpressionValue(installedApplications, "packageManager\n         …ageManager.GET_META_DATA)");
                                        it2 = installedApplications.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                packageName = it2.next().packageName;
                                                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                                                if (!StringsKt.OooOoOO(packageName, "com.vphone.") && !StringsKt.OooOoOO(packageName, "com.bignox.") && !StringsKt.OooOoOO(packageName, "com.nox.mopen.app") && !StringsKt.OooOoOO(packageName, "me.haima.") && !StringsKt.OooOoOO(packageName, "com.bluestacks.")) {
                                                    if (StringsKt.OooOoOO(packageName, "cn.itools.")) {
                                                        str8 = Build.PRODUCT;
                                                        str7 = str2;
                                                        Intrinsics.checkNotNullExpressionValue(str8, str7);
                                                        if (StringsKt.OooOoOO(str8, "iToolsAVM")) {
                                                        }
                                                    } else {
                                                        str7 = str2;
                                                    }
                                                    if (!StringsKt.OooOoOO(packageName, "com.kop.") && !StringsKt.OooOoOO(packageName, "com.kaopu.") && !StringsKt.OooOoOO(packageName, "com.microvirt.") && !Intrinsics.areEqual(packageName, "com.google.android.launcher.layouts.genymotion")) {
                                                        str2 = str7;
                                                    }
                                                }
                                            } else {
                                                z4 = false;
                                                if (z4) {
                                                    model = oooO00o;
                                                    zC = false;
                                                }
                                            }
                                        }
                                    }
                                    z4 = true;
                                    if (z4) {
                                        model = oooO00o;
                                        zC = false;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th.printStackTrace();
                                z4 = false;
                                if (z4) {
                                    model = oooO00o;
                                    zC = true;
                                } else {
                                    model = oooO00o;
                                    zC = false;
                                }
                                model.f35019OooO0O0 = zC;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                z3 = true;
                if (!z3) {
                    packageManager = context.getPackageManager();
                    Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                    Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent2, 0);
                    Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "packageManager.queryIntentActivities(intent, 0)");
                    it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str9 = it.next().activityInfo.packageName;
                            Intrinsics.checkNotNullExpressionValue(str9, "resolveInfo.activityInfo.packageName");
                            if (StringsKt.OooOoOO(str9, "com.bluestacks.")) {
                            }
                        } else {
                            List<ApplicationInfo> installedApplications2 = packageManager.getInstalledApplications(128);
                            Intrinsics.checkNotNullExpressionValue(installedApplications2, "packageManager\n         …ageManager.GET_META_DATA)");
                            it2 = installedApplications2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    packageName = it2.next().packageName;
                                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                                    if (!StringsKt.OooOoOO(packageName, "com.vphone.")) {
                                        if (StringsKt.OooOoOO(packageName, "cn.itools.")) {
                                            str8 = Build.PRODUCT;
                                            str7 = str2;
                                            Intrinsics.checkNotNullExpressionValue(str8, str7);
                                            if (StringsKt.OooOoOO(str8, "iToolsAVM")) {
                                            }
                                        } else {
                                            str7 = str2;
                                        }
                                        if (!StringsKt.OooOoOO(packageName, "com.kop.")) {
                                            str2 = str7;
                                        }
                                    }
                                } else {
                                    z4 = false;
                                    if (z4) {
                                        model = oooO00o;
                                        zC = false;
                                    }
                                }
                            }
                        }
                        z4 = true;
                        if (z4) {
                            model = oooO00o;
                            zC = false;
                        }
                    }
                }
            }
            model = oooO00o;
            zC = true;
        }
        model.f35019OooO0O0 = zC;
    }

    public final boolean OooO0O0(String[] strArr) {
        for (String str : strArr) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }
}
