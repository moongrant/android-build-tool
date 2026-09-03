package p053o00000oO;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends Lambda implements Function1<o000Oo0, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000000O f27113Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o000000O o000000o2) {
        super(1);
        this.f27113Oooo0o = o000000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(o000Oo0 o000oo1) {
        o000Oo0 it = o000oo1;
        Intrinsics.checkNotNullParameter(it, "it");
        o000000O o000000o2 = this.f27113Oooo0o;
        o0000O00 fontWeight = it.f27147OooO0O0;
        int i = it.f27148OooO0OO;
        int i2 = it.f27149OooO0Oo;
        Object obj = it.f27150OooO0o0;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return o000000o2.OooO0O0(new o000Oo0(null, fontWeight, i, i2, obj)).getValue();
    }
}
