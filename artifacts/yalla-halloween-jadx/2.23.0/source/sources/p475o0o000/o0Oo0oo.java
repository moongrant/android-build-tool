package p475o0o000;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.app.base.protobuf.room.Room;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<Room.EnvelopInfo> f47475OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47476OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47477OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public o0Oo0oo() {
        SnapshotStateList<Room.EnvelopInfo> snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
        com.yalla.yalla.service.room.OooO00o.f24976OooO0Oo.add(new o0ooOOo(snapshotStateListMutableStateListOf));
        this.f47475OooO00o = snapshotStateListMutableStateListOf;
        this.f47476OooO0O0 = Oooo000.OooO0OO(OooO00o.f47477OooO0Oo);
    }

    @NotNull
    public final SnapshotStateList<Room.EnvelopInfo> OooO0Oo() {
        return this.f47475OooO00o;
    }
}
