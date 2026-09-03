package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f6001OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f6003OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f6004OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f6005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f6006OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f6007OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f6008OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public String f6009OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f6010OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f6011OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CharSequence f6012OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList<String> f6013OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList<String> f6014OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooO00o> f6002OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f6015OooOOOO = false;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Lifecycle.State f6016OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f6017OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Fragment f6018OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f6019OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f6020OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f6021OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f6022OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f6023OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Lifecycle.State f6024OooO0oo;

        public OooO00o() {
        }

        public OooO00o(Fragment fragment, int i) {
            this.f6017OooO00o = i;
            this.f6018OooO0O0 = fragment;
            this.f6019OooO0OO = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f6024OooO0oo = state;
            this.f6016OooO = state;
        }

        public OooO00o(int i, Fragment fragment) {
            this.f6017OooO00o = i;
            this.f6018OooO0O0 = fragment;
            this.f6019OooO0OO = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f6024OooO0oo = state;
            this.f6016OooO = state;
        }

        public OooO00o(@NonNull Fragment fragment, Lifecycle.State state) {
            this.f6017OooO00o = 10;
            this.f6018OooO0O0 = fragment;
            this.f6019OooO0OO = false;
            this.f6024OooO0oo = fragment.mMaxState;
            this.f6016OooO = state;
        }
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f6002OooO00o.add(oooO00o);
        oooO00o.f6020OooO0Oo = this.f6003OooO0O0;
        oooO00o.f6022OooO0o0 = this.f6004OooO0OO;
        oooO00o.f6021OooO0o = this.f6005OooO0Oo;
        oooO00o.f6023OooO0oO = this.f6007OooO0o0;
    }

    public abstract void OooO0OO(int i, Fragment fragment, @Nullable String str, int i2);
}
