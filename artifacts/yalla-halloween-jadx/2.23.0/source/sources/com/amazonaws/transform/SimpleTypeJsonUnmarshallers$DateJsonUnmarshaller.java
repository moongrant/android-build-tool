package com.amazonaws.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.DateUtils;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller implements Unmarshaller<Date, JsonUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller f9565OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TimestampFormat f9566OooO00o;

    public SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller(TimestampFormat timestampFormat) {
        this.f9566OooO00o = timestampFormat;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Date OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        String strOooO0o = jsonUnmarshallerContext.f9563OooO00o.OooO0o();
        if (strOooO0o == null) {
            return null;
        }
        try {
            int i = SimpleTypeJsonUnmarshallers$1.f9564OooO00o[this.f9566OooO00o.ordinal()];
            if (i != 1) {
                return i != 2 ? new Date(NumberFormat.getInstance(new Locale("en")).parse(strOooO0o).longValue() * 1000) : DateUtils.OooO0o0(strOooO0o);
            }
            return DateUtils.OooO0Oo(strOooO0o);
        } catch (IllegalArgumentException | ParseException e) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("Unable to parse date '", strOooO0o, "':  ");
            sbOooO00o.append(e.getMessage());
            throw new AmazonClientException(sbOooO00o.toString(), e);
        }
    }
}
