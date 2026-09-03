package com.google.cloud.location;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Map;
import p102o000oo0.o00Ooo;
import p283o0O0O0oO.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final class Location extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Location f18565OooOO0 = new Location();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f18566OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte f18567OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18568OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18569OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18570OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public MapField<String, String> f18571OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Any f18572OooO0oo;

    public static class OooO00o extends AbstractParser<Location> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Location(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f18573OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18574OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18575OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MapField<String, String> f18576OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Any f18577OooO0oo;

        public OooO0O0() {
            this.f18573OooO0Oo = "";
            this.f18575OooO0o0 = "";
            this.f18574OooO0o = "";
            Location location = Location.f18565OooOO0;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Location buildPartial() {
            Location location = new Location(this);
            location.f18568OooO0Oo = this.f18573OooO0Oo;
            location.f18570OooO0o0 = this.f18575OooO0o0;
            location.f18569OooO0o = this.f18574OooO0o;
            MapField<String, String> mapFieldEmptyMapField = this.f18576OooO0oO;
            if (mapFieldEmptyMapField == null) {
                mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f18578OooO00o);
            }
            location.f18571OooO0oO = mapFieldEmptyMapField;
            mapFieldEmptyMapField.makeImmutable();
            location.f18572OooO0oo = this.f18577OooO0oo;
            onBuilt();
            return location;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18573OooO0Oo = "";
            this.f18575OooO0o0 = "";
            this.f18574OooO0o = "";
            OooO0o().clear();
            this.f18577OooO0oo = null;
        }

        public final MapField<String, String> OooO0o() {
            onChanged();
            if (this.f18576OooO0oO == null) {
                this.f18576OooO0oO = MapField.newMapField(OooO0OO.f18578OooO00o);
            }
            if (!this.f18576OooO0oO.isMutable()) {
                this.f18576OooO0oO = this.f18576OooO0oO.copy();
            }
            return this.f18576OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final void OooO0oO(Location location) {
            if (location == Location.f18565OooOO0) {
                return;
            }
            if (!location.getName().isEmpty()) {
                this.f18573OooO0Oo = location.f18568OooO0Oo;
                onChanged();
            }
            if (!location.OooO0OO().isEmpty()) {
                this.f18575OooO0o0 = location.f18570OooO0o0;
                onChanged();
            }
            if (!location.OooO0O0().isEmpty()) {
                this.f18574OooO0o = location.f18569OooO0o;
                onChanged();
            }
            OooO0o().mergeFrom(location.OooO0o0());
            if (location.f18572OooO0oo != null) {
                Any anyOooO0Oo = location.OooO0Oo();
                Any any = this.f18577OooO0oo;
                if (any != null) {
                    this.f18577OooO0oo = Any.newBuilder(any).mergeFrom(anyOooO0Oo).buildPartial();
                } else {
                    this.f18577OooO0oo = anyOooO0Oo;
                }
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Location location;
            try {
                try {
                    Location.f18566OooOO0O.getClass();
                    OooO0oO(new Location(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    location = (Location) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (location != null) {
                            OooO0oO(location);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                location = null;
                if (location != null) {
                    OooO0oO(location);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final Message build() {
            Location locationBuildPartial = buildPartial();
            if (locationBuildPartial.isInitialized()) {
                return locationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (OooO0O0) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0O0) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return Location.f18565OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00000O.f41330OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00000O.f41331OooO0oo.ensureFieldAccessorsInitialized(Location.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final MapField internalGetMapField(int i) {
            if (i != 2) {
                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
            }
            MapField<String, String> mapField = this.f18576OooO0oO;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f18578OooO00o) : mapField;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final MapField internalGetMutableMapField(int i) {
            if (i == 2) {
                return OooO0o();
            }
            throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (OooO0O0) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (OooO0O0) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0O0) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return Location.f18565OooOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (OooO0O0) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ Message.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0O0) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            Location locationBuildPartial = buildPartial();
            if (locationBuildPartial.isInitialized()) {
                return locationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof Location) {
                OooO0oO((Location) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18573OooO0Oo = "";
            this.f18575OooO0o0 = "";
            this.f18574OooO0o = "";
            Location location = Location.f18565OooOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Location) {
                OooO0oO((Location) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final MapEntry<String, String> f18578OooO00o;

        static {
            Descriptors.Descriptor descriptor = o00000O.f41323OooO;
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f18578OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
        }
    }

    public Location(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18567OooO = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f18569OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18569OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f18570OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18570OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    public final Any OooO0Oo() {
        Any any = this.f18572OooO0oo;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18565OooOO0) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oO(this);
        return oooO0O0;
    }

    public final MapField<String, String> OooO0o0() {
        MapField<String, String> mapField = this.f18571OooO0oO;
        return mapField == null ? MapField.emptyMapField(OooO0OO.f18578OooO00o) : mapField;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return super.equals(obj);
        }
        Location location = (Location) obj;
        if (!getName().equals(location.getName()) || !OooO0OO().equals(location.OooO0OO()) || !OooO0O0().equals(location.OooO0O0()) || !OooO0o0().equals(location.OooO0o0())) {
            return false;
        }
        Any any = this.f18572OooO0oo;
        if ((any != null) != (location.f18572OooO0oo != null)) {
            return false;
        }
        return (!(any != null) || OooO0Oo().equals(location.OooO0Oo())) && this.unknownFields.equals(location.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18565OooOO0;
    }

    public final String getName() {
        Object obj = this.f18568OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18568OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Location> getParserForType() {
        return f18566OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f18568OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f18568OooO0Oo);
        for (Map.Entry<String, String> entry : OooO0o0().getMap().entrySet()) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, OooO0OO.f18578OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        if (this.f18572OooO0oo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, OooO0Oo());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18570OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f18570OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18569OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f18569OooO0o);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = OooO0O0().hashCode() + ((((OooO0OO().hashCode() + ((((getName().hashCode() + o0O0O0Oo.OooO00o.OooO00o(o00000O.f41330OooO0oO, 779, 37, 1, 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (!OooO0o0().getMap().isEmpty()) {
            iHashCode = OooO0o0().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 2, 53);
        }
        if (this.f18572OooO0oo != null) {
            iHashCode = OooO0Oo().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00000O.f41331OooO0oo.ensureFieldAccessorsInitialized(Location.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final MapField internalGetMapField(int i) {
        if (i == 2) {
            return OooO0o0();
        }
        throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18567OooO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18567OooO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18565OooOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Location();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18568OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18568OooO0Oo);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooO0o0(), OooO0OO.f18578OooO00o, 2);
        if (this.f18572OooO0oo != null) {
            codedOutputStream.writeMessage(3, OooO0Oo());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18570OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.f18570OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18569OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18569OooO0o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18565OooOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18565OooOO0.toBuilder();
    }

    private Location() {
        this.f18567OooO = (byte) -1;
        this.f18568OooO0Oo = "";
        this.f18570OooO0o0 = "";
        this.f18569OooO0o = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Location(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.f18568OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                if (!(z2 & true)) {
                                    this.f18571OooO0oO = MapField.newMapField(OooO0OO.f18578OooO00o);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f18578OooO00o.getParserForType(), extensionRegistryLite);
                                this.f18571OooO0oO.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            } else if (tag == 26) {
                                Any any = this.f18572OooO0oo;
                                Any.Builder builder = any != null ? any.toBuilder() : null;
                                Any any2 = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                this.f18572OooO0oo = any2;
                                if (builder != null) {
                                    builder.mergeFrom(any2);
                                    this.f18572OooO0oo = builder.buildPartial();
                                }
                            } else if (tag == 34) {
                                this.f18570OooO0o0 = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 42) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f18569OooO0o = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
