package p320o0O0oo0o;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f42795OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42796OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Descriptors.Descriptor f42797OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f42799OooO0o0;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bgoogle/api/monitoring.proto\u0012\ngoogle.api\"ì\u0001\n\nMonitoring\u0012K\n\u0015producer_destinations\u0018\u0001 \u0003(\u000b2,.google.api.Monitoring.MonitoringDestination\u0012K\n\u0015consumer_destinations\u0018\u0002 \u0003(\u000b2,.google.api.Monitoring.MonitoringDestination\u001aD\n\u0015MonitoringDestination\u0012\u001a\n\u0012monitored_resource\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007metrics\u0018\u0002 \u0003(\tBq\n\u000ecom.google.apiB\u000fMonitoringProtoP\u0001ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfig¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        f42799OooO0o0 = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f42795OooO00o = descriptor;
        f42796OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"ProducerDestinations", "ConsumerDestinations"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f42797OooO0OO = descriptor2;
        f42798OooO0Oo = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"MonitoredResource", "Metrics"});
    }
}
