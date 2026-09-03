package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes2.dex */
public class VersionInfoUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile String f12686OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f12687OooO0O0 = LogFactory.OooO00o(VersionInfoUtils.class);

    public static void OooO00o() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("aws-sdk-");
        sb.append(StringUtils.OooO00o("android"));
        sb.append("/2.18.0 ");
        sb.append(System.getProperty("os.name").replace(' ', '_'));
        sb.append("/");
        sb.append(System.getProperty("os.version").replace(' ', '_'));
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(System.getProperty("java.vm.name").replace(' ', '_'));
        sb.append("/");
        sb.append(System.getProperty("java.vm.version").replace(' ', '_'));
        sb.append("/");
        sb.append(System.getProperty("java.version").replace(' ', '_'));
        String property = System.getProperty("user.language");
        String property2 = System.getProperty("user.region");
        if (property != null && property2 != null) {
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(property.replace(' ', '_'));
            sb.append("_");
            sb.append(property2.replace(' ', '_'));
        }
        f12686OooO00o = sb.toString();
    }
}
