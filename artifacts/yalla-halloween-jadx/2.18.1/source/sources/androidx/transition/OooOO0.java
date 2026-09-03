package androidx.transition;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p021OooOooo.Oooo0;
import p021OooOooo.o00Ooo;
import p101o000oOoo.oO000OOo;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00OO0O;
import p101o000oOoo.oO00OOOo;
import p101o000oOoo.oO00o00;
import p101o000oOoo.oO0OOO00;
import p101o000oOoo.oO0OOo0o;
import p101o000oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static AutoTransition f9518OooO00o = new AutoTransition();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static ThreadLocal<WeakReference<Oooo0<ViewGroup, ArrayList<Transition>>>> f9519OooO0O0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static ArrayList<ViewGroup> f9520OooO0OO = new ArrayList<>();

    public static class OooO00o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Transition f9521Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public ViewGroup f9522Oooo0oO;

        /* JADX INFO: renamed from: androidx.transition.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0066OooO00o extends OooO {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Oooo0 f9523Oooo0o;

            public C0066OooO00o(Oooo0 oooo0) {
                this.f9523Oooo0o = oooo0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.Transition.OooO0o
            public final void OooO0Oo(@NonNull Transition transition) {
                ((ArrayList) this.f9523Oooo0o.getOrDefault(OooO00o.this.f9522Oooo0oO, null)).remove(transition);
                transition.OooOoO(this);
            }
        }

        public OooO00o(Transition transition, ViewGroup viewGroup) {
            this.f9521Oooo0o = transition;
            this.f9522Oooo0oO = viewGroup;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x021f  */
        /* JADX WARN: Code duplicated, block: B:105:0x023d  */
        /* JADX WARN: Code duplicated, block: B:137:0x02ac  */
        /* JADX WARN: Code duplicated, block: B:142:0x01eb A[EDGE_INSN: B:142:0x01eb->B:89:0x01eb BREAK  A[LOOP:1: B:19:0x009a->B:88:0x01e1], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x005c  */
        /* JADX WARN: Code duplicated, block: B:17:0x0066 A[LOOP:0: B:15:0x0060->B:17:0x0066, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:180:0x0209 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:183:0x022a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:21:0x009f  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:30:0x00af  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:46:0x0109  */
        /* JADX WARN: Code duplicated, block: B:48:0x0115  */
        /* JADX WARN: Code duplicated, block: B:61:0x015d  */
        /* JADX WARN: Code duplicated, block: B:63:0x0167  */
        /* JADX WARN: Code duplicated, block: B:76:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:79:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:92:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:94:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:99:0x0211  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            Transition transition;
            oOo00OO0 ooo00oo0;
            oOo00OO0 ooo00oo1;
            Oooo0 oooo0;
            Oooo0 oooo1;
            int i;
            int[] iArr;
            int i2;
            int i3;
            Oooo0<Animator, Transition.OooO0O0> oooo0OooOOoo;
            int i4;
            Animator animatorOooO;
            Transition.OooO0O0 orDefault;
            oO00O0o oo00o0o;
            oO00O0o oo00o0o2;
            int i5;
            oOo00OO0 ooo00oo2;
            int i6;
            View view;
            oO00O0o oo00o0o3;
            Oooo0<String, View> oooo2;
            int i7;
            int i8;
            View viewOooOOO0;
            View orDefault2;
            SparseArray<View> sparseArray;
            int size;
            int i9;
            View viewValueAt;
            View view2;
            o00Ooo<View> o00ooo2;
            int iOooOOO;
            int i10;
            View viewOooOOOO;
            oOo00OO0 ooo00oo3;
            Iterator it;
            this.f9522Oooo0oO.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f9522Oooo0oO.removeOnAttachStateChangeListener(this);
            int i11 = 1;
            if (!OooOO0.f9520OooO0OO.remove(this.f9522Oooo0oO)) {
                return true;
            }
            Oooo0<ViewGroup, ArrayList<Transition>> oooo0OooO0O0 = OooOO0.OooO0O0();
            View view3 = null;
            ArrayList<Transition> orDefault3 = oooo0OooO0O0.getOrDefault(this.f9522Oooo0oO, null);
            if (orDefault3 != null) {
                arrayList = orDefault3.size() > 0 ? new ArrayList(orDefault3) : null;
                orDefault3.add(this.f9521Oooo0o);
                this.f9521Oooo0o.OooO0OO(new C0066OooO00o(oooo0OooO0O0));
                this.f9521Oooo0o.OooOO0O(this.f9522Oooo0oO, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).OooOoo0(this.f9522Oooo0oO);
                    }
                }
                transition = this.f9521Oooo0o;
                ViewGroup viewGroup = this.f9522Oooo0oO;
                Objects.requireNonNull(transition);
                transition.f9567OoooOOO = new ArrayList<>();
                transition.f9568OoooOOo = new ArrayList<>();
                ooo00oo0 = transition.f9565OoooO0O;
                ooo00oo1 = transition.f9562OoooO;
                oooo0 = new Oooo0(ooo00oo0.f29781OooO00o);
                oooo1 = new Oooo0(ooo00oo1.f29781OooO00o);
                i = 0;
                while (true) {
                    iArr = transition.f9578o000oOoO;
                    if (i < iArr.length) {
                        break;
                    }
                    i5 = iArr[i];
                    if (i5 != i11) {
                        ooo00oo2 = ooo00oo0;
                        i6 = oooo0.f421Oooo0oo;
                        while (true) {
                            i6--;
                            if (i6 >= 0) {
                                view = (View) oooo0.OooO(i6);
                                if (view == null && transition.OooOo0o(view) && (oo00o0o3 = (oO00O0o) oooo1.remove(view)) != null && transition.OooOo0o(oo00o0o3.f29743OooO0O0)) {
                                    transition.f9567OoooOOO.add((oO00O0o) oooo0.OooOO0O(i6));
                                    transition.f9568OoooOOo.add(oo00o0o3);
                                }
                            }
                        }
                    } else if (i5 != 2) {
                        ooo00oo2 = ooo00oo0;
                        oooo2 = ooo00oo2.f29784OooO0Oo;
                        Oooo0<String, View> oooo3 = ooo00oo1.f29784OooO0Oo;
                        i7 = oooo2.f421Oooo0oo;
                        for (i8 = 0; i8 < i7; i8++) {
                            viewOooOOO0 = oooo2.OooOOO0(i8);
                            if (viewOooOOO0 == null && transition.OooOo0o(viewOooOOO0) && (orDefault2 = oooo3.getOrDefault(oooo2.OooO(i8), null)) != null && transition.OooOo0o(orDefault2)) {
                                oO00O0o oo00o0o4 = (oO00O0o) oooo0.getOrDefault(viewOooOOO0, null);
                                oO00O0o oo00o0o5 = (oO00O0o) oooo1.getOrDefault(orDefault2, null);
                                if (oo00o0o4 != null && oo00o0o5 != null) {
                                    transition.f9567OoooOOO.add(oo00o0o4);
                                    transition.f9568OoooOOo.add(oo00o0o5);
                                    oooo0.remove(viewOooOOO0);
                                    oooo1.remove(orDefault2);
                                }
                            }
                        }
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            o00ooo2 = ooo00oo0.f29783OooO0OO;
                            o00Ooo<View> o00ooo3 = ooo00oo1.f29783OooO0OO;
                            iOooOOO = o00ooo2.OooOOO();
                            i10 = 0;
                            while (i10 < iOooOOO) {
                                viewOooOOOO = o00ooo2.OooOOOO(i10);
                                if (viewOooOOOO == null && transition.OooOo0o(viewOooOOOO)) {
                                    ooo00oo3 = ooo00oo0;
                                    View viewOooO = o00ooo3.OooO(o00ooo2.OooOO0O(i10), view3);
                                    if (viewOooO != null && transition.OooOo0o(viewOooO)) {
                                        oO00O0o oo00o0o6 = (oO00O0o) oooo0.getOrDefault(viewOooOOOO, view3);
                                        oO00O0o oo00o0o7 = (oO00O0o) oooo1.getOrDefault(viewOooO, view3);
                                        if (oo00o0o6 != null && oo00o0o7 != null) {
                                            transition.f9567OoooOOO.add(oo00o0o6);
                                            transition.f9568OoooOOo.add(oo00o0o7);
                                            oooo0.remove(viewOooOOOO);
                                            oooo1.remove(viewOooO);
                                        }
                                    }
                                } else {
                                    ooo00oo3 = ooo00oo0;
                                }
                                i10++;
                                ooo00oo0 = ooo00oo3;
                                view3 = null;
                            }
                        }
                        ooo00oo2 = ooo00oo0;
                    } else {
                        ooo00oo2 = ooo00oo0;
                        sparseArray = ooo00oo2.f29782OooO0O0;
                        SparseArray<View> sparseArray2 = ooo00oo1.f29782OooO0O0;
                        size = sparseArray.size();
                        for (i9 = 0; i9 < size; i9++) {
                            viewValueAt = sparseArray.valueAt(i9);
                            if (viewValueAt == null && transition.OooOo0o(viewValueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i9))) != null && transition.OooOo0o(view2)) {
                                oO00O0o oo00o0o8 = (oO00O0o) oooo0.getOrDefault(viewValueAt, null);
                                oO00O0o oo00o0o9 = (oO00O0o) oooo1.getOrDefault(view2, null);
                                if (oo00o0o8 != null && oo00o0o9 != null) {
                                    transition.f9567OoooOOO.add(oo00o0o8);
                                    transition.f9568OoooOOo.add(oo00o0o9);
                                    oooo0.remove(viewValueAt);
                                    oooo1.remove(view2);
                                }
                            }
                        }
                    }
                    i++;
                    ooo00oo0 = ooo00oo2;
                    i11 = 1;
                    view3 = null;
                }
                for (i2 = 0; i2 < oooo0.f421Oooo0oo; i2++) {
                    oo00o0o2 = (oO00O0o) oooo0.OooOOO0(i2);
                    if (transition.OooOo0o(oo00o0o2.f29743OooO0O0)) {
                        transition.f9567OoooOOO.add(oo00o0o2);
                        transition.f9568OoooOOo.add(null);
                    }
                }
                for (i3 = 0; i3 < oooo1.f421Oooo0oo; i3++) {
                    oo00o0o = (oO00O0o) oooo1.OooOOO0(i3);
                    if (transition.OooOo0o(oo00o0o.f29743OooO0O0)) {
                        transition.f9568OoooOOo.add(oo00o0o);
                        transition.f9567OoooOOO.add(null);
                    }
                }
                oooo0OooOOoo = Transition.OooOOoo();
                int i12 = oooo0OooOOoo.f421Oooo0oo;
                oO00OOOo oo00oooo = oO00OO0O.f29748OooO00o;
                WindowId windowId = viewGroup.getWindowId();
                for (i4 = i12 - 1; i4 >= 0; i4--) {
                    animatorOooO = oooo0OooOOoo.OooO(i4);
                    if (animatorOooO == null && (orDefault = oooo0OooOOoo.getOrDefault(animatorOooO, null)) != null && orDefault.f9579OooO00o != null) {
                        oO0OOO00 oo0ooo00 = orDefault.f9582OooO0Oo;
                        if ((oo0ooo00 instanceof oO00o00) && ((oO00o00) oo0ooo00).f29757OooO00o.equals(windowId)) {
                            oO00O0o oo00o0o10 = orDefault.f9581OooO0OO;
                            View view4 = orDefault.f9579OooO00o;
                            oO00O0o oo00o0oOooOo0 = transition.OooOo0(view4, true);
                            oO00O0o oo00o0oOooOOo = transition.OooOOo(view4, true);
                            if (oo00o0oOooOo0 == null && oo00o0oOooOOo == null) {
                                oo00o0oOooOOo = transition.f9562OoooO.f29781OooO00o.getOrDefault(view4, null);
                            }
                            if (!(oo00o0oOooOo0 == null && oo00o0oOooOOo == null) && orDefault.f9583OooO0o0.OooOo0O(oo00o0o10, oo00o0oOooOOo)) {
                                if (animatorOooO.isRunning() || animatorOooO.isStarted()) {
                                    animatorOooO.cancel();
                                } else {
                                    oooo0OooOOoo.remove(animatorOooO);
                                }
                            }
                        }
                    }
                }
                transition.OooOOOO(viewGroup, transition.f9565OoooO0O, transition.f9562OoooO, transition.f9567OoooOOO, transition.f9568OoooOOo);
                transition.OooOoo();
                return true;
            }
            orDefault3 = new ArrayList<>();
            oooo0OooO0O0.put(this.f9522Oooo0oO, orDefault3);
            orDefault3.add(this.f9521Oooo0o);
            this.f9521Oooo0o.OooO0OO(new C0066OooO00o(oooo0OooO0O0));
            this.f9521Oooo0o.OooOO0O(this.f9522Oooo0oO, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).OooOoo0(this.f9522Oooo0oO);
                }
            }
            transition = this.f9521Oooo0o;
            ViewGroup viewGroup2 = this.f9522Oooo0oO;
            Objects.requireNonNull(transition);
            transition.f9567OoooOOO = new ArrayList<>();
            transition.f9568OoooOOo = new ArrayList<>();
            ooo00oo0 = transition.f9565OoooO0O;
            ooo00oo1 = transition.f9562OoooO;
            oooo0 = new Oooo0(ooo00oo0.f29781OooO00o);
            oooo1 = new Oooo0(ooo00oo1.f29781OooO00o);
            i = 0;
            while (true) {
                iArr = transition.f9578o000oOoO;
                if (i < iArr.length) {
                    break;
                    break;
                }
                i5 = iArr[i];
                if (i5 != i11) {
                    ooo00oo2 = ooo00oo0;
                    i6 = oooo0.f421Oooo0oo;
                    while (true) {
                        i6--;
                        if (i6 >= 0) {
                            view = (View) oooo0.OooO(i6);
                            if (view == null) {
                            }
                        }
                    }
                } else if (i5 != 2) {
                    ooo00oo2 = ooo00oo0;
                    oooo2 = ooo00oo2.f29784OooO0Oo;
                    Oooo0<String, View> oooo4 = ooo00oo1.f29784OooO0Oo;
                    i7 = oooo2.f421Oooo0oo;
                    while (i8 < i7) {
                        viewOooOOO0 = oooo2.OooOOO0(i8);
                        if (viewOooOOO0 == null) {
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        o00ooo2 = ooo00oo0.f29783OooO0OO;
                        o00Ooo<View> o00ooo4 = ooo00oo1.f29783OooO0OO;
                        iOooOOO = o00ooo2.OooOOO();
                        i10 = 0;
                        while (i10 < iOooOOO) {
                            viewOooOOOO = o00ooo2.OooOOOO(i10);
                            if (viewOooOOOO == null) {
                                ooo00oo3 = ooo00oo0;
                            } else {
                                ooo00oo3 = ooo00oo0;
                            }
                            i10++;
                            ooo00oo0 = ooo00oo3;
                            view3 = null;
                        }
                    }
                    ooo00oo2 = ooo00oo0;
                } else {
                    ooo00oo2 = ooo00oo0;
                    sparseArray = ooo00oo2.f29782OooO0O0;
                    SparseArray<View> sparseArray3 = ooo00oo1.f29782OooO0O0;
                    size = sparseArray.size();
                    while (i9 < size) {
                        viewValueAt = sparseArray.valueAt(i9);
                        if (viewValueAt == null) {
                        }
                    }
                }
                i++;
                ooo00oo0 = ooo00oo2;
                i11 = 1;
                view3 = null;
            }
            while (i2 < oooo0.f421Oooo0oo) {
                oo00o0o2 = (oO00O0o) oooo0.OooOOO0(i2);
                if (transition.OooOo0o(oo00o0o2.f29743OooO0O0)) {
                    transition.f9567OoooOOO.add(oo00o0o2);
                    transition.f9568OoooOOo.add(null);
                }
            }
            while (i3 < oooo1.f421Oooo0oo) {
                oo00o0o = (oO00O0o) oooo1.OooOOO0(i3);
                if (transition.OooOo0o(oo00o0o.f29743OooO0O0)) {
                    transition.f9568OoooOOo.add(oo00o0o);
                    transition.f9567OoooOOO.add(null);
                }
            }
            oooo0OooOOoo = Transition.OooOOoo();
            int i13 = oooo0OooOOoo.f421Oooo0oo;
            oO00OOOo oo00oooo2 = oO00OO0O.f29748OooO00o;
            WindowId windowId2 = viewGroup2.getWindowId();
            while (i4 >= 0) {
                animatorOooO = oooo0OooOOoo.OooO(i4);
                if (animatorOooO == null) {
                }
            }
            transition.OooOOOO(viewGroup2, transition.f9565OoooO0O, transition.f9562OoooO, transition.f9567OoooOOO, transition.f9568OoooOOo);
            transition.OooOoo();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.f9522Oooo0oO.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f9522Oooo0oO.removeOnAttachStateChangeListener(this);
            OooOO0.f9520OooO0OO.remove(this.f9522Oooo0oO);
            ArrayList<Transition> orDefault = OooOO0.OooO0O0().getOrDefault(this.f9522Oooo0oO, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().OooOoo0(this.f9522Oooo0oO);
                }
            }
            this.f9521Oooo0o.OooOO0o(true);
        }
    }

    public static void OooO00o(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        if (f9520OooO0OO.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
            f9520OooO0OO.add(viewGroup);
            if (transition == null) {
                transition = f9518OooO00o;
            }
            Transition transitionClone = transition.clone();
            ArrayList<Transition> orDefault = OooO0O0().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().OooOoO0(viewGroup);
                }
            }
            if (transitionClone != null) {
                transitionClone.OooOO0O(viewGroup, true);
            }
            int i = oO000OOo.transition_current_scene;
            if (((oO0OOo0o) viewGroup.getTag(i)) != null) {
                throw null;
            }
            viewGroup.setTag(i, null);
            if (transitionClone != null) {
                OooO00o oooO00o = new OooO00o(transitionClone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(oooO00o);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(oooO00o);
            }
        }
    }

    public static Oooo0<ViewGroup, ArrayList<Transition>> OooO0O0() {
        Oooo0<ViewGroup, ArrayList<Transition>> oooo0;
        WeakReference<Oooo0<ViewGroup, ArrayList<Transition>>> weakReference = f9519OooO0O0.get();
        if (weakReference != null && (oooo0 = weakReference.get()) != null) {
            return oooo0;
        }
        Oooo0<ViewGroup, ArrayList<Transition>> oooo1 = new Oooo0<>();
        f9519OooO0O0.set(new WeakReference<>(oooo1));
        return oooo1;
    }
}
