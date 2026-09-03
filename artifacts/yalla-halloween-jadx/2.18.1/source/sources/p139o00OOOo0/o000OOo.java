package p139o00OOOo0;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p042Ooooo0o.o000O0O0;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends Lambda implements Function1<oo0oOO0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31793Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<oo0oOO0> f31794Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f31795Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(int i, o0O00OO<oo0oOO0> o0o00oo2, int i2) {
        super(1);
        this.f31793Oooo0o = i;
        this.f31794Oooo0oO = o0o00oo2;
        this.f31795Oooo0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oo0oOO0 oo0ooo0) {
        oo0oOO0 it = oo0ooo0;
        Intrinsics.checkNotNullParameter(it, "it");
        int iOooO0OO = o000Oo0.OooO0OO(it.f27236OooO00o.f26756Oooo0o, 0);
        if (iOooO0OO < this.f31793Oooo0o) {
            o0O00OO<oo0oOO0> o0o00oo2 = this.f31794Oooo0oO;
            String strValueOf = String.valueOf(this.f31793Oooo0o);
            int length = String.valueOf(this.f31793Oooo0o).length();
            o0o00oo2.setValue(new oo0oOO0(strValueOf, o000O0O0.OooO00o(length, length), 4));
        } else if (iOooO0OO > this.f31795Oooo0oo) {
            o0O00OO<oo0oOO0> o0o00oo3 = this.f31794Oooo0oO;
            String strValueOf2 = String.valueOf(this.f31795Oooo0oo);
            int length2 = String.valueOf(this.f31795Oooo0oo).length();
            o0o00oo3.setValue(new oo0oOO0(strValueOf2, o000O0O0.OooO00o(length2, length2), 4));
        } else if (TextUtils.isEmpty(it.f27236OooO00o.f26756Oooo0o)) {
            this.f31794Oooo0oO.setValue(new oo0oOO0(AppEventsConstants.EVENT_PARAM_VALUE_NO, o000O0O0.OooO00o(1, 1), 4));
        } else {
            String strValueOf3 = String.valueOf(iOooO0OO);
            o0O00OO<oo0oOO0> o0o00oo4 = this.f31794Oooo0oO;
            int length3 = strValueOf3.length();
            o0o00oo4.setValue(new oo0oOO0(strValueOf3, o000O0O0.OooO00o(length3, length3), 4));
        }
        return Unit.INSTANCE;
    }
}
