package p144o00Oo;

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
import o00OoO.o0OoOo0;
import p154o00Oo0oo.o000000;
import p154o00Oo0oo.o000OOo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.o0OOO0o;
import p154o00Oo0oo.oo0o0Oo;
import p168o00Ooo00.oo000o;
import p174o00OooOo.o00OO00O;
import p279o0O00o0.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<DataType> f37583OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends o0O0O00<DataType, ResourceType>> f37584OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo000o<ResourceType, Transcode> f37585OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO<List<Throwable>> f37586OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f37587OooO0o0;

    public o000O00(Class cls, Class cls2, Class cls3, List list, oo000o oo000oVar, OooO0O0.OooO0OO oooO0OO) {
        this.f37583OooO00o = cls;
        this.f37584OooO0O0 = list;
        this.f37585OooO0OO = oo000oVar;
        this.f37586OooO0Oo = oooO0OO;
        this.f37587OooO0o0 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
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
    public final o00oOoo OooO00o(int i, int i2, @NonNull oo0o0Oo oo0o0oo, com.bumptech.glide.load.data.OooO oooO, o000Oo0.OooO0OO oooO0OO) throws GlideException {
        o00oOoo o00ooooOooO00o;
        o000000 o000000Var;
        EncodeStrategy encodeStrategyOooO00o;
        boolean z;
        o0OOO0o o0000oo1;
        OooO<List<Throwable>> oooO2 = this.f37586OooO0Oo;
        List<Throwable> listOooO0O0 = oooO2.OooO0O0();
        o00OO00O.OooO0O0(listOooO0O0);
        List<Throwable> list = listOooO0O0;
        try {
            o00oOoo<ResourceType> o00ooooOooO0O0 = OooO0O0(oooO, i, i2, oo0o0oo, list);
            oooO2.OooO00o(list);
            o000Oo0 o000oo1 = o000Oo0.this;
            o000oo1.getClass();
            Class<?> cls = o00ooooOooO0O0.get().getClass();
            DataSource dataSource = DataSource.RESOURCE_DISK_CACHE;
            DataSource dataSource2 = oooO0OO.f37694OooO00o;
            o000O0o<R> o000o0o2 = o000oo1.f37660OooO0Oo;
            o000OOo o000ooo2 = null;
            if (dataSource2 != dataSource) {
                o000000 o000000VarOooO0o = o000o0o2.OooO0o((Class<Z>) cls);
                o000000Var = o000000VarOooO0o;
                o00ooooOooO00o = o000000VarOooO0o.OooO00o(o000oo1.f37666OooOO0O, o00ooooOooO0O0, o000oo1.f37670OooOOOO, o000oo1.f37671OooOOOo);
            } else {
                o00ooooOooO00o = o00ooooOooO0O0;
                o000000Var = null;
            }
            if (!o00ooooOooO0O0.equals(o00ooooOooO00o)) {
                o00ooooOooO0O0.OooO00o();
            }
            if (o000o0o2.f37637OooO0OO.OooO0O0().f13005OooO0Oo.OooO00o(o00ooooOooO00o.OooO0OO()) != null) {
                Registry registryOooO0O0 = o000o0o2.f37637OooO0OO.OooO0O0();
                registryOooO0O0.getClass();
                o000OOo o000oooOooO00o = registryOooO0O0.f13005OooO0Oo.OooO00o(o00ooooOooO00o.OooO0OO());
                if (o000oooOooO00o == null) {
                    throw new Registry.NoResultEncoderAvailableException(o00ooooOooO00o.OooO0OO());
                }
                encodeStrategyOooO00o = o000oooOooO00o.OooO00o(o000oo1.f37672OooOOo);
                o000ooo2 = o000oooOooO00o;
            } else {
                encodeStrategyOooO00o = EncodeStrategy.NONE;
            }
            o0OOO0o o0ooo0o2 = o000oo1.f37682OooOoOO;
            ArrayList arrayListOooO0O0 = o000o0o2.OooO0O0();
            int size = arrayListOooO0O0.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((o0OoOo0.OooO00o) arrayListOooO0O0.get(i3)).f37912OooO00o.equals(o0ooo0o2)) {
                    z = true;
                    break;
                }
                i3++;
            }
            Object obj = o00ooooOooO00o;
            if (o000oo1.f37673OooOOo0.OooO0Oo(!z, dataSource2, encodeStrategyOooO00o)) {
                if (o000ooo2 == null) {
                    throw new Registry.NoResultEncoderAvailableException(o00ooooOooO00o.get().getClass());
                }
                int i4 = o000Oo0.OooO00o.f37693OooO0OO[encodeStrategyOooO00o.ordinal()];
                if (i4 == 1) {
                    o0000oo1 = new o0000OO0(o000oo1.f37682OooOoOO, o000oo1.f37667OooOO0o);
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyOooO00o);
                    }
                    o0000oo1 = new o00O000o(o000o0o2.f37637OooO0OO.f12930OooO00o, o000oo1.f37682OooOoOO, o000oo1.f37667OooOO0o, o000oo1.f37670OooOOOO, o000oo1.f37671OooOOOo, o000000Var, cls, o000oo1.f37672OooOOo);
                }
                o0O0ooO<Z> o0o0ooo = (o0O0ooO) o0O0ooO.f37728OooO0oo.OooO0O0();
                o00OO00O.OooO0O0(o0o0ooo);
                o0o0ooo.f37732OooO0oO = false;
                o0o0ooo.f37730OooO0o = true;
                o0o0ooo.f37731OooO0o0 = o00ooooOooO00o;
                o000Oo0.OooO0o<?> oooO0o = o000oo1.f37659OooO;
                oooO0o.f37696OooO00o = o0000oo1;
                oooO0o.f37697OooO0O0 = o000ooo2;
                oooO0o.f37698OooO0OO = o0o0ooo;
                obj = o0o0ooo;
            }
            return this.f37585OooO0OO.OooO00o(obj, oo0o0oo);
        } catch (Throwable th) {
            oooO2.OooO00o(list);
            throw th;
        }
    }

    @NonNull
    public final o00oOoo<ResourceType> OooO0O0(com.bumptech.glide.load.data.OooO<DataType> oooO, int i, int i2, @NonNull oo0o0Oo oo0o0oo, List<Throwable> list) throws GlideException {
        List<? extends o0O0O00<DataType, ResourceType>> list2 = this.f37584OooO0O0;
        int size = list2.size();
        o00oOoo<ResourceType> o00ooooOooO0O0 = null;
        for (int i3 = 0; i3 < size; i3++) {
            o0O0O00<DataType, ResourceType> o0o0o00 = list2.get(i3);
            try {
                if (o0o0o00.OooO00o(oooO.OooO00o(), oo0o0oo)) {
                    o00ooooOooO0O0 = o0o0o00.OooO0O0(oooO.OooO00o(), i, i2, oo0o0oo);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + o0o0o00, e);
                }
                list.add(e);
            }
            if (o00ooooOooO0O0 != null) {
                break;
            }
        }
        if (o00ooooOooO0O0 != null) {
            return o00ooooOooO0O0;
        }
        throw new GlideException(this.f37587OooO0o0, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f37583OooO00o + ", decoders=" + this.f37584OooO0O0 + ", transcoder=" + this.f37585OooO0OO + '}';
    }
}
