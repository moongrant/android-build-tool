package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectExpirationHeaderHandler<T extends ObjectExpirationResult> implements HeaderHandler<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f10651OooO00o = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f10652OooO0O0 = Pattern.compile("rule-id=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Log f10653OooO0OO = LogFactory.OooO00o(ObjectExpirationHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final void OooO00o(T t, HttpResponse httpResponse) {
        Date dateOooO0oO;
        String str = httpResponse.f10399OooO0Oo.get("x-amz-expiration");
        if (str != null) {
            Matcher matcher = f10651OooO00o.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    Log log = ServiceUtils.f10681OooO00o;
                    dateOooO0oO = DateUtils.OooO0oO(strGroup);
                } catch (Exception e) {
                    f10653OooO0OO.OooO0oO("Error parsing expiry-date from x-amz-expiration header.", e);
                    dateOooO0oO = null;
                }
            } else {
                dateOooO0oO = null;
            }
            t.OooOOO(dateOooO0oO);
            Matcher matcher2 = f10652OooO0O0.matcher(str);
            t.OooOO0o(matcher2.find() ? matcher2.group(1) : null);
        }
    }
}
