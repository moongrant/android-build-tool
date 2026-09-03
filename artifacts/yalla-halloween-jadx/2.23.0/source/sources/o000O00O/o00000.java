package o000O00O;

import androidx.paging.LoadType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 extends Lambda implements Function1<OooOo, OooOo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f34484OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.OooOOO0 f34485OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LoadType f34486OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.OooOo00 f34487OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(LoadType loadType, androidx.paging.OooOo00 oooOo00) {
        super(1);
        androidx.paging.OooOOO0.OooO0OO oooO0OO = androidx.paging.OooOOO0.OooO0OO.f7167OooO0OO;
        this.f34484OooO0Oo = false;
        this.f34486OooO0o0 = loadType;
        this.f34485OooO0o = oooO0OO;
        this.f34487OooO0oO = oooOo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OooOo invoke(OooOo oooOo) {
        androidx.paging.OooOOO oooOOOOooO0O0;
        androidx.paging.OooOOO oooOOOOooO0O1;
        OooOo oooOo2 = oooOo;
        if (oooOo2 == null || (oooOOOOooO0O0 = oooOo2.f34458OooO0Oo) == null) {
            oooOOOOooO0O0 = androidx.paging.OooOOO.f7159OooO0Oo;
        }
        if (oooOo2 == null || (oooOOOOooO0O1 = oooOo2.f34459OooO0o0) == null) {
            oooOOOOooO0O1 = androidx.paging.OooOOO.f7159OooO0Oo;
        }
        boolean z = this.f34484OooO0Oo;
        androidx.paging.OooOOO0 oooOOO0 = this.f34485OooO0o;
        LoadType loadType = this.f34486OooO0o0;
        if (z) {
            oooOOOOooO0O1 = oooOOOOooO0O1.OooO0O0(loadType, oooOOO0);
        } else {
            oooOOOOooO0O0 = oooOOOOooO0O0.OooO0O0(loadType, oooOOO0);
        }
        return androidx.paging.OooOo00.OooO00o(this.f34487OooO0oO, oooOo2, oooOOOOooO0O0, oooOOOOooO0O1);
    }
}
