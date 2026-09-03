package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o000O0o {

    public static class OooO extends OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Object f8372OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f8373OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Object f8374OooO0o0;

        public OooO(@NonNull o000O0o.OooO0OO oooO0OO, @NonNull o000O00O.OooO0o oooO0o, boolean z, boolean z2) {
            super(oooO0OO, oooO0o);
            if (oooO0OO.f8493OooO00o == 2) {
                this.f8372OooO0OO = z ? oooO0OO.f8495OooO0OO.getReenterTransition() : oooO0OO.f8495OooO0OO.getEnterTransition();
                this.f8373OooO0Oo = z ? oooO0OO.f8495OooO0OO.getAllowReturnTransitionOverlap() : oooO0OO.f8495OooO0OO.getAllowEnterTransitionOverlap();
            } else {
                this.f8372OooO0OO = z ? oooO0OO.f8495OooO0OO.getReturnTransition() : oooO0OO.f8495OooO0OO.getExitTransition();
                this.f8373OooO0Oo = true;
            }
            if (!z2) {
                this.f8374OooO0o0 = null;
            } else if (z) {
                this.f8374OooO0o0 = oooO0OO.f8495OooO0OO.getSharedElementReturnTransition();
            } else {
                this.f8374OooO0o0 = oooO0OO.f8495OooO0OO.getSharedElementEnterTransition();
            }
        }

        @Nullable
        public final o0000O0O OooO0OO(Object obj) {
            if (obj == null) {
                return null;
            }
            o0000 o0000Var = o0000Ooo.f8480OooO00o;
            if (obj instanceof Transition) {
                return o0000Var;
            }
            o0000O0O o0000o0o2 = o0000Ooo.f8481OooO0O0;
            if (o0000o0o2 != null && o0000o0o2.OooO0o0(obj)) {
                return o0000o0o2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f8382OooO00o.f8495OooO0OO + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f8375OooO00o;

        static {
            int[] iArr = new int[p418o0Oo0oo.o00000O0.OooO0OO(4).length];
            f8375OooO00o = iArr;
            try {
                iArr[p418o0Oo0oo.o00000O0.OooO0O0(3)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8375OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(4)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8375OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(1)] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8375OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(2)] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class RunnableC0053OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List f8376Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000O0o.OooO0OO f8377Oooo0oO;

        public RunnableC0053OooO0O0(List list, o000O0o.OooO0OO oooO0OO) {
            this.f8376Oooo0o = list;
            this.f8377Oooo0oO = oooO0OO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f8376Oooo0o.contains(this.f8377Oooo0oO)) {
                this.f8376Oooo0o.remove(this.f8377Oooo0oO);
                OooO0O0 oooO0O0 = OooO0O0.this;
                o000O0o.OooO0OO oooO0OO = this.f8377Oooo0oO;
                Objects.requireNonNull(oooO0O0);
                p016OooOoO0.OooOo00.OooO00o(oooO0OO.f8493OooO00o, oooO0OO.f8495OooO0OO.mView);
            }
        }
    }

    public static class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f8379OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f8380OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public o0OoOo0.OooO00o f8381OooO0o0;

        public OooO0OO(@NonNull o000O0o.OooO0OO oooO0OO, @NonNull o000O00O.OooO0o oooO0o, boolean z) {
            super(oooO0OO, oooO0o);
            this.f8380OooO0Oo = false;
            this.f8379OooO0OO = z;
        }

        /* JADX WARN: Code duplicated, block: B:77:0x00f2 A[Catch: RuntimeException -> 0x00f9, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00f9, blocks: (B:75:0x00ec, B:77:0x00f2), top: B:87:0x00ec }] */
        /* JADX WARN: Code duplicated, block: B:87:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Nullable
        public final o0OoOo0.OooO00o OooO0OO(@NonNull Context context) {
            int enterAnim;
            Animator animatorLoadAnimator;
            int iOooO00o;
            if (this.f8380OooO0Oo) {
                return this.f8381OooO0o0;
            }
            o000O0o.OooO0OO oooO0OO = this.f8382OooO00o;
            Fragment fragment = oooO0OO.f8495OooO0OO;
            boolean z = false;
            boolean z2 = oooO0OO.f8493OooO00o == 2;
            boolean z3 = this.f8379OooO0OO;
            int nextTransition = fragment.getNextTransition();
            if (z3) {
                enterAnim = z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            o0OoOo0.OooO00o oooO00o = null;
            if (viewGroup != null) {
                int i = p079o000Oo0O.Oooo000.visible_removing_fragment_view_tag;
                if (viewGroup.getTag(i) != null) {
                    fragment.mContainer.setTag(i, null);
                }
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, enterAnim);
                if (animationOnCreateAnimation != null) {
                    oooO00o = new o0OoOo0.OooO00o(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        oooO00o = new o0OoOo0.OooO00o(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iOooO00o = z2 ? p079o000Oo0O.OooOo.fragment_open_enter : p079o000Oo0O.OooOo.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iOooO00o = z2 ? p079o000Oo0O.OooOo.fragment_close_enter : p079o000Oo0O.OooOo.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iOooO00o = z2 ? o0OoOo0.OooO00o(context, R.attr.activityCloseEnterAnimation) : o0OoOo0.OooO00o(context, R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iOooO00o = z2 ? p079o000Oo0O.OooOo.fragment_fade_enter : p079o000Oo0O.OooOo.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                enterAnim = -1;
                            } else {
                                iOooO00o = z2 ? o0OoOo0.OooO00o(context, R.attr.activityOpenEnterAnimation) : o0OoOo0.OooO00o(context, R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iOooO00o;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        oooO00o = new o0OoOo0.OooO00o(animationLoadAnimation);
                                    } else {
                                        z = true;
                                        if (!z) {
                                            try {
                                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                                if (animatorLoadAnimator != null) {
                                                    oooO00o = new o0OoOo0.OooO00o(animatorLoadAnimator);
                                                }
                                            } catch (RuntimeException e) {
                                                if (zEquals) {
                                                    throw e;
                                                }
                                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                                if (animationLoadAnimation2 != null) {
                                                    oooO00o = new o0OoOo0.OooO00o(animationLoadAnimation2);
                                                }
                                            }
                                        }
                                    }
                                } catch (Resources.NotFoundException e2) {
                                    throw e2;
                                } catch (RuntimeException unused) {
                                }
                            } else if (!z) {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    oooO00o = new o0OoOo0.OooO00o(animatorLoadAnimator);
                                }
                            }
                        }
                    }
                }
            }
            this.f8381OooO0o0 = oooO00o;
            this.f8380OooO0Oo = true;
            return oooO00o;
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final o000O0o.OooO0OO f8382OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final o000O00O.OooO0o f8383OooO0O0;

        public OooO0o(@NonNull o000O0o.OooO0OO oooO0OO, @NonNull o000O00O.OooO0o oooO0o) {
            this.f8382OooO00o = oooO0OO;
            this.f8383OooO0O0 = oooO0o;
        }

        public final void OooO00o() {
            o000O0o.OooO0OO oooO0OO = this.f8382OooO00o;
            if (oooO0OO.f8498OooO0o0.remove(this.f8383OooO0O0) && oooO0OO.f8498OooO0o0.isEmpty()) {
                oooO0OO.OooO0OO();
            }
        }

        public final boolean OooO0O0() {
            int iOooO0OO = p016OooOoO0.OooOo00.OooO0OO(this.f8382OooO00o.f8495OooO0OO.mView);
            int i = this.f8382OooO00o.f8493OooO00o;
            return iOooO0OO == i || !(iOooO0OO == 2 || i == 2);
        }
    }

    public OooO0O0(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:154:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:158:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:161:0x0507  */
    /* JADX WARN: Code duplicated, block: B:162:0x0510  */
    /* JADX WARN: Code duplicated, block: B:226:0x0714  */
    /* JADX WARN: Code duplicated, block: B:229:0x0725  */
    /* JADX WARN: Code duplicated, block: B:232:0x072f  */
    /* JADX WARN: Code duplicated, block: B:236:0x0739  */
    /* JADX WARN: Code duplicated, block: B:240:0x0750  */
    /* JADX WARN: Code duplicated, block: B:241:0x076c  */
    /* JADX WARN: Code duplicated, block: B:246:0x077b  */
    /* JADX WARN: Code duplicated, block: B:247:0x077e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0782  */
    /* JADX WARN: Code duplicated, block: B:250:0x0788  */
    /* JADX WARN: Code duplicated, block: B:253:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:258:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:262:0x0804  */
    /* JADX WARN: Code duplicated, block: B:267:0x0828  */
    /* JADX WARN: Code duplicated, block: B:271:0x0856  */
    /* JADX WARN: Code duplicated, block: B:272:0x085d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0877  */
    /* JADX WARN: Code duplicated, block: B:279:0x08a4 A[LOOP:7: B:277:0x089e->B:279:0x08a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x08be  */
    /* JADX WARN: Code duplicated, block: B:318:0x0774 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0721 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x072b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0749 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x081f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x07fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0843 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0821 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:240:0x0750, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:253:0x07b5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:262:0x0804, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:267:0x0828, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:274:0x0877, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:282:0x08be, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o000O0o
    public final void OooO0O0(@NonNull List<o000O0o.OooO0OO> list, boolean z) {
        ArrayList arrayList;
        String str;
        HashMap map;
        String str2;
        o000O0o.OooO0OO oooO0OO;
        o000O0o.OooO0OO oooO0OO2;
        ArrayList arrayList2;
        String str3;
        String str4;
        String str5;
        p021OooOooo.Oooo0 oooo0;
        OooO oooO;
        Object obj;
        Object obj2;
        HashMap map2;
        o000O0o.OooO0OO oooO0OO3;
        ArrayList arrayList3;
        View view;
        HashMap map3;
        Object objOooOO0;
        String str6;
        ArrayList arrayList4;
        Rect rect;
        HashMap map4;
        View view2;
        ArrayList<View> arrayList5;
        Object obj3;
        int i;
        boolean z2;
        View view3;
        View view4;
        boolean zContainsValue;
        ViewGroup viewGroup;
        Context context;
        ArrayList<OooO0OO> arrayList6;
        Iterator it;
        boolean z3;
        String str7;
        o000O0o.OooO0OO oooO0OO4;
        Fragment fragment;
        View view5;
        Animation animation;
        OooO0OO oooO0OO5;
        String str8;
        o0OoOo0.OooO00o oooO00oOooO0OO;
        Animator animator;
        o000O0o.OooO0OO oooO0OO6;
        Fragment fragment2;
        String str9;
        boolean z4;
        ArrayList arrayList7;
        boolean z5 = z;
        ArrayList<o000O0o.OooO0OO> arrayList8 = (ArrayList) list;
        o000O0o.OooO0OO oooO0OO7 = null;
        o000O0o.OooO0OO oooO0OO8 = null;
        for (o000O0o.OooO0OO oooO0OO9 : arrayList8) {
            int iOooO0OO = p016OooOoO0.OooOo00.OooO0OO(oooO0OO9.f8495OooO0OO.mView);
            int i2 = OooO00o.f8375OooO00o[p418o0Oo0oo.o00000O0.OooO0O0(oooO0OO9.f8493OooO00o)];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (iOooO0OO == 2 && oooO0OO7 == null) {
                    oooO0OO7 = oooO0OO9;
                }
            } else if (i2 == 4 && iOooO0OO != 2) {
                oooO0OO8 = oooO0OO9;
            }
        }
        String str10 = "FragmentManager";
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Executing operations from " + oooO0OO7 + " to " + oooO0OO8);
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList<OooO> arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList(list);
        Fragment fragment3 = ((o000O0o.OooO0OO) arrayList8.get(arrayList8.size() - 1)).f8495OooO0OO;
        Iterator it2 = arrayList8.iterator();
        while (it2.hasNext()) {
            Fragment.OooOOOO oooOOOO = ((o000O0o.OooO0OO) it2.next()).f8495OooO0OO.mAnimationInfo;
            Fragment.OooOOOO oooOOOO2 = fragment3.mAnimationInfo;
            oooOOOO.f8263OooO0O0 = oooOOOO2.f8263OooO0O0;
            oooOOOO.f8264OooO0OO = oooOOOO2.f8264OooO0OO;
            oooOOOO.f8265OooO0Oo = oooOOOO2.f8265OooO0Oo;
            oooOOOO.f8267OooO0o0 = oooOOOO2.f8267OooO0o0;
        }
        for (o000O0o.OooO0OO oooO0OO10 : arrayList8) {
            o000O00O.OooO0o oooO0o = new o000O00O.OooO0o();
            oooO0OO10.OooO0o0();
            oooO0OO10.f8498OooO0o0.add(oooO0o);
            arrayList9.add(new OooO0OO(oooO0OO10, oooO0o, z5));
            o000O00O.OooO0o oooO0o2 = new o000O00O.OooO0o();
            oooO0OO10.OooO0o0();
            oooO0OO10.f8498OooO0o0.add(oooO0o2);
            arrayList10.add(new OooO(oooO0OO10, oooO0o2, z5, !z5 ? oooO0OO10 != oooO0OO8 : oooO0OO10 != oooO0OO7));
            oooO0OO10.OooO00o(new RunnableC0053OooO0O0(arrayList11, oooO0OO10));
        }
        HashMap map5 = new HashMap();
        o0000O0O o0000o0o2 = null;
        for (OooO oooO2 : arrayList10) {
            if (!oooO2.OooO0O0()) {
                o0000O0O o0000o0oOooO0OO = oooO2.OooO0OO(oooO2.f8372OooO0OO);
                o0000O0O o0000o0oOooO0OO2 = oooO2.OooO0OO(oooO2.f8374OooO0o0);
                if (o0000o0oOooO0OO != null && o0000o0oOooO0OO2 != null && o0000o0oOooO0OO != o0000o0oOooO0OO2) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbOooO0o0.append(oooO2.f8382OooO00o.f8495OooO0OO);
                    sbOooO0o0.append(" returned Transition ");
                    sbOooO0o0.append(oooO2.f8372OooO0OO);
                    sbOooO0o0.append(" which uses a different Transition  type than its shared element transition ");
                    sbOooO0o0.append(oooO2.f8374OooO0o0);
                    throw new IllegalArgumentException(sbOooO0o0.toString());
                }
                if (o0000o0oOooO0OO == null) {
                    o0000o0oOooO0OO = o0000o0oOooO0OO2;
                }
                if (o0000o0o2 == null) {
                    o0000o0o2 = o0000o0oOooO0OO;
                } else if (o0000o0oOooO0OO != null && o0000o0o2 != o0000o0oOooO0OO) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sbOooO0o1.append(oooO2.f8382OooO00o.f8495OooO0OO);
                    sbOooO0o1.append(" returned Transition ");
                    sbOooO0o1.append(oooO2.f8372OooO0OO);
                    sbOooO0o1.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sbOooO0o1.toString());
                }
            }
        }
        if (o0000o0o2 == null) {
            for (OooO oooO3 : arrayList10) {
                map5.put(oooO3.f8382OooO00o, Boolean.FALSE);
                oooO3.OooO00o();
            }
            map = map5;
            arrayList = arrayList9;
            str = " to ";
            str2 = "FragmentManager";
        } else {
            View view6 = new View(this.f8485OooO00o.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList12 = new ArrayList<>();
            ArrayList<View> arrayList13 = new ArrayList<>();
            p021OooOooo.Oooo0 oooo1 = new p021OooOooo.Oooo0();
            Iterator it3 = arrayList10.iterator();
            boolean z6 = false;
            arrayList = arrayList9;
            o000O0o.OooO0OO oooO0OO11 = oooO0OO7;
            str = " to ";
            ArrayList arrayList14 = arrayList11;
            Object obj4 = null;
            View view7 = null;
            o000O0o.OooO0OO oooO0OO12 = oooO0OO8;
            while (it3.hasNext()) {
                Object obj5 = obj4;
                Object obj6 = ((OooO) it3.next()).f8374OooO0o0;
                if (!(obj6 != null) || oooO0OO11 == null || oooO0OO12 == null) {
                    str6 = str10;
                    arrayList4 = arrayList10;
                    rect = rect2;
                    map4 = map5;
                    view2 = view6;
                    arrayList5 = arrayList13;
                    obj3 = obj5;
                } else {
                    Object objOooOOo = o0000o0o2.OooOOo(o0000o0o2.OooO0o(obj6));
                    arrayList4 = arrayList10;
                    ArrayList<String> sharedElementSourceNames = oooO0OO12.f8495OooO0OO.getSharedElementSourceNames();
                    HashMap map6 = map5;
                    ArrayList<String> sharedElementSourceNames2 = oooO0OO11.f8495OooO0OO.getSharedElementSourceNames();
                    View view8 = view6;
                    ArrayList<String> sharedElementTargetNames = oooO0OO11.f8495OooO0OO.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    int i3 = 0;
                    while (i3 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i3));
                        ArrayList<String> arrayList15 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i3));
                        }
                        i3++;
                        sharedElementTargetNames = arrayList15;
                    }
                    ArrayList<String> sharedElementTargetNames2 = oooO0OO12.f8495OooO0OO.getSharedElementTargetNames();
                    if (z5) {
                        oooO0OO11.f8495OooO0OO.getEnterTransitionCallback();
                        oooO0OO12.f8495OooO0OO.getExitTransitionCallback();
                    } else {
                        oooO0OO11.f8495OooO0OO.getExitTransitionCallback();
                        oooO0OO12.f8495OooO0OO.getEnterTransitionCallback();
                    }
                    int i4 = 0;
                    for (int size = sharedElementSourceNames.size(); i4 < size; size = size) {
                        oooo1.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                        i4++;
                    }
                    if (FragmentManager.Oooo0oO(2)) {
                        Log.v(str10, ">>> entering view names <<<");
                        for (Iterator<String> it4 = sharedElementTargetNames2.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v(str10, "Name: " + it4.next());
                        }
                        Log.v(str10, ">>> exiting view names <<<");
                        for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                            Log.v(str10, "Name: " + it5.next());
                        }
                    }
                    p021OooOooo.Oooo0<String, View> oooo2 = new p021OooOooo.Oooo0<>();
                    OooOO0O(oooo2, oooO0OO11.f8495OooO0OO.mView);
                    oooo2.OooOOO(sharedElementSourceNames);
                    oooo1.OooOOO(oooo2.keySet());
                    p021OooOooo.Oooo0<String, View> oooo3 = new p021OooOooo.Oooo0<>();
                    OooOO0O(oooo3, oooO0OO12.f8495OooO0OO.mView);
                    oooo3.OooOOO(sharedElementTargetNames2);
                    oooo3.OooOOO(oooo1.values());
                    o0000 o0000Var = o0000Ooo.f8480OooO00o;
                    int i5 = oooo1.f421Oooo0oo - 1;
                    while (i5 >= 0) {
                        String str11 = str10;
                        if (!oooo3.containsKey((String) oooo1.OooOOO0(i5))) {
                            oooo1.OooOO0O(i5);
                        }
                        i5--;
                        str10 = str11;
                    }
                    str6 = str10;
                    OooOO0o(oooo2, oooo1.keySet());
                    OooOO0o(oooo3, oooo1.values());
                    if (oooo1.isEmpty()) {
                        arrayList12.clear();
                        arrayList13.clear();
                        obj3 = null;
                        arrayList5 = arrayList13;
                        rect = rect3;
                        map4 = map6;
                        view2 = view8;
                    } else {
                        Fragment fragment4 = oooO0OO12.f8495OooO0OO;
                        Fragment fragment5 = oooO0OO11.f8495OooO0OO;
                        o0000 o0000Var2 = o0000Ooo.f8480OooO00o;
                        if (z5) {
                            fragment5.getEnterTransitionCallback();
                        } else {
                            fragment4.getEnterTransitionCallback();
                        }
                        o000O0O0.o0OOO0o.OooO00o(this.f8485OooO00o, new OooOO0O(oooO0OO8, oooO0OO7, z5, oooo3));
                        arrayList12.addAll(oooo2.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            obj3 = objOooOOo;
                            i = 0;
                            z2 = false;
                            view3 = view7;
                        } else {
                            i = 0;
                            String str12 = sharedElementSourceNames.get(0);
                            z2 = false;
                            view3 = (View) oooo2.getOrDefault(str12, null);
                            obj3 = objOooOOo;
                            o0000o0o2.OooOOO(obj3, view3);
                        }
                        arrayList13.addAll(oooo3.values());
                        if (sharedElementTargetNames2.isEmpty() || (view4 = (View) oooo3.getOrDefault(sharedElementTargetNames2.get(i), z2)) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            o000O0O0.o0OOO0o.OooO00o(this.f8485OooO00o, new OooOOO0(o0000o0o2, view4, rect));
                            z6 = true;
                        }
                        view2 = view8;
                        o0000o0o2.OooOOOo(obj3, view2, arrayList12);
                        ArrayList<View> arrayList16 = arrayList13;
                        o0000o0o2.OooOO0o(obj3, null, null, obj3, arrayList16);
                        Boolean bool = Boolean.TRUE;
                        map4 = map6;
                        map4.put(oooO0OO7, bool);
                        map4.put(oooO0OO8, bool);
                        view7 = view3;
                        oooO0OO11 = oooO0OO7;
                        arrayList5 = arrayList16;
                        oooO0OO12 = oooO0OO8;
                    }
                }
                arrayList12 = arrayList12;
                arrayList13 = arrayList5;
                oooo1 = oooo1;
                obj4 = obj3;
                str10 = str6;
                z5 = z;
                view6 = view2;
                map5 = map4;
                rect2 = rect;
                arrayList10 = arrayList4;
            }
            Object obj7 = obj4;
            String str13 = str10;
            ArrayList<OooO> arrayList17 = arrayList10;
            p021OooOooo.Oooo0 oooo4 = oooo1;
            ArrayList<View> arrayList18 = arrayList12;
            Rect rect4 = rect2;
            HashMap map7 = map5;
            View view9 = view6;
            ArrayList<View> arrayList19 = arrayList13;
            ArrayList arrayList20 = new ArrayList();
            Object obj8 = null;
            Object objOooOO1 = null;
            for (OooO oooO4 : arrayList17) {
                if (oooO4.OooO0O0()) {
                    map7.put(oooO4.f8382OooO00o, Boolean.FALSE);
                    oooO4.OooO00o();
                    obj8 = obj8;
                    objOooOO1 = objOooOO1;
                } else {
                    Object obj9 = obj8;
                    Object obj10 = objOooOO1;
                    Object objOooO0o = o0000o0o2.OooO0o(oooO4.f8372OooO0OO);
                    o000O0o.OooO0OO oooO0OO13 = oooO4.f8382OooO00o;
                    boolean z7 = obj7 != null && (oooO0OO13 == oooO0OO11 || oooO0OO13 == oooO0OO12);
                    if (objOooO0o == null) {
                        if (!z7) {
                            map7.put(oooO0OO13, Boolean.FALSE);
                            oooO4.OooO00o();
                        }
                        objOooOO0 = obj9;
                        oooo0 = oooo4;
                        map3 = map7;
                        objOooOO1 = obj10;
                        view = view7;
                        arrayList3 = arrayList14;
                    } else {
                        oooo0 = oooo4;
                        ArrayList<View> arrayList21 = new ArrayList<>();
                        OooOO0(arrayList21, oooO0OO13.f8495OooO0OO.mView);
                        if (z7) {
                            if (oooO0OO13 == oooO0OO11) {
                                arrayList21.removeAll(arrayList18);
                            } else {
                                arrayList21.removeAll(arrayList19);
                            }
                        }
                        if (arrayList21.isEmpty()) {
                            o0000o0o2.OooO00o(objOooO0o, view9);
                            obj = obj9;
                            oooO0OO3 = oooO0OO13;
                            map2 = map7;
                            obj2 = obj10;
                            oooO = oooO4;
                        } else {
                            o0000o0o2.OooO0O0(objOooO0o, arrayList21);
                            oooO = oooO4;
                            obj = obj9;
                            obj2 = obj10;
                            map2 = map7;
                            o0000o0o2.OooOO0o(objOooO0o, objOooO0o, arrayList21, null, null);
                            oooO0OO3 = oooO0OO13;
                            if (oooO0OO3.f8493OooO00o == 3) {
                                arrayList3 = arrayList14;
                                arrayList3.remove(oooO0OO3);
                                ArrayList<View> arrayList22 = new ArrayList<>(arrayList21);
                                arrayList22.remove(oooO0OO3.f8495OooO0OO.mView);
                                objOooO0o = objOooO0o;
                                o0000o0o2.OooOO0O(objOooO0o, oooO0OO3.f8495OooO0OO.mView, arrayList22);
                                o000O0O0.o0OOO0o.OooO00o(this.f8485OooO00o, new OooOOO(arrayList21));
                            } else {
                                objOooO0o = objOooO0o;
                            }
                            if (oooO0OO3.f8493OooO00o == 2) {
                                arrayList20.addAll(arrayList21);
                                if (z6) {
                                    o0000o0o2.OooOOO0(objOooO0o, rect4);
                                }
                                view = view7;
                            } else {
                                view = view7;
                                o0000o0o2.OooOOO(objOooO0o, view);
                            }
                            map3 = map2;
                            map3.put(oooO0OO3, Boolean.TRUE);
                            if (oooO.f8373OooO0Oo) {
                                objOooOO0 = o0000o0o2.OooOO0(obj, objOooO0o);
                                objOooOO1 = obj2;
                            } else {
                                objOooOO0 = obj;
                                objOooOO1 = o0000o0o2.OooOO0(obj2, objOooO0o);
                            }
                        }
                        arrayList3 = arrayList14;
                        if (oooO0OO3.f8493OooO00o == 2) {
                            arrayList20.addAll(arrayList21);
                            if (z6) {
                                o0000o0o2.OooOOO0(objOooO0o, rect4);
                            }
                            view = view7;
                        } else {
                            view = view7;
                            o0000o0o2.OooOOO(objOooO0o, view);
                        }
                        map3 = map2;
                        map3.put(oooO0OO3, Boolean.TRUE);
                        if (oooO.f8373OooO0Oo) {
                            objOooOO0 = o0000o0o2.OooOO0(obj, objOooO0o);
                            objOooOO1 = obj2;
                        } else {
                            objOooOO0 = obj;
                            objOooOO1 = o0000o0o2.OooOO0(obj2, objOooO0o);
                        }
                    }
                    view7 = view;
                    arrayList14 = arrayList3;
                    map7 = map3;
                    oooo4 = oooo0;
                    obj8 = objOooOO0;
                    oooO0OO11 = oooO0OO7;
                    oooO0OO12 = oooO0OO8;
                }
            }
            p021OooOooo.o00oO0o o00oo0o2 = oooo4;
            map = map7;
            arrayList11 = arrayList14;
            Object objOooO = o0000o0o2.OooO(obj8, objOooOO1, obj7);
            if (objOooO != null) {
                Iterator it6 = arrayList17.iterator();
                while (it6.hasNext()) {
                    OooO oooO5 = (OooO) it6.next();
                    if (!oooO5.OooO0O0()) {
                        Object obj11 = oooO5.f8372OooO0OO;
                        o000O0o.OooO0OO oooO0OO14 = oooO5.f8382OooO00o;
                        boolean z8 = obj7 != null && (oooO0OO14 == oooO0OO7 || oooO0OO14 == oooO0OO8);
                        if (obj11 != null || z8) {
                            ViewGroup viewGroup2 = this.f8485OooO00o;
                            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                            if (ViewCompat.OooOO0O.OooO0OO(viewGroup2)) {
                                str5 = str13;
                                Fragment fragment6 = oooO5.f8382OooO00o.f8495OooO0OO;
                                o0000o0o2.OooOOOO(objOooO, oooO5.f8383OooO0O0, new OooOOOO(oooO5, oooO0OO14));
                            } else {
                                if (FragmentManager.Oooo0oO(2)) {
                                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("SpecialEffectsController: Container ");
                                    sbOooO0o2.append(this.f8485OooO00o);
                                    sbOooO0o2.append(" has not been laid out. Completing operation ");
                                    sbOooO0o2.append(oooO0OO14);
                                    str5 = str13;
                                    Log.v(str5, sbOooO0o2.toString());
                                } else {
                                    str5 = str13;
                                }
                                oooO5.OooO00o();
                            }
                        } else {
                            str5 = str13;
                        }
                        it6 = it6;
                        str13 = str5;
                    }
                }
                str2 = str13;
                ViewGroup viewGroup3 = this.f8485OooO00o;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooOO0O.OooO0OO(viewGroup3)) {
                    o0000Ooo.OooO00o(arrayList20, 4);
                    ArrayList arrayList23 = new ArrayList();
                    int i6 = 0;
                    for (int size2 = arrayList19.size(); i6 < size2; size2 = size2) {
                        View view10 = arrayList19.get(i6);
                        WeakHashMap<View, o000O0O0.o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                        arrayList23.add(ViewCompat.OooOOO.OooOO0O(view10));
                        ViewCompat.OooOOO.OooOo0O(view10, null);
                        i6++;
                    }
                    if (FragmentManager.Oooo0oO(2)) {
                        Log.v(str2, ">>>>> Beginning transition <<<<<");
                        Log.v(str2, ">>>>> SharedElementFirstOutViews <<<<<");
                        Iterator<View> it7 = arrayList18.iterator();
                        while (true) {
                            oooO0OO = oooO0OO8;
                            if (!it7.hasNext()) {
                                break;
                            }
                            View next = it7.next();
                            Log.v(str2, "View: " + next + " Name: " + ViewCompat.OooOOO.OooOO0O(next));
                            it7 = it7;
                            oooO0OO8 = oooO0OO;
                        }
                        Log.v(str2, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator<View> it8 = arrayList19.iterator(); it8.hasNext(); it8 = it8) {
                            View next2 = it8.next();
                            Log.v(str2, "View: " + next2 + " Name: " + ViewCompat.OooOOO.OooOO0O(next2));
                        }
                    } else {
                        oooO0OO = oooO0OO8;
                    }
                    o0000o0o2.OooO0OO(this.f8485OooO00o, objOooO);
                    ViewGroup viewGroup4 = this.f8485OooO00o;
                    int size3 = arrayList19.size();
                    ArrayList arrayList24 = new ArrayList();
                    int i7 = 0;
                    while (i7 < size3) {
                        View view11 = arrayList18.get(i7);
                        WeakHashMap<View, o000O0O0.o00000O> weakHashMap4 = ViewCompat.f7870OooO00o;
                        o000O0o.OooO0OO oooO0OO15 = oooO0OO7;
                        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view11);
                        arrayList24.add(strOooOO0O);
                        ArrayList arrayList25 = arrayList11;
                        if (strOooOO0O == null) {
                            str4 = str2;
                        } else {
                            ViewCompat.OooOOO.OooOo0O(view11, null);
                            String str14 = (String) o00oo0o2.getOrDefault(strOooOO0O, null);
                            int i8 = 0;
                            while (true) {
                                str4 = str2;
                                if (i8 >= size3) {
                                    break;
                                }
                                if (str14.equals(arrayList23.get(i8))) {
                                    ViewCompat.OooOOO.OooOo0O(arrayList19.get(i8), strOooOO0O);
                                    break;
                                } else {
                                    i8++;
                                    str2 = str4;
                                }
                            }
                        }
                        i7++;
                        oooO0OO7 = oooO0OO15;
                        arrayList11 = arrayList25;
                        str2 = str4;
                    }
                    oooO0OO2 = oooO0OO7;
                    arrayList2 = arrayList11;
                    str3 = str2;
                    o000O0O0.o0OOO0o.OooO00o(viewGroup4, new o0000O0(size3, arrayList19, arrayList23, arrayList18, arrayList24));
                    o0000Ooo.OooO00o(arrayList20, 0);
                    o0000o0o2.OooOOo0(obj7, arrayList18, arrayList19);
                }
                zContainsValue = map.containsValue(Boolean.TRUE);
                viewGroup = this.f8485OooO00o;
                context = viewGroup.getContext();
                arrayList6 = new ArrayList();
                it = arrayList.iterator();
                z3 = false;
                while (it.hasNext()) {
                    oooO0OO5 = (OooO0OO) it.next();
                    if (oooO0OO5.OooO0O0()) {
                        oooO0OO5.OooO00o();
                    } else {
                        oooO00oOooO0OO = oooO0OO5.OooO0OO(context);
                        if (oooO00oOooO0OO == null) {
                            oooO0OO5.OooO00o();
                        } else {
                            animator = oooO00oOooO0OO.f8517OooO0O0;
                            if (animator == null) {
                                arrayList6.add(oooO0OO5);
                            } else {
                                oooO0OO6 = oooO0OO5.f8382OooO00o;
                                fragment2 = oooO0OO6.f8495OooO0OO;
                                if (Boolean.TRUE.equals(map.get(oooO0OO6))) {
                                    if (FragmentManager.Oooo0oO(2)) {
                                        str8 = str3;
                                        Log.v(str8, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                                    } else {
                                        str8 = str3;
                                    }
                                    oooO0OO5.OooO00o();
                                    str3 = str8;
                                } else {
                                    str9 = str3;
                                    if (oooO0OO6.f8493OooO00o == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        arrayList7 = arrayList2;
                                        arrayList7.remove(oooO0OO6);
                                    } else {
                                        arrayList7 = arrayList2;
                                    }
                                    View view12 = fragment2.mView;
                                    viewGroup.startViewTransition(view12);
                                    ArrayList arrayList26 = arrayList7;
                                    Iterator it9 = it;
                                    animator.addListener(new androidx.fragment.app.OooO0OO(viewGroup, view12, z4, oooO0OO6, oooO0OO5));
                                    animator.setTarget(view12);
                                    animator.start();
                                    if (FragmentManager.Oooo0oO(2)) {
                                        Log.v(str9, "Animator from operation " + oooO0OO6 + " has started.");
                                    }
                                    oooO0OO5.f8383OooO0O0.OooO0O0(new androidx.fragment.app.OooO0o(animator, oooO0OO6));
                                    z3 = true;
                                    str3 = str9;
                                    arrayList2 = arrayList26;
                                    it = it9;
                                }
                            }
                        }
                    }
                    str8 = str3;
                    str3 = str8;
                }
                ArrayList<o000O0o.OooO0OO> arrayList27 = arrayList2;
                str7 = str3;
                for (OooO0OO oooO0OO16 : arrayList6) {
                    oooO0OO4 = oooO0OO16.f8382OooO00o;
                    fragment = oooO0OO4.f8495OooO0OO;
                    if (zContainsValue) {
                        if (FragmentManager.Oooo0oO(2)) {
                            Log.v(str7, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                        }
                        oooO0OO16.OooO00o();
                    } else if (z3) {
                        if (FragmentManager.Oooo0oO(2)) {
                            Log.v(str7, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                        }
                        oooO0OO16.OooO00o();
                    } else {
                        view5 = fragment.mView;
                        o0OoOo0.OooO00o oooO00oOooO0OO2 = oooO0OO16.OooO0OO(context);
                        Objects.requireNonNull(oooO00oOooO0OO2);
                        animation = oooO00oOooO0OO2.f8516OooO00o;
                        Objects.requireNonNull(animation);
                        if (oooO0OO4.f8493OooO00o != 1) {
                            view5.startAnimation(animation);
                            oooO0OO16.OooO00o();
                        } else {
                            viewGroup.startViewTransition(view5);
                            o0OoOo0.OooO0O0 oooO0O0 = new o0OoOo0.OooO0O0(animation, viewGroup, view5);
                            oooO0O0.setAnimationListener(new androidx.fragment.app.OooO(oooO0OO4, viewGroup, view5, oooO0OO16));
                            view5.startAnimation(oooO0O0);
                            if (FragmentManager.Oooo0oO(2)) {
                                Log.v(str7, "Animation from operation " + oooO0OO4 + " has started.");
                            }
                        }
                        oooO0OO16.f8383OooO0O0.OooO0O0(new OooOO0(view5, viewGroup, oooO0OO16, oooO0OO4));
                    }
                }
                for (o000O0o.OooO0OO oooO0OO17 : arrayList27) {
                    p016OooOoO0.OooOo00.OooO00o(oooO0OO17.f8493OooO00o, oooO0OO17.f8495OooO0OO.mView);
                }
                arrayList27.clear();
                if (FragmentManager.Oooo0oO(2)) {
                    Log.v(str7, "Completed executing operations from " + oooO0OO2 + str + oooO0OO);
                }
            }
            str2 = str13;
        }
        oooO0OO2 = oooO0OO7;
        oooO0OO = oooO0OO8;
        arrayList2 = arrayList11;
        str3 = str2;
        zContainsValue = map.containsValue(Boolean.TRUE);
        viewGroup = this.f8485OooO00o;
        context = viewGroup.getContext();
        arrayList6 = new ArrayList();
        it = arrayList.iterator();
        z3 = false;
        while (it.hasNext()) {
            oooO0OO5 = (OooO0OO) it.next();
            if (oooO0OO5.OooO0O0()) {
                oooO0OO5.OooO00o();
            } else {
                oooO00oOooO0OO = oooO0OO5.OooO0OO(context);
                if (oooO00oOooO0OO == null) {
                    oooO0OO5.OooO00o();
                } else {
                    animator = oooO00oOooO0OO.f8517OooO0O0;
                    if (animator == null) {
                        arrayList6.add(oooO0OO5);
                    } else {
                        oooO0OO6 = oooO0OO5.f8382OooO00o;
                        fragment2 = oooO0OO6.f8495OooO0OO;
                        if (Boolean.TRUE.equals(map.get(oooO0OO6))) {
                            if (FragmentManager.Oooo0oO(2)) {
                                str8 = str3;
                                Log.v(str8, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                            } else {
                                str8 = str3;
                            }
                            oooO0OO5.OooO00o();
                            str3 = str8;
                        } else {
                            str9 = str3;
                            if (oooO0OO6.f8493OooO00o == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                arrayList7 = arrayList2;
                                arrayList7.remove(oooO0OO6);
                            } else {
                                arrayList7 = arrayList2;
                            }
                            View view13 = fragment2.mView;
                            viewGroup.startViewTransition(view13);
                            ArrayList arrayList28 = arrayList7;
                            Iterator it10 = it;
                            animator.addListener(new androidx.fragment.app.OooO0OO(viewGroup, view13, z4, oooO0OO6, oooO0OO5));
                            animator.setTarget(view13);
                            animator.start();
                            if (FragmentManager.Oooo0oO(2)) {
                                Log.v(str9, "Animator from operation " + oooO0OO6 + " has started.");
                            }
                            oooO0OO5.f8383OooO0O0.OooO0O0(new androidx.fragment.app.OooO0o(animator, oooO0OO6));
                            z3 = true;
                            str3 = str9;
                            arrayList2 = arrayList28;
                            it = it10;
                        }
                    }
                }
            }
            str8 = str3;
            str3 = str8;
        }
        ArrayList<o000O0o.OooO0OO> arrayList29 = arrayList2;
        str7 = str3;
        while (r3.hasNext()) {
            oooO0OO4 = oooO0OO16.f8382OooO00o;
            fragment = oooO0OO4.f8495OooO0OO;
            if (zContainsValue) {
                if (FragmentManager.Oooo0oO(2)) {
                    Log.v(str7, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                }
                oooO0OO16.OooO00o();
            } else if (z3) {
                if (FragmentManager.Oooo0oO(2)) {
                    Log.v(str7, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                }
                oooO0OO16.OooO00o();
            } else {
                view5 = fragment.mView;
                o0OoOo0.OooO00o oooO00oOooO0OO3 = oooO0OO16.OooO0OO(context);
                Objects.requireNonNull(oooO00oOooO0OO3);
                animation = oooO00oOooO0OO3.f8516OooO00o;
                Objects.requireNonNull(animation);
                if (oooO0OO4.f8493OooO00o != 1) {
                    view5.startAnimation(animation);
                    oooO0OO16.OooO00o();
                } else {
                    viewGroup.startViewTransition(view5);
                    o0OoOo0.OooO0O0 oooO0O1 = new o0OoOo0.OooO0O0(animation, viewGroup, view5);
                    oooO0O1.setAnimationListener(new androidx.fragment.app.OooO(oooO0OO4, viewGroup, view5, oooO0OO16));
                    view5.startAnimation(oooO0O1);
                    if (FragmentManager.Oooo0oO(2)) {
                        Log.v(str7, "Animation from operation " + oooO0OO4 + " has started.");
                    }
                }
                oooO0OO16.f8383OooO0O0.OooO0O0(new OooOO0(view5, viewGroup, oooO0OO16, oooO0OO4));
            }
        }
        while (r1.hasNext()) {
            p016OooOoO0.OooOo00.OooO00o(oooO0OO17.f8493OooO00o, oooO0OO17.f8495OooO0OO.mView);
        }
        arrayList29.clear();
        if (FragmentManager.Oooo0oO(2)) {
            Log.v(str7, "Completed executing operations from " + oooO0OO2 + str + oooO0OO);
        }
    }

    public final void OooOO0(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (o000O0O0.o000000.OooO0O0(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                OooOO0(arrayList, childAt);
            }
        }
    }

    public final void OooOO0O(Map<String, View> map, @NonNull View view) {
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view);
        if (strOooOO0O != null) {
            map.put(strOooOO0O, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    OooOO0O(map, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o(@NonNull p021OooOooo.Oooo0<String, View> oooo0, @NonNull Collection<String> collection) {
        Iterator it = ((OooOooo.Oooo0.OooO00o) oooo0.entrySet()).iterator();
        while (true) {
            OooOooo.Oooo0.OooO0o oooO0o = (OooOooo.Oooo0.OooO0o) it;
            if (!oooO0o.hasNext()) {
                return;
            }
            oooO0o.next();
            View view = (View) oooO0o.getValue();
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (!collection.contains(ViewCompat.OooOOO.OooOO0O(view))) {
                oooO0o.remove();
            }
        }
    }
}
