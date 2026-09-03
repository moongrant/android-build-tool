package com.common.support.atd.detectors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.atd.YS;
import com.common.support.atd.utils.UtilsKt;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0003J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/common/support/atd/detectors/XposedDetector;", "Lcom/common/support/atd/AbstractDetector;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "keySubstrate", "", "keyXposed", "pkgNameSubstrate", "pkgNameXposed", "xposedHelpers", "checkByPackageName", "", "pkgName", "checkBySo", "checkXposedByThrow", "key", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class XposedDetector extends AbstractDetector {

    @NotNull
    private final Context context;

    @NotNull
    private final String keySubstrate;

    @NotNull
    private final String keyXposed;

    @NotNull
    private final String pkgNameSubstrate;

    @NotNull
    private final String pkgNameXposed;

    @NotNull
    private final String xposedHelpers;

    public XposedDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.xposedHelpers = "de.robv.android.xposed.XposedHelpers";
        this.keyXposed = "de.robv.android.xposed.XposedBridge";
        this.pkgNameXposed = "de.robv.android.xposed.installer";
        this.keySubstrate = "com.saurik.substrate.MS";
        this.pkgNameSubstrate = "com.saurik.substrate";
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean checkByPackageName(Context context, String pkgName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            List<ApplicationInfo> installedApplications = Build.VERSION.SDK_INT >= 33 ? packageManager.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getInstalledApplications(128);
            if (installedApplications == null) {
                return false;
            }
            Iterator<T> it = installedApplications.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((ApplicationInfo) it.next()).packageName, pkgName)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    private final boolean checkBySo() throws Throwable {
        BufferedReader bufferedReader;
        ?? r5;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
                try {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    while (true) {
                        ?? line = bufferedReader.readLine();
                        if (line != 0) {
                            objectRef.element = line;
                            r5 = line;
                        } else {
                            r5 = 0;
                        }
                        if (r5 == 0) {
                            for (String str : linkedHashSet) {
                                if (StringsKt__StringsKt.contains$default(str, "com.saurik.substrate", false, 2, (Object) null)) {
                                    bufferedReader.close();
                                    return true;
                                }
                                if (StringsKt__StringsKt.contains$default(str, "XposedBridge.jar", false, 2, (Object) null)) {
                                    bufferedReader.close();
                                    return true;
                                }
                            }
                            bufferedReader.close();
                            bufferedReader.close();
                            return false;
                        }
                        if (StringsKt__StringsJVMKt.endsWith$default((String) objectRef.element, ".so", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default((String) objectRef.element, ".jar", false, 2, null)) {
                            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) objectRef.element, ZegoConstants.ZegoVideoDataAuxPublishingStream, 0, false, 6, (Object) null);
                            String str2 = (String) objectRef.element;
                            int i = iLastIndexOf$default + 1;
                            if (str2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String strSubstring = str2.substring(i);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                            linkedHashSet.add(strSubstring);
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    bufferedReader2 = bufferedReader;
                    e.printStackTrace();
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final boolean checkXposedByThrow(String key) {
        try {
            throw new Exception("gg");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "stackTraceElement.className");
                if (StringsKt__StringsKt.contains$default(className, key, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        boolean zA;
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        try {
            zA = YS.A();
        } catch (Throwable th) {
            th.printStackTrace();
            zA = checkXposedByThrow(this.keyXposed) || checkByPackageName(this.context, this.pkgNameXposed);
        }
        sailfishSecModel.setXposed(zA);
        sailfishSecModel.setSubstrate(checkXposedByThrow(this.keySubstrate) || checkByPackageName(this.context, this.pkgNameSubstrate) || checkBySo());
        resultForApi.setA9(UtilsKt.toInt(sailfishSecModel.getXposed()));
    }
}
