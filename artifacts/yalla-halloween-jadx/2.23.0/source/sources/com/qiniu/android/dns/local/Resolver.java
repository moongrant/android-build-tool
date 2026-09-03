package com.qiniu.android.dns.local;

import com.google.android.gms.common.ConnectionResult;
import com.qiniu.android.dns.DnsException;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class Resolver implements IResolver {
    private static final Random random = new Random();
    final InetAddress address;
    private final int timeout;

    public Resolver(InetAddress inetAddress) {
        this(inetAddress, 10);
    }

    private byte[] udpCommunicate(byte[] bArr) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, this.address, 53);
                datagramSocket2.setSoTimeout(this.timeout * 1000);
                datagramSocket2.send(datagramPacket);
                DatagramPacket datagramPacket2 = new DatagramPacket(new byte[ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED], ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                datagramSocket2.receive(datagramPacket2);
                byte[] data = datagramPacket2.getData();
                datagramSocket2.close();
                return data;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.qiniu.android.dns.IResolver
    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws Throwable {
        int iNextInt;
        Random random2 = random;
        synchronized (random2) {
            iNextInt = random2.nextInt() & 255;
        }
        byte[] bArrUdpCommunicate = udpCommunicate(DnsMessage.buildQuery(domain.domain, iNextInt));
        if (bArrUdpCommunicate != null) {
            return DnsMessage.parseResponse(bArrUdpCommunicate, iNextInt, domain.domain);
        }
        throw new DnsException(domain.domain, "cant get answer");
    }

    public Resolver(InetAddress inetAddress, int i) {
        this.address = inetAddress;
        this.timeout = i;
    }
}
