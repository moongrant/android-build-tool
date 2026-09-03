package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CopyOnWriteArrayList<OooO00o> f8523OooO00o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FragmentManager f8524OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final FragmentManager.OooOo00 f8525OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f8526OooO0O0;

        public OooO00o(@NonNull FragmentManager.OooOo00 oooOo00, boolean z) {
            this.f8525OooO00o = oooOo00;
            this.f8526OooO0O0 = z;
        }
    }

    public o0ooOOo(@NonNull FragmentManager fragmentManager) {
        this.f8524OooO0O0 = fragmentManager;
    }

    public final void OooO(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentResumed(this.f8524OooO0O0, fragment);
            }
        }
    }

    public final void OooO00o(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO00o(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentActivityCreated(this.f8524OooO0O0, fragment, bundle);
            }
        }
    }

    public final void OooO0O0(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f8524OooO0O0;
        Context context = fragmentManager.f8306OooOo0.f8529Oooo0oO;
        Fragment fragment2 = fragmentManager.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO0O0(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentAttached(this.f8524OooO0O0, fragment, context);
            }
        }
    }

    public final void OooO0OO(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO0OO(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentCreated(this.f8524OooO0O0, fragment, bundle);
            }
        }
    }

    public final void OooO0Oo(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO0Oo(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentDestroyed(this.f8524OooO0O0, fragment);
            }
        }
    }

    public final void OooO0o(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO0o(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentPaused(this.f8524OooO0O0, fragment);
            }
        }
    }

    public final void OooO0o0(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO0o0(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentDetached(this.f8524OooO0O0, fragment);
            }
        }
    }

    public final void OooO0oO(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f8524OooO0O0;
        Context context = fragmentManager.f8306OooOo0.f8529Oooo0oO;
        Fragment fragment2 = fragmentManager.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO0oO(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentPreAttached(this.f8524OooO0O0, fragment, context);
            }
        }
    }

    public final void OooO0oo(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooO0oo(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentPreCreated(this.f8524OooO0O0, fragment, bundle);
            }
        }
    }

    public final void OooOO0(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooOO0(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentSaveInstanceState(this.f8524OooO0O0, fragment, bundle);
            }
        }
    }

    public final void OooOO0O(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooOO0O(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentStarted(this.f8524OooO0O0, fragment);
            }
        }
    }

    public final void OooOO0o(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooOO0o(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentStopped(this.f8524OooO0O0, fragment);
            }
        }
    }

    public final void OooOOO(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooOOO(fragment, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentViewDestroyed(this.f8524OooO0O0, fragment);
            }
        }
    }

    public final void OooOOO0(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.f8524OooO0O0.f8309OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f8299OooOOO0.OooOOO0(fragment, view, bundle, true);
        }
        for (OooO00o oooO00o : this.f8523OooO00o) {
            if (!z || oooO00o.f8526OooO0O0) {
                oooO00o.f8525OooO00o.onFragmentViewCreated(this.f8524OooO0O0, fragment, view, bundle);
            }
        }
    }
}
