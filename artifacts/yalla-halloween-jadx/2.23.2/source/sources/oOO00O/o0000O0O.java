package oOO00O;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class o0000O0O implements o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WindowId f60150OooO00o;

    public o0000O0O(@NonNull View view) {
        this.f60150OooO00o = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0000O0O) && ((o0000O0O) obj).f60150OooO00o.equals(this.f60150OooO00o);
    }

    public final int hashCode() {
        return this.f60150OooO00o.hashCode();
    }
}
