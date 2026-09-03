package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.YallaChatApiService;
import com.yalla.yalla.api.service.YallaChatBindApiService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f40846OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40847OooO0O0 = LazyKt.lazy(OooO00o.f40849Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40848OooO0OO = LazyKt.lazy(OooO0O0.f40850Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<YallaChatApiService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40849Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatApiService invoke() {
            return (YallaChatApiService) o0o0000.OooO0O0.f40784OooO00o.OooO0o0().OooO0O0(YallaChatApiService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<YallaChatBindApiService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f40850Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatBindApiService invoke() {
            return (YallaChatBindApiService) o0o0000.OooO0O0.f40784OooO00o.OooO0Oo().OooO0O0(YallaChatBindApiService.class);
        }
    }

    @NotNull
    public static final YallaChatApiService OooO00o() {
        Object value = f40847OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-yallaChat>(...)");
        return (YallaChatApiService) value;
    }

    @NotNull
    public static final YallaChatBindApiService OooO0O0() {
        Object value = f40848OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-yallaChatBind>(...)");
        return (YallaChatBindApiService) value;
    }
}
