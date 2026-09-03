package androidx.transition;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11239OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f11240OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11242OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Object f11244OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f11245OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f11241OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11243OooO0oO = null;

    public OooO(OooO0o oooO0o, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f11245OooOO0 = oooO0o;
        this.f11240OooO0Oo = obj;
        this.f11242OooO0o0 = arrayList;
        this.f11244OooO0oo = obj2;
        this.f11239OooO = arrayList2;
    }

    @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
    public final void OooO0Oo(@NonNull Transition transition) {
        OooO0o oooO0o = this.f11245OooOO0;
        Object obj = this.f11240OooO0Oo;
        if (obj != null) {
            oooO0o.OooOo00(obj, this.f11242OooO0o0, null);
        }
        Object obj2 = this.f11241OooO0o;
        if (obj2 != null) {
            oooO0o.OooOo00(obj2, this.f11243OooO0oO, null);
        }
        Object obj3 = this.f11244OooO0oo;
        if (obj3 != null) {
            oooO0o.OooOo00(obj3, this.f11239OooO, null);
        }
    }

    @Override // androidx.transition.Transition.OooO0o
    public final void OooO0o0(@NonNull Transition transition) {
        transition.OooOo(this);
    }
}
