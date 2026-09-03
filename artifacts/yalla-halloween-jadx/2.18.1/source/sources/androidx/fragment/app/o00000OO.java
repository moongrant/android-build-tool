package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00000OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8442OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f8444OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f8445OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8447OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f8448OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f8449OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public String f8450OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f8451OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8452OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CharSequence f8453OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList<String> f8454OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList<String> f8455OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<OooO00o> f8443OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f8456OooOOOO = false;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Lifecycle.State f8457OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8458OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Fragment f8459OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f8460OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8461OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f8462OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8463OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f8464OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Lifecycle.State f8465OooO0oo;

        public OooO00o() {
        }

        public OooO00o(int i, Fragment fragment) {
            this.f8458OooO00o = i;
            this.f8459OooO0O0 = fragment;
            this.f8460OooO0OO = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f8465OooO0oo = state;
            this.f8457OooO = state;
        }

        public OooO00o(int i, Fragment fragment, boolean z) {
            this.f8458OooO00o = i;
            this.f8459OooO0O0 = fragment;
            this.f8460OooO0OO = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f8465OooO0oo = state;
            this.f8457OooO = state;
        }

        public OooO00o(@NonNull Fragment fragment, Lifecycle.State state) {
            this.f8458OooO00o = 10;
            this.f8459OooO0O0 = fragment;
            this.f8460OooO0OO = false;
            this.f8465OooO0oo = fragment.mMaxState;
            this.f8457OooO = state;
        }
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f8443OooO00o.add(oooO00o);
        oooO00o.f8461OooO0Oo = this.f8444OooO0O0;
        oooO00o.f8463OooO0o0 = this.f8445OooO0OO;
        oooO00o.f8462OooO0o = this.f8446OooO0Oo;
        oooO00o.f8464OooO0oO = this.f8448OooO0o0;
    }

    public abstract void OooO0OO();

    public abstract void OooO0Oo(int i, Fragment fragment, @Nullable String str, int i2);

    @NonNull
    public abstract o00000OO OooO0o0(@NonNull Fragment fragment, @NonNull Lifecycle.State state);
}
