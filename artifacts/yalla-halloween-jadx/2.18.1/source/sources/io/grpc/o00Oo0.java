package io.grpc;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements Comparator<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f26402Oooo0o;

    public o00Oo0(o00Ooo o00ooo2) {
        this.f26402Oooo0o = o00ooo2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Objects.requireNonNull((ManagedChannelProvider.OooO00o) this.f26402Oooo0o);
        int iOooO0O0 = ((ManagedChannelProvider) obj).OooO0O0();
        Objects.requireNonNull((ManagedChannelProvider.OooO00o) this.f26402Oooo0o);
        int iOooO0O1 = iOooO0O0 - ((ManagedChannelProvider) obj2).OooO0O0();
        return iOooO0O1 != 0 ? iOooO0O1 : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
