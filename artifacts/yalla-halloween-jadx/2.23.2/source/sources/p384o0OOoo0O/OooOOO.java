package p384o0OOoo0O;

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
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f43309OooO00o = LazyKt.lazy(OooO0O0.f43314OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f43310OooO0O0 = LazyKt.lazy(OooO0o.f43316OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f43311OooO0OO = LazyKt.lazy(OooO0OO.f43315OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f43312OooO0Oo = LazyKt.lazy(OooO00o.f43313OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<LogApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43313OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LogApiService invoke() {
            Object value = OooOo.f43324OooO0oO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (LogApiService) ((o0000O0O) value).OooO0O0(LogApiService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MainApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f43314OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainApiService invoke() {
            Lazy lazy = OooOo.f43318OooO00o;
            return (MainApiService) OooOo.OooO0Oo().OooO0O0(MainApiService.class);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<RoomApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f43315OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomApiService invoke() {
            Object value = OooOo.f43321OooO0Oo.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (RoomApiService) ((o0000O0O) value).OooO0O0(RoomApiService.class);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<SearchApiService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f43316OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SearchApiService invoke() {
            Object value = OooOo.f43322OooO0o.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (SearchApiService) ((o0000O0O) value).OooO0O0(SearchApiService.class);
        }
    }

    @NotNull
    public static MainApiService OooO00o() {
        Object value = f43309OooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MainApiService) value;
    }

    @NotNull
    public static RoomApiService OooO0O0() {
        Object value = f43311OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RoomApiService) value;
    }

    @NotNull
    public static SearchApiService OooO0OO() {
        Object value = f43310OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SearchApiService) value;
    }
}
