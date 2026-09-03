package o000000;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function2<o00OOOO0.OooO0O0, Boolean, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ p036OoooOOO.o000OOo<Pair<oo000o, o0O0O00.o0000O0>> f26618Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(p036OoooOOO.o000OOo<Pair<oo000o, o0O0O00.o0000O0>> o000ooo2) {
        super(2);
        this.f26618Oooo0o = o000ooo2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(o00OOOO0.OooO0O0 oooO0O0, Boolean bool) {
        o00OOOO0.OooO0O0 mod = oooO0O0;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(mod, "mod");
        boolean z = false;
        if (zBooleanValue) {
            z = true;
        } else if (mod instanceof o0O0O00.o0000O0) {
            p036OoooOOO.o000OOo<Pair<oo000o, o0O0O00.o0000O0>> o000ooo2 = this.f26618Oooo0o;
            Pair<oo000o, o0O0O00.o0000O0> pair = null;
            if (o000ooo2 != null) {
                int i = o000ooo2.f3664Oooo0oo;
                if (i > 0) {
                    Pair<oo000o, o0O0O00.o0000O0>[] pairArr = o000ooo2.f3662Oooo0o;
                    int i2 = 0;
                    do {
                        Pair<oo000o, o0O0O00.o0000O0> pair2 = pairArr[i2];
                        if (Intrinsics.areEqual(mod, pair2.getSecond())) {
                            pair = pair2;
                            break;
                        }
                        i2++;
                    } while (i2 < i);
                }
                pair = pair;
            }
            if (pair == null) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
