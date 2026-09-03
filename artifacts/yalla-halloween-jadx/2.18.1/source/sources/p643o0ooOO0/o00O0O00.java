package p643o0ooOO0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 implements o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<oo00o, Boolean> f48880OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48881OooO0O0;

    public o00O0O00(int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this.f48880OooO00o = function1;
        this.f48881OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new oo00o(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p643o0ooOO0.o00O0
    public final int OooO00o() {
        return ((oo00o) this.f48881OooO0O0.getValue()).f48882OooO00o;
    }
}
