package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.facebook.internal.security.CertificateUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class o00000O0 extends p106o000oo0o.o00Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final FragmentManager f8445OooO0OO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f8449OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f8448OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Fragment f8447OooO0o = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f8446OooO0Oo = 0;

    @Deprecated
    public o00000O0(@NonNull FragmentManager fragmentManager) {
        this.f8445OooO0OO = fragmentManager;
    }

    public static String OooOOo(int i, long j) {
        return "android:switcher:" + i + CertificateUtil.DELIMITER + j;
    }

    @Override // p106o000oo0o.o00Ooo
    public final void OooO00o(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f8448OooO0o0 == null) {
            this.f8448OooO0o0 = new OooO00o(this.f8445OooO0OO);
        }
        this.f8448OooO0o0.OooOO0O(fragment);
        if (fragment.equals(this.f8447OooO0o)) {
            this.f8447OooO0o = null;
        }
    }

    @Override // p106o000oo0o.o00Ooo
    public final void OooO0O0(@NonNull ViewGroup viewGroup) {
        OooO00o oooO00o = this.f8448OooO0o0;
        if (oooO00o != null) {
            if (!this.f8449OooO0oO) {
                try {
                    this.f8449OooO0oO = true;
                    oooO00o.OooOO0();
                    this.f8449OooO0oO = false;
                } catch (Throwable th) {
                    this.f8449OooO0oO = false;
                    throw th;
                }
            }
            this.f8448OooO0o0 = null;
        }
    }

    @Override // p106o000oo0o.o00Ooo
    @NonNull
    public final Object OooO0oO(@NonNull ViewGroup viewGroup, int i) {
        if (this.f8448OooO0o0 == null) {
            this.f8448OooO0o0 = new OooO00o(this.f8445OooO0OO);
        }
        long jOooOOo0 = OooOOo0(i);
        Fragment fragmentOooo00O = this.f8445OooO0OO.Oooo00O(OooOOo(viewGroup.getId(), jOooOOo0));
        if (fragmentOooo00O != null) {
            OooO00o oooO00o = this.f8448OooO0o0;
            Objects.requireNonNull(oooO00o);
            oooO00o.OooO0O0(new o0000Ooo.OooO00o(7, fragmentOooo00O));
        } else {
            fragmentOooo00O = OooOOOo(i);
            this.f8448OooO0o0.OooO0Oo(viewGroup.getId(), fragmentOooo00O, OooOOo(viewGroup.getId(), jOooOOo0), 1);
        }
        if (fragmentOooo00O != this.f8447OooO0o) {
            fragmentOooo00O.setMenuVisibility(false);
            if (this.f8446OooO0Oo == 1) {
                this.f8448OooO0o0.OooO0o0(fragmentOooo00O, Lifecycle.State.STARTED);
            } else {
                fragmentOooo00O.setUserVisibleHint(false);
            }
        }
        return fragmentOooo00O;
    }

    @Override // p106o000oo0o.o00Ooo
    public final boolean OooO0oo(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p106o000oo0o.o00Ooo
    public final void OooOO0O(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Override // p106o000oo0o.o00Ooo
    @Nullable
    public final Parcelable OooOO0o() {
        return null;
    }

    @Override // p106o000oo0o.o00Ooo
    public final void OooOOO(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // p106o000oo0o.o00Ooo
    public final void OooOOO0(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f8447OooO0o;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f8446OooO0Oo == 1) {
                    if (this.f8448OooO0o0 == null) {
                        this.f8448OooO0o0 = new OooO00o(this.f8445OooO0OO);
                    }
                    this.f8448OooO0o0.OooO0o0(this.f8447OooO0o, Lifecycle.State.STARTED);
                } else {
                    this.f8447OooO0o.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f8446OooO0Oo == 1) {
                if (this.f8448OooO0o0 == null) {
                    this.f8448OooO0o0 = new OooO00o(this.f8445OooO0OO);
                }
                this.f8448OooO0o0.OooO0o0(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f8447OooO0o = fragment;
        }
    }

    @NonNull
    public abstract Fragment OooOOOo(int i);

    public long OooOOo0(int i) {
        return i;
    }

    public o00000O0(@NonNull FragmentManager fragmentManager, int i) {
        this.f8445OooO0OO = fragmentManager;
    }
}
