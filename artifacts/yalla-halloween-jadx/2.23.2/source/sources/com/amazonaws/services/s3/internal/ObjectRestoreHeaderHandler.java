package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectRestoreHeaderHandler<T extends ObjectRestoreResult> implements HeaderHandler<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f12411OooO00o = Pattern.compile("expiry-date=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f12412OooO0O0 = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Log f12413OooO0OO = LogFactory.OooO00o(ObjectRestoreHeaderHandler.class);

    public static void OooO0O0(ObjectRestoreResult objectRestoreResult, HttpResponse httpResponse) {
        Date dateOooO0o0;
        String str = httpResponse.f12183OooO0Oo.get("x-amz-restore");
        if (str != null) {
            Matcher matcher = f12411OooO00o.matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    Log log = ServiceUtils.f12431OooO00o;
                    dateOooO0o0 = DateUtils.OooO0o0(strGroup);
                } catch (Exception e) {
                    f12413OooO0OO.OooOO0O("Error parsing expiry-date from x-amz-restore header.", e);
                    dateOooO0o0 = null;
                }
            } else {
                dateOooO0o0 = null;
            }
            objectRestoreResult.OooO0oo(dateOooO0o0);
            Matcher matcher2 = f12412OooO0O0.matcher(str);
            Boolean boolValueOf = matcher2.find() ? Boolean.valueOf(Boolean.parseBoolean(matcher2.group(1))) : null;
            if (boolValueOf != null) {
                objectRestoreResult.OooOO0(boolValueOf.booleanValue());
            }
        }
    }

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final /* bridge */ /* synthetic */ void OooO00o(Object obj, HttpResponse httpResponse) {
        OooO0O0((ObjectRestoreResult) obj, httpResponse);
    }
}
