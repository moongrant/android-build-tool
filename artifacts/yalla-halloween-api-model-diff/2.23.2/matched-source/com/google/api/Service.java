package com.google.api;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0O0O0Oo.o000OOo;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class Service extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final Service f18309OooOooO = new Service();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO00o f18310OooOooo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<Type> f18311OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18312OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18313OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18314OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18315OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<Api> f18316OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<Enum> f18317OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Documentation f18318OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Backend f18319OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Quota f18320OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Http f18321OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Authentication f18322OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Context f18323OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public List<Endpoint> f18324OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Usage f18325OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Control f18326OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Logging f18327OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public List<MetricDescriptor> f18328OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public List<LogDescriptor> f18329OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public List<MonitoredResourceDescriptor> f18330OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Billing f18331OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public SystemParameters f18332OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Monitoring f18333OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public SourceInfo f18334OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public byte f18335OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public UInt32Value f18336OooOoo0;

    public static class OooO00o extends AbstractParser<Service> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Service(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public List<Api> f18337OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18338OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18339OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18340OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18341OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18342OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> f18343OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public List<Type> f18344OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> f18345OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> f18346OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public List<Enum> f18347OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Documentation f18348OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Backend f18349OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public Quota f18350OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public Http f18351OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public Authentication f18352OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Control f18353OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public Usage f18354OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public Context f18355OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public List<Endpoint> f18356OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> f18357OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.OooO0O0, Object> f18358OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List<LogDescriptor> f18359OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public List<MetricDescriptor> f18360OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public List<MonitoredResourceDescriptor> f18361OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> f18362OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> f18363OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public Billing f18364OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public SourceInfo f18365Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public Logging f18366Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public Monitoring f18367Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public SystemParameters f18368Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public UInt32Value f18369Oooo0O0;

        public OooO0O0() {
            this.f18340OooO0o0 = "";
            this.f18339OooO0o = "";
            this.f18341OooO0oO = "";
            this.f18342OooO0oo = "";
            this.f18337OooO = Collections.emptyList();
            this.f18344OooOO0O = Collections.emptyList();
            this.f18347OooOOO0 = Collections.emptyList();
            this.f18356OooOo0O = Collections.emptyList();
            this.f18359OooOoO0 = Collections.emptyList();
            this.f18360OooOoOO = Collections.emptyList();
            this.f18361OooOoo = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
                OooOO0o();
                OooO0oo();
                OooO0oO();
                OooO();
                OooOO0();
                OooOO0O();
            }
        }

        public final RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.OooO0O0, Object> OooO() {
            if (this.f18358OooOoO == null) {
                this.f18358OooOoO = new RepeatedFieldBuilderV3<>(this.f18359OooOoO0, (this.f18338OooO0Oo & 16) != 0, getParentForChildren(), isClean());
                this.f18359OooOoO0 = null;
            }
            return this.f18358OooOoO;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Service buildPartial() {
            Service service = new Service(this);
            service.f18312OooO0Oo = this.f18340OooO0o0;
            service.f18314OooO0o0 = this.f18339OooO0o;
            service.f18313OooO0o = this.f18341OooO0oO;
            service.f18315OooO0oO = this.f18342OooO0oo;
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.f18343OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18338OooO0Oo & 1) != 0) {
                    this.f18337OooO = Collections.unmodifiableList(this.f18337OooO);
                    this.f18338OooO0Oo &= -2;
                }
                service.f18316OooO0oo = this.f18337OooO;
            } else {
                service.f18316OooO0oo = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV4 = this.f18345OooOO0o;
            if (repeatedFieldBuilderV4 == null) {
                if ((this.f18338OooO0Oo & 2) != 0) {
                    this.f18344OooOO0O = Collections.unmodifiableList(this.f18344OooOO0O);
                    this.f18338OooO0Oo &= -3;
                }
                service.f18311OooO = this.f18344OooOO0O;
            } else {
                service.f18311OooO = repeatedFieldBuilderV4.build();
            }
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV5 = this.f18346OooOOO;
            if (repeatedFieldBuilderV5 == null) {
                if ((this.f18338OooO0Oo & 4) != 0) {
                    this.f18347OooOOO0 = Collections.unmodifiableList(this.f18347OooOOO0);
                    this.f18338OooO0Oo &= -5;
                }
                service.f18317OooOO0 = this.f18347OooOOO0;
            } else {
                service.f18317OooOO0 = repeatedFieldBuilderV5.build();
            }
            service.f18318OooOO0O = this.f18348OooOOOO;
            service.f18319OooOO0o = this.f18349OooOOOo;
            service.f18321OooOOO0 = this.f18351OooOOo0;
            service.f18320OooOOO = this.f18350OooOOo;
            service.f18322OooOOOO = this.f18352OooOOoo;
            service.f18323OooOOOo = this.f18355OooOo00;
            service.f18325OooOOo0 = this.f18354OooOo0;
            RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> repeatedFieldBuilderV6 = this.f18357OooOo0o;
            if (repeatedFieldBuilderV6 == null) {
                if ((this.f18338OooO0Oo & 8) != 0) {
                    this.f18356OooOo0O = Collections.unmodifiableList(this.f18356OooOo0O);
                    this.f18338OooO0Oo &= -9;
                }
                service.f18324OooOOo = this.f18356OooOo0O;
            } else {
                service.f18324OooOOo = repeatedFieldBuilderV6.build();
            }
            service.f18326OooOOoo = this.f18353OooOo;
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.OooO0O0, Object> repeatedFieldBuilderV7 = this.f18358OooOoO;
            if (repeatedFieldBuilderV7 == null) {
                if ((this.f18338OooO0Oo & 16) != 0) {
                    this.f18359OooOoO0 = Collections.unmodifiableList(this.f18359OooOoO0);
                    this.f18338OooO0Oo &= -17;
                }
                service.f18329OooOo00 = this.f18359OooOoO0;
            } else {
                service.f18329OooOo00 = repeatedFieldBuilderV7.build();
            }
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> repeatedFieldBuilderV8 = this.f18362OooOoo0;
            if (repeatedFieldBuilderV8 == null) {
                if ((this.f18338OooO0Oo & 32) != 0) {
                    this.f18360OooOoOO = Collections.unmodifiableList(this.f18360OooOoOO);
                    this.f18338OooO0Oo &= -33;
                }
                service.f18328OooOo0 = this.f18360OooOoOO;
            } else {
                service.f18328OooOo0 = repeatedFieldBuilderV8.build();
            }
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> repeatedFieldBuilderV9 = this.f18363OooOooO;
            if (repeatedFieldBuilderV9 == null) {
                if ((this.f18338OooO0Oo & 64) != 0) {
                    this.f18361OooOoo = Collections.unmodifiableList(this.f18361OooOoo);
                    this.f18338OooO0Oo &= -65;
                }
                service.f18330OooOo0O = this.f18361OooOoo;
            } else {
                service.f18330OooOo0O = repeatedFieldBuilderV9.build();
            }
            service.f18331OooOo0o = this.f18364OooOooo;
            service.f18327OooOo = this.f18366Oooo000;
            service.f18333OooOoO0 = this.f18367Oooo00O;
            service.f18332OooOoO = this.f18368Oooo00o;
            service.f18334OooOoOO = this.f18365Oooo0;
            service.f18336OooOoo0 = this.f18369Oooo0O0;
            onBuilt();
            return service;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18340OooO0o0 = "";
            this.f18339OooO0o = "";
            this.f18341OooO0oO = "";
            this.f18342OooO0oo = "";
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.f18343OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                this.f18337OooO = Collections.emptyList();
                this.f18338OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV4 = this.f18345OooOO0o;
            if (repeatedFieldBuilderV4 == null) {
                this.f18344OooOO0O = Collections.emptyList();
                this.f18338OooO0Oo &= -3;
            } else {
                repeatedFieldBuilderV4.clear();
            }
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV5 = this.f18346OooOOO;
            if (repeatedFieldBuilderV5 == null) {
                this.f18347OooOOO0 = Collections.emptyList();
                this.f18338OooO0Oo &= -5;
            } else {
                repeatedFieldBuilderV5.clear();
            }
            this.f18348OooOOOO = null;
            this.f18349OooOOOo = null;
            this.f18351OooOOo0 = null;
            this.f18350OooOOo = null;
            this.f18352OooOOoo = null;
            this.f18355OooOo00 = null;
            this.f18354OooOo0 = null;
            RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> repeatedFieldBuilderV6 = this.f18357OooOo0o;
            if (repeatedFieldBuilderV6 == null) {
                this.f18356OooOo0O = Collections.emptyList();
                this.f18338OooO0Oo &= -9;
            } else {
                repeatedFieldBuilderV6.clear();
            }
            this.f18353OooOo = null;
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.OooO0O0, Object> repeatedFieldBuilderV7 = this.f18358OooOoO;
            if (repeatedFieldBuilderV7 == null) {
                this.f18359OooOoO0 = Collections.emptyList();
                this.f18338OooO0Oo &= -17;
            } else {
                repeatedFieldBuilderV7.clear();
            }
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> repeatedFieldBuilderV8 = this.f18362OooOoo0;
            if (repeatedFieldBuilderV8 == null) {
                this.f18360OooOoOO = Collections.emptyList();
                this.f18338OooO0Oo &= -33;
            } else {
                repeatedFieldBuilderV8.clear();
            }
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> repeatedFieldBuilderV9 = this.f18363OooOooO;
            if (repeatedFieldBuilderV9 == null) {
                this.f18361OooOoo = Collections.emptyList();
                this.f18338OooO0Oo &= -65;
            } else {
                repeatedFieldBuilderV9.clear();
            }
            this.f18364OooOooo = null;
            this.f18366Oooo000 = null;
            this.f18367Oooo00O = null;
            this.f18368Oooo00o = null;
            this.f18365Oooo0 = null;
            this.f18369Oooo0O0 = null;
        }

        public final RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> OooO0o() {
            if (this.f18343OooOO0 == null) {
                this.f18343OooOO0 = new RepeatedFieldBuilderV3<>(this.f18337OooO, (this.f18338OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18337OooO = null;
            }
            return this.f18343OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> OooO0oO() {
            if (this.f18357OooOo0o == null) {
                this.f18357OooOo0o = new RepeatedFieldBuilderV3<>(this.f18356OooOo0O, (this.f18338OooO0Oo & 8) != 0, getParentForChildren(), isClean());
                this.f18356OooOo0O = null;
            }
            return this.f18357OooOo0o;
        }

        public final RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> OooO0oo() {
            if (this.f18346OooOOO == null) {
                this.f18346OooOOO = new RepeatedFieldBuilderV3<>(this.f18347OooOOO0, (this.f18338OooO0Oo & 4) != 0, getParentForChildren(), isClean());
                this.f18347OooOOO0 = null;
            }
            return this.f18346OooOOO;
        }

        public final RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> OooOO0() {
            if (this.f18362OooOoo0 == null) {
                this.f18362OooOoo0 = new RepeatedFieldBuilderV3<>(this.f18360OooOoOO, (this.f18338OooO0Oo & 32) != 0, getParentForChildren(), isClean());
                this.f18360OooOoOO = null;
            }
            return this.f18362OooOoo0;
        }

        public final RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> OooOO0O() {
            if (this.f18363OooOooO == null) {
                this.f18363OooOooO = new RepeatedFieldBuilderV3<>(this.f18361OooOoo, (this.f18338OooO0Oo & 64) != 0, getParentForChildren(), isClean());
                this.f18361OooOoo = null;
            }
            return this.f18363OooOooO;
        }

        public final RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> OooOO0o() {
            if (this.f18345OooOO0o == null) {
                this.f18345OooOO0o = new RepeatedFieldBuilderV3<>(this.f18344OooOO0O, (this.f18338OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f18344OooOO0O = null;
            }
            return this.f18345OooOO0o;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooOOO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Service service;
            try {
                try {
                    Service.f18310OooOooo.getClass();
                    OooOOO0(new Service(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    service = (Service) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (service != null) {
                            OooOOO0(service);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                service = null;
                if (service != null) {
                    OooOOO0(service);
                }
                throw th;
            }
        }

        public final void OooOOO0(Service service) {
            if (service == Service.f18309OooOooO) {
                return;
            }
            if (!service.getName().isEmpty()) {
                this.f18340OooO0o0 = service.f18312OooO0Oo;
                onChanged();
            }
            if (!service.getTitle().isEmpty()) {
                this.f18339OooO0o = service.f18314OooO0o0;
                onChanged();
            }
            if (!service.OooOOOO().isEmpty()) {
                this.f18341OooO0oO = service.f18313OooO0o;
                onChanged();
            }
            if (!service.OooOO0o().isEmpty()) {
                this.f18342OooO0oo = service.f18315OooO0oO;
                onChanged();
            }
            if (this.f18343OooOO0 == null) {
                if (!service.f18316OooO0oo.isEmpty()) {
                    if (this.f18337OooO.isEmpty()) {
                        this.f18337OooO = service.f18316OooO0oo;
                        this.f18338OooO0Oo &= -2;
                    } else {
                        if ((this.f18338OooO0Oo & 1) == 0) {
                            this.f18337OooO = new ArrayList(this.f18337OooO);
                            this.f18338OooO0Oo |= 1;
                        }
                        this.f18337OooO.addAll(service.f18316OooO0oo);
                    }
                    onChanged();
                }
            } else if (!service.f18316OooO0oo.isEmpty()) {
                if (this.f18343OooOO0.isEmpty()) {
                    this.f18343OooOO0.dispose();
                    this.f18343OooOO0 = null;
                    this.f18337OooO = service.f18316OooO0oo;
                    this.f18338OooO0Oo &= -2;
                    this.f18343OooOO0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18343OooOO0.addAllMessages(service.f18316OooO0oo);
                }
            }
            if (this.f18345OooOO0o == null) {
                if (!service.f18311OooO.isEmpty()) {
                    if (this.f18344OooOO0O.isEmpty()) {
                        this.f18344OooOO0O = service.f18311OooO;
                        this.f18338OooO0Oo &= -3;
                    } else {
                        if ((this.f18338OooO0Oo & 2) == 0) {
                            this.f18344OooOO0O = new ArrayList(this.f18344OooOO0O);
                            this.f18338OooO0Oo |= 2;
                        }
                        this.f18344OooOO0O.addAll(service.f18311OooO);
                    }
                    onChanged();
                }
            } else if (!service.f18311OooO.isEmpty()) {
                if (this.f18345OooOO0o.isEmpty()) {
                    this.f18345OooOO0o.dispose();
                    this.f18345OooOO0o = null;
                    this.f18344OooOO0O = service.f18311OooO;
                    this.f18338OooO0Oo &= -3;
                    this.f18345OooOO0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooOO0o() : null;
                } else {
                    this.f18345OooOO0o.addAllMessages(service.f18311OooO);
                }
            }
            if (this.f18346OooOOO == null) {
                if (!service.f18317OooOO0.isEmpty()) {
                    if (this.f18347OooOOO0.isEmpty()) {
                        this.f18347OooOOO0 = service.f18317OooOO0;
                        this.f18338OooO0Oo &= -5;
                    } else {
                        if ((this.f18338OooO0Oo & 4) == 0) {
                            this.f18347OooOOO0 = new ArrayList(this.f18347OooOOO0);
                            this.f18338OooO0Oo |= 4;
                        }
                        this.f18347OooOOO0.addAll(service.f18317OooOO0);
                    }
                    onChanged();
                }
            } else if (!service.f18317OooOO0.isEmpty()) {
                if (this.f18346OooOOO.isEmpty()) {
                    this.f18346OooOOO.dispose();
                    this.f18346OooOOO = null;
                    this.f18347OooOOO0 = service.f18317OooOO0;
                    this.f18338OooO0Oo &= -5;
                    this.f18346OooOOO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oo() : null;
                } else {
                    this.f18346OooOOO.addAllMessages(service.f18317OooOO0);
                }
            }
            if (service.f18318OooOO0O != null) {
                Documentation documentationOooOO0 = service.OooOO0();
                Documentation documentation = this.f18348OooOOOO;
                if (documentation != null) {
                    Documentation.OooO0O0 builder = Documentation.f17972OooOO0O.toBuilder();
                    builder.OooO0oo(documentation);
                    builder.OooO0oo(documentationOooOO0);
                    this.f18348OooOOOO = builder.buildPartial();
                } else {
                    this.f18348OooOOOO = documentationOooOO0;
                }
                onChanged();
            }
            if (service.f18319OooOO0o != null) {
                Backend backendOooO0o0 = service.OooO0o0();
                Backend backend = this.f18349OooOOOo;
                if (backend != null) {
                    Backend.OooO0O0 builder2 = Backend.f17809OooO0o.toBuilder();
                    builder2.OooO0oO(backend);
                    builder2.OooO0oO(backendOooO0o0);
                    this.f18349OooOOOo = builder2.buildPartial();
                } else {
                    this.f18349OooOOOo = backendOooO0o0;
                }
                onChanged();
            }
            if (service.f18321OooOOO0 != null) {
                Http httpOooOO0O = service.OooOO0O();
                Http http = this.f18351OooOOo0;
                if (http != null) {
                    Http.OooO0O0 builder3 = Http.f18011OooO0oO.toBuilder();
                    builder3.OooO0oO(http);
                    builder3.OooO0oO(httpOooOO0O);
                    this.f18351OooOOo0 = builder3.buildPartial();
                } else {
                    this.f18351OooOOo0 = httpOooOO0O;
                }
                onChanged();
            }
            if (service.f18320OooOOO != null) {
                Quota quotaOooOOOo = service.OooOOOo();
                Quota quota = this.f18350OooOOo;
                if (quota != null) {
                    Quota.OooO0O0 builder4 = Quota.f18234OooO0oO.toBuilder();
                    builder4.OooO0oo(quota);
                    builder4.OooO0oo(quotaOooOOOo);
                    this.f18350OooOOo = builder4.buildPartial();
                } else {
                    this.f18350OooOOo = quotaOooOOOo;
                }
                onChanged();
            }
            if (service.f18322OooOOOO != null) {
                Authentication authenticationOooO0Oo = service.OooO0Oo();
                Authentication authentication = this.f18352OooOOoo;
                if (authentication != null) {
                    Authentication.OooO0O0 builder5 = Authentication.f17786OooO0oO.toBuilder();
                    builder5.OooO0oo(authentication);
                    builder5.OooO0oo(authenticationOooO0Oo);
                    this.f18352OooOOoo = builder5.buildPartial();
                } else {
                    this.f18352OooOOoo = authenticationOooO0Oo;
                }
                onChanged();
            }
            if (service.f18323OooOOOo != null) {
                Context contextOooO0oo = service.OooO0oo();
                Context context = this.f18355OooOo00;
                if (context != null) {
                    Context.OooO0O0 builder6 = Context.f17868OooO0o.toBuilder();
                    builder6.OooO0oO(context);
                    builder6.OooO0oO(contextOooO0oo);
                    this.f18355OooOo00 = builder6.buildPartial();
                } else {
                    this.f18355OooOo00 = contextOooO0oo;
                }
                onChanged();
            }
            if (service.f18325OooOOo0 != null) {
                Usage usageOooOOoo = service.OooOOoo();
                Usage usage = this.f18354OooOo0;
                if (usage != null) {
                    Usage.OooO0O0 builder7 = Usage.f18403OooO0oo.toBuilder();
                    builder7.OooO0oO(usage);
                    builder7.OooO0oO(usageOooOOoo);
                    this.f18354OooOo0 = builder7.buildPartial();
                } else {
                    this.f18354OooOo0 = usageOooOOoo;
                }
                onChanged();
            }
            if (this.f18357OooOo0o == null) {
                if (!service.f18324OooOOo.isEmpty()) {
                    if (this.f18356OooOo0O.isEmpty()) {
                        this.f18356OooOo0O = service.f18324OooOOo;
                        this.f18338OooO0Oo &= -9;
                    } else {
                        if ((this.f18338OooO0Oo & 8) == 0) {
                            this.f18356OooOo0O = new ArrayList(this.f18356OooOo0O);
                            this.f18338OooO0Oo |= 8;
                        }
                        this.f18356OooOo0O.addAll(service.f18324OooOOo);
                    }
                    onChanged();
                }
            } else if (!service.f18324OooOOo.isEmpty()) {
                if (this.f18357OooOo0o.isEmpty()) {
                    this.f18357OooOo0o.dispose();
                    this.f18357OooOo0o = null;
                    this.f18356OooOo0O = service.f18324OooOOo;
                    this.f18338OooO0Oo &= -9;
                    this.f18357OooOo0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oO() : null;
                } else {
                    this.f18357OooOo0o.addAllMessages(service.f18324OooOOo);
                }
            }
            if (service.f18326OooOOoo != null) {
                Control controlOooO = service.OooO();
                Control control = this.f18353OooOo;
                if (control != null) {
                    Control.OooO0O0 builder8 = Control.f17889OooO0o.toBuilder();
                    builder8.OooO0o0(control);
                    builder8.OooO0o0(controlOooO);
                    this.f18353OooOo = builder8.buildPartial();
                } else {
                    this.f18353OooOo = controlOooO;
                }
                onChanged();
            }
            if (this.f18358OooOoO == null) {
                if (!service.f18329OooOo00.isEmpty()) {
                    if (this.f18359OooOoO0.isEmpty()) {
                        this.f18359OooOoO0 = service.f18329OooOo00;
                        this.f18338OooO0Oo &= -17;
                    } else {
                        if ((this.f18338OooO0Oo & 16) == 0) {
                            this.f18359OooOoO0 = new ArrayList(this.f18359OooOoO0);
                            this.f18338OooO0Oo |= 16;
                        }
                        this.f18359OooOoO0.addAll(service.f18329OooOo00);
                    }
                    onChanged();
                }
            } else if (!service.f18329OooOo00.isEmpty()) {
                if (this.f18358OooOoO.isEmpty()) {
                    this.f18358OooOoO.dispose();
                    this.f18358OooOoO = null;
                    this.f18359OooOoO0 = service.f18329OooOo00;
                    this.f18338OooO0Oo &= -17;
                    this.f18358OooOoO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO() : null;
                } else {
                    this.f18358OooOoO.addAllMessages(service.f18329OooOo00);
                }
            }
            if (this.f18362OooOoo0 == null) {
                if (!service.f18328OooOo0.isEmpty()) {
                    if (this.f18360OooOoOO.isEmpty()) {
                        this.f18360OooOoOO = service.f18328OooOo0;
                        this.f18338OooO0Oo &= -33;
                    } else {
                        if ((this.f18338OooO0Oo & 32) == 0) {
                            this.f18360OooOoOO = new ArrayList(this.f18360OooOoOO);
                            this.f18338OooO0Oo |= 32;
                        }
                        this.f18360OooOoOO.addAll(service.f18328OooOo0);
                    }
                    onChanged();
                }
            } else if (!service.f18328OooOo0.isEmpty()) {
                if (this.f18362OooOoo0.isEmpty()) {
                    this.f18362OooOoo0.dispose();
                    this.f18362OooOoo0 = null;
                    this.f18360OooOoOO = service.f18328OooOo0;
                    this.f18338OooO0Oo &= -33;
                    this.f18362OooOoo0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooOO0() : null;
                } else {
                    this.f18362OooOoo0.addAllMessages(service.f18328OooOo0);
                }
            }
            if (this.f18363OooOooO == null) {
                if (!service.f18330OooOo0O.isEmpty()) {
                    if (this.f18361OooOoo.isEmpty()) {
                        this.f18361OooOoo = service.f18330OooOo0O;
                        this.f18338OooO0Oo &= -65;
                    } else {
                        if ((this.f18338OooO0Oo & 64) == 0) {
                            this.f18361OooOoo = new ArrayList(this.f18361OooOoo);
                            this.f18338OooO0Oo |= 64;
                        }
                        this.f18361OooOoo.addAll(service.f18330OooOo0O);
                    }
                    onChanged();
                }
            } else if (!service.f18330OooOo0O.isEmpty()) {
                if (this.f18363OooOooO.isEmpty()) {
                    this.f18363OooOooO.dispose();
                    this.f18363OooOooO = null;
                    this.f18361OooOoo = service.f18330OooOo0O;
                    this.f18338OooO0Oo &= -65;
                    this.f18363OooOooO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooOO0O() : null;
                } else {
                    this.f18363OooOooO.addAllMessages(service.f18330OooOo0O);
                }
            }
            if (service.f18331OooOo0o != null) {
                Billing billingOooO0o = service.OooO0o();
                Billing billing = this.f18364OooOooo;
                if (billing != null) {
                    Billing.OooO0O0 builder9 = Billing.f17838OooO0o.toBuilder();
                    builder9.OooO0oO(billing);
                    builder9.OooO0oO(billingOooO0o);
                    this.f18364OooOooo = builder9.buildPartial();
                } else {
                    this.f18364OooOooo = billingOooO0o;
                }
                onChanged();
            }
            if (service.f18327OooOo != null) {
                Logging loggingOooOOO0 = service.OooOOO0();
                Logging logging = this.f18366Oooo000;
                if (logging != null) {
                    Logging.OooO0O0 builder10 = Logging.f18081OooO0oO.toBuilder();
                    builder10.OooO0oo(logging);
                    builder10.OooO0oo(loggingOooOOO0);
                    this.f18366Oooo000 = builder10.buildPartial();
                } else {
                    this.f18366Oooo000 = loggingOooOOO0;
                }
                onChanged();
            }
            if (service.f18333OooOoO0 != null) {
                Monitoring monitoringOooOOO = service.OooOOO();
                Monitoring monitoring = this.f18367Oooo00O;
                if (monitoring != null) {
                    Monitoring.OooO0O0 builder11 = Monitoring.f18184OooO0oO.toBuilder();
                    builder11.OooO0oo(monitoring);
                    builder11.OooO0oo(monitoringOooOOO);
                    this.f18367Oooo00O = builder11.buildPartial();
                } else {
                    this.f18367Oooo00O = monitoringOooOOO;
                }
                onChanged();
            }
            if (service.f18332OooOoO != null) {
                SystemParameters systemParametersOooOOo = service.OooOOo();
                SystemParameters systemParameters = this.f18368Oooo00o;
                if (systemParameters != null) {
                    SystemParameters.OooO0O0 builder12 = SystemParameters.f18395OooO0o.toBuilder();
                    builder12.OooO0oO(systemParameters);
                    builder12.OooO0oO(systemParametersOooOOo);
                    this.f18368Oooo00o = builder12.buildPartial();
                } else {
                    this.f18368Oooo00o = systemParametersOooOOo;
                }
                onChanged();
            }
            if (service.f18334OooOoOO != null) {
                SourceInfo sourceInfoOooOOo0 = service.OooOOo0();
                SourceInfo sourceInfo = this.f18365Oooo0;
                if (sourceInfo != null) {
                    SourceInfo.OooO0O0 builder13 = SourceInfo.f18370OooO0o.toBuilder();
                    builder13.OooO0oO(sourceInfo);
                    builder13.OooO0oO(sourceInfoOooOOo0);
                    this.f18365Oooo0 = builder13.buildPartial();
                } else {
                    this.f18365Oooo0 = sourceInfoOooOOo0;
                }
                onChanged();
            }
            if (service.f18336OooOoo0 != null) {
                UInt32Value uInt32ValueOooO0oO = service.OooO0oO();
                UInt32Value uInt32Value = this.f18369Oooo0O0;
                if (uInt32Value != null) {
                    this.f18369Oooo0O0 = UInt32Value.newBuilder(uInt32Value).mergeFrom(uInt32ValueOooO0oO).buildPartial();
                } else {
                    this.f18369Oooo0O0 = uInt32ValueOooO0oO;
                }
                onChanged();
            }
            onChanged();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final Message build() {
            Service serviceBuildPartial = buildPartial();
            if (serviceBuildPartial.isInitialized()) {
                return serviceBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceBuildPartial);
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
            return Service.f18309OooOooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o000OOo.f41242OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000OOo.f41243OooO0O0.ensureFieldAccessorsInitialized(Service.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooOOO(codedInputStream, extensionRegistryLite);
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
            return Service.f18309OooOooO;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooOOO(codedInputStream, extensionRegistryLite);
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
            OooOOO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            Service serviceBuildPartial = buildPartial();
            if (serviceBuildPartial.isInitialized()) {
                return serviceBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooOOO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof Service) {
                OooOOO0((Service) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Service) {
                OooOOO0((Service) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18340OooO0o0 = "";
            this.f18339OooO0o = "";
            this.f18341OooO0oO = "";
            this.f18342OooO0oo = "";
            this.f18337OooO = Collections.emptyList();
            this.f18344OooOO0O = Collections.emptyList();
            this.f18347OooOOO0 = Collections.emptyList();
            this.f18356OooOo0O = Collections.emptyList();
            this.f18359OooOoO0 = Collections.emptyList();
            this.f18360OooOoOO = Collections.emptyList();
            this.f18361OooOoo = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
                OooOO0o();
                OooO0oo();
                OooO0oO();
                OooO();
                OooOO0();
                OooOO0O();
            }
        }
    }

    public Service(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18335OooOoo = (byte) -1;
    }

    public final Control OooO() {
        Control control = this.f18326OooOOoo;
        return control == null ? Control.f17889OooO0o : control;
    }

    public final Authentication OooO0Oo() {
        Authentication authentication = this.f18322OooOOOO;
        return authentication == null ? Authentication.f17786OooO0oO : authentication;
    }

    public final Billing OooO0o() {
        Billing billing = this.f18331OooOo0o;
        return billing == null ? Billing.f17838OooO0o : billing;
    }

    public final Backend OooO0o0() {
        Backend backend = this.f18319OooOO0o;
        return backend == null ? Backend.f17809OooO0o : backend;
    }

    @Deprecated
    public final UInt32Value OooO0oO() {
        UInt32Value uInt32Value = this.f18336OooOoo0;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    public final Context OooO0oo() {
        Context context = this.f18323OooOOOo;
        return context == null ? Context.f17868OooO0o : context;
    }

    public final Documentation OooOO0() {
        Documentation documentation = this.f18318OooOO0O;
        return documentation == null ? Documentation.f17972OooOO0O : documentation;
    }

    public final Http OooOO0O() {
        Http http = this.f18321OooOOO0;
        return http == null ? Http.f18011OooO0oO : http;
    }

    public final String OooOO0o() {
        Object obj = this.f18315OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18315OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final Monitoring OooOOO() {
        Monitoring monitoring = this.f18333OooOoO0;
        return monitoring == null ? Monitoring.f18184OooO0oO : monitoring;
    }

    public final Logging OooOOO0() {
        Logging logging = this.f18327OooOo;
        return logging == null ? Logging.f18081OooO0oO : logging;
    }

    public final String OooOOOO() {
        Object obj = this.f18313OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18313OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final Quota OooOOOo() {
        Quota quota = this.f18320OooOOO;
        return quota == null ? Quota.f18234OooO0oO : quota;
    }

    public final SystemParameters OooOOo() {
        SystemParameters systemParameters = this.f18332OooOoO;
        return systemParameters == null ? SystemParameters.f18395OooO0o : systemParameters;
    }

    public final SourceInfo OooOOo0() {
        SourceInfo sourceInfo = this.f18334OooOoOO;
        return sourceInfo == null ? SourceInfo.f18370OooO0o : sourceInfo;
    }

    public final Usage OooOOoo() {
        Usage usage = this.f18325OooOOo0;
        return usage == null ? Usage.f18403OooO0oo : usage;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOo00, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18309OooOooO) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooOOO0(this);
        return oooO0O0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Service)) {
            return super.equals(obj);
        }
        Service service = (Service) obj;
        if (!getName().equals(service.getName()) || !getTitle().equals(service.getTitle()) || !OooOOOO().equals(service.OooOOOO()) || !OooOO0o().equals(service.OooOO0o()) || !this.f18316OooO0oo.equals(service.f18316OooO0oo) || !this.f18311OooO.equals(service.f18311OooO) || !this.f18317OooOO0.equals(service.f18317OooOO0)) {
            return false;
        }
        Documentation documentation = this.f18318OooOO0O;
        if ((documentation != null) != (service.f18318OooOO0O != null)) {
            return false;
        }
        if ((documentation != null) && !OooOO0().equals(service.OooOO0())) {
            return false;
        }
        Backend backend = this.f18319OooOO0o;
        if ((backend != null) != (service.f18319OooOO0o != null)) {
            return false;
        }
        if ((backend != null) && !OooO0o0().equals(service.OooO0o0())) {
            return false;
        }
        Http http = this.f18321OooOOO0;
        if ((http != null) != (service.f18321OooOOO0 != null)) {
            return false;
        }
        if ((http != null) && !OooOO0O().equals(service.OooOO0O())) {
            return false;
        }
        Quota quota = this.f18320OooOOO;
        if ((quota != null) != (service.f18320OooOOO != null)) {
            return false;
        }
        if ((quota != null) && !OooOOOo().equals(service.OooOOOo())) {
            return false;
        }
        Authentication authentication = this.f18322OooOOOO;
        if ((authentication != null) != (service.f18322OooOOOO != null)) {
            return false;
        }
        if ((authentication != null) && !OooO0Oo().equals(service.OooO0Oo())) {
            return false;
        }
        Context context = this.f18323OooOOOo;
        if ((context != null) != (service.f18323OooOOOo != null)) {
            return false;
        }
        if ((context != null) && !OooO0oo().equals(service.OooO0oo())) {
            return false;
        }
        Usage usage = this.f18325OooOOo0;
        if ((usage != null) != (service.f18325OooOOo0 != null)) {
            return false;
        }
        if (((usage != null) && !OooOOoo().equals(service.OooOOoo())) || !this.f18324OooOOo.equals(service.f18324OooOOo)) {
            return false;
        }
        Control control = this.f18326OooOOoo;
        if ((control != null) != (service.f18326OooOOoo != null)) {
            return false;
        }
        if (((control != null) && !OooO().equals(service.OooO())) || !this.f18329OooOo00.equals(service.f18329OooOo00) || !this.f18328OooOo0.equals(service.f18328OooOo0) || !this.f18330OooOo0O.equals(service.f18330OooOo0O)) {
            return false;
        }
        Billing billing = this.f18331OooOo0o;
        if ((billing != null) != (service.f18331OooOo0o != null)) {
            return false;
        }
        if ((billing != null) && !OooO0o().equals(service.OooO0o())) {
            return false;
        }
        Logging logging = this.f18327OooOo;
        if ((logging != null) != (service.f18327OooOo != null)) {
            return false;
        }
        if ((logging != null) && !OooOOO0().equals(service.OooOOO0())) {
            return false;
        }
        Monitoring monitoring = this.f18333OooOoO0;
        if ((monitoring != null) != (service.f18333OooOoO0 != null)) {
            return false;
        }
        if ((monitoring != null) && !OooOOO().equals(service.OooOOO())) {
            return false;
        }
        SystemParameters systemParameters = this.f18332OooOoO;
        if ((systemParameters != null) != (service.f18332OooOoO != null)) {
            return false;
        }
        if ((systemParameters != null) && !OooOOo().equals(service.OooOOo())) {
            return false;
        }
        SourceInfo sourceInfo = this.f18334OooOoOO;
        if ((sourceInfo != null) != (service.f18334OooOoOO != null)) {
            return false;
        }
        if ((sourceInfo != null) && !OooOOo0().equals(service.OooOOo0())) {
            return false;
        }
        UInt32Value uInt32Value = this.f18336OooOoo0;
        if ((uInt32Value != null) != (service.f18336OooOoo0 != null)) {
            return false;
        }
        return (!(uInt32Value != null) || OooO0oO().equals(service.OooO0oO())) && this.unknownFields.equals(service.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18309OooOooO;
    }

    public final String getName() {
        Object obj = this.f18312OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18312OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Service> getParserForType() {
        return f18310OooOooo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18312OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18312OooO0Oo) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f18314OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18314OooO0o0);
        }
        for (int i2 = 0; i2 < this.f18316OooO0oo.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.f18316OooO0oo.get(i2));
        }
        for (int i3 = 0; i3 < this.f18311OooO.size(); i3++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, this.f18311OooO.get(i3));
        }
        for (int i4 = 0; i4 < this.f18317OooOO0.size(); i4++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.f18317OooOO0.get(i4));
        }
        if (this.f18318OooOO0O != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, OooOO0());
        }
        if (this.f18319OooOO0o != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, OooO0o0());
        }
        if (this.f18321OooOOO0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(9, OooOO0O());
        }
        if (this.f18320OooOOO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(10, OooOOOo());
        }
        if (this.f18322OooOOOO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(11, OooO0Oo());
        }
        if (this.f18323OooOOOo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(12, OooO0oo());
        }
        if (this.f18325OooOOo0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(15, OooOOoo());
        }
        for (int i5 = 0; i5 < this.f18324OooOOo.size(); i5++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(18, this.f18324OooOOo.get(i5));
        }
        if (this.f18336OooOoo0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(20, OooO0oO());
        }
        if (this.f18326OooOOoo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(21, OooO());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18313OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(22, this.f18313OooO0o);
        }
        for (int i6 = 0; i6 < this.f18329OooOo00.size(); i6++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(23, this.f18329OooOo00.get(i6));
        }
        for (int i7 = 0; i7 < this.f18328OooOo0.size(); i7++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(24, this.f18328OooOo0.get(i7));
        }
        for (int i8 = 0; i8 < this.f18330OooOo0O.size(); i8++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(25, this.f18330OooOo0O.get(i8));
        }
        if (this.f18331OooOo0o != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(26, OooO0o());
        }
        if (this.f18327OooOo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(27, OooOOO0());
        }
        if (this.f18333OooOoO0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(28, OooOOO());
        }
        if (this.f18332OooOoO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(29, OooOOo());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18315OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(33, this.f18315OooO0oO);
        }
        if (this.f18334OooOoOO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(37, OooOOo0());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final String getTitle() {
        Object obj = this.f18314OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18314OooO0o0 = stringUtf8;
        return stringUtf8;
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
        int iHashCode = OooOO0o().hashCode() + ((((OooOOOO().hashCode() + ((((getTitle().hashCode() + ((((getName().hashCode() + o0O0O0Oo.OooO00o.OooO00o(o000OOo.f41242OooO00o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 22) * 53)) * 37) + 33) * 53);
        if (this.f18316OooO0oo.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 3, 53) + this.f18316OooO0oo.hashCode();
        }
        if (this.f18311OooO.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 4, 53) + this.f18311OooO.hashCode();
        }
        if (this.f18317OooOO0.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 5, 53) + this.f18317OooOO0.hashCode();
        }
        if (this.f18318OooOO0O != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 6, 53) + OooOO0().hashCode();
        }
        if (this.f18319OooOO0o != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 8, 53) + OooO0o0().hashCode();
        }
        if (this.f18321OooOOO0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 9, 53) + OooOO0O().hashCode();
        }
        if (this.f18320OooOOO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 10, 53) + OooOOOo().hashCode();
        }
        if (this.f18322OooOOOO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 11, 53) + OooO0Oo().hashCode();
        }
        if (this.f18323OooOOOo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 12, 53) + OooO0oo().hashCode();
        }
        if (this.f18325OooOOo0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 15, 53) + OooOOoo().hashCode();
        }
        if (this.f18324OooOOo.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 18, 53) + this.f18324OooOOo.hashCode();
        }
        if (this.f18326OooOOoo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 21, 53) + OooO().hashCode();
        }
        if (this.f18329OooOo00.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 23, 53) + this.f18329OooOo00.hashCode();
        }
        if (this.f18328OooOo0.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 24, 53) + this.f18328OooOo0.hashCode();
        }
        if (this.f18330OooOo0O.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 25, 53) + this.f18330OooOo0O.hashCode();
        }
        if (this.f18331OooOo0o != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 26, 53) + OooO0o().hashCode();
        }
        if (this.f18327OooOo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 27, 53) + OooOOO0().hashCode();
        }
        if (this.f18333OooOoO0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 28, 53) + OooOOO().hashCode();
        }
        if (this.f18332OooOoO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 29, 53) + OooOOo().hashCode();
        }
        if (this.f18334OooOoOO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 37, 53) + OooOOo0().hashCode();
        }
        if (this.f18336OooOoo0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 20, 53) + OooO0oO().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o000OOo.f41243OooO0O0.ensureFieldAccessorsInitialized(Service.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18335OooOoo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18335OooOoo = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18309OooOooO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Service();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18312OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18312OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18314OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18314OooO0o0);
        }
        for (int i = 0; i < this.f18316OooO0oo.size(); i++) {
            codedOutputStream.writeMessage(3, this.f18316OooO0oo.get(i));
        }
        for (int i2 = 0; i2 < this.f18311OooO.size(); i2++) {
            codedOutputStream.writeMessage(4, this.f18311OooO.get(i2));
        }
        for (int i3 = 0; i3 < this.f18317OooOO0.size(); i3++) {
            codedOutputStream.writeMessage(5, this.f18317OooOO0.get(i3));
        }
        if (this.f18318OooOO0O != null) {
            codedOutputStream.writeMessage(6, OooOO0());
        }
        if (this.f18319OooOO0o != null) {
            codedOutputStream.writeMessage(8, OooO0o0());
        }
        if (this.f18321OooOOO0 != null) {
            codedOutputStream.writeMessage(9, OooOO0O());
        }
        if (this.f18320OooOOO != null) {
            codedOutputStream.writeMessage(10, OooOOOo());
        }
        if (this.f18322OooOOOO != null) {
            codedOutputStream.writeMessage(11, OooO0Oo());
        }
        if (this.f18323OooOOOo != null) {
            codedOutputStream.writeMessage(12, OooO0oo());
        }
        if (this.f18325OooOOo0 != null) {
            codedOutputStream.writeMessage(15, OooOOoo());
        }
        for (int i4 = 0; i4 < this.f18324OooOOo.size(); i4++) {
            codedOutputStream.writeMessage(18, this.f18324OooOOo.get(i4));
        }
        if (this.f18336OooOoo0 != null) {
            codedOutputStream.writeMessage(20, OooO0oO());
        }
        if (this.f18326OooOOoo != null) {
            codedOutputStream.writeMessage(21, OooO());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18313OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 22, this.f18313OooO0o);
        }
        for (int i5 = 0; i5 < this.f18329OooOo00.size(); i5++) {
            codedOutputStream.writeMessage(23, this.f18329OooOo00.get(i5));
        }
        for (int i6 = 0; i6 < this.f18328OooOo0.size(); i6++) {
            codedOutputStream.writeMessage(24, this.f18328OooOo0.get(i6));
        }
        for (int i7 = 0; i7 < this.f18330OooOo0O.size(); i7++) {
            codedOutputStream.writeMessage(25, this.f18330OooOo0O.get(i7));
        }
        if (this.f18331OooOo0o != null) {
            codedOutputStream.writeMessage(26, OooO0o());
        }
        if (this.f18327OooOo != null) {
            codedOutputStream.writeMessage(27, OooOOO0());
        }
        if (this.f18333OooOoO0 != null) {
            codedOutputStream.writeMessage(28, OooOOO());
        }
        if (this.f18332OooOoO != null) {
            codedOutputStream.writeMessage(29, OooOOo());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18315OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 33, this.f18315OooO0oO);
        }
        if (this.f18334OooOoOO != null) {
            codedOutputStream.writeMessage(37, OooOOo0());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18309OooOooO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18309OooOooO.toBuilder();
    }

    private Service() {
        this.f18335OooOoo = (byte) -1;
        this.f18312OooO0Oo = "";
        this.f18314OooO0o0 = "";
        this.f18313OooO0o = "";
        this.f18315OooO0oO = "";
        this.f18316OooO0oo = Collections.emptyList();
        this.f18311OooO = Collections.emptyList();
        this.f18317OooOO0 = Collections.emptyList();
        this.f18324OooOOo = Collections.emptyList();
        this.f18329OooOo00 = Collections.emptyList();
        this.f18328OooOo0 = Collections.emptyList();
        this.f18330OooOo0O = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public Service(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    switch (tag) {
                        case 0:
                            break;
                        case 10:
                            this.f18312OooO0Oo = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 18:
                            this.f18314OooO0o0 = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 26:
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 == 0) {
                                this.f18316OooO0oo = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.f18316OooO0oo.add((Api) codedInputStream.readMessage(Api.parser(), extensionRegistryLite));
                            continue;
                        case 34:
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 == 0) {
                                this.f18311OooO = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.f18311OooO.add((Type) codedInputStream.readMessage(Type.parser(), extensionRegistryLite));
                            continue;
                        case 42:
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 == 0) {
                                this.f18317OooOO0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.f18317OooOO0.add((Enum) codedInputStream.readMessage(Enum.parser(), extensionRegistryLite));
                            continue;
                        case 50:
                            Documentation documentation = this.f18318OooOO0O;
                            Documentation.OooO0O0 builder = documentation != null ? documentation.toBuilder() : null;
                            Documentation documentation2 = (Documentation) codedInputStream.readMessage(Documentation.OooO0oO(), extensionRegistryLite);
                            this.f18318OooOO0O = documentation2;
                            if (builder != null) {
                                builder.OooO0oo(documentation2);
                                this.f18318OooOO0O = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 66:
                            Backend backend = this.f18319OooOO0o;
                            Backend.OooO0O0 builder2 = backend != null ? backend.toBuilder() : null;
                            Backend backend2 = (Backend) codedInputStream.readMessage(Backend.OooO0O0(), extensionRegistryLite);
                            this.f18319OooOO0o = backend2;
                            if (builder2 != null) {
                                builder2.OooO0oO(backend2);
                                this.f18319OooOO0o = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 74:
                            Http http = this.f18321OooOOO0;
                            Http.OooO0O0 builder3 = http != null ? http.toBuilder() : null;
                            Http http2 = (Http) codedInputStream.readMessage(Http.OooO0O0(), extensionRegistryLite);
                            this.f18321OooOOO0 = http2;
                            if (builder3 != null) {
                                builder3.OooO0oO(http2);
                                this.f18321OooOOO0 = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 82:
                            Quota quota = this.f18320OooOOO;
                            Quota.OooO0O0 builder4 = quota != null ? quota.toBuilder() : null;
                            Quota quota2 = (Quota) codedInputStream.readMessage(Quota.OooO0O0(), extensionRegistryLite);
                            this.f18320OooOOO = quota2;
                            if (builder4 != null) {
                                builder4.OooO0oo(quota2);
                                this.f18320OooOOO = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 90:
                            Authentication authentication = this.f18322OooOOOO;
                            Authentication.OooO0O0 builder5 = authentication != null ? authentication.toBuilder() : null;
                            Authentication authentication2 = (Authentication) codedInputStream.readMessage(Authentication.OooO0O0(), extensionRegistryLite);
                            this.f18322OooOOOO = authentication2;
                            if (builder5 != null) {
                                builder5.OooO0oo(authentication2);
                                this.f18322OooOOOO = builder5.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 98:
                            Context context = this.f18323OooOOOo;
                            Context.OooO0O0 builder6 = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) codedInputStream.readMessage(Context.OooO0O0(), extensionRegistryLite);
                            this.f18323OooOOOo = context2;
                            if (builder6 != null) {
                                builder6.OooO0oO(context2);
                                this.f18323OooOOOo = builder6.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 122:
                            Usage usage = this.f18325OooOOo0;
                            Usage.OooO0O0 builder7 = usage != null ? usage.toBuilder() : null;
                            Usage usage2 = (Usage) codedInputStream.readMessage(Usage.OooO0OO(), extensionRegistryLite);
                            this.f18325OooOOo0 = usage2;
                            if (builder7 != null) {
                                builder7.OooO0oO(usage2);
                                this.f18325OooOOo0 = builder7.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 146:
                            int i5 = (i == true ? 1 : 0) & 8;
                            i = i;
                            if (i5 == 0) {
                                this.f18324OooOOo = new ArrayList();
                                i = (i == true ? 1 : 0) | 8;
                            }
                            this.f18324OooOOo.add((Endpoint) codedInputStream.readMessage(Endpoint.OooO0OO(), extensionRegistryLite));
                            continue;
                        case 162:
                            UInt32Value uInt32Value = this.f18336OooOoo0;
                            UInt32Value.Builder builder8 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                            UInt32Value uInt32Value2 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                            this.f18336OooOoo0 = uInt32Value2;
                            if (builder8 != null) {
                                builder8.mergeFrom(uInt32Value2);
                                this.f18336OooOoo0 = builder8.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 170:
                            Control control = this.f18326OooOOoo;
                            Control.OooO0O0 builder9 = control != null ? control.toBuilder() : null;
                            Control control2 = (Control) codedInputStream.readMessage(Control.OooO0OO(), extensionRegistryLite);
                            this.f18326OooOOoo = control2;
                            if (builder9 != null) {
                                builder9.OooO0o0(control2);
                                this.f18326OooOOoo = builder9.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 178:
                            this.f18313OooO0o = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 186:
                            int i6 = (i == true ? 1 : 0) & 16;
                            i = i;
                            if (i6 == 0) {
                                this.f18329OooOo00 = new ArrayList();
                                i = (i == true ? 1 : 0) | 16;
                            }
                            this.f18329OooOo00.add((LogDescriptor) codedInputStream.readMessage(LogDescriptor.OooO0OO(), extensionRegistryLite));
                            continue;
                        case 194:
                            int i7 = (i == true ? 1 : 0) & 32;
                            i = i;
                            if (i7 == 0) {
                                this.f18328OooOo0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 32;
                            }
                            this.f18328OooOo0.add((MetricDescriptor) codedInputStream.readMessage(MetricDescriptor.OooO0o0(), extensionRegistryLite));
                            continue;
                        case 202:
                            int i8 = (i == true ? 1 : 0) & 64;
                            i = i;
                            if (i8 == 0) {
                                this.f18330OooOo0O = new ArrayList();
                                i = (i == true ? 1 : 0) | 64;
                            }
                            this.f18330OooOo0O.add((MonitoredResourceDescriptor) codedInputStream.readMessage(MonitoredResourceDescriptor.OooO0Oo(), extensionRegistryLite));
                            continue;
                        case 210:
                            Billing billing = this.f18331OooOo0o;
                            Billing.OooO0O0 builder10 = billing != null ? billing.toBuilder() : null;
                            Billing billing2 = (Billing) codedInputStream.readMessage(Billing.OooO0O0(), extensionRegistryLite);
                            this.f18331OooOo0o = billing2;
                            if (builder10 != null) {
                                builder10.OooO0oO(billing2);
                                this.f18331OooOo0o = builder10.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 218:
                            Logging logging = this.f18327OooOo;
                            Logging.OooO0O0 builder11 = logging != null ? logging.toBuilder() : null;
                            Logging logging2 = (Logging) codedInputStream.readMessage(Logging.OooO0OO(), extensionRegistryLite);
                            this.f18327OooOo = logging2;
                            if (builder11 != null) {
                                builder11.OooO0oo(logging2);
                                this.f18327OooOo = builder11.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 226:
                            Monitoring monitoring = this.f18333OooOoO0;
                            Monitoring.OooO0O0 builder12 = monitoring != null ? monitoring.toBuilder() : null;
                            Monitoring monitoring2 = (Monitoring) codedInputStream.readMessage(Monitoring.OooO0OO(), extensionRegistryLite);
                            this.f18333OooOoO0 = monitoring2;
                            if (builder12 != null) {
                                builder12.OooO0oo(monitoring2);
                                this.f18333OooOoO0 = builder12.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 234:
                            SystemParameters systemParameters = this.f18332OooOoO;
                            SystemParameters.OooO0O0 builder13 = systemParameters != null ? systemParameters.toBuilder() : null;
                            SystemParameters systemParameters2 = (SystemParameters) codedInputStream.readMessage(SystemParameters.OooO0O0(), extensionRegistryLite);
                            this.f18332OooOoO = systemParameters2;
                            if (builder13 != null) {
                                builder13.OooO0oO(systemParameters2);
                                this.f18332OooOoO = builder13.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 266:
                            this.f18315OooO0oO = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 298:
                            SourceInfo sourceInfo = this.f18334OooOoOO;
                            SourceInfo.OooO0O0 builder14 = sourceInfo != null ? sourceInfo.toBuilder() : null;
                            SourceInfo sourceInfo2 = (SourceInfo) codedInputStream.readMessage(SourceInfo.OooO0O0(), extensionRegistryLite);
                            this.f18334OooOoOO = sourceInfo2;
                            if (builder14 != null) {
                                builder14.OooO0oO(sourceInfo2);
                                this.f18334OooOoOO = builder14.buildPartial();
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
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 1) != 0) {
                    this.f18316OooO0oo = Collections.unmodifiableList(this.f18316OooO0oo);
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.f18311OooO = Collections.unmodifiableList(this.f18311OooO);
                }
                if (((i == true ? 1 : 0) & 4) != 0) {
                    this.f18317OooOO0 = Collections.unmodifiableList(this.f18317OooOO0);
                }
                if (((i == true ? 1 : 0) & 8) != 0) {
                    this.f18324OooOOo = Collections.unmodifiableList(this.f18324OooOOo);
                }
                if (((i == true ? 1 : 0) & 16) != 0) {
                    this.f18329OooOo00 = Collections.unmodifiableList(this.f18329OooOo00);
                }
                if (((i == true ? 1 : 0) & 32) != 0) {
                    this.f18328OooOo0 = Collections.unmodifiableList(this.f18328OooOo0);
                }
                if (((i == true ? 1 : 0) & 64) != 0) {
                    this.f18330OooOo0O = Collections.unmodifiableList(this.f18330OooOo0O);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) != 0) {
            this.f18316OooO0oo = Collections.unmodifiableList(this.f18316OooO0oo);
        }
        if (((i == true ? 1 : 0) & 2) != 0) {
            this.f18311OooO = Collections.unmodifiableList(this.f18311OooO);
        }
        if (((i == true ? 1 : 0) & 4) != 0) {
            this.f18317OooOO0 = Collections.unmodifiableList(this.f18317OooOO0);
        }
        if (((i == true ? 1 : 0) & 8) != 0) {
            this.f18324OooOOo = Collections.unmodifiableList(this.f18324OooOOo);
        }
        if (((i == true ? 1 : 0) & 16) != 0) {
            this.f18329OooOo00 = Collections.unmodifiableList(this.f18329OooOo00);
        }
        if (((i == true ? 1 : 0) & 32) != 0) {
            this.f18328OooOo0 = Collections.unmodifiableList(this.f18328OooOo0);
        }
        if (((i == true ? 1 : 0) & 64) != 0) {
            this.f18330OooOo0O = Collections.unmodifiableList(this.f18330OooOo0O);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
