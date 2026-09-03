package com.amazonaws.mobileconnectors.s3.transferutility;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtility {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f10528OooO00o = LogFactory.OooO00o(TransferUtility.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f10529OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static String f10530OooO0OO = "";

    public static <X extends AmazonWebServiceRequest> X OooO00o(X x) {
        RequestClientOptions requestClientOptions = x.f10273Oooo0oO;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TransferService_multipart/");
        sbOooO0o0.append(OooO0OO());
        String str = VersionInfoUtils.f11191OooO00o;
        sbOooO0o0.append("2.18.0");
        requestClientOptions.OooO00o(sbOooO0o0.toString());
        return x;
    }

    public static <X extends AmazonWebServiceRequest> X OooO0O0(X x) {
        RequestClientOptions requestClientOptions = x.f10273Oooo0oO;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TransferService/");
        sbOooO0o0.append(OooO0OO());
        String str = VersionInfoUtils.f11191OooO00o;
        sbOooO0o0.append("2.18.0");
        requestClientOptions.OooO00o(sbOooO0o0.toString());
        return x;
    }

    public static String OooO0OO() {
        synchronized (f10529OooO0O0) {
            String str = f10530OooO0OO;
            if (str != null && !str.trim().isEmpty()) {
                return f10530OooO0OO.trim() + "/";
            }
            return "";
        }
    }
}
