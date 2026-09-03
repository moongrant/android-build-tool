package p302o0O0o00;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ts.OooO0OO;
import com.google.firebase.encoders.proto.OooOO0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import o0O0O0Oo.OooO0o;
import p296o0O0OoO0.o00O0O;
import p381o0OOoOOO.o00OO000;
import p383o0OOoOo0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo0 implements o00O0O, OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ o000OOo0 f36073OooO0Oo = new o000OOo0();

    public final Extractor[] OooO00o() {
        return new Extractor[]{new OooO0OO()};
    }

    @Override // p296o0O0OoO0.o00O0O
    public final Extractor[] OooO0O0(Uri uri, Map map) {
        return OooO00o();
    }

    @Override // o0O0O0Oo.OooO0o
    public final Object apply(Object obj) {
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        Objects.requireNonNull(o0oooo1);
        OooOO0 oooOO1 = o00OO000.f38773OooO00o;
        Objects.requireNonNull(oooOO1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            oooOO1.OooO00o(o0oooo1, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
