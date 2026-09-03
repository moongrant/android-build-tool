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
    public static SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller f12656OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TimestampFormat f12657OooO00o;

    public SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller(TimestampFormat timestampFormat) {
        this.f12657OooO00o = timestampFormat;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Date OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        String strOooO0o = jsonUnmarshallerContext.f12654OooO00o.OooO0o();
        if (strOooO0o == null) {
            return null;
        }
        try {
            int i = SimpleTypeJsonUnmarshallers$1.f12655OooO00o[this.f12657OooO00o.ordinal()];
            if (i != 1) {
                return i != 2 ? new Date(NumberFormat.getInstance(new Locale("en")).parse(strOooO0o).longValue() * 1000) : DateUtils.OooO0o0(strOooO0o);
            }
            return DateUtils.OooO0Oo(strOooO0o);
        } catch (IllegalArgumentException | ParseException e) {
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Unable to parse date '", strOooO0o, "':  ");
            sbOooO0O0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0O0.toString(), e);
        }
    }
}
