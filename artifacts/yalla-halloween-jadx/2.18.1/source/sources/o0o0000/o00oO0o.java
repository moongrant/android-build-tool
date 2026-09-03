package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.GiftBlindBoxService;
import com.yalla.yalla.api.service.VoteApiService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00oO0o f40841OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40842OooO0O0 = LazyKt.lazy(OooO0O0.f40845Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40843OooO0OO = LazyKt.lazy(OooO00o.f40844Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<GiftBlindBoxService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40844Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GiftBlindBoxService invoke() {
            return (GiftBlindBoxService) o0o0000.OooO0O0.f40784OooO00o.OooO0Oo().OooO0O0(GiftBlindBoxService.class);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<VoteApiService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f40845Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final VoteApiService invoke() {
            return (VoteApiService) o0o0000.OooO0O0.f40784OooO00o.OooO0Oo().OooO0O0(VoteApiService.class);
        }
    }

    @NotNull
    public static final GiftBlindBoxService OooO00o() {
        Object value = f40843OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-giftBlindBox>(...)");
        return (GiftBlindBoxService) value;
    }

    @NotNull
    public static final VoteApiService OooO0O0() {
        Object value = f40842OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-vote>(...)");
        return (VoteApiService) value;
    }
}
