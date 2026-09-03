package com.qiniu.android.dns.local;

import OooO0o.OooO0OO;
import com.qiniu.android.dns.DnsException;
import com.qiniu.android.dns.Record;
import com.qiniu.android.dns.util.BitSet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import kotlin.KotlinVersion;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class DnsMessage {
    public static byte[] buildQuery(String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        BitSet bitSet = new BitSet();
        bitSet.set(8);
        try {
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeShort((short) bitSet.value());
            dataOutputStream.writeShort(1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
            writeQuestion(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static Record[] parseResponse(byte[] bArr, int i, String str) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int unsignedShort = dataInputStream.readUnsignedShort();
        if (unsignedShort != i) {
            throw new DnsException(str, o00O00OO.OooO00o("the answer id ", unsignedShort, " is not match ", i));
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        boolean z = ((unsignedShort2 >> 8) & 1) == 1;
        if (!(((unsignedShort2 >> 7) & 1) == 1) || !z) {
            throw new DnsException(str, "the dns server cant support recursion ");
        }
        int unsignedShort3 = dataInputStream.readUnsignedShort();
        int unsignedShort4 = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        readQuestions(dataInputStream, bArr, unsignedShort3);
        return readAnswers(dataInputStream, bArr, unsignedShort4);
    }

    private static Record[] readAnswers(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        Record[] recordArr = new Record[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return recordArr;
            }
            recordArr[i2] = readRecord(dataInputStream, bArr);
            i2++;
            i = i3;
        }
    }

    private static String readName(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if ((unsignedByte & 192) == 192) {
            int unsignedByte2 = dataInputStream.readUnsignedByte() + ((unsignedByte & 63) << 8);
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(unsignedByte2));
            return readName(bArr, unsignedByte2, hashSet);
        }
        if (unsignedByte == 0) {
            return "";
        }
        byte[] bArr2 = new byte[unsignedByte];
        dataInputStream.readFully(bArr2);
        String unicode = IDN.toUnicode(new String(bArr2));
        String name = readName(dataInputStream, bArr);
        return name.length() > 0 ? OooO0OO.OooO00o(unicode, ".", name) : unicode;
    }

    private static void readQuestions(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            readName(dataInputStream, bArr);
            dataInputStream.readUnsignedShort();
            dataInputStream.readUnsignedShort();
            i = i2;
        }
    }

    private static Record readRecord(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        String hostAddress;
        readName(dataInputStream, bArr);
        int unsignedShort = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        long unsignedShort2 = (((long) dataInputStream.readUnsignedShort()) << 16) + ((long) dataInputStream.readUnsignedShort());
        int unsignedShort3 = dataInputStream.readUnsignedShort();
        if (unsignedShort == 1) {
            byte[] bArr2 = new byte[4];
            dataInputStream.readFully(bArr2);
            hostAddress = InetAddress.getByAddress(bArr2).getHostAddress();
        } else if (unsignedShort != 5) {
            for (int i = 0; i < unsignedShort3; i++) {
                dataInputStream.readByte();
            }
            hostAddress = null;
        } else {
            hostAddress = readName(dataInputStream, bArr);
        }
        if (hostAddress == null) {
            throw new UnknownHostException("no record");
        }
        return new Record(hostAddress, unsignedShort, (int) unsignedShort2, System.currentTimeMillis() / 1000, Record.Source.System);
    }

    private static void writeDomain(OutputStream outputStream, String str) throws IOException {
        for (String str2 : str.split("[.。．｡]")) {
            byte[] bytes = IDN.toASCII(str2).getBytes();
            outputStream.write(bytes.length);
            outputStream.write(bytes, 0, bytes.length);
        }
        outputStream.write(0);
    }

    private static void writeQuestion(OutputStream outputStream, String str) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeDomain(outputStream, str);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(1);
    }

    private static String readName(byte[] bArr, int i, HashSet<Integer> hashSet) throws IOException {
        int i2 = bArr[i] & KotlinVersion.MAX_COMPONENT_VALUE;
        if ((i2 & 192) == 192) {
            int i3 = ((i2 & 63) << 8) + (bArr[i + 1] & KotlinVersion.MAX_COMPONENT_VALUE);
            if (!hashSet.contains(Integer.valueOf(i3))) {
                hashSet.add(Integer.valueOf(i3));
                return readName(bArr, i3, hashSet);
            }
            throw new DnsException("", "Cyclic offsets detected.");
        }
        if (i2 == 0) {
            return "";
        }
        int i4 = i + 1;
        String str = new String(bArr, i4, i2);
        String name = readName(bArr, i4 + i2, hashSet);
        return name.length() > 0 ? OooO0OO.OooO00o(str, ".", name) : str;
    }
}
