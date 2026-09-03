package com.jeremyliao.liveeventbus.ipc.json;

import com.google.gson.JsonSyntaxException;
import p386o0OOoo0O.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public class GsonConverter implements JsonConverter {
    private o000OOo0 gson = new o000OOo0();

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) this.gson.OooO0OO(str, cls);
    }

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public String toJson(Object obj) {
        return this.gson.OooO0oo(obj);
    }
}
