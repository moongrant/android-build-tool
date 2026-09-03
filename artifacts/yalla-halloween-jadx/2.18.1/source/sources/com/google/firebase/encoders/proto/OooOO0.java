package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o00O0O;
import p368o0OOo0O.o0OoOo0;
import p370o0OOo0OO.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, o000oOoO<?>> f19102OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, o00O0O<?>> f19103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO<Object> f19104OooO0OO;

    public static final class OooO00o implements Oooo0<OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<Class<?>, o000oOoO<?>> f19105OooO00o = new HashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<Class<?>, o00O0O<?>> f19106OooO0O0 = new HashMap();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000oOoO<Object> f19107OooO0OO = new o000oOoO() { // from class: com.google.firebase.encoders.proto.OooO
            @Override // p368o0OOo0O.Oooo000
            public final void OooO00o(Object obj, o0OoOo0 o0oooo1) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Couldn't find encoder for type ");
                sbOooO0o0.append(obj.getClass().getCanonicalName());
                throw new EncodingException(sbOooO0o0.toString());
            }
        };

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p370o0OOo0OO.Oooo0
        @NonNull
        public final Oooo0 OooO00o(@NonNull Class cls, @NonNull o000oOoO o000oooo2) {
            this.f19105OooO00o.put((Class<?>) cls, (o000oOoO<?>) o000oooo2);
            this.f19106OooO0O0.remove(cls);
            return this;
        }

        public final OooOO0 OooO0O0() {
            return new OooOO0(new HashMap(this.f19105OooO00o), new HashMap(this.f19106OooO0O0), this.f19107OooO0OO);
        }
    }

    public OooOO0(Map<Class<?>, o000oOoO<?>> map, Map<Class<?>, o00O0O<?>> map2, o000oOoO<Object> o000oooo2) {
        this.f19102OooO00o = map;
        this.f19103OooO0O0 = map2;
        this.f19104OooO0OO = o000oooo2;
    }

    public final void OooO00o(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        Map<Class<?>, o000oOoO<?>> map = this.f19102OooO00o;
        OooO0o oooO0o = new OooO0o(outputStream, map, this.f19103OooO0O0, this.f19104OooO0OO);
        if (obj == null) {
            return;
        }
        o000oOoO<?> o000oooo2 = map.get(obj.getClass());
        if (o000oooo2 != null) {
            o000oooo2.OooO00o(obj, oooO0o);
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("No encoder for ");
            sbOooO0o0.append(obj.getClass());
            throw new EncodingException(sbOooO0o0.toString());
        }
    }
}
