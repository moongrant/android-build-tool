package p377o0OOoOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.TaskService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44228OooO00o = LazyKt.lazy(OooO00o.f44229OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<TaskService> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44229OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TaskService invoke() {
            Lazy lazy = o0000O0O.f44197OooO00o;
            return (TaskService) o0000O0O.OooO0Oo().OooO0O0(TaskService.class);
        }
    }

    @NotNull
    public static TaskService OooO00o() {
        Object value = f44228OooO00o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-task>(...)");
        return (TaskService) value;
    }
}
