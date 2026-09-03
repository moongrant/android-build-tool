package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends o0ooOOo<AtomicLong> {
    final /* synthetic */ o0ooOOo val$longAdapter;

    public OooOO0(o0ooOOo o0ooooo) {
        this.val$longAdapter = o0ooooo;
    }

    @Override // com.google.gson.o0ooOOo
    public AtomicLong read(JsonReader jsonReader) throws IOException {
        return new AtomicLong(((Number) this.val$longAdapter.read(jsonReader)).longValue());
    }

    @Override // com.google.gson.o0ooOOo
    public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        this.val$longAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
    }
}
