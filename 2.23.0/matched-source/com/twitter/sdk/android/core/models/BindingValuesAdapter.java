package com.twitter.sdk.android.core.models;

import com.google.gson.JsonParseException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.o00Oo0;
import com.google.gson.o00Ooo;
import com.google.gson.oo000o;
import java.lang.reflect.Type;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class BindingValuesAdapter implements oo000o<OooO0OO>, com.google.gson.Oooo000<OooO0OO> {
    private static final String BOOLEAN_MEMBER = "boolean_value";
    private static final String BOOLEAN_TYPE = "BOOLEAN";
    private static final String IMAGE_TYPE = "IMAGE";
    private static final String IMAGE_VALUE_MEMBER = "image_value";
    private static final String STRING_TYPE = "STRING";
    private static final String TYPE_MEMBER = "type";
    private static final String TYPE_VALUE_MEMBER = "string_value";
    private static final String USER_TYPE = "USER";
    private static final String USER_VALUE_MEMBER = "user_value";

    public Object getValue(com.google.gson.o0OoOo0 o0oooo0, com.google.gson.OooOo oooOo) {
        com.google.gson.Oooo0 oooo0OooO0o = o0oooo0.OooO0o("type");
        if (oooo0OooO0o == null || !(oooo0OooO0o instanceof o00Oo0)) {
            return null;
        }
        String strOooO0O0 = oooo0OooO0o.OooO0O0();
        strOooO0O0.getClass();
        switch (strOooO0O0) {
            case "STRING":
                return ((TreeTypeAdapter.OooO00o) oooOo).OooO00o(o0oooo0.OooO0o(TYPE_VALUE_MEMBER), String.class);
            case "USER":
                return ((TreeTypeAdapter.OooO00o) oooOo).OooO00o(o0oooo0.OooO0o(USER_VALUE_MEMBER), o0OoOo0.class);
            case "IMAGE":
                return ((TreeTypeAdapter.OooO00o) oooOo).OooO00o(o0oooo0.OooO0o(IMAGE_VALUE_MEMBER), OooOOO0.class);
            case "BOOLEAN":
                return ((TreeTypeAdapter.OooO00o) oooOo).OooO00o(o0oooo0.OooO0o(BOOLEAN_MEMBER), Boolean.class);
            default:
                return null;
        }
    }

    @Override // com.google.gson.oo000o
    public com.google.gson.Oooo0 serialize(OooO0OO oooO0OO, Type type, o00Ooo o00ooo2) {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.Oooo000
    public OooO0OO deserialize(com.google.gson.Oooo0 oooo0, Type type, com.google.gson.OooOo oooOo) throws JsonParseException {
        oooo0.getClass();
        if (!(oooo0 instanceof com.google.gson.o0OoOo0)) {
            return new OooO0OO();
        }
        LinkedTreeMap.OooO0O0 OooO0o1 = oooo0.OooO00o().OooO0o0();
        HashMap map = new HashMap(32);
        LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
        LinkedTreeMap.OooO oooO = linkedTreeMap.f20610OooO0oo.f20616OooO0oO;
        int i = linkedTreeMap.f20609OooO0oO;
        while (true) {
            if (!(oooO != linkedTreeMap.f20610OooO0oo)) {
                return new OooO0OO(map);
            }
            if (oooO == linkedTreeMap.f20610OooO0oo) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f20609OooO0oO != i) {
                throw new ConcurrentModificationException();
            }
            LinkedTreeMap.OooO oooO2 = oooO.f20616OooO0oO;
            map.put((String) oooO.getKey(), getValue(((com.google.gson.Oooo0) oooO.getValue()).OooO00o(), oooOo));
            oooO = oooO2;
        }
    }
}
