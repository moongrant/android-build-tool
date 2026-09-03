package p663o0oooO0;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p660o0ooo0o0.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f51720Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(o00OO00O o00oo00o) {
        super(0);
        this.f51720Oooo0o = o00oo00o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        oo0oOO0 oo0ooo0 = this.f51720Oooo0o.f51782OooO0Oo;
        Intrinsics.checkNotNull(oo0ooo0);
        List<Certificate> listOooO0O0 = oo0ooo0.OooO0O0();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOooO0O0, 10));
        for (Certificate certificate : listOooO0O0) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
