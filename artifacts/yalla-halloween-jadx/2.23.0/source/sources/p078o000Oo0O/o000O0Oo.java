package p078o000Oo0O;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class o000O0Oo implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WindowId f34950OooO00o;

    public o000O0Oo(@NonNull View view) {
        this.f34950OooO00o = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o000O0Oo) && ((o000O0Oo) obj).f34950OooO00o.equals(this.f34950OooO00o);
    }

    public final int hashCode() {
        return this.f34950OooO00o.hashCode();
    }
}
