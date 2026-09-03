package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes5.dex */
public final class UploadDataProviders {

    public static final class OooO extends UploadDataProvider {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile FileChannel f60456OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Object f60457OooO0o = new Object();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0o f60458OooO0o0;

        public OooO(OooO0o oooO0o) {
            this.f60458OooO0o0 = oooO0o;
        }

        public final FileChannel OooO00o() throws IOException {
            if (this.f60456OooO0Oo == null) {
                synchronized (this.f60457OooO0o) {
                    if (this.f60456OooO0Oo == null) {
                        this.f60456OooO0Oo = this.f60458OooO0o0.getChannel();
                    }
                }
            }
            return this.f60456OooO0Oo;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileChannel fileChannel = this.f60456OooO0Oo;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() throws IOException {
            return OooO00o().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelOooO00o = OooO00o();
            int i = 0;
            while (i == 0) {
                int i2 = fileChannelOooO00o.read(byteBuffer);
                if (i2 == -1) {
                    break;
                } else {
                    i += i2;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) throws IOException {
            OooO00o().position(0L);
            uploadDataSink.onRewindSucceeded();
        }
    }

    public static class OooO00o implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ File f60459OooO00o;

        public OooO00o(File file) {
            this.f60459OooO00o = file;
        }

        @Override // org.chromium.net.UploadDataProviders.OooO0o
        public final FileChannel getChannel() throws IOException {
            return new FileInputStream(this.f60459OooO00o).getChannel();
        }
    }

    public static class OooO0O0 implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f60460OooO00o;

        public OooO0O0(ParcelFileDescriptor parcelFileDescriptor) {
            this.f60460OooO00o = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.OooO0o
        public final FileChannel getChannel() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f60460OooO00o;
            if (parcelFileDescriptor.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
            }
            parcelFileDescriptor.close();
            throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
        }
    }

    public static final class OooO0OO extends UploadDataProvider {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ByteBuffer f60461OooO0Oo;

        public OooO0OO(ByteBuffer byteBuffer) {
            this.f60461OooO0Oo = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return this.f60461OooO0Oo.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.f60461OooO0Oo;
            if (iRemaining >= byteBuffer2.remaining()) {
                byteBuffer.put(byteBuffer2);
            } else {
                int iLimit = byteBuffer2.limit();
                byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
                byteBuffer.put(byteBuffer2);
                byteBuffer2.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) {
            this.f60461OooO0Oo.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }

    public interface OooO0o {
        FileChannel getChannel() throws IOException;
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new OooO(new OooO00o(file));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new OooO(new OooO0O0(parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new OooO0OO(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new OooO0OO(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
