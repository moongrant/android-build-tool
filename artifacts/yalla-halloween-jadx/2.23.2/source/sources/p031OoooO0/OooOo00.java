package p031OoooO0;

import androidx.annotation.RequiresApi;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOo00 extends FilterOutputStream {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OutputStream f1365OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ByteOrder f1366OooO0o0;

    public OooOo00(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f1365OooO0Oo = outputStream;
        this.f1366OooO0o0 = byteOrder;
    }

    public final void OooO00o(int i) throws IOException {
        ByteOrder byteOrder = this.f1366OooO0o0;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f1365OooO0Oo;
        if (byteOrder == byteOrder2) {
            outputStream.write((i >>> 0) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i >>> 24) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 0) & 255);
        }
    }

    public final void OooO0OO(short s) throws IOException {
        ByteOrder byteOrder = this.f1366OooO0o0;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f1365OooO0Oo;
        if (byteOrder == byteOrder2) {
            outputStream.write((s >>> 0) & 255);
            outputStream.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s >>> 8) & 255);
            outputStream.write((s >>> 0) & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f1365OooO0Oo.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f1365OooO0Oo.write(bArr, i, i2);
    }
}
