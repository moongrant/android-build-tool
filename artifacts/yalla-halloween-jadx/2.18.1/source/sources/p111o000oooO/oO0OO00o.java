package p111o000oooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import o00O0000.o0OoOo0;
import p109o000ooo.o00000O0;
import p109o000ooo.o00000OO;
import p109o000ooo.o0000Ooo;
import p112o000oooo.oO0O00o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class oO0OO00o<T> implements o00000O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f30036OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public T f30037OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oO0O00o0<T> f30038OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f30039OooO0Oo;

    public interface OooO00o {
    }

    public oO0OO00o(oO0O00o0<T> oo0o00o0) {
        this.f30038OooO0OO = oo0o00o0;
    }

    @Override // p109o000ooo.o00000O0
    public final void OooO00o(@Nullable T t) {
        this.f30037OooO0O0 = t;
        OooO0o0(this.f30039OooO0Oo, t);
    }

    public abstract boolean OooO0O0(@NonNull o0OoOo0 o0oooo1);

    public abstract boolean OooO0OO(@NonNull T t);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void OooO0Oo(@NonNull Iterable<o0OoOo0> iterable) {
        this.f30036OooO00o.clear();
        for (o0OoOo0 o0oooo1 : iterable) {
            if (OooO0O0(o0oooo1)) {
                this.f30036OooO00o.add(o0oooo1.f30152OooO00o);
            }
        }
        if (this.f30036OooO00o.isEmpty()) {
            this.f30038OooO0OO.OooO0O0(this);
        } else {
            oO0O00o0<T> oo0o00o0 = this.f30038OooO0OO;
            synchronized (oo0o00o0.f30051OooO0OO) {
                if (oo0o00o0.f30052OooO0Oo.add(this)) {
                    if (oo0o00o0.f30052OooO0Oo.size() == 1) {
                        oo0o00o0.f30053OooO0o0 = oo0o00o0.OooO00o();
                        p102o000oo.o0OoOo0.OooO0OO().OooO00o(oO0O00o0.f30048OooO0o, String.format("%s: initial state = %s", oo0o00o0.getClass().getSimpleName(), oo0o00o0.f30053OooO0o0), new Throwable[0]);
                        oo0o00o0.OooO0Oo();
                    }
                    OooO00o(oo0o00o0.f30053OooO0o0);
                }
            }
        }
        OooO0o0(this.f30039OooO0Oo, this.f30037OooO0O0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void OooO0o0(@Nullable OooO00o oooO00o, @Nullable T t) {
        if (this.f30036OooO00o.isEmpty() || oooO00o == null) {
            return;
        }
        if (t == null || OooO0OO(t)) {
            List<String> list = this.f30036OooO00o;
            o0000Ooo o0000ooo = (o0000Ooo) oooO00o;
            synchronized (o0000ooo.f30027OooO0OO) {
                o00000OO o00000oo2 = o0000ooo.f30025OooO00o;
                if (o00000oo2 != null) {
                    o00000oo2.OooO0O0(list);
                }
            }
            return;
        }
        ?? r10 = this.f30036OooO00o;
        o0000Ooo o0000ooo2 = (o0000Ooo) oooO00o;
        synchronized (o0000ooo2.f30027OooO0OO) {
            ArrayList arrayList = new ArrayList();
            for (String str : r10) {
                if (o0000ooo2.OooO00o(str)) {
                    p102o000oo.o0OoOo0.OooO0OO().OooO00o(o0000Ooo.f30024OooO0Oo, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            o00000OO o00000oo3 = o0000ooo2.f30025OooO00o;
            if (o00000oo3 != null) {
                o00000oo3.OooO0o(arrayList);
            }
        }
    }
}
