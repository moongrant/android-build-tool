package o0000OO0;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function1<o0000O0O.o000oOoO, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f27485Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(PopupLayout popupLayout) {
        super(1);
        this.f27485Oooo0o = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000O0O.o000oOoO o000oooo2) {
        this.f27485Oooo0o.m3setPopupContentSizefhxjrPA(new o0000O0O.o000oOoO(o000oooo2.f27322OooO00o));
        this.f27485Oooo0o.OooOOOo();
        return Unit.INSTANCE;
    }
}
