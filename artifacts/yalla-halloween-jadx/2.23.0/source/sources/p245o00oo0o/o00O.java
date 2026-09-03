package p245o00oo0o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p203o00o0o0o.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f40543OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00OO f40544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0OOO f40545OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0<T> f40546OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArraySet<OooO0OO<T>> f40547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayDeque<Runnable> f40548OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayDeque<Runnable> f40549OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f40550OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("releasedLock")
    public boolean f40551OooO0oo;

    public interface OooO00o<T> {
        void invoke(T t);
    }

    public interface OooO0O0<T> {
        void OooO00o(T t, o00O0OO o00o0oo2);
    }

    public static final class OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f40552OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00O0OO.OooO00o f40553OooO0O0 = new o00O0OO.OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f40554OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f40555OooO0Oo;

        public OooO0OO(T t) {
            this.f40552OooO00o = t;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0OO.class != obj.getClass()) {
                return false;
            }
            return this.f40552OooO00o.equals(((OooO0OO) obj).f40552OooO00o);
        }

        public final int hashCode() {
            return this.f40552OooO00o.hashCode();
        }
    }

    public o00O(Looper looper, o00O00OO o00o00oo2, OooO0O0<T> oooO0O0) {
        this(new CopyOnWriteArraySet(), looper, o00o00oo2, oooO0O0, true);
    }

    public final void OooO00o(T t) {
        t.getClass();
        synchronized (this.f40550OooO0oO) {
            if (this.f40551OooO0oo) {
                return;
            }
            this.f40547OooO0Oo.add(new OooO0OO<>(t));
        }
    }

    public final void OooO0O0() {
        OooO0o();
        ArrayDeque<Runnable> arrayDeque = this.f40548OooO0o;
        if (arrayDeque.isEmpty()) {
            return;
        }
        o00O0OOO o00o0ooo2 = this.f40545OooO0O0;
        if (!o00o0ooo2.OooO00o()) {
            o00o0ooo2.OooO0Oo(o00o0ooo2.OooO0O0(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f40549OooO0o0;
        boolean z = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            arrayDeque2.peekFirst().run();
            arrayDeque2.removeFirst();
        }
    }

    public final void OooO0OO(int i, OooO00o<T> oooO00o) {
        OooO0o();
        this.f40548OooO0o.add(new o0O00000(new CopyOnWriteArraySet(this.f40547OooO0Oo), i, oooO00o));
    }

    public final void OooO0Oo() {
        OooO0o();
        synchronized (this.f40550OooO0oO) {
            this.f40551OooO0oo = true;
        }
        for (OooO0OO<T> oooO0OO : this.f40547OooO0Oo) {
            OooO0O0<T> oooO0O0 = this.f40546OooO0OO;
            oooO0OO.f40555OooO0Oo = true;
            if (oooO0OO.f40554OooO0OO) {
                oooO0OO.f40554OooO0OO = false;
                oooO0O0.OooO00o(oooO0OO.f40552OooO00o, oooO0OO.f40553OooO0O0.OooO0O0());
            }
        }
        this.f40547OooO0Oo.clear();
    }

    public final void OooO0o() {
        if (this.f40543OooO) {
            o00O000o.OooO0Oo(Thread.currentThread() == this.f40545OooO0O0.OooO0o().getThread());
        }
    }

    public final void OooO0o0(int i, OooO00o<T> oooO00o) {
        OooO0OO(i, oooO00o);
        OooO0O0();
    }

    public o00O(CopyOnWriteArraySet<OooO0OO<T>> copyOnWriteArraySet, Looper looper, o00O00OO o00o00oo2, OooO0O0<T> oooO0O0, boolean z) {
        this.f40544OooO00o = o00o00oo2;
        this.f40547OooO0Oo = copyOnWriteArraySet;
        this.f40546OooO0OO = oooO0O0;
        this.f40550OooO0oO = new Object();
        this.f40549OooO0o0 = new ArrayDeque<>();
        this.f40548OooO0o = new ArrayDeque<>();
        this.f40545OooO0O0 = o00o00oo2.OooO0O0(looper, new Handler.Callback() { // from class: o00oo0o.oo0oOO0
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                o00O o00o2 = this.f40674OooO0Oo;
                Iterator it = o00o2.f40547OooO0Oo.iterator();
                while (it.hasNext()) {
                    o00O.OooO0OO oooO0OO = (o00O.OooO0OO) it.next();
                    if (!oooO0OO.f40555OooO0Oo && oooO0OO.f40554OooO0OO) {
                        o00O0OO o00o0ooOooO0O0 = oooO0OO.f40553OooO0O0.OooO0O0();
                        oooO0OO.f40553OooO0O0 = new o00O0OO.OooO00o();
                        oooO0OO.f40554OooO0OO = false;
                        o00o2.f40546OooO0OO.OooO00o(oooO0OO.f40552OooO00o, o00o0ooOooO0O0);
                    }
                    if (o00o2.f40545OooO0O0.OooO00o()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f40543OooO = z;
    }
}
