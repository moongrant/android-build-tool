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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;
import p004OooO0oO.o000oOoO;
import p039OoooOoo.o00OO;
import p058o0000Ooo.oo000o;
import p078o000Oo0O.o000000;
import p078o000Oo0O.o000000O;
import p078o000Oo0O.o00000O;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0000O00;
import p078o000Oo0O.o000O0;
import p078o000Oo0O.o000O0Oo;
import p078o000Oo0O.o000OO0O;
import p078o000Oo0O.o000OOo;
import p078o000Oo0O.o000Oo0;
import p078o000Oo0O.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Transition implements Cloneable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<View> f8206OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f8207OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f8208OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f8209OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TimeInterpolator f8210OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<Integer> f8211OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00000O f8212OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00000O f8213OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TransitionSet f8214OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList<o00000O0> f8215OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int[] f8216OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ArrayList<o00000O0> f8217OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList<Animator> f8218OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f8219OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8220OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f8221OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PathMotion f8222OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<Animator> f8223OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ArrayList<OooO0o> f8224OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o000000O f8225OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO f8226OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f8204OooOoO0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO00o f8203OooOoO = new OooO00o();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final ThreadLocal<p188o00o0O.OooOO0<Animator, OooO0O0>> f8205OooOoOO = new ThreadLocal<>();

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
        public final View f8227OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f8228OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000O0 f8229OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000OO0O f8230OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Transition f8231OooO0o0;

        public OooO0O0(View view, String str, Transition transition, o000O0Oo o000o0oo2, o00000O0 o00000o1) {
            this.f8227OooO00o = view;
            this.f8228OooO0O0 = str;
            this.f8229OooO0OO = o00000o1;
            this.f8230OooO0Oo = o000o0oo2;
            this.f8231OooO0o0 = transition;
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
        this.f8207OooO0Oo = getClass().getName();
        this.f8209OooO0o0 = -1L;
        this.f8208OooO0o = -1L;
        this.f8210OooO0oO = null;
        this.f8211OooO0oo = new ArrayList<>();
        this.f8206OooO = new ArrayList<>();
        this.f8212OooOO0 = new o00000O();
        this.f8213OooOO0O = new o00000O();
        this.f8214OooOO0o = null;
        this.f8216OooOOO0 = f8204OooOoO0;
        this.f8218OooOOOo = new ArrayList<>();
        this.f8220OooOOo0 = 0;
        this.f8219OooOOo = false;
        this.f8221OooOOoo = false;
        this.f8224OooOo00 = null;
        this.f8223OooOo0 = new ArrayList<>();
        this.f8222OooOo = f8203OooOoO;
    }

    public static void OooO0o0(o00000O o00000o, View view, o00000O0 o00000o1) {
        o00000o.f34932OooO00o.put(view, o00000o1);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = o00000o.f34933OooO0O0;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view);
        if (strOooOO0O != null) {
            p188o00o0O.OooOO0<String, View> oooOO1 = o00000o.f34935OooO0Oo;
            if (oooOO1.containsKey(strOooOO0O)) {
                oooOO1.put(strOooOO0O, null);
            } else {
                oooOO1.put(strOooOO0O, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                p188o00o0O.OooOo00<View> oooOo00 = o00000o.f34934OooO0OO;
                if (oooOo00.f38802OooO0Oo) {
                    oooOo00.OooO0o();
                }
                if (p188o00o0O.OooOOO.OooO0OO(oooOo00.f38804OooO0o0, oooOo00.f38805OooO0oO, itemIdAtPosition) < 0) {
                    ViewCompat.OooO0o.OooOOo(view, true);
                    oooOo00.OooO(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) oooOo00.OooO0oO(itemIdAtPosition, null);
                if (view2 != null) {
                    ViewCompat.OooO0o.OooOOo(view2, false);
                    oooOo00.OooO(itemIdAtPosition, null);
                }
            }
        }
    }

    public static p188o00o0O.OooOO0<Animator, OooO0O0> OooOOo() {
        ThreadLocal<p188o00o0O.OooOO0<Animator, OooO0O0>> threadLocal = f8205OooOoOO;
        p188o00o0O.OooOO0<Animator, OooO0O0> oooOO1 = threadLocal.get();
        if (oooOO1 != null) {
            return oooOO1;
        }
        p188o00o0O.OooOO0<Animator, OooO0O0> oooOO2 = new p188o00o0O.OooOO0<>();
        threadLocal.set(oooOO2);
        return oooOO2;
    }

    public static boolean OooOo0o(o00000O0 o00000o1, o00000O0 o00000o2, String str) {
        Object obj = o00000o1.f34936OooO00o.get(str);
        Object obj2 = o00000o2.f34936OooO00o.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public abstract void OooO(@NonNull o00000O0 o00000o1);

    @NonNull
    public void OooO0O0(@NonNull OooO0o oooO0o) {
        if (this.f8224OooOo00 == null) {
            this.f8224OooOo00 = new ArrayList<>();
        }
        this.f8224OooOo00.add(oooO0o);
    }

    @NonNull
    public void OooO0Oo(@NonNull View view) {
        this.f8206OooO.add(view);
    }

    public abstract void OooO0o(@NonNull o00000O0 o00000o1);

    public final void OooO0oO(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            o00000O0 o00000o1 = new o00000O0(view);
            if (z) {
                OooO(o00000o1);
            } else {
                OooO0o(o00000o1);
            }
            o00000o1.f34938OooO0OO.add(this);
            OooO0oo(o00000o1);
            if (z) {
                OooO0o0(this.f8212OooOO0, view, o00000o1);
            } else {
                OooO0o0(this.f8213OooOO0O, view, o00000o1);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0oO(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void OooO0oo(o00000O0 o00000o1) {
        boolean z;
        if (this.f8225OooOo0O != null) {
            HashMap map = o00000o1.f34936OooO00o;
            if (map.isEmpty()) {
                return;
            }
            this.f8225OooOo0O.getClass();
            String[] strArr = o000O0.f34946OooO00o;
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
            ((o000O0) this.f8225OooOo0O).getClass();
            Integer numValueOf = (Integer) map.get("android:visibility:visibility");
            View view = o00000o1.f34937OooO0O0;
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
        ArrayList<Integer> arrayList = this.f8211OooO0oo;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f8206OooO;
        if (size <= 0 && arrayList2.size() <= 0) {
            OooO0oO(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                o00000O0 o00000o1 = new o00000O0(viewFindViewById);
                if (z) {
                    OooO(o00000o1);
                } else {
                    OooO0o(o00000o1);
                }
                o00000o1.f34938OooO0OO.add(this);
                OooO0oo(o00000o1);
                if (z) {
                    OooO0o0(this.f8212OooOO0, viewFindViewById, o00000o1);
                } else {
                    OooO0o0(this.f8213OooOO0O, viewFindViewById, o00000o1);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = arrayList2.get(i2);
            o00000O0 o00000o2 = new o00000O0(view);
            if (z) {
                OooO(o00000o2);
            } else {
                OooO0o(o00000o2);
            }
            o00000o2.f34938OooO0OO.add(this);
            OooO0oo(o00000o2);
            if (z) {
                OooO0o0(this.f8212OooOO0, view, o00000o2);
            } else {
                OooO0o0(this.f8213OooOO0O, view, o00000o2);
            }
        }
    }

    public final void OooOO0O(boolean z) {
        if (z) {
            this.f8212OooOO0.f34932OooO00o.clear();
            this.f8212OooOO0.f34933OooO0O0.clear();
            this.f8212OooOO0.f34934OooO0OO.OooO0Oo();
        } else {
            this.f8213OooOO0O.f34932OooO00o.clear();
            this.f8213OooOO0O.f34933OooO0O0.clear();
            this.f8213OooOO0O.f34934OooO0OO.OooO0Oo();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f8223OooOo0 = new ArrayList<>();
            transition.f8212OooOO0 = new o00000O();
            transition.f8213OooOO0O = new o00000O();
            transition.f8215OooOOO = null;
            transition.f8217OooOOOO = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOOO(ViewGroup viewGroup, o00000O o00000o, o00000O o00000o2, ArrayList<o00000O0> arrayList, ArrayList<o00000O0> arrayList2) {
        Animator animatorOooOOO0;
        int i;
        View view;
        Animator animator;
        o00000O0 o00000o1;
        Animator animator2;
        o00000O0 o00000o3;
        p188o00o0O.OooOO0<Animator, OooO0O0> oooOO0OooOOo = OooOOo();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = LongCompanionObject.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            o00000O0 o00000o4 = arrayList.get(i2);
            o00000O0 o00000o5 = arrayList2.get(i2);
            if (o00000o4 != null && !o00000o4.f34938OooO0OO.contains(this)) {
                o00000o4 = null;
            }
            if (o00000o5 != null && !o00000o5.f34938OooO0OO.contains(this)) {
                o00000o5 = null;
            }
            if (o00000o4 == null && o00000o5 == null) {
                i = size;
            } else if (!(o00000o4 == null || o00000o5 == null || OooOo0(o00000o4, o00000o5)) || (animatorOooOOO0 = OooOOO0(viewGroup, o00000o4, o00000o5)) == null) {
                i = size;
            } else {
                if (o00000o5 != null) {
                    String[] strArrOooOOoo = OooOOoo();
                    view = o00000o5.f34937OooO0O0;
                    if (strArrOooOOoo != null && strArrOooOOoo.length > 0) {
                        o00000O0 o00000o6 = new o00000O0(view);
                        i = size;
                        o00000O0 orDefault = o00000o2.f34932OooO00o.getOrDefault(view, null);
                        if (orDefault != null) {
                            int i3 = 0;
                            while (i3 < strArrOooOOoo.length) {
                                HashMap map = o00000o6.f34936OooO00o;
                                String str = strArrOooOOoo[i3];
                                map.put(str, orDefault.f34936OooO00o.get(str));
                                i3++;
                                strArrOooOOoo = strArrOooOOoo;
                            }
                        }
                        int i4 = oooOO0OooOOo.f38816OooO0o;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i4) {
                                o00000o3 = o00000o6;
                                animator2 = animatorOooOOO0;
                                break;
                            }
                            OooO0O0 orDefault2 = oooOO0OooOOo.getOrDefault(oooOO0OooOOo.OooO0oo(i5), null);
                            if (orDefault2.f8229OooO0OO != null && orDefault2.f8227OooO00o == view && orDefault2.f8228OooO0O0.equals(this.f8207OooO0Oo) && orDefault2.f8229OooO0OO.equals(o00000o6)) {
                                o00000o3 = o00000o6;
                                animator2 = null;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        i = size;
                        animator2 = animatorOooOOO0;
                        o00000o3 = null;
                    }
                    animator = animator2;
                    o00000o1 = o00000o3;
                } else {
                    i = size;
                    view = o00000o4.f34937OooO0O0;
                    animator = animatorOooOOO0;
                    o00000o1 = null;
                }
                if (animator != null) {
                    o000000O o000000o2 = this.f8225OooOo0O;
                    if (o000000o2 != null) {
                        long jOooO00o = o000000o2.OooO00o(viewGroup, this, o00000o4, o00000o5);
                        sparseIntArray.put(this.f8223OooOo0.size(), (int) jOooO00o);
                        jMin = Math.min(jOooO00o, jMin);
                    }
                    long j = jMin;
                    String str2 = this.f8207OooO0Oo;
                    o000Oo0 o000oo1 = o0000O00.f34939OooO00o;
                    oooOO0OooOOo.put(animator, new OooO0O0(view, str2, this, new o000O0Oo(viewGroup), o00000o1));
                    this.f8223OooOo0.add(animator);
                    jMin = j;
                }
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.f8223OooOo0.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
            }
        }
    }

    @Nullable
    public Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00000O0 o00000o1, @Nullable o00000O0 o00000o2) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOOOO() {
        int i = this.f8220OooOOo0 - 1;
        this.f8220OooOOo0 = i;
        if (i == 0) {
            ArrayList<OooO0o> arrayList = this.f8224OooOo00;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8224OooOo00.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((OooO0o) arrayList2.get(i2)).OooO0o0(this);
                }
            }
            for (int i3 = 0; i3 < this.f8212OooOO0.f34934OooO0OO.OooOO0O(); i3++) {
                View viewOooOO0o = this.f8212OooOO0.f34934OooO0OO.OooOO0o(i3);
                if (viewOooOO0o != null) {
                    WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    ViewCompat.OooO0o.OooOOo(viewOooOO0o, false);
                }
            }
            for (int i4 = 0; i4 < this.f8213OooOO0O.f34934OooO0OO.OooOO0O(); i4++) {
                View viewOooOO0o2 = this.f8213OooOO0O.f34934OooO0OO.OooOO0o(i4);
                if (viewOooOO0o2 != null) {
                    WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                    ViewCompat.OooO0o.OooOOo(viewOooOO0o2, false);
                }
            }
            this.f8221OooOOoo = true;
        }
    }

    public final o00000O0 OooOOOo(View view, boolean z) {
        TransitionSet transitionSet = this.f8214OooOO0o;
        if (transitionSet != null) {
            return transitionSet.OooOOOo(view, z);
        }
        ArrayList<o00000O0> arrayList = z ? this.f8215OooOOO : this.f8217OooOOOO;
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
            o00000O0 o00000o1 = arrayList.get(i);
            if (o00000o1 == null) {
                return null;
            }
            if (o00000o1.f34937OooO0O0 == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.f8217OooOOOO : this.f8215OooOOO).get(i);
        }
        return null;
    }

    @Nullable
    public String[] OooOOoo() {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOo(View view) {
        if (this.f8221OooOOoo) {
            return;
        }
        ArrayList<Animator> arrayList = this.f8218OooOOOo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).pause();
        }
        ArrayList<OooO0o> arrayList2 = this.f8224OooOo00;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f8224OooOo00.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((OooO0o) arrayList3.get(i)).OooO00o();
            }
        }
        this.f8219OooOOo = true;
    }

    public boolean OooOo0(@Nullable o00000O0 o00000o1, @Nullable o00000O0 o00000o2) {
        if (o00000o1 == null || o00000o2 == null) {
            return false;
        }
        String[] strArrOooOOoo = OooOOoo();
        if (strArrOooOOoo == null) {
            Iterator it = o00000o1.f34936OooO00o.keySet().iterator();
            while (it.hasNext()) {
                if (OooOo0o(o00000o1, o00000o2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrOooOOoo) {
            if (!OooOo0o(o00000o1, o00000o2, str)) {
            }
        }
        return false;
        return true;
    }

    @Nullable
    public final o00000O0 OooOo00(@NonNull View view, boolean z) {
        TransitionSet transitionSet = this.f8214OooOO0o;
        if (transitionSet != null) {
            return transitionSet.OooOo00(view, z);
        }
        return (z ? this.f8212OooOO0 : this.f8213OooOO0O).f34932OooO00o.getOrDefault(view, null);
    }

    public final boolean OooOo0O(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f8211OooO0oo;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f8206OooO;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    @NonNull
    public void OooOoO(@NonNull View view) {
        this.f8206OooO.remove(view);
    }

    @NonNull
    public void OooOoO0(@NonNull OooO0o oooO0o) {
        ArrayList<OooO0o> arrayList = this.f8224OooOo00;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(oooO0o);
        if (this.f8224OooOo00.size() == 0) {
            this.f8224OooOo00 = null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOoOO(ViewGroup viewGroup) {
        if (this.f8219OooOOo) {
            if (!this.f8221OooOOoo) {
                ArrayList<Animator> arrayList = this.f8218OooOOOo;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        arrayList.get(size).resume();
                    }
                }
                ArrayList<OooO0o> arrayList2 = this.f8224OooOo00;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f8224OooOo00.clone();
                    int size2 = arrayList3.size();
                    for (int i = 0; i < size2; i++) {
                        ((OooO0o) arrayList3.get(i)).OooO0OO();
                    }
                }
            }
            this.f8219OooOOo = false;
        }
    }

    @NonNull
    public void OooOoo(long j) {
        this.f8208OooO0o = j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void OooOoo0() {
        Oooo0O0();
        p188o00o0O.OooOO0<Animator, OooO0O0> oooOO0OooOOo = OooOOo();
        for (Animator animator : this.f8223OooOo0) {
            if (oooOO0OooOOo.containsKey(animator)) {
                Oooo0O0();
                if (animator != null) {
                    animator.addListener(new o000OOo(this, oooOO0OooOOo));
                    long j = this.f8208OooO0o;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f8209OooO0o0;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f8210OooO0oO;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new o000000(this));
                    animator.start();
                }
            }
        }
        this.f8223OooOo0.clear();
        OooOOOO();
    }

    public void OooOooo(@Nullable OooO0OO oooO0OO) {
        this.f8226OooOo0o = oooO0OO;
    }

    @NonNull
    public void Oooo0(long j) {
        this.f8209OooO0o0 = j;
    }

    @NonNull
    public void Oooo000(@Nullable TimeInterpolator timeInterpolator) {
        this.f8210OooO0oO = timeInterpolator;
    }

    public void Oooo00O(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f8222OooOo = f8203OooOoO;
        } else {
            this.f8222OooOo = pathMotion;
        }
    }

    public void Oooo00o(@Nullable o000000O o000000o2) {
        this.f8225OooOo0O = o000000o2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void Oooo0O0() {
        if (this.f8220OooOOo0 == 0) {
            ArrayList<OooO0o> arrayList = this.f8224OooOo00;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f8224OooOo00.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((OooO0o) arrayList2.get(i)).OooO0Oo(this);
                }
            }
            this.f8221OooOOoo = false;
        }
        this.f8220OooOOo0++;
    }

    public String Oooo0OO(String str) {
        StringBuilder sbOooO00o = o00OO.OooO00o(str);
        sbOooO00o.append(getClass().getSimpleName());
        sbOooO00o.append("@");
        sbOooO00o.append(Integer.toHexString(hashCode()));
        sbOooO00o.append(": ");
        String string = sbOooO00o.toString();
        if (this.f8208OooO0o != -1) {
            string = android.support.v4.media.session.OooO0o.OooO0O0(p037OoooOo0.o000Oo0.OooO0O0(string, "dur("), this.f8208OooO0o, ") ");
        }
        if (this.f8209OooO0o0 != -1) {
            string = android.support.v4.media.session.OooO0o.OooO0O0(p037OoooOo0.o000Oo0.OooO0O0(string, "dly("), this.f8209OooO0o0, ") ");
        }
        if (this.f8210OooO0oO != null) {
            StringBuilder sbOooO0O0 = p037OoooOo0.o000Oo0.OooO0O0(string, "interp(");
            sbOooO0O0.append(this.f8210OooO0oO);
            sbOooO0O0.append(") ");
            string = sbOooO0O0.toString();
        }
        ArrayList<Integer> arrayList = this.f8211OooO0oo;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f8206OooO;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, ", ");
                }
                StringBuilder sbOooO00o2 = o00OO.OooO00o(strOooO00o);
                sbOooO00o2.append(arrayList.get(i));
                strOooO00o = sbOooO00o2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, ", ");
                }
                StringBuilder sbOooO00o3 = o00OO.OooO00o(strOooO00o);
                sbOooO00o3.append(arrayList2.get(i2));
                strOooO00o = sbOooO00o3.toString();
            }
        }
        return androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, ")");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        ArrayList<Animator> arrayList = this.f8218OooOOOo;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                arrayList.get(size).cancel();
            }
        }
        ArrayList<OooO0o> arrayList2 = this.f8224OooOo00;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f8224OooOo00.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((OooO0o) arrayList3.get(i)).OooO0O0();
        }
    }

    public final String toString() {
        return Oooo0OO("");
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z;
        this.f8207OooO0Oo = getClass().getName();
        this.f8209OooO0o0 = -1L;
        this.f8208OooO0o = -1L;
        this.f8210OooO0oO = null;
        this.f8211OooO0oo = new ArrayList<>();
        this.f8206OooO = new ArrayList<>();
        this.f8212OooOO0 = new o00000O();
        this.f8213OooOO0O = new o00000O();
        this.f8214OooOO0o = null;
        int[] iArr = f8204OooOoO0;
        this.f8216OooOOO0 = iArr;
        this.f8218OooOOOo = new ArrayList<>();
        this.f8220OooOOo0 = 0;
        this.f8219OooOOo = false;
        this.f8221OooOOoo = false;
        this.f8224OooOo00 = null;
        this.f8223OooOo0 = new ArrayList<>();
        this.f8222OooOo = f8203OooOoO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0O00.f34975OooO00o);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jOooO0o0 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jOooO0o0 >= 0) {
            OooOoo(jOooO0o0);
        }
        long jOooO0o1 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jOooO0o1 > 0) {
            Oooo0(jOooO0o1);
        }
        int resourceId = !oo000o.OooO0oO(xmlResourceParser, "interpolator") ? 0 : typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            Oooo000(AnimationUtils.loadInterpolator(context, resourceId));
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
                    throw new InflateException(o000oOoO.OooO00o("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.f8216OooOOO0 = iArr;
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
                this.f8216OooOOO0 = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
