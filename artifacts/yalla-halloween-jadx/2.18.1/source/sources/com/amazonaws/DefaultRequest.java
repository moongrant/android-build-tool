package com.amazonaws;

import OooO0O0.OooO0O0;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRequest<T> implements Request<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public InputStream f10285OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f10286OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f10290OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public URI f10291OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AmazonWebServiceRequest f10292OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f10294OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AWSRequestMetrics f10295OooOO0O;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f10287OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f10288OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f10289OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public HttpMethodName f10293OooO0oo = HttpMethodName.POST;

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest, String str) {
        this.f10290OooO0o = str;
        this.f10292OooO0oO = amazonWebServiceRequest;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final void OooO00o(String str, String str2) {
        this.f10289OooO0Oo.put(str, str2);
    }

    public final void OooO0O0(String str, String str2) {
        this.f10288OooO0OO.put(str, str2);
    }

    @Deprecated
    public final void OooO0OO(AWSRequestMetrics aWSRequestMetrics) {
        if (this.f10295OooOO0O != null) {
            throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
        }
        this.f10295OooOO0O = aWSRequestMetrics;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10293OooO0oo);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(this.f10291OooO0o0);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        String str = this.f10286OooO00o;
        if (str == null) {
            sb.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str);
        }
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        if (!this.f10288OooO0OO.isEmpty()) {
            sb.append("Parameters: (");
            for (String str2 : this.f10288OooO0OO.keySet()) {
                OooO0O0.OooO00o(sb, str2, ": ", (String) this.f10288OooO0OO.get(str2), ", ");
            }
            sb.append(") ");
        }
        if (!this.f10289OooO0Oo.isEmpty()) {
            sb.append("Headers: (");
            for (String str3 : this.f10289OooO0Oo.keySet()) {
                OooO0O0.OooO00o(sb, str3, ": ", (String) this.f10289OooO0Oo.get(str3), ", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }
}
