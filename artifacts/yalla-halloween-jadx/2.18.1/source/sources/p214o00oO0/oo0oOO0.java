package p214o00oO0;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o000OO0O.OooO;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000;
import p217o00oO00o.o00000O;
import p217o00oO00o.o00000O0;
import p217o00oO00o.o00000OO;
import p230o00oOo0O.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class oo0oOO0<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<DataType> f33592OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends o00000O0<DataType, ResourceType>> f33593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00<ResourceType, Transcode> f33594OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO<List<Throwable>> f33595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f33596OooO0o0;

    public interface OooO00o<ResourceType> {
    }

    public oo0oOO0(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends o00000O0<DataType, ResourceType>> list, OooOo00<ResourceType, Transcode> oooOo00, OooO<List<Throwable>> oooO) {
        this.f33592OooO00o = cls;
        this.f33593OooO0O0 = list;
        this.f33594OooO0OO = oooOo00;
        this.f33595OooO0Oo = oooO;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed DecodePath{");
        sbOooO0o0.append(cls.getSimpleName());
        sbOooO0o0.append("->");
        sbOooO0o0.append(cls2.getSimpleName());
        sbOooO0o0.append("->");
        sbOooO0o0.append(cls3.getSimpleName());
        sbOooO0o0.append("}");
        this.f33596OooO0o0 = sbOooO0o0.toString();
    }

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
    public final o00OOOO0<Transcode> OooO00o(com.bumptech.glide.load.data.OooO<DataType> oooO, int i, int i2, @NonNull o00000 o00000Var, OooO00o<ResourceType> oooO00o) throws GlideException {
        o00OOOO0<ResourceType> o00oooo0OooO0O0;
        o00000OO o00000oo2;
        EncodeStrategy encodeStrategyOooO00o;
        o000000 o00o0o01;
        List<Throwable> listOooO0O0 = this.f33595OooO0Oo.OooO0O0();
        Objects.requireNonNull(listOooO0O0, "Argument must not be null");
        List<Throwable> list = listOooO0O0;
        try {
            o00OOOO0<ResourceType> o00oooo0OooO0O1 = OooO0O0(oooO, i, i2, o00000Var, list);
            this.f33595OooO0Oo.OooO00o(list);
            oo0o0O0.OooO0OO oooO0OO = (oo0o0O0.OooO0OO) oooO00o;
            oo0o0O0 oo0o0o0 = oo0o0O0.this;
            DataSource dataSource = oooO0OO.f33584OooO00o;
            Objects.requireNonNull(oo0o0o0);
            Class<?> cls = o00oooo0OooO0O1.get().getClass();
            o00000O o00000oOooO00o = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                o00000OO o00000ooOooO0o = oo0o0o0.f33550Oooo0o.OooO0o(cls);
                o00000oo2 = o00000ooOooO0o;
                o00oooo0OooO0O0 = o00000ooOooO0o.OooO0O0(oo0o0o0.f33553OoooO, o00oooo0OooO0O1, oo0o0o0.f33559OoooOOo, oo0o0o0.f33560OoooOo0);
            } else {
                o00oooo0OooO0O0 = o00oooo0OooO0O1;
                o00000oo2 = null;
            }
            if (!o00oooo0OooO0O1.equals(o00oooo0OooO0O0)) {
                o00oooo0OooO0O1.OooO00o();
            }
            boolean z = false;
            if (oo0o0o0.f33550Oooo0o.f33418OooO0OO.f12361OooO0O0.f12431OooO0Oo.OooO00o(o00oooo0OooO0O0.OooO0OO()) != null) {
                o00000oOooO00o = oo0o0o0.f33550Oooo0o.f33418OooO0OO.f12361OooO0O0.f12431OooO0Oo.OooO00o(o00oooo0OooO0O0.OooO0OO());
                if (o00000oOooO00o == null) {
                    throw new Registry.NoResultEncoderAvailableException(o00oooo0OooO0O0.OooO0OO());
                }
                encodeStrategyOooO00o = o00000oOooO00o.OooO00o(oo0o0o0.f33562OoooOoo);
            } else {
                encodeStrategyOooO00o = EncodeStrategy.NONE;
            }
            o00000O o00000o = o00000oOooO00o;
            o00O0OO0<R> o00o0oo1 = oo0o0o0.f33550Oooo0o;
            o000000 o000000Var = oo0o0o0.f33571Ooooooo;
            ArrayList arrayList = (ArrayList) o00o0oo1.OooO0OO();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((o00oOO.o00000O0.OooO00o) arrayList.get(i3)).f33696OooO00o.equals(o000000Var)) {
                    z = true;
                    break;
                }
            }
            Object obj = o00oooo0OooO0O0;
            if (oo0o0o0.f33561OoooOoO.OooO0Oo(!z, dataSource, encodeStrategyOooO00o)) {
                if (o00000o == null) {
                    throw new Registry.NoResultEncoderAvailableException(o00oooo0OooO0O0.get().getClass());
                }
                int i4 = oo0o0O0.OooO00o.f33583OooO0OO[encodeStrategyOooO00o.ordinal()];
                if (i4 == 1) {
                    o00o0o01 = new o00O0O00(oo0o0o0.f33571Ooooooo, oo0o0o0.f33557OoooOO0);
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyOooO00o);
                    }
                    o00o0o01 = new o00Oo00(oo0o0o0.f33550Oooo0o.f33418OooO0OO.f12360OooO00o, oo0o0o0.f33571Ooooooo, oo0o0o0.f33557OoooOO0, oo0o0o0.f33559OoooOOo, oo0o0o0.f33560OoooOo0, o00000oo2, cls, oo0o0o0.f33562OoooOoo);
                }
                o0o0Oo<Z> o0o0ooOooO0Oo = o0o0Oo.OooO0Oo(o00oooo0OooO0O0);
                oo0o0O0.OooO0o<?> oooO0o = oo0o0o0.f33554OoooO0;
                oooO0o.f33586OooO00o = o00o0o01;
                oooO0o.f33587OooO0O0 = o00000o;
                oooO0o.f33588OooO0OO = o0o0ooOooO0Oo;
                obj = o0o0ooOooO0Oo;
            }
            return this.f33594OooO0OO.OooO00o(obj, o00000Var);
        } catch (Throwable th) {
            this.f33595OooO0Oo.OooO00o(list);
            throw th;
        }
    }

    @NonNull
    public final o00OOOO0<ResourceType> OooO0O0(com.bumptech.glide.load.data.OooO<DataType> oooO, int i, int i2, @NonNull o00000 o00000Var, List<Throwable> list) throws GlideException {
        int size = this.f33593OooO0O0.size();
        o00OOOO0<ResourceType> o00oooo0OooO00o = null;
        for (int i3 = 0; i3 < size; i3++) {
            o00000O0<DataType, ResourceType> o00000o1 = this.f33593OooO0O0.get(i3);
            try {
                if (o00000o1.OooO0O0(oooO.OooO00o(), o00000Var)) {
                    o00oooo0OooO00o = o00000o1.OooO00o(oooO.OooO00o(), i, i2, o00000Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + o00000o1, e);
                }
                list.add(e);
            }
            if (o00oooo0OooO00o != null) {
                break;
            }
        }
        if (o00oooo0OooO00o != null) {
            return o00oooo0OooO00o;
        }
        throw new GlideException(this.f33596OooO0o0, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DecodePath{ dataClass=");
        sbOooO0o0.append(this.f33592OooO00o);
        sbOooO0o0.append(", decoders=");
        sbOooO0o0.append(this.f33593OooO0O0);
        sbOooO0o0.append(", transcoder=");
        sbOooO0o0.append(this.f33594OooO0OO);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
