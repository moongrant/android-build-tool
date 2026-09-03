package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.Filter;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* JADX INFO: loaded from: classes.dex */
class FilterStaxUnmarshaller implements Unmarshaller<Filter, StaxUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static FilterStaxUnmarshaller f11016OooO00o = new FilterStaxUnmarshaller();

    private FilterStaxUnmarshaller() {
    }

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Filter OooO00o(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int iOooO00o = staxUnmarshallerContext.OooO00o();
        int i = iOooO00o + 1;
        if (staxUnmarshallerContext.OooO0O0()) {
            i++;
        }
        Filter filter = new Filter();
        while (true) {
            int iOooO0OO = staxUnmarshallerContext.OooO0OO();
            if (iOooO0OO == 1) {
                return filter;
            }
            if (iOooO0OO == 2) {
                if (staxUnmarshallerContext.OooO0o0("S3Key", i)) {
                    filter.f10786Oooo0o = S3KeyFilterStaxUnmarshaller.f11019OooO00o.OooO00o(staxUnmarshallerContext);
                }
            } else if (iOooO0OO == 3 && staxUnmarshallerContext.OooO00o() < iOooO00o) {
                return filter;
            }
        }
    }
}
