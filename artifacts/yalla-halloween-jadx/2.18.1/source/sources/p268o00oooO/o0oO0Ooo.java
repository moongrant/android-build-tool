package p268o00oooO;

import com.common.support.apm.api.ApmApi;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OO;
import p693oO000oO.OooO;
import retrofit2.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f34945OooO00o = LazyKt.lazy(OooO00o.f34947Oooo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f34946OooO0O0 = LazyKt.lazy(OooO0O0.f34948Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<ApmApi> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f34947Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ApmApi invoke() {
            o0O0O00.OooO0O0 oooO0O0 = new o0O0O00.OooO0O0();
            int i = ApmApi.f12652OooO00o;
            o00OO o00oo2 = ApmApi.OooO00o.f12655OooO0OO;
            if (o00oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("defaultClient");
                throw null;
            }
            oooO0O0.f53806OooO0O0 = new o00OO(o00oo2.OooO0Oo());
            oooO0O0.OooO00o(OooO.OooO0OO());
            oooO0O0.OooO0O0(ApmApi.OooO00o.f12654OooO0O0);
            return (ApmApi) oooO0O0.OooO0OO().OooO0O0(ApmApi.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<ApmApi> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f34948Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function0
        public final ApmApi invoke() {
            o00OO o00oo2 = ApmApi.OooO00o.f12655OooO0OO;
            if (o00oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("defaultClient");
                throw null;
            }
            o00OO.OooO00o oooO00oOooO0Oo = o00oo2.OooO0Oo();
            oooO00oOooO0Oo.OooO0oO(600L, TimeUnit.SECONDS);
            oooO00oOooO0Oo.OooO(600L);
            o0O0O00.OooO0O0 oooO0O0 = new o0O0O00.OooO0O0();
            oooO0O0.f53806OooO0O0 = new o00OO(oooO00oOooO0Oo);
            oooO0O0.f53808OooO0Oo.add(OooO.OooO0OO());
            oooO0O0.OooO0O0(ApmApi.OooO00o.f12654OooO0O0);
            return (ApmApi) oooO0O0.OooO0OO().OooO0O0(ApmApi.class);
        }
    }

    public static final ApmApi OooO00o() {
        return (ApmApi) f34945OooO00o.getValue();
    }
}
