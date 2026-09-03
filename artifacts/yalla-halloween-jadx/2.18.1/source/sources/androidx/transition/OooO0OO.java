package androidx.transition;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends OooO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f9511Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9512Oooo0oO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9514OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f9515OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f9516OoooO0O;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f9513Oooo0oo = null;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9510Oooo = null;

    public OooO0OO(OooO0O0 oooO0O0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f9516OoooO0O = oooO0O0;
        this.f9511Oooo0o = obj;
        this.f9512Oooo0oO = arrayList;
        this.f9515OoooO00 = obj2;
        this.f9514OoooO0 = arrayList2;
    }

    @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
    public final void OooO0O0(@NonNull Transition transition) {
        Object obj = this.f9511Oooo0o;
        if (obj != null) {
            this.f9516OoooO0O.OooOo00(obj, this.f9512Oooo0oO, null);
        }
        Object obj2 = this.f9513Oooo0oo;
        if (obj2 != null) {
            this.f9516OoooO0O.OooOo00(obj2, this.f9510Oooo, null);
        }
        Object obj3 = this.f9515OoooO00;
        if (obj3 != null) {
            this.f9516OoooO0O.OooOo00(obj3, this.f9514OoooO0, null);
        }
    }

    @Override // androidx.transition.Transition.OooO0o
    public final void OooO0Oo(@NonNull Transition transition) {
        transition.OooOoO(this);
    }
}
