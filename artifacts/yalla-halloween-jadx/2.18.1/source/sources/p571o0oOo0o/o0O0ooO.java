package p571o0oOo0o;

import android.webkit.WebView;
import androidx.activity.OooOOOO;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p010OooOOo0.OooO;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o0O0OO0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p325o0O0oo0o.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45607Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f45608Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f45609Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f45610Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f45611OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f45612OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f45613OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O0ooO(OooOOOO oooOOOO, o000O0O0 o000o0o1, o00OOOO0 o00oooo1, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0, LifecycleOwner lifecycleOwner) {
        super(2);
        this.f45608Oooo0o = oooOOOO;
        this.f45609Oooo0oO = o000o0o1;
        this.f45610Oooo0oo = o00oooo1;
        this.f45607Oooo = i;
        this.f45612OoooO00 = function1;
        this.f45611OoooO0 = function0;
        this.f45613OoooO0O = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            OooO oooO = OooO.f182OooO00o;
            OooOOOO dispatcherOwner = this.f45608Oooo0o;
            Intrinsics.checkNotNull(dispatcherOwner);
            Intrinsics.checkNotNullParameter(dispatcherOwner, "dispatcherOwner");
            o00OO0O0.OooO00o(new o0O0OO0[]{OooO.f183OooO0O0.OooO0O0(dispatcherOwner)}, o00O0000.OooO00o(ooo00o2, -145910282, new o00O0000(this.f45609Oooo0oO, this.f45610Oooo0oo, this.f45607Oooo, this.f45612OoooO00, this.f45611OoooO0, this.f45613OoooO0O)), ooo00o2, 56);
        }
        return Unit.INSTANCE;
    }
}
