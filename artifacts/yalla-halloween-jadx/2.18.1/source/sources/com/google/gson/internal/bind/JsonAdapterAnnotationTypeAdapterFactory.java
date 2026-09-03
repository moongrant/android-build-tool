package com.google.gson.internal.bind;

import com.google.gson.annotations.JsonAdapter;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O000;
import p386o0OOoo0O.o00O00o0;
import p386o0OOoo0O.o00O0O00;
import p387o0OOoo0o.o00OO00O;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements o00O0O00 {
    private final o00OO00O constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(o00OO00O o00oo00o) {
        this.constructorConstructor = o00oo00o;
    }

    @Override // p386o0OOoo0O.o00O0O00
    public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
        JsonAdapter jsonAdapter = (JsonAdapter) o00000o1.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (o00O0<T>) getTypeAdapter(this.constructorConstructor, o000ooo1, o00000o1, jsonAdapter);
    }

    public o00O0<?> getTypeAdapter(o00OO00O o00oo00o, o000OOo0 o000ooo1, o00000O0<?> o00000o1, JsonAdapter jsonAdapter) {
        o00O0<?> treeTypeAdapter;
        Object objOooO00o = o00oo00o.OooO00o(o00000O0.get((Class) jsonAdapter.value())).OooO00o();
        if (objOooO00o instanceof o00O0) {
            treeTypeAdapter = (o00O0) objOooO00o;
        } else if (objOooO00o instanceof o00O0O00) {
            treeTypeAdapter = ((o00O0O00) objOooO00o).create(o000ooo1, o00000o1);
        } else {
            boolean z = objOooO00o instanceof o00O00o0;
            if (!z && !(objOooO00o instanceof o00O000)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid attempt to bind an instance of ");
                sbOooO0o0.append(objOooO00o.getClass().getName());
                sbOooO0o0.append(" as a @JsonAdapter for ");
                sbOooO0o0.append(o00000o1.toString());
                sbOooO0o0.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z ? (o00O00o0) objOooO00o : null, objOooO00o instanceof o00O000 ? (o00O000) objOooO00o : null, o000ooo1, o00000o1, null);
        }
        return (treeTypeAdapter == null || !jsonAdapter.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }
}
