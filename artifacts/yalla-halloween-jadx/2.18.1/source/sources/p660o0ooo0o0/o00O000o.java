package p660o0ooo0o0;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p670o0oooOo.v;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O000 f51277Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ List f51278Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f51279Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(o00O000 o00o001, List list, String str) {
        super(0);
        this.f51277Oooo0o = o00o001;
        this.f51278Oooo0oO = list;
        this.f51279Oooo0oo = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> listOooO00o;
        v vVar = this.f51277Oooo0o.f51256OooO0O0;
        if (vVar == null || (listOooO00o = vVar.OooO00o(this.f51278Oooo0oO, this.f51279Oooo0oo)) == null) {
            listOooO00o = this.f51278Oooo0oO;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOooO00o, 10));
        for (Certificate certificate : listOooO00o) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
