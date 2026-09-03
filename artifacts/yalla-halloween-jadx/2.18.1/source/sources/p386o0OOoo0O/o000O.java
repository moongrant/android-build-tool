package p386o0OOoo0O;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O extends o00O0<AtomicLong> {
    public final /* synthetic */ o00O0 val$longAdapter;

    public o000O(o00O0 o00o1) {
        this.val$longAdapter = o00o1;
    }

    @Override // p386o0OOoo0O.o00O0
    public AtomicLong read(JsonReader jsonReader) throws IOException {
        return new AtomicLong(((Number) this.val$longAdapter.read(jsonReader)).longValue());
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        this.val$longAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
    }
}
