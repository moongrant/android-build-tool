package io.grpc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
@Immutable
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0O0 f26354OooOO0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Integer f26355OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public OooOO0O f26356OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Executor f26357OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f26358OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public String f26359OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<Object> f26360OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object[][] f26361OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Boolean f26362OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Integer f26363OooO0oo;

    public static final class OooO00o<T> {
    }

    public OooO0O0() {
        this.f26361OooO0o0 = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        this.f26360OooO0o = Collections.emptyList();
    }

    public final OooO0O0 OooO00o(@Nullable Executor executor) {
        OooO0O0 oooO0O0 = new OooO0O0(this);
        oooO0O0.f26357OooO0O0 = executor;
        return oooO0O0;
    }

    public final String toString() {
        o0OOOO0o.OooOOO0.OooO00o oooO00oOooO0O0 = o0OOOO0o.OooOOO0.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO("deadline", this.f26356OooO00o);
        oooO00oOooO0O0.OooO0OO("authority", this.f26358OooO0OO);
        oooO00oOooO0O0.OooO0OO("callCredentials", null);
        Executor executor = this.f26357OooO0O0;
        oooO00oOooO0O0.OooO0OO("executor", executor != null ? executor.getClass() : null);
        oooO00oOooO0O0.OooO0OO("compressorName", this.f26359OooO0Oo);
        oooO00oOooO0O0.OooO0OO("customOptions", Arrays.deepToString(this.f26361OooO0o0));
        oooO00oOooO0O0.OooO0O0("waitForReady", Boolean.TRUE.equals(this.f26362OooO0oO));
        oooO00oOooO0O0.OooO0OO("maxInboundMessageSize", this.f26363OooO0oo);
        oooO00oOooO0O0.OooO0OO("maxOutboundMessageSize", this.f26355OooO);
        oooO00oOooO0O0.OooO0OO("streamTracerFactories", this.f26360OooO0o);
        return oooO00oOooO0O0.toString();
    }

    public OooO0O0(OooO0O0 oooO0O0) {
        this.f26361OooO0o0 = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        this.f26360OooO0o = Collections.emptyList();
        this.f26356OooO00o = oooO0O0.f26356OooO00o;
        this.f26358OooO0OO = oooO0O0.f26358OooO0OO;
        this.f26357OooO0O0 = oooO0O0.f26357OooO0O0;
        this.f26359OooO0Oo = oooO0O0.f26359OooO0Oo;
        this.f26361OooO0o0 = oooO0O0.f26361OooO0o0;
        this.f26362OooO0oO = oooO0O0.f26362OooO0oO;
        this.f26363OooO0oo = oooO0O0.f26363OooO0oo;
        this.f26355OooO = oooO0O0.f26355OooO;
        this.f26360OooO0o = oooO0O0.f26360OooO0o;
    }
}
