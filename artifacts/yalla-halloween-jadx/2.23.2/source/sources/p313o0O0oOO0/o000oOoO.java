package p313o0O0oOO0;

import android.content.Context;
import android.content.res.Resources;
import com.android.billingclient.api.o0000O0;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends o00O0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0O00 f41857OooO0OO = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NetworkRequestMetric f41858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f41859OooO0O0;

    public o000oOoO(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f41859OooO0O0 = context;
        this.f41858OooO00o = networkRequestMetric;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    @Override // p313o0O0oOO0.o00O0O
    public final boolean OooO00o() {
        URI uriCreate;
        boolean z;
        NetworkRequestMetric networkRequestMetric = this.f41858OooO00o;
        String url = networkRequestMetric.getUrl();
        boolean zIsEmpty = url == null ? true : url.trim().isEmpty();
        o0O0O00 o0o0o00 = f41857OooO0OO;
        if (zIsEmpty) {
            o0o0o00.OooO0o("URL is missing:" + networkRequestMetric.getUrl());
            return false;
        }
        String url2 = networkRequestMetric.getUrl();
        if (url2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(url2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                o0o0o00.OooO0oO("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            o0o0o00.OooO0o("URL cannot be parsed");
            return false;
        }
        Context context = this.f41859OooO0O0;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            o0O0O00.OooO0Oo().OooO00o("Detected domain allowlist, only allowlisted domains will be measured.");
            if (o0000O0.f12817OooO00o == null) {
                o0000O0.f12817OooO00o = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = o0000O0.f12817OooO00o;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (host.contains(strArr[i])) {
                        z = true;
                        break;
                    }
                    i++;
                }
            } else {
                z = true;
                break;
            }
        } else {
            z = true;
            break;
        }
        if (!z) {
            o0o0o00.OooO0o("URL fails allowlist rule: " + uriCreate);
            return false;
        }
        String host2 = uriCreate.getHost();
        if (!((host2 == null || host2.trim().isEmpty() || host2.length() > 255) ? false : true)) {
            o0o0o00.OooO0o("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (!(scheme != null && ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)))) {
            o0o0o00.OooO0o("URL scheme is null or invalid");
            return false;
        }
        if (!(uriCreate.getUserInfo() == null)) {
            o0o0o00.OooO0o("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (!(port == -1 || port > 0)) {
            o0o0o00.OooO0o("URL port is less than or equal to 0");
            return false;
        }
        NetworkRequestMetric.HttpMethod httpMethod = networkRequestMetric.hasHttpMethod() ? networkRequestMetric.getHttpMethod() : null;
        if (!((httpMethod == null || httpMethod == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) ? false : true)) {
            o0o0o00.OooO0o("HTTP Method is null or invalid: " + networkRequestMetric.getHttpMethod());
            return false;
        }
        if (networkRequestMetric.hasHttpResponseCode()) {
            if (!(networkRequestMetric.getHttpResponseCode() > 0)) {
                o0o0o00.OooO0o("HTTP ResponseCode is a negative value:" + networkRequestMetric.getHttpResponseCode());
                return false;
            }
        }
        if (networkRequestMetric.hasRequestPayloadBytes()) {
            if (!(networkRequestMetric.getRequestPayloadBytes() >= 0)) {
                o0o0o00.OooO0o("Request Payload is a negative value:" + networkRequestMetric.getRequestPayloadBytes());
                return false;
            }
        }
        if (networkRequestMetric.hasResponsePayloadBytes()) {
            if (!(networkRequestMetric.getResponsePayloadBytes() >= 0)) {
                o0o0o00.OooO0o("Response Payload is a negative value:" + networkRequestMetric.getResponsePayloadBytes());
                return false;
            }
        }
        if (!networkRequestMetric.hasClientStartTimeUs() || networkRequestMetric.getClientStartTimeUs() <= 0) {
            o0o0o00.OooO0o("Start time of the request is null, or zero, or a negative value:" + networkRequestMetric.getClientStartTimeUs());
            return false;
        }
        if (networkRequestMetric.hasTimeToRequestCompletedUs()) {
            if (!(networkRequestMetric.getTimeToRequestCompletedUs() >= 0)) {
                o0o0o00.OooO0o("Time to complete the request is a negative value:" + networkRequestMetric.getTimeToRequestCompletedUs());
                return false;
            }
        }
        if (networkRequestMetric.hasTimeToResponseInitiatedUs()) {
            if (!(networkRequestMetric.getTimeToResponseInitiatedUs() >= 0)) {
                o0o0o00.OooO0o("Time from the start of the request to the start of the response is null or a negative value:" + networkRequestMetric.getTimeToResponseInitiatedUs());
                return false;
            }
        }
        if (!networkRequestMetric.hasTimeToResponseCompletedUs() || networkRequestMetric.getTimeToResponseCompletedUs() <= 0) {
            o0o0o00.OooO0o("Time from the start of the request to the end of the response is null, negative or zero:" + networkRequestMetric.getTimeToResponseCompletedUs());
            return false;
        }
        if (networkRequestMetric.hasHttpResponseCode()) {
            return true;
        }
        o0o0o00.OooO0o("Did not receive a HTTP Response Code");
        return false;
    }
}
