package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.CloudFunctionConfiguration;
import com.amazonaws.services.s3.model.Filter;
import com.amazonaws.services.s3.model.LambdaConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class LambdaConfigurationStaxUnmarshaller implements Unmarshaller<Map.Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static LambdaConfigurationStaxUnmarshaller f11017OooO00o = new LambdaConfigurationStaxUnmarshaller();

    private LambdaConfigurationStaxUnmarshaller() {
    }

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<String, NotificationConfiguration> OooO00o(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int iOooO00o = staxUnmarshallerContext.OooO00o();
        int i = iOooO00o + 1;
        if (staxUnmarshallerContext.OooO0O0()) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        String strOooO0Oo = null;
        String strOooO0Oo2 = null;
        String strOooO0Oo3 = null;
        Filter filterOooO00o = null;
        while (true) {
            int iOooO0OO = staxUnmarshallerContext.OooO0OO();
            if (iOooO0OO == 1) {
                return null;
            }
            if (iOooO0OO == 2) {
                if (staxUnmarshallerContext.OooO0o0("Id", i)) {
                    Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                    strOooO0Oo = staxUnmarshallerContext.OooO0Oo();
                } else if (staxUnmarshallerContext.OooO0o0("Event", i)) {
                    Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                    arrayList.add(staxUnmarshallerContext.OooO0Oo());
                } else if (staxUnmarshallerContext.OooO0o0("Filter", i)) {
                    filterOooO00o = FilterStaxUnmarshaller.f11016OooO00o.OooO00o(staxUnmarshallerContext);
                } else if (staxUnmarshallerContext.OooO0o0("CloudFunction", i)) {
                    Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                    strOooO0Oo2 = staxUnmarshallerContext.OooO0Oo();
                } else if (staxUnmarshallerContext.OooO0o0("InvocationRole", i)) {
                    Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                    strOooO0Oo3 = staxUnmarshallerContext.OooO0Oo();
                }
            } else if (iOooO0OO == 3 && staxUnmarshallerContext.OooO00o() < iOooO00o) {
                NotificationConfiguration lambdaConfiguration = strOooO0Oo3 == null ? new LambdaConfiguration(strOooO0Oo2, (String[]) arrayList.toArray(new String[0])) : new CloudFunctionConfiguration(strOooO0Oo3, strOooO0Oo2, (String[]) arrayList.toArray(new String[0]));
                lambdaConfiguration.f10854Oooo0oO = filterOooO00o;
                return new AbstractMap.SimpleEntry(strOooO0Oo, lambdaConfiguration);
            }
        }
    }
}
