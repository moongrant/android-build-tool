package com.jeremyliao.liveeventbus.ipc.json;

/* JADX INFO: loaded from: classes4.dex */
public interface JsonConverter {
    <T> T fromJson(String str, Class<T> cls);

    String toJson(Object obj);
}
