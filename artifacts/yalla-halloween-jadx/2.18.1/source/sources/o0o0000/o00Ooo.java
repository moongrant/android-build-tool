package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.MomentApiService;
import com.yalla.yalla.api.service.TopicApiService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f40836OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40837OooO0O0 = LazyKt.lazy(OooO00o.f40839Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40838OooO0OO = LazyKt.lazy(OooO0O0.f40840Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<MomentApiService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40839Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentApiService invoke() {
            return (MomentApiService) o0o0000.OooO0O0.f40784OooO00o.OooO0o0().OooO0O0(MomentApiService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<TopicApiService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f40840Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TopicApiService invoke() {
            return (TopicApiService) o0o0000.OooO0O0.f40784OooO00o.OooO0o0().OooO0O0(TopicApiService.class);
        }
    }

    @NotNull
    public static final MomentApiService OooO00o() {
        Object value = f40837OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-moment>(...)");
        return (MomentApiService) value;
    }

    @NotNull
    public static final TopicApiService OooO0O0() {
        Object value = f40838OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-topic>(...)");
        return (TopicApiService) value;
    }
}
