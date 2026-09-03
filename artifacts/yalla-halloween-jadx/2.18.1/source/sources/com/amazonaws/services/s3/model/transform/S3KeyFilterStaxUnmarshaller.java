package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.S3KeyFilter;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* JADX INFO: loaded from: classes.dex */
class S3KeyFilterStaxUnmarshaller implements Unmarshaller<S3KeyFilter, StaxUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static S3KeyFilterStaxUnmarshaller f11019OooO00o = new S3KeyFilterStaxUnmarshaller();

    private S3KeyFilterStaxUnmarshaller() {
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.FilterRule>] */
    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final S3KeyFilter OooO00o(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int iOooO00o = staxUnmarshallerContext.OooO00o();
        int i = iOooO00o + 1;
        if (staxUnmarshallerContext.OooO0O0()) {
            i++;
        }
        S3KeyFilter s3KeyFilter = new S3KeyFilter();
        while (true) {
            int iOooO0OO = staxUnmarshallerContext.OooO0OO();
            if (iOooO0OO == 1) {
                return s3KeyFilter;
            }
            if (iOooO0OO == 2) {
                if (staxUnmarshallerContext.OooO0o0("FilterRule", i)) {
                    s3KeyFilter.f10896Oooo0o.add(FilterRuleStaxUnmarshaller.f11015OooO00o.OooO00o(staxUnmarshallerContext));
                }
            } else if (iOooO0OO == 3 && staxUnmarshallerContext.OooO00o() < iOooO00o) {
                return s3KeyFilter;
            }
        }
    }
}
