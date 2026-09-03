package p321o0O0ooO;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;
import p079o000Oo0o.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 extends o000OO00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f42841OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f42842OooO0OO;

    public o000O0(Function0<Unit> function0, Function0<Unit> function1) {
        this.f42841OooO0O0 = function0;
        this.f42842OooO0OO = function1;
    }

    @Override // p079o000Oo0o.o000OO00
    public final void OooO00o(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f42842OooO0OO;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // p079o000Oo0o.o000OO00
    public final void OooO0O0(@Nullable Drawable drawable) {
        Function0<Unit> function0 = this.f42841OooO0O0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
