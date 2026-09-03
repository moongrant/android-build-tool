package p329o0O0oooo;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f42122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Descriptors.Descriptor f42124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f42125OooO0Oo;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001agoogle/type/datetime.proto\u0012\u000bgoogle.type\u001a\u001egoogle/protobuf/duration.proto\"à\u0001\n\bDateTime\u0012\f\n\u0004year\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005month\u0018\u0002 \u0001(\u0005\u0012\u000b\n\u0003day\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005hours\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007minutes\u0018\u0005 \u0001(\u0005\u0012\u000f\n\u0007seconds\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005nanos\u0018\u0007 \u0001(\u0005\u0012/\n\nutc_offset\u0018\b \u0001(\u000b2\u0019.google.protobuf.DurationH\u0000\u0012*\n\ttime_zone\u0018\t \u0001(\u000b2\u0015.google.type.TimeZoneH\u0000B\r\n\u000btime_offset\"'\n\bTimeZone\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0002 \u0001(\tBi\n\u000fcom.google.typeB\rDateTimeProtoP\u0001Z<google.golang.org/genproto/googleapis/type/datetime;datetimeø\u0001\u0001¢\u0002\u0003GTPb\u0006proto3"}, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor()});
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f42122OooO00o = descriptor;
        f42123OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Year", "Month", "Day", "Hours", "Minutes", "Seconds", "Nanos", "UtcOffset", "TimeZone", "TimeOffset"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        f42124OooO0OO = descriptor2;
        f42125OooO0Oo = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "Version"});
        DurationProto.getDescriptor();
    }
}
