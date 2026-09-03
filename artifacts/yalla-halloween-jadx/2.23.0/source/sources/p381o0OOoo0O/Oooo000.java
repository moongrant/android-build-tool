package p381o0OOoo0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.WalletService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o0000O0O;
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44266OooO00o = LazyKt.lazy(OooO00o.f44267OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<WalletService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44267OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WalletService invoke() {
            Object value = o0000O0O.f44202OooO0o0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-retrofitRecharge>(...)");
            return (WalletService) ((o000OO) value).OooO0O0(WalletService.class);
        }
    }

    @NotNull
    public static WalletService OooO00o() {
        Object value = f44266OooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-walletService>(...)");
        return (WalletService) value;
    }
}
