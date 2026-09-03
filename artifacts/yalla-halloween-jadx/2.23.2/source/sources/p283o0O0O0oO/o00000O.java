package p283o0O0O0oO;

import com.google.protobuf.AnyProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import o0O0O0Oo.OooO0O0;
import o0O0O0Oo.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41323OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f41324OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41325OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41326OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41327OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41328OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Descriptors.Descriptor f41329OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41330OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41331OooO0oo;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%google/cloud/location/locations.proto\u0012\u0015google.cloud.location\u001a\u001cgoogle/api/annotations.proto\u001a\u0019google/protobuf/any.proto\u001a\u0017google/api/client.proto\"[\n\u0014ListLocationsRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006filter\u0018\u0002 \u0001(\t\u0012\u0011\n\tpage_size\u0018\u0003 \u0001(\u0005\u0012\u0012\n\npage_token\u0018\u0004 \u0001(\t\"d\n\u0015ListLocationsResponse\u00122\n\tlocations\u0018\u0001 \u0003(\u000b2\u001f.google.cloud.location.Location\u0012\u0017\n\u000fnext_page_token\u0018\u0002 \u0001(\t\"\"\n\u0012GetLocationRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"×\u0001\n\bLocation\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0013\n\u000blocation_id\u0018\u0004 \u0001(\t\u0012\u0014\n\fdisplay_name\u0018\u0005 \u0001(\t\u0012;\n\u0006labels\u0018\u0002 \u0003(\u000b2+.google.cloud.location.Location.LabelsEntry\u0012&\n\bmetadata\u0018\u0003 \u0001(\u000b2\u0014.google.protobuf.Any\u001a-\n\u000bLabelsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u00012¤\u0003\n\tLocations\u0012«\u0001\n\rListLocations\u0012+.google.cloud.location.ListLocationsRequest\u001a,.google.cloud.location.ListLocationsResponse\"?\u0082Óä\u0093\u00029\u0012\u0014/v1/{name=locations}Z!\u0012\u001f/v1/{name=projects/*}/locations\u0012\u009e\u0001\n\u000bGetLocation\u0012).google.cloud.location.GetLocationRequest\u001a\u001f.google.cloud.location.Location\"C\u0082Óä\u0093\u0002=\u0012\u0016/v1/{name=locations/*}Z#\u0012!/v1/{name=projects/*/locations/*}\u001aHÊA\u0014cloud.googleapis.comÒA.https://www.googleapis.com/auth/cloud-platformBo\n\u0019com.google.cloud.locationB\u000eLocationsProtoP\u0001Z=google.golang.org/genproto/googleapis/cloud/location;locationø\u0001\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{OooO0O0.f41158OooO0O0, AnyProto.getDescriptor(), OooOO0.f41180OooO0Oo});
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f41324OooO00o = descriptor;
        f41325OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Name", "Filter", "PageSize", "PageToken"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        f41326OooO0OO = descriptor2;
        f41327OooO0Oo = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Locations", "NextPageToken"});
        Descriptors.Descriptor descriptor3 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(2);
        f41329OooO0o0 = descriptor3;
        f41328OooO0o = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Name"});
        Descriptors.Descriptor descriptor4 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(3);
        f41330OooO0oO = descriptor4;
        f41331OooO0oo = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Name", "LocationId", "DisplayName", "Labels", "Metadata"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        f41323OooO = descriptor5;
        new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Key", "Value"});
        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) OooOO0.f41178OooO0O0);
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) OooO0O0.f41157OooO00o);
        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) OooOO0.f41179OooO0OO);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(fileDescriptorInternalBuildGeneratedFileFrom, extensionRegistryNewInstance);
        AnyProto.getDescriptor();
    }
}
