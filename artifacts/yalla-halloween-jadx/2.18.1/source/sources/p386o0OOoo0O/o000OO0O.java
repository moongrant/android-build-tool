package p386o0OOoo0O;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO0O extends o00O0<Number> {
    public final /* synthetic */ o000OOo0 this$0;

    public o000OO0O(o000OOo0 o000ooo1) {
        this.this$0 = o000ooo1;
    }

    @Override // p386o0OOoo0O.o00O0
    public Number read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            o000OOo0.OooO00o(number.floatValue());
            jsonWriter.value(number);
        }
    }
}
