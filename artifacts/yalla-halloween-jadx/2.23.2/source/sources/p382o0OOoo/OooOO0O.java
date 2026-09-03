package p382o0OOoo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.WalletService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p384o0OOoo0O.OooOo;
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f43272OooO00o = LazyKt.lazy(OooO00o.f43273OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<WalletService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43273OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WalletService invoke() {
            Object value = OooOo.f43323OooO0o0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (WalletService) ((o0000O0O) value).OooO0O0(WalletService.class);
        }
    }

    @NotNull
    public static WalletService OooO00o() {
        Object value = f43272OooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WalletService) value;
    }
}
