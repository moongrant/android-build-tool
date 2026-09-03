package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CopyOnWriteArrayList<OooO00o> f6030OooO00o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FragmentManager f6031OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final FragmentManager.OooOo00 f6032OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f6033OooO0O0;

        public OooO00o(@NonNull FragmentManager.OooOo00 oooOo00, boolean z) {
            this.f6032OooO00o = oooOo00;
            this.f6033OooO0O0 = z;
        }
    }

    public o0OO00O(@NonNull FragmentManager fragmentManager) {
        this.f6031OooO0O0 = fragmentManager;
    }

    public final void OooO(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentResumed(fragmentManager, fragment);
            }
        }
    }

    public final void OooO00o(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO00o(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void OooO0O0(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Context context = fragmentManager.f5822OooOo0.f6036OooO0o0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO0O0(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentAttached(fragmentManager, fragment, context);
            }
        }
    }

    public final void OooO0OO(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO0OO(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void OooO0Oo(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO0Oo(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void OooO0o(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO0o(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    public final void OooO0o0(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO0o0(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentDetached(fragmentManager, fragment);
            }
        }
    }

    public final void OooO0oO(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Context context = fragmentManager.f5822OooOo0.f6036OooO0o0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO0oO(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentPreAttached(fragmentManager, fragment, context);
            }
        }
    }

    public final void OooO0oo(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooO0oo(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void OooOO0(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooOO0(fragment, bundle, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void OooOO0O(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooOO0O(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentStarted(fragmentManager, fragment);
            }
        }
    }

    public final void OooOO0o(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooOO0o(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentStopped(fragmentManager, fragment);
            }
        }
    }

    public final void OooOOO(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooOOO(fragment, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void OooOOO0(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.f6031OooO0O0;
        Fragment fragment2 = fragmentManager.f5825OooOo0o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f5815OooOOO0.OooOOO0(fragment, view, bundle, true);
        }
        for (OooO00o oooO00o : this.f6030OooO00o) {
            if (!z || oooO00o.f6033OooO0O0) {
                oooO00o.f6032OooO00o.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    }
}
