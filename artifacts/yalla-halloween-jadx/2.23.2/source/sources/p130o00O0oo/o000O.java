package p130o00O0oo;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0O0<View> f36763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f36764OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f36765OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o000O0O0<View> o000o0o1, ViewTreeObserver viewTreeObserver, o000OO00 o000oo01) {
        super(1);
        this.f36763OooO0Oo = o000o0o1;
        this.f36765OooO0o0 = viewTreeObserver;
        this.f36764OooO0o = o000oo01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        ViewTreeObserver viewTreeObserver = this.f36765OooO0o0;
        boolean zIsAlive = viewTreeObserver.isAlive();
        o000OO00 o000oo01 = this.f36764OooO0o;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(o000oo01);
        } else {
            this.f36763OooO0Oo.getView().getViewTreeObserver().removeOnPreDrawListener(o000oo01);
        }
        return Unit.INSTANCE;
    }
}
