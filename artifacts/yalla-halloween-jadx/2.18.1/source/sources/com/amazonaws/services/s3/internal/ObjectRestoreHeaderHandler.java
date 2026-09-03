package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ObjectRestoreHeaderHandler<T extends ObjectRestoreResult> implements HeaderHandler<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f10654OooO00o = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f10655OooO0O0 = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Log f10656OooO0OO = LogFactory.OooO00o(ObjectRestoreHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final void OooO00o(T t, HttpResponse httpResponse) {
        Date dateOooO0oO;
        String str = httpResponse.f10399OooO0Oo.get("x-amz-restore");
        if (str != null) {
            Matcher matcher = f10654OooO00o.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    Log log = ServiceUtils.f10681OooO00o;
                    dateOooO0oO = DateUtils.OooO0oO(strGroup);
                } catch (Exception e) {
                    f10656OooO0OO.OooO0oO("Error parsing expiry-date from x-amz-restore header.", e);
                    dateOooO0oO = null;
                }
            } else {
                dateOooO0oO = null;
            }
            t.OooO0o0(dateOooO0oO);
            Matcher matcher2 = f10655OooO0O0.matcher(str);
            Boolean boolValueOf = matcher2.find() ? Boolean.valueOf(Boolean.parseBoolean(matcher2.group(1))) : null;
            if (boolValueOf != null) {
                t.OooOO0O(boolValueOf.booleanValue());
            }
        }
    }
}
