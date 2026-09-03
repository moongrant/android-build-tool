package com.google.gson.internal.bind;

import com.google.gson.OooOOO0;
import com.google.gson.Oooo000;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.OooOo00;
import com.google.gson.o00oO0o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements o0Oo0oo {
    private final OooOo00 constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(OooOo00 oooOo00) {
        this.constructorConstructor = oooOo00;
    }

    @Override // com.google.gson.o0Oo0oo
    public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (o0OOO0o<T>) getTypeAdapter(this.constructorConstructor, oooOOO0, typeToken, jsonAdapter);
    }

    public o0OOO0o<?> getTypeAdapter(OooOo00 oooOo00, OooOOO0 oooOOO0, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        o0OOO0o<?> treeTypeAdapter;
        Object objOooO00o = oooOo00.OooO00o(TypeToken.get((Class) jsonAdapter.value())).OooO00o();
        if (objOooO00o instanceof o0OOO0o) {
            treeTypeAdapter = (o0OOO0o) objOooO00o;
        } else if (objOooO00o instanceof o0Oo0oo) {
            treeTypeAdapter = ((o0Oo0oo) objOooO00o).create(oooOOO0, typeToken);
        } else {
            boolean z = objOooO00o instanceof o00oO0o;
            if (!z && !(objOooO00o instanceof Oooo000)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objOooO00o.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z ? (o00oO0o) objOooO00o : null, objOooO00o instanceof Oooo000 ? (Oooo000) objOooO00o : null, oooOOO0, typeToken, null);
        }
        return (treeTypeAdapter == null || !jsonAdapter.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }
}
