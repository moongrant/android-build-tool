package o00O00;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class OooOOO0 implements State {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<com.airbnb.lottie.OooOO0> f36085OooO0Oo = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f36087OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f36086OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final State f36088OooO0oO = SnapshotStateKt.derivedStateOf(new OooO0OO());

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final State f36089OooO0oo = SnapshotStateKt.derivedStateOf(new OooO00o());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final State f36084OooO = SnapshotStateKt.derivedStateOf(new OooO0O0());

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final State f36090OooOO0 = SnapshotStateKt.derivedStateOf(new OooO0o());

    public static final class OooO00o extends Lambda implements Function0<Boolean> {
        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            OooOOO0 oooOOO0 = OooOOO0.this;
            return Boolean.valueOf((((com.airbnb.lottie.OooOO0) oooOOO0.f36087OooO0o0.getValue()) == null && ((Throwable) oooOOO0.f36086OooO0o.getValue()) == null) ? false : true);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Boolean> {
        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((Throwable) OooOOO0.this.f36086OooO0o.getValue()) != null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {
        public OooO0OO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            OooOOO0 oooOOO0 = OooOOO0.this;
            return Boolean.valueOf(((com.airbnb.lottie.OooOO0) oooOOO0.f36087OooO0o0.getValue()) == null && ((Throwable) oooOOO0.f36086OooO0o.getValue()) == null);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {
        public OooO0o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((com.airbnb.lottie.OooOO0) OooOOO0.this.f36087OooO0o0.getValue()) != null);
        }
    }

    public final synchronized void OooO0OO(@NotNull com.airbnb.lottie.OooOO0 composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        if (((Boolean) this.f36089OooO0oo.getValue()).booleanValue()) {
            return;
        }
        this.f36087OooO0o0.setValue(composition);
        this.f36085OooO0Oo.complete(composition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return (com.airbnb.lottie.OooOO0) this.f36087OooO0o0.getValue();
    }
}
