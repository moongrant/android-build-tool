package p545o0o0OoOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class e8<T> extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Job f44368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f44369OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<CopyOnWriteArrayList<T>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f44370Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(@NotNull MixedRoomActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f44369OooO0OO = LazyKt.lazy(OooO00o.f44370Oooo0o);
    }

    public final CopyOnWriteArrayList<T> OooO0OO() {
        return (CopyOnWriteArrayList) this.f44369OooO0OO.getValue();
    }
}
