package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes2.dex */
public final class UdpDataSource extends p709oo0oOOo.OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public DatagramSocket f14878OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f14879OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14880OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final DatagramPacket f14881OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Uri f14882OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public MulticastSocket f14883OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public InetAddress f14884OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public InetSocketAddress f14885OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f14886OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f14887OooOOO0;

    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f14880OooO0o0 = 8000;
        byte[] bArr = new byte[RecyclerView.MAX_SCROLL_DURATION];
        this.f14879OooO0o = bArr;
        this.f14881OooO0oO = new DatagramPacket(bArr, 0, RecyclerView.MAX_SCROLL_DURATION);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.f14801OooO00o;
        this.f14882OooO0oo = uri;
        String host = uri.getHost();
        int port = this.f14882OooO0oo.getPort();
        OooOOo0(dataSpec);
        try {
            this.f14884OooOO0O = InetAddress.getByName(host);
            this.f14885OooOO0o = new InetSocketAddress(this.f14884OooOO0O, port);
            if (this.f14884OooOO0O.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f14885OooOO0o);
                this.f14883OooOO0 = multicastSocket;
                multicastSocket.joinGroup(this.f14884OooOO0O);
                this.f14878OooO = this.f14883OooOO0;
            } else {
                this.f14878OooO = new DatagramSocket(this.f14885OooOO0o);
            }
            try {
                this.f14878OooO.setSoTimeout(this.f14880OooO0o0);
                this.f14887OooOOO0 = true;
                OooOOo(dataSpec);
                return -1L;
            } catch (SocketException e) {
                throw new UdpDataSourceException(e);
            }
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        return this.f14882OooO0oo;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() {
        this.f14882OooO0oo = null;
        MulticastSocket multicastSocket = this.f14883OooOO0;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f14884OooOO0O);
            } catch (IOException unused) {
            }
            this.f14883OooOO0 = null;
        }
        DatagramSocket datagramSocket = this.f14878OooO;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14878OooO = null;
        }
        this.f14884OooOO0O = null;
        this.f14885OooOO0o = null;
        this.f14886OooOOO = 0;
        if (this.f14887OooOOO0) {
            this.f14887OooOOO0 = false;
            OooOOOo();
        }
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f14886OooOOO == 0) {
            try {
                this.f14878OooO.receive(this.f14881OooO0oO);
                int length = this.f14881OooO0oO.getLength();
                this.f14886OooOOO = length;
                OooOOOO(length);
            } catch (IOException e) {
                throw new UdpDataSourceException(e);
            }
        }
        int length2 = this.f14881OooO0oO.getLength();
        int i3 = this.f14886OooOOO;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f14879OooO0o, length2 - i3, bArr, i, iMin);
        this.f14886OooOOO -= iMin;
        return iMin;
    }
}
