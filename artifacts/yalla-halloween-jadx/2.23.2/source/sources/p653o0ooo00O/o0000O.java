package p653o0ooo00O;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOO0o.o0O0000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f59303OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o0000O0O o0000o0o2) {
        super(0);
        this.f59303OooO0Oo = o0000o0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        o0O0000O o0o0000o2 = this.f59303OooO0Oo.f59349OooO0o0;
        Intrinsics.checkNotNull(o0o0000o2);
        List<Certificate> listOooO00o = o0o0000o2.OooO00o();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(listOooO00o));
        Iterator<T> it = listOooO00o.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
