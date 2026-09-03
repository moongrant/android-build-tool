package p386o0OOoo0O;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import p387o0OOoo0o.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00O000o {
    public final o00O00O OooO00o() {
        if (this instanceof o00O00O) {
            return (o00O00O) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final oOO00O OooO0O0() {
        if (this instanceof oOO00O) {
            return (oOO00O) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String OooO0OO() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            o00OOOO0.OooO00o(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
