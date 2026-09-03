package com.google.type;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import p037OoooOo0.o000O0o;
import p102o000oo0.o00Ooo;
import p329o0O0oooo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class PostalAddress extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final PostalAddress f20704OooOOOo = new PostalAddress();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooO00o f20705OooOOo0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f20706OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f20707OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f20708OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f20709OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f20710OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f20711OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile Object f20712OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile Object f20713OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public LazyStringList f20714OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile Object f20715OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public LazyStringList f20716OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public byte f20717OooOOOO;

    public static class OooO00o extends AbstractParser<PostalAddress> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new PostalAddress(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f20718OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f20719OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f20720OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f20721OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f20722OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f20723OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f20724OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f20725OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f20726OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public LazyStringList f20727OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public LazyStringList f20728OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Object f20729OooOOOO;

        public OooO0O0() {
            this.f20720OooO0o = "";
            this.f20722OooO0oO = "";
            this.f20723OooO0oo = "";
            this.f20718OooO = "";
            this.f20724OooOO0 = "";
            this.f20725OooOO0O = "";
            this.f20726OooOO0o = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f20728OooOOO0 = lazyStringList;
            this.f20727OooOOO = lazyStringList;
            this.f20729OooOOOO = "";
            PostalAddress postalAddress = PostalAddress.f20704OooOOOo;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final PostalAddress buildPartial() {
            PostalAddress postalAddress = new PostalAddress(this);
            postalAddress.f20707OooO0Oo = this.f20721OooO0o0;
            postalAddress.f20709OooO0o0 = this.f20720OooO0o;
            postalAddress.f20708OooO0o = this.f20722OooO0oO;
            postalAddress.f20710OooO0oO = this.f20723OooO0oo;
            postalAddress.f20711OooO0oo = this.f20718OooO;
            postalAddress.f20706OooO = this.f20724OooOO0;
            postalAddress.f20712OooOO0 = this.f20725OooOO0O;
            postalAddress.f20713OooOO0O = this.f20726OooOO0o;
            if ((this.f20719OooO0Oo & 1) != 0) {
                this.f20728OooOOO0 = this.f20728OooOOO0.getUnmodifiableView();
                this.f20719OooO0Oo &= -2;
            }
            postalAddress.f20714OooOO0o = this.f20728OooOOO0;
            if ((this.f20719OooO0Oo & 2) != 0) {
                this.f20727OooOOO = this.f20727OooOOO.getUnmodifiableView();
                this.f20719OooO0Oo &= -3;
            }
            postalAddress.f20716OooOOO0 = this.f20727OooOOO;
            postalAddress.f20715OooOOO = this.f20729OooOOOO;
            onBuilt();
            return postalAddress;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f20721OooO0o0 = 0;
            this.f20720OooO0o = "";
            this.f20722OooO0oO = "";
            this.f20723OooO0oo = "";
            this.f20718OooO = "";
            this.f20724OooOO0 = "";
            this.f20725OooOO0O = "";
            this.f20726OooOO0o = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f20728OooOOO0 = lazyStringList;
            int i = this.f20719OooO0Oo & (-2);
            this.f20727OooOOO = lazyStringList;
            this.f20719OooO0Oo = i & (-3);
            this.f20729OooOOOO = "";
        }

        public final void OooO0o(PostalAddress postalAddress) {
            if (postalAddress == PostalAddress.f20704OooOOOo) {
                return;
            }
            int i = postalAddress.f20707OooO0Oo;
            if (i != 0) {
                this.f20721OooO0o0 = i;
                onChanged();
            }
            if (!postalAddress.OooO0oO().isEmpty()) {
                this.f20720OooO0o = postalAddress.f20709OooO0o0;
                onChanged();
            }
            if (!postalAddress.OooO0OO().isEmpty()) {
                this.f20722OooO0oO = postalAddress.f20708OooO0o;
                onChanged();
            }
            if (!postalAddress.OooO0o().isEmpty()) {
                this.f20723OooO0oo = postalAddress.f20710OooO0oO;
                onChanged();
            }
            if (!postalAddress.OooO0oo().isEmpty()) {
                this.f20718OooO = postalAddress.f20711OooO0oo;
                onChanged();
            }
            if (!postalAddress.OooO0O0().isEmpty()) {
                this.f20724OooOO0 = postalAddress.f20706OooO;
                onChanged();
            }
            if (!postalAddress.OooO0Oo().isEmpty()) {
                this.f20725OooOO0O = postalAddress.f20712OooOO0;
                onChanged();
            }
            if (!postalAddress.OooO().isEmpty()) {
                this.f20726OooOO0o = postalAddress.f20713OooOO0O;
                onChanged();
            }
            if (!postalAddress.f20714OooOO0o.isEmpty()) {
                if (this.f20728OooOOO0.isEmpty()) {
                    this.f20728OooOOO0 = postalAddress.f20714OooOO0o;
                    this.f20719OooO0Oo &= -2;
                } else {
                    if ((this.f20719OooO0Oo & 1) == 0) {
                        this.f20728OooOOO0 = new LazyStringArrayList(this.f20728OooOOO0);
                        this.f20719OooO0Oo |= 1;
                    }
                    this.f20728OooOOO0.addAll(postalAddress.f20714OooOO0o);
                }
                onChanged();
            }
            if (!postalAddress.f20716OooOOO0.isEmpty()) {
                if (this.f20727OooOOO.isEmpty()) {
                    this.f20727OooOOO = postalAddress.f20716OooOOO0;
                    this.f20719OooO0Oo &= -3;
                } else {
                    if ((this.f20719OooO0Oo & 2) == 0) {
                        this.f20727OooOOO = new LazyStringArrayList(this.f20727OooOOO);
                        this.f20719OooO0Oo |= 2;
                    }
                    this.f20727OooOOO.addAll(postalAddress.f20716OooOOO0);
                }
                onChanged();
            }
            if (!postalAddress.OooO0o0().isEmpty()) {
                this.f20729OooOOOO = postalAddress.f20715OooOOO;
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
            PostalAddress postalAddress;
            try {
                try {
                    PostalAddress.f20705OooOOo0.getClass();
                    OooO0o(new PostalAddress(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    postalAddress = (PostalAddress) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (postalAddress != null) {
                            OooO0o(postalAddress);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                postalAddress = null;
                if (postalAddress != null) {
                    OooO0o(postalAddress);
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
            PostalAddress postalAddressBuildPartial = buildPartial();
            if (postalAddressBuildPartial.isInitialized()) {
                return postalAddressBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) postalAddressBuildPartial);
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
            return PostalAddress.f20704OooOOOo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0O00000.f42134OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0O00000.f42135OooO0O0.ensureFieldAccessorsInitialized(PostalAddress.class, OooO0O0.class);
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
            return PostalAddress.f20704OooOOOo;
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
            PostalAddress postalAddressBuildPartial = buildPartial();
            if (postalAddressBuildPartial.isInitialized()) {
                return postalAddressBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) postalAddressBuildPartial);
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
            if (message instanceof PostalAddress) {
                OooO0o((PostalAddress) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof PostalAddress) {
                OooO0o((PostalAddress) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f20720OooO0o = "";
            this.f20722OooO0oO = "";
            this.f20723OooO0oo = "";
            this.f20718OooO = "";
            this.f20724OooOO0 = "";
            this.f20725OooOO0O = "";
            this.f20726OooOO0o = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f20728OooOOO0 = lazyStringList;
            this.f20727OooOOO = lazyStringList;
            this.f20729OooOOOO = "";
            PostalAddress postalAddress = PostalAddress.f20704OooOOOo;
        }
    }

    public PostalAddress(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f20717OooOOOO = (byte) -1;
    }

    public final String OooO() {
        Object obj = this.f20713OooOO0O;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20713OooOO0O = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0O0() {
        Object obj = this.f20706OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20706OooO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f20708OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20708OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f20712OooOO0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20712OooOO0 = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o() {
        Object obj = this.f20710OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20710OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o0() {
        Object obj = this.f20715OooOOO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20715OooOOO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0oO() {
        Object obj = this.f20709OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20709OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0oo() {
        Object obj = this.f20711OooO0oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20711OooO0oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f20704OooOOOo) {
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
        if (!(obj instanceof PostalAddress)) {
            return super.equals(obj);
        }
        PostalAddress postalAddress = (PostalAddress) obj;
        return this.f20707OooO0Oo == postalAddress.f20707OooO0Oo && OooO0oO().equals(postalAddress.OooO0oO()) && OooO0OO().equals(postalAddress.OooO0OO()) && OooO0o().equals(postalAddress.OooO0o()) && OooO0oo().equals(postalAddress.OooO0oo()) && OooO0O0().equals(postalAddress.OooO0O0()) && OooO0Oo().equals(postalAddress.OooO0Oo()) && OooO().equals(postalAddress.OooO()) && this.f20714OooOO0o.equals(postalAddress.f20714OooOO0o) && this.f20716OooOOO0.equals(postalAddress.f20716OooOOO0) && OooO0o0().equals(postalAddress.OooO0o0()) && this.unknownFields.equals(postalAddress.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f20704OooOOOo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<PostalAddress> getParserForType() {
        return f20705OooOOo0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.f20707OooO0Oo;
        int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f20709OooO0o0)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(2, this.f20709OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20708OooO0o)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(3, this.f20708OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20710OooO0oO)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.f20710OooO0oO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20711OooO0oo)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(5, this.f20711OooO0oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20706OooO)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(6, this.f20706OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20712OooOO0)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(7, this.f20712OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20713OooOO0O)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(8, this.f20713OooOO0O);
        }
        int iOooO00o = 0;
        for (int i3 = 0; i3 < this.f20714OooOO0o.size(); i3++) {
            iOooO00o = o000O0o.OooO00o(this.f20714OooOO0o, i3, iOooO00o);
        }
        int size = (this.f20714OooOO0o.size() * 1) + iComputeInt32Size + iOooO00o;
        int iOooO00o2 = 0;
        for (int i4 = 0; i4 < this.f20716OooOOO0.size(); i4++) {
            iOooO00o2 = o000O0o.OooO00o(this.f20716OooOOO0, i4, iOooO00o2);
        }
        int size2 = (this.f20716OooOOO0.size() * 1) + size + iOooO00o2;
        if (!GeneratedMessageV3.isStringEmpty(this.f20715OooOOO)) {
            size2 += GeneratedMessageV3.computeStringSize(11, this.f20715OooOOO);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size2;
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
        int iHashCode = OooO().hashCode() + ((((OooO0Oo().hashCode() + ((((OooO0O0().hashCode() + ((((OooO0oo().hashCode() + ((((OooO0o().hashCode() + ((((OooO0OO().hashCode() + ((((OooO0oO().hashCode() + androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(o0O0O0Oo.OooO00o.OooO00o(o0O00000.f42134OooO00o, 779, 37, 1, 53), this.f20707OooO0Oo, 37, 2, 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
        if (this.f20714OooOO0o.size() > 0) {
            iHashCode = this.f20714OooOO0o.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 9, 53);
        }
        if (this.f20716OooOOO0.size() > 0) {
            iHashCode = this.f20716OooOOO0.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 10, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((OooO0o0().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 11, 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0O00000.f42135OooO0O0.ensureFieldAccessorsInitialized(PostalAddress.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f20717OooOOOO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f20717OooOOOO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f20704OooOOOo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new PostalAddress();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f20707OooO0Oo;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20709OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f20709OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20708OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f20708OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20710OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.f20710OooO0oO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20711OooO0oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f20711OooO0oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20706OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f20706OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20712OooOO0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.f20712OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20713OooOO0O)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.f20713OooOO0O);
        }
        int iOooO00o = 0;
        while (iOooO00o < this.f20714OooOO0o.size()) {
            iOooO00o = com.app.base.protobuf.OooO0O0.OooO00o(this.f20714OooOO0o, iOooO00o, codedOutputStream, 9, iOooO00o, 1);
        }
        int iOooO00o2 = 0;
        while (iOooO00o2 < this.f20716OooOOO0.size()) {
            iOooO00o2 = com.app.base.protobuf.OooO0O0.OooO00o(this.f20716OooOOO0, iOooO00o2, codedOutputStream, 10, iOooO00o2, 1);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f20715OooOOO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.f20715OooOOO);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f20704OooOOOo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f20704OooOOOo.toBuilder();
    }

    private PostalAddress() {
        this.f20717OooOOOO = (byte) -1;
        this.f20709OooO0o0 = "";
        this.f20708OooO0o = "";
        this.f20710OooO0oO = "";
        this.f20711OooO0oo = "";
        this.f20706OooO = "";
        this.f20712OooOO0 = "";
        this.f20713OooOO0O = "";
        LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
        this.f20714OooOO0o = lazyStringList;
        this.f20716OooOOO0 = lazyStringList;
        this.f20715OooOOO = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public PostalAddress(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f20707OooO0Oo = codedInputStream.readInt32();
                                continue;
                            case 18:
                                this.f20709OooO0o0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 26:
                                this.f20708OooO0o = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 34:
                                this.f20710OooO0oO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 42:
                                this.f20711OooO0oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 50:
                                this.f20706OooO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 58:
                                this.f20712OooOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 66:
                                this.f20713OooOO0O = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 74:
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if ((i & 1) == 0) {
                                    this.f20714OooOO0o = new LazyStringArrayList();
                                    i |= 1;
                                }
                                this.f20714OooOO0o.add(stringRequireUtf8);
                                continue;
                            case 82:
                                String stringRequireUtf9 = codedInputStream.readStringRequireUtf8();
                                if ((i & 2) == 0) {
                                    this.f20716OooOOO0 = new LazyStringArrayList();
                                    i |= 2;
                                }
                                this.f20716OooOOO0.add(stringRequireUtf9);
                                continue;
                            case 90:
                                this.f20715OooOOO = codedInputStream.readStringRequireUtf8();
                                continue;
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
                if ((i & 1) != 0) {
                    this.f20714OooOO0o = this.f20714OooOO0o.getUnmodifiableView();
                }
                if ((i & 2) != 0) {
                    this.f20716OooOOO0 = this.f20716OooOOO0.getUnmodifiableView();
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.f20714OooOO0o = this.f20714OooOO0o.getUnmodifiableView();
        }
        if ((i & 2) != 0) {
            this.f20716OooOOO0 = this.f20716OooOOO0.getUnmodifiableView();
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
