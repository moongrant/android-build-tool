package com.google.cloud.audit;

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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.rpc.Status;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000O00.o000000O;
import p320o0O0oo0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class AuditLog extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final AuditLog f18912OooOOoo = new AuditLog();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooO00o f18913OooOo00 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f18914OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18915OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18916OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18917OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ResourceLocation f18918OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Struct f18919OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Status f18920OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AuthenticationInfo f18921OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public List<AuthorizationInfo> f18922OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Struct f18923OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RequestMetadata f18924OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Struct f18925OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Struct f18926OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public byte f18927OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Any f18928OooOOo0;

    public static class OooO00o extends AbstractParser<AuditLog> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AuditLog(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Struct f18929OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18930OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18931OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18932OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18933OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ResourceLocation f18934OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f18935OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Status f18936OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public AuthenticationInfo f18937OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.OooO0O0, Object> f18938OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public List<AuthorizationInfo> f18939OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public RequestMetadata f18940OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Struct f18941OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public Struct f18942OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public Struct f18943OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public Any f18944OooOOoo;

        public OooO0O0() {
            this.f18932OooO0o0 = "";
            this.f18931OooO0o = "";
            this.f18933OooO0oO = "";
            this.f18939OooOOO0 = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final AuditLog buildPartial() {
            AuditLog auditLog = new AuditLog(this);
            auditLog.f18915OooO0Oo = this.f18932OooO0o0;
            auditLog.f18917OooO0o0 = this.f18931OooO0o;
            auditLog.f18916OooO0o = this.f18933OooO0oO;
            auditLog.f18918OooO0oO = this.f18934OooO0oo;
            auditLog.f18919OooO0oo = this.f18929OooO;
            auditLog.f18914OooO = this.f18935OooOO0;
            auditLog.f18920OooOO0 = this.f18936OooOO0O;
            auditLog.f18921OooOO0O = this.f18937OooOO0o;
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18938OooOOO;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18930OooO0Oo & 1) != 0) {
                    this.f18939OooOOO0 = Collections.unmodifiableList(this.f18939OooOOO0);
                    this.f18930OooO0Oo &= -2;
                }
                auditLog.f18922OooOO0o = this.f18939OooOOO0;
            } else {
                auditLog.f18922OooOO0o = repeatedFieldBuilderV3.build();
            }
            auditLog.f18924OooOOO0 = this.f18940OooOOOO;
            auditLog.f18923OooOOO = this.f18941OooOOOo;
            auditLog.f18925OooOOOO = this.f18943OooOOo0;
            auditLog.f18926OooOOOo = this.f18942OooOOo;
            auditLog.f18928OooOOo0 = this.f18944OooOOoo;
            onBuilt();
            return auditLog;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18932OooO0o0 = "";
            this.f18931OooO0o = "";
            this.f18933OooO0oO = "";
            this.f18934OooO0oo = null;
            this.f18929OooO = null;
            this.f18935OooOO0 = 0L;
            this.f18936OooOO0O = null;
            this.f18937OooOO0o = null;
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18938OooOOO;
            if (repeatedFieldBuilderV3 == null) {
                this.f18939OooOOO0 = Collections.emptyList();
                this.f18930OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.f18940OooOOOO = null;
            this.f18941OooOOOo = null;
            this.f18943OooOOo0 = null;
            this.f18942OooOOo = null;
            this.f18944OooOOoo = null;
        }

        public final RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.OooO0O0, Object> OooO0o() {
            if (this.f18938OooOOO == null) {
                this.f18938OooOOO = new RepeatedFieldBuilderV3<>(this.f18939OooOOO0, (this.f18930OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18939OooOOO0 = null;
            }
            return this.f18938OooOOO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(AuditLog auditLog) {
            if (auditLog == AuditLog.f18912OooOOoo) {
                return;
            }
            if (!auditLog.OooOO0o().isEmpty()) {
                this.f18932OooO0o0 = auditLog.f18915OooO0Oo;
                onChanged();
            }
            if (!auditLog.OooO0Oo().isEmpty()) {
                this.f18931OooO0o = auditLog.f18917OooO0o0;
                onChanged();
            }
            if (!auditLog.OooO0oo().isEmpty()) {
                this.f18933OooO0oO = auditLog.f18916OooO0o;
                onChanged();
            }
            if (auditLog.f18918OooO0oO != null) {
                ResourceLocation resourceLocationOooO0oO = auditLog.OooO0oO();
                ResourceLocation resourceLocation = this.f18934OooO0oo;
                if (resourceLocation != null) {
                    ResourceLocation.OooO0O0 builder = ResourceLocation.f18986OooO0oO.toBuilder();
                    builder.OooO0o(resourceLocation);
                    builder.OooO0o(resourceLocationOooO0oO);
                    this.f18934OooO0oo = builder.buildPartial();
                } else {
                    this.f18934OooO0oo = resourceLocationOooO0oO;
                }
                onChanged();
            }
            if (auditLog.f18919OooO0oo != null) {
                Struct structOooO = auditLog.OooO();
                Struct struct = this.f18929OooO;
                if (struct != null) {
                    this.f18929OooO = Struct.newBuilder(struct).mergeFrom(structOooO).buildPartial();
                } else {
                    this.f18929OooO = structOooO;
                }
                onChanged();
            }
            long j = auditLog.f18914OooO;
            if (j != 0) {
                this.f18935OooOO0 = j;
                onChanged();
            }
            if (auditLog.f18920OooOO0 != null) {
                Status statusOooOOO0 = auditLog.OooOOO0();
                Status status = this.f18936OooOO0O;
                if (status != null) {
                    Status.OooO0O0 builder2 = Status.f20924OooO0oo.toBuilder();
                    builder2.OooO0oO(status);
                    builder2.OooO0oO(statusOooOOO0);
                    this.f18936OooOO0O = builder2.buildPartial();
                } else {
                    this.f18936OooOO0O = statusOooOOO0;
                }
                onChanged();
            }
            if (auditLog.f18921OooOO0O != null) {
                AuthenticationInfo authenticationInfoOooO0O0 = auditLog.OooO0O0();
                AuthenticationInfo authenticationInfo = this.f18937OooOO0o;
                if (authenticationInfo != null) {
                    AuthenticationInfo.OooO0O0 builder3 = AuthenticationInfo.f18945OooOO0O.toBuilder();
                    builder3.OooO0oO(authenticationInfo);
                    builder3.OooO0oO(authenticationInfoOooO0O0);
                    this.f18937OooOO0o = builder3.buildPartial();
                } else {
                    this.f18937OooOO0o = authenticationInfoOooO0O0;
                }
                onChanged();
            }
            if (this.f18938OooOOO == null) {
                if (!auditLog.f18922OooOO0o.isEmpty()) {
                    if (this.f18939OooOOO0.isEmpty()) {
                        this.f18939OooOOO0 = auditLog.f18922OooOO0o;
                        this.f18930OooO0Oo &= -2;
                    } else {
                        if ((this.f18930OooO0Oo & 1) == 0) {
                            this.f18939OooOOO0 = new ArrayList(this.f18939OooOOO0);
                            this.f18930OooO0Oo |= 1;
                        }
                        this.f18939OooOOO0.addAll(auditLog.f18922OooOO0o);
                    }
                    onChanged();
                }
            } else if (!auditLog.f18922OooOO0o.isEmpty()) {
                if (this.f18938OooOOO.isEmpty()) {
                    this.f18938OooOOO.dispose();
                    this.f18938OooOOO = null;
                    this.f18939OooOOO0 = auditLog.f18922OooOO0o;
                    this.f18930OooO0Oo &= -2;
                    this.f18938OooOOO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18938OooOOO.addAllMessages(auditLog.f18922OooOO0o);
                }
            }
            if (auditLog.f18924OooOOO0 != null) {
                RequestMetadata requestMetadataOooO0o = auditLog.OooO0o();
                RequestMetadata requestMetadata = this.f18940OooOOOO;
                if (requestMetadata != null) {
                    RequestMetadata.OooO0O0 builder4 = RequestMetadata.f18973OooOO0.toBuilder();
                    builder4.OooO0o(requestMetadata);
                    builder4.OooO0o(requestMetadataOooO0o);
                    this.f18940OooOOOO = builder4.buildPartial();
                } else {
                    this.f18940OooOOOO = requestMetadataOooO0o;
                }
                onChanged();
            }
            if (auditLog.f18923OooOOO != null) {
                Struct structOooO0o0 = auditLog.OooO0o0();
                Struct struct2 = this.f18941OooOOOo;
                if (struct2 != null) {
                    this.f18941OooOOOo = Struct.newBuilder(struct2).mergeFrom(structOooO0o0).buildPartial();
                } else {
                    this.f18941OooOOOo = structOooO0o0;
                }
                onChanged();
            }
            if (auditLog.f18925OooOOOO != null) {
                Struct structOooOO0 = auditLog.OooOO0();
                Struct struct3 = this.f18943OooOOo0;
                if (struct3 != null) {
                    this.f18943OooOOo0 = Struct.newBuilder(struct3).mergeFrom(structOooOO0).buildPartial();
                } else {
                    this.f18943OooOOo0 = structOooOO0;
                }
                onChanged();
            }
            if (auditLog.f18926OooOOOo != null) {
                Struct structOooO0OO = auditLog.OooO0OO();
                Struct struct4 = this.f18942OooOOo;
                if (struct4 != null) {
                    this.f18942OooOOo = Struct.newBuilder(struct4).mergeFrom(structOooO0OO).buildPartial();
                } else {
                    this.f18942OooOOo = structOooO0OO;
                }
                onChanged();
            }
            if (auditLog.f18928OooOOo0 != null) {
                Any anyOooOO0O = auditLog.OooOO0O();
                Any any = this.f18944OooOOoo;
                if (any != null) {
                    this.f18944OooOOoo = Any.newBuilder(any).mergeFrom(anyOooOO0O).buildPartial();
                } else {
                    this.f18944OooOOoo = anyOooOO0O;
                }
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AuditLog auditLog;
            try {
                try {
                    AuditLog.f18913OooOo00.getClass();
                    OooO0oO(new AuditLog(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    auditLog = (AuditLog) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (auditLog != null) {
                            OooO0oO(auditLog);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                auditLog = null;
                if (auditLog != null) {
                    OooO0oO(auditLog);
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
            AuditLog auditLogBuildPartial = buildPartial();
            if (auditLogBuildPartial.isInitialized()) {
                return auditLogBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) auditLogBuildPartial);
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
            return AuditLog.f18912OooOOoo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0O0O0o0.OooO00o.f41925OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0O0O0o0.OooO00o.f41926OooO0O0.ensureFieldAccessorsInitialized(AuditLog.class, OooO0O0.class);
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
            return AuditLog.f18912OooOOoo;
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
            AuditLog auditLogBuildPartial = buildPartial();
            if (auditLogBuildPartial.isInitialized()) {
                return auditLogBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) auditLogBuildPartial);
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
            if (message instanceof AuditLog) {
                OooO0oO((AuditLog) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18932OooO0o0 = "";
            this.f18931OooO0o = "";
            this.f18933OooO0oO = "";
            this.f18939OooOOO0 = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof AuditLog) {
                OooO0oO((AuditLog) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public AuditLog(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18927OooOOo = (byte) -1;
    }

    public final Struct OooO() {
        Struct struct = this.f18919OooO0oo;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public final AuthenticationInfo OooO0O0() {
        AuthenticationInfo authenticationInfo = this.f18921OooOO0O;
        return authenticationInfo == null ? AuthenticationInfo.f18945OooOO0O : authenticationInfo;
    }

    public final Struct OooO0OO() {
        Struct struct = this.f18926OooOOOo;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public final String OooO0Oo() {
        Object obj = this.f18917OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18917OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    public final RequestMetadata OooO0o() {
        RequestMetadata requestMetadata = this.f18924OooOOO0;
        return requestMetadata == null ? RequestMetadata.f18973OooOO0 : requestMetadata;
    }

    public final Struct OooO0o0() {
        Struct struct = this.f18923OooOOO;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public final ResourceLocation OooO0oO() {
        ResourceLocation resourceLocation = this.f18918OooO0oO;
        return resourceLocation == null ? ResourceLocation.f18986OooO0oO : resourceLocation;
    }

    public final String OooO0oo() {
        Object obj = this.f18916OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18916OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final Struct OooOO0() {
        Struct struct = this.f18925OooOOOO;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Deprecated
    public final Any OooOO0O() {
        Any any = this.f18928OooOOo0;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public final String OooOO0o() {
        Object obj = this.f18915OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18915OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18912OooOOoo) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oO(this);
        return oooO0O0;
    }

    public final Status OooOOO0() {
        Status status = this.f18920OooOO0;
        return status == null ? Status.f20924OooO0oo : status;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuditLog)) {
            return super.equals(obj);
        }
        AuditLog auditLog = (AuditLog) obj;
        if (!OooOO0o().equals(auditLog.OooOO0o()) || !OooO0Oo().equals(auditLog.OooO0Oo()) || !OooO0oo().equals(auditLog.OooO0oo())) {
            return false;
        }
        ResourceLocation resourceLocation = this.f18918OooO0oO;
        if ((resourceLocation != null) != (auditLog.f18918OooO0oO != null)) {
            return false;
        }
        if ((resourceLocation != null) && !OooO0oO().equals(auditLog.OooO0oO())) {
            return false;
        }
        Struct struct = this.f18919OooO0oo;
        if ((struct != null) != (auditLog.f18919OooO0oo != null)) {
            return false;
        }
        if (((struct != null) && !OooO().equals(auditLog.OooO())) || this.f18914OooO != auditLog.f18914OooO) {
            return false;
        }
        Status status = this.f18920OooOO0;
        if ((status != null) != (auditLog.f18920OooOO0 != null)) {
            return false;
        }
        if ((status != null) && !OooOOO0().equals(auditLog.OooOOO0())) {
            return false;
        }
        AuthenticationInfo authenticationInfo = this.f18921OooOO0O;
        if ((authenticationInfo != null) != (auditLog.f18921OooOO0O != null)) {
            return false;
        }
        if (((authenticationInfo != null) && !OooO0O0().equals(auditLog.OooO0O0())) || !this.f18922OooOO0o.equals(auditLog.f18922OooOO0o)) {
            return false;
        }
        RequestMetadata requestMetadata = this.f18924OooOOO0;
        if ((requestMetadata != null) != (auditLog.f18924OooOOO0 != null)) {
            return false;
        }
        if ((requestMetadata != null) && !OooO0o().equals(auditLog.OooO0o())) {
            return false;
        }
        Struct struct2 = this.f18923OooOOO;
        if ((struct2 != null) != (auditLog.f18923OooOOO != null)) {
            return false;
        }
        if ((struct2 != null) && !OooO0o0().equals(auditLog.OooO0o0())) {
            return false;
        }
        Struct struct3 = this.f18925OooOOOO;
        if ((struct3 != null) != (auditLog.f18925OooOOOO != null)) {
            return false;
        }
        if ((struct3 != null) && !OooOO0().equals(auditLog.OooOO0())) {
            return false;
        }
        Struct struct4 = this.f18926OooOOOo;
        if ((struct4 != null) != (auditLog.f18926OooOOOo != null)) {
            return false;
        }
        if ((struct4 != null) && !OooO0OO().equals(auditLog.OooO0OO())) {
            return false;
        }
        Any any = this.f18928OooOOo0;
        if ((any != null) != (auditLog.f18928OooOOo0 != null)) {
            return false;
        }
        return (!(any != null) || OooOO0O().equals(auditLog.OooOO0O())) && this.unknownFields.equals(auditLog.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18912OooOOoo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<AuditLog> getParserForType() {
        return f18913OooOo00;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = this.f18920OooOO0 != null ? CodedOutputStream.computeMessageSize(2, OooOOO0()) + 0 : 0;
        if (this.f18921OooOO0O != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, OooO0O0());
        }
        if (this.f18924OooOOO0 != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, OooO0o());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18915OooO0Oo)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(7, this.f18915OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18917OooO0o0)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(8, this.f18917OooO0o0);
        }
        for (int i2 = 0; i2 < this.f18922OooOO0o.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(9, this.f18922OooOO0o.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18916OooO0o)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(11, this.f18916OooO0o);
        }
        long j = this.f18914OooO;
        if (j != 0) {
            iComputeMessageSize += CodedOutputStream.computeInt64Size(12, j);
        }
        if (this.f18928OooOOo0 != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(15, OooOO0O());
        }
        if (this.f18923OooOOO != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(16, OooO0o0());
        }
        if (this.f18925OooOOOO != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(17, OooOO0());
        }
        if (this.f18926OooOOOo != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(18, OooO0OO());
        }
        if (this.f18919OooO0oo != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(19, OooO());
        }
        if (this.f18918OooO0oO != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(20, OooO0oO());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
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
        int iHashCode = OooO0oo().hashCode() + ((((OooO0Oo().hashCode() + ((((OooOO0o().hashCode() + o000Oo0.OooO00o(o0O0O0o0.OooO00o.f41925OooO00o, 779, 37, 7, 53)) * 37) + 8) * 53)) * 37) + 11) * 53);
        if (this.f18918OooO0oO != null) {
            iHashCode = OooO0oO().hashCode() + o000000O.OooO00o(iHashCode, 37, 20, 53);
        }
        if (this.f18919OooO0oo != null) {
            iHashCode = OooO().hashCode() + o000000O.OooO00o(iHashCode, 37, 19, 53);
        }
        int iHashLong = Internal.hashLong(this.f18914OooO) + o000000O.OooO00o(iHashCode, 37, 12, 53);
        if (this.f18920OooOO0 != null) {
            iHashLong = OooOOO0().hashCode() + o000000O.OooO00o(iHashLong, 37, 2, 53);
        }
        if (this.f18921OooOO0O != null) {
            iHashLong = OooO0O0().hashCode() + o000000O.OooO00o(iHashLong, 37, 3, 53);
        }
        if (this.f18922OooOO0o.size() > 0) {
            iHashLong = this.f18922OooOO0o.hashCode() + o000000O.OooO00o(iHashLong, 37, 9, 53);
        }
        if (this.f18924OooOOO0 != null) {
            iHashLong = OooO0o().hashCode() + o000000O.OooO00o(iHashLong, 37, 4, 53);
        }
        if (this.f18923OooOOO != null) {
            iHashLong = OooO0o0().hashCode() + o000000O.OooO00o(iHashLong, 37, 16, 53);
        }
        if (this.f18925OooOOOO != null) {
            iHashLong = OooOO0().hashCode() + o000000O.OooO00o(iHashLong, 37, 17, 53);
        }
        if (this.f18926OooOOOo != null) {
            iHashLong = OooO0OO().hashCode() + o000000O.OooO00o(iHashLong, 37, 18, 53);
        }
        if (this.f18928OooOOo0 != null) {
            iHashLong = OooOO0O().hashCode() + o000000O.OooO00o(iHashLong, 37, 15, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashLong * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0O0O0o0.OooO00o.f41926OooO0O0.ensureFieldAccessorsInitialized(AuditLog.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18927OooOOo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18927OooOOo = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18912OooOOoo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuditLog();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18920OooOO0 != null) {
            codedOutputStream.writeMessage(2, OooOOO0());
        }
        if (this.f18921OooOO0O != null) {
            codedOutputStream.writeMessage(3, OooO0O0());
        }
        if (this.f18924OooOOO0 != null) {
            codedOutputStream.writeMessage(4, OooO0o());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18915OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.f18915OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18917OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.f18917OooO0o0);
        }
        for (int i = 0; i < this.f18922OooOO0o.size(); i++) {
            codedOutputStream.writeMessage(9, this.f18922OooOO0o.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18916OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.f18916OooO0o);
        }
        long j = this.f18914OooO;
        if (j != 0) {
            codedOutputStream.writeInt64(12, j);
        }
        if (this.f18928OooOOo0 != null) {
            codedOutputStream.writeMessage(15, OooOO0O());
        }
        if (this.f18923OooOOO != null) {
            codedOutputStream.writeMessage(16, OooO0o0());
        }
        if (this.f18925OooOOOO != null) {
            codedOutputStream.writeMessage(17, OooOO0());
        }
        if (this.f18926OooOOOo != null) {
            codedOutputStream.writeMessage(18, OooO0OO());
        }
        if (this.f18919OooO0oo != null) {
            codedOutputStream.writeMessage(19, OooO());
        }
        if (this.f18918OooO0oO != null) {
            codedOutputStream.writeMessage(20, OooO0oO());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18912OooOOoo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18912OooOOoo.toBuilder();
    }

    private AuditLog() {
        this.f18927OooOOo = (byte) -1;
        this.f18915OooO0Oo = "";
        this.f18917OooO0o0 = "";
        this.f18916OooO0o = "";
        this.f18922OooOO0o = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public AuditLog(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        switch (tag) {
                            case 0:
                                break;
                            case 18:
                                Status status = this.f18920OooOO0;
                                Status.OooO0O0 builder = status != null ? status.toBuilder() : null;
                                Status status2 = (Status) codedInputStream.readMessage(Status.f20923OooO, extensionRegistryLite);
                                this.f18920OooOO0 = status2;
                                if (builder != null) {
                                    builder.OooO0oO(status2);
                                    this.f18920OooOO0 = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 26:
                                AuthenticationInfo authenticationInfo = this.f18921OooOO0O;
                                AuthenticationInfo.OooO0O0 builder2 = authenticationInfo != null ? authenticationInfo.toBuilder() : null;
                                AuthenticationInfo authenticationInfo2 = (AuthenticationInfo) codedInputStream.readMessage(AuthenticationInfo.f18946OooOO0o, extensionRegistryLite);
                                this.f18921OooOO0O = authenticationInfo2;
                                if (builder2 != null) {
                                    builder2.OooO0oO(authenticationInfo2);
                                    this.f18921OooOO0O = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 34:
                                RequestMetadata requestMetadata = this.f18924OooOOO0;
                                RequestMetadata.OooO0O0 builder3 = requestMetadata != null ? requestMetadata.toBuilder() : null;
                                RequestMetadata requestMetadata2 = (RequestMetadata) codedInputStream.readMessage(RequestMetadata.f18974OooOO0O, extensionRegistryLite);
                                this.f18924OooOOO0 = requestMetadata2;
                                if (builder3 != null) {
                                    builder3.OooO0o(requestMetadata2);
                                    this.f18924OooOOO0 = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 58:
                                this.f18915OooO0Oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 66:
                                this.f18917OooO0o0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 74:
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.f18922OooOO0o = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f18922OooOO0o.add((AuthorizationInfo) codedInputStream.readMessage(AuthorizationInfo.f18963OooOO0, extensionRegistryLite));
                                continue;
                            case 90:
                                this.f18916OooO0o = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 96:
                                this.f18914OooO = codedInputStream.readInt64();
                                continue;
                            case 122:
                                Any any = this.f18928OooOOo0;
                                Any.Builder builder4 = any != null ? any.toBuilder() : null;
                                Any any2 = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                this.f18928OooOOo0 = any2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(any2);
                                    this.f18928OooOOo0 = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED /* 130 */:
                                Struct struct = this.f18923OooOOO;
                                Struct.Builder builder5 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.f18923OooOOO = struct2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(struct2);
                                    this.f18923OooOOO = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 138:
                                Struct struct3 = this.f18925OooOOOO;
                                Struct.Builder builder6 = struct3 != null ? struct3.toBuilder() : null;
                                Struct struct4 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.f18925OooOOOO = struct4;
                                if (builder6 != null) {
                                    builder6.mergeFrom(struct4);
                                    this.f18925OooOOOO = builder6.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 146:
                                Struct struct5 = this.f18926OooOOOo;
                                Struct.Builder builder7 = struct5 != null ? struct5.toBuilder() : null;
                                Struct struct6 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.f18926OooOOOo = struct6;
                                if (builder7 != null) {
                                    builder7.mergeFrom(struct6);
                                    this.f18926OooOOOo = builder7.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR /* 154 */:
                                Struct struct7 = this.f18919OooO0oo;
                                Struct.Builder builder8 = struct7 != null ? struct7.toBuilder() : null;
                                Struct struct8 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.f18919OooO0oo = struct8;
                                if (builder8 != null) {
                                    builder8.mergeFrom(struct8);
                                    this.f18919OooO0oo = builder8.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 162:
                                ResourceLocation resourceLocation = this.f18918OooO0oO;
                                ResourceLocation.OooO0O0 builder9 = resourceLocation != null ? resourceLocation.toBuilder() : null;
                                ResourceLocation resourceLocation2 = (ResourceLocation) codedInputStream.readMessage(ResourceLocation.f18987OooO0oo, extensionRegistryLite);
                                this.f18918OooO0oO = resourceLocation2;
                                if (builder9 != null) {
                                    builder9.OooO0o(resourceLocation2);
                                    this.f18918OooO0oO = builder9.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (UninitializedMessageException e3) {
                    throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((z2 ? 1 : 0) & true) {
                    this.f18922OooOO0o = Collections.unmodifiableList(this.f18922OooOO0o);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((z2 ? 1 : 0) & true) {
            this.f18922OooOO0o = Collections.unmodifiableList(this.f18922OooOO0o);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
