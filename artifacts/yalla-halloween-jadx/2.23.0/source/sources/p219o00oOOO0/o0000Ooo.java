package p219o00oOOO0;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteArrayOutputStream f39743OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DataOutputStream f39744OooO0O0;

    public o0000Ooo() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
        this.f39743OooO00o = byteArrayOutputStream;
        this.f39744OooO0O0 = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] OooO00o(EventMessage eventMessage) {
        ByteArrayOutputStream byteArrayOutputStream = this.f39743OooO00o;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = this.f39744OooO0O0;
        try {
            dataOutputStream.writeBytes(eventMessage.f12547OooO0Oo);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f12549OooO0o0;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(eventMessage.f12548OooO0o);
            dataOutputStream.writeLong(eventMessage.f12550OooO0oO);
            dataOutputStream.write(eventMessage.f12551OooO0oo);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
