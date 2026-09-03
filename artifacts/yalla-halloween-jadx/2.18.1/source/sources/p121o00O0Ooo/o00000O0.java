package p121o00O0Ooo;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.airbnb.lottie.OooOO0O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00OOO00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00000O0 implements oO0Oo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<OooOO0O> f30874Oooo0o = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30875Oooo0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30876Oooo0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f30873Oooo = (o00OOO00) o0OOO00.OooO0O0(new OooO0OO());

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f30878OoooO00 = (o00OOO00) o0OOO00.OooO0O0(new OooO00o());

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f30877OoooO0 = (o00OOO00) o0OOO00.OooO0O0(new OooO0O0());

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f30879OoooO0O = (o00OOO00) o0OOO00.OooO0O0(new OooO0o());

    public static final class OooO00o extends Lambda implements Function0<Boolean> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf((o00000O0.this.getValue() == null && o00000O0.this.OooO00o() == null) ? false : true);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Boolean> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(o00000O0.this.OooO00o() != null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(o00000O0.this.getValue() == null && o00000O0.this.OooO00o() == null);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(o00000O0.this.getValue() != null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Throwable OooO00o() {
        return (Throwable) this.f30876Oooo0oo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p100o000oOoO.oO0Oo
    @Nullable
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public final OooOO0O getValue() {
        return (OooOO0O) this.f30875Oooo0oO.getValue();
    }

    public final boolean OooOOO() {
        return ((Boolean) this.f30878OoooO00.getValue()).booleanValue();
    }
}
