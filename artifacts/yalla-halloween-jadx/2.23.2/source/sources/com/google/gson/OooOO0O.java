package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends o0OOO0o<AtomicLongArray> {
    final /* synthetic */ o0OOO0o val$longAdapter;

    public OooOO0O(o0OOO0o o0ooo0o2) {
        this.val$longAdapter = o0ooo0o2;
    }

    @Override // com.google.gson.o0OOO0o
    public AtomicLongArray read(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(Long.valueOf(((Number) this.val$longAdapter.read(jsonReader)).longValue()));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
        jsonWriter.beginArray();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.val$longAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
        }
        jsonWriter.endArray();
    }
}
