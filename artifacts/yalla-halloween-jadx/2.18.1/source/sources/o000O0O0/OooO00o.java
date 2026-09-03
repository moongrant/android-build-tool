package o000O0O0;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuPresenter;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC0294OooO00o f28101OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f28102OooO0O0;

    /* JADX INFO: renamed from: o000O0O0.OooO00o$OooO00o, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0294OooO00o {
    }

    public interface OooO0O0 {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO(boolean z) {
        InterfaceC0294OooO00o interfaceC0294OooO00o = this.f28101OooO00o;
        if (interfaceC0294OooO00o != null) {
            ActionMenuPresenter actionMenuPresenter = (ActionMenuPresenter) interfaceC0294OooO00o;
            if (z) {
                androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o = actionMenuPresenter.f4686OoooO00;
                if (oooO00o != null) {
                    oooO00o.OooO0Oo(actionMenuPresenter.f4683Oooo0oo);
                    return;
                }
                return;
            }
            androidx.appcompat.view.menu.OooO0o oooO0o = actionMenuPresenter.f4683Oooo0oo;
            if (oooO0o != null) {
                oooO0o.OooO0Oo(false);
            }
        }
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

    public void OooO0o(@NonNull SubMenu subMenu) {
    }

    public boolean OooO0o0() {
        return false;
    }

    public boolean OooO0oO() {
        return false;
    }

    public void OooO0oo(@Nullable OooO0O0 oooO0O0) {
        if (this.f28102OooO0O0 != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sbOooO0o0.append(getClass().getSimpleName());
            sbOooO0o0.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sbOooO0o0.toString());
        }
        this.f28102OooO0O0 = oooO0O0;
    }
}
