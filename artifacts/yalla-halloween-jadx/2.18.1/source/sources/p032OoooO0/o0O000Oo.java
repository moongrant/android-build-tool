package p032OoooO0;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import oO0000Oo.OooO00o;
import oO0000Oo.OooO0o;
import p190o00o00oo.o000000O;
import p677o0oooo0o.oO0O00o0;
import p682o0oooooO.sk;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000Oo {
    public static List OooO00o(byte[] bArr) {
        long j = (((long) (((bArr[11] & UByte.MAX_VALUE) << 8) | (bArr[10] & UByte.MAX_VALUE))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(OooO0O0(j));
        arrayList.add(OooO0O0(80000000L));
        return arrayList;
    }

    public static byte[] OooO0O0(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    public static o000000O OooO0OO(File file) {
        return new o000000O(file);
    }

    public static byte[] OooO0Oo(OooO00o oooO00o, oO0O00o0 oo0o00o0) {
        try {
            return new sk(oooO00o, oo0o00o0.OooO0O0()).OooO0oo("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] OooO0o(OooO0o oooO0o) {
        try {
            return oooO0o.OooO0oo("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] OooO0o0(OooO00o oooO00o, oO0O00o0 oo0o00o0) {
        try {
            return OooO0o(new OooO0o(oooO00o, oo0o00o0));
        } catch (Exception unused) {
            return null;
        }
    }
}
