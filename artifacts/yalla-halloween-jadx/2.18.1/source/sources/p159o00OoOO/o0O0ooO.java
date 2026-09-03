package p159o00OoOO;

import android.annotation.SuppressLint;
import android.os.Handler;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.common.statistical.net.NetStateExceptionType;
import com.zego.wrapper.ZegoLiveRoomConstants;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Objects;
import o00OO00O.OooO00o;
import o00OO00O.OooO0O0;
import p387o0OOoo0o.o00O0OOO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00 f32479Oooo0o;

    public o0O0ooO(o00 o00Var) {
        this.f32479Oooo0o = o00Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c A[Catch: NullPointerException -> 0x00f8, IOException -> 0x0132, TryCatch #1 {IOException -> 0x0132, blocks: (B:8:0x0019, B:9:0x0024, B:10:0x0028, B:12:0x002c, B:14:0x003a, B:16:0x006a, B:17:0x006e, B:19:0x0079, B:22:0x007d, B:24:0x0089, B:26:0x008f, B:33:0x009c, B:34:0x00a5, B:37:0x00b0, B:39:0x00b7), top: B:67:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5 A[Catch: NullPointerException -> 0x00f8, IOException -> 0x0132, TryCatch #1 {IOException -> 0x0132, blocks: (B:8:0x0019, B:9:0x0024, B:10:0x0028, B:12:0x002c, B:14:0x003a, B:16:0x006a, B:17:0x006e, B:19:0x0079, B:22:0x007d, B:24:0x0089, B:26:0x008f, B:33:0x009c, B:34:0x00a5, B:37:0x00b0, B:39:0x00b7), top: B:67:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0143, please report this as an issue */
    @Override // java.lang.Runnable
    @SuppressLint({"WrongConstant"})
    public final void run() {
        OooO00o oooO00o;
        IOException e;
        int i;
        int i2;
        byte[] bArr;
        int iOooO0Oo;
        int i3;
        int i4;
        this.f32479Oooo0o.f32389OooOO0o = true;
        loop0: while (true) {
            OooO00o oooO00o2 = null;
            while (true) {
                o00 o00Var = this.f32479Oooo0o;
                if (!o00Var.f32389OooOO0o) {
                    break loop0;
                }
                if (oooO00o2 != null) {
                    i = oooO00o2.f31184OooO0OO;
                    i2 = oooO00o2.f31183OooO0O0;
                    while (i2 < oooO00o2.f31184OooO0OO) {
                        i4 = this.f32479Oooo0o.f32380OooO0O0.read(oooO00o2.f31182OooO00o, i2, i - i2);
                        if (i4 < 0) {
                            o00O00.OooO0oO("readBuffer : CONNECT_LOST");
                            o00 o00Var2 = this.f32479Oooo0o;
                            o00Var2.f32386OooO0oo = -2;
                            o00Var2.f32389OooOO0o = false;
                            FLog.INSTANCE.writeE(NetStateExceptionType.OFFLINE_ROOM, "readBuffer : CONNECT_LOST", this.f32479Oooo0o.f32384OooO0o0.getId() + "", this.f32479Oooo0o.f32384OooO0o0.getBaridx());
                            break;
                        }
                        if (i4 > 0) {
                            i2 += i4;
                            oooO00o2.f31183OooO0O0 = i2;
                        }
                    }
                    OooO0O0 oooO0O0 = this.f32479Oooo0o.f32385OooO0oO;
                    bArr = oooO00o2.f31182OooO00o;
                    Objects.requireNonNull(oooO0O0);
                    if (bArr != null) {
                        iOooO0Oo = -1;
                    } else {
                        iOooO0Oo = -1;
                    }
                    i3 = oooO00o2.f31184OooO0OO;
                    if (i3 < oooO00o2.f31183OooO0O0) {
                        if (i3 == iOooO0Oo) {
                            Objects.requireNonNull(this.f32479Oooo0o);
                            if (i3 >= 10485760) {
                            }
                            this.f32479Oooo0o.f32386OooO0oo = -2;
                            FLog.INSTANCE.writeE(NetStateExceptionType.OFFLINE_ROOM, "OOM", this.f32479Oooo0o.f32384OooO0o0.getId() + "", this.f32479Oooo0o.f32384OooO0o0.getBaridx());
                            this.f32479Oooo0o.f32389OooOO0o = false;
                            break;
                            break;
                        }
                        o00.OooO00o(this.f32479Oooo0o, oooO00o2.f31182OooO00o);
                        break;
                        break;
                    }
                    o00 o00Var3 = this.f32479Oooo0o;
                    o00Var3.f32389OooOO0o = false;
                    o00Var3.f32386OooO0oo = 3;
                    break;
                    break;
                }
                try {
                    try {
                        Objects.requireNonNull(o00Var.f32385OooO0oO);
                        oooO00o2 = new OooO00o();
                        i = oooO00o2.f31184OooO0OO;
                        i2 = oooO00o2.f31183OooO0O0;
                        while (i2 < oooO00o2.f31184OooO0OO) {
                            i4 = this.f32479Oooo0o.f32380OooO0O0.read(oooO00o2.f31182OooO00o, i2, i - i2);
                            if (i4 < 0) {
                                o00O00.OooO0oO("readBuffer : CONNECT_LOST");
                                o00 o00Var4 = this.f32479Oooo0o;
                                o00Var4.f32386OooO0oo = -2;
                                o00Var4.f32389OooOO0o = false;
                                FLog.INSTANCE.writeE(NetStateExceptionType.OFFLINE_ROOM, "readBuffer : CONNECT_LOST", this.f32479Oooo0o.f32384OooO0o0.getId() + "", this.f32479Oooo0o.f32384OooO0o0.getBaridx());
                                break;
                            }
                            if (i4 > 0) {
                                i2 += i4;
                                oooO00o2.f31183OooO0O0 = i2;
                            }
                        }
                        OooO0O0 oooO0O1 = this.f32479Oooo0o.f32385OooO0oO;
                        bArr = oooO00o2.f31182OooO00o;
                        Objects.requireNonNull(oooO0O1);
                        if (bArr != null || bArr.length < 8) {
                            iOooO0Oo = -1;
                        } else {
                            byte[] bArr2 = new byte[4];
                            System.arraycopy(bArr, 0, bArr2, 0, 4);
                            iOooO0Oo = o00O0OOO.OooO0Oo(bArr2);
                        }
                        i3 = oooO00o2.f31184OooO0OO;
                        if (i3 < oooO00o2.f31183OooO0O0) {
                            if (i3 == iOooO0Oo) {
                                Objects.requireNonNull(this.f32479Oooo0o);
                                if (i3 >= 10485760 && iOooO0Oo > 0) {
                                    Objects.requireNonNull(this.f32479Oooo0o);
                                    if (iOooO0Oo < 10485760) {
                                        byte[] bArr3 = oooO00o2.f31182OooO00o;
                                        byte[] bArr4 = new byte[iOooO0Oo];
                                        oooO00o2.f31182OooO00o = bArr4;
                                        System.arraycopy(bArr3, 0, bArr4, 0, oooO00o2.f31183OooO0O0);
                                        oooO00o2.f31184OooO0OO = iOooO0Oo;
                                    }
                                }
                                this.f32479Oooo0o.f32386OooO0oo = -2;
                                FLog.INSTANCE.writeE(NetStateExceptionType.OFFLINE_ROOM, "OOM", this.f32479Oooo0o.f32384OooO0o0.getId() + "", this.f32479Oooo0o.f32384OooO0o0.getBaridx());
                                this.f32479Oooo0o.f32389OooOO0o = false;
                                break;
                            }
                            o00.OooO00o(this.f32479Oooo0o, oooO00o2.f31182OooO00o);
                            break;
                        }
                        o00 o00Var5 = this.f32479Oooo0o;
                        o00Var5.f32389OooOO0o = false;
                        try {
                            o00Var5.f32386OooO0oo = 3;
                            break;
                        } catch (IOException e2) {
                            e = e2;
                            oooO00o = null;
                            if (e instanceof SocketTimeoutException) {
                                if (this.f32479Oooo0o.f32384OooO0o0 != null) {
                                    FLog.INSTANCE.writeE(NetStateExceptionType.OFFLINE_ROOM, e.getMessage(), this.f32479Oooo0o.f32384OooO0o0.getId() + "", this.f32479Oooo0o.f32384OooO0o0.getBaridx());
                                }
                                o00 o00Var6 = this.f32479Oooo0o;
                                o00Var6.f32386OooO0oo = -2;
                                o00Var6.f32389OooOO0o = false;
                                e.printStackTrace();
                                break;
                            }
                            oooO00o2 = oooO00o;
                        }
                    } catch (IOException e3) {
                        oooO00o = oooO00o2;
                        e = e3;
                        if (e instanceof SocketTimeoutException) {
                            if (this.f32479Oooo0o.f32384OooO0o0 != null) {
                                FLog.INSTANCE.writeE(NetStateExceptionType.OFFLINE_ROOM, e.getMessage(), this.f32479Oooo0o.f32384OooO0o0.getId() + "", this.f32479Oooo0o.f32384OooO0o0.getBaridx());
                            }
                            o00 o00Var7 = this.f32479Oooo0o;
                            o00Var7.f32386OooO0oo = -2;
                            o00Var7.f32389OooOO0o = false;
                            e.printStackTrace();
                            break;
                        }
                        oooO00o2 = oooO00o;
                    }
                } catch (NullPointerException e4) {
                    if (this.f32479Oooo0o.f32384OooO0o0 != null) {
                        FLog.INSTANCE.writeE(NetStateExceptionType.OFFLINE_ROOM, e4.getMessage(), this.f32479Oooo0o.f32384OooO0o0.getId() + "", this.f32479Oooo0o.f32384OooO0o0.getBaridx());
                    }
                    o00 o00Var8 = this.f32479Oooo0o;
                    o00Var8.f32386OooO0oo = -2;
                    o00Var8.f32389OooOO0o = false;
                    e4.printStackTrace();
                }
            }
        }
        o00O00.OooO0oo("readBuffer destroy socketcommand : ", "com.weieyu.yalla.mixedroom.MixedRoomSocketManager#readBuffer");
        Handler handler = this.f32479Oooo0o.f32392OooOOOO;
        if (handler != null) {
            handler.obtainMessage(ZegoLiveRoomConstants.ErrorCode.SDK_SHOULD_NOT_READY).sendToTarget();
        }
        this.f32479Oooo0o.OooO0OO();
        o00O00.OooO0oO("needReconnect startConnectRoomServer again:" + this.f32479Oooo0o.f32383OooO0o + "|" + this.f32479Oooo0o.f32387OooOO0);
        o00 o00Var9 = this.f32479Oooo0o;
        if (o00Var9.f32383OooO0o) {
            o00Var9.OooO0Oo();
        }
    }
}
