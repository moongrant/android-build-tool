package p127o00O0oo;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o000OO.OooO;
import o00OO00O.o0OoOo0;
import o00OOO.OooO00o;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O;
import p126o00O0oOo.o00000O0;
import p126o00O0oOo.o00000OO;
import p126o00O0oOo.o000OOo;
import p133o00OO0oO.o00O0O;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<DataType> f36869OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends o00000O0<DataType, ResourceType>> f36870OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O<ResourceType, Transcode> f36871OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO<List<Throwable>> f36872OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f36873OooO0o0;

    public o0OO00O(Class cls, Class cls2, Class cls3, List list, o00O0O o00o0o2, OooO00o.OooO0OO oooO0OO) {
        this.f36869OooO00o = cls;
        this.f36870OooO0O0 = list;
        this.f36871OooO0OO = o00o0o2;
        this.f36872OooO0Oo = oooO0OO;
        this.f36873OooO0o0 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
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
    public final o0000 OooO00o(int i, int i2, @NonNull o00000 o00000Var, com.bumptech.glide.load.data.OooO oooO, o0Oo0oo.OooO0OO oooO0OO) throws GlideException {
        o0000 o0000VarOooO0O0;
        o00000OO o00000oo2;
        EncodeStrategy encodeStrategyOooO0O0;
        boolean z;
        o000OOo oo000oVar;
        OooO<List<Throwable>> oooO2 = this.f36872OooO0Oo;
        List<Throwable> listOooO0O0 = oooO2.OooO0O0();
        o0000O00.OooO0O0(listOooO0O0);
        List<Throwable> list = listOooO0O0;
        try {
            o0000<ResourceType> o0000VarOooO0O1 = OooO0O0(oooO, i, i2, o00000Var, list);
            oooO2.OooO00o(list);
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            o0oo0oo2.getClass();
            Class<?> cls = o0000VarOooO0O1.get().getClass();
            DataSource dataSource = DataSource.RESOURCE_DISK_CACHE;
            DataSource dataSource2 = oooO0OO.f36927OooO00o;
            o0OOO0o<R> o0ooo0o2 = o0oo0oo2.f36893OooO0Oo;
            o00000O o00000o = null;
            if (dataSource2 != dataSource) {
                o00000OO o00000ooOooO0o = o0ooo0o2.OooO0o((Class<Z>) cls);
                o00000oo2 = o00000ooOooO0o;
                o0000VarOooO0O0 = o00000ooOooO0o.OooO0O0(o0oo0oo2.f36899OooOO0O, o0000VarOooO0O1, o0oo0oo2.f36903OooOOOO, o0oo0oo2.f36904OooOOOo);
            } else {
                o0000VarOooO0O0 = o0000VarOooO0O1;
                o00000oo2 = null;
            }
            if (!o0000VarOooO0O1.equals(o0000VarOooO0O0)) {
                o0000VarOooO0O1.OooO00o();
            }
            if (o0ooo0o2.f36877OooO0OO.OooO0O0().f9914OooO0Oo.OooO00o(o0000VarOooO0O0.OooO0O0()) != null) {
                Registry registryOooO0O0 = o0ooo0o2.f36877OooO0OO.OooO0O0();
                registryOooO0O0.getClass();
                o00000O o00000oOooO00o = registryOooO0O0.f9914OooO0Oo.OooO00o(o0000VarOooO0O0.OooO0O0());
                if (o00000oOooO00o == null) {
                    throw new Registry.NoResultEncoderAvailableException(o0000VarOooO0O0.OooO0O0());
                }
                encodeStrategyOooO0O0 = o00000oOooO00o.OooO0O0(o0oo0oo2.f36905OooOOo);
                o00000o = o00000oOooO00o;
            } else {
                encodeStrategyOooO0O0 = EncodeStrategy.NONE;
            }
            o000OOo o000ooo2 = o0oo0oo2.f36915OooOoOO;
            ArrayList arrayListOooO0O0 = o0ooo0o2.OooO0O0();
            int size = arrayListOooO0O0.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((o0OoOo0.OooO00o) arrayListOooO0O0.get(i3)).f37150OooO00o.equals(o000ooo2)) {
                    z = true;
                    break;
                }
                i3++;
            }
            Object obj = o0000VarOooO0O0;
            if (o0oo0oo2.f36906OooOOo0.OooO0Oo(!z, dataSource2, encodeStrategyOooO0O0)) {
                if (o00000o == null) {
                    throw new Registry.NoResultEncoderAvailableException(o0000VarOooO0O0.get().getClass());
                }
                int i4 = o0Oo0oo.OooO00o.f36926OooO0OO[encodeStrategyOooO0O0.ordinal()];
                if (i4 == 1) {
                    oo000oVar = new oo000o(o0oo0oo2.f36915OooOoOO, o0oo0oo2.f36900OooOO0o);
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyOooO0O0);
                    }
                    oo000oVar = new o0000oo(o0ooo0o2.f36877OooO0OO.f9839OooO00o, o0oo0oo2.f36915OooOoOO, o0oo0oo2.f36900OooOO0o, o0oo0oo2.f36903OooOOOO, o0oo0oo2.f36904OooOOOo, o00000oo2, cls, o0oo0oo2.f36905OooOOo);
                }
                o0000Ooo<Z> o0000ooo = (o0000Ooo) o0000Ooo.f36767OooO0oo.OooO0O0();
                o0000O00.OooO0O0(o0000ooo);
                o0000ooo.f36771OooO0oO = false;
                o0000ooo.f36769OooO0o = true;
                o0000ooo.f36770OooO0o0 = o0000VarOooO0O0;
                o0Oo0oo.OooO0o<?> oooO0o = o0oo0oo2.f36892OooO;
                oooO0o.f36929OooO00o = oo000oVar;
                oooO0o.f36930OooO0O0 = o00000o;
                oooO0o.f36931OooO0OO = o0000ooo;
                obj = o0000ooo;
            }
            return this.f36871OooO0OO.OooO00o(obj, o00000Var);
        } catch (Throwable th) {
            oooO2.OooO00o(list);
            throw th;
        }
    }

    @NonNull
    public final o0000<ResourceType> OooO0O0(com.bumptech.glide.load.data.OooO<DataType> oooO, int i, int i2, @NonNull o00000 o00000Var, List<Throwable> list) throws GlideException {
        List<? extends o00000O0<DataType, ResourceType>> list2 = this.f36870OooO0O0;
        int size = list2.size();
        o0000<ResourceType> o0000VarOooO00o = null;
        for (int i3 = 0; i3 < size; i3++) {
            o00000O0<DataType, ResourceType> o00000o1 = list2.get(i3);
            try {
                if (o00000o1.OooO0O0(oooO.OooO00o(), o00000Var)) {
                    o0000VarOooO00o = o00000o1.OooO00o(oooO.OooO00o(), i, i2, o00000Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + o00000o1, e);
                }
                list.add(e);
            }
            if (o0000VarOooO00o != null) {
                break;
            }
        }
        if (o0000VarOooO00o != null) {
            return o0000VarOooO00o;
        }
        throw new GlideException(this.f36873OooO0o0, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f36869OooO00o + ", decoders=" + this.f36870OooO0O0 + ", transcoder=" + this.f36871OooO0OO + '}';
    }
}
