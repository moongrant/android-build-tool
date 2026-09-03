package p025Oooo0O0;

import Oooo0.oo0oOO0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<o000OO00> f1522Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(oO0Oo<o000OO00> oo0oo) {
        super(0);
        this.f1522Oooo0o = oo0oo;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        o000OO00 value = this.f1522Oooo0o.getValue();
        if (!value.f1552OooO0Oo.OooO00o()) {
            oo0oOO0 oo0ooo0 = value.f1553OooO0o;
            z = oo0ooo0 != null ? oo0ooo0.OooO0o0() : false;
        }
        return Boolean.valueOf(z);
    }
}
