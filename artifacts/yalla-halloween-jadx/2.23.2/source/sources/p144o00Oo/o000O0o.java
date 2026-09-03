package p144o00Oo;

import com.bumptech.glide.OooO;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o00OoO.o0OoOo0;
import p154o00Oo0oo.o000000;
import p154o00Oo0oo.o0OOO0o;
import p154o00Oo0oo.o0ooOOo;
import p154o00Oo0oo.oo0o0Oo;
import p158o00OoOO.o00Oo0;
import p169o00Ooo0O.OooOO0;
import p169o00Ooo0O.OooOOO;
import p169o00Ooo0O.OooOOO0;
import p174o00OooOo.o00OO000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o<Transcode> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public oo0o0Oo f37634OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f37635OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f37636OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO f37637OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f37638OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f37639OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f37640OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Class<?> f37641OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000Oo0.OooO f37642OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Map<Class<?>, o000000<?>> f37643OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Class<Transcode> f37644OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f37645OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o0OOO0o f37646OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f37647OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Priority f37648OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public o000O00O f37649OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f37650OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f37651OooOOo0;

    public final ArrayList OooO00o() {
        boolean z = this.f37647OooOOO0;
        ArrayList arrayList = this.f37636OooO0O0;
        if (!z) {
            this.f37647OooOOO0 = true;
            arrayList.clear();
            ArrayList arrayListOooO0O0 = OooO0O0();
            int size = arrayListOooO0O0.size();
            for (int i = 0; i < size; i++) {
                o0OoOo0.OooO00o oooO00o = (o0OoOo0.OooO00o) arrayListOooO0O0.get(i);
                if (!arrayList.contains(oooO00o.f37912OooO00o)) {
                    arrayList.add(oooO00o.f37912OooO00o);
                }
                int i2 = 0;
                while (true) {
                    List<o0OOO0o> list = oooO00o.f37913OooO0O0;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList OooO0O0() {
        boolean z = this.f37645OooOO0o;
        ArrayList arrayList = this.f37635OooO00o;
        if (!z) {
            this.f37645OooOO0o = true;
            arrayList.clear();
            List listOooO0oO = this.f37637OooO0OO.OooO0O0().OooO0oO(this.f37638OooO0Oo);
            int size = listOooO0oO.size();
            for (int i = 0; i < size; i++) {
                o0OoOo0.OooO00o oooO00oOooO0O0 = ((o0OoOo0) listOooO0oO.get(i)).OooO0O0(this.f37638OooO0Oo, this.f37640OooO0o0, this.f37639OooO0o, this.f37634OooO);
                if (oooO00oOooO0O0 != null) {
                    arrayList.add(oooO00oOooO0O0);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final <Data> o00O0000<Data, ?, Transcode> OooO0OO(Class<Data> cls) {
        o00O0000<Data, ?, Transcode> o00o0001;
        Registry registryOooO0O0 = this.f37637OooO0OO.OooO0O0();
        Class<?> cls2 = this.f37641OooO0oO;
        Class cls3 = this.f37644OooOO0O;
        OooOOO0 oooOOO0 = registryOooO0O0.f13001OooO;
        o00OO000 andSet = oooOOO0.f38239OooO0O0.getAndSet(null);
        if (andSet == null) {
            andSet = new o00OO000();
        }
        andSet.f38348OooO00o = cls;
        andSet.f38349OooO0O0 = cls2;
        andSet.f38350OooO0OO = cls3;
        synchronized (oooOOO0.f38238OooO00o) {
            o00o0001 = (o00O0000) oooOOO0.f38238OooO00o.getOrDefault(andSet, null);
        }
        oooOOO0.f38239OooO0O0.set(andSet);
        registryOooO0O0.f13001OooO.getClass();
        if (OooOOO0.f38237OooO0OO.equals(o00o0001)) {
            return null;
        }
        if (o00o0001 != null) {
            return o00o0001;
        }
        ArrayList arrayListOooO0o0 = registryOooO0O0.OooO0o0(cls, cls2, cls3);
        o00O0000<Data, ?, Transcode> o00o0002 = arrayListOooO0o0.isEmpty() ? null : new o00O0000<>(cls, cls2, cls3, arrayListOooO0o0, registryOooO0O0.f13010OooOO0);
        registryOooO0O0.f13001OooO.OooO00o(cls, cls2, cls3, o00o0002);
        return o00o0002;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Class<?>> OooO0Oo() {
        List<Class<?>> orDefault;
        Registry registryOooO0O0 = this.f37637OooO0OO.OooO0O0();
        Class<?> cls = this.f37638OooO0Oo.getClass();
        Class<?> cls2 = this.f37641OooO0oO;
        Class cls3 = this.f37644OooOO0O;
        OooOOO oooOOO = registryOooO0O0.f13009OooO0oo;
        o00OO000 andSet = oooOOO.f38235OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new o00OO000(cls, cls2, cls3);
        } else {
            andSet.f38348OooO00o = cls;
            andSet.f38349OooO0O0 = cls2;
            andSet.f38350OooO0OO = cls3;
        }
        synchronized (oooOOO.f38236OooO0O0) {
            orDefault = oooOOO.f38236OooO0O0.getOrDefault(andSet, null);
        }
        oooOOO.f38235OooO00o.set(andSet);
        List<Class<?>> list = orDefault;
        if (orDefault == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = registryOooO0O0.f13002OooO00o.OooO00o(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : registryOooO0O0.f13004OooO0OO.OooO0O0((Class) it.next(), cls2)) {
                    if (!registryOooO0O0.f13006OooO0o.OooO0O0(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            registryOooO0O0.f13009OooO0oo.OooO00o(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list = arrayList;
        }
        return list;
    }

    public final <Z> o000000<Z> OooO0o(Class<Z> cls) {
        o000000<Z> o000000Var = (o000000) this.f37643OooOO0.get(cls);
        if (o000000Var == null) {
            for (Map.Entry<Class<?>, o000000<?>> entry : this.f37643OooOO0.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    o000000Var = (o000000) entry.getValue();
                    break;
                }
            }
        }
        if (o000000Var != null) {
            return o000000Var;
        }
        if (!this.f37643OooOO0.isEmpty() || !this.f37651OooOOo0) {
            return o00Oo0.f38017OooO0O0;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public final <X> o0ooOOo<X> OooO0o0(X x) throws Registry.NoSourceEncoderAvailableException {
        o0ooOOo<X> o0ooooo;
        OooOO0 oooOO1 = this.f37637OooO0OO.OooO0O0().f13003OooO0O0;
        Class<?> cls = x.getClass();
        synchronized (oooOO1) {
            for (OooOO0.OooO00o oooO00o : oooOO1.f38231OooO00o) {
                if (oooO00o.f38232OooO00o.isAssignableFrom(cls)) {
                    o0ooooo = (o0ooOOo<X>) oooO00o.f38233OooO0O0;
                }
            }
            o0ooooo = null;
        }
        if (o0ooooo != null) {
            return o0ooooo;
        }
        throw new Registry.NoSourceEncoderAvailableException(x.getClass());
    }
}
