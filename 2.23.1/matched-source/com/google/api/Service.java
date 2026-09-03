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
    public static final Service f18314OooOooO = new Service();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO00o f18315OooOooo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<Type> f18316OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18317OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18318OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18319OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18320OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<Api> f18321OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<Enum> f18322OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Documentation f18323OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Backend f18324OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Quota f18325OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Http f18326OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Authentication f18327OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Context f18328OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public List<Endpoint> f18329OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Usage f18330OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Control f18331OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Logging f18332OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public List<MetricDescriptor> f18333OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public List<LogDescriptor> f18334OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public List<MonitoredResourceDescriptor> f18335OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Billing f18336OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public SystemParameters f18337OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Monitoring f18338OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public SourceInfo f18339OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public byte f18340OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public UInt32Value f18341OooOoo0;

    public static class OooO00o extends AbstractParser<Service> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Service(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public List<Api> f18342OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18343OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18344OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18345OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18346OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18347OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> f18348OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public List<Type> f18349OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> f18350OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> f18351OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public List<Enum> f18352OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Documentation f18353OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Backend f18354OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public Quota f18355OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public Http f18356OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public Authentication f18357OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Control f18358OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public Usage f18359OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public Context f18360OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public List<Endpoint> f18361OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> f18362OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.OooO0O0, Object> f18363OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List<LogDescriptor> f18364OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public List<MetricDescriptor> f18365OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public List<MonitoredResourceDescriptor> f18366OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> f18367OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> f18368OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public Billing f18369OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public SourceInfo f18370Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public Logging f18371Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public Monitoring f18372Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public SystemParameters f18373Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public UInt32Value f18374Oooo0O0;

        public OooO0O0() {
            this.f18345OooO0o0 = "";
            this.f18344OooO0o = "";
            this.f18346OooO0oO = "";
            this.f18347OooO0oo = "";
            this.f18342OooO = Collections.emptyList();
            this.f18349OooOO0O = Collections.emptyList();
            this.f18352OooOOO0 = Collections.emptyList();
            this.f18361OooOo0O = Collections.emptyList();
            this.f18364OooOoO0 = Collections.emptyList();
            this.f18365OooOoOO = Collections.emptyList();
            this.f18366OooOoo = Collections.emptyList();
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
            if (this.f18363OooOoO == null) {
                this.f18363OooOoO = new RepeatedFieldBuilderV3<>(this.f18364OooOoO0, (this.f18343OooO0Oo & 16) != 0, getParentForChildren(), isClean());
                this.f18364OooOoO0 = null;
            }
            return this.f18363OooOoO;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Service buildPartial() {
            Service service = new Service(this);
            service.f18317OooO0Oo = this.f18345OooO0o0;
            service.f18319OooO0o0 = this.f18344OooO0o;
            service.f18318OooO0o = this.f18346OooO0oO;
            service.f18320OooO0oO = this.f18347OooO0oo;
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.f18348OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18343OooO0Oo & 1) != 0) {
                    this.f18342OooO = Collections.unmodifiableList(this.f18342OooO);
                    this.f18343OooO0Oo &= -2;
                }
                service.f18321OooO0oo = this.f18342OooO;
            } else {
                service.f18321OooO0oo = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV4 = this.f18350OooOO0o;
            if (repeatedFieldBuilderV4 == null) {
                if ((this.f18343OooO0Oo & 2) != 0) {
                    this.f18349OooOO0O = Collections.unmodifiableList(this.f18349OooOO0O);
                    this.f18343OooO0Oo &= -3;
                }
                service.f18316OooO = this.f18349OooOO0O;
            } else {
                service.f18316OooO = repeatedFieldBuilderV4.build();
            }
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV5 = this.f18351OooOOO;
            if (repeatedFieldBuilderV5 == null) {
                if ((this.f18343OooO0Oo & 4) != 0) {
                    this.f18352OooOOO0 = Collections.unmodifiableList(this.f18352OooOOO0);
                    this.f18343OooO0Oo &= -5;
                }
                service.f18322OooOO0 = this.f18352OooOOO0;
            } else {
                service.f18322OooOO0 = repeatedFieldBuilderV5.build();
            }
            service.f18323OooOO0O = this.f18353OooOOOO;
            service.f18324OooOO0o = this.f18354OooOOOo;
            service.f18326OooOOO0 = this.f18356OooOOo0;
            service.f18325OooOOO = this.f18355OooOOo;
            service.f18327OooOOOO = this.f18357OooOOoo;
            service.f18328OooOOOo = this.f18360OooOo00;
            service.f18330OooOOo0 = this.f18359OooOo0;
            RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> repeatedFieldBuilderV6 = this.f18362OooOo0o;
            if (repeatedFieldBuilderV6 == null) {
                if ((this.f18343OooO0Oo & 8) != 0) {
                    this.f18361OooOo0O = Collections.unmodifiableList(this.f18361OooOo0O);
                    this.f18343OooO0Oo &= -9;
                }
                service.f18329OooOOo = this.f18361OooOo0O;
            } else {
                service.f18329OooOOo = repeatedFieldBuilderV6.build();
            }
            service.f18331OooOOoo = this.f18358OooOo;
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.OooO0O0, Object> repeatedFieldBuilderV7 = this.f18363OooOoO;
            if (repeatedFieldBuilderV7 == null) {
                if ((this.f18343OooO0Oo & 16) != 0) {
                    this.f18364OooOoO0 = Collections.unmodifiableList(this.f18364OooOoO0);
                    this.f18343OooO0Oo &= -17;
                }
                service.f18334OooOo00 = this.f18364OooOoO0;
            } else {
                service.f18334OooOo00 = repeatedFieldBuilderV7.build();
            }
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> repeatedFieldBuilderV8 = this.f18367OooOoo0;
            if (repeatedFieldBuilderV8 == null) {
                if ((this.f18343OooO0Oo & 32) != 0) {
                    this.f18365OooOoOO = Collections.unmodifiableList(this.f18365OooOoOO);
                    this.f18343OooO0Oo &= -33;
                }
                service.f18333OooOo0 = this.f18365OooOoOO;
            } else {
                service.f18333OooOo0 = repeatedFieldBuilderV8.build();
            }
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> repeatedFieldBuilderV9 = this.f18368OooOooO;
            if (repeatedFieldBuilderV9 == null) {
                if ((this.f18343OooO0Oo & 64) != 0) {
                    this.f18366OooOoo = Collections.unmodifiableList(this.f18366OooOoo);
                    this.f18343OooO0Oo &= -65;
                }
                service.f18335OooOo0O = this.f18366OooOoo;
            } else {
                service.f18335OooOo0O = repeatedFieldBuilderV9.build();
            }
            service.f18336OooOo0o = this.f18369OooOooo;
            service.f18332OooOo = this.f18371Oooo000;
            service.f18338OooOoO0 = this.f18372Oooo00O;
            service.f18337OooOoO = this.f18373Oooo00o;
            service.f18339OooOoOO = this.f18370Oooo0;
            service.f18341OooOoo0 = this.f18374Oooo0O0;
            onBuilt();
            return service;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18345OooO0o0 = "";
            this.f18344OooO0o = "";
            this.f18346OooO0oO = "";
            this.f18347OooO0oo = "";
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.f18348OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                this.f18342OooO = Collections.emptyList();
                this.f18343OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV4 = this.f18350OooOO0o;
            if (repeatedFieldBuilderV4 == null) {
                this.f18349OooOO0O = Collections.emptyList();
                this.f18343OooO0Oo &= -3;
            } else {
                repeatedFieldBuilderV4.clear();
            }
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV5 = this.f18351OooOOO;
            if (repeatedFieldBuilderV5 == null) {
                this.f18352OooOOO0 = Collections.emptyList();
                this.f18343OooO0Oo &= -5;
            } else {
                repeatedFieldBuilderV5.clear();
            }
            this.f18353OooOOOO = null;
            this.f18354OooOOOo = null;
            this.f18356OooOOo0 = null;
            this.f18355OooOOo = null;
            this.f18357OooOOoo = null;
            this.f18360OooOo00 = null;
            this.f18359OooOo0 = null;
            RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> repeatedFieldBuilderV6 = this.f18362OooOo0o;
            if (repeatedFieldBuilderV6 == null) {
                this.f18361OooOo0O = Collections.emptyList();
                this.f18343OooO0Oo &= -9;
            } else {
                repeatedFieldBuilderV6.clear();
            }
            this.f18358OooOo = null;
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.OooO0O0, Object> repeatedFieldBuilderV7 = this.f18363OooOoO;
            if (repeatedFieldBuilderV7 == null) {
                this.f18364OooOoO0 = Collections.emptyList();
                this.f18343OooO0Oo &= -17;
            } else {
                repeatedFieldBuilderV7.clear();
            }
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> repeatedFieldBuilderV8 = this.f18367OooOoo0;
            if (repeatedFieldBuilderV8 == null) {
                this.f18365OooOoOO = Collections.emptyList();
                this.f18343OooO0Oo &= -33;
            } else {
                repeatedFieldBuilderV8.clear();
            }
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> repeatedFieldBuilderV9 = this.f18368OooOooO;
            if (repeatedFieldBuilderV9 == null) {
                this.f18366OooOoo = Collections.emptyList();
                this.f18343OooO0Oo &= -65;
            } else {
                repeatedFieldBuilderV9.clear();
            }
            this.f18369OooOooo = null;
            this.f18371Oooo000 = null;
            this.f18372Oooo00O = null;
            this.f18373Oooo00o = null;
            this.f18370Oooo0 = null;
            this.f18374Oooo0O0 = null;
        }

        public final RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> OooO0o() {
            if (this.f18348OooOO0 == null) {
                this.f18348OooOO0 = new RepeatedFieldBuilderV3<>(this.f18342OooO, (this.f18343OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18342OooO = null;
            }
            return this.f18348OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final RepeatedFieldBuilderV3<Endpoint, Endpoint.OooO0O0, Object> OooO0oO() {
            if (this.f18362OooOo0o == null) {
                this.f18362OooOo0o = new RepeatedFieldBuilderV3<>(this.f18361OooOo0O, (this.f18343OooO0Oo & 8) != 0, getParentForChildren(), isClean());
                this.f18361OooOo0O = null;
            }
            return this.f18362OooOo0o;
        }

        public final RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> OooO0oo() {
            if (this.f18351OooOOO == null) {
                this.f18351OooOOO = new RepeatedFieldBuilderV3<>(this.f18352OooOOO0, (this.f18343OooO0Oo & 4) != 0, getParentForChildren(), isClean());
                this.f18352OooOOO0 = null;
            }
            return this.f18351OooOOO;
        }

        public final RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.OooO0O0, Object> OooOO0() {
            if (this.f18367OooOoo0 == null) {
                this.f18367OooOoo0 = new RepeatedFieldBuilderV3<>(this.f18365OooOoOO, (this.f18343OooO0Oo & 32) != 0, getParentForChildren(), isClean());
                this.f18365OooOoOO = null;
            }
            return this.f18367OooOoo0;
        }

        public final RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.OooO0O0, Object> OooOO0O() {
            if (this.f18368OooOooO == null) {
                this.f18368OooOooO = new RepeatedFieldBuilderV3<>(this.f18366OooOoo, (this.f18343OooO0Oo & 64) != 0, getParentForChildren(), isClean());
                this.f18366OooOoo = null;
            }
            return this.f18368OooOooO;
        }

        public final RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> OooOO0o() {
            if (this.f18350OooOO0o == null) {
                this.f18350OooOO0o = new RepeatedFieldBuilderV3<>(this.f18349OooOO0O, (this.f18343OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f18349OooOO0O = null;
            }
            return this.f18350OooOO0o;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooOOO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Service service;
            try {
                try {
                    Service.f18315OooOooo.getClass();
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
            if (service == Service.f18314OooOooO) {
                return;
            }
            if (!service.getName().isEmpty()) {
                this.f18345OooO0o0 = service.f18317OooO0Oo;
                onChanged();
            }
            if (!service.getTitle().isEmpty()) {
                this.f18344OooO0o = service.f18319OooO0o0;
                onChanged();
            }
            if (!service.OooOOOO().isEmpty()) {
                this.f18346OooO0oO = service.f18318OooO0o;
                onChanged();
            }
            if (!service.OooOO0o().isEmpty()) {
                this.f18347OooO0oo = service.f18320OooO0oO;
                onChanged();
            }
            if (this.f18348OooOO0 == null) {
                if (!service.f18321OooO0oo.isEmpty()) {
                    if (this.f18342OooO.isEmpty()) {
                        this.f18342OooO = service.f18321OooO0oo;
                        this.f18343OooO0Oo &= -2;
                    } else {
                        if ((this.f18343OooO0Oo & 1) == 0) {
                            this.f18342OooO = new ArrayList(this.f18342OooO);
                            this.f18343OooO0Oo |= 1;
                        }
                        this.f18342OooO.addAll(service.f18321OooO0oo);
                    }
                    onChanged();
                }
            } else if (!service.f18321OooO0oo.isEmpty()) {
                if (this.f18348OooOO0.isEmpty()) {
                    this.f18348OooOO0.dispose();
                    this.f18348OooOO0 = null;
                    this.f18342OooO = service.f18321OooO0oo;
                    this.f18343OooO0Oo &= -2;
                    this.f18348OooOO0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18348OooOO0.addAllMessages(service.f18321OooO0oo);
                }
            }
            if (this.f18350OooOO0o == null) {
                if (!service.f18316OooO.isEmpty()) {
                    if (this.f18349OooOO0O.isEmpty()) {
                        this.f18349OooOO0O = service.f18316OooO;
                        this.f18343OooO0Oo &= -3;
                    } else {
                        if ((this.f18343OooO0Oo & 2) == 0) {
                            this.f18349OooOO0O = new ArrayList(this.f18349OooOO0O);
                            this.f18343OooO0Oo |= 2;
                        }
                        this.f18349OooOO0O.addAll(service.f18316OooO);
                    }
                    onChanged();
                }
            } else if (!service.f18316OooO.isEmpty()) {
                if (this.f18350OooOO0o.isEmpty()) {
                    this.f18350OooOO0o.dispose();
                    this.f18350OooOO0o = null;
                    this.f18349OooOO0O = service.f18316OooO;
                    this.f18343OooO0Oo &= -3;
                    this.f18350OooOO0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooOO0o() : null;
                } else {
                    this.f18350OooOO0o.addAllMessages(service.f18316OooO);
                }
            }
            if (this.f18351OooOOO == null) {
                if (!service.f18322OooOO0.isEmpty()) {
                    if (this.f18352OooOOO0.isEmpty()) {
                        this.f18352OooOOO0 = service.f18322OooOO0;
                        this.f18343OooO0Oo &= -5;
                    } else {
                        if ((this.f18343OooO0Oo & 4) == 0) {
                            this.f18352OooOOO0 = new ArrayList(this.f18352OooOOO0);
                            this.f18343OooO0Oo |= 4;
                        }
                        this.f18352OooOOO0.addAll(service.f18322OooOO0);
                    }
                    onChanged();
                }
            } else if (!service.f18322OooOO0.isEmpty()) {
                if (this.f18351OooOOO.isEmpty()) {
                    this.f18351OooOOO.dispose();
                    this.f18351OooOOO = null;
                    this.f18352OooOOO0 = service.f18322OooOO0;
                    this.f18343OooO0Oo &= -5;
                    this.f18351OooOOO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oo() : null;
                } else {
                    this.f18351OooOOO.addAllMessages(service.f18322OooOO0);
                }
            }
            if (service.f18323OooOO0O != null) {
                Documentation documentationOooOO0 = service.OooOO0();
                Documentation documentation = this.f18353OooOOOO;
                if (documentation != null) {
                    Documentation.OooO0O0 builder = Documentation.f17977OooOO0O.toBuilder();
                    builder.OooO0oo(documentation);
                    builder.OooO0oo(documentationOooOO0);
                    this.f18353OooOOOO = builder.buildPartial();
                } else {
                    this.f18353OooOOOO = documentationOooOO0;
                }
                onChanged();
            }
            if (service.f18324OooOO0o != null) {
                Backend backendOooO0o0 = service.OooO0o0();
                Backend backend = this.f18354OooOOOo;
                if (backend != null) {
                    Backend.OooO0O0 builder2 = Backend.f17814OooO0o.toBuilder();
                    builder2.OooO0oO(backend);
                    builder2.OooO0oO(backendOooO0o0);
                    this.f18354OooOOOo = builder2.buildPartial();
                } else {
                    this.f18354OooOOOo = backendOooO0o0;
                }
                onChanged();
            }
            if (service.f18326OooOOO0 != null) {
                Http httpOooOO0O = service.OooOO0O();
                Http http = this.f18356OooOOo0;
                if (http != null) {
                    Http.OooO0O0 builder3 = Http.f18016OooO0oO.toBuilder();
                    builder3.OooO0oO(http);
                    builder3.OooO0oO(httpOooOO0O);
                    this.f18356OooOOo0 = builder3.buildPartial();
                } else {
                    this.f18356OooOOo0 = httpOooOO0O;
                }
                onChanged();
            }
            if (service.f18325OooOOO != null) {
                Quota quotaOooOOOo = service.OooOOOo();
                Quota quota = this.f18355OooOOo;
                if (quota != null) {
                    Quota.OooO0O0 builder4 = Quota.f18239OooO0oO.toBuilder();
                    builder4.OooO0oo(quota);
                    builder4.OooO0oo(quotaOooOOOo);
                    this.f18355OooOOo = builder4.buildPartial();
                } else {
                    this.f18355OooOOo = quotaOooOOOo;
                }
                onChanged();
            }
            if (service.f18327OooOOOO != null) {
                Authentication authenticationOooO0Oo = service.OooO0Oo();
                Authentication authentication = this.f18357OooOOoo;
                if (authentication != null) {
                    Authentication.OooO0O0 builder5 = Authentication.f17791OooO0oO.toBuilder();
                    builder5.OooO0oo(authentication);
                    builder5.OooO0oo(authenticationOooO0Oo);
                    this.f18357OooOOoo = builder5.buildPartial();
                } else {
                    this.f18357OooOOoo = authenticationOooO0Oo;
                }
                onChanged();
            }
            if (service.f18328OooOOOo != null) {
                Context contextOooO0oo = service.OooO0oo();
                Context context = this.f18360OooOo00;
                if (context != null) {
                    Context.OooO0O0 builder6 = Context.f17873OooO0o.toBuilder();
                    builder6.OooO0oO(context);
                    builder6.OooO0oO(contextOooO0oo);
                    this.f18360OooOo00 = builder6.buildPartial();
                } else {
                    this.f18360OooOo00 = contextOooO0oo;
                }
                onChanged();
            }
            if (service.f18330OooOOo0 != null) {
                Usage usageOooOOoo = service.OooOOoo();
                Usage usage = this.f18359OooOo0;
                if (usage != null) {
                    Usage.OooO0O0 builder7 = Usage.f18408OooO0oo.toBuilder();
                    builder7.OooO0oO(usage);
                    builder7.OooO0oO(usageOooOOoo);
                    this.f18359OooOo0 = builder7.buildPartial();
                } else {
                    this.f18359OooOo0 = usageOooOOoo;
                }
                onChanged();
            }
            if (this.f18362OooOo0o == null) {
                if (!service.f18329OooOOo.isEmpty()) {
                    if (this.f18361OooOo0O.isEmpty()) {
                        this.f18361OooOo0O = service.f18329OooOOo;
                        this.f18343OooO0Oo &= -9;
                    } else {
                        if ((this.f18343OooO0Oo & 8) == 0) {
                            this.f18361OooOo0O = new ArrayList(this.f18361OooOo0O);
                            this.f18343OooO0Oo |= 8;
                        }
                        this.f18361OooOo0O.addAll(service.f18329OooOOo);
                    }
                    onChanged();
                }
            } else if (!service.f18329OooOOo.isEmpty()) {
                if (this.f18362OooOo0o.isEmpty()) {
                    this.f18362OooOo0o.dispose();
                    this.f18362OooOo0o = null;
                    this.f18361OooOo0O = service.f18329OooOOo;
                    this.f18343OooO0Oo &= -9;
                    this.f18362OooOo0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oO() : null;
                } else {
                    this.f18362OooOo0o.addAllMessages(service.f18329OooOOo);
                }
            }
            if (service.f18331OooOOoo != null) {
                Control controlOooO = service.OooO();
                Control control = this.f18358OooOo;
                if (control != null) {
                    Control.OooO0O0 builder8 = Control.f17894OooO0o.toBuilder();
                    builder8.OooO0o0(control);
                    builder8.OooO0o0(controlOooO);
                    this.f18358OooOo = builder8.buildPartial();
                } else {
                    this.f18358OooOo = controlOooO;
                }
                onChanged();
            }
            if (this.f18363OooOoO == null) {
                if (!service.f18334OooOo00.isEmpty()) {
                    if (this.f18364OooOoO0.isEmpty()) {
                        this.f18364OooOoO0 = service.f18334OooOo00;
                        this.f18343OooO0Oo &= -17;
                    } else {
                        if ((this.f18343OooO0Oo & 16) == 0) {
                            this.f18364OooOoO0 = new ArrayList(this.f18364OooOoO0);
                            this.f18343OooO0Oo |= 16;
                        }
                        this.f18364OooOoO0.addAll(service.f18334OooOo00);
                    }
                    onChanged();
                }
            } else if (!service.f18334OooOo00.isEmpty()) {
                if (this.f18363OooOoO.isEmpty()) {
                    this.f18363OooOoO.dispose();
                    this.f18363OooOoO = null;
                    this.f18364OooOoO0 = service.f18334OooOo00;
                    this.f18343OooO0Oo &= -17;
                    this.f18363OooOoO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO() : null;
                } else {
                    this.f18363OooOoO.addAllMessages(service.f18334OooOo00);
                }
            }
            if (this.f18367OooOoo0 == null) {
                if (!service.f18333OooOo0.isEmpty()) {
                    if (this.f18365OooOoOO.isEmpty()) {
                        this.f18365OooOoOO = service.f18333OooOo0;
                        this.f18343OooO0Oo &= -33;
                    } else {
                        if ((this.f18343OooO0Oo & 32) == 0) {
                            this.f18365OooOoOO = new ArrayList(this.f18365OooOoOO);
                            this.f18343OooO0Oo |= 32;
                        }
                        this.f18365OooOoOO.addAll(service.f18333OooOo0);
                    }
                    onChanged();
                }
            } else if (!service.f18333OooOo0.isEmpty()) {
                if (this.f18367OooOoo0.isEmpty()) {
                    this.f18367OooOoo0.dispose();
                    this.f18367OooOoo0 = null;
                    this.f18365OooOoOO = service.f18333OooOo0;
                    this.f18343OooO0Oo &= -33;
                    this.f18367OooOoo0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooOO0() : null;
                } else {
                    this.f18367OooOoo0.addAllMessages(service.f18333OooOo0);
                }
            }
            if (this.f18368OooOooO == null) {
                if (!service.f18335OooOo0O.isEmpty()) {
                    if (this.f18366OooOoo.isEmpty()) {
                        this.f18366OooOoo = service.f18335OooOo0O;
                        this.f18343OooO0Oo &= -65;
                    } else {
                        if ((this.f18343OooO0Oo & 64) == 0) {
                            this.f18366OooOoo = new ArrayList(this.f18366OooOoo);
                            this.f18343OooO0Oo |= 64;
                        }
                        this.f18366OooOoo.addAll(service.f18335OooOo0O);
                    }
                    onChanged();
                }
            } else if (!service.f18335OooOo0O.isEmpty()) {
                if (this.f18368OooOooO.isEmpty()) {
                    this.f18368OooOooO.dispose();
                    this.f18368OooOooO = null;
                    this.f18366OooOoo = service.f18335OooOo0O;
                    this.f18343OooO0Oo &= -65;
                    this.f18368OooOooO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooOO0O() : null;
                } else {
                    this.f18368OooOooO.addAllMessages(service.f18335OooOo0O);
                }
            }
            if (service.f18336OooOo0o != null) {
                Billing billingOooO0o = service.OooO0o();
                Billing billing = this.f18369OooOooo;
                if (billing != null) {
                    Billing.OooO0O0 builder9 = Billing.f17843OooO0o.toBuilder();
                    builder9.OooO0oO(billing);
                    builder9.OooO0oO(billingOooO0o);
                    this.f18369OooOooo = builder9.buildPartial();
                } else {
                    this.f18369OooOooo = billingOooO0o;
                }
                onChanged();
            }
            if (service.f18332OooOo != null) {
                Logging loggingOooOOO0 = service.OooOOO0();
                Logging logging = this.f18371Oooo000;
                if (logging != null) {
                    Logging.OooO0O0 builder10 = Logging.f18086OooO0oO.toBuilder();
                    builder10.OooO0oo(logging);
                    builder10.OooO0oo(loggingOooOOO0);
                    this.f18371Oooo000 = builder10.buildPartial();
                } else {
                    this.f18371Oooo000 = loggingOooOOO0;
                }
                onChanged();
            }
            if (service.f18338OooOoO0 != null) {
                Monitoring monitoringOooOOO = service.OooOOO();
                Monitoring monitoring = this.f18372Oooo00O;
                if (monitoring != null) {
                    Monitoring.OooO0O0 builder11 = Monitoring.f18189OooO0oO.toBuilder();
                    builder11.OooO0oo(monitoring);
                    builder11.OooO0oo(monitoringOooOOO);
                    this.f18372Oooo00O = builder11.buildPartial();
                } else {
                    this.f18372Oooo00O = monitoringOooOOO;
                }
                onChanged();
            }
            if (service.f18337OooOoO != null) {
                SystemParameters systemParametersOooOOo = service.OooOOo();
                SystemParameters systemParameters = this.f18373Oooo00o;
                if (systemParameters != null) {
                    SystemParameters.OooO0O0 builder12 = SystemParameters.f18400OooO0o.toBuilder();
                    builder12.OooO0oO(systemParameters);
                    builder12.OooO0oO(systemParametersOooOOo);
                    this.f18373Oooo00o = builder12.buildPartial();
                } else {
                    this.f18373Oooo00o = systemParametersOooOOo;
                }
                onChanged();
            }
            if (service.f18339OooOoOO != null) {
                SourceInfo sourceInfoOooOOo0 = service.OooOOo0();
                SourceInfo sourceInfo = this.f18370Oooo0;
                if (sourceInfo != null) {
                    SourceInfo.OooO0O0 builder13 = SourceInfo.f18375OooO0o.toBuilder();
                    builder13.OooO0oO(sourceInfo);
                    builder13.OooO0oO(sourceInfoOooOOo0);
                    this.f18370Oooo0 = builder13.buildPartial();
                } else {
                    this.f18370Oooo0 = sourceInfoOooOOo0;
                }
                onChanged();
            }
            if (service.f18341OooOoo0 != null) {
                UInt32Value uInt32ValueOooO0oO = service.OooO0oO();
                UInt32Value uInt32Value = this.f18374Oooo0O0;
                if (uInt32Value != null) {
                    this.f18374Oooo0O0 = UInt32Value.newBuilder(uInt32Value).mergeFrom(uInt32ValueOooO0oO).buildPartial();
                } else {
                    this.f18374Oooo0O0 = uInt32ValueOooO0oO;
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
            return Service.f18314OooOooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o000OOo.f41237OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000OOo.f41238OooO0O0.ensureFieldAccessorsInitialized(Service.class, OooO0O0.class);
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
            return Service.f18314OooOooO;
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
            this.f18345OooO0o0 = "";
            this.f18344OooO0o = "";
            this.f18346OooO0oO = "";
            this.f18347OooO0oo = "";
            this.f18342OooO = Collections.emptyList();
            this.f18349OooOO0O = Collections.emptyList();
            this.f18352OooOOO0 = Collections.emptyList();
            this.f18361OooOo0O = Collections.emptyList();
            this.f18364OooOoO0 = Collections.emptyList();
            this.f18365OooOoOO = Collections.emptyList();
            this.f18366OooOoo = Collections.emptyList();
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
        this.f18340OooOoo = (byte) -1;
    }

    public final Control OooO() {
        Control control = this.f18331OooOOoo;
        return control == null ? Control.f17894OooO0o : control;
    }

    public final Authentication OooO0Oo() {
        Authentication authentication = this.f18327OooOOOO;
        return authentication == null ? Authentication.f17791OooO0oO : authentication;
    }

    public final Billing OooO0o() {
        Billing billing = this.f18336OooOo0o;
        return billing == null ? Billing.f17843OooO0o : billing;
    }

    public final Backend OooO0o0() {
        Backend backend = this.f18324OooOO0o;
        return backend == null ? Backend.f17814OooO0o : backend;
    }

    @Deprecated
    public final UInt32Value OooO0oO() {
        UInt32Value uInt32Value = this.f18341OooOoo0;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    public final Context OooO0oo() {
        Context context = this.f18328OooOOOo;
        return context == null ? Context.f17873OooO0o : context;
    }

    public final Documentation OooOO0() {
        Documentation documentation = this.f18323OooOO0O;
        return documentation == null ? Documentation.f17977OooOO0O : documentation;
    }

    public final Http OooOO0O() {
        Http http = this.f18326OooOOO0;
        return http == null ? Http.f18016OooO0oO : http;
    }

    public final String OooOO0o() {
        Object obj = this.f18320OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18320OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final Monitoring OooOOO() {
        Monitoring monitoring = this.f18338OooOoO0;
        return monitoring == null ? Monitoring.f18189OooO0oO : monitoring;
    }

    public final Logging OooOOO0() {
        Logging logging = this.f18332OooOo;
        return logging == null ? Logging.f18086OooO0oO : logging;
    }

    public final String OooOOOO() {
        Object obj = this.f18318OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18318OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final Quota OooOOOo() {
        Quota quota = this.f18325OooOOO;
        return quota == null ? Quota.f18239OooO0oO : quota;
    }

    public final SystemParameters OooOOo() {
        SystemParameters systemParameters = this.f18337OooOoO;
        return systemParameters == null ? SystemParameters.f18400OooO0o : systemParameters;
    }

    public final SourceInfo OooOOo0() {
        SourceInfo sourceInfo = this.f18339OooOoOO;
        return sourceInfo == null ? SourceInfo.f18375OooO0o : sourceInfo;
    }

    public final Usage OooOOoo() {
        Usage usage = this.f18330OooOOo0;
        return usage == null ? Usage.f18408OooO0oo : usage;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOo00, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18314OooOooO) {
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
        if (!getName().equals(service.getName()) || !getTitle().equals(service.getTitle()) || !OooOOOO().equals(service.OooOOOO()) || !OooOO0o().equals(service.OooOO0o()) || !this.f18321OooO0oo.equals(service.f18321OooO0oo) || !this.f18316OooO.equals(service.f18316OooO) || !this.f18322OooOO0.equals(service.f18322OooOO0)) {
            return false;
        }
        Documentation documentation = this.f18323OooOO0O;
        if ((documentation != null) != (service.f18323OooOO0O != null)) {
            return false;
        }
        if ((documentation != null) && !OooOO0().equals(service.OooOO0())) {
            return false;
        }
        Backend backend = this.f18324OooOO0o;
        if ((backend != null) != (service.f18324OooOO0o != null)) {
            return false;
        }
        if ((backend != null) && !OooO0o0().equals(service.OooO0o0())) {
            return false;
        }
        Http http = this.f18326OooOOO0;
        if ((http != null) != (service.f18326OooOOO0 != null)) {
            return false;
        }
        if ((http != null) && !OooOO0O().equals(service.OooOO0O())) {
            return false;
        }
        Quota quota = this.f18325OooOOO;
        if ((quota != null) != (service.f18325OooOOO != null)) {
            return false;
        }
        if ((quota != null) && !OooOOOo().equals(service.OooOOOo())) {
            return false;
        }
        Authentication authentication = this.f18327OooOOOO;
        if ((authentication != null) != (service.f18327OooOOOO != null)) {
            return false;
        }
        if ((authentication != null) && !OooO0Oo().equals(service.OooO0Oo())) {
            return false;
        }
        Context context = this.f18328OooOOOo;
        if ((context != null) != (service.f18328OooOOOo != null)) {
            return false;
        }
        if ((context != null) && !OooO0oo().equals(service.OooO0oo())) {
            return false;
        }
        Usage usage = this.f18330OooOOo0;
        if ((usage != null) != (service.f18330OooOOo0 != null)) {
            return false;
        }
        if (((usage != null) && !OooOOoo().equals(service.OooOOoo())) || !this.f18329OooOOo.equals(service.f18329OooOOo)) {
            return false;
        }
        Control control = this.f18331OooOOoo;
        if ((control != null) != (service.f18331OooOOoo != null)) {
            return false;
        }
        if (((control != null) && !OooO().equals(service.OooO())) || !this.f18334OooOo00.equals(service.f18334OooOo00) || !this.f18333OooOo0.equals(service.f18333OooOo0) || !this.f18335OooOo0O.equals(service.f18335OooOo0O)) {
            return false;
        }
        Billing billing = this.f18336OooOo0o;
        if ((billing != null) != (service.f18336OooOo0o != null)) {
            return false;
        }
        if ((billing != null) && !OooO0o().equals(service.OooO0o())) {
            return false;
        }
        Logging logging = this.f18332OooOo;
        if ((logging != null) != (service.f18332OooOo != null)) {
            return false;
        }
        if ((logging != null) && !OooOOO0().equals(service.OooOOO0())) {
            return false;
        }
        Monitoring monitoring = this.f18338OooOoO0;
        if ((monitoring != null) != (service.f18338OooOoO0 != null)) {
            return false;
        }
        if ((monitoring != null) && !OooOOO().equals(service.OooOOO())) {
            return false;
        }
        SystemParameters systemParameters = this.f18337OooOoO;
        if ((systemParameters != null) != (service.f18337OooOoO != null)) {
            return false;
        }
        if ((systemParameters != null) && !OooOOo().equals(service.OooOOo())) {
            return false;
        }
        SourceInfo sourceInfo = this.f18339OooOoOO;
        if ((sourceInfo != null) != (service.f18339OooOoOO != null)) {
            return false;
        }
        if ((sourceInfo != null) && !OooOOo0().equals(service.OooOOo0())) {
            return false;
        }
        UInt32Value uInt32Value = this.f18341OooOoo0;
        if ((uInt32Value != null) != (service.f18341OooOoo0 != null)) {
            return false;
        }
        return (!(uInt32Value != null) || OooO0oO().equals(service.OooO0oO())) && this.unknownFields.equals(service.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18314OooOooO;
    }

    public final String getName() {
        Object obj = this.f18317OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18317OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Service> getParserForType() {
        return f18315OooOooo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18317OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18317OooO0Oo) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f18319OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18319OooO0o0);
        }
        for (int i2 = 0; i2 < this.f18321OooO0oo.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.f18321OooO0oo.get(i2));
        }
        for (int i3 = 0; i3 < this.f18316OooO.size(); i3++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, this.f18316OooO.get(i3));
        }
        for (int i4 = 0; i4 < this.f18322OooOO0.size(); i4++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.f18322OooOO0.get(i4));
        }
        if (this.f18323OooOO0O != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, OooOO0());
        }
        if (this.f18324OooOO0o != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, OooO0o0());
        }
        if (this.f18326OooOOO0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(9, OooOO0O());
        }
        if (this.f18325OooOOO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(10, OooOOOo());
        }
        if (this.f18327OooOOOO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(11, OooO0Oo());
        }
        if (this.f18328OooOOOo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(12, OooO0oo());
        }
        if (this.f18330OooOOo0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(15, OooOOoo());
        }
        for (int i5 = 0; i5 < this.f18329OooOOo.size(); i5++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(18, this.f18329OooOOo.get(i5));
        }
        if (this.f18341OooOoo0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(20, OooO0oO());
        }
        if (this.f18331OooOOoo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(21, OooO());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18318OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(22, this.f18318OooO0o);
        }
        for (int i6 = 0; i6 < this.f18334OooOo00.size(); i6++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(23, this.f18334OooOo00.get(i6));
        }
        for (int i7 = 0; i7 < this.f18333OooOo0.size(); i7++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(24, this.f18333OooOo0.get(i7));
        }
        for (int i8 = 0; i8 < this.f18335OooOo0O.size(); i8++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(25, this.f18335OooOo0O.get(i8));
        }
        if (this.f18336OooOo0o != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(26, OooO0o());
        }
        if (this.f18332OooOo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(27, OooOOO0());
        }
        if (this.f18338OooOoO0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(28, OooOOO());
        }
        if (this.f18337OooOoO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(29, OooOOo());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18320OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(33, this.f18320OooO0oO);
        }
        if (this.f18339OooOoOO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(37, OooOOo0());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final String getTitle() {
        Object obj = this.f18319OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18319OooO0o0 = stringUtf8;
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
        int iHashCode = OooOO0o().hashCode() + ((((OooOOOO().hashCode() + ((((getTitle().hashCode() + ((((getName().hashCode() + o0O0O0Oo.OooO00o.OooO00o(o000OOo.f41237OooO00o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 22) * 53)) * 37) + 33) * 53);
        if (this.f18321OooO0oo.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 3, 53) + this.f18321OooO0oo.hashCode();
        }
        if (this.f18316OooO.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 4, 53) + this.f18316OooO.hashCode();
        }
        if (this.f18322OooOO0.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 5, 53) + this.f18322OooOO0.hashCode();
        }
        if (this.f18323OooOO0O != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 6, 53) + OooOO0().hashCode();
        }
        if (this.f18324OooOO0o != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 8, 53) + OooO0o0().hashCode();
        }
        if (this.f18326OooOOO0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 9, 53) + OooOO0O().hashCode();
        }
        if (this.f18325OooOOO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 10, 53) + OooOOOo().hashCode();
        }
        if (this.f18327OooOOOO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 11, 53) + OooO0Oo().hashCode();
        }
        if (this.f18328OooOOOo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 12, 53) + OooO0oo().hashCode();
        }
        if (this.f18330OooOOo0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 15, 53) + OooOOoo().hashCode();
        }
        if (this.f18329OooOOo.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 18, 53) + this.f18329OooOOo.hashCode();
        }
        if (this.f18331OooOOoo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 21, 53) + OooO().hashCode();
        }
        if (this.f18334OooOo00.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 23, 53) + this.f18334OooOo00.hashCode();
        }
        if (this.f18333OooOo0.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 24, 53) + this.f18333OooOo0.hashCode();
        }
        if (this.f18335OooOo0O.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 25, 53) + this.f18335OooOo0O.hashCode();
        }
        if (this.f18336OooOo0o != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 26, 53) + OooO0o().hashCode();
        }
        if (this.f18332OooOo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 27, 53) + OooOOO0().hashCode();
        }
        if (this.f18338OooOoO0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 28, 53) + OooOOO().hashCode();
        }
        if (this.f18337OooOoO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 29, 53) + OooOOo().hashCode();
        }
        if (this.f18339OooOoOO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 37, 53) + OooOOo0().hashCode();
        }
        if (this.f18341OooOoo0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 20, 53) + OooO0oO().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o000OOo.f41238OooO0O0.ensureFieldAccessorsInitialized(Service.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18340OooOoo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18340OooOoo = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18314OooOooO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Service();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18317OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18317OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18319OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18319OooO0o0);
        }
        for (int i = 0; i < this.f18321OooO0oo.size(); i++) {
            codedOutputStream.writeMessage(3, this.f18321OooO0oo.get(i));
        }
        for (int i2 = 0; i2 < this.f18316OooO.size(); i2++) {
            codedOutputStream.writeMessage(4, this.f18316OooO.get(i2));
        }
        for (int i3 = 0; i3 < this.f18322OooOO0.size(); i3++) {
            codedOutputStream.writeMessage(5, this.f18322OooOO0.get(i3));
        }
        if (this.f18323OooOO0O != null) {
            codedOutputStream.writeMessage(6, OooOO0());
        }
        if (this.f18324OooOO0o != null) {
            codedOutputStream.writeMessage(8, OooO0o0());
        }
        if (this.f18326OooOOO0 != null) {
            codedOutputStream.writeMessage(9, OooOO0O());
        }
        if (this.f18325OooOOO != null) {
            codedOutputStream.writeMessage(10, OooOOOo());
        }
        if (this.f18327OooOOOO != null) {
            codedOutputStream.writeMessage(11, OooO0Oo());
        }
        if (this.f18328OooOOOo != null) {
            codedOutputStream.writeMessage(12, OooO0oo());
        }
        if (this.f18330OooOOo0 != null) {
            codedOutputStream.writeMessage(15, OooOOoo());
        }
        for (int i4 = 0; i4 < this.f18329OooOOo.size(); i4++) {
            codedOutputStream.writeMessage(18, this.f18329OooOOo.get(i4));
        }
        if (this.f18341OooOoo0 != null) {
            codedOutputStream.writeMessage(20, OooO0oO());
        }
        if (this.f18331OooOOoo != null) {
            codedOutputStream.writeMessage(21, OooO());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18318OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 22, this.f18318OooO0o);
        }
        for (int i5 = 0; i5 < this.f18334OooOo00.size(); i5++) {
            codedOutputStream.writeMessage(23, this.f18334OooOo00.get(i5));
        }
        for (int i6 = 0; i6 < this.f18333OooOo0.size(); i6++) {
            codedOutputStream.writeMessage(24, this.f18333OooOo0.get(i6));
        }
        for (int i7 = 0; i7 < this.f18335OooOo0O.size(); i7++) {
            codedOutputStream.writeMessage(25, this.f18335OooOo0O.get(i7));
        }
        if (this.f18336OooOo0o != null) {
            codedOutputStream.writeMessage(26, OooO0o());
        }
        if (this.f18332OooOo != null) {
            codedOutputStream.writeMessage(27, OooOOO0());
        }
        if (this.f18338OooOoO0 != null) {
            codedOutputStream.writeMessage(28, OooOOO());
        }
        if (this.f18337OooOoO != null) {
            codedOutputStream.writeMessage(29, OooOOo());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18320OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 33, this.f18320OooO0oO);
        }
        if (this.f18339OooOoOO != null) {
            codedOutputStream.writeMessage(37, OooOOo0());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18314OooOooO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18314OooOooO.toBuilder();
    }

    private Service() {
        this.f18340OooOoo = (byte) -1;
        this.f18317OooO0Oo = "";
        this.f18319OooO0o0 = "";
        this.f18318OooO0o = "";
        this.f18320OooO0oO = "";
        this.f18321OooO0oo = Collections.emptyList();
        this.f18316OooO = Collections.emptyList();
        this.f18322OooOO0 = Collections.emptyList();
        this.f18329OooOOo = Collections.emptyList();
        this.f18334OooOo00 = Collections.emptyList();
        this.f18333OooOo0 = Collections.emptyList();
        this.f18335OooOo0O = Collections.emptyList();
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
                            this.f18317OooO0Oo = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 18:
                            this.f18319OooO0o0 = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 26:
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 == 0) {
                                this.f18321OooO0oo = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.f18321OooO0oo.add((Api) codedInputStream.readMessage(Api.parser(), extensionRegistryLite));
                            continue;
                        case 34:
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 == 0) {
                                this.f18316OooO = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.f18316OooO.add((Type) codedInputStream.readMessage(Type.parser(), extensionRegistryLite));
                            continue;
                        case 42:
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 == 0) {
                                this.f18322OooOO0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.f18322OooOO0.add((Enum) codedInputStream.readMessage(Enum.parser(), extensionRegistryLite));
                            continue;
                        case 50:
                            Documentation documentation = this.f18323OooOO0O;
                            Documentation.OooO0O0 builder = documentation != null ? documentation.toBuilder() : null;
                            Documentation documentation2 = (Documentation) codedInputStream.readMessage(Documentation.OooO0oO(), extensionRegistryLite);
                            this.f18323OooOO0O = documentation2;
                            if (builder != null) {
                                builder.OooO0oo(documentation2);
                                this.f18323OooOO0O = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 66:
                            Backend backend = this.f18324OooOO0o;
                            Backend.OooO0O0 builder2 = backend != null ? backend.toBuilder() : null;
                            Backend backend2 = (Backend) codedInputStream.readMessage(Backend.OooO0O0(), extensionRegistryLite);
                            this.f18324OooOO0o = backend2;
                            if (builder2 != null) {
                                builder2.OooO0oO(backend2);
                                this.f18324OooOO0o = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 74:
                            Http http = this.f18326OooOOO0;
                            Http.OooO0O0 builder3 = http != null ? http.toBuilder() : null;
                            Http http2 = (Http) codedInputStream.readMessage(Http.OooO0O0(), extensionRegistryLite);
                            this.f18326OooOOO0 = http2;
                            if (builder3 != null) {
                                builder3.OooO0oO(http2);
                                this.f18326OooOOO0 = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 82:
                            Quota quota = this.f18325OooOOO;
                            Quota.OooO0O0 builder4 = quota != null ? quota.toBuilder() : null;
                            Quota quota2 = (Quota) codedInputStream.readMessage(Quota.OooO0O0(), extensionRegistryLite);
                            this.f18325OooOOO = quota2;
                            if (builder4 != null) {
                                builder4.OooO0oo(quota2);
                                this.f18325OooOOO = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 90:
                            Authentication authentication = this.f18327OooOOOO;
                            Authentication.OooO0O0 builder5 = authentication != null ? authentication.toBuilder() : null;
                            Authentication authentication2 = (Authentication) codedInputStream.readMessage(Authentication.OooO0O0(), extensionRegistryLite);
                            this.f18327OooOOOO = authentication2;
                            if (builder5 != null) {
                                builder5.OooO0oo(authentication2);
                                this.f18327OooOOOO = builder5.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 98:
                            Context context = this.f18328OooOOOo;
                            Context.OooO0O0 builder6 = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) codedInputStream.readMessage(Context.OooO0O0(), extensionRegistryLite);
                            this.f18328OooOOOo = context2;
                            if (builder6 != null) {
                                builder6.OooO0oO(context2);
                                this.f18328OooOOOo = builder6.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 122:
                            Usage usage = this.f18330OooOOo0;
                            Usage.OooO0O0 builder7 = usage != null ? usage.toBuilder() : null;
                            Usage usage2 = (Usage) codedInputStream.readMessage(Usage.OooO0OO(), extensionRegistryLite);
                            this.f18330OooOOo0 = usage2;
                            if (builder7 != null) {
                                builder7.OooO0oO(usage2);
                                this.f18330OooOOo0 = builder7.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 146:
                            int i5 = (i == true ? 1 : 0) & 8;
                            i = i;
                            if (i5 == 0) {
                                this.f18329OooOOo = new ArrayList();
                                i = (i == true ? 1 : 0) | 8;
                            }
                            this.f18329OooOOo.add((Endpoint) codedInputStream.readMessage(Endpoint.OooO0OO(), extensionRegistryLite));
                            continue;
                        case 162:
                            UInt32Value uInt32Value = this.f18341OooOoo0;
                            UInt32Value.Builder builder8 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                            UInt32Value uInt32Value2 = (UInt32Value) codedInputStream.readMessage(UInt32Value.parser(), extensionRegistryLite);
                            this.f18341OooOoo0 = uInt32Value2;
                            if (builder8 != null) {
                                builder8.mergeFrom(uInt32Value2);
                                this.f18341OooOoo0 = builder8.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 170:
                            Control control = this.f18331OooOOoo;
                            Control.OooO0O0 builder9 = control != null ? control.toBuilder() : null;
                            Control control2 = (Control) codedInputStream.readMessage(Control.OooO0OO(), extensionRegistryLite);
                            this.f18331OooOOoo = control2;
                            if (builder9 != null) {
                                builder9.OooO0o0(control2);
                                this.f18331OooOOoo = builder9.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 178:
                            this.f18318OooO0o = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 186:
                            int i6 = (i == true ? 1 : 0) & 16;
                            i = i;
                            if (i6 == 0) {
                                this.f18334OooOo00 = new ArrayList();
                                i = (i == true ? 1 : 0) | 16;
                            }
                            this.f18334OooOo00.add((LogDescriptor) codedInputStream.readMessage(LogDescriptor.OooO0OO(), extensionRegistryLite));
                            continue;
                        case 194:
                            int i7 = (i == true ? 1 : 0) & 32;
                            i = i;
                            if (i7 == 0) {
                                this.f18333OooOo0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 32;
                            }
                            this.f18333OooOo0.add((MetricDescriptor) codedInputStream.readMessage(MetricDescriptor.OooO0o0(), extensionRegistryLite));
                            continue;
                        case 202:
                            int i8 = (i == true ? 1 : 0) & 64;
                            i = i;
                            if (i8 == 0) {
                                this.f18335OooOo0O = new ArrayList();
                                i = (i == true ? 1 : 0) | 64;
                            }
                            this.f18335OooOo0O.add((MonitoredResourceDescriptor) codedInputStream.readMessage(MonitoredResourceDescriptor.OooO0Oo(), extensionRegistryLite));
                            continue;
                        case 210:
                            Billing billing = this.f18336OooOo0o;
                            Billing.OooO0O0 builder10 = billing != null ? billing.toBuilder() : null;
                            Billing billing2 = (Billing) codedInputStream.readMessage(Billing.OooO0O0(), extensionRegistryLite);
                            this.f18336OooOo0o = billing2;
                            if (builder10 != null) {
                                builder10.OooO0oO(billing2);
                                this.f18336OooOo0o = builder10.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 218:
                            Logging logging = this.f18332OooOo;
                            Logging.OooO0O0 builder11 = logging != null ? logging.toBuilder() : null;
                            Logging logging2 = (Logging) codedInputStream.readMessage(Logging.OooO0OO(), extensionRegistryLite);
                            this.f18332OooOo = logging2;
                            if (builder11 != null) {
                                builder11.OooO0oo(logging2);
                                this.f18332OooOo = builder11.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 226:
                            Monitoring monitoring = this.f18338OooOoO0;
                            Monitoring.OooO0O0 builder12 = monitoring != null ? monitoring.toBuilder() : null;
                            Monitoring monitoring2 = (Monitoring) codedInputStream.readMessage(Monitoring.OooO0OO(), extensionRegistryLite);
                            this.f18338OooOoO0 = monitoring2;
                            if (builder12 != null) {
                                builder12.OooO0oo(monitoring2);
                                this.f18338OooOoO0 = builder12.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 234:
                            SystemParameters systemParameters = this.f18337OooOoO;
                            SystemParameters.OooO0O0 builder13 = systemParameters != null ? systemParameters.toBuilder() : null;
                            SystemParameters systemParameters2 = (SystemParameters) codedInputStream.readMessage(SystemParameters.OooO0O0(), extensionRegistryLite);
                            this.f18337OooOoO = systemParameters2;
                            if (builder13 != null) {
                                builder13.OooO0oO(systemParameters2);
                                this.f18337OooOoO = builder13.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 266:
                            this.f18320OooO0oO = codedInputStream.readStringRequireUtf8();
                            continue;
                        case 298:
                            SourceInfo sourceInfo = this.f18339OooOoOO;
                            SourceInfo.OooO0O0 builder14 = sourceInfo != null ? sourceInfo.toBuilder() : null;
                            SourceInfo sourceInfo2 = (SourceInfo) codedInputStream.readMessage(SourceInfo.OooO0O0(), extensionRegistryLite);
                            this.f18339OooOoOO = sourceInfo2;
                            if (builder14 != null) {
                                builder14.OooO0oO(sourceInfo2);
                                this.f18339OooOoOO = builder14.buildPartial();
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
                    this.f18321OooO0oo = Collections.unmodifiableList(this.f18321OooO0oo);
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.f18316OooO = Collections.unmodifiableList(this.f18316OooO);
                }
                if (((i == true ? 1 : 0) & 4) != 0) {
                    this.f18322OooOO0 = Collections.unmodifiableList(this.f18322OooOO0);
                }
                if (((i == true ? 1 : 0) & 8) != 0) {
                    this.f18329OooOOo = Collections.unmodifiableList(this.f18329OooOOo);
                }
                if (((i == true ? 1 : 0) & 16) != 0) {
                    this.f18334OooOo00 = Collections.unmodifiableList(this.f18334OooOo00);
                }
                if (((i == true ? 1 : 0) & 32) != 0) {
                    this.f18333OooOo0 = Collections.unmodifiableList(this.f18333OooOo0);
                }
                if (((i == true ? 1 : 0) & 64) != 0) {
                    this.f18335OooOo0O = Collections.unmodifiableList(this.f18335OooOo0O);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) != 0) {
            this.f18321OooO0oo = Collections.unmodifiableList(this.f18321OooO0oo);
        }
        if (((i == true ? 1 : 0) & 2) != 0) {
            this.f18316OooO = Collections.unmodifiableList(this.f18316OooO);
        }
        if (((i == true ? 1 : 0) & 4) != 0) {
            this.f18322OooOO0 = Collections.unmodifiableList(this.f18322OooOO0);
        }
        if (((i == true ? 1 : 0) & 8) != 0) {
            this.f18329OooOOo = Collections.unmodifiableList(this.f18329OooOOo);
        }
        if (((i == true ? 1 : 0) & 16) != 0) {
            this.f18334OooOo00 = Collections.unmodifiableList(this.f18334OooOo00);
        }
        if (((i == true ? 1 : 0) & 32) != 0) {
            this.f18333OooOo0 = Collections.unmodifiableList(this.f18333OooOo0);
        }
        if (((i == true ? 1 : 0) & 64) != 0) {
            this.f18335OooOo0O = Collections.unmodifiableList(this.f18335OooOo0O);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
