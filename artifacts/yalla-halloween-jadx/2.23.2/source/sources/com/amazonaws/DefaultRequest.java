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
    public InputStream f12065OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f12066OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f12070OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public URI f12071OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AmazonWebServiceRequest f12072OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f12074OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AWSRequestMetrics f12075OooOO0O;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f12067OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f12068OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f12069OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public HttpMethodName f12073OooO0oo = HttpMethodName.POST;

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest, String str) {
        this.f12070OooO0o = str;
        this.f12072OooO0oO = amazonWebServiceRequest;
    }

    public final void OooO00o(String str, String str2) {
        this.f12069OooO0Oo.put(str, str2);
    }

    public final void OooO0O0(String str, String str2) {
        this.f12068OooO0OO.put(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12073OooO0oo);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(this.f12071OooO0o0);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        String str = this.f12066OooO00o;
        if (str == null) {
            sb.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str);
        }
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        LinkedHashMap linkedHashMap = this.f12068OooO0OO;
        if (!linkedHashMap.isEmpty()) {
            sb.append("Parameters: (");
            for (String str2 : linkedHashMap.keySet()) {
                OooO0O0.OooO00o(sb, str2, ": ", (String) linkedHashMap.get(str2), ", ");
            }
            sb.append(") ");
        }
        HashMap map = this.f12069OooO0Oo;
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
