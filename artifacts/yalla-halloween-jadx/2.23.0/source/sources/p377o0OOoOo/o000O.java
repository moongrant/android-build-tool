package p377o0OOoOo;

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
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44216OooO00o = LazyKt.lazy(OooO00o.f44218OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44217OooO0O0 = LazyKt.lazy(OooO0O0.f44219OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<YallaChatApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44218OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatApiService invoke() {
            Object value = o0000O0O.f44199OooO0OO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-retrofitMoment>(...)");
            return (YallaChatApiService) ((o000OO) value).OooO0O0(YallaChatApiService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<YallaChatBindApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f44219OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatBindApiService invoke() {
            Lazy lazy = o0000O0O.f44197OooO00o;
            return (YallaChatBindApiService) o0000O0O.OooO0Oo().OooO0O0(YallaChatBindApiService.class);
        }
    }

    @NotNull
    public static YallaChatApiService OooO00o() {
        Object value = f44216OooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-yallaChat>(...)");
        return (YallaChatApiService) value;
    }

    @NotNull
    public static YallaChatBindApiService OooO0O0() {
        Object value = f44217OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-yallaChatBind>(...)");
        return (YallaChatBindApiService) value;
    }
}
