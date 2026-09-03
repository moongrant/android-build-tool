package com.google.logging.type;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import o000O00.o000000O;
import p069o0000ooO.o000000;
import p317o0O0oo.o0OOO0o;
import p320o0O0oo0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpRequest extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f20718OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f20719OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f20720OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f20721OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f20722OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f20723OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile Object f20724OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile Object f20725OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile Object f20726OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f20727OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Duration f20728OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f20729OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f20730OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile Object f20731OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f20732OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public byte f20733OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final HttpRequest f20717OooOo00 = new HttpRequest();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final OooO00o f20716OooOo0 = new OooO00o();

    public static class OooO00o extends AbstractParser<HttpRequest> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new HttpRequest(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f20734OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f20735OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f20736OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f20737OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f20738OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f20739OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f20740OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f20741OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f20742OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f20743OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Duration f20744OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f20745OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f20746OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public Object f20747OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public long f20748OooOOo0;

        public OooO0O0() {
            this.f20735OooO0Oo = "";
            this.f20737OooO0o0 = "";
            this.f20734OooO = "";
            this.f20740OooOO0 = "";
            this.f20741OooOO0O = "";
            this.f20742OooOO0o = "";
            this.f20747OooOOo = "";
            HttpRequest httpRequest = HttpRequest.f20717OooOo00;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final HttpRequest buildPartial() {
            HttpRequest httpRequest = new HttpRequest(this);
            httpRequest.f20719OooO0Oo = this.f20735OooO0Oo;
            httpRequest.f20721OooO0o0 = this.f20737OooO0o0;
            httpRequest.f20720OooO0o = this.f20736OooO0o;
            httpRequest.f20722OooO0oO = this.f20738OooO0oO;
            httpRequest.f20723OooO0oo = this.f20739OooO0oo;
            httpRequest.f20718OooO = this.f20734OooO;
            httpRequest.f20724OooOO0 = this.f20740OooOO0;
            httpRequest.f20725OooOO0O = this.f20741OooOO0O;
            httpRequest.f20726OooOO0o = this.f20742OooOO0o;
            httpRequest.f20728OooOOO0 = this.f20744OooOOO0;
            httpRequest.f20727OooOOO = this.f20743OooOOO;
            httpRequest.f20729OooOOOO = this.f20745OooOOOO;
            httpRequest.f20730OooOOOo = this.f20746OooOOOo;
            httpRequest.f20732OooOOo0 = this.f20748OooOOo0;
            httpRequest.f20731OooOOo = this.f20747OooOOo;
            onBuilt();
            return httpRequest;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f20735OooO0Oo = "";
            this.f20737OooO0o0 = "";
            this.f20736OooO0o = 0L;
            this.f20738OooO0oO = 0;
            this.f20739OooO0oo = 0L;
            this.f20734OooO = "";
            this.f20740OooOO0 = "";
            this.f20741OooOO0O = "";
            this.f20742OooOO0o = "";
            this.f20744OooOOO0 = null;
            this.f20743OooOOO = false;
            this.f20745OooOOOO = false;
            this.f20746OooOOOo = false;
            this.f20748OooOOo0 = 0L;
            this.f20747OooOOo = "";
        }

        public final void OooO0o(HttpRequest httpRequest) {
            if (httpRequest == HttpRequest.f20717OooOo00) {
                return;
            }
            if (!httpRequest.OooO0o().isEmpty()) {
                this.f20735OooO0Oo = httpRequest.f20719OooO0Oo;
                onChanged();
            }
            if (!httpRequest.OooO0oO().isEmpty()) {
                this.f20737OooO0o0 = httpRequest.f20721OooO0o0;
                onChanged();
            }
            long j = httpRequest.f20720OooO0o;
            if (j != 0) {
                this.f20736OooO0o = j;
                onChanged();
            }
            int i = httpRequest.f20722OooO0oO;
            if (i != 0) {
                this.f20738OooO0oO = i;
                onChanged();
            }
            long j2 = httpRequest.f20723OooO0oo;
            if (j2 != 0) {
                this.f20739OooO0oo = j2;
                onChanged();
            }
            if (!httpRequest.OooO().isEmpty()) {
                this.f20734OooO = httpRequest.f20718OooO;
                onChanged();
            }
            if (!httpRequest.OooO0o0().isEmpty()) {
                this.f20740OooOO0 = httpRequest.f20724OooOO0;
                onChanged();
            }
            if (!httpRequest.OooO0oo().isEmpty()) {
                this.f20741OooOO0O = httpRequest.f20725OooOO0O;
                onChanged();
            }
            if (!httpRequest.OooO0Oo().isEmpty()) {
                this.f20742OooOO0o = httpRequest.f20726OooOO0o;
                onChanged();
            }
            if (httpRequest.f20728OooOOO0 != null) {
                Duration durationOooO0O0 = httpRequest.OooO0O0();
                Duration duration = this.f20744OooOOO0;
                if (duration != null) {
                    this.f20744OooOOO0 = Duration.newBuilder(duration).mergeFrom(durationOooO0O0).buildPartial();
                } else {
                    this.f20744OooOOO0 = durationOooO0O0;
                }
                onChanged();
            }
            boolean z = httpRequest.f20727OooOOO;
            if (z) {
                this.f20743OooOOO = z;
                onChanged();
            }
            boolean z2 = httpRequest.f20729OooOOOO;
            if (z2) {
                this.f20745OooOOOO = z2;
                onChanged();
            }
            boolean z3 = httpRequest.f20730OooOOOo;
            if (z3) {
                this.f20746OooOOOo = z3;
                onChanged();
            }
            long j3 = httpRequest.f20732OooOOo0;
            if (j3 != 0) {
                this.f20748OooOOo0 = j3;
                onChanged();
            }
            if (!httpRequest.OooO0OO().isEmpty()) {
                this.f20747OooOOo = httpRequest.f20731OooOOo;
                onChanged();
            }
            onChanged();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            HttpRequest httpRequest;
            try {
                try {
                    HttpRequest.f20716OooOo0.getClass();
                    OooO0o(new HttpRequest(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    httpRequest = (HttpRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (httpRequest != null) {
                            OooO0o(httpRequest);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                httpRequest = null;
                if (httpRequest != null) {
                    OooO0o(httpRequest);
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
            HttpRequest httpRequestBuildPartial = buildPartial();
            if (httpRequestBuildPartial.isInitialized()) {
                return httpRequestBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) httpRequestBuildPartial);
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
            return HttpRequest.f20717OooOo00;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0OOO0o.f42599OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0OOO0o.f42600OooO0O0.ensureFieldAccessorsInitialized(HttpRequest.class, OooO0O0.class);
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
            return HttpRequest.f20717OooOo00;
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
            OooO0oO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            HttpRequest httpRequestBuildPartial = buildPartial();
            if (httpRequestBuildPartial.isInitialized()) {
                return httpRequestBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) httpRequestBuildPartial);
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
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof HttpRequest) {
                OooO0o((HttpRequest) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof HttpRequest) {
                OooO0o((HttpRequest) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f20735OooO0Oo = "";
            this.f20737OooO0o0 = "";
            this.f20734OooO = "";
            this.f20740OooOO0 = "";
            this.f20741OooOO0O = "";
            this.f20742OooOO0o = "";
            this.f20747OooOOo = "";
            HttpRequest httpRequest = HttpRequest.f20717OooOo00;
        }
    }

    public HttpRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f20733OooOOoo = (byte) -1;
    }

    public final String OooO() {
        Object obj = this.f20718OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20718OooO = stringUtf8;
        return stringUtf8;
    }

    public final Duration OooO0O0() {
        Duration duration = this.f20728OooOOO0;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public final String OooO0OO() {
        Object obj = this.f20731OooOOo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20731OooOOo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f20726OooOO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20726OooOO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o() {
        Object obj = this.f20719OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20719OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o0() {
        Object obj = this.f20724OooOO0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20724OooOO0 = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0oO() {
        Object obj = this.f20721OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20721OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0oo() {
        Object obj = this.f20725OooOO0O;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20725OooOO0O = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f20717OooOo00) {
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
        if (!(obj instanceof HttpRequest)) {
            return super.equals(obj);
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (!OooO0o().equals(httpRequest.OooO0o()) || !OooO0oO().equals(httpRequest.OooO0oO()) || this.f20720OooO0o != httpRequest.f20720OooO0o || this.f20722OooO0oO != httpRequest.f20722OooO0oO || this.f20723OooO0oo != httpRequest.f20723OooO0oo || !OooO().equals(httpRequest.OooO()) || !OooO0o0().equals(httpRequest.OooO0o0()) || !OooO0oo().equals(httpRequest.OooO0oo()) || !OooO0Oo().equals(httpRequest.OooO0Oo())) {
            return false;
        }
        Duration duration = this.f20728OooOOO0;
        if ((duration != null) != (httpRequest.f20728OooOOO0 != null)) {
            return false;
        }
        return (!(duration != null) || OooO0O0().equals(httpRequest.OooO0O0())) && this.f20727OooOOO == httpRequest.f20727OooOOO && this.f20729OooOOOO == httpRequest.f20729OooOOOO && this.f20730OooOOOo == httpRequest.f20730OooOOOo && this.f20732OooOOo0 == httpRequest.f20732OooOOo0 && OooO0OO().equals(httpRequest.OooO0OO()) && this.unknownFields.equals(httpRequest.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f20717OooOo00;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<HttpRequest> getParserForType() {
        return f20716OooOo0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20719OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20719OooO0Oo);
        if (!GeneratedMessageV3.isStringEmpty(this.f20721OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f20721OooO0o0);
        }
        long j = this.f20720OooO0o;
        if (j != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(3, j);
        }
        int i2 = this.f20722OooO0oO;
        if (i2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(4, i2);
        }
        long j2 = this.f20723OooO0oo;
        if (j2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(5, j2);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20718OooO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f20718OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20724OooOO0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f20724OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20726OooOO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f20726OooOO0o);
        }
        boolean z = this.f20729OooOOOO;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(9, z);
        }
        boolean z2 = this.f20730OooOOOo;
        if (z2) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(10, z2);
        }
        boolean z3 = this.f20727OooOOO;
        if (z3) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(11, z3);
        }
        long j3 = this.f20732OooOOo0;
        if (j3 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(12, j3);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20725OooOO0O)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(13, this.f20725OooOO0O);
        }
        if (this.f20728OooOOO0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(14, OooO0O0());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20731OooOOo)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(15, this.f20731OooOOo);
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
        int iHashCode = OooO0Oo().hashCode() + ((((OooO0oo().hashCode() + ((((OooO0o0().hashCode() + ((((OooO().hashCode() + ((((Internal.hashLong(this.f20723OooO0oo) + o000000.OooO00o((((Internal.hashLong(this.f20720OooO0o) + ((((OooO0oO().hashCode() + ((((OooO0o().hashCode() + o000Oo0.OooO00o(o0OOO0o.f42599OooO00o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53, this.f20722OooO0oO, 37, 5, 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 13) * 53)) * 37) + 8) * 53);
        if (this.f20728OooOOO0 != null) {
            iHashCode = OooO0O0().hashCode() + o000000O.OooO00o(iHashCode, 37, 14, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((OooO0OO().hashCode() + ((((Internal.hashLong(this.f20732OooOOo0) + ((((Internal.hashBoolean(this.f20730OooOOOo) + ((((Internal.hashBoolean(this.f20729OooOOOO) + ((((Internal.hashBoolean(this.f20727OooOOO) + o000000O.OooO00o(iHashCode, 37, 11, 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 12) * 53)) * 37) + 15) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0OOO0o.f42600OooO0O0.ensureFieldAccessorsInitialized(HttpRequest.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f20733OooOOoo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f20733OooOOoo = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f20717OooOo00.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new HttpRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f20719OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20719OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20721OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f20721OooO0o0);
        }
        long j = this.f20720OooO0o;
        if (j != 0) {
            codedOutputStream.writeInt64(3, j);
        }
        int i = this.f20722OooO0oO;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
        long j2 = this.f20723OooO0oo;
        if (j2 != 0) {
            codedOutputStream.writeInt64(5, j2);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20718OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f20718OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20724OooOO0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.f20724OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20726OooOO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.f20726OooOO0o);
        }
        boolean z = this.f20729OooOOOO;
        if (z) {
            codedOutputStream.writeBool(9, z);
        }
        boolean z2 = this.f20730OooOOOo;
        if (z2) {
            codedOutputStream.writeBool(10, z2);
        }
        boolean z3 = this.f20727OooOOO;
        if (z3) {
            codedOutputStream.writeBool(11, z3);
        }
        long j3 = this.f20732OooOOo0;
        if (j3 != 0) {
            codedOutputStream.writeInt64(12, j3);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20725OooOO0O)) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.f20725OooOO0O);
        }
        if (this.f20728OooOOO0 != null) {
            codedOutputStream.writeMessage(14, OooO0O0());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20731OooOOo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 15, this.f20731OooOOo);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f20717OooOo00;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f20717OooOo00.toBuilder();
    }

    private HttpRequest() {
        this.f20733OooOOoo = (byte) -1;
        this.f20719OooO0Oo = "";
        this.f20721OooO0o0 = "";
        this.f20718OooO = "";
        this.f20724OooOO0 = "";
        this.f20725OooOO0O = "";
        this.f20726OooOO0o = "";
        this.f20731OooOOo = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public HttpRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 10:
                                this.f20719OooO0Oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                this.f20721OooO0o0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 24:
                                this.f20720OooO0o = codedInputStream.readInt64();
                                continue;
                            case 32:
                                this.f20722OooO0oO = codedInputStream.readInt32();
                                continue;
                            case 40:
                                this.f20723OooO0oo = codedInputStream.readInt64();
                                continue;
                            case 50:
                                this.f20718OooO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 58:
                                this.f20724OooOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 66:
                                this.f20726OooOO0o = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 72:
                                this.f20729OooOOOO = codedInputStream.readBool();
                                continue;
                            case 80:
                                this.f20730OooOOOo = codedInputStream.readBool();
                                continue;
                            case 88:
                                this.f20727OooOOO = codedInputStream.readBool();
                                continue;
                            case 96:
                                this.f20732OooOOo0 = codedInputStream.readInt64();
                                continue;
                            case 106:
                                this.f20725OooOO0O = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 114:
                                Duration duration = this.f20728OooOOO0;
                                Duration.Builder builder = duration != null ? duration.toBuilder() : null;
                                Duration duration2 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                this.f20728OooOOO0 = duration2;
                                if (builder != null) {
                                    builder.mergeFrom(duration2);
                                    this.f20728OooOOO0 = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 122:
                                this.f20731OooOOo = codedInputStream.readStringRequireUtf8();
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
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
