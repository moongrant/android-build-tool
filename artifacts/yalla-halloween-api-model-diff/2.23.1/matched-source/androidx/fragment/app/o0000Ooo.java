package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class o0000Ooo extends p114o00O00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final FragmentManager f6001OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6002OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Fragment f6003OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f6004OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f6005OooO0oO;

    @Deprecated
    public o0000Ooo() {
        throw null;
    }

    public o0000Ooo(@NonNull FragmentManager fragmentManager, int i) {
        this.f6004OooO0o0 = null;
        this.f6003OooO0o = null;
        this.f6001OooO0OO = fragmentManager;
        this.f6002OooO0Oo = i;
    }

    @Override // p114o00O00o.OooO0O0
    public final void OooO00o(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f6004OooO0o0 == null) {
            FragmentManager fragmentManager = this.f6001OooO0OO;
            fragmentManager.getClass();
            this.f6004OooO0o0 = new OooO00o(fragmentManager);
        }
        this.f6004OooO0o0.OooO(fragment);
        if (fragment.equals(this.f6003OooO0o)) {
            this.f6003OooO0o = null;
        }
    }

    @Override // p114o00O00o.OooO0O0
    public final void OooO0O0(@NonNull ViewGroup viewGroup) {
        OooO00o oooO00o = this.f6004OooO0o0;
        if (oooO00o != null) {
            if (!this.f6005OooO0oO) {
                try {
                    this.f6005OooO0oO = true;
                    if (oooO00o.f6013OooO0oO) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    oooO00o.f5901OooOOOo.OooOoO0(oooO00o, true);
                    this.f6005OooO0oO = false;
                } catch (Throwable th) {
                    this.f6005OooO0oO = false;
                    throw th;
                }
            }
            this.f6004OooO0o0 = null;
        }
    }

    @Override // p114o00O00o.OooO0O0
    @NonNull
    public final Object OooO0oO(@NonNull ViewGroup viewGroup, int i) {
        OooO00o oooO00o = this.f6004OooO0o0;
        FragmentManager fragmentManager = this.f6001OooO0OO;
        if (oooO00o == null) {
            fragmentManager.getClass();
            this.f6004OooO0o0 = new OooO00o(fragmentManager);
        }
        long jOooOOo = OooOOo(i);
        Fragment fragmentOooOoo = fragmentManager.OooOoo("android:switcher:" + viewGroup.getId() + CertificateUtil.DELIMITER + jOooOOo);
        if (fragmentOooOoo != null) {
            OooO00o oooO00o2 = this.f6004OooO0o0;
            oooO00o2.getClass();
            oooO00o2.OooO0O0(new o0000oo.OooO00o(fragmentOooOoo, 7));
        } else {
            fragmentOooOoo = OooOOo0(i);
            this.f6004OooO0o0.OooO0OO(viewGroup.getId(), fragmentOooOoo, "android:switcher:" + viewGroup.getId() + CertificateUtil.DELIMITER + jOooOOo, 1);
        }
        if (fragmentOooOoo != this.f6003OooO0o) {
            fragmentOooOoo.setMenuVisibility(false);
            if (this.f6002OooO0Oo == 1) {
                this.f6004OooO0o0.OooOOO0(fragmentOooOoo, Lifecycle.State.STARTED);
            } else {
                fragmentOooOoo.setUserVisibleHint(false);
            }
        }
        return fragmentOooOoo;
    }

    @Override // p114o00O00o.OooO0O0
    public final boolean OooO0oo(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p114o00O00o.OooO0O0
    public final void OooOO0O(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Override // p114o00O00o.OooO0O0
    @Nullable
    public final Parcelable OooOO0o() {
        return null;
    }

    @Override // p114o00O00o.OooO0O0
    public final void OooOOO0(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f6003OooO0o;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.f6001OooO0OO;
            int i2 = this.f6002OooO0Oo;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i2 == 1) {
                    if (this.f6004OooO0o0 == null) {
                        fragmentManager.getClass();
                        this.f6004OooO0o0 = new OooO00o(fragmentManager);
                    }
                    this.f6004OooO0o0.OooOOO0(this.f6003OooO0o, Lifecycle.State.STARTED);
                } else {
                    this.f6003OooO0o.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i2 == 1) {
                if (this.f6004OooO0o0 == null) {
                    fragmentManager.getClass();
                    this.f6004OooO0o0 = new OooO00o(fragmentManager);
                }
                this.f6004OooO0o0.OooOOO0(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f6003OooO0o = fragment;
        }
    }

    @Override // p114o00O00o.OooO0O0
    public final void OooOOOO(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public long OooOOo(int i) {
        return i;
    }

    @NonNull
    public abstract Fragment OooOOo0(int i);
}
