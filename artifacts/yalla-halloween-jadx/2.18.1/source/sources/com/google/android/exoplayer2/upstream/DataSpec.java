package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.qiniu.android.http.request.Request;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class DataSpec {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f14800OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f14801OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f14802OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f14803OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final byte[] f14804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f14805OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<String, String> f14806OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f14807OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f14808OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Object f14809OooOO0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    public DataSpec(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, OooO00o oooO00o) {
        boolean z = true;
        o00000O0.OooO00o(j + j2 >= 0);
        o00000O0.OooO00o(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        o00000O0.OooO00o(z);
        this.f14801OooO00o = uri;
        this.f14802OooO0O0 = j;
        this.f14803OooO0OO = i;
        this.f14804OooO0Oo = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f14806OooO0o0 = Collections.unmodifiableMap(new HashMap(map));
        this.f14805OooO0o = j2;
        this.f14807OooO0oO = j3;
        this.f14808OooO0oo = str;
        this.f14800OooO = i2;
        this.f14809OooOO0 = obj;
    }

    public static String OooO00o(int i) {
        if (i == 1) {
            return Request.HttpMethodGet;
        }
        if (i == 2) {
            return Request.HttpMethodPOST;
        }
        if (i == 3) {
            return Request.HttpMethodHEAD;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        String strOooO00o = OooO00o(this.f14803OooO0OO);
        String strValueOf = String.valueOf(this.f14801OooO00o);
        long j = this.f14805OooO0o;
        long j2 = this.f14807OooO0oO;
        String str = this.f14808OooO0oo;
        int i = this.f14800OooO;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str, strValueOf.length() + strOooO00o.length() + 70));
        sb.append("DataSpec[");
        sb.append(strOooO00o);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
