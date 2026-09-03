package o0000O;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class OooO implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f34015OooO00o;

    public OooO(@NonNull OooO0o oooO0o) {
        this.f34015OooO00o = oooO0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO) {
            return this.f34015OooO00o.equals(((OooO) obj).f34015OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34015OooO00o.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f34015OooO00o.onTouchExplorationStateChanged(z);
    }
}
