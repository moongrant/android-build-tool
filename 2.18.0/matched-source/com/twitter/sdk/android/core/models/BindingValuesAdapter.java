package com.twitter.sdk.android.core.models;

import com.google.gson.JsonParseException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.lang.reflect.Type;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p388o0OOoo0O.o00O000;
import p388o0OOoo0O.o00O000o;
import p388o0OOoo0O.o00O00O;
import p388o0OOoo0O.o00O00OO;
import p388o0OOoo0O.o00O00o0;
import p388o0OOoo0O.o00oOoo;
import p388o0OOoo0O.oOO00O;
import p439o0OoOOOO.o0O00O0o;
import p439o0OoOOOO.o0O0O0O;
import p439o0OoOOOO.o0OoOoOo;

/* JADX INFO: loaded from: classes2.dex */
public class BindingValuesAdapter implements o00O00o0<o0OoOoOo>, o00O000<o0OoOoOo> {
    private static final String BOOLEAN_MEMBER = "boolean_value";
    private static final String BOOLEAN_TYPE = "BOOLEAN";
    private static final String IMAGE_TYPE = "IMAGE";
    private static final String IMAGE_VALUE_MEMBER = "image_value";
    private static final String STRING_TYPE = "STRING";
    private static final String TYPE_MEMBER = "type";
    private static final String TYPE_VALUE_MEMBER = "string_value";
    private static final String USER_TYPE = "USER";
    private static final String USER_VALUE_MEMBER = "user_value";

    public Object getValue(o00O00O o00o00o2, o00oOoo o00oooo2) {
        o00O000o o00o000oOooO0oo = o00o00o2.OooO0oo("type");
        if (o00o000oOooO0oo == null || !(o00o000oOooO0oo instanceof oOO00O)) {
            return null;
        }
        String strOooO0OO = o00o000oOooO0oo.OooO0OO();
        Objects.requireNonNull(strOooO0OO);
        switch (strOooO0OO) {
            case "STRING":
                return ((TreeTypeAdapter.OooO00o) o00oooo2).OooO00o(o00o00o2.OooO0oo(TYPE_VALUE_MEMBER), String.class);
            case "USER":
                return ((TreeTypeAdapter.OooO00o) o00oooo2).OooO00o(o00o00o2.OooO0oo(USER_VALUE_MEMBER), o0O0O0O.class);
            case "IMAGE":
                return ((TreeTypeAdapter.OooO00o) o00oooo2).OooO00o(o00o00o2.OooO0oo(IMAGE_VALUE_MEMBER), o0O00O0o.class);
            case "BOOLEAN":
                return ((TreeTypeAdapter.OooO00o) o00oooo2).OooO00o(o00o00o2.OooO0oo(BOOLEAN_MEMBER), Boolean.class);
            default:
                return null;
        }
    }

    @Override // p388o0OOoo0O.o00O00o0
    public o00O000o serialize(o0OoOoOo o0oooooo2, Type type, o00O00OO o00o00oo2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p388o0OOoo0O.o00O000
    public o0OoOoOo deserialize(o00O000o o00o000o2, Type type, o00oOoo o00oooo2) throws JsonParseException {
        Objects.requireNonNull(o00o000o2);
        if (!(o00o000o2 instanceof o00O00O)) {
            return new o0OoOoOo();
        }
        Set<Map.Entry<String, o00O000o>> setEntrySet = o00o000o2.OooO00o().entrySet();
        HashMap map = new HashMap(32);
        LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
        LinkedTreeMap.OooO oooO = linkedTreeMap.f19244OoooO.f19254OoooO0O;
        int i = linkedTreeMap.f19247OoooO0O;
        while (true) {
            if (!(oooO != linkedTreeMap.f19244OoooO)) {
                return new o0OoOoOo(map);
            }
            if (oooO == linkedTreeMap.f19244OoooO) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f19247OoooO0O != i) {
                throw new ConcurrentModificationException();
            }
            LinkedTreeMap.OooO oooO2 = oooO.f19254OoooO0O;
            map.put((String) oooO.getKey(), getValue(((o00O000o) oooO.getValue()).OooO00o(), o00oooo2));
            oooO = oooO2;
        }
    }
}
