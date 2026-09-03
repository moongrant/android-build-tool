package io.opentelemetry.sdk.trace;

import androidx.media3.session.o000OO00;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.samplers.Sampler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class SdkTracerProviderBuilder {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Sampler f32980OooO0oO = io.opentelemetry.sdk.trace.samplers.OooO00o.OooO0O0(io.opentelemetry.sdk.trace.samplers.OooO00o.OooO00o());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f32981OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Clock f32982OooO0O0 = io.opentelemetry.sdk.common.OooO00o.OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Enum f32983OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Resource f32984OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Sampler f32985OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OO00 f32986OooO0o0;

    public SdkTracerProviderBuilder() {
        this.f32983OooO0OO = "Dalvik".equals(System.getProperty("java.vm.name")) ? AndroidFriendlyRandomIdGenerator.INSTANCE : RandomIdGenerator.INSTANCE;
        this.f32984OooO0Oo = Resource.f32906OooO0OO;
        this.f32986OooO0o0 = new o000OO00();
        this.f32985OooO0o = f32980OooO0oO;
    }
}
