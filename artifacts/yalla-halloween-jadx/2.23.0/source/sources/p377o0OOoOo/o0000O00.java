package p377o0OOoOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.LogApiService;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.api.old.service.RoomApiService;
import com.yalla.yalla.api.old.service.SearchApiService;
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
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44189OooO00o = LazyKt.lazy(OooO0O0.f44194OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44190OooO0O0 = LazyKt.lazy(OooO0o.f44196OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f44191OooO0OO = LazyKt.lazy(OooO0OO.f44195OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f44192OooO0Oo = LazyKt.lazy(OooO00o.f44193OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<LogApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44193OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LogApiService invoke() {
            Object value = o0000O0O.f44203OooO0oO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-retrofitLog>(...)");
            return (LogApiService) ((o000OO) value).OooO0O0(LogApiService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MainApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f44194OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainApiService invoke() {
            Lazy lazy = o0000O0O.f44197OooO00o;
            return (MainApiService) o0000O0O.OooO0Oo().OooO0O0(MainApiService.class);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<RoomApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f44195OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomApiService invoke() {
            Object value = o0000O0O.f44200OooO0Oo.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-retrofitRoom>(...)");
            return (RoomApiService) ((o000OO) value).OooO0O0(RoomApiService.class);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<SearchApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f44196OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SearchApiService invoke() {
            Object value = o0000O0O.f44201OooO0o.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-retrofitSearch>(...)");
            return (SearchApiService) ((o000OO) value).OooO0O0(SearchApiService.class);
        }
    }

    @NotNull
    public static MainApiService OooO00o() {
        Object value = f44189OooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-main>(...)");
        return (MainApiService) value;
    }

    @NotNull
    public static RoomApiService OooO0O0() {
        Object value = f44191OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-room>(...)");
        return (RoomApiService) value;
    }

    @NotNull
    public static SearchApiService OooO0OO() {
        Object value = f44190OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-search>(...)");
        return (SearchApiService) value;
    }
}
