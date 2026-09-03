package p483o0o000Oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class o0ooOOo {
    @NotNull
    public static MutableLiveData OooO00o(@NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        MutableLiveData mutableLiveData = new MutableLiveData(initializer.invoke());
        ArrayList arrayList = OooO00o.f24511OooO00o;
        OooO00o.f24511OooO00o.add(new o00000O0(mutableLiveData, initializer));
        return mutableLiveData;
    }

    @NotNull
    public static MutableStateFlow OooO0O0(@NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(initializer.invoke());
        ArrayList arrayList = OooO00o.f24511OooO00o;
        OooO00o.f24512OooO0O0.add(new o000OO(MutableStateFlow, initializer));
        return MutableStateFlow;
    }

    @NotNull
    public static MutableState OooO0OO(@NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initializer.invoke(), null, 2, null);
        ArrayList arrayList = OooO00o.f24511OooO00o;
        OooO00o.f24513OooO0OO.add(new o0000O(mutableStateMutableStateOf$default, initializer));
        return mutableStateMutableStateOf$default;
    }
}
