package p634o0ooO0oO;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p655o0ooo0o0.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0O00 extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0 f57196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f57197OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f57198OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0O00(o00O0 o00o1, List<? extends Certificate> list, String str) {
        super(0);
        this.f57196OooO0Oo = o00o1;
        this.f57198OooO0o0 = list;
        this.f57197OooO0o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        o0000O0O o0000o0o2 = this.f57196OooO0Oo.f57139OooO0O0;
        List<Certificate> list = this.f57198OooO0o0;
        List<Certificate> listOooO00o = o0000o0o2 == null ? null : o0000o0o2.OooO00o(this.f57197OooO0o, list);
        if (listOooO00o != null) {
            list = listOooO00o;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
