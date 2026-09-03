package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
abstract class NotificationConfigurationStaxUnmarshaller<T extends NotificationConfiguration> implements Unmarshaller<Map.Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {
    public abstract T OooO0O0();

    public abstract boolean OooO0OO(T t, StaxUnmarshallerContext staxUnmarshallerContext, int i) throws Exception;

    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<String, NotificationConfiguration> OooO00o(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int iOooO00o = staxUnmarshallerContext.OooO00o();
        int i = iOooO00o + 1;
        if (staxUnmarshallerContext.OooO0O0()) {
            i++;
        }
        NotificationConfiguration notificationConfigurationOooO0O0 = OooO0O0();
        String strOooO0Oo = null;
        while (true) {
            int iOooO0OO = staxUnmarshallerContext.OooO0OO();
            if (iOooO0OO == 1) {
                return null;
            }
            if (iOooO0OO == 2) {
                if (!OooO0OO(notificationConfigurationOooO0O0, staxUnmarshallerContext, i)) {
                    if (staxUnmarshallerContext.OooO0o0("Id", i)) {
                        Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                        strOooO0Oo = staxUnmarshallerContext.OooO0Oo();
                    } else if (staxUnmarshallerContext.OooO0o0("Event", i)) {
                        Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                        notificationConfigurationOooO0O0.f10853Oooo0o.add(staxUnmarshallerContext.OooO0Oo());
                    } else if (staxUnmarshallerContext.OooO0o0("Filter", i)) {
                        notificationConfigurationOooO0O0.f10854Oooo0oO = FilterStaxUnmarshaller.f11016OooO00o.OooO00o(staxUnmarshallerContext);
                    }
                }
            } else if (iOooO0OO == 3 && staxUnmarshallerContext.OooO00o() < iOooO00o) {
                return new AbstractMap.SimpleEntry(strOooO0Oo, notificationConfigurationOooO0O0);
            }
        }
    }
}
