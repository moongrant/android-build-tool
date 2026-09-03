package p571o0oOo0o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Job f45560OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f45561OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public o0O00OO<Boolean> f45559OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f45562OooO0Oo = new OooO00o();

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Job job = o00O0O00.this.f45560OooO0O0;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            o00O0O00 o00o0o01 = o00O0O00.this;
            o00o0o01.f45560OooO0O0 = null;
            if (o00o0o01.f45561OooO0OO) {
                o000O o000o = o000O.f46945OooO00o;
                o000O.OooO0O0();
            }
            return Unit.INSTANCE;
        }
    }
}
