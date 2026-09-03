package com.amazonaws.services.s3.model;

import com.google.firebase.perf.FirebasePerformance;
import java.util.List;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public class CORSRule {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<AllowedMethods> f9379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<String> f9380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<String> f9381OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<String> f9382OooO0Oo;

    public enum AllowedMethods {
        GET("GET"),
        PUT("PUT"),
        HEAD("HEAD"),
        POST("POST"),
        DELETE(FirebasePerformance.HttpMethod.DELETE);

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
            throw new IllegalArgumentException(o000oOoO.OooO00o("Cannot create enum from ", str, " value!"));
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.AllowedMethod;
        }
    }
}
