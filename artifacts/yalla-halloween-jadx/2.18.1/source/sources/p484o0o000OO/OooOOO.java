package p484o0o000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.MomentApiService;
import com.yalla.yalla.api.service.TopicApiService;
import com.yalla.yalla.common.api.service.WalletService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOO f40882OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40883OooO0O0 = LazyKt.lazy(OooO00o.f40886Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40884OooO0OO = LazyKt.lazy(OooO0O0.f40887Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f40885OooO0Oo = LazyKt.lazy(OooO0OO.f40888Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<MomentApiService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40886Oooo0o = new OooO00o();

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
        public static final OooO0O0 f40887Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TopicApiService invoke() {
            return (TopicApiService) o0o0000.OooO0O0.f40784OooO00o.OooO0o0().OooO0O0(TopicApiService.class);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<WalletService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f40888Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WalletService invoke() {
            return (WalletService) o0o0000.OooO0O0.f40784OooO00o.OooO0o().OooO0O0(WalletService.class);
        }
    }

    @NotNull
    public static final MomentApiService OooO00o() {
        Object value = f40883OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-momentPost>(...)");
        return (MomentApiService) value;
    }

    @NotNull
    public static final TopicApiService OooO0O0() {
        Object value = f40884OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-momentTopic>(...)");
        return (TopicApiService) value;
    }

    @NotNull
    public static final WalletService OooO0OO() {
        Object value = f40885OooO0Oo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-walletService>(...)");
        return (WalletService) value;
    }
}
