package p495o0o00Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOOO<T> extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Job f49627OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f49628OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<CopyOnWriteArrayList<T>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f49629OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(@NotNull MixedRoomActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f49628OooO0OO = LazyKt.lazy(OooO00o.f49629OooO0Oo);
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO0O0() {
        OooO0OO().clear();
    }

    public final CopyOnWriteArrayList<T> OooO0OO() {
        return (CopyOnWriteArrayList) this.f49628OooO0OO.getValue();
    }
}
