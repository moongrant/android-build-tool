package p080o000OoO;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.OooO;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00000O0<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f34932OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f34933OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000 f34934OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0<T> f34935OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArraySet<OooO0OO<T>> f34936OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayDeque<Runnable> f34937OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayDeque<Runnable> f34938OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f34939OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("releasedLock")
    public boolean f34940OooO0oo;

    public interface OooO00o<T> {
        void invoke(T t);
    }

    public interface OooO0O0<T> {
        void OooO0O0(T t, OooO oooO);
    }

    public static final class OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f34941OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO.OooO00o f34942OooO0O0 = new OooO.OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f34943OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f34944OooO0Oo;

        public OooO0OO(T t) {
            this.f34941OooO00o = t;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0OO.class != obj.getClass()) {
                return false;
            }
            return this.f34941OooO00o.equals(((OooO0OO) obj).f34941OooO00o);
        }

        public final int hashCode() {
            return this.f34941OooO00o.hashCode();
        }
    }

    public o00000O0(Looper looper, o0ooOOo o0ooooo, OooO0O0<T> oooO0O0) {
        this(new CopyOnWriteArraySet(), looper, o0ooooo, oooO0O0, true);
    }

    public final void OooO00o(T t) {
        t.getClass();
        synchronized (this.f34939OooO0oO) {
            if (this.f34940OooO0oo) {
                return;
            }
            this.f34936OooO0Oo.add(new OooO0OO<>(t));
        }
    }

    public final void OooO0O0() {
        OooO0oO();
        ArrayDeque<Runnable> arrayDeque = this.f34937OooO0o;
        if (arrayDeque.isEmpty()) {
            return;
        }
        o000000 o000000Var = this.f34934OooO0O0;
        if (!o000000Var.OooO00o()) {
            o000000Var.OooO0Oo(o000000Var.OooO0O0(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f34938OooO0o0;
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

    public final void OooO0OO(final int i, final OooO00o<T> oooO00o) {
        OooO0oO();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f34936OooO0Oo);
        this.f34937OooO0o.add(new Runnable() { // from class: o000OoO.o00000
            @Override // java.lang.Runnable
            public final void run() {
                for (o00000O0.OooO0OO oooO0OO : copyOnWriteArraySet) {
                    if (!oooO0OO.f34944OooO0Oo) {
                        int i2 = i;
                        if (i2 != -1) {
                            oooO0OO.f34942OooO0O0.OooO00o(i2);
                        }
                        oooO0OO.f34943OooO0OO = true;
                        oooO00o.invoke(oooO0OO.f34941OooO00o);
                    }
                }
            }
        });
    }

    public final void OooO0Oo() {
        OooO0oO();
        synchronized (this.f34939OooO0oO) {
            this.f34940OooO0oo = true;
        }
        for (OooO0OO<T> oooO0OO : this.f34936OooO0Oo) {
            OooO0O0<T> oooO0O0 = this.f34935OooO0OO;
            oooO0OO.f34944OooO0Oo = true;
            if (oooO0OO.f34943OooO0OO) {
                oooO0OO.f34943OooO0OO = false;
                oooO0O0.OooO0O0(oooO0OO.f34941OooO00o, oooO0OO.f34942OooO0O0.OooO0O0());
            }
        }
        this.f34936OooO0Oo.clear();
    }

    public final void OooO0o(int i, OooO00o<T> oooO00o) {
        OooO0OO(i, oooO00o);
        OooO0O0();
    }

    public final void OooO0o0(T t) {
        OooO0oO();
        CopyOnWriteArraySet<OooO0OO<T>> copyOnWriteArraySet = this.f34936OooO0Oo;
        for (OooO0OO<T> oooO0OO : copyOnWriteArraySet) {
            if (oooO0OO.f34941OooO00o.equals(t)) {
                oooO0OO.f34944OooO0Oo = true;
                if (oooO0OO.f34943OooO0OO) {
                    oooO0OO.f34943OooO0OO = false;
                    OooO oooOOooO0O0 = oooO0OO.f34942OooO0O0.OooO0O0();
                    this.f34935OooO0OO.OooO0O0(oooO0OO.f34941OooO00o, oooOOooO0O0);
                }
                copyOnWriteArraySet.remove(oooO0OO);
            }
        }
    }

    public final void OooO0oO() {
        if (this.f34932OooO) {
            o00Oo0.OooO0Oo(Thread.currentThread() == this.f34934OooO0O0.OooO0o().getThread());
        }
    }

    public o00000O0(CopyOnWriteArraySet<OooO0OO<T>> copyOnWriteArraySet, Looper looper, o0ooOOo o0ooooo, OooO0O0<T> oooO0O0, boolean z) {
        this.f34933OooO00o = o0ooooo;
        this.f34936OooO0Oo = copyOnWriteArraySet;
        this.f34935OooO0OO = oooO0O0;
        this.f34939OooO0oO = new Object();
        this.f34938OooO0o0 = new ArrayDeque<>();
        this.f34937OooO0o = new ArrayDeque<>();
        this.f34934OooO0O0 = o0ooooo.OooO0O0(looper, new Handler.Callback() { // from class: o000OoO.o000000O
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
                o00000O0 o00000o1 = this.f34929OooO0Oo;
                Iterator it = o00000o1.f34936OooO0Oo.iterator();
                while (it.hasNext()) {
                    o00000O0.OooO0OO oooO0OO = (o00000O0.OooO0OO) it.next();
                    if (!oooO0OO.f34944OooO0Oo && oooO0OO.f34943OooO0OO) {
                        OooO oooOOooO0O0 = oooO0OO.f34942OooO0O0.OooO0O0();
                        oooO0OO.f34942OooO0O0 = new OooO.OooO00o();
                        oooO0OO.f34943OooO0OO = false;
                        o00000o1.f34935OooO0OO.OooO0O0(oooO0OO.f34941OooO00o, oooOOooO0O0);
                    }
                    if (o00000o1.f34934OooO0O0.OooO00o()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f34932OooO = z;
    }
}
