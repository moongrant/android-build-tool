package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO0o f3645OooO = Config.OooO00o.OooO00o(Integer.TYPE, "camerax.core.captureConfig.rotation");

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0o f3646OooOO0 = Config.OooO00o.OooO00o(Integer.class, "camerax.core.captureConfig.jpegQuality");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<DeferrableSurface> f3647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Config f3648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3649OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Range<Integer> f3650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f3651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o000oOoO> f3652OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final o00OO f3653OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o00Oo0 f3654OooO0oo;

    public interface OooO0O0 {
        void OooO00o(@NonNull o0o0Oo<?> o0o0oo, @NonNull OooO00o oooO00o);
    }

    public o000000O(ArrayList arrayList, o00O0 o00o1, int i, @NonNull Range range, ArrayList arrayList2, boolean z, @NonNull o00OO o00oo2, @Nullable o00Oo0 o00oo1) {
        this.f3647OooO00o = arrayList;
        this.f3648OooO0O0 = o00o1;
        this.f3649OooO0OO = i;
        this.f3650OooO0Oo = range;
        this.f3652OooO0o0 = Collections.unmodifiableList(arrayList2);
        this.f3651OooO0o = z;
        this.f3653OooO0oO = o00oo2;
        this.f3654OooO0oo = o00oo1;
    }

    @NonNull
    public final List<DeferrableSurface> OooO00o() {
        return Collections.unmodifiableList(this.f3647OooO00o);
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f3655OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00O00O f3656OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f3657OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Range<Integer> f3658OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f3659OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f3660OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o00O00OO f3661OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public o00Oo0 f3662OooO0oo;

        public OooO00o() {
            this.f3655OooO00o = new HashSet();
            this.f3656OooO0O0 = o00O00O.Oooo0OO();
            this.f3657OooO0OO = -1;
            this.f3658OooO0Oo = o00OO0O0.f3743OooO00o;
            this.f3660OooO0o0 = new ArrayList();
            this.f3659OooO0o = false;
            this.f3661OooO0oO = o00O00OO.OooO0OO();
        }

        public final void OooO00o(@NonNull List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OooO0O0((o000oOoO) it.next());
            }
        }

        public final void OooO0O0(@NonNull o000oOoO o000oooo2) {
            ArrayList arrayList = this.f3660OooO0o0;
            if (arrayList.contains(o000oooo2)) {
                return;
            }
            arrayList.add(o000oooo2);
        }

        public final void OooO0OO(@NonNull Config config) {
            Object objOooO0O0;
            for (Config.OooO00o<?> oooO00o : config.OooO0oo()) {
                o00O00O o00o00o2 = this.f3656OooO0O0;
                o00o00o2.getClass();
                try {
                    objOooO0O0 = o00o00o2.OooO0O0(oooO00o);
                } catch (IllegalArgumentException unused) {
                    objOooO0O0 = null;
                }
                Object objOooO0O1 = config.OooO0O0(oooO00o);
                if (objOooO0O0 instanceof o00O000o) {
                    o00O000o o00o000o2 = (o00O000o) objOooO0O1;
                    o00o000o2.getClass();
                    ((o00O000o) objOooO0O0).f3721OooO00o.addAll(Collections.unmodifiableList(new ArrayList(o00o000o2.f3721OooO00o)));
                } else {
                    if (objOooO0O1 instanceof o00O000o) {
                        objOooO0O1 = ((o00O000o) objOooO0O1).clone();
                    }
                    this.f3656OooO0O0.Oooo0o(oooO00o, config.OooOoo(oooO00o), objOooO0O1);
                }
            }
        }

        @NonNull
        public final o000000O OooO0Oo() {
            ArrayList arrayList = new ArrayList(this.f3655OooO00o);
            o00O0 o00o0Oooo0O0 = o00O0.Oooo0O0(this.f3656OooO0O0);
            int i = this.f3657OooO0OO;
            Range<Integer> range = this.f3658OooO0Oo;
            ArrayList arrayList2 = new ArrayList(this.f3660OooO0o0);
            boolean z = this.f3659OooO0o;
            o00OO o00oo2 = o00OO.f3727OooO0O0;
            ArrayMap arrayMap = new ArrayMap();
            o00O00OO o00o00oo2 = this.f3661OooO0oO;
            for (String str : o00o00oo2.OooO0O0()) {
                arrayMap.put(str, o00o00oo2.OooO00o(str));
            }
            return new o000000O(arrayList, o00o0Oooo0O0, i, range, arrayList2, z, new o00OO(arrayMap), this.f3662OooO0oo);
        }

        public OooO00o(o000000O o000000o2) {
            HashSet hashSet = new HashSet();
            this.f3655OooO00o = hashSet;
            this.f3656OooO0O0 = o00O00O.Oooo0OO();
            this.f3657OooO0OO = -1;
            this.f3658OooO0Oo = o00OO0O0.f3743OooO00o;
            ArrayList arrayList = new ArrayList();
            this.f3660OooO0o0 = arrayList;
            this.f3659OooO0o = false;
            this.f3661OooO0oO = o00O00OO.OooO0OO();
            hashSet.addAll(o000000o2.f3647OooO00o);
            this.f3656OooO0O0 = o00O00O.Oooo0o0(o000000o2.f3648OooO0O0);
            this.f3657OooO0OO = o000000o2.f3649OooO0OO;
            this.f3658OooO0Oo = o000000o2.f3650OooO0Oo;
            arrayList.addAll(o000000o2.f3652OooO0o0);
            this.f3659OooO0o = o000000o2.f3651OooO0o;
            ArrayMap arrayMap = new ArrayMap();
            o00OO o00oo2 = o000000o2.f3653OooO0oO;
            for (String str : o00oo2.OooO0O0()) {
                arrayMap.put(str, o00oo2.OooO00o(str));
            }
            this.f3661OooO0oO = new o00O00OO(arrayMap);
        }
    }
}
