package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.UserInfoService;
import com.yalla.yalla.api.service.UserMomentService;
import com.yalla.yalla.api.service.VipService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0ooOOo f40851OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40852OooO0O0 = LazyKt.lazy(OooO0O0.f40856Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40853OooO0OO = LazyKt.lazy(OooO0OO.f40857Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f40854OooO0Oo = LazyKt.lazy(OooO00o.f40855Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<VipService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40855Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final VipService invoke() {
            return (VipService) o0o0000.OooO0O0.f40784OooO00o.OooO0Oo().OooO0O0(VipService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<UserInfoService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f40856Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserInfoService invoke() {
            return (UserInfoService) o0o0000.OooO0O0.f40784OooO00o.OooO0Oo().OooO0O0(UserInfoService.class);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<UserMomentService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f40857Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserMomentService invoke() {
            return (UserMomentService) o0o0000.OooO0O0.f40784OooO00o.OooO0o0().OooO0O0(UserMomentService.class);
        }
    }

    @NotNull
    public static final VipService OooO00o() {
        Object value = f40854OooO0Oo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-kaVip>(...)");
        return (VipService) value;
    }

    @NotNull
    public static final UserInfoService OooO0O0() {
        Object value = f40852OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-userInfo>(...)");
        return (UserInfoService) value;
    }

    @NotNull
    public static final UserMomentService OooO0OO() {
        Object value = f40853OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-userMoment>(...)");
        return (UserMomentService) value;
    }
}
