package o000O00O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends Lambda implements Function1<OooOo, OooOo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.OooOo00 f34491OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.OooOOO f34492OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.OooOOO f34493OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(androidx.paging.OooOo00 oooOo00, androidx.paging.OooOOO oooOOO, androidx.paging.OooOOO oooOOO2) {
        super(1);
        this.f34491OooO0Oo = oooOo00;
        this.f34493OooO0o0 = oooOOO;
        this.f34492OooO0o = oooOOO2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OooOo invoke(OooOo oooOo) {
        androidx.paging.OooOOO oooOOO = this.f34492OooO0o;
        return androidx.paging.OooOo00.OooO00o(this.f34491OooO0Oo, oooOo, this.f34493OooO0o0, oooOOO);
    }
}
