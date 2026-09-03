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
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000Oo;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00O0o0;
import p101o000oOoo.oOo00OO0;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f9584o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f9585o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f9586o00Ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public ArrayList<Transition> f9587o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f9588ooOO;

    public class OooO00o extends OooO {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Transition f9589Oooo0o;

        public OooO00o(Transition transition) {
            this.f9589Oooo0o = transition;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            this.f9589Oooo0o.OooOoo();
            transition.OooOoO(this);
        }
    }

    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public TransitionSet f9590Oooo0o;

        public OooO0O0(TransitionSet transitionSet) {
            this.f9590Oooo0o = transitionSet;
        }

        @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
        public final void OooO0O0(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f9590Oooo0o;
            if (transitionSet.f9585o00Oo0) {
                return;
            }
            transitionSet.Oooo0O0();
            this.f9590Oooo0o.f9585o00Oo0 = true;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f9590Oooo0o;
            int i = transitionSet.f9584o00O0O - 1;
            transitionSet.f9584o00O0O = i;
            if (i == 0) {
                transitionSet.f9585o00Oo0 = false;
                transitionSet.OooOOOo();
            }
            transition.OooOoO(this);
        }
    }

    public TransitionSet() {
        this.f9587o0OoOo0 = new ArrayList<>();
        this.f9588ooOO = true;
        this.f9585o00Oo0 = false;
        this.f9586o00Ooo = 0;
    }

    @Override // androidx.transition.Transition
    public final void OooO(oO00O0o oo00o0o) {
        super.OooO(oo00o0o);
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            this.f9587o0OoOo0.get(i).OooO(oo00o0o);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final Transition OooO0OO(@NonNull Transition.OooO0o oooO0o) {
        super.OooO0OO(oooO0o);
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final Transition OooO0Oo(@NonNull View view) {
        for (int i = 0; i < this.f9587o0OoOo0.size(); i++) {
            this.f9587o0OoOo0.get(i).OooO0Oo(view);
        }
        this.f9563OoooO0.add(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        if (OooOo0o(oo00o0o.f29743OooO0O0)) {
            for (Transition transition : this.f9587o0OoOo0) {
                if (transition.OooOo0o(oo00o0o.f29743OooO0O0)) {
                    transition.OooO0o(oo00o0o);
                    oo00o0o.f29744OooO0OO.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        if (OooOo0o(oo00o0o.f29743OooO0O0)) {
            for (Transition transition : this.f9587o0OoOo0) {
                if (transition.OooOo0o(oo00o0o.f29743OooO0O0)) {
                    transition.OooOO0(oo00o0o);
                    oo00o0o.f29744OooO0OO.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: OooOOO0 */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f9587o0OoOo0 = new ArrayList<>();
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = this.f9587o0OoOo0.get(i).clone();
            transitionSet.f9587o0OoOo0.add(transitionClone);
            transitionClone.f9566OoooOO0 = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOOOO(ViewGroup viewGroup, oOo00OO0 ooo00oo0, oOo00OO0 ooo00oo1, ArrayList<oO00O0o> arrayList, ArrayList<oO00O0o> arrayList2) {
        long j = this.f9560Oooo0oO;
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f9587o0OoOo0.get(i);
            if (j > 0 && (this.f9588ooOO || i == 0)) {
                long j2 = transition.f9560Oooo0oO;
                if (j2 > 0) {
                    transition.Oooo0(j2 + j);
                } else {
                    transition.Oooo0(j);
                }
            }
            transition.OooOOOO(viewGroup, ooo00oo0, ooo00oo1, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final Transition OooOoO(@NonNull Transition.OooO0o oooO0o) {
        super.OooOoO(oooO0o);
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOoO0(View view) {
        super.OooOoO0(view);
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            this.f9587o0OoOo0.get(i).OooOoO0(view);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final Transition OooOoOO(@NonNull View view) {
        for (int i = 0; i < this.f9587o0OoOo0.size(); i++) {
            this.f9587o0OoOo0.get(i).OooOoOO(view);
        }
        this.f9563OoooO0.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOoo() {
        if (this.f9587o0OoOo0.isEmpty()) {
            Oooo0O0();
            OooOOOo();
            return;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this);
        Iterator<Transition> it = this.f9587o0OoOo0.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO(oooO0O0);
        }
        this.f9584o00O0O = this.f9587o0OoOo0.size();
        if (this.f9588ooOO) {
            Iterator<Transition> it2 = this.f9587o0OoOo0.iterator();
            while (it2.hasNext()) {
                it2.next().OooOoo();
            }
            return;
        }
        for (int i = 1; i < this.f9587o0OoOo0.size(); i++) {
            this.f9587o0OoOo0.get(i - 1).OooO0OO(new OooO00o(this.f9587o0OoOo0.get(i)));
        }
        Transition transition = this.f9587o0OoOo0.get(0);
        if (transition != null) {
            transition.OooOoo();
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooOoo0(View view) {
        super.OooOoo0(view);
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            this.f9587o0OoOo0.get(i).OooOoo0(view);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final /* bridge */ /* synthetic */ Transition OooOooO(long j) {
        Oooo0oO(j);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void OooOooo(Transition.OooO0OO oooO0OO) {
        this.f9576OooooOo = oooO0OO;
        this.f9586o00Ooo |= 8;
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            this.f9587o0OoOo0.get(i).OooOooo(oooO0OO);
        }
    }

    @NonNull
    public final TransitionSet Oooo(int i) {
        if (i == 0) {
            this.f9588ooOO = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.f9588ooOO = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final Transition Oooo0(long j) {
        this.f9560Oooo0oO = j;
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final /* bridge */ /* synthetic */ Transition Oooo000(@Nullable TimeInterpolator timeInterpolator) {
        Oooo0oo(timeInterpolator);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void Oooo00O(PathMotion pathMotion) {
        super.Oooo00O(pathMotion);
        this.f9586o00Ooo |= 4;
        if (this.f9587o0OoOo0 != null) {
            for (int i = 0; i < this.f9587o0OoOo0.size(); i++) {
                this.f9587o0OoOo0.get(i).Oooo00O(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void Oooo00o(oO00O0o0 oo00o0o0) {
        this.f9575OooooOO = oo00o0o0;
        this.f9586o00Ooo |= 2;
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            this.f9587o0OoOo0.get(i).Oooo00o(oo00o0o0);
        }
    }

    @Override // androidx.transition.Transition
    public final String Oooo0OO(String str) {
        String strOooo0OO = super.Oooo0OO(str);
        for (int i = 0; i < this.f9587o0OoOo0.size(); i++) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(strOooo0OO, "\n");
            sbOooO00o.append(this.f9587o0OoOo0.get(i).Oooo0OO(str + "  "));
            strOooo0OO = sbOooO00o.toString();
        }
        return strOooo0OO;
    }

    @Nullable
    public final Transition Oooo0o(int i) {
        if (i < 0 || i >= this.f9587o0OoOo0.size()) {
            return null;
        }
        return this.f9587o0OoOo0.get(i);
    }

    @NonNull
    public final TransitionSet Oooo0o0(@NonNull Transition transition) {
        this.f9587o0OoOo0.add(transition);
        transition.f9566OoooOO0 = this;
        long j = this.f9561Oooo0oo;
        if (j >= 0) {
            transition.OooOooO(j);
        }
        if ((this.f9586o00Ooo & 1) != 0) {
            transition.Oooo000(this.f9558Oooo);
        }
        if ((this.f9586o00Ooo & 2) != 0) {
            transition.Oooo00o(this.f9575OooooOO);
        }
        if ((this.f9586o00Ooo & 4) != 0) {
            transition.Oooo00O(this.f9577Oooooo0);
        }
        if ((this.f9586o00Ooo & 8) != 0) {
            transition.OooOooo(this.f9576OooooOo);
        }
        return this;
    }

    @NonNull
    public final TransitionSet Oooo0oO(long j) {
        ArrayList<Transition> arrayList;
        this.f9561Oooo0oo = j;
        if (j >= 0 && (arrayList = this.f9587o0OoOo0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f9587o0OoOo0.get(i).OooOooO(j);
            }
        }
        return this;
    }

    @NonNull
    public final TransitionSet Oooo0oo(@Nullable TimeInterpolator timeInterpolator) {
        this.f9586o00Ooo |= 1;
        ArrayList<Transition> arrayList = this.f9587o0OoOo0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f9587o0OoOo0.get(i).Oooo000(timeInterpolator);
            }
        }
        this.f9558Oooo = timeInterpolator;
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void cancel() {
        super.cancel();
        int size = this.f9587o0OoOo0.size();
        for (int i = 0; i < size; i++) {
            this.f9587o0OoOo0.get(i).cancel();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9587o0OoOo0 = new ArrayList<>();
        this.f9588ooOO = true;
        this.f9585o00Oo0 = false;
        this.f9586o00Ooo = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29737OooO0oO);
        Oooo(o00oO0o.OooO0o(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
