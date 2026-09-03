package p516o0o0O000;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f42074Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f42075Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f42076Oooo0oo;

    public o00O0O(o00Oo0 o00oo1, boolean z, int i) {
        this.f42074Oooo0o = o00oo1;
        this.f42075Oooo0oO = z;
        this.f42076Oooo0oo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Oo0 o00oo1 = this.f42074Oooo0o;
        int i = o00oo1.f42082OooO0o;
        if (i == o00oo1.f42081OooO0Oo) {
            Function0<Unit> function0 = o00oo1.f42086OooOO0;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (i == o00oo1.f42083OooO0o0) {
            Function0<Unit> function1 = o00oo1.f42087OooOO0O;
            if (function1 != null) {
                function1.invoke();
                return;
            }
            return;
        }
        o00oo1.f42082OooO0o = 0;
        Objects.requireNonNull(o00oo1);
        Objects.requireNonNull(this.f42074Oooo0o);
        if (this.f42076Oooo0oo == 0) {
            if (this.f42075Oooo0oO) {
                Function0<Unit> function2 = this.f42074Oooo0o.f42077OooO;
                if (function2 != null) {
                    function2.invoke();
                }
            } else {
                Function0<Unit> function3 = this.f42074Oooo0o.f42085OooO0oo;
                if (function3 != null) {
                    function3.invoke();
                }
            }
        }
        o00Oo0 o00oo2 = this.f42074Oooo0o;
        o00oo2.f42078OooO00o.setImageResource(o00oo2.f42080OooO0OO[this.f42076Oooo0oo]);
        int i2 = this.f42076Oooo0oo;
        o00Oo0 o00oo3 = this.f42074Oooo0o;
        if (i2 != o00oo3.f42080OooO0OO.length - 1) {
            o00Oo0.OooO00o(o00oo3, i2 + 1);
            return;
        }
        if (o00oo3.f42079OooO0O0) {
            o00oo3.f42078OooO00o.postDelayed(new o00O0O(o00oo3, true, 0), o00oo3.f42084OooO0oO);
            return;
        }
        o00oo3.f42082OooO0o = o00oo3.f42083OooO0o0;
        Function0<Unit> function4 = o00oo3.f42087OooOO0O;
        if (function4 != null) {
            function4.invoke();
        }
    }
}
