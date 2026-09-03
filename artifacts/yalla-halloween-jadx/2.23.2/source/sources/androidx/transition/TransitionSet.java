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
import oOO00O.o00Ooo;
import oOO00O.o00oO0o;
import oOO00O.o0OoOo0;
import oOO00O.o0ooOOo;
import p037OoooOo0.o000O0o;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionSet extends Transition {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f11326OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ArrayList<Transition> f11327OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f11328OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f11329OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f11330Oooo000;

    public class OooO00o extends OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Transition f11331OooO0Oo;

        public OooO00o(Transition transition) {
            this.f11331OooO0Oo = transition;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            this.f11331OooO0Oo.OooOoOO();
            transition.OooOo(this);
        }
    }

    public static class OooO0O0 extends OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TransitionSet f11332OooO0Oo;

        public OooO0O0(TransitionSet transitionSet) {
            this.f11332OooO0Oo = transitionSet;
        }

        @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f11332OooO0Oo;
            if (transitionSet.f11329OooOooo) {
                return;
            }
            transitionSet.Oooo0();
            transitionSet.f11329OooOooo = true;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f11332OooO0Oo;
            int i = transitionSet.f11328OooOooO - 1;
            transitionSet.f11328OooOooO = i;
            if (i == 0) {
                transitionSet.f11329OooOooo = false;
                transitionSet.OooOOOO();
            }
            transition.OooOo(this);
        }
    }

    public TransitionSet() {
        this.f11327OooOoo0 = new ArrayList<>();
        this.f11326OooOoo = true;
        this.f11329OooOooo = false;
        this.f11330Oooo000 = 0;
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00oO0o o00oo0o2) {
        View view = o00oo0o2.f60158OooO0O0;
        if (OooOo0(view)) {
            for (Transition transition : this.f11327OooOoo0) {
                if (transition.OooOo0(view)) {
                    transition.OooO(o00oo0o2);
                    o00oo0o2.f60159OooO0OO.add(transition);
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
        for (int i = 0; i < this.f11327OooOoo0.size(); i++) {
            this.f11327OooOoo0.get(i).OooO0Oo(view);
        }
        this.f11300OooO.add(view);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00oO0o o00oo0o2) {
        View view = o00oo0o2.f60158OooO0O0;
        if (OooOo0(view)) {
            for (Transition transition : this.f11327OooOoo0) {
                if (transition.OooOo0(view)) {
                    transition.OooO0o(o00oo0o2);
                    o00oo0o2.f60159OooO0OO.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void OooO0oo(o00oO0o o00oo0o2) {
        super.OooO0oo(o00oo0o2);
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f11327OooOoo0.get(i).OooO0oo(o00oo0o2);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: OooOO0o */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f11327OooOoo0 = new ArrayList<>();
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = this.f11327OooOoo0.get(i).clone();
            transitionSet.f11327OooOoo0.add(transitionClone);
            transitionClone.f11308OooOO0o = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOOO(ViewGroup viewGroup, o0ooOOo o0ooooo, o0ooOOo o0ooooo2, ArrayList<o00oO0o> arrayList, ArrayList<o00oO0o> arrayList2) {
        long j = this.f11303OooO0o0;
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f11327OooOoo0.get(i);
            if (j > 0 && (this.f11326OooOoo || i == 0)) {
                long j2 = transition.f11303OooO0o0;
                if (j2 > 0) {
                    transition.Oooo00o(j2 + j);
                } else {
                    transition.Oooo00o(j);
                }
            }
            transition.OooOOO(viewGroup, o0ooooo, o0ooooo2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void OooOo(@NonNull Transition.OooO0o oooO0o) {
        super.OooOo(oooO0o);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOo0o(View view) {
        super.OooOo0o(view);
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f11327OooOoo0.get(i).OooOo0o(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOoO(ViewGroup viewGroup) {
        super.OooOoO(viewGroup);
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f11327OooOoo0.get(i).OooOoO(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void OooOoO0(@NonNull View view) {
        for (int i = 0; i < this.f11327OooOoo0.size(); i++) {
            this.f11327OooOoo0.get(i).OooOoO0(view);
        }
        this.f11300OooO.remove(view);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOoOO() {
        if (this.f11327OooOoo0.isEmpty()) {
            Oooo0();
            OooOOOO();
            return;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this);
        Iterator<Transition> it = this.f11327OooOoo0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(oooO0O0);
        }
        this.f11328OooOooO = this.f11327OooOoo0.size();
        if (this.f11326OooOoo) {
            Iterator<Transition> it2 = this.f11327OooOoo0.iterator();
            while (it2.hasNext()) {
                it2.next().OooOoOO();
            }
            return;
        }
        for (int i = 1; i < this.f11327OooOoo0.size(); i++) {
            this.f11327OooOoo0.get(i - 1).OooO0O0(new OooO00o(this.f11327OooOoo0.get(i)));
        }
        Transition transition = this.f11327OooOoo0.get(0);
        if (transition != null) {
            transition.OooOoOO();
        }
    }

    @Override // androidx.transition.Transition
    public final void OooOoo(Transition.OooO0OO oooO0OO) {
        this.f11320OooOo0o = oooO0OO;
        this.f11330Oooo000 |= 8;
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f11327OooOoo0.get(i).OooOoo(oooO0OO);
        }
    }

    @Override // androidx.transition.Transition
    public final void Oooo000(PathMotion pathMotion) {
        super.Oooo000(pathMotion);
        this.f11330Oooo000 |= 4;
        if (this.f11327OooOoo0 != null) {
            for (int i = 0; i < this.f11327OooOoo0.size(); i++) {
                this.f11327OooOoo0.get(i).Oooo000(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void Oooo00O(o00Ooo o00ooo2) {
        this.f11319OooOo0O = o00ooo2;
        this.f11330Oooo000 |= 2;
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f11327OooOoo0.get(i).Oooo00O(o00ooo2);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final void Oooo00o(long j) {
        this.f11303OooO0o0 = j;
    }

    @Override // androidx.transition.Transition
    public final String Oooo0O0(String str) {
        String strOooo0O0 = super.Oooo0O0(str);
        for (int i = 0; i < this.f11327OooOoo0.size(); i++) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(strOooo0O0, "\n");
            sbOooO0O0.append(this.f11327OooOoo0.get(i).Oooo0O0(str + "  "));
            strOooo0O0 = sbOooO0O0.toString();
        }
        return strOooo0O0;
    }

    @NonNull
    public final void Oooo0OO(@NonNull Transition transition) {
        this.f11327OooOoo0.add(transition);
        transition.f11308OooOO0o = this;
        long j = this.f11302OooO0o;
        if (j >= 0) {
            transition.OooOoo0(j);
        }
        if ((this.f11330Oooo000 & 1) != 0) {
            transition.OooOooO(this.f11304OooO0oO);
        }
        if ((this.f11330Oooo000 & 2) != 0) {
            transition.Oooo00O(this.f11319OooOo0O);
        }
        if ((this.f11330Oooo000 & 4) != 0) {
            transition.Oooo000(this.f11316OooOo);
        }
        if ((this.f11330Oooo000 & 8) != 0) {
            transition.OooOoo(this.f11320OooOo0o);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: Oooo0o, reason: merged with bridge method [inline-methods] */
    public final void OooOooO(@Nullable TimeInterpolator timeInterpolator) {
        this.f11330Oooo000 |= 1;
        ArrayList<Transition> arrayList = this.f11327OooOoo0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f11327OooOoo0.get(i).OooOooO(timeInterpolator);
            }
        }
        this.f11304OooO0oO = timeInterpolator;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: Oooo0o0, reason: merged with bridge method [inline-methods] */
    public final void OooOoo0(long j) {
        ArrayList<Transition> arrayList;
        this.f11302OooO0o = j;
        if (j < 0 || (arrayList = this.f11327OooOoo0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f11327OooOoo0.get(i).OooOoo0(j);
        }
    }

    @NonNull
    public final void Oooo0oO(int i) {
        if (i == 0) {
            this.f11326OooOoo = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f11326OooOoo = false;
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void cancel() {
        super.cancel();
        int size = this.f11327OooOoo0.size();
        for (int i = 0; i < size; i++) {
            this.f11327OooOoo0.get(i).cancel();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11327OooOoo0 = new ArrayList<>();
        this.f11326OooOoo = true;
        this.f11329OooOooo = false;
        this.f11330Oooo000 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60170OooO0oO);
        Oooo0oO(oo000o.OooO0o0(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
