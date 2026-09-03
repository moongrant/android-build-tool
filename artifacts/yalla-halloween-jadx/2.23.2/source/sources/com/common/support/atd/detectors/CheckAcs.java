package com.common.support.atd.detectors;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CheckAcs {
    public static volatile CheckAcs checkAcs;
    public final Context mContext;
    public final String[] sysApps = {"com.google.android", "com.android.settings", "com.android.packageinstaller", "com.android.iconnect", "com.baidu", "com.bjbyhd.screenreader_huawei", "com.huawei", "com.didi.es.psngr", "com.eg.android.AlipayGphone", "com.miui", "com.xiaomi.gamecenter.sdk.service", "com.netease.nie.yosemite", "com.tencent", "com.meizu", "com.sohu.inputmethod.sogou", "com.vivo", "com.oppo", "com.coloros", "com.gionee", "com.gome", "com.sec.android.app.camera", "com.samsung.android", "com.UCMobile", "com.amigo", "com.fooview", "com.singulariti.niapp", "com.honeycomb.launcher", "com.myos.appsstore", "com.hunting.matrix", "com.kugou.android.ringtone", "com.oneapp.max", "com.hmct", "com.android.timeservice", "com.colorphone.smooth.dialer", "com.yufly.mobilemanager", "com.xmiles.callshow", "com.qualcomm.qti.perfdump", "com.aliyun", "cn.nubia", "zte.com.market", "com.snda.lantern.wifilocating", "com.phone.booster", "com.normandy.booster", "com.omarea", "com.noxgroup.app.cleaner", "com.oh.super.cleaner", "com.nirenr.talkman.geek", "com.mycheering", "com.microsoft", "com.cootek", "com.cleanmaster", "cn.kuwo", "com.lenovo", "com.mydream.wifi"};

    public CheckAcs(Context context) {
        this.mContext = context;
    }

    public static CheckAcs getInstance(Context context) {
        if (checkAcs == null) {
            synchronized (CheckAcs.class) {
                if (checkAcs == null) {
                    checkAcs = new CheckAcs(context);
                }
            }
        }
        return checkAcs;
    }

    public final String getAccessibilityPackage() {
        AccessibilityManager accessibilityManager;
        boolean z;
        StringBuilder sb = new StringBuilder();
        try {
            accessibilityManager = (AccessibilityManager) this.mContext.getSystemService("accessibility");
        } catch (Throwable th) {
            th.printStackTrace();
            accessibilityManager = null;
        }
        if (accessibilityManager == null) {
            return sb.toString();
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        if (enabledAccessibilityServiceList == null || enabledAccessibilityServiceList.size() == 0) {
            return sb.toString();
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
                if (id.startsWith(strArr[i])) {
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
                        if (this.mContext.getPackageName().equals(str)) {
                            sb.append(accessibilityServiceInfo.getId());
                            sb.append(",");
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public int getUid() {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128).uid;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
