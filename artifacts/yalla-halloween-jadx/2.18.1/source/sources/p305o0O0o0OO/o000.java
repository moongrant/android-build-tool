package p305o0O0o0OO;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import o0O0o0.OooO;
import o0O0o0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 extends OooO {
    @Override // o0O0o0.OooO
    public final Metadata OooO0O0(OooO0OO oooO0OO, ByteBuffer byteBuffer) {
        p318o0O0oOo.o000 o000Var = new p318o0O0oOo.o000(byteBuffer.array(), byteBuffer.limit());
        String strOooOO0o = o000Var.OooOO0o();
        Objects.requireNonNull(strOooOO0o);
        String strOooOO0o2 = o000Var.OooOO0o();
        Objects.requireNonNull(strOooOO0o2);
        return new Metadata(new EventMessage(strOooOO0o, strOooOO0o2, o000Var.OooOOo(), o000Var.OooOOo(), Arrays.copyOfRange(o000Var.f36661OooO00o, o000Var.f36662OooO0O0, o000Var.f36663OooO0OO)));
    }
}
