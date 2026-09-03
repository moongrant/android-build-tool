package p571o0oOo0o;

import android.webkit.WebView;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p325o0O0oo0o.o000O00O;
import p325o0O0oo0o.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f45515Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f45516Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f45517Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f45518Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f45519OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f45520OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0000(o000O0O0 o000o0o1, o00OOOO0 o00oooo1, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0, LifecycleOwner lifecycleOwner) {
        super(2);
        this.f45516Oooo0o = o000o0o1;
        this.f45517Oooo0oO = o00oooo1;
        this.f45518Oooo0oo = i;
        this.f45515Oooo = function1;
        this.f45520OoooO00 = function0;
        this.f45519OoooO0 = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o000O0O0 o000o0o1 = this.f45516Oooo0o;
            o00OOOO0 o00oooo1 = this.f45517Oooo0oO;
            o000OO00 o000oo01 = new o000OO00(this.f45515Oooo, this.f45520OoooO00, this.f45519OoooO0);
            int i = this.f45518Oooo0oo;
            o000O00O.OooO00o(o000o0o1, o00oooo1, false, null, o000oo01, null, null, null, ooo00o2, (i & 14) | (i & 112), 236);
            o00Oo00.OooO0O0(null, o00.f45463Oooo0o, ooo00o2);
        }
        return Unit.INSTANCE;
    }
}
