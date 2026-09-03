package com.google.api;

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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0O0O0Oo.o00O0O;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpRule extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final HttpRule f18031OooOO0O = new HttpRule();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f18032OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<HttpRule> f18033OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f18034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18035OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f18036OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18037OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f18038OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte f18039OooOO0;

    public static class OooO00o extends AbstractParser<HttpRule> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new HttpRule(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f18040OooO00o;

        static {
            int[] iArr = new int[PatternCase.values().length];
            f18040OooO00o = iArr;
            try {
                iArr[PatternCase.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18040OooO00o[PatternCase.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18040OooO00o[PatternCase.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18040OooO00o[PatternCase.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18040OooO00o[PatternCase.PATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18040OooO00o[PatternCase.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18040OooO00o[PatternCase.PATTERN_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f18041OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18042OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f18043OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18044OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18045OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18046OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public List<HttpRule> f18047OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public RepeatedFieldBuilderV3<HttpRule, OooO0OO, Object> f18048OooOO0O;

        public OooO0OO() {
            this.f18042OooO0Oo = 0;
            this.f18045OooO0oO = "";
            this.f18046OooO0oo = "";
            this.f18041OooO = "";
            this.f18047OooOO0 = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final HttpRule buildPartial() {
            HttpRule httpRule = new HttpRule(this);
            httpRule.f18035OooO0o = this.f18045OooO0oO;
            int i = this.f18042OooO0Oo;
            if (i == 2) {
                httpRule.f18036OooO0o0 = this.f18044OooO0o0;
            }
            if (i == 3) {
                httpRule.f18036OooO0o0 = this.f18044OooO0o0;
            }
            if (i == 4) {
                httpRule.f18036OooO0o0 = this.f18044OooO0o0;
            }
            if (i == 5) {
                httpRule.f18036OooO0o0 = this.f18044OooO0o0;
            }
            if (i == 6) {
                httpRule.f18036OooO0o0 = this.f18044OooO0o0;
            }
            if (i == 8) {
                httpRule.f18036OooO0o0 = this.f18044OooO0o0;
            }
            httpRule.f18037OooO0oO = this.f18046OooO0oo;
            httpRule.f18038OooO0oo = this.f18041OooO;
            RepeatedFieldBuilderV3<HttpRule, OooO0OO, Object> repeatedFieldBuilderV3 = this.f18048OooOO0O;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18043OooO0o & 1) != 0) {
                    this.f18047OooOO0 = Collections.unmodifiableList(this.f18047OooOO0);
                    this.f18043OooO0o &= -2;
                }
                httpRule.f18033OooO = this.f18047OooOO0;
            } else {
                httpRule.f18033OooO = repeatedFieldBuilderV3.build();
            }
            httpRule.f18034OooO0Oo = this.f18042OooO0Oo;
            onBuilt();
            return httpRule;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18045OooO0oO = "";
            this.f18046OooO0oo = "";
            this.f18041OooO = "";
            RepeatedFieldBuilderV3<HttpRule, OooO0OO, Object> repeatedFieldBuilderV3 = this.f18048OooOO0O;
            if (repeatedFieldBuilderV3 == null) {
                this.f18047OooOO0 = Collections.emptyList();
                this.f18043OooO0o &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.f18042OooO0Oo = 0;
            this.f18044OooO0o0 = null;
        }

        public final RepeatedFieldBuilderV3<HttpRule, OooO0OO, Object> OooO0o() {
            if (this.f18048OooOO0O == null) {
                this.f18048OooOO0O = new RepeatedFieldBuilderV3<>(this.f18047OooOO0, (this.f18043OooO0o & 1) != 0, getParentForChildren(), isClean());
                this.f18047OooOO0 = null;
            }
            return this.f18048OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0OO mo4023clone() {
            return (OooO0OO) super.mo4023clone();
        }

        public final void OooO0oO(HttpRule httpRule) {
            Object obj;
            CustomHttpPattern customHttpPattern;
            if (httpRule == HttpRule.f18031OooOO0O) {
                return;
            }
            if (!httpRule.OooOO0O().isEmpty()) {
                this.f18045OooO0oO = httpRule.f18035OooO0o;
                onChanged();
            }
            if (!httpRule.OooO0O0().isEmpty()) {
                this.f18046OooO0oo = httpRule.f18037OooO0oO;
                onChanged();
            }
            if (!httpRule.OooOO0().isEmpty()) {
                this.f18041OooO = httpRule.f18038OooO0oo;
                onChanged();
            }
            if (this.f18048OooOO0O == null) {
                if (!httpRule.f18033OooO.isEmpty()) {
                    if (this.f18047OooOO0.isEmpty()) {
                        this.f18047OooOO0 = httpRule.f18033OooO;
                        this.f18043OooO0o &= -2;
                    } else {
                        if ((this.f18043OooO0o & 1) == 0) {
                            this.f18047OooOO0 = new ArrayList(this.f18047OooOO0);
                            this.f18043OooO0o |= 1;
                        }
                        this.f18047OooOO0.addAll(httpRule.f18033OooO);
                    }
                    onChanged();
                }
            } else if (!httpRule.f18033OooO.isEmpty()) {
                if (this.f18048OooOO0O.isEmpty()) {
                    this.f18048OooOO0O.dispose();
                    this.f18048OooOO0O = null;
                    this.f18047OooOO0 = httpRule.f18033OooO;
                    this.f18043OooO0o &= -2;
                    this.f18048OooOO0O = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18048OooOO0O.addAllMessages(httpRule.f18033OooO);
                }
            }
            switch (OooO0O0.f18040OooO00o[httpRule.OooO0oO().ordinal()]) {
                case 1:
                    this.f18042OooO0Oo = 2;
                    this.f18044OooO0o0 = httpRule.f18036OooO0o0;
                    onChanged();
                    break;
                case 2:
                    this.f18042OooO0Oo = 3;
                    this.f18044OooO0o0 = httpRule.f18036OooO0o0;
                    onChanged();
                    break;
                case 3:
                    this.f18042OooO0Oo = 4;
                    this.f18044OooO0o0 = httpRule.f18036OooO0o0;
                    onChanged();
                    break;
                case 4:
                    this.f18042OooO0Oo = 5;
                    this.f18044OooO0o0 = httpRule.f18036OooO0o0;
                    onChanged();
                    break;
                case 5:
                    this.f18042OooO0Oo = 6;
                    this.f18044OooO0o0 = httpRule.f18036OooO0o0;
                    onChanged();
                    break;
                case 6:
                    CustomHttpPattern customHttpPatternOooO0OO = httpRule.OooO0OO();
                    if (this.f18042OooO0Oo != 8 || (obj = this.f18044OooO0o0) == (customHttpPattern = CustomHttpPattern.f17894OooO0oO)) {
                        this.f18044OooO0o0 = customHttpPatternOooO0OO;
                    } else {
                        CustomHttpPattern.OooO0O0 builder = customHttpPattern.toBuilder();
                        builder.OooO0o0((CustomHttpPattern) obj);
                        builder.OooO0o0(customHttpPatternOooO0OO);
                        this.f18044OooO0o0 = builder.buildPartial();
                    }
                    onChanged();
                    this.f18042OooO0Oo = 8;
                    break;
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            HttpRule httpRule;
            try {
                try {
                    HttpRule.f18032OooOO0o.getClass();
                    OooO0oO(new HttpRule(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    httpRule = (HttpRule) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (httpRule != null) {
                            OooO0oO(httpRule);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                httpRule = null;
                if (httpRule != null) {
                    OooO0oO(httpRule);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0OO) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final Message build() {
            HttpRule httpRuleBuildPartial = buildPartial();
            if (httpRuleBuildPartial.isInitialized()) {
                return httpRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) httpRuleBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (OooO0OO) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0OO) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return HttpRule.f18031OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00O0O.f41247OooO0OO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00O0O.f41248OooO0Oo.ensureFieldAccessorsInitialized(HttpRule.class, OooO0OO.class);
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
            return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0OO) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (OooO0OO) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0OO) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0OO) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (OooO0OO) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0OO) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return HttpRule.f18031OooOO0O;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0OO) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (OooO0OO) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0OO) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ Message.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0OO) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            HttpRule httpRuleBuildPartial = buildPartial();
            if (httpRuleBuildPartial.isInitialized()) {
                return httpRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) httpRuleBuildPartial);
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
            if (message instanceof HttpRule) {
                OooO0oO((HttpRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof HttpRule) {
                OooO0oO((HttpRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0OO(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18042OooO0Oo = 0;
            this.f18045OooO0oO = "";
            this.f18046OooO0oo = "";
            this.f18041OooO = "";
            this.f18047OooOO0 = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }
    }

    public enum PatternCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);

        private final int value;

        PatternCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

    public HttpRule(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18034OooO0Oo = 0;
        this.f18039OooOO0 = (byte) -1;
    }

    public final String OooO() {
        Object obj = this.f18034OooO0Oo == 3 ? this.f18036OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f18034OooO0Oo == 3) {
            this.f18036OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final String OooO0O0() {
        Object obj = this.f18037OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18037OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final CustomHttpPattern OooO0OO() {
        return this.f18034OooO0Oo == 8 ? (CustomHttpPattern) this.f18036OooO0o0 : CustomHttpPattern.f17894OooO0oO;
    }

    public final String OooO0Oo() {
        Object obj = this.f18034OooO0Oo == 5 ? this.f18036OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f18034OooO0Oo == 5) {
            this.f18036OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final String OooO0o() {
        Object obj = this.f18034OooO0Oo == 6 ? this.f18036OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f18034OooO0Oo == 6) {
            this.f18036OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final String OooO0o0() {
        Object obj = this.f18034OooO0Oo == 2 ? this.f18036OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f18034OooO0Oo == 2) {
            this.f18036OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final PatternCase OooO0oO() {
        int i = this.f18034OooO0Oo;
        if (i == 0) {
            return PatternCase.PATTERN_NOT_SET;
        }
        if (i == 8) {
            return PatternCase.CUSTOM;
        }
        if (i == 2) {
            return PatternCase.GET;
        }
        if (i == 3) {
            return PatternCase.PUT;
        }
        if (i == 4) {
            return PatternCase.POST;
        }
        if (i == 5) {
            return PatternCase.DELETE;
        }
        if (i != 6) {
            return null;
        }
        return PatternCase.PATCH;
    }

    public final String OooO0oo() {
        Object obj = this.f18034OooO0Oo == 4 ? this.f18036OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f18034OooO0Oo == 4) {
            this.f18036OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final String OooOO0() {
        Object obj = this.f18038OooO0oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18038OooO0oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooOO0O() {
        Object obj = this.f18035OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18035OooO0o = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f18031OooOO0O) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0oO(this);
        return oooO0OO;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpRule)) {
            return super.equals(obj);
        }
        HttpRule httpRule = (HttpRule) obj;
        if (!OooOO0O().equals(httpRule.OooOO0O()) || !OooO0O0().equals(httpRule.OooO0O0()) || !OooOO0().equals(httpRule.OooOO0()) || !this.f18033OooO.equals(httpRule.f18033OooO) || !OooO0oO().equals(httpRule.OooO0oO())) {
            return false;
        }
        int i = this.f18034OooO0Oo;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i == 8 && !OooO0OO().equals(httpRule.OooO0OO())) {
                                return false;
                            }
                        } else if (!OooO0o().equals(httpRule.OooO0o())) {
                            return false;
                        }
                    } else if (!OooO0Oo().equals(httpRule.OooO0Oo())) {
                        return false;
                    }
                } else if (!OooO0oo().equals(httpRule.OooO0oo())) {
                    return false;
                }
            } else if (!OooO().equals(httpRule.OooO())) {
                return false;
            }
        } else if (!OooO0o0().equals(httpRule.OooO0o0())) {
            return false;
        }
        return this.unknownFields.equals(httpRule.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18031OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<HttpRule> getParserForType() {
        return f18032OooOO0o;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18035OooO0o) ? GeneratedMessageV3.computeStringSize(1, this.f18035OooO0o) + 0 : 0;
        if (this.f18034OooO0Oo == 2) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 3) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 4) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 5) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 6) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f18036OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18037OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f18037OooO0oO);
        }
        if (this.f18034OooO0Oo == 8) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, (CustomHttpPattern) this.f18036OooO0o0);
        }
        for (int i2 = 0; i2 < this.f18033OooO.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(11, this.f18033OooO.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18038OooO0oo)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f18038OooO0oo);
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
        int iOooO00o;
        int iHashCode;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode2 = OooOO0().hashCode() + ((((OooO0O0().hashCode() + ((((OooOO0O().hashCode() + o0O0O0Oo.OooO00o.OooO00o(o00O0O.f41247OooO0OO, 779, 37, 1, 53)) * 37) + 7) * 53)) * 37) + 12) * 53);
        if (this.f18033OooO.size() > 0) {
            iHashCode2 = this.f18033OooO.hashCode() + o00Ooo.OooO00o(iHashCode2, 37, 11, 53);
        }
        int i2 = this.f18034OooO0Oo;
        if (i2 == 2) {
            iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 2, 53);
            iHashCode = OooO0o0().hashCode();
        } else if (i2 == 3) {
            iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 3, 53);
            iHashCode = OooO().hashCode();
        } else if (i2 == 4) {
            iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 4, 53);
            iHashCode = OooO0oo().hashCode();
        } else if (i2 == 5) {
            iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 5, 53);
            iHashCode = OooO0Oo().hashCode();
        } else {
            if (i2 != 6) {
                if (i2 == 8) {
                    iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 8, 53);
                    iHashCode = OooO0OO().hashCode();
                }
                int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 6, 53);
            iHashCode = OooO0o().hashCode();
        }
        iHashCode2 = iHashCode + iOooO00o;
        int iHashCode4 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00O0O.f41248OooO0Oo.ensureFieldAccessorsInitialized(HttpRule.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18039OooOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18039OooOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18031OooOO0O.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new HttpRule();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18035OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18035OooO0o);
        }
        if (this.f18034OooO0Oo == 2) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 3) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 4) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 5) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18036OooO0o0);
        }
        if (this.f18034OooO0Oo == 6) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f18036OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18037OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.f18037OooO0oO);
        }
        if (this.f18034OooO0Oo == 8) {
            codedOutputStream.writeMessage(8, (CustomHttpPattern) this.f18036OooO0o0);
        }
        for (int i = 0; i < this.f18033OooO.size(); i++) {
            codedOutputStream.writeMessage(11, this.f18033OooO.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18038OooO0oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.f18038OooO0oo);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18031OooOO0O;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18031OooOO0O.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private HttpRule() {
        this.f18034OooO0Oo = 0;
        this.f18039OooOO0 = (byte) -1;
        this.f18035OooO0o = "";
        this.f18037OooO0oO = "";
        this.f18038OooO0oo = "";
        this.f18033OooO = Collections.emptyList();
    }

    public HttpRule(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            case 10:
                                this.f18035OooO0o = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                this.f18034OooO0Oo = 2;
                                this.f18036OooO0o0 = stringRequireUtf8;
                                continue;
                            case 26:
                                String stringRequireUtf9 = codedInputStream.readStringRequireUtf8();
                                this.f18034OooO0Oo = 3;
                                this.f18036OooO0o0 = stringRequireUtf9;
                                continue;
                            case 34:
                                String stringRequireUtf10 = codedInputStream.readStringRequireUtf8();
                                this.f18034OooO0Oo = 4;
                                this.f18036OooO0o0 = stringRequireUtf10;
                                continue;
                            case 42:
                                String stringRequireUtf11 = codedInputStream.readStringRequireUtf8();
                                this.f18034OooO0Oo = 5;
                                this.f18036OooO0o0 = stringRequireUtf11;
                                continue;
                            case 50:
                                String stringRequireUtf12 = codedInputStream.readStringRequireUtf8();
                                this.f18034OooO0Oo = 6;
                                this.f18036OooO0o0 = stringRequireUtf12;
                                continue;
                            case 58:
                                this.f18037OooO0oO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 66:
                                CustomHttpPattern.OooO0O0 builder = this.f18034OooO0Oo == 8 ? ((CustomHttpPattern) this.f18036OooO0o0).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(CustomHttpPattern.f17895OooO0oo, extensionRegistryLite);
                                this.f18036OooO0o0 = message;
                                if (builder != null) {
                                    builder.OooO0o0((CustomHttpPattern) message);
                                    this.f18036OooO0o0 = builder.buildPartial();
                                }
                                this.f18034OooO0Oo = 8;
                                continue;
                            case 90:
                                if (!(z2 & true)) {
                                    this.f18033OooO = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18033OooO.add((HttpRule) codedInputStream.readMessage(f18032OooOO0o, extensionRegistryLite));
                                continue;
                            case 98:
                                this.f18038OooO0oo = codedInputStream.readStringRequireUtf8();
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
                if (z2 & true) {
                    this.f18033OooO = Collections.unmodifiableList(this.f18033OooO);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.f18033OooO = Collections.unmodifiableList(this.f18033OooO);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
