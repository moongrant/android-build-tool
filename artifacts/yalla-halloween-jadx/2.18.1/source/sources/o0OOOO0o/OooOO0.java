package o0OOOO0o;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f38235OooO0O0 = "null";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f38236OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOO0O oooOO0O, OooOO0O oooOO0O2) {
        super(oooOO0O2);
        this.f38236OooO0OO = oooOO0O;
    }

    @Override // o0OOOO0o.OooOO0O
    public final CharSequence OooO00o(@NullableDecl Object obj) {
        return obj == null ? this.f38235OooO0O0 : this.f38236OooO0OO.OooO00o(obj);
    }
}
