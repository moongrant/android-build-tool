package com.amazonaws.transform;

import OooO0o.OooO0o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.util.DateUtils;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller implements Unmarshaller<Date, JsonUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller f11154OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TimestampFormat f11155OooO00o;

    public SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller(TimestampFormat timestampFormat) {
        this.f11155OooO00o = timestampFormat;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Date OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        String strOooO0OO = jsonUnmarshallerContext.f11152OooO00o.OooO0OO();
        if (strOooO0OO == null) {
            return null;
        }
        try {
            int i = SimpleTypeJsonUnmarshallers$1.f11153OooO00o[this.f11155OooO00o.ordinal()];
            if (i != 1) {
                return i != 2 ? new Date(NumberFormat.getInstance(new Locale("en")).parse(strOooO0OO).longValue() * 1000) : DateUtils.OooO0oO(strOooO0OO);
            }
            return DateUtils.OooO0o(strOooO0OO);
        } catch (IllegalArgumentException | ParseException e) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("Unable to parse date '", strOooO0OO, "':  ");
            sbOooO0OO.append(e.getMessage());
            throw new AmazonClientException(sbOooO0OO.toString(), e);
        }
    }
}
