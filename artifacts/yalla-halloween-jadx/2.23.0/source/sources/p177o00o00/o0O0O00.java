package p177o00o00;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 implements Closeable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FileChannel f38570OooO0Oo;

    public o0O0O00(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f38570OooO0Oo = new FileInputStream(file).getChannel();
    }

    public final List<String> OooO00o() throws IOException {
        o0ooOOo oo0o0oo;
        long j;
        o00oO0o o00oo0oOooO00o;
        FileChannel fileChannel = this.f38570OooO0Oo;
        fileChannel.position(0L);
        ArrayList arrayList = new ArrayList();
        fileChannel.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (OooOOo0(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        OooO0OO(byteBufferAllocate, 4L, 1);
        short s = (short) (byteBufferAllocate.get() & UByte.MAX_VALUE);
        OooO0OO(byteBufferAllocate, 5L, 1);
        boolean z = ((short) (byteBufferAllocate.get() & UByte.MAX_VALUE)) == 2;
        if (s == 1) {
            oo0o0oo = new o0OO00O(z, this);
        } else {
            if (s != 2) {
                throw new IllegalStateException("Invalid class type!");
            }
            oo0o0oo = new oo0o0Oo(z, this);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
        if (oo0o0oo.f38577OooO00o) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        byteBufferAllocate2.order(byteOrder);
        long j2 = oo0o0oo.f38582OooO0o0;
        if (j2 == 65535) {
            j2 = oo0o0oo.OooO0OO().f38576OooO00o;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            o0OOO0o o0ooo0oOooO0O0 = oo0o0oo.OooO0O0(j3);
            if (o0ooo0oOooO0O0.f38572OooO00o == 2) {
                j = o0ooo0oOooO0O0.f38573OooO0O0;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j4 = 0;
        int i = 0;
        do {
            o00oo0oOooO00o = oo0o0oo.OooO00o(i, j);
            long j5 = o00oo0oOooO00o.f38568OooO00o;
            if (j5 == 1) {
                arrayList2.add(Long.valueOf(o00oo0oOooO00o.f38569OooO0O0));
            } else if (j5 == 5) {
                j4 = o00oo0oOooO00o.f38569OooO0O0;
            }
            i++;
        } while (o00oo0oOooO00o.f38568OooO00o != 0);
        if (j4 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        for (long j6 = 0; j6 < j2; j6++) {
            o0OOO0o o0ooo0oOooO0O1 = oo0o0oo.OooO0O0(j6);
            if (o0ooo0oOooO0O1.f38572OooO00o == 1) {
                long j7 = o0ooo0oOooO0O1.f38574OooO0OO;
                if (j7 <= j4 && j4 <= o0ooo0oOooO0O1.f38575OooO0Oo + j7) {
                    long j8 = (j4 - j7) + o0ooo0oOooO0O1.f38573OooO0O0;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        long jLongValue = ((Long) it.next()).longValue() + j8;
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            long j9 = jLongValue + 1;
                            OooO0OO(byteBufferAllocate2, jLongValue, 1);
                            short s2 = (short) (byteBufferAllocate2.get() & UByte.MAX_VALUE);
                            if (s2 != 0) {
                                sb.append((char) s2);
                                jLongValue = j9;
                            }
                        }
                        arrayList.add(sb.toString());
                    }
                    return arrayList;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public final void OooO0OO(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int i2 = this.f38570OooO0Oo.read(byteBuffer, j + j2);
            if (i2 == -1) {
                throw new EOFException();
            }
            j2 += (long) i2;
        }
        byteBuffer.position(0);
    }

    public final int OooO0oO(ByteBuffer byteBuffer, long j) throws IOException {
        OooO0OO(byteBuffer, j, 2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public final long OooOOo0(ByteBuffer byteBuffer, long j) throws IOException {
        OooO0OO(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38570OooO0Oo.close();
    }
}
