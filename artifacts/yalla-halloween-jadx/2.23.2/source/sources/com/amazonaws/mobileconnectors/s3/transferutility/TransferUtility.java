package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes2.dex */
public class TransferUtility {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f12298OooO00o = LogFactory.OooO00o(TransferUtility.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f12299OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f12300OooO0OO = "";

    public static void OooO00o(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions requestClientOptions = amazonWebServiceRequest.f12054OooO0o0;
        StringBuilder sb = new StringBuilder("TransferService_multipart/");
        sb.append(OooO0OO());
        String str = VersionInfoUtils.f12686OooO00o;
        sb.append("2.18.0");
        requestClientOptions.OooO00o(sb.toString());
    }

    public static void OooO0O0(AmazonWebServiceRequest amazonWebServiceRequest) {
        StringBuilder sb = new StringBuilder("TransferService/");
        sb.append(OooO0OO());
        String str = VersionInfoUtils.f12686OooO00o;
        sb.append("2.18.0");
        amazonWebServiceRequest.f12054OooO0o0.OooO00o(sb.toString());
    }

    public static String OooO0OO() {
        synchronized (f12299OooO0O0) {
            String str = f12300OooO0OO;
            if (str != null && !str.trim().isEmpty()) {
                return str.trim() + "/";
            }
            return "";
        }
    }
}
