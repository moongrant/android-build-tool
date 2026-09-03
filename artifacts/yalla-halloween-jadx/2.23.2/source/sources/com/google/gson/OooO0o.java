package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends o0OOO0o<Number> {
    final /* synthetic */ OooOOO0 this$0;

    public OooO0o(OooOOO0 oooOOO0) {
        this.this$0 = oooOOO0;
    }

    @Override // com.google.gson.o0OOO0o
    public Number read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            OooOOO0.OooO00o(number.floatValue());
            jsonWriter.value(number);
        }
    }
}
