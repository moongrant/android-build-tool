package com.amazonaws;

import OooO0OO.OooO0O0;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultRequest<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public InputStream f8975OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f8976OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f8980OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public URI f8981OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AmazonWebServiceRequest f8982OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8984OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AWSRequestMetrics f8985OooOO0O;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f8977OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f8978OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f8979OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public HttpMethodName f8983OooO0oo = HttpMethodName.POST;

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest, String str) {
        this.f8980OooO0o = str;
        this.f8982OooO0oO = amazonWebServiceRequest;
    }

    public final void OooO00o(String str, String str2) {
        this.f8979OooO0Oo.put(str, str2);
    }

    public final void OooO0O0(String str, String str2) {
        this.f8978OooO0OO.put(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8983OooO0oo);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(this.f8981OooO0o0);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        String str = this.f8976OooO00o;
        if (str == null) {
            sb.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str);
        }
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        LinkedHashMap linkedHashMap = this.f8978OooO0OO;
        if (!linkedHashMap.isEmpty()) {
            sb.append("Parameters: (");
            for (String str2 : linkedHashMap.keySet()) {
                OooO0O0.OooO00o(sb, str2, ": ", (String) linkedHashMap.get(str2), ", ");
            }
            sb.append(") ");
        }
        HashMap map = this.f8979OooO0Oo;
        if (!map.isEmpty()) {
            sb.append("Headers: (");
            for (String str3 : map.keySet()) {
                OooO0O0.OooO00o(sb, str3, ": ", (String) map.get(str3), ", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }
}
