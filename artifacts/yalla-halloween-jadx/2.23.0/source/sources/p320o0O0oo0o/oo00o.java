package p320o0O0oo0o;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f42824OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42825OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Descriptors.Descriptor f42826OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42828OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Descriptors.Descriptor f42829OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Descriptors.Descriptor f42830OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f42831OooO0oo;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017google/api/metric.proto\u0012\ngoogle.api\u001a\u0016google/api/label.proto\u001a\u001dgoogle/api/launch_stage.proto\u001a\u001egoogle/protobuf/duration.proto\"\u009f\u0006\n\u0010MetricDescriptor\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\f\n\u0004type\u0018\b \u0001(\t\u0012+\n\u0006labels\u0018\u0002 \u0003(\u000b2\u001b.google.api.LabelDescriptor\u0012<\n\u000bmetric_kind\u0018\u0003 \u0001(\u000e2'.google.api.MetricDescriptor.MetricKind\u0012:\n\nvalue_type\u0018\u0004 \u0001(\u000e2&.google.api.MetricDescriptor.ValueType\u0012\f\n\u0004unit\u0018\u0005 \u0001(\t\u0012\u0013\n\u000bdescription\u0018\u0006 \u0001(\t\u0012\u0014\n\fdisplay_name\u0018\u0007 \u0001(\t\u0012G\n\bmetadata\u0018\n \u0001(\u000b25.google.api.MetricDescriptor.MetricDescriptorMetadata\u0012-\n\flaunch_stage\u0018\f \u0001(\u000e2\u0017.google.api.LaunchStage\u0012 \n\u0018monitored_resource_types\u0018\r \u0003(\t\u001a°\u0001\n\u0018MetricDescriptorMetadata\u00121\n\flaunch_stage\u0018\u0001 \u0001(\u000e2\u0017.google.api.LaunchStageB\u0002\u0018\u0001\u00120\n\rsample_period\u0018\u0002 \u0001(\u000b2\u0019.google.protobuf.Duration\u0012/\n\fingest_delay\u0018\u0003 \u0001(\u000b2\u0019.google.protobuf.Duration\"O\n\nMetricKind\u0012\u001b\n\u0017METRIC_KIND_UNSPECIFIED\u0010\u0000\u0012\t\n\u0005GAUGE\u0010\u0001\u0012\t\n\u0005DELTA\u0010\u0002\u0012\u000e\n\nCUMULATIVE\u0010\u0003\"q\n\tValueType\u0012\u001a\n\u0016VALUE_TYPE_UNSPECIFIED\u0010\u0000\u0012\b\n\u0004BOOL\u0010\u0001\u0012\t\n\u0005INT64\u0010\u0002\u0012\n\n\u0006DOUBLE\u0010\u0003\u0012\n\n\u0006STRING\u0010\u0004\u0012\u0010\n\fDISTRIBUTION\u0010\u0005\u0012\t\n\u0005MONEY\u0010\u0006\"u\n\u0006Metric\u0012\f\n\u0004type\u0018\u0003 \u0001(\t\u0012.\n\u0006labels\u0018\u0002 \u0003(\u000b2\u001e.google.api.Metric.LabelsEntry\u001a-\n\u000bLabelsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B_\n\u000ecom.google.apiB\u000bMetricProtoP\u0001Z7google.golang.org/genproto/googleapis/api/metric;metric¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[]{o00O00O.f42777OooO0OO, oOO00O.f42823OooO00o, DurationProto.getDescriptor()});
        f42831OooO0oo = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f42824OooO00o = descriptor;
        f42825OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Name", "Type", "Labels", "MetricKind", "ValueType", "Unit", "Description", "DisplayName", "Metadata", "LaunchStage", "MonitoredResourceTypes"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f42826OooO0OO = descriptor2;
        f42827OooO0Oo = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"LaunchStage", "SamplePeriod", "IngestDelay"});
        Descriptors.Descriptor descriptor3 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        f42829OooO0o0 = descriptor3;
        f42828OooO0o = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "Labels"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f42830OooO0oO = descriptor4;
        new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Key", "Value"});
        DurationProto.getDescriptor();
    }
}
