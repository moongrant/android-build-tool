package p101o000oOoo;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public final class oO00o00 implements oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WindowId f29757OooO00o;

    public oO00o00(@NonNull View view) {
        this.f29757OooO00o = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oO00o00) && ((oO00o00) obj).f29757OooO00o.equals(this.f29757OooO00o);
    }

    public final int hashCode() {
        return this.f29757OooO00o.hashCode();
    }
}
