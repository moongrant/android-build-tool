package com.jeremyliao.liveeventbus.ipc.json;

import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public class GsonConverter implements JsonConverter {
    private OooOOO0 gson = new OooOOO0();

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) this.gson.OooO0OO(str, cls);
    }

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public String toJson(Object obj) {
        return this.gson.OooO0oo(obj);
    }
}
