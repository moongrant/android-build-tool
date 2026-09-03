package p507o0o00ooo;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class x0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f50363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Job f50364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f50365OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f50366OooO0Oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Activity activityOooO0O0;
            x0 x0Var = x0.this;
            Job job = x0Var.f50364OooO0O0;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            x0Var.f50364OooO0O0 = null;
            if (x0Var.f50365OooO0OO && (activityOooO0O0 = OooO0O0.OooO0O0()) != null) {
                activityOooO0O0.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    public x0() {
        this(false);
    }

    public x0(boolean z) {
        this.f50363OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.f50366OooO0Oo = new OooO00o();
    }
}
