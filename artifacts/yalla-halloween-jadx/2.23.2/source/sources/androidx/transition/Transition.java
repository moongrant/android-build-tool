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
import android.util.SparseArray;
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
import androidx.core.view.o000OOo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;
import oOO00O.o0000;
import oOO00O.o0000O0;
import oOO00O.o0000O0O;
import oOO00O.o000OO;
import oOO00O.o00O0O;
import oOO00O.o00Oo0;
import oOO00O.o00Ooo;
import oOO00O.o00oO0o;
import oOO00O.o0OoOo0;
import oOO00O.o0ooOOo;
import oOO00O.oo0o0Oo;
import p004OooO0oO.o000oOoO;
import p037OoooOo0.o000O0o;
import p039OoooOoo.o0o0Oo;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Transition implements Cloneable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<View> f11300OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f11301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f11302OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f11303OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TimeInterpolator f11304OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<Integer> f11305OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o0ooOOo f11306OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o0ooOOo f11307OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TransitionSet f11308OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList<o00oO0o> f11309OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int[] f11310OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ArrayList<o00oO0o> f11311OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList<Animator> f11312OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f11313OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f11314OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f11315OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PathMotion f11316OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<Animator> f11317OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ArrayList<OooO0o> f11318OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00Ooo f11319OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO f11320OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f11298OooOoO0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO00o f11297OooOoO = new OooO00o();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final ThreadLocal<p190o00o0O.OooO<Animator, OooO0O0>> f11299OooOoOO = new ThreadLocal<>();

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
        public final View f11321OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f11322OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00oO0o f11323OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000OO f11324OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Transition f11325OooO0o0;

        public OooO0O0(View view, String str, Transition transition, o0000O0O o0000o0o2, o00oO0o o00oo0o2) {
            this.f11321OooO00o = view;
            this.f11322OooO0O0 = str;
            this.f11323OooO0OO = o00oo0o2;
            this.f11324OooO0Oo = o0000o0o2;
            this.f11325OooO0o0 = transition;
        }
    }

    public static abstract class OooO0OO {
        public abstract Rect OooO00o();
    }

    public interface OooO0o {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo(@NonNull Transition transition);

        void OooO0o0(@NonNull Transition transition);
    }

    public Transition() {
        this.f11301OooO0Oo = getClass().getName();
        this.f11303OooO0o0 = -1L;
        this.f11302OooO0o = -1L;
        this.f11304OooO0oO = null;
        this.f11305OooO0oo = new ArrayList<>();
        this.f11300OooO = new ArrayList<>();
        this.f11306OooOO0 = new o0ooOOo();
        this.f11307OooOO0O = new o0ooOOo();
        this.f11308OooOO0o = null;
        this.f11310OooOOO0 = f11298OooOoO0;
        this.f11312OooOOOo = new ArrayList<>();
        this.f11314OooOOo0 = 0;
        this.f11313OooOOo = false;
        this.f11315OooOOoo = false;
        this.f11318OooOo00 = null;
        this.f11317OooOo0 = new ArrayList<>();
        this.f11316OooOo = f11297OooOoO;
    }

    public static void OooO0o0(o0ooOOo o0ooooo, View view, o00oO0o o00oo0o2) {
        o0ooooo.f60172OooO00o.put(view, o00oo0o2);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = o0ooooo.f60173OooO0O0;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view);
        if (strOooOO0O != null) {
            p190o00o0O.OooO<String, View> oooO = o0ooooo.f60175OooO0Oo;
            if (oooO.containsKey(strOooOO0O)) {
                oooO.put(strOooOO0O, null);
            } else {
                oooO.put(strOooOO0O, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                p190o00o0O.OooOOOO<View> oooOOOO = o0ooooo.f60174OooO0OO;
                if (oooOOOO.f38559OooO0Oo) {
                    oooOOOO.OooO0o();
                }
                if (p190o00o0O.OooOOO0.OooO0O0(oooOOOO.f38561OooO0o0, oooOOOO.f38562OooO0oO, itemIdAtPosition) < 0) {
                    ViewCompat.OooO0o.OooOOo(view, true);
                    oooOOOO.OooO(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) oooOOOO.OooO0oO(itemIdAtPosition, null);
                if (view2 != null) {
                    ViewCompat.OooO0o.OooOOo(view2, false);
                    oooOOOO.OooO(itemIdAtPosition, null);
                }
            }
        }
    }

    public static p190o00o0O.OooO<Animator, OooO0O0> OooOOo0() {
        ThreadLocal<p190o00o0O.OooO<Animator, OooO0O0>> threadLocal = f11299OooOoOO;
        p190o00o0O.OooO<Animator, OooO0O0> oooO = threadLocal.get();
        if (oooO != null) {
            return oooO;
        }
        p190o00o0O.OooO<Animator, OooO0O0> oooO2 = new p190o00o0O.OooO<>();
        threadLocal.set(oooO2);
        return oooO2;
    }

    public static boolean OooOo0O(o00oO0o o00oo0o2, o00oO0o o00oo0o3, String str) {
        Object obj = o00oo0o2.f60157OooO00o.get(str);
        Object obj2 = o00oo0o3.f60157OooO00o.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public abstract void OooO(@NonNull o00oO0o o00oo0o2);

    @NonNull
    public void OooO0O0(@NonNull OooO0o oooO0o) {
        if (this.f11318OooOo00 == null) {
            this.f11318OooOo00 = new ArrayList<>();
        }
        this.f11318OooOo00.add(oooO0o);
    }

    @NonNull
    public void OooO0Oo(@NonNull View view) {
        this.f11300OooO.add(view);
    }

    public abstract void OooO0o(@NonNull o00oO0o o00oo0o2);

    public final void OooO0oO(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            o00oO0o o00oo0o2 = new o00oO0o(view);
            if (z) {
                OooO(o00oo0o2);
            } else {
                OooO0o(o00oo0o2);
            }
            o00oo0o2.f60159OooO0OO.add(this);
            OooO0oo(o00oo0o2);
            if (z) {
                OooO0o0(this.f11306OooOO0, view, o00oo0o2);
            } else {
                OooO0o0(this.f11307OooOO0O, view, o00oo0o2);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0oO(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void OooO0oo(o00oO0o o00oo0o2) {
        boolean z;
        if (this.f11319OooOo0O != null) {
            HashMap map = o00oo0o2.f60157OooO00o;
            if (map.isEmpty()) {
                return;
            }
            this.f11319OooOo0O.getClass();
            String[] strArr = o0000O0.f60149OooO00o;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    z = true;
                    break;
                } else {
                    if (!map.containsKey(strArr[i])) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                return;
            }
            ((o0000O0) this.f11319OooOo0O).getClass();
            Integer numValueOf = (Integer) map.get("android:visibility:visibility");
            View view = o00oo0o2.f60158OooO0O0;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(view.getVisibility());
            }
            map.put("android:visibilityPropagation:visibility", numValueOf);
            int[] iArr = {iRound, 0};
            view.getLocationOnScreen(iArr);
            int iRound = Math.round(view.getTranslationX()) + iArr[0];
            iArr[0] = (view.getWidth() / 2) + iRound;
            int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
            iArr[1] = iRound2;
            iArr[1] = (view.getHeight() / 2) + iRound2;
            map.put("android:visibilityPropagation:center", iArr);
        }
    }

    public final void OooOO0(ViewGroup viewGroup, boolean z) {
        OooOO0O(z);
        ArrayList<Integer> arrayList = this.f11305OooO0oo;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f11300OooO;
        if (size <= 0 && arrayList2.size() <= 0) {
            OooO0oO(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                o00oO0o o00oo0o2 = new o00oO0o(viewFindViewById);
                if (z) {
                    OooO(o00oo0o2);
                } else {
                    OooO0o(o00oo0o2);
                }
                o00oo0o2.f60159OooO0OO.add(this);
                OooO0oo(o00oo0o2);
                if (z) {
                    OooO0o0(this.f11306OooOO0, viewFindViewById, o00oo0o2);
                } else {
                    OooO0o0(this.f11307OooOO0O, viewFindViewById, o00oo0o2);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            o00oO0o o00oo0o3 = new o00oO0o(view);
            if (z) {
                OooO(o00oo0o3);
            } else {
                OooO0o(o00oo0o3);
            }
            o00oo0o3.f60159OooO0OO.add(this);
            OooO0oo(o00oo0o3);
            if (z) {
                OooO0o0(this.f11306OooOO0, view, o00oo0o3);
            } else {
                OooO0o0(this.f11307OooOO0O, view, o00oo0o3);
            }
        }
    }

    public final void OooOO0O(boolean z) {
        if (z) {
            this.f11306OooOO0.f60172OooO00o.clear();
            this.f11306OooOO0.f60173OooO0O0.clear();
            this.f11306OooOO0.f60174OooO0OO.OooO0Oo();
        } else {
            this.f11307OooOO0O.f60172OooO00o.clear();
            this.f11307OooOO0O.f60173OooO0O0.clear();
            this.f11307OooOO0O.f60174OooO0OO.OooO0Oo();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f11317OooOo0 = new ArrayList<>();
            transition.f11306OooOO0 = new o0ooOOo();
            transition.f11307OooOO0O = new o0ooOOo();
            transition.f11309OooOOO = null;
            transition.f11311OooOOOO = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOOO(ViewGroup viewGroup, o0ooOOo o0ooooo, o0ooOOo o0ooooo2, ArrayList<o00oO0o> arrayList, ArrayList<o00oO0o> arrayList2) {
        Animator animatorOooOOO0;
        int i;
        View view;
        Animator animator;
        o00oO0o o00oo0o2;
        Animator animator2;
        o00oO0o o00oo0o3;
        p190o00o0O.OooO<Animator, OooO0O0> oooOOooOOo0 = OooOOo0();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = LongCompanionObject.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            o00oO0o o00oo0o4 = arrayList.get(i2);
            o00oO0o o00oo0o5 = arrayList2.get(i2);
            if (o00oo0o4 != null && !o00oo0o4.f60159OooO0OO.contains(this)) {
                o00oo0o4 = null;
            }
            if (o00oo0o5 != null && !o00oo0o5.f60159OooO0OO.contains(this)) {
                o00oo0o5 = null;
            }
            if (o00oo0o4 == null && o00oo0o5 == null) {
                i = size;
            } else if (!(o00oo0o4 == null || o00oo0o5 == null || OooOo00(o00oo0o4, o00oo0o5)) || (animatorOooOOO0 = OooOOO0(viewGroup, o00oo0o4, o00oo0o5)) == null) {
                i = size;
            } else {
                if (o00oo0o5 != null) {
                    String[] strArrOooOOo = OooOOo();
                    view = o00oo0o5.f60158OooO0O0;
                    if (strArrOooOOo != null && strArrOooOOo.length > 0) {
                        o00oO0o o00oo0o6 = new o00oO0o(view);
                        i = size;
                        o00oO0o orDefault = o0ooooo2.f60172OooO00o.getOrDefault(view, null);
                        if (orDefault != null) {
                            int i3 = 0;
                            while (i3 < strArrOooOOo.length) {
                                HashMap map = o00oo0o6.f60157OooO00o;
                                String str = strArrOooOOo[i3];
                                map.put(str, orDefault.f60157OooO00o.get(str));
                                i3++;
                                strArrOooOOo = strArrOooOOo;
                            }
                        }
                        int i4 = oooOOooOOo0.f38568OooO0o;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i4) {
                                o00oo0o3 = o00oo0o6;
                                animator2 = animatorOooOOO0;
                                break;
                            }
                            OooO0O0 orDefault2 = oooOOooOOo0.getOrDefault(oooOOooOOo0.OooO0oo(i5), null);
                            if (orDefault2.f11323OooO0OO != null && orDefault2.f11321OooO00o == view && orDefault2.f11322OooO0O0.equals(this.f11301OooO0Oo) && orDefault2.f11323OooO0OO.equals(o00oo0o6)) {
                                o00oo0o3 = o00oo0o6;
                                animator2 = null;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        i = size;
                        animator2 = animatorOooOOO0;
                        o00oo0o3 = null;
                    }
                    animator = animator2;
                    o00oo0o2 = o00oo0o3;
                } else {
                    i = size;
                    view = o00oo0o4.f60158OooO0O0;
                    animator = animatorOooOOO0;
                    o00oo0o2 = null;
                }
                if (animator != null) {
                    o00Ooo o00ooo2 = this.f11319OooOo0O;
                    if (o00ooo2 != null) {
                        long jOooO00o = o00ooo2.OooO00o(viewGroup, this, o00oo0o4, o00oo0o5);
                        sparseIntArray.put(this.f11317OooOo0.size(), (int) jOooO00o);
                        jMin = Math.min(jOooO00o, jMin);
                    }
                    long j = jMin;
                    String str2 = this.f11301OooO0Oo;
                    o0000 o0000Var = oo0o0Oo.f60176OooO00o;
                    oooOOooOOo0.put(animator, new OooO0O0(view, str2, this, new o0000O0O(viewGroup), o00oo0o2));
                    this.f11317OooOo0.add(animator);
                    jMin = j;
                }
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.f11317OooOo0.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
            }
        }
    }

    @Nullable
    public Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00oO0o o00oo0o2, @Nullable o00oO0o o00oo0o3) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOOOO() {
        int i = this.f11314OooOOo0 - 1;
        this.f11314OooOOo0 = i;
        if (i == 0) {
            ArrayList<OooO0o> arrayList = this.f11318OooOo00;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f11318OooOo00.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((OooO0o) arrayList2.get(i2)).OooO0o0(this);
                }
            }
            for (int i3 = 0; i3 < this.f11306OooOO0.f60174OooO0OO.OooOO0O(); i3++) {
                View viewOooOO0o = this.f11306OooOO0.f60174OooO0OO.OooOO0o(i3);
                if (viewOooOO0o != null) {
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOOo(viewOooOO0o, false);
                }
            }
            for (int i4 = 0; i4 < this.f11307OooOO0O.f60174OooO0OO.OooOO0O(); i4++) {
                View viewOooOO0o2 = this.f11307OooOO0O.f60174OooO0OO.OooOO0o(i4);
                if (viewOooOO0o2 != null) {
                    WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOOo(viewOooOO0o2, false);
                }
            }
            this.f11315OooOOoo = true;
        }
    }

    public final o00oO0o OooOOOo(View view, boolean z) {
        TransitionSet transitionSet = this.f11308OooOO0o;
        if (transitionSet != null) {
            return transitionSet.OooOOOo(view, z);
        }
        ArrayList<o00oO0o> arrayList = z ? this.f11309OooOOO : this.f11311OooOOOO;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            o00oO0o o00oo0o2 = arrayList.get(i);
            if (o00oo0o2 == null) {
                return null;
            }
            if (o00oo0o2.f60158OooO0O0 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.f11311OooOOOO : this.f11309OooOOO).get(i);
        }
        return null;
    }

    @Nullable
    public String[] OooOOo() {
        return null;
    }

    @Nullable
    public final o00oO0o OooOOoo(@NonNull View view, boolean z) {
        TransitionSet transitionSet = this.f11308OooOO0o;
        if (transitionSet != null) {
            return transitionSet.OooOOoo(view, z);
        }
        return (z ? this.f11306OooOO0 : this.f11307OooOO0O).f60172OooO00o.getOrDefault(view, null);
    }

    @NonNull
    public void OooOo(@NonNull OooO0o oooO0o) {
        ArrayList<OooO0o> arrayList = this.f11318OooOo00;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(oooO0o);
        if (this.f11318OooOo00.size() == 0) {
            this.f11318OooOo00 = null;
        }
    }

    public final boolean OooOo0(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f11305OooO0oo;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f11300OooO;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public boolean OooOo00(@Nullable o00oO0o o00oo0o2, @Nullable o00oO0o o00oo0o3) {
        if (o00oo0o2 == null || o00oo0o3 == null) {
            return false;
        }
        String[] strArrOooOOo = OooOOo();
        if (strArrOooOOo == null) {
            Iterator it = o00oo0o2.f60157OooO00o.keySet().iterator();
            while (it.hasNext()) {
                if (OooOo0O(o00oo0o2, o00oo0o3, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrOooOOo) {
            if (!OooOo0O(o00oo0o2, o00oo0o3, str)) {
            }
        }
        return false;
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOo0o(View view) {
        if (this.f11315OooOOoo) {
            return;
        }
        ArrayList<Animator> arrayList = this.f11312OooOOOo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).pause();
        }
        ArrayList<OooO0o> arrayList2 = this.f11318OooOo00;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f11318OooOo00.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((OooO0o) arrayList3.get(i)).OooO00o();
            }
        }
        this.f11313OooOOo = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOoO(ViewGroup viewGroup) {
        if (this.f11313OooOOo) {
            if (!this.f11315OooOOoo) {
                ArrayList<Animator> arrayList = this.f11312OooOOOo;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        arrayList.get(size).resume();
                    }
                }
                ArrayList<OooO0o> arrayList2 = this.f11318OooOo00;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f11318OooOo00.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((OooO0o) arrayList3.get(i)).OooO0OO();
                    }
                }
            }
            this.f11313OooOOo = false;
        }
    }

    @NonNull
    public void OooOoO0(@NonNull View view) {
        this.f11300OooO.remove(view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOoOO() {
        Oooo0();
        p190o00o0O.OooO<Animator, OooO0O0> oooOOooOOo0 = OooOOo0();
        for (Animator animator : this.f11317OooOo0) {
            if (oooOOooOOo0.containsKey(animator)) {
                Oooo0();
                if (animator != null) {
                    animator.addListener(new o00O0O(this, oooOOooOOo0));
                    long j = this.f11302OooO0o;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f11303OooO0o0;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f11304OooO0oO;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new o00Oo0(this));
                    animator.start();
                }
            }
        }
        this.f11317OooOo0.clear();
        OooOOOO();
    }

    public void OooOoo(@Nullable OooO0OO oooO0OO) {
        this.f11320OooOo0o = oooO0OO;
    }

    @NonNull
    public void OooOoo0(long j) {
        this.f11302OooO0o = j;
    }

    @NonNull
    public void OooOooO(@Nullable TimeInterpolator timeInterpolator) {
        this.f11304OooO0oO = timeInterpolator;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void Oooo0() {
        if (this.f11314OooOOo0 == 0) {
            ArrayList<OooO0o> arrayList = this.f11318OooOo00;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f11318OooOo00.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((OooO0o) arrayList2.get(i)).OooO0Oo(this);
                }
            }
            this.f11315OooOOoo = false;
        }
        this.f11314OooOOo0++;
    }

    public void Oooo000(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f11316OooOo = f11297OooOoO;
        } else {
            this.f11316OooOo = pathMotion;
        }
    }

    public void Oooo00O(@Nullable o00Ooo o00ooo2) {
        this.f11319OooOo0O = o00ooo2;
    }

    @NonNull
    public void Oooo00o(long j) {
        this.f11303OooO0o0 = j;
    }

    public String Oooo0O0(String str) {
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(str);
        sbOooO00o.append(getClass().getSimpleName());
        sbOooO00o.append("@");
        sbOooO00o.append(Integer.toHexString(hashCode()));
        sbOooO00o.append(": ");
        String string = sbOooO00o.toString();
        if (this.f11302OooO0o != -1) {
            string = android.support.v4.media.session.OooO0OO.OooO0O0(o000O0o.OooO0O0(string, "dur("), this.f11302OooO0o, ") ");
        }
        if (this.f11303OooO0o0 != -1) {
            string = android.support.v4.media.session.OooO0OO.OooO0O0(o000O0o.OooO0O0(string, "dly("), this.f11303OooO0o0, ") ");
        }
        if (this.f11304OooO0oO != null) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(string, "interp(");
            sbOooO0O0.append(this.f11304OooO0oO);
            sbOooO0O0.append(") ");
            string = sbOooO0O0.toString();
        }
        ArrayList<Integer> arrayList = this.f11305OooO0oo;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f11300OooO;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, ", ");
                }
                StringBuilder sbOooO00o2 = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o2.append(arrayList.get(i));
                strOooO00o = sbOooO00o2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, ", ");
                }
                StringBuilder sbOooO00o3 = o0o0Oo.OooO00o(strOooO00o);
                sbOooO00o3.append(arrayList2.get(i2));
                strOooO00o = sbOooO00o3.toString();
            }
        }
        return androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, ")");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        ArrayList<Animator> arrayList = this.f11312OooOOOo;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                arrayList.get(size).cancel();
            }
        }
        ArrayList<OooO0o> arrayList2 = this.f11318OooOo00;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f11318OooOo00.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((OooO0o) arrayList3.get(i)).OooO0O0();
        }
    }

    public final String toString() {
        return Oooo0O0("");
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        this.f11301OooO0Oo = getClass().getName();
        this.f11303OooO0o0 = -1L;
        this.f11302OooO0o = -1L;
        this.f11304OooO0oO = null;
        this.f11305OooO0oo = new ArrayList<>();
        this.f11300OooO = new ArrayList<>();
        this.f11306OooOO0 = new o0ooOOo();
        this.f11307OooOO0O = new o0ooOOo();
        this.f11308OooOO0o = null;
        int[] iArr = f11298OooOoO0;
        this.f11310OooOOO0 = iArr;
        this.f11312OooOOOo = new ArrayList<>();
        this.f11314OooOOo0 = 0;
        this.f11313OooOOo = false;
        this.f11315OooOOoo = false;
        this.f11318OooOo00 = null;
        this.f11317OooOo0 = new ArrayList<>();
        this.f11316OooOo = f11297OooOoO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60164OooO00o);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jOooO0o0 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jOooO0o0 >= 0) {
            OooOoo0(jOooO0o0);
        }
        long jOooO0o1 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jOooO0o1 > 0) {
            Oooo00o(jOooO0o1);
        }
        int resourceId = !oo000o.OooO0oO(xmlResourceParser, "interpolator") ? 0 : typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            OooOooO(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strOooO0o = oo000o.OooO0o(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strOooO0o != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strOooO0o, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                } else {
                    throw new InflateException(o000oOoO.OooO0O0("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.f11310OooOOO0 = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (!(i3 >= 1 && i3 <= 4)) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i2) {
                            z = false;
                            break;
                        } else {
                            if (iArr2[i4] == i3) {
                                z = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (z) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                }
                this.f11310OooOOO0 = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
