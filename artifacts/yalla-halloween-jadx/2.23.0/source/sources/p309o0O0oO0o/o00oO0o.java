package p309o0O0oO0o;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.util.OooOOOO;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;
import p307o0O0oO0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o extends o0OOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooOOO0 f42495OooO0OO = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NetworkRequestMetric f42496OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f42497OooO0O0;

    public o00oO0o(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f42497OooO0O0 = context;
        this.f42496OooO00o = networkRequestMetric;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    @Override // p309o0O0oO0o.o0OOO0o
    public final boolean OooO00o() {
        URI uriCreate;
        boolean z;
        NetworkRequestMetric networkRequestMetric = this.f42496OooO00o;
        String url = networkRequestMetric.getUrl();
        boolean zIsEmpty = url == null ? true : url.trim().isEmpty();
        OooOOO0 oooOOO0 = f42495OooO0OO;
        if (zIsEmpty) {
            oooOOO0.OooO0o("URL is missing:" + networkRequestMetric.getUrl());
            return false;
        }
        String url2 = networkRequestMetric.getUrl();
        if (url2 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(url2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                oooOOO0.OooO0oO("getResultUrl throws exception %s", e.getMessage());
                uriCreate = null;
            }
        }
        if (uriCreate == null) {
            oooOOO0.OooO0o("URL cannot be parsed");
            return false;
        }
        Context context = this.f42497OooO0O0;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            OooOOO0.OooO0Oo().OooO00o("Detected domain allowlist, only allowlisted domains will be measured.");
            if (OooOOOO.f20475OooO00o == null) {
                OooOOOO.f20475OooO00o = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                String[] strArr = OooOOOO.f20475OooO00o;
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
            oooOOO0.OooO0o("URL fails allowlist rule: " + uriCreate);
            return false;
        }
        String host2 = uriCreate.getHost();
        if (!((host2 == null || host2.trim().isEmpty() || host2.length() > 255) ? false : true)) {
            oooOOO0.OooO0o("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (!(scheme != null && ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)))) {
            oooOOO0.OooO0o("URL scheme is null or invalid");
            return false;
        }
        if (!(uriCreate.getUserInfo() == null)) {
            oooOOO0.OooO0o("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (!(port == -1 || port > 0)) {
            oooOOO0.OooO0o("URL port is less than or equal to 0");
            return false;
        }
        NetworkRequestMetric.HttpMethod httpMethod = networkRequestMetric.hasHttpMethod() ? networkRequestMetric.getHttpMethod() : null;
        if (!((httpMethod == null || httpMethod == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) ? false : true)) {
            oooOOO0.OooO0o("HTTP Method is null or invalid: " + networkRequestMetric.getHttpMethod());
            return false;
        }
        if (networkRequestMetric.hasHttpResponseCode()) {
            if (!(networkRequestMetric.getHttpResponseCode() > 0)) {
                oooOOO0.OooO0o("HTTP ResponseCode is a negative value:" + networkRequestMetric.getHttpResponseCode());
                return false;
            }
        }
        if (networkRequestMetric.hasRequestPayloadBytes()) {
            if (!(networkRequestMetric.getRequestPayloadBytes() >= 0)) {
                oooOOO0.OooO0o("Request Payload is a negative value:" + networkRequestMetric.getRequestPayloadBytes());
                return false;
            }
        }
        if (networkRequestMetric.hasResponsePayloadBytes()) {
            if (!(networkRequestMetric.getResponsePayloadBytes() >= 0)) {
                oooOOO0.OooO0o("Response Payload is a negative value:" + networkRequestMetric.getResponsePayloadBytes());
                return false;
            }
        }
        if (!networkRequestMetric.hasClientStartTimeUs() || networkRequestMetric.getClientStartTimeUs() <= 0) {
            oooOOO0.OooO0o("Start time of the request is null, or zero, or a negative value:" + networkRequestMetric.getClientStartTimeUs());
            return false;
        }
        if (networkRequestMetric.hasTimeToRequestCompletedUs()) {
            if (!(networkRequestMetric.getTimeToRequestCompletedUs() >= 0)) {
                oooOOO0.OooO0o("Time to complete the request is a negative value:" + networkRequestMetric.getTimeToRequestCompletedUs());
                return false;
            }
        }
        if (networkRequestMetric.hasTimeToResponseInitiatedUs()) {
            if (!(networkRequestMetric.getTimeToResponseInitiatedUs() >= 0)) {
                oooOOO0.OooO0o("Time from the start of the request to the start of the response is null or a negative value:" + networkRequestMetric.getTimeToResponseInitiatedUs());
                return false;
            }
        }
        if (!networkRequestMetric.hasTimeToResponseCompletedUs() || networkRequestMetric.getTimeToResponseCompletedUs() <= 0) {
            oooOOO0.OooO0o("Time from the start of the request to the end of the response is null, negative or zero:" + networkRequestMetric.getTimeToResponseCompletedUs());
            return false;
        }
        if (networkRequestMetric.hasHttpResponseCode()) {
            return true;
        }
        oooOOO0.OooO0o("Did not receive a HTTP Response Code");
        return false;
    }
}
