package com.qiniu.android.storage;

import android.content.Context;
import com.qiniu.android.http.dns.Dns;
import com.qiniu.android.utils.Utils;

/* JADX INFO: loaded from: classes4.dex */
public class GlobalConfiguration {
    public static Context appContext;
    private static GlobalConfiguration configuration = new GlobalConfiguration();
    public boolean isDnsOpen = true;
    public int dnsRepreHostNum = 2;
    public int dnsCacheTime = 120;
    public Dns dns = null;
    public String dnsCacheDir = Utils.sdkDirectory() + "/dnsCache/";
    public int globalHostFrozenTime = 10;
    public int partialHostFrozenTime = 300;
    public String[] connectCheckURLStrings = {"https://www.qiniu.com", "https://www.baidu.com", "https://www.google.com"};
    public int connectCheckTimeout = 3;

    private GlobalConfiguration() {
    }

    public static GlobalConfiguration getInstance() {
        return configuration;
    }
}
