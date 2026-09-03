package p127o00O0oo;

import com.bumptech.glide.OooO;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o00OO0.OooOOO0;
import o00OO00O.o0OoOo0;
import oo0O.OooO00o;
import oo0O.OooO0OO;
import oo0O.OooO0o;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000OO;
import p126o00O0oOo.o000OOo;
import p126o00O0oOo.o0O0O00;
import p532o0o0Oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o<Transcode> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00000 f36874OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f36875OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f36876OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO f36877OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f36878OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f36879OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36880OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Class<?> f36881OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0Oo0oo.OooO f36882OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Map<Class<?>, o00000OO<?>> f36883OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Class<Transcode> f36884OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f36885OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000OOo f36886OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f36887OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Priority f36888OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public oo0o0Oo f36889OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f36890OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f36891OooOOo0;

    public final ArrayList OooO00o() {
        boolean z = this.f36887OooOOO0;
        ArrayList arrayList = this.f36876OooO0O0;
        if (!z) {
            this.f36887OooOOO0 = true;
            arrayList.clear();
            ArrayList arrayListOooO0O0 = OooO0O0();
            int size = arrayListOooO0O0.size();
            for (int i = 0; i < size; i++) {
                o0OoOo0.OooO00o oooO00o = (o0OoOo0.OooO00o) arrayListOooO0O0.get(i);
                if (!arrayList.contains(oooO00o.f37150OooO00o)) {
                    arrayList.add(oooO00o.f37150OooO00o);
                }
                int i2 = 0;
                while (true) {
                    List<o000OOo> list = oooO00o.f37151OooO0O0;
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
        boolean z = this.f36885OooOO0o;
        ArrayList arrayList = this.f36875OooO00o;
        if (!z) {
            this.f36885OooOO0o = true;
            arrayList.clear();
            List listOooO0oO = this.f36877OooO0OO.OooO0O0().OooO0oO(this.f36878OooO0Oo);
            int size = listOooO0oO.size();
            for (int i = 0; i < size; i++) {
                o0OoOo0.OooO00o oooO00oOooO0O0 = ((o0OoOo0) listOooO0oO.get(i)).OooO0O0(this.f36878OooO0Oo, this.f36880OooO0o0, this.f36879OooO0o, this.f36874OooO);
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
    public final <Data> o00000OO<Data, ?, Transcode> OooO0OO(Class<Data> cls) {
        o00000OO<Data, ?, Transcode> o00000oo2;
        Registry registryOooO0O0 = this.f36877OooO0OO.OooO0O0();
        Class<?> cls2 = this.f36881OooO0oO;
        Class cls3 = this.f36884OooOO0O;
        OooO0OO oooO0OO = registryOooO0O0.f9910OooO;
        o0000 andSet = oooO0OO.f60890OooO0O0.getAndSet(null);
        if (andSet == null) {
            andSet = new o0000();
        }
        andSet.f54553OooO00o = cls;
        andSet.f54554OooO0O0 = cls2;
        andSet.f54555OooO0OO = cls3;
        synchronized (oooO0OO.f60889OooO00o) {
            o00000oo2 = (o00000OO) oooO0OO.f60889OooO00o.getOrDefault(andSet, null);
        }
        oooO0OO.f60890OooO0O0.set(andSet);
        registryOooO0O0.f9910OooO.getClass();
        if (OooO0OO.f60888OooO0OO.equals(o00000oo2)) {
            return null;
        }
        if (o00000oo2 != null) {
            return o00000oo2;
        }
        ArrayList arrayListOooO0o0 = registryOooO0O0.OooO0o0(cls, cls2, cls3);
        o00000OO<Data, ?, Transcode> o00000oo3 = arrayListOooO0o0.isEmpty() ? null : new o00000OO<>(cls, cls2, cls3, arrayListOooO0o0, registryOooO0O0.f9919OooOO0);
        registryOooO0O0.f9910OooO.OooO00o(cls, cls2, cls3, o00000oo3);
        return o00000oo3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Class<?>> OooO0Oo() {
        List<Class<?>> orDefault;
        Registry registryOooO0O0 = this.f36877OooO0OO.OooO0O0();
        Class<?> cls = this.f36878OooO0Oo.getClass();
        Class<?> cls2 = this.f36881OooO0oO;
        Class cls3 = this.f36884OooOO0O;
        OooO0o oooO0o = registryOooO0O0.f9918OooO0oo;
        o0000 andSet = oooO0o.f60891OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new o0000(cls, cls2, cls3);
        } else {
            andSet.f54553OooO00o = cls;
            andSet.f54554OooO0O0 = cls2;
            andSet.f54555OooO0OO = cls3;
        }
        synchronized (oooO0o.f60892OooO0O0) {
            orDefault = oooO0o.f60892OooO0O0.getOrDefault(andSet, null);
        }
        oooO0o.f60891OooO00o.set(andSet);
        List<Class<?>> list = orDefault;
        if (orDefault == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = registryOooO0O0.f9911OooO00o.OooO00o(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : registryOooO0O0.f9913OooO0OO.OooO0O0((Class) it.next(), cls2)) {
                    if (!registryOooO0O0.f9915OooO0o.OooO0O0(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            registryOooO0O0.f9918OooO0oo.OooO00o(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list = arrayList;
        }
        return list;
    }

    public final <Z> o00000OO<Z> OooO0o(Class<Z> cls) {
        o00000OO<Z> o00000oo2 = (o00000OO) this.f36883OooOO0.get(cls);
        if (o00000oo2 == null) {
            for (Map.Entry<Class<?>, o00000OO<?>> entry : this.f36883OooOO0.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    o00000oo2 = (o00000OO) entry.getValue();
                    break;
                }
            }
        }
        if (o00000oo2 != null) {
            return o00000oo2;
        }
        if (!this.f36883OooOO0.isEmpty() || !this.f36891OooOOo0) {
            return OooOOO0.f37062OooO0O0;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public final <X> o0O0O00<X> OooO0o0(X x) throws Registry.NoSourceEncoderAvailableException {
        o0O0O00<X> o0o0o00;
        OooO00o oooO00o = this.f36877OooO0OO.OooO0O0().f9912OooO0O0;
        Class<?> cls = x.getClass();
        synchronized (oooO00o) {
            for (OooO00o.C0521OooO00o c0521OooO00o : oooO00o.f60884OooO00o) {
                if (c0521OooO00o.f60885OooO00o.isAssignableFrom(cls)) {
                    o0o0o00 = (o0O0O00<X>) c0521OooO00o.f60886OooO0O0;
                }
            }
            o0o0o00 = null;
        }
        if (o0o0o00 != null) {
            return o0o0o00;
        }
        throw new Registry.NoSourceEncoderAvailableException(x.getClass());
    }
}
