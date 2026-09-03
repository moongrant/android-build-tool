package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p244o00oo0Oo.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class UdpDataSource extends o000OO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public DatagramSocket f14260OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f14261OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14262OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final DatagramPacket f14263OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Uri f14264OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public MulticastSocket f14265OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public InetAddress f14266OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14267OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14268OooOOO0;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(int i, Exception exc) {
            super(i, exc);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f14262OooO0o0 = 8000;
        byte[] bArr = new byte[2000];
        this.f14261OooO0o = bArr;
        this.f14263OooO0oO = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.f14161OooO00o;
        this.f14264OooO0oo = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f14264OooO0oo.getPort();
        OooOOO(dataSpec);
        try {
            this.f14266OooOO0O = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f14266OooOO0O, port);
            if (this.f14266OooOO0O.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f14265OooOO0 = multicastSocket;
                multicastSocket.joinGroup(this.f14266OooOO0O);
                this.f14260OooO = this.f14265OooOO0;
            } else {
                this.f14260OooO = new DatagramSocket(inetSocketAddress);
            }
            this.f14260OooO.setSoTimeout(this.f14262OooO0o0);
            this.f14267OooOO0o = true;
            OooOOOO(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(ZegoConstants.StreamUpdateType.Added, e);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(2006, e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f14264OooO0oo;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() {
        this.f14264OooO0oo = null;
        MulticastSocket multicastSocket = this.f14265OooOO0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f14266OooOO0O;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f14265OooOO0 = null;
        }
        DatagramSocket datagramSocket = this.f14260OooO;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14260OooO = null;
        }
        this.f14266OooOO0O = null;
        this.f14268OooOOO0 = 0;
        if (this.f14267OooOO0o) {
            this.f14267OooOO0o = false;
            OooOOO0();
        }
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f14268OooOOO0;
        DatagramPacket datagramPacket = this.f14263OooO0oO;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f14260OooO;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f14268OooOOO0 = length;
                OooOO0o(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(ZegoConstants.StreamUpdateType.Deleted, e);
            } catch (IOException e2) {
                throw new UdpDataSourceException(ZegoConstants.StreamUpdateType.Added, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f14268OooOOO0;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f14261OooO0o, length2 - i4, bArr, i, iMin);
        this.f14268OooOOO0 -= iMin;
        return iMin;
    }
}
