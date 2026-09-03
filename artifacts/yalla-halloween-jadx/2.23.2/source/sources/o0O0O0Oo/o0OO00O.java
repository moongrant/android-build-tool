package o0O0O0Oo;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f41265OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f41266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41268OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Descriptors.Descriptor f41270OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Descriptors.Descriptor f41271OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41272OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Descriptors.Descriptor f41273OooO0oo;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016google/api/quota.proto\u0012\ngoogle.api\"]\n\u0005Quota\u0012&\n\u0006limits\u0018\u0003 \u0003(\u000b2\u0016.google.api.QuotaLimit\u0012,\n\fmetric_rules\u0018\u0004 \u0003(\u000b2\u0016.google.api.MetricRule\"\u0091\u0001\n\nMetricRule\u0012\u0010\n\bselector\u0018\u0001 \u0001(\t\u0012=\n\fmetric_costs\u0018\u0002 \u0003(\u000b2'.google.api.MetricRule.MetricCostsEntry\u001a2\n\u0010MetricCostsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0003:\u00028\u0001\"\u0095\u0002\n\nQuotaLimit\u0012\f\n\u0004name\u0018\u0006 \u0001(\t\u0012\u0013\n\u000bdescription\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_limit\u0018\u0003 \u0001(\u0003\u0012\u0011\n\tmax_limit\u0018\u0004 \u0001(\u0003\u0012\u0011\n\tfree_tier\u0018\u0007 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006metric\u0018\b \u0001(\t\u0012\f\n\u0004unit\u0018\t \u0001(\t\u00122\n\u0006values\u0018\n \u0003(\u000b2\".google.api.QuotaLimit.ValuesEntry\u0012\u0014\n\fdisplay_name\u0018\f \u0001(\t\u001a-\n\u000bValuesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0003:\u00028\u0001Bl\n\u000ecom.google.apiB\nQuotaProtoP\u0001ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfig¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        f41265OooO = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f41266OooO00o = descriptor;
        f41267OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Limits", "MetricRules"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        f41268OooO0OO = descriptor2;
        f41269OooO0Oo = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Selector", "MetricCosts"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f41271OooO0o0 = descriptor3;
        new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor4 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(2);
        f41270OooO0o = descriptor4;
        f41272OooO0oO = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Name", "Description", "DefaultLimit", "MaxLimit", "FreeTier", "Duration", "Metric", "Unit", "Values", "DisplayName"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        f41273OooO0oo = descriptor5;
        new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Key", "Value"});
    }
}
