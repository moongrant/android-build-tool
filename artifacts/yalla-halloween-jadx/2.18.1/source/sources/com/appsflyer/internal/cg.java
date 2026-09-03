package com.appsflyer.internal;

import OooO00o.OooO00o;
import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class cg extends cj {
    public final Map<String, Object> valueOf;

    public cg(Runnable runnable) {
        super("google", runnable);
        this.valueOf = new HashMap();
    }

    private static boolean valueOf(@NonNull Context context) {
        ag.AFInAppEventType();
        if (ag.AFInAppEventType(ag.AFInAppEventParameterName(context), "appsFlyerCount", false) > 0) {
            AFLogger.AFKeystoreWrapper("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            if (aa.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.valueOf("Install referrer is allowed");
                return true;
            }
            AFLogger.valueOf("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.AFKeystoreWrapper("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.cj
    public final void AFInAppEventType(final Context context) {
        if (valueOf(context)) {
            valueOf();
            try {
                final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.valueOf("Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.cg.1
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.valueOf("Install Referrer service disconnected");
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(int i) {
                        cg.this.valueOf.put("code", String.valueOf(i));
                        cg.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(aa.valueOf(context, "com.android.vending")));
                        cg.this.AFInAppEventParameterName.put("api_ver_name", aa.AFInAppEventParameterName(context, "com.android.vending"));
                        if (i == -1) {
                            AFLogger.AppsFlyer2dXConversionCallback("InstallReferrer SERVICE_DISCONNECTED");
                            cg.this.AFInAppEventParameterName.put("response", "SERVICE_DISCONNECTED");
                        } else if (i == 0) {
                            cg.this.AFInAppEventParameterName.put("response", "OK");
                            try {
                                AFLogger.valueOf("InstallReferrer connected");
                                if (installReferrerClientBuild.isReady()) {
                                    ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        cg.this.valueOf.put("val", installReferrer2);
                                        cg.this.AFInAppEventParameterName.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    cg.this.valueOf.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    cg.this.AFInAppEventParameterName.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    cg.this.valueOf.put("install", Long.toString(installBeginTimestampSeconds));
                                    cg.this.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap map = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        cg.this.valueOf.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError unused) {
                                    }
                                    try {
                                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        map.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError unused2) {
                                    }
                                    if (!map.isEmpty()) {
                                        cg.this.AFInAppEventParameterName.put("google_custom", map);
                                    }
                                } else {
                                    AFLogger.AppsFlyer2dXConversionCallback("ReferrerClient: InstallReferrer is not ready");
                                    cg.this.valueOf.put("err", "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th) {
                                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to get install referrer: ");
                                sbOooO0o0.append(th.getMessage());
                                AFLogger.AppsFlyer2dXConversionCallback(sbOooO0o0.toString());
                                cg.this.valueOf.put("err", th.getMessage());
                            }
                        } else if (i == 1) {
                            cg.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.AppsFlyer2dXConversionCallback("InstallReferrer not supported");
                        } else if (i == 2) {
                            AFLogger.AppsFlyer2dXConversionCallback("InstallReferrer FEATURE_NOT_SUPPORTED");
                            cg.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        } else if (i != 3) {
                            AFLogger.AppsFlyer2dXConversionCallback("responseCode not found.");
                        } else {
                            AFLogger.AppsFlyer2dXConversionCallback("InstallReferrer DEVELOPER_ERROR");
                            cg.this.AFInAppEventParameterName.put("response", "DEVELOPER_ERROR");
                        }
                        AFLogger.valueOf("Install Referrer collected locally");
                        cg.this.AFKeystoreWrapper();
                        installReferrerClientBuild.endConnection();
                    }
                });
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper("referrerClient -> startConnection", th);
            }
        }
    }
}
