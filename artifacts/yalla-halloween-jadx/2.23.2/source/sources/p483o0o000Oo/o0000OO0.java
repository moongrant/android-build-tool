package p483o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.data.constant.TurntableGameState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48510OooO00o = o0ooOOo.OooO0O0(OooO0O0.f48515OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<TurntableGameState> f48511OooO0O0 = o0ooOOo.OooO0O0(OooO0o.f48517OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48512OooO0OO = o0ooOOo.OooO0O0(OooO0OO.f48516OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48513OooO0Oo = o0ooOOo.OooO0O0(OooO00o.f48514OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f48514OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f48515OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f48516OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<TurntableGameState> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f48517OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TurntableGameState invoke() {
            return TurntableGameState.Close;
        }
    }

    @NotNull
    public final MutableStateFlow<TurntableGameState> OooO0Oo() {
        return this.f48511OooO0O0;
    }
}
