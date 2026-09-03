package io.opentelemetry.sdk.trace;

import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.samplers.Sampler;
import java.util.ArrayList;
import p022Oooo00O.o0O00oO0;

/* JADX INFO: loaded from: classes5.dex */
public final class SdkTracerProviderBuilder {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Sampler f33512OooO0oO = io.opentelemetry.sdk.trace.samplers.OooO00o.OooO0O0(io.opentelemetry.sdk.trace.samplers.OooO00o.OooO00o());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f33513OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Clock f33514OooO0O0 = io.opentelemetry.sdk.common.OooO00o.OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Enum f33515OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Resource f33516OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Sampler f33517OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00oO0 f33518OooO0o0;

    public SdkTracerProviderBuilder() {
        this.f33515OooO0OO = "Dalvik".equals(System.getProperty("java.vm.name")) ? AndroidFriendlyRandomIdGenerator.INSTANCE : RandomIdGenerator.INSTANCE;
        this.f33516OooO0Oo = Resource.f33440OooO0OO;
        this.f33518OooO0o0 = new o0O00oO0();
        this.f33517OooO0o = f33512OooO0oO;
    }
}
