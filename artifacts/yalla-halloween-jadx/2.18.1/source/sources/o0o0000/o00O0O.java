package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.TaskService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0O f40830OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40831OooO0O0 = LazyKt.lazy(OooO00o.f40832Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<TaskService> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40832Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TaskService invoke() {
            return (TaskService) OooO0O0.f40784OooO00o.OooO0Oo().OooO0O0(TaskService.class);
        }
    }

    @NotNull
    public static final TaskService OooO00o() {
        Object value = f40831OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-task>(...)");
        return (TaskService) value;
    }
}
