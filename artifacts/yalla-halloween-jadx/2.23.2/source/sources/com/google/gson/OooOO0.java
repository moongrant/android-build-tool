package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends o0OOO0o<AtomicLong> {
    final /* synthetic */ o0OOO0o val$longAdapter;

    public OooOO0(o0OOO0o o0ooo0o2) {
        this.val$longAdapter = o0ooo0o2;
    }

    @Override // com.google.gson.o0OOO0o
    public AtomicLong read(JsonReader jsonReader) throws IOException {
        return new AtomicLong(((Number) this.val$longAdapter.read(jsonReader)).longValue());
    }

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        this.val$longAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
    }
}
