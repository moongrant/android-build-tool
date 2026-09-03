package p329o0O0oooo;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f42113OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42114OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Descriptors.Descriptor f42115OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42116OooO0Oo;

    static {
        Descriptors.Descriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001egoogle/type/phone_number.proto\u0012\u000bgoogle.type\"«\u0001\n\u000bPhoneNumber\u0012\u0015\n\u000be164_number\u0018\u0001 \u0001(\tH\u0000\u00128\n\nshort_code\u0018\u0002 \u0001(\u000b2\".google.type.PhoneNumber.ShortCodeH\u0000\u0012\u0011\n\textension\u0018\u0003 \u0001(\t\u001a0\n\tShortCode\u0012\u0013\n\u000bregion_code\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0002 \u0001(\tB\u0006\n\u0004kindBt\n\u000fcom.google.typeB\u0010PhoneNumberProtoP\u0001ZDgoogle.golang.org/genproto/googleapis/type/phone_number;phone_numberø\u0001\u0001¢\u0002\u0003GTPb\u0006proto3"}, new Descriptors.FileDescriptor[0]).getMessageTypes().get(0);
        f42113OooO00o = descriptor;
        f42114OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"E164Number", "ShortCode", "Extension", "Kind"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f42115OooO0OO = descriptor2;
        f42116OooO0Oo = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"RegionCode", "Number"});
    }
}
