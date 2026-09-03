package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectExpirationHeaderHandler<T extends ObjectExpirationResult> implements HeaderHandler<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f9318OooO00o = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f9319OooO0O0 = Pattern.compile("rule-id=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Log f9320OooO0OO = LogFactory.OooO00o(ObjectExpirationHeaderHandler.class);

    public static void OooO0O0(ObjectExpirationResult objectExpirationResult, HttpResponse httpResponse) {
        Date dateOooO0o0;
        String str = httpResponse.f9093OooO0Oo.get("x-amz-expiration");
        if (str != null) {
            Matcher matcher = f9318OooO00o.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    Log log = ServiceUtils.f9341OooO00o;
                    dateOooO0o0 = DateUtils.OooO0o0(strGroup);
                } catch (Exception e) {
                    f9320OooO0OO.OooOO0O("Error parsing expiry-date from x-amz-expiration header.", e);
                    dateOooO0o0 = null;
                }
            } else {
                dateOooO0o0 = null;
            }
            objectExpirationResult.OooO0o0(dateOooO0o0);
            Matcher matcher2 = f9319OooO0O0.matcher(str);
            objectExpirationResult.OooO0Oo(matcher2.find() ? matcher2.group(1) : null);
        }
    }

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final /* bridge */ /* synthetic */ void OooO00o(Object obj, HttpResponse httpResponse) {
        OooO0O0((ObjectExpirationResult) obj, httpResponse);
    }
}
