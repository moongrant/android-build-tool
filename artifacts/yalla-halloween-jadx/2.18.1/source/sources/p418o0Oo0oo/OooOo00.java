package p418o0Oo0oo;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalComposeUiApi
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39658OooO0O0;

    public OooOo00(long j, long j2) {
        this.f39657OooO00o = j;
        this.f39658OooO0O0 = j2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("HistoricalChange(uptimeMillis=");
        sbOooO0o0.append(this.f39657OooO00o);
        sbOooO0o0.append(", position=");
        sbOooO0o0.append((Object) OooO.OooO(this.f39658OooO0O0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
