package messages;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class Message {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Descriptors.Descriptor f33081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f33082OooO0O0;

    public static final class MessageDyToppedAndRemove extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final MessageDyToppedAndRemove f33083OooOO0 = new MessageDyToppedAndRemove();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f33084OooOO0O = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte f33085OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f33086OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public volatile Object f33087OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f33088OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile Object f33089OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f33090OooO0oo;

        public class OooO00o extends AbstractParser<MessageDyToppedAndRemove> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MessageDyToppedAndRemove(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f33091OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Object f33092OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f33093OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f33094OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public long f33095OooO0oo;

            public OooO0O0() {
                this.f33093OooO0o0 = "";
                this.f33092OooO0o = "";
                this.f33094OooO0oO = "";
                MessageDyToppedAndRemove messageDyToppedAndRemove = MessageDyToppedAndRemove.f33083OooOO0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final MessageDyToppedAndRemove buildPartial() {
                MessageDyToppedAndRemove messageDyToppedAndRemove = new MessageDyToppedAndRemove(this);
                messageDyToppedAndRemove.f33086OooO0Oo = this.f33091OooO0Oo;
                messageDyToppedAndRemove.f33088OooO0o0 = this.f33093OooO0o0;
                messageDyToppedAndRemove.f33087OooO0o = this.f33092OooO0o;
                messageDyToppedAndRemove.f33089OooO0oO = this.f33094OooO0oO;
                messageDyToppedAndRemove.f33090OooO0oo = this.f33095OooO0oo;
                onBuilt();
                return messageDyToppedAndRemove;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f33091OooO0Oo = 0L;
                this.f33093OooO0o0 = "";
                this.f33092OooO0o = "";
                this.f33094OooO0oO = "";
                this.f33095OooO0oo = 0L;
            }

            public final void OooO0o(MessageDyToppedAndRemove messageDyToppedAndRemove) {
                if (messageDyToppedAndRemove == MessageDyToppedAndRemove.f33083OooOO0) {
                    return;
                }
                long j = messageDyToppedAndRemove.f33086OooO0Oo;
                if (j != 0) {
                    this.f33091OooO0Oo = j;
                    onChanged();
                }
                if (!messageDyToppedAndRemove.OooO0O0().isEmpty()) {
                    this.f33093OooO0o0 = messageDyToppedAndRemove.f33088OooO0o0;
                    onChanged();
                }
                if (!messageDyToppedAndRemove.OooO0OO().isEmpty()) {
                    this.f33092OooO0o = messageDyToppedAndRemove.f33087OooO0o;
                    onChanged();
                }
                if (!messageDyToppedAndRemove.getCircleName().isEmpty()) {
                    this.f33094OooO0oO = messageDyToppedAndRemove.f33089OooO0oO;
                    onChanged();
                }
                long j2 = messageDyToppedAndRemove.f33090OooO0oo;
                if (j2 != 0) {
                    this.f33095OooO0oo = j2;
                    onChanged();
                }
                onChanged();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4023clone() {
                return (OooO0O0) super.mo4023clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MessageDyToppedAndRemove messageDyToppedAndRemove;
                try {
                    try {
                        MessageDyToppedAndRemove.f33084OooOO0O.getClass();
                        OooO0o(new MessageDyToppedAndRemove(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        messageDyToppedAndRemove = (MessageDyToppedAndRemove) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (messageDyToppedAndRemove != null) {
                                OooO0o(messageDyToppedAndRemove);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    messageDyToppedAndRemove = null;
                    if (messageDyToppedAndRemove != null) {
                        OooO0o(messageDyToppedAndRemove);
                    }
                    throw th;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message build() {
                MessageDyToppedAndRemove messageDyToppedAndRemoveBuildPartial = buildPartial();
                if (messageDyToppedAndRemoveBuildPartial.isInitialized()) {
                    return messageDyToppedAndRemoveBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((com.google.protobuf.Message) messageDyToppedAndRemoveBuildPartial);
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
            public final com.google.protobuf.Message getDefaultInstanceForType() {
                return MessageDyToppedAndRemove.f33083OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return Message.f33081OooO00o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Message.f33082OooO0O0.ensureFieldAccessorsInitialized(MessageDyToppedAndRemove.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oO(codedInputStream, extensionRegistryLite);
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
            public final com.google.protobuf.Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (OooO0O0) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (OooO0O0) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return MessageDyToppedAndRemove.f33083OooOO0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oO(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0O0) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (OooO0O0) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (OooO0O0) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oO(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                MessageDyToppedAndRemove messageDyToppedAndRemoveBuildPartial = buildPartial();
                if (messageDyToppedAndRemoveBuildPartial.isInitialized()) {
                    return messageDyToppedAndRemoveBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((com.google.protobuf.Message) messageDyToppedAndRemoveBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oO(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(com.google.protobuf.Message message) {
                if (message instanceof MessageDyToppedAndRemove) {
                    OooO0o((MessageDyToppedAndRemove) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f33093OooO0o0 = "";
                this.f33092OooO0o = "";
                this.f33094OooO0oO = "";
                MessageDyToppedAndRemove messageDyToppedAndRemove = MessageDyToppedAndRemove.f33083OooOO0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final com.google.protobuf.Message.Builder mergeFrom(com.google.protobuf.Message message) {
                if (message instanceof MessageDyToppedAndRemove) {
                    OooO0o((MessageDyToppedAndRemove) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public MessageDyToppedAndRemove(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f33085OooO = (byte) -1;
        }

        public final String OooO0O0() {
            Object obj = this.f33088OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f33088OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0OO() {
            Object obj = this.f33087OooO0o;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f33087OooO0o = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f33083OooOO0) {
                return new OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0o(this);
            return oooO0O0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MessageDyToppedAndRemove)) {
                return super.equals(obj);
            }
            MessageDyToppedAndRemove messageDyToppedAndRemove = (MessageDyToppedAndRemove) obj;
            return this.f33086OooO0Oo == messageDyToppedAndRemove.f33086OooO0Oo && OooO0O0().equals(messageDyToppedAndRemove.OooO0O0()) && OooO0OO().equals(messageDyToppedAndRemove.OooO0OO()) && getCircleName().equals(messageDyToppedAndRemove.getCircleName()) && this.f33090OooO0oo == messageDyToppedAndRemove.f33090OooO0oo && this.unknownFields.equals(messageDyToppedAndRemove.unknownFields);
        }

        public final String getCircleName() {
            Object obj = this.f33089OooO0oO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f33089OooO0oO = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final com.google.protobuf.Message getDefaultInstanceForType() {
            return f33083OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<MessageDyToppedAndRemove> getParserForType() {
            return f33084OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.f33086OooO0Oo;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.f33088OooO0o0)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(2, this.f33088OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f33087OooO0o)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(3, this.f33087OooO0o);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f33089OooO0oO)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(4, this.f33089OooO0oO);
            }
            long j2 = this.f33090OooO0oo;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(5, j2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
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
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(this.f33090OooO0oo) + ((((getCircleName().hashCode() + ((((OooO0OO().hashCode() + ((((OooO0O0().hashCode() + ((((Internal.hashLong(this.f33086OooO0Oo) + o0O0O0Oo.OooO00o.OooO00o(Message.f33081OooO00o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Message.f33082OooO0O0.ensureFieldAccessorsInitialized(MessageDyToppedAndRemove.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f33085OooO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f33085OooO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final com.google.protobuf.Message.Builder newBuilderForType() {
            return f33083OooOO0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MessageDyToppedAndRemove();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.f33086OooO0Oo;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f33088OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f33088OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f33087OooO0o)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f33087OooO0o);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f33089OooO0oO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f33089OooO0oO);
            }
            long j2 = this.f33090OooO0oo;
            if (j2 != 0) {
                codedOutputStream.writeInt64(5, j2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f33083OooOO0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f33083OooOO0.toBuilder();
        }

        private MessageDyToppedAndRemove() {
            this.f33085OooO = (byte) -1;
            this.f33088OooO0o0 = "";
            this.f33087OooO0o = "";
            this.f33089OooO0oO = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final com.google.protobuf.Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public MessageDyToppedAndRemove(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f33086OooO0Oo = codedInputStream.readInt64();
                                } else if (tag == 18) {
                                    this.f33088OooO0o0 = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 26) {
                                    this.f33087OooO0o = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 34) {
                                    this.f33089OooO0oO = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 40) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f33090OooO0oo = codedInputStream.readInt64();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
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

    static {
        Descriptors.Descriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rmessage.proto\u0012\bmessages\"p\n\u0018MessageDyToppedAndRemove\u0012\u0010\n\bobjectId\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005dyImg\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007hostImg\u0018\u0003 \u0001(\t\u0012\u0012\n\ncircleName\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006hostId\u0018\u0005 \u0001(\u0003B\u0005ª\u0002\u0002Pbb\u0006proto3"}, new Descriptors.FileDescriptor[0]).getMessageTypes().get(0);
        f33081OooO00o = descriptor;
        f33082OooO0O0 = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"ObjectId", "DyImg", "HostImg", "CircleName", "HostId"});
    }
}
