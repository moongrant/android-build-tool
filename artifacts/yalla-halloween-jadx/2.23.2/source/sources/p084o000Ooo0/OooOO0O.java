package p084o000Ooo0;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p080o000OoO.o000O000;
import p081o000OoOO.o00000OO;
import p081o000OoOO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOO0O extends o0000Ooo {
    @Override // p081o000OoOO.o0000Ooo
    public final Metadata OooO0O0(o00000OO o00000oo2, ByteBuffer byteBuffer) {
        o000O000 o000o001 = new o000O000(byteBuffer.array(), byteBuffer.limit());
        String strOooOOOo = o000o001.OooOOOo();
        strOooOOOo.getClass();
        String strOooOOOo2 = o000o001.OooOOOo();
        strOooOOOo2.getClass();
        return new Metadata(new EventMessage(strOooOOOo, strOooOOOo2, o000o001.OooOOOO(), o000o001.OooOOOO(), Arrays.copyOfRange(o000o001.f34962OooO00o, o000o001.f34963OooO0O0, o000o001.f34964OooO0OO)));
    }
}
