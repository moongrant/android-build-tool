package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f5822OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);

    public interface OooO00o {
        void cancel();
    }

    public interface OooO0O0 {
        @NotNull
        OooO00o OooO0OO(int i, long j);
    }

    @NotNull
    public final OooO00o OooO00o(int i, long j) {
        OooO00o oooO00oOooO0OO;
        OooO0O0 oooO0O0 = (OooO0O0) this.f5822OooO00o.getValue();
        return (oooO0O0 == null || (oooO00oOooO0OO = oooO0O0.OooO0OO(i, j)) == null) ? androidx.compose.foundation.lazy.layout.OooO00o.f5792OooO00o : oooO00oOooO0OO;
    }
}
