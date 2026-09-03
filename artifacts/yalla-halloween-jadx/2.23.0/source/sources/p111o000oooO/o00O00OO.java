package p111o000oooO;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO00O<View> f35929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f35930OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f35931OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(oOO00O<View> ooo00o, ViewTreeObserver viewTreeObserver, o00O00o0 o00o00o1) {
        super(1);
        this.f35929OooO0Oo = ooo00o;
        this.f35931OooO0o0 = viewTreeObserver;
        this.f35930OooO0o = o00o00o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        ViewTreeObserver viewTreeObserver = this.f35931OooO0o0;
        boolean zIsAlive = viewTreeObserver.isAlive();
        o00O00o0 o00o00o1 = this.f35930OooO0o;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(o00o00o1);
        } else {
            this.f35929OooO0Oo.getView().getViewTreeObserver().removeOnPreDrawListener(o00o00o1);
        }
        return Unit.INSTANCE;
    }
}
