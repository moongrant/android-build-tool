package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class UdpDataSource extends o000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public DatagramSocket f7029OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f7030OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f7031OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final DatagramPacket f7032OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Uri f7033OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public MulticastSocket f7034OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public InetAddress f7035OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f7036OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f7037OooOOO0;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(int i, Exception exc) {
            super(i, exc);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f7031OooO0o0 = 8000;
        byte[] bArr = new byte[2000];
        this.f7030OooO0o = bArr;
        this.f7032OooO0oO = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.f6970OooO00o;
        this.f7033OooO0oo = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f7033OooO0oo.getPort();
        OooOOO(dataSpec);
        try {
            this.f7035OooOO0O = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f7035OooOO0O, port);
            if (this.f7035OooOO0O.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f7034OooOO0 = multicastSocket;
                multicastSocket.joinGroup(this.f7035OooOO0O);
                this.f7029OooO = this.f7034OooOO0;
            } else {
                this.f7029OooO = new DatagramSocket(inetSocketAddress);
            }
            this.f7029OooO.setSoTimeout(this.f7031OooO0o0);
            this.f7036OooOO0o = true;
            OooOOOO(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(ZegoConstants.StreamUpdateType.Added, e);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(2006, e2);
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f7033OooO0oo;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() {
        this.f7033OooO0oo = null;
        MulticastSocket multicastSocket = this.f7034OooOO0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f7035OooOO0O;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f7034OooOO0 = null;
        }
        DatagramSocket datagramSocket = this.f7029OooO;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f7029OooO = null;
        }
        this.f7035OooOO0O = null;
        this.f7037OooOOO0 = 0;
        if (this.f7036OooOO0o) {
            this.f7036OooOO0o = false;
            OooOOO0();
        }
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f7037OooOOO0;
        DatagramPacket datagramPacket = this.f7032OooO0oO;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f7029OooO;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f7037OooOOO0 = length;
                OooOO0o(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(ZegoConstants.StreamUpdateType.Deleted, e);
            } catch (IOException e2) {
                throw new UdpDataSourceException(ZegoConstants.StreamUpdateType.Added, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f7037OooOOO0;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f7030OooO0o, length2 - i4, bArr, i, iMin);
        this.f7037OooOOO0 -= iMin;
        return iMin;
    }
}
