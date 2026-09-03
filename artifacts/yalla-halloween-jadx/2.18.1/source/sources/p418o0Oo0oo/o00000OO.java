package p418o0Oo0oo;

import android.view.MotionEvent;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<MotionEvent, Boolean> f39681Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f39682Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000OO(Function1<? super MotionEvent, Boolean> function1, o0000O0O o0000o0o2) {
        super(3);
        this.f39681Oooo0o = function1;
        this.f39682Oooo0oO = o0000o0o2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 composed = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        ooo00o2.OooO0o0(374375707);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o00000O();
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o00000O o00000o = (o00000O) objOooO0o;
        Function1<MotionEvent, Boolean> function1 = this.f39681Oooo0o;
        Objects.requireNonNull(o00000o);
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        o00000o.f39671Oooo0o = function1;
        o0000O0O o0000o0o2 = this.f39682Oooo0oO;
        o0000O0O o0000o0o3 = o00000o.f39672Oooo0oO;
        if (o0000o0o3 != null) {
            o0000o0o3.f39687Oooo0o = null;
        }
        o00000o.f39672Oooo0oO = o0000o0o2;
        if (o0000o0o2 != null) {
            o0000o0o2.f39687Oooo0o = o00000o;
        }
        ooo00o2.Oooo0o0();
        return o00000o;
    }
}
