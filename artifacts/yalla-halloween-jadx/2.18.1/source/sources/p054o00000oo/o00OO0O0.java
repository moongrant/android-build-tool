package p054o00000oo;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0O0 extends Lambda implements Function0<BaseInputConnection> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f27217Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(o00OO00O o00oo00o) {
        super(0);
        this.f27217Oooo0o = o00oo00o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f27217Oooo0o.f27201OooO00o, false);
    }
}
