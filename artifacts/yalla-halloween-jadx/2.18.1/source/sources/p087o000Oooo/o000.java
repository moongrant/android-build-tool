package p087o000Oooo;

import androidx.navigation.NavBackStackEntry;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f28537OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f28538OooO0O0;

    public o000(o000O00O o000o00o2, NavBackStackEntry navBackStackEntry) {
        this.f28537OooO00o = o000o00o2;
        this.f28538OooO0O0 = navBackStackEntry;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o000O00O o000o00o2 = this.f28537OooO00o;
        NavBackStackEntry entry = this.f28538OooO0O0;
        Objects.requireNonNull(o000o00o2);
        Intrinsics.checkNotNullParameter(entry, "entry");
        o000o00o2.OooO0O0().OooO0O0(entry);
    }
}
