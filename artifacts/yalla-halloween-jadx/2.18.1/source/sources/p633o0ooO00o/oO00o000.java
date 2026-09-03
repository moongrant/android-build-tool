package p633o0ooO00o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o000 extends Lambda implements Function0<oOo0000O> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO00o00 f48831Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(oO00o00 oo00o00) {
        super(0);
        this.f48831Oooo0o = oo00o00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final oOo0000O invoke() {
        Sequence<oOo0000O> sequenceOooOO0O = this.f48831Oooo0o.OooOO0O();
        oO00o00 oo00o00 = this.f48831Oooo0o;
        oOo0000O ooo0000o = null;
        for (oOo0000O ooo0000o2 : sequenceOooOO0O) {
            oOo0000O ooo0000o3 = ooo0000o2;
            if (ooo0000o3.OooO0O0() <= oo00o00.f48827OooO0O0.invoke(oo00o00, ooo0000o3).intValue()) {
                ooo0000o = ooo0000o2;
            }
        }
        return ooo0000o;
    }
}
