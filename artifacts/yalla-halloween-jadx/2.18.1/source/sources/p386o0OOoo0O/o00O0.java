package p386o0OOoo0O;

import com.google.gson.JsonIOException;
import com.google.gson.internal.bind.OooO0O0;
import com.google.gson.internal.bind.OooO0OO;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00O0<T> {

    public class OooO00o extends o00O0<T> {
        public OooO00o() {
        }

        @Override // p386o0OOoo0O.o00O0
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) o00O0.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                o00O0.this.write(jsonWriter, t);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(o00O000o o00o000o2) {
        try {
            return read(new OooO0O0(o00o000o2));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final o00O0<T> nullSafe() {
        return new OooO00o();
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new JsonWriter(writer), t);
    }

    public final o00O000o toJsonTree(T t) {
        try {
            OooO0OO oooO0OO = new OooO0OO();
            write(oooO0OO, t);
            return oooO0OO.OooO00o();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
