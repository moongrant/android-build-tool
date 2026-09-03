package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.FilterRule;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class FilterRuleStaxUnmarshaller implements Unmarshaller<FilterRule, StaxUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static FilterRuleStaxUnmarshaller f11015OooO00o = new FilterRuleStaxUnmarshaller();

    private FilterRuleStaxUnmarshaller() {
    }

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final FilterRule OooO00o(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int iOooO00o = staxUnmarshallerContext.OooO00o();
        int i = iOooO00o + 1;
        if (staxUnmarshallerContext.OooO0O0()) {
            i += 2;
        }
        FilterRule filterRule = new FilterRule();
        while (true) {
            int iOooO0OO = staxUnmarshallerContext.OooO0OO();
            if (iOooO0OO == 1) {
                return filterRule;
            }
            if (iOooO0OO == 2) {
                if (staxUnmarshallerContext.OooO0o0("Name", i)) {
                    Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                    String strOooO0Oo = staxUnmarshallerContext.OooO0Oo();
                    if (strOooO0Oo == null) {
                        throw new IllegalArgumentException("FilterRule Name is a required argument");
                    }
                    filterRule.f10787Oooo0o = strOooO0Oo;
                } else if (staxUnmarshallerContext.OooO0o0("Value", i)) {
                    Objects.requireNonNull(SimpleTypeStaxUnmarshallers$StringStaxUnmarshaller.OooO0O0());
                    filterRule.f10788Oooo0oO = staxUnmarshallerContext.OooO0Oo();
                }
            } else if (iOooO0OO == 3 && staxUnmarshallerContext.OooO00o() < iOooO00o) {
                return filterRule;
            }
        }
    }
}
