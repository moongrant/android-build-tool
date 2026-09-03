package p646o0ooOoo;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p634o0ooO0oO.o00OO0OO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0OOo0o extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000OOo f59651OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(oO000OOo oo000ooo) {
        super(0);
        this.f59651OooO0Oo = oo000ooo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        o00OO0OO o00oo0oo = this.f59651OooO0Oo.f59621OooO0o0;
        Intrinsics.checkNotNull(o00oo0oo);
        List<Certificate> listOooO00o = o00oo0oo.OooO00o();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOooO00o, 10));
        Iterator<T> it = listOooO00o.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
