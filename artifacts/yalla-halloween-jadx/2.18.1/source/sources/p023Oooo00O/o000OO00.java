package p023Oooo00O;

import androidx.compose.animation.core.MutatePriority;
import androidx.compose.runtime.Stable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final AtomicReference<OooO00o> f1077OooO00o = new AtomicReference<>(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Mutex f1078OooO0O0 = MutexKt.Mutex$default(false, 1, null);

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final MutatePriority f1079OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Job f1080OooO0O0;

        public OooO00o(@NotNull MutatePriority priority, @NotNull Job job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f1079OooO00o = priority;
            this.f1080OooO0O0 = job;
        }
    }
}
