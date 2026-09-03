package p203o00o0o00;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39353OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39354OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<Integer> f39355OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<Integer> f39356OooO0Oo = new ArrayList<>();

    public o000O000(Bitmap bitmap) {
        this.f39353OooO00o = bitmap.getWidth();
        this.f39354OooO0O0 = bitmap.getHeight();
    }

    public final byte[] OooO00o() {
        ArrayList<Integer> arrayList = this.f39355OooO0OO;
        if (arrayList.size() == 0) {
            arrayList.add(0);
            arrayList.add(Integer.valueOf(this.f39353OooO00o));
        }
        ArrayList<Integer> arrayList2 = this.f39356OooO0Oo;
        if (arrayList2.size() == 0) {
            arrayList2.add(0);
            arrayList2.add(Integer.valueOf(this.f39354OooO0O0));
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((arrayList2.size() + arrayList.size() + 8 + 9) * 4).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) arrayList.size());
        byteBufferOrder.put((byte) arrayList2.size());
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferOrder.putInt(it.next().intValue());
        }
        Iterator<Integer> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            byteBufferOrder.putInt(it2.next().intValue());
        }
        for (int i = 0; i < 9; i++) {
            byteBufferOrder.putInt(1);
        }
        return byteBufferOrder.array();
    }
}
