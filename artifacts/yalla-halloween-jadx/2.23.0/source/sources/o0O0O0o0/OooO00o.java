package o0O0O0o0;

import com.google.protobuf.AnyProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StructProto;
import p323o0O0ooOO.o00OO;
import p325o0O0ooo0.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41924OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f41925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41927OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41928OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41929OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Descriptors.Descriptor f41930OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41931OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41932OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41933OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Descriptors.Descriptor f41934OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41935OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41936OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Descriptors.Descriptor f41937OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Descriptors.Descriptor f41938OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f41939OooOOOo;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"google/cloud/audit/audit_log.proto\u0012\u0012google.cloud.audit\u001a\u0019google/protobuf/any.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a*google/rpc/context/attribute_context.proto\u001a\u0017google/rpc/status.proto\"þ\u0004\n\bAuditLog\u0012\u0014\n\fservice_name\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bmethod_name\u0018\b \u0001(\t\u0012\u0015\n\rresource_name\u0018\u000b \u0001(\t\u0012?\n\u0011resource_location\u0018\u0014 \u0001(\u000b2$.google.cloud.audit.ResourceLocation\u00128\n\u0017resource_original_state\u0018\u0013 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u001a\n\u0012num_response_items\u0018\f \u0001(\u0003\u0012\"\n\u0006status\u0018\u0002 \u0001(\u000b2\u0012.google.rpc.Status\u0012C\n\u0013authentication_info\u0018\u0003 \u0001(\u000b2&.google.cloud.audit.AuthenticationInfo\u0012A\n\u0012authorization_info\u0018\t \u0003(\u000b2%.google.cloud.audit.AuthorizationInfo\u0012=\n\u0010request_metadata\u0018\u0004 \u0001(\u000b2#.google.cloud.audit.RequestMetadata\u0012(\n\u0007request\u0018\u0010 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012)\n\bresponse\u0018\u0011 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012)\n\bmetadata\u0018\u0012 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012.\n\fservice_data\u0018\u000f \u0001(\u000b2\u0014.google.protobuf.AnyB\u0002\u0018\u0001\"\u0099\u0002\n\u0012AuthenticationInfo\u0012\u0017\n\u000fprincipal_email\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012authority_selector\u0018\u0002 \u0001(\t\u00126\n\u0015third_party_principal\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012 \n\u0018service_account_key_name\u0018\u0005 \u0001(\t\u0012Y\n\u001fservice_account_delegation_info\u0018\u0006 \u0003(\u000b20.google.cloud.audit.ServiceAccountDelegationInfo\u0012\u0019\n\u0011principal_subject\u0018\b \u0001(\t\"\u0096\u0001\n\u0011AuthorizationInfo\u0012\u0010\n\bresource\u0018\u0001 \u0001(\t\u0012\u0012\n\npermission\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007granted\u0018\u0003 \u0001(\b\u0012J\n\u0013resource_attributes\u0018\u0005 \u0001(\u000b2-.google.rpc.context.AttributeContext.Resource\"õ\u0001\n\u000fRequestMetadata\u0012\u0011\n\tcaller_ip\u0018\u0001 \u0001(\t\u0012\"\n\u001acaller_supplied_user_agent\u0018\u0002 \u0001(\t\u0012\u0016\n\u000ecaller_network\u0018\u0003 \u0001(\t\u0012H\n\u0012request_attributes\u0018\u0007 \u0001(\u000b2,.google.rpc.context.AttributeContext.Request\u0012I\n\u0016destination_attributes\u0018\b \u0001(\u000b2).google.rpc.context.AttributeContext.Peer\"I\n\u0010ResourceLocation\u0012\u0019\n\u0011current_locations\u0018\u0001 \u0003(\t\u0012\u001a\n\u0012original_locations\u0018\u0002 \u0003(\t\"Ã\u0003\n\u001cServiceAccountDelegationInfo\u0012\u0019\n\u0011principal_subject\u0018\u0003 \u0001(\t\u0012e\n\u0015first_party_principal\u0018\u0001 \u0001(\u000b2D.google.cloud.audit.ServiceAccountDelegationInfo.FirstPartyPrincipalH\u0000\u0012e\n\u0015third_party_principal\u0018\u0002 \u0001(\u000b2D.google.cloud.audit.ServiceAccountDelegationInfo.ThirdPartyPrincipalH\u0000\u001aa\n\u0013FirstPartyPrincipal\u0012\u0017\n\u000fprincipal_email\u0018\u0001 \u0001(\t\u00121\n\u0010service_metadata\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u001aJ\n\u0013ThirdPartyPrincipal\u00123\n\u0012third_party_claims\u0018\u0001 \u0001(\u000b2\u0017.google.protobuf.StructB\u000b\n\tAuthorityBe\n\u0016com.google.cloud.auditB\rAuditLogProtoP\u0001Z7google.golang.org/genproto/googleapis/cloud/audit;auditø\u0001\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), StructProto.getDescriptor(), o000O.f42975OooOo00, o00OO.f42889OooO0OO});
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f41925OooO00o = descriptor;
        f41926OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"ServiceName", "MethodName", "ResourceName", "ResourceLocation", "ResourceOriginalState", "NumResponseItems", "Status", "AuthenticationInfo", "AuthorizationInfo", "RequestMetadata", "Request", "Response", "Metadata", "ServiceData"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        f41927OooO0OO = descriptor2;
        f41928OooO0Oo = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"PrincipalEmail", "AuthoritySelector", "ThirdPartyPrincipal", "ServiceAccountKeyName", "ServiceAccountDelegationInfo", "PrincipalSubject"});
        Descriptors.Descriptor descriptor3 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(2);
        f41930OooO0o0 = descriptor3;
        f41929OooO0o = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Resource", "Permission", "Granted", "ResourceAttributes"});
        Descriptors.Descriptor descriptor4 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(3);
        f41931OooO0oO = descriptor4;
        f41932OooO0oo = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"CallerIp", "CallerSuppliedUserAgent", "CallerNetwork", "RequestAttributes", "DestinationAttributes"});
        Descriptors.Descriptor descriptor5 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(4);
        f41924OooO = descriptor5;
        f41933OooOO0 = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"CurrentLocations", "OriginalLocations"});
        Descriptors.Descriptor descriptor6 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(5);
        f41934OooOO0O = descriptor6;
        f41935OooOO0o = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"PrincipalSubject", "FirstPartyPrincipal", "ThirdPartyPrincipal", "Authority"});
        Descriptors.Descriptor descriptor7 = descriptor6.getNestedTypes().get(0);
        f41937OooOOO0 = descriptor7;
        f41936OooOOO = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"PrincipalEmail", "ServiceMetadata"});
        Descriptors.Descriptor descriptor8 = descriptor6.getNestedTypes().get(1);
        f41938OooOOOO = descriptor8;
        f41939OooOOOo = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"ThirdPartyClaims"});
        AnyProto.getDescriptor();
        StructProto.getDescriptor();
    }
}
