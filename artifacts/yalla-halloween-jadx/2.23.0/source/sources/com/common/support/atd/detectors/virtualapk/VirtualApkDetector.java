package com.common.support.atd.detectors.virtualapk;

import OooO0O0.OooO0O0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.atd.YS;
import com.common.support.atd.utils.UtilsKt;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/common/support/atd/detectors/virtualapk/VirtualApkDetector;", "Lcom/common/support/atd/AbstractDetector;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkByHasSameUid", "", "checkByOriginApkPackageName", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "getUidStrFormat", "", "isNumber", "str", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VirtualApkDetector extends AbstractDetector {

    @NotNull
    private final Context context;

    public VirtualApkDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean checkByHasSameUid() throws Throwable {
        String uidStrFormat = getUidStrFormat();
        if (uidStrFormat == null) {
            uidStrFormat = "";
        }
        if (TextUtils.isEmpty(uidStrFormat)) {
            return false;
        }
        String strExec = UtilsKt.exec("ps");
        if (strExec == null || strExec.length() == 0) {
            return false;
        }
        Object[] array = new Regex("\n").split(strExec, 0).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        if (strArr.length == 0) {
            return false;
        }
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (StringsKt.OooO0o(strArr[i2], uidStrFormat)) {
                int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(strArr[i2], ZegoConstants.ZegoVideoDataAuxPublishingStream, 0, false, 6, (Object) null);
                String str = strArr[i2];
                String strSubstring = str.substring(iLastIndexOf$default <= 0 ? 0 : iLastIndexOf$default + 1, str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                if (new File(OooO0O0.OooO00o(new Object[]{strSubstring, Locale.CHINA}, 2, "/data/data/%s", "java.lang.String.format(format, *args)")).exists()) {
                    i++;
                }
            }
        }
        return i > 1;
    }

    private final boolean checkByOriginApkPackageName(Context context) {
        try {
            String packageName = context.getPackageName();
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "pm.getInstalledPackages(0)");
            Iterator<PackageInfo> it = installedPackages.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().packageName)) {
                    i++;
                }
            }
            return i > 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private final String getUidStrFormat() throws Throwable {
        String strExec = UtilsKt.exec("cat /proc/self/cgroup");
        if (strExec == null || strExec.length() == 0) {
            return null;
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(strExec, "uid", 0, false, 6, (Object) null);
        int iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default(strExec, "/pid", 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0) {
            return null;
        }
        if (iLastIndexOf$default2 <= 0) {
            iLastIndexOf$default2 = strExec.length();
        }
        int i = iLastIndexOf$default + 4;
        if (strExec == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = strExec.substring(i, iLastIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            String strReplace = new Regex("\n").replace(strSubstring, "");
            if (isNumber(strReplace)) {
                Integer numValueOf = Integer.valueOf(strReplace);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("u0_a%d", Arrays.copyOf(new Object[]{Integer.valueOf(numValueOf.intValue() - 10000)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                return str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private final boolean isNumber(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        sailfishSecModel.setAppVirtualPkg(MapsCheck.INSTANCE.check(PackageDataManager.INSTANCE.getPackageList()));
        if (sailfishSecModel.getAppVirtualPkg().length() == 0) {
            sailfishSecModel.setAppVirtual(checkByHasSameUid() || checkByOriginApkPackageName(this.context) || YS.F());
        } else {
            sailfishSecModel.setAppVirtual(true);
        }
        resultForApi.setA11(sailfishSecModel.getAppVirtualPkg());
        resultForApi.setA2(UtilsKt.toInt(sailfishSecModel.getAppVirtual()));
    }
}
