package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.YallaTeamApiService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Oo0 f40833OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40834OooO0O0 = LazyKt.lazy(OooO00o.f40835Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<YallaTeamApiService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40835Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaTeamApiService invoke() {
            return (YallaTeamApiService) OooO0O0.f40784OooO00o.OooO0Oo().OooO0O0(YallaTeamApiService.class);
        }
    }

    @NotNull
    public static final YallaTeamApiService OooO00o() {
        Object value = f40834OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-yallaTeam>(...)");
        return (YallaTeamApiService) value;
    }
}
