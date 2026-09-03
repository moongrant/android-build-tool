package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f5961OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f5963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f5964OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f5965OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f5966OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f5967OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f5968OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public String f5969OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f5970OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f5971OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CharSequence f5972OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList<String> f5973OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList<String> f5974OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooO00o> f5962OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f5975OooOOOO = false;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Lifecycle.State f5976OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f5977OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Fragment f5978OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f5979OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f5980OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5981OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f5982OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f5983OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Lifecycle.State f5984OooO0oo;

        public OooO00o() {
        }

        public OooO00o(Fragment fragment, int i) {
            this.f5977OooO00o = i;
            this.f5978OooO0O0 = fragment;
            this.f5979OooO0OO = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f5984OooO0oo = state;
            this.f5976OooO = state;
        }

        public OooO00o(int i, Fragment fragment) {
            this.f5977OooO00o = i;
            this.f5978OooO0O0 = fragment;
            this.f5979OooO0OO = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f5984OooO0oo = state;
            this.f5976OooO = state;
        }

        public OooO00o(@NonNull Fragment fragment, Lifecycle.State state) {
            this.f5977OooO00o = 10;
            this.f5978OooO0O0 = fragment;
            this.f5979OooO0OO = false;
            this.f5984OooO0oo = fragment.mMaxState;
            this.f5976OooO = state;
        }
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f5962OooO00o.add(oooO00o);
        oooO00o.f5980OooO0Oo = this.f5963OooO0O0;
        oooO00o.f5982OooO0o0 = this.f5964OooO0OO;
        oooO00o.f5981OooO0o = this.f5965OooO0Oo;
        oooO00o.f5983OooO0oO = this.f5967OooO0o0;
    }

    public abstract void OooO0OO(int i, Fragment fragment, @Nullable String str, int i2);
}
