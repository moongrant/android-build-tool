package p203o00o0o0o;

import android.os.Bundle;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.adapter.RecAdapterCountries;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOO.OooO00o;
import p245o00oo0o.o00O;
import p283o0O0OOo.OooOO0O;
import p417o0OoO0.o000O0;
import p584o0oOooO0.oO00O0o;
import p585o0oOooOO.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo0 implements o00O.OooO00o, OooOO0O, f, RecAdapterCountries.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39177OooO0Oo;

    public /* synthetic */ o000OOo0(Object obj) {
        this.f39177OooO0Oo = obj;
    }

    @Override // p585o0oOooOO.f
    public final void OooO00o(Editable editable, int i, int i2) {
        MessageEditText this_apply = (MessageEditText) this.f39177OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (editable != null) {
            editable.setSpan(new ForegroundColorSpan(o000O0.OooO00o(oO00O0o.color_FF7217, this_apply)), i, i2, 33);
        }
    }

    @Override // p283o0O0OOo.OooOO0O
    public final void OooO0OO(Bundle bundle) {
        ((OooO00o) this.f39177OooO0Oo).f42011OooO00o.OooO0OO(bundle);
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerError(((o0O000o0) this.f39177OooO0Oo).f39266OooO0o);
    }
}
