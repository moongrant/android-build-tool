package com.common.support.atd.detectors;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.sailfish_commons.logmodels.SecModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/common/support/atd/detectors/AccessibilityDetector;", "Lcom/common/support/atd/AbstractDetector;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sysApps", "", "", "getSysApps", "()[Ljava/lang/String;", "[Ljava/lang/String;", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "getAccessibilityPackage", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AccessibilityDetector extends AbstractDetector {

    @NotNull
    private final Context context;

    @NotNull
    private final String[] sysApps;

    public AccessibilityDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.sysApps = new String[]{"com.google.android", "com.android.settings", "com.android.packageinstaller", "com.android.iconnect", "com.baidu", "com.bjbyhd.screenreader_huawei", "com.huawei", "com.didi.es.psngr", "com.eg.android.AlipayGphone", "com.miui", "com.xiaomi.gamecenter.sdk.service", "com.netease.nie.yosemite", "com.tencent", "com.meizu", "com.sohu.inputmethod.sogou", "com.vivo", "com.oppo", "com.coloros", "com.gionee", "com.gome", "com.sec.android.app.camera", "com.samsung.android", "com.UCMobile", "com.amigo", "com.fooview", "com.singulariti.niapp", "com.honeycomb.launcher", "com.myos.appsstore", "com.hunting.matrix", "com.kugou.android.ringtone", "com.oneapp.max", "com.hmct", "com.android.timeservice", "com.colorphone.smooth.dialer", "com.yufly.mobilemanager", "com.xmiles.callshow", "com.qualcomm.qti.perfdump", "com.aliyun", "cn.nubia", "zte.com.market", "com.snda.lantern.wifilocating", "com.phone.booster", "com.normandy.booster", "com.omarea", "com.noxgroup.app.cleaner", "com.oh.super.cleaner", "com.nirenr.talkman.geek", "com.mycheering", "com.microsoft", "com.cootek", "com.cleanmaster", "cn.kuwo", "com.lenovo", "com.mydream.wifi"};
    }

    private final String getAccessibilityPackage(Context context) {
        AccessibilityManager accessibilityManager;
        boolean z;
        StringBuilder sb = new StringBuilder();
        try {
            Object systemService = context.getSystemService("accessibility");
            accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (accessibilityManager == null) {
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        if (enabledAccessibilityServiceList == null || enabledAccessibilityServiceList.size() == 0) {
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "sb.toString()");
            return string2;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            String id = accessibilityServiceInfo.getId();
            String[] strArr = this.sysApps;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                Intrinsics.checkNotNullExpressionValue(id, "id");
                if (StringsKt.Oooo00o(id, strArr[i])) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                String[] strArr2 = accessibilityServiceInfo.packageNames;
                if (strArr2 == null) {
                    sb.append(accessibilityServiceInfo.getId());
                    sb.append(",");
                } else {
                    for (String str : strArr2) {
                        sb.append(accessibilityServiceInfo.getId());
                        sb.append(",");
                    }
                }
            }
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "sb.toString()");
        return string3;
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        sailfishSecModel.setAccessibilityS(false);
        resultForApi.setA1(0);
        sailfishSecModel.setAcsPackages(getAccessibilityPackage(this.context));
        resultForApi.setA23(sailfishSecModel.getAcsPackages());
    }

    @NotNull
    public final String[] getSysApps() {
        return this.sysApps;
    }
}
