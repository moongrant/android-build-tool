package p384o0OOoo0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.YallaChatApiService;
import com.yalla.yalla.api.old.service.YallaChatBindApiService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f43477OooO00o = LazyKt.lazy(OooO00o.f43479OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f43478OooO0O0 = LazyKt.lazy(OooO0O0.f43480OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<YallaChatApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43479OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatApiService invoke() {
            Object value = OooOo.f43320OooO0OO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (YallaChatApiService) ((o0000O0O) value).OooO0O0(YallaChatApiService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<YallaChatBindApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f43480OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatBindApiService invoke() {
            Lazy lazy = OooOo.f43318OooO00o;
            return (YallaChatBindApiService) OooOo.OooO0Oo().OooO0O0(YallaChatBindApiService.class);
        }
    }

    @NotNull
    public static YallaChatApiService OooO00o() {
        Object value = f43477OooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (YallaChatApiService) value;
    }

    @NotNull
    public static YallaChatBindApiService OooO0O0() {
        Object value = f43478OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (YallaChatBindApiService) value;
    }
}
