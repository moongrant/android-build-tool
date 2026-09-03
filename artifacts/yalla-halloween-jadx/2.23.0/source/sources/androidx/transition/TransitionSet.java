package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import p037OoooOo0.o000Oo0;
import p058o0000Ooo.oo000o;
import p078o000Oo0O.o000000O;
import p078o000Oo0O.o00000O;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionSet extends Transition {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f8232OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ArrayList<Transition> f8233OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f8234OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f8235OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f8236Oooo000;

    public class OooO00o extends OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Transition f8237OooO0Oo;

        public OooO00o(Transition transition) {
            this.f8237OooO0Oo = transition;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            this.f8237OooO0Oo.OooOoo0();
            transition.OooOoO0(this);
        }
    }

    public static class OooO0O0 extends OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TransitionSet f8238OooO0Oo;

        public OooO0O0(TransitionSet transitionSet) {
            this.f8238OooO0Oo = transitionSet;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f8238OooO0Oo;
            if (transitionSet.f8235OooOooo) {
                return;
            }
            transitionSet.Oooo0O0();
            transitionSet.f8235OooOooo = true;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f8238OooO0Oo;
            int i = transitionSet.f8234OooOooO - 1;
            transitionSet.f8234OooOooO = i;
            if (i == 0) {
                transitionSet.f8235OooOooo = false;
                transitionSet.OooOOOO();
            }
            transition.OooOoO0(this);
        }
    }

    public TransitionSet() {
        this.f8233OooOoo0 = new ArrayList<>();
        this.f8232OooOoo = true;
        this.f8235OooOooo = false;
        this.f8236Oooo000 = 0;
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        View view = o00000o1.f34937OooO0O0;
        if (OooOo0O(view)) {
            for (Transition transition : this.f8233OooOoo0) {
                if (transition.OooOo0O(view)) {
                    transition.OooO(o00000o1);
                    o00000o1.f34938OooO0OO.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void OooO0O0(@NonNull Transition.OooO0o oooO0o) {
        super.OooO0O0(oooO0o);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void OooO0Oo(@NonNull View view) {
        for (int i = 0; i < this.f8233OooOoo0.size(); i++) {
            this.f8233OooOoo0.get(i).OooO0Oo(view);
        }
        this.f8206OooO.add(view);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        View view = o00000o1.f34937OooO0O0;
        if (OooOo0O(view)) {
            for (Transition transition : this.f8233OooOoo0) {
                if (transition.OooOo0O(view)) {
                    transition.OooO0o(o00000o1);
                    o00000o1.f34938OooO0OO.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void OooO0oo(o00000O0 o00000o1) {
        super.OooO0oo(o00000o1);
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f8233OooOoo0.get(i).OooO0oo(o00000o1);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: OooOO0o */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f8233OooOoo0 = new ArrayList<>();
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = this.f8233OooOoo0.get(i).clone();
            transitionSet.f8233OooOoo0.add(transitionClone);
            transitionClone.f8214OooOO0o = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOOO(ViewGroup viewGroup, o00000O o00000o, o00000O o00000o2, ArrayList<o00000O0> arrayList, ArrayList<o00000O0> arrayList2) {
        long j = this.f8209OooO0o0;
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f8233OooOoo0.get(i);
            if (j > 0 && (this.f8232OooOoo || i == 0)) {
                long j2 = transition.f8209OooO0o0;
                if (j2 > 0) {
                    transition.Oooo0(j2 + j);
                } else {
                    transition.Oooo0(j);
                }
            }
            transition.OooOOO(viewGroup, o00000o, o00000o2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOo(View view) {
        super.OooOo(view);
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f8233OooOoo0.get(i).OooOo(view);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void OooOoO(@NonNull View view) {
        for (int i = 0; i < this.f8233OooOoo0.size(); i++) {
            this.f8233OooOoo0.get(i).OooOoO(view);
        }
        this.f8206OooO.remove(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void OooOoO0(@NonNull Transition.OooO0o oooO0o) {
        super.OooOoO0(oooO0o);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOoOO(ViewGroup viewGroup) {
        super.OooOoOO(viewGroup);
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f8233OooOoo0.get(i).OooOoOO(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOoo0() {
        if (this.f8233OooOoo0.isEmpty()) {
            Oooo0O0();
            OooOOOO();
            return;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this);
        Iterator<Transition> it = this.f8233OooOoo0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(oooO0O0);
        }
        this.f8234OooOooO = this.f8233OooOoo0.size();
        if (this.f8232OooOoo) {
            Iterator<Transition> it2 = this.f8233OooOoo0.iterator();
            while (it2.hasNext()) {
                it2.next().OooOoo0();
            }
            return;
        }
        for (int i = 1; i < this.f8233OooOoo0.size(); i++) {
            this.f8233OooOoo0.get(i - 1).OooO0O0(new OooO00o(this.f8233OooOoo0.get(i)));
        }
        Transition transition = this.f8233OooOoo0.get(0);
        if (transition != null) {
            transition.OooOoo0();
        }
    }

    @Override // androidx.transition.Transition
    public final void OooOooo(Transition.OooO0OO oooO0OO) {
        this.f8226OooOo0o = oooO0OO;
        this.f8236Oooo000 |= 8;
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f8233OooOoo0.get(i).OooOooo(oooO0OO);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void Oooo0(long j) {
        this.f8209OooO0o0 = j;
    }

    @Override // androidx.transition.Transition
    public final void Oooo00O(PathMotion pathMotion) {
        super.Oooo00O(pathMotion);
        this.f8236Oooo000 |= 4;
        if (this.f8233OooOoo0 != null) {
            for (int i = 0; i < this.f8233OooOoo0.size(); i++) {
                this.f8233OooOoo0.get(i).Oooo00O(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void Oooo00o(o000000O o000000o2) {
        this.f8225OooOo0O = o000000o2;
        this.f8236Oooo000 |= 2;
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f8233OooOoo0.get(i).Oooo00o(o000000o2);
        }
    }

    @Override // androidx.transition.Transition
    public final String Oooo0OO(String str) {
        String strOooo0OO = super.Oooo0OO(str);
        for (int i = 0; i < this.f8233OooOoo0.size(); i++) {
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(strOooo0OO, "\n");
            sbOooO0O0.append(this.f8233OooOoo0.get(i).Oooo0OO(str + "  "));
            strOooo0OO = sbOooO0O0.toString();
        }
        return strOooo0OO;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: Oooo0o, reason: merged with bridge method [inline-methods] */
    public final void OooOoo(long j) {
        ArrayList<Transition> arrayList;
        this.f8208OooO0o = j;
        if (j < 0 || (arrayList = this.f8233OooOoo0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f8233OooOoo0.get(i).OooOoo(j);
        }
    }

    @NonNull
    public final void Oooo0o0(@NonNull Transition transition) {
        this.f8233OooOoo0.add(transition);
        transition.f8214OooOO0o = this;
        long j = this.f8208OooO0o;
        if (j >= 0) {
            transition.OooOoo(j);
        }
        if ((this.f8236Oooo000 & 1) != 0) {
            transition.Oooo000(this.f8210OooO0oO);
        }
        if ((this.f8236Oooo000 & 2) != 0) {
            transition.Oooo00o(this.f8225OooOo0O);
        }
        if ((this.f8236Oooo000 & 4) != 0) {
            transition.Oooo00O(this.f8222OooOo);
        }
        if ((this.f8236Oooo000 & 8) != 0) {
            transition.OooOooo(this.f8226OooOo0o);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: Oooo0oO, reason: merged with bridge method [inline-methods] */
    public final void Oooo000(@Nullable TimeInterpolator timeInterpolator) {
        this.f8236Oooo000 |= 1;
        ArrayList<Transition> arrayList = this.f8233OooOoo0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f8233OooOoo0.get(i).Oooo000(timeInterpolator);
            }
        }
        this.f8210OooO0oO = timeInterpolator;
    }

    @NonNull
    public final void Oooo0oo(int i) {
        if (i == 0) {
            this.f8232OooOoo = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f8232OooOoo = false;
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void cancel() {
        super.cancel();
        int size = this.f8233OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f8233OooOoo0.get(i).cancel();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8233OooOoo0 = new ArrayList<>();
        this.f8232OooOoo = true;
        this.f8235OooOooo = false;
        this.f8236Oooo000 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0O00.f34981OooO0oO);
        Oooo0oo(oo000o.OooO0o0(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
