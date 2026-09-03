package o00OO00O;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends o00O00OO.OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f37076OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f37077OooO0OO;

    public OooOOO0(Function0<Unit> function0, Function0<Unit> function1) {
        this.f37076OooO0O0 = function0;
        this.f37077OooO0OO = function1;
    }

    @Override // o00O00OO.OooO0OO
    public final void OooO00o(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f37077OooO0OO;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o00O00OO.OooO0OO
    public final void OooO0O0(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f37076OooO0O0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
