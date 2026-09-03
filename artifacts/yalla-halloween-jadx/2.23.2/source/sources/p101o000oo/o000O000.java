package p101o000oo;

import androidx.paging.LoadType;
import androidx.paging.OooOOO;
import androidx.paging.OooOOO0;
import androidx.paging.OooOo00;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 extends Lambda implements Function1<oo0o0Oo, oo0o0Oo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f35447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f35448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LoadType f35449OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f35450OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(LoadType loadType, OooOo00 oooOo00) {
        super(1);
        OooOOO0.OooO0OO oooO0OO = OooOOO0.OooO0OO.f10261OooO0OO;
        this.f35447OooO0Oo = false;
        this.f35449OooO0o0 = loadType;
        this.f35448OooO0o = oooO0OO;
        this.f35450OooO0oO = oooOo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final oo0o0Oo invoke(oo0o0Oo oo0o0oo) {
        OooOOO oooOOOOooO0O0;
        OooOOO oooOOOOooO0O1;
        oo0o0Oo oo0o0oo2 = oo0o0oo;
        if (oo0o0oo2 == null || (oooOOOOooO0O0 = oo0o0oo2.f35621OooO0Oo) == null) {
            oooOOOOooO0O0 = OooOOO.f10253OooO0Oo;
        }
        if (oo0o0oo2 == null || (oooOOOOooO0O1 = oo0o0oo2.f35622OooO0o0) == null) {
            oooOOOOooO0O1 = OooOOO.f10253OooO0Oo;
        }
        boolean z = this.f35447OooO0Oo;
        OooOOO0 oooOOO0 = this.f35448OooO0o;
        LoadType loadType = this.f35449OooO0o0;
        if (z) {
            oooOOOOooO0O1 = oooOOOOooO0O1.OooO0O0(loadType, oooOOO0);
        } else {
            oooOOOOooO0O0 = oooOOOOooO0O0.OooO0O0(loadType, oooOOO0);
        }
        return OooOo00.OooO00o(this.f35450OooO0oO, oo0o0oo2, oooOOOOooO0O0, oooOOOOooO0O1);
    }
}
