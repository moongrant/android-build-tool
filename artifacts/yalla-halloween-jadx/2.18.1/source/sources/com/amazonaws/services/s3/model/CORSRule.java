package com.amazonaws.services.s3.model;

import OooO0o.OooO0OO;
import com.qiniu.android.http.request.Request;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CORSRule {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f10741OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<AllowedMethods> f10742OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<String> f10743OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10744OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<String> f10745OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<String> f10746OooO0o0;

    public enum AllowedMethods {
        GET(Request.HttpMethodGet),
        PUT(Request.HttpMethodPUT),
        HEAD(Request.HttpMethodHEAD),
        POST(Request.HttpMethodPOST),
        DELETE("DELETE");

        private final String AllowedMethod;

        AllowedMethods(String str) {
            this.AllowedMethod = str;
        }

        public static AllowedMethods OooO00o(String str) throws IllegalArgumentException {
            for (AllowedMethods allowedMethods : values()) {
                String str2 = allowedMethods.AllowedMethod;
                if (str2 == null && str == null) {
                    return allowedMethods;
                }
                if (str2 != null && str2.equals(str)) {
                    return allowedMethods;
                }
            }
            throw new IllegalArgumentException(OooO0OO.OooO00o("Cannot create enum from ", str, " value!"));
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.AllowedMethod;
        }
    }
}
