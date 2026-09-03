package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p016OooOoO0.OooOo00;
import p021OooOooo.Oooo0;
import p021OooOooo.o00O0O;
import p021OooOooo.o00Ooo;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000Oo;
import p101o000oOoo.oO000o00;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00O0o0;
import p101o000oOoo.oO00OO0O;
import p101o000oOoo.oO00OOOo;
import p101o000oOoo.oO00o00;
import p101o000oOoo.oO00o000;
import p101o000oOoo.oO0O0OoO;
import p101o000oOoo.oO0OOO00;
import p101o000oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final int[] f9555Oooooo = {2, 1, 3, 4};

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final OooO00o f9556OoooooO = new OooO00o();

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static ThreadLocal<Oooo0<Animator, OooO0O0>> f9557Ooooooo = new ThreadLocal<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TimeInterpolator f9558Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f9559Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f9560Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f9561Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public oOo00OO0 f9562OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ArrayList<View> f9563OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ArrayList<Integer> f9564OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public oOo00OO0 f9565OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TransitionSet f9566OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ArrayList<oO00O0o> f9567OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ArrayList<oO00O0o> f9568OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ArrayList<Animator> f9569OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f9570OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f9571OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f9572Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ArrayList<OooO0o> f9573Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ArrayList<Animator> f9574OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public oO00O0o0 f9575OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public OooO0OO f9576OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public PathMotion f9577Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int[] f9578o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface MatchOrder {
    }

    public class OooO00o extends PathMotion {
        @Override // androidx.transition.PathMotion
        public final Path OooO00o(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public View f9579OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f9580OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public oO00O0o f9581OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public oO0OOO00 f9582OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Transition f9583OooO0o0;

        public OooO0O0(View view, String str, Transition transition, oO0OOO00 oo0ooo00, oO00O0o oo00o0o) {
            this.f9579OooO00o = view;
            this.f9580OooO0O0 = str;
            this.f9581OooO0OO = oo00o0o;
            this.f9582OooO0Oo = oo0ooo00;
            this.f9583OooO0o0 = transition;
        }
    }

    public static abstract class OooO0OO {
        public abstract Rect OooO00o();
    }

    public interface OooO0o {
        void OooO00o();

        void OooO0O0(@NonNull Transition transition);

        void OooO0OO();

        void OooO0Oo(@NonNull Transition transition);

        void OooO0o0();
    }

    public Transition() {
        this.f9559Oooo0o = getClass().getName();
        this.f9560Oooo0oO = -1L;
        this.f9561Oooo0oo = -1L;
        this.f9558Oooo = null;
        this.f9564OoooO00 = new ArrayList<>();
        this.f9563OoooO0 = new ArrayList<>();
        this.f9565OoooO0O = new oOo00OO0();
        this.f9562OoooO = new oOo00OO0();
        this.f9566OoooOO0 = null;
        this.f9578o000oOoO = f9555Oooooo;
        this.f9569OoooOo0 = new ArrayList<>();
        this.f9570OoooOoO = 0;
        this.f9571OoooOoo = false;
        this.f9572Ooooo00 = false;
        this.f9573Ooooo0o = null;
        this.f9574OooooO0 = new ArrayList<>();
        this.f9577Oooooo0 = f9556OoooooO;
    }

    public static void OooO0o0(oOo00OO0 ooo00oo0, View view, oO00O0o oo00o0o) {
        ooo00oo0.f29781OooO00o.put(view, oo00o0o);
        int id = view.getId();
        if (id >= 0) {
            if (ooo00oo0.f29782OooO0O0.indexOfKey(id) >= 0) {
                ooo00oo0.f29782OooO0O0.put(id, null);
            } else {
                ooo00oo0.f29782OooO0O0.put(id, view);
            }
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view);
        if (strOooOO0O != null) {
            if (ooo00oo0.f29784OooO0Oo.containsKey(strOooOO0O)) {
                ooo00oo0.f29784OooO0Oo.put(strOooOO0O, null);
            } else {
                ooo00oo0.f29784OooO0Oo.put(strOooOO0O, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                o00Ooo<View> o00ooo2 = ooo00oo0.f29783OooO0OO;
                if (o00ooo2.f412Oooo0o) {
                    o00ooo2.OooO0oO();
                }
                if (o00O0O.OooO0OO(o00ooo2.f413Oooo0oO, o00ooo2.f411Oooo, itemIdAtPosition) < 0) {
                    ViewCompat.OooO0o.OooOOo(view, true);
                    ooo00oo0.f29783OooO0OO.OooOO0o(itemIdAtPosition, view);
                    return;
                }
                View viewOooO = ooo00oo0.f29783OooO0OO.OooO(itemIdAtPosition, null);
                if (viewOooO != null) {
                    ViewCompat.OooO0o.OooOOo(viewOooO, false);
                    ooo00oo0.f29783OooO0OO.OooOO0o(itemIdAtPosition, null);
                }
            }
        }
    }

    public static Oooo0<Animator, OooO0O0> OooOOoo() {
        Oooo0<Animator, OooO0O0> oooo0 = f9557Ooooooo.get();
        if (oooo0 != null) {
            return oooo0;
        }
        Oooo0<Animator, OooO0O0> oooo1 = new Oooo0<>();
        f9557Ooooooo.set(oooo1);
        return oooo1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public static boolean OooOo(oO00O0o oo00o0o, oO00O0o oo00o0o2, String str) {
        Object obj = oo00o0o.f29742OooO00o.get(str);
        Object obj2 = oo00o0o2.f29742OooO00o.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public void OooO(oO00O0o oo00o0o) {
        if (this.f9575OooooOO == null || oo00o0o.f29742OooO00o.isEmpty()) {
            return;
        }
        this.f9575OooooOO.OooOO0o();
        String[] strArr = oO00o000.f29758OooO00o;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = true;
                break;
            } else if (!oo00o0o.f29742OooO00o.containsKey(strArr[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.f9575OooooOO.OooO0o(oo00o0o);
    }

    @NonNull
    public Transition OooO0OO(@NonNull OooO0o oooO0o) {
        if (this.f9573Ooooo0o == null) {
            this.f9573Ooooo0o = new ArrayList<>();
        }
        this.f9573Ooooo0o.add(oooO0o);
        return this;
    }

    @NonNull
    public Transition OooO0Oo(@NonNull View view) {
        this.f9563OoooO0.add(view);
        return this;
    }

    public abstract void OooO0o(@NonNull oO00O0o oo00o0o);

    public final void OooO0oO(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            oO00O0o oo00o0o = new oO00O0o(view);
            if (z) {
                OooOO0(oo00o0o);
            } else {
                OooO0o(oo00o0o);
            }
            oo00o0o.f29744OooO0OO.add(this);
            OooO(oo00o0o);
            if (z) {
                OooO0o0(this.f9565OoooO0O, view, oo00o0o);
            } else {
                OooO0o0(this.f9562OoooO, view, oo00o0o);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0oO(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void OooOO0(@NonNull oO00O0o oo00o0o);

    public final void OooOO0O(ViewGroup viewGroup, boolean z) {
        OooOO0o(z);
        if (this.f9564OoooO00.size() <= 0 && this.f9563OoooO0.size() <= 0) {
            OooO0oO(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.f9564OoooO00.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(this.f9564OoooO00.get(i).intValue());
            if (viewFindViewById != null) {
                oO00O0o oo00o0o = new oO00O0o(viewFindViewById);
                if (z) {
                    OooOO0(oo00o0o);
                } else {
                    OooO0o(oo00o0o);
                }
                oo00o0o.f29744OooO0OO.add(this);
                OooO(oo00o0o);
                if (z) {
                    OooO0o0(this.f9565OoooO0O, viewFindViewById, oo00o0o);
                } else {
                    OooO0o0(this.f9562OoooO, viewFindViewById, oo00o0o);
                }
            }
        }
        for (int i2 = 0; i2 < this.f9563OoooO0.size(); i2++) {
            View view = this.f9563OoooO0.get(i2);
            oO00O0o oo00o0o2 = new oO00O0o(view);
            if (z) {
                OooOO0(oo00o0o2);
            } else {
                OooO0o(oo00o0o2);
            }
            oo00o0o2.f29744OooO0OO.add(this);
            OooO(oo00o0o2);
            if (z) {
                OooO0o0(this.f9565OoooO0O, view, oo00o0o2);
            } else {
                OooO0o0(this.f9562OoooO, view, oo00o0o2);
            }
        }
    }

    public final void OooOO0o(boolean z) {
        if (z) {
            this.f9565OoooO0O.f29781OooO00o.clear();
            this.f9565OoooO0O.f29782OooO0O0.clear();
            this.f9565OoooO0O.f29783OooO0OO.OooO0Oo();
        } else {
            this.f9562OoooO.f29781OooO00o.clear();
            this.f9562OoooO.f29782OooO0O0.clear();
            this.f9562OoooO.f29783OooO0OO.OooO0Oo();
        }
    }

    @Nullable
    public Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f9574OooooO0 = new ArrayList<>();
            transition.f9565OoooO0O = new oOo00OO0();
            transition.f9562OoooO = new oOo00OO0();
            transition.f9567OoooOOO = null;
            transition.f9568OoooOOo = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOOOO(ViewGroup viewGroup, oOo00OO0 ooo00oo0, oOo00OO0 ooo00oo1, ArrayList<oO00O0o> arrayList, ArrayList<oO00O0o> arrayList2) {
        Animator animatorOooOOO;
        int i;
        int i2;
        View view;
        oO00O0o oo00o0o;
        Animator animator;
        oO00O0o oo00o0o2;
        Animator animator2;
        Oooo0<Animator, OooO0O0> oooo0OooOOoo = OooOOoo();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            oO00O0o oo00o0o3 = arrayList.get(i3);
            oO00O0o oo00o0o4 = arrayList2.get(i3);
            if (oo00o0o3 != null && !oo00o0o3.f29744OooO0OO.contains(this)) {
                oo00o0o3 = null;
            }
            if (oo00o0o4 != null && !oo00o0o4.f29744OooO0OO.contains(this)) {
                oo00o0o4 = null;
            }
            if (oo00o0o3 == null && oo00o0o4 == null) {
                i = size;
                i2 = i3;
            } else if (!(oo00o0o3 == null || oo00o0o4 == null || OooOo0O(oo00o0o3, oo00o0o4)) || (animatorOooOOO = OooOOO(viewGroup, oo00o0o3, oo00o0o4)) == null) {
                i = size;
                i2 = i3;
            } else {
                if (oo00o0o4 != null) {
                    view = oo00o0o4.f29743OooO0O0;
                    String[] strArrOooOo00 = OooOo00();
                    if (strArrOooOo00 == null || strArrOooOo00.length <= 0) {
                        i = size;
                        i2 = i3;
                        oo00o0o2 = null;
                    } else {
                        oo00o0o2 = new oO00O0o(view);
                        i = size;
                        oO00O0o orDefault = ooo00oo1.f29781OooO00o.getOrDefault(view, null);
                        if (orDefault != null) {
                            int i4 = 0;
                            while (i4 < strArrOooOo00.length) {
                                oo00o0o2.f29742OooO00o.put(strArrOooOo00[i4], orDefault.f29742OooO00o.get(strArrOooOo00[i4]));
                                i4++;
                                i3 = i3;
                                orDefault = orDefault;
                            }
                        }
                        i2 = i3;
                        int i5 = oooo0OooOOoo.f421Oooo0oo;
                        int i6 = 0;
                        while (true) {
                            if (i6 < i5) {
                                OooO0O0 orDefault2 = oooo0OooOOoo.getOrDefault(oooo0OooOOoo.OooO(i6), null);
                                if (orDefault2.f9581OooO0OO != null && orDefault2.f9579OooO00o == view && orDefault2.f9580OooO0O0.equals(this.f9559Oooo0o) && orDefault2.f9581OooO0OO.equals(oo00o0o2)) {
                                    oo00o0o = oo00o0o2;
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        }
                        animator = animator2;
                    }
                    oo00o0o = oo00o0o2;
                    animator2 = animatorOooOOO;
                    animator = animator2;
                } else {
                    i = size;
                    i2 = i3;
                    view = oo00o0o3.f29743OooO0O0;
                    oo00o0o = null;
                    animator = animatorOooOOO;
                }
                if (animator != null) {
                    oO00O0o0 oo00o0o0 = this.f9575OooooOO;
                    if (oo00o0o0 != null) {
                        long jOooOOO0 = oo00o0o0.OooOOO0(viewGroup, this, oo00o0o3, oo00o0o4);
                        sparseIntArray.put(this.f9574OooooO0.size(), (int) jOooOOO0);
                        jMin = Math.min(jOooOOO0, jMin);
                    }
                    long j = jMin;
                    String str = this.f9559Oooo0o;
                    oO00OOOo oo00oooo = oO00OO0O.f29748OooO00o;
                    oooo0OooOOoo.put(animator, new OooO0O0(view, str, this, new oO00o00(viewGroup), oo00o0o));
                    this.f9574OooooO0.add(animator);
                    jMin = j;
                }
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.f9574OooooO0.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - jMin));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOOOo() {
        int i = this.f9570OoooOoO - 1;
        this.f9570OoooOoO = i;
        if (i == 0) {
            ArrayList<OooO0o> arrayList = this.f9573Ooooo0o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9573Ooooo0o.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((OooO0o) arrayList2.get(i2)).OooO0Oo(this);
                }
            }
            for (int i3 = 0; i3 < this.f9565OoooO0O.f29783OooO0OO.OooOOO(); i3++) {
                View viewOooOOOO = this.f9565OoooO0O.f29783OooO0OO.OooOOOO(i3);
                if (viewOooOOOO != null) {
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOOo(viewOooOOOO, false);
                }
            }
            for (int i4 = 0; i4 < this.f9562OoooO.f29783OooO0OO.OooOOO(); i4++) {
                View viewOooOOOO2 = this.f9562OoooO.f29783OooO0OO.OooOOOO(i4);
                if (viewOooOOOO2 != null) {
                    WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOOo(viewOooOOOO2, false);
                }
            }
            this.f9572Ooooo00 = true;
        }
    }

    public final oO00O0o OooOOo(View view, boolean z) {
        TransitionSet transitionSet = this.f9566OoooOO0;
        if (transitionSet != null) {
            return transitionSet.OooOOo(view, z);
        }
        ArrayList<oO00O0o> arrayList = z ? this.f9567OoooOOO : this.f9568OoooOOo;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            oO00O0o oo00o0o = arrayList.get(i2);
            if (oo00o0o == null) {
                return null;
            }
            if (oo00o0o.f29743OooO0O0 == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            return (z ? this.f9568OoooOOo : this.f9567OoooOOO).get(i);
        }
        return null;
    }

    @Nullable
    public final Rect OooOOo0() {
        OooO0OO oooO0OO = this.f9576OooooOo;
        if (oooO0OO == null) {
            return null;
        }
        return oooO0OO.OooO00o();
    }

    @Nullable
    public final oO00O0o OooOo0(@NonNull View view, boolean z) {
        TransitionSet transitionSet = this.f9566OoooOO0;
        if (transitionSet != null) {
            return transitionSet.OooOo0(view, z);
        }
        return (z ? this.f9565OoooO0O : this.f9562OoooO).f29781OooO00o.getOrDefault(view, null);
    }

    @Nullable
    public String[] OooOo00() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public boolean OooOo0O(@Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        if (oo00o0o == null || oo00o0o2 == null) {
            return false;
        }
        String[] strArrOooOo00 = OooOo00();
        if (strArrOooOo00 == null) {
            Iterator it = oo00o0o.f29742OooO00o.keySet().iterator();
            while (it.hasNext()) {
                if (OooOo(oo00o0o, oo00o0o2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrOooOo00) {
            if (!OooOo(oo00o0o, oo00o0o2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean OooOo0o(View view) {
        return (this.f9564OoooO00.size() == 0 && this.f9563OoooO0.size() == 0) || this.f9564OoooO00.contains(Integer.valueOf(view.getId())) || this.f9563OoooO0.contains(view);
    }

    @NonNull
    public Transition OooOoO(@NonNull OooO0o oooO0o) {
        ArrayList<OooO0o> arrayList = this.f9573Ooooo0o;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(oooO0o);
        if (this.f9573Ooooo0o.size() == 0) {
            this.f9573Ooooo0o = null;
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOoO0(View view) {
        if (this.f9572Ooooo00) {
            return;
        }
        for (int size = this.f9569OoooOo0.size() - 1; size >= 0; size--) {
            this.f9569OoooOo0.get(size).pause();
        }
        ArrayList<OooO0o> arrayList = this.f9573Ooooo0o;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f9573Ooooo0o.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((OooO0o) arrayList2.get(i)).OooO00o();
            }
        }
        this.f9571OoooOoo = true;
    }

    @NonNull
    public Transition OooOoOO(@NonNull View view) {
        this.f9563OoooO0.remove(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOoo() {
        Oooo0O0();
        Oooo0<Animator, OooO0O0> oooo0OooOOoo = OooOOoo();
        for (Animator animator : this.f9574OooooO0) {
            if (oooo0OooOOoo.containsKey(animator)) {
                Oooo0O0();
                if (animator != null) {
                    animator.addListener(new oO000o00(this, oooo0OooOOoo));
                    long j = this.f9561Oooo0oo;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f9560Oooo0oO;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f9558Oooo;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new oO0O0OoO(this));
                    animator.start();
                }
            }
        }
        this.f9574OooooO0.clear();
        OooOOOo();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOoo0(View view) {
        if (this.f9571OoooOoo) {
            if (!this.f9572Ooooo00) {
                int size = this.f9569OoooOo0.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.f9569OoooOo0.get(size).resume();
                    }
                }
                ArrayList<OooO0o> arrayList = this.f9573Ooooo0o;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f9573Ooooo0o.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((OooO0o) arrayList2.get(i)).OooO0o0();
                    }
                }
            }
            this.f9571OoooOoo = false;
        }
    }

    @NonNull
    public Transition OooOooO(long j) {
        this.f9561Oooo0oo = j;
        return this;
    }

    public void OooOooo(@Nullable OooO0OO oooO0OO) {
        this.f9576OooooOo = oooO0OO;
    }

    @NonNull
    public Transition Oooo0(long j) {
        this.f9560Oooo0oO = j;
        return this;
    }

    @NonNull
    public Transition Oooo000(@Nullable TimeInterpolator timeInterpolator) {
        this.f9558Oooo = timeInterpolator;
        return this;
    }

    public void Oooo00O(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f9577Oooooo0 = f9556OoooooO;
        } else {
            this.f9577Oooooo0 = pathMotion;
        }
    }

    public void Oooo00o(@Nullable oO00O0o0 oo00o0o0) {
        this.f9575OooooOO = oo00o0o0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void Oooo0O0() {
        if (this.f9570OoooOoO == 0) {
            ArrayList<OooO0o> arrayList = this.f9573Ooooo0o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9573Ooooo0o.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((OooO0o) arrayList2.get(i)).OooO0O0(this);
                }
            }
            this.f9572Ooooo00 = false;
        }
        this.f9570OoooOoO++;
    }

    public String Oooo0OO(String str) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(str);
        sbOooO0o0.append(getClass().getSimpleName());
        sbOooO0o0.append("@");
        sbOooO0o0.append(Integer.toHexString(hashCode()));
        sbOooO0o0.append(": ");
        String string = sbOooO0o0.toString();
        if (this.f9561Oooo0oo != -1) {
            string = android.support.v4.media.session.OooOOO0.OooO00o(p708oo000o.Oooo0.OooO00o(string, "dur("), this.f9561Oooo0oo, ") ");
        }
        if (this.f9560Oooo0oO != -1) {
            string = android.support.v4.media.session.OooOOO0.OooO00o(p708oo000o.Oooo0.OooO00o(string, "dly("), this.f9560Oooo0oO, ") ");
        }
        if (this.f9558Oooo != null) {
            StringBuilder sbOooO00o = p708oo000o.Oooo0.OooO00o(string, "interp(");
            sbOooO00o.append(this.f9558Oooo);
            sbOooO00o.append(") ");
            string = sbOooO00o.toString();
        }
        if (this.f9564OoooO00.size() <= 0 && this.f9563OoooO0.size() <= 0) {
            return string;
        }
        String strOooO0Oo = OooOo00.OooO0Oo(string, "tgts(");
        if (this.f9564OoooO00.size() > 0) {
            for (int i = 0; i < this.f9564OoooO00.size(); i++) {
                if (i > 0) {
                    strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, ", ");
                }
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(strOooO0Oo);
                sbOooO0o1.append(this.f9564OoooO00.get(i));
                strOooO0Oo = sbOooO0o1.toString();
            }
        }
        if (this.f9563OoooO0.size() > 0) {
            for (int i2 = 0; i2 < this.f9563OoooO0.size(); i2++) {
                if (i2 > 0) {
                    strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, ", ");
                }
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0(strOooO0Oo);
                sbOooO0o2.append(this.f9563OoooO0.get(i2));
                strOooO0Oo = sbOooO0o2.toString();
            }
        }
        return OooOo00.OooO0Oo(strOooO0Oo, ")");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        int size = this.f9569OoooOo0.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                this.f9569OoooOo0.get(size).cancel();
            }
        }
        ArrayList<OooO0o> arrayList = this.f9573Ooooo0o;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f9573Ooooo0o.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((OooO0o) arrayList2.get(i)).OooO0OO();
        }
    }

    public final String toString() {
        return Oooo0OO("");
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        this.f9559Oooo0o = getClass().getName();
        this.f9560Oooo0oO = -1L;
        this.f9561Oooo0oo = -1L;
        this.f9558Oooo = null;
        this.f9564OoooO00 = new ArrayList<>();
        this.f9563OoooO0 = new ArrayList<>();
        this.f9565OoooO0O = new oOo00OO0();
        this.f9562OoooO = new oOo00OO0();
        this.f9566OoooOO0 = null;
        this.f9578o000oOoO = f9555Oooooo;
        this.f9569OoooOo0 = new ArrayList<>();
        this.f9570OoooOoO = 0;
        this.f9571OoooOoo = false;
        this.f9572Ooooo00 = false;
        this.f9573Ooooo0o = null;
        this.f9574OooooO0 = new ArrayList<>();
        this.f9577Oooooo0 = f9556OoooooO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29731OooO00o);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jOooO0o = o00oO0o.OooO0o(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jOooO0o >= 0) {
            OooOooO(jOooO0o);
        }
        long jOooO0o2 = o00oO0o.OooO0o(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jOooO0o2 > 0) {
            Oooo0(jOooO0o2);
        }
        int iOooO0oO = o00oO0o.OooO0oO(typedArrayObtainStyledAttributes, xmlResourceParser, 0);
        if (iOooO0oO > 0) {
            Oooo000(AnimationUtils.loadInterpolator(context, iOooO0oO));
        }
        String strOooO0oo = o00oO0o.OooO0oo(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strOooO0oo != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strOooO0oo, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr[i] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    i--;
                    iArr = iArr2;
                } else {
                    throw new InflateException(OooO0o.OooO0OO.OooO00o("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i++;
            }
            if (iArr.length == 0) {
                this.f9578o000oOoO = f9555Oooooo;
            } else {
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 >= 1 && i3 <= 4) {
                        int i4 = iArr[i2];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i2) {
                                z = false;
                                break;
                            } else {
                                if (iArr[i5] == i4) {
                                    z = true;
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (z) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    } else {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                }
                this.f9578o000oOoO = (int[]) iArr.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
