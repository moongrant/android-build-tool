package androidx.core.view;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f5336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC0124OooO0O0 f5337OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooO00o {
    }

    /* JADX INFO: renamed from: androidx.core.view.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0124OooO0O0 {
    }

    public boolean OooO00o() {
        return false;
    }

    public boolean OooO0O0() {
        return true;
    }

    @NonNull
    public abstract View OooO0OO();

    @NonNull
    public View OooO0Oo(@NonNull MenuItem menuItem) {
        return OooO0OO();
    }

    public void OooO0o(@NonNull androidx.appcompat.view.menu.OooOo oooOo) {
    }

    public boolean OooO0o0() {
        return false;
    }

    public boolean OooO0oO() {
        return false;
    }

    public void OooO0oo(@Nullable androidx.appcompat.view.menu.OooOO0O.OooO00o oooO00o) {
        if (this.f5337OooO0O0 != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f5337OooO0O0 = oooO00o;
    }
}
