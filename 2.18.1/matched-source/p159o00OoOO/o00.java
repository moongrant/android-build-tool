package p159o00OoOO;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.BaseRoomModel;
import com.app.base.model.InOutRoomModel;
import com.app.base.model.MomentBarGetServerIpModel;
import com.app.base.model.RoomLoginModel;
import com.app.base.model.RoomModel;
import com.app.base.protobuf.room.Room;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.http.ResponseInfo;
import com.yalla.yalla.common.statistical.event.RoomEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.common.statistical.net.NetStateExceptionType;
import com.yalla.yalla.common.statistical.net.NetStateExceptionTypeE;
import com.yalla.yalla.data.constant.RoomLoginState;
import com.yalla.yalla.model.RoomUserInfoModel;
import io.agora.rtc.internal.RtcEngineEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Objects;
import java.util.Timer;
import kotlin.text.Charsets;
import org.json.JSONObject;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p387o0OOoo0o.o00O0OOO;
import p445o0OoOo0o.o0O0OOOo;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p522o0o0O0o.oo0oOO0;
import p530o0o0OOO.o00OO00O;
import p530o0o0OOO.oo0O;
import p532o0o0OOOO.o;
import p533o0o0OOOo.oO00000;

/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Socket f32379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InputStream f32380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OutputStream f32381OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ThreadGroup f32382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public RoomModel f32384OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00OO00O.OooO0O0 f32385OooO0oO;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f32389OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o00O0000 f32390OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Timer f32391OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Handler f32392OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f32393OooOOOo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f32383OooO0o = true;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f32386OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f32378OooO = 0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f32387OooOO0 = 3000;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f32388OooOO0O = false;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f32394Oooo0o;

        public OooO00o(long j) {
            this.f32394Oooo0o = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j = this.f32394Oooo0o;
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("startConnectRoomServer getRunStatus:");
            sbOooO0o0.append(o00.this.f32386OooO0oo);
            o00O00.OooO0O0(sbOooO0o0.toString());
            o00 o00Var = o00.this;
            int i = o00Var.f32386OooO0oo;
            if (i != 3 && i != -2 && i != -1) {
                return;
            }
            o00Var.f32388OooOO0O = true;
            o00Var.f32386OooO0oo = 1;
            RoomModel roomModel = o00Var.f32384OooO0o0;
            if (roomModel == null) {
                o00Var.f32386OooO0oo = 0;
                FLog.INSTANCE.writeE(NetStateExceptionType.CONNECTION_ROOM_FAILED, "MixedRoom : CONNECTION_ROOM_FAILED roominfo is null", "", "");
                o00O00.OooO0Oo("startConnectRoomServer Can't get room information!");
                return;
            }
            if (roomModel.getRoomIpList().size() == 0) {
                o00.this.OooO0Oo();
                return;
            }
            while (true) {
                o00 o00Var2 = o00.this;
                if (!o00Var2.f32388OooOO0O) {
                    return;
                }
                int i2 = o00Var2.f32378OooO;
                o00Var2.f32378OooO = i2 + 1;
                if (i2 < 10) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("startConnectRoomServer connectRoomServer :");
                    sbOooO0o1.append(o00.this.f32378OooO);
                    o00O00.OooO0oO(sbOooO0o1.toString());
                    synchronized (this) {
                        RoomModel roomModel2 = o00.this.f32384OooO0o0;
                        if (roomModel2 != null) {
                            for (String str : roomModel2.getRoomIpList()) {
                                if (com.yalla.support.common.util.OooO0OO.OooO0O0(str) && str.contains(CertificateUtil.DELIMITER)) {
                                    o00O00.OooO0oO("startConnectRoomServer roomIps =>" + str);
                                    String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
                                    if (strArrSplit.length == 2 && o00.OooO0O0(o00.this, strArrSplit[0], Integer.valueOf(strArrSplit[1]).intValue())) {
                                        o00 o00Var3 = o00.this;
                                        Objects.requireNonNull(o00Var3);
                                        try {
                                            if (o00Var3.f32380OooO0O0 != null) {
                                                new Thread(o00Var3.f32382OooO0Oo, new o0O0ooO(o00Var3)).start();
                                            }
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                        o00 o00Var4 = o00.this;
                                        o00Var4.f32378OooO = 0;
                                        o00Var4.f32388OooOO0O = false;
                                        o00Var4.OooO0o0(null);
                                        o00 o00Var5 = o00.this;
                                        Objects.requireNonNull(o00Var5);
                                        o00Var5.f32391OooOOO0 = new Timer();
                                        o00O0000 o00o0001 = new o00O0000(o00Var5);
                                        o00Var5.f32390OooOOO = o00o0001;
                                        long j2 = 25000;
                                        o00Var5.f32391OooOOO0.schedule(o00o0001, j2, j2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    try {
                        Objects.requireNonNull(o00.this);
                        Thread.sleep(6000);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                } else {
                    Objects.requireNonNull(o00Var2);
                    o00O00.OooO0oO("startConnectRoomServer connectRoomServer 重连达到上限:10");
                    FLog.INSTANCE.roomLog(RoomEventType.Room_CloseRoom_3_reconnected, null);
                    o00 o00Var6 = o00.this;
                    o00Var6.f32378OooO = 0;
                    o00Var6.f32388OooOO0O = false;
                    o00Var6.f32386OooO0oo = 5;
                    o000O00O.OooO().f32437OoooOOo = true;
                    Objects.requireNonNull(o00.this);
                    o0O0OOOo.OooO0O0().OooO00o().OooOO0(true);
                    o0O0OOOo.OooO0O0().OooO00o().OooOOOo();
                    p617o0oo0o.o00.f48461OooO00o.OooO0o();
                    Handler handler = o00.this.f32392OooOOOO;
                    if (handler != null) {
                        handler.obtainMessage(2025).sendToTarget();
                    }
                }
            }
        }
    }

    public class OooO0O0 extends o00OO0O0.OooO0O0 {
        public OooO0O0() {
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            if (Integer.valueOf(str).intValue() == 2072) {
                o00OO00O.f43313OooooOo.OooO00o().f43325OooOO0O.postValue(RoomLoginState.Closed);
            } else {
                o00OO00O.f43313OooooOo.OooO00o().f43325OooOO0O.postValue(RoomLoginState.Error);
            }
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            MomentBarGetServerIpModel momentBarGetServerIpModel = (MomentBarGetServerIpModel) o0Oo0oo.OooO0O0(str, MomentBarGetServerIpModel.class);
            o00O00.OooO0oO("重新获取IP后连接房间");
            if (momentBarGetServerIpModel == null || !com.yalla.support.common.util.OooO0OO.OooO0O0(Long.valueOf(momentBarGetServerIpModel.getRoomid())) || !com.yalla.support.common.util.OooO0OO.OooO0O0(momentBarGetServerIpModel.getRoomserverip())) {
                o00OO00O.f43313OooooOo.OooO00o().f43325OooOO0O.postValue(RoomLoginState.Error);
                return;
            }
            o00 o00Var = o00.this;
            long j = o00Var.f32387OooOO0;
            RoomModel roomModel = o00Var.f32384OooO0o0;
            if (roomModel != null) {
                if (com.yalla.support.common.util.OooO0OO.OooO00o(roomModel.getRoomIp())) {
                    j = 0;
                }
                o00.this.f32384OooO0o0.setId(momentBarGetServerIpModel.getRoomid());
                o00.this.f32384OooO0o0.setRoomIp(momentBarGetServerIpModel.getRoomserverip());
            }
            o00 o00Var2 = o00.this;
            o00Var2.f32386OooO0oo = -1;
            o00Var2.f32383OooO0o = true;
            o00Var2.OooO0oo(j);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00.this.OooO();
        }
    }

    public o00() {
        o00O000.f32468OooO00o = this;
        this.f32385OooO0oO = new o00OO00O.OooO0O0();
        this.f32382OooO0Oo = Thread.currentThread().getThreadGroup();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:133:0x0292  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d5  */
    public static void OooO00o(o00 o00Var, byte[] bArr) {
        boolean z;
        boolean z2;
        InOutRoomModel inOutRoomModel;
        RoomUserInfoModel user;
        int i;
        BaseRoomModel baseRoomModel;
        Objects.requireNonNull(o00Var);
        if (bArr == null) {
            return;
        }
        byte[] bArr2 = (byte[]) ((HashMap) o00Var.f32385OooO0oO.OooO0O0(bArr)).get("WillProtocol_data");
        int iOooO0Oo = o00O0OOO.OooO0Oo((byte[]) ((HashMap) o00Var.f32385OooO0oO.OooO0O0(bArr)).get("WillProtocol_type"));
        if (iOooO0Oo == 10001 && (baseRoomModel = (BaseRoomModel) o0Oo0oo.OooO0O0(new String(bArr2).trim(), BaseRoomModel.class)) != null && baseRoomModel.getCode() == 1042) {
            o00Var.f32383OooO0o = false;
            o00O00.OooO0oO("REDIRECTION_ROOM_IP_1042");
            o00Var.OooO0OO();
            o00Var.OooO0Oo();
            return;
        }
        oo0O oo0o = oo0O.f43387OooO00o;
        Integer numValueOf = Integer.valueOf(iOooO0Oo);
        o00O00.OooO0OO("RoomMessageDispatcher", "\ntype= " + numValueOf + ", \ndata= " + bArr2);
        if (numValueOf != null) {
            numValueOf.intValue();
            int iIntValue = numValueOf.intValue();
            if (bArr2 == null) {
                z2 = false;
            } else {
                if ((bArr2.length == 0) || iIntValue == 10001) {
                    z2 = false;
                } else {
                    try {
                        if (iIntValue == 1000005) {
                            o00O00.OooO0O0("handleError 1000005 type:" + iIntValue + ",data:" + bArr2);
                            Room.ErrorEvent from = Room.ErrorEvent.parseFrom(bArr2);
                            o.OooO0OO(from.getErrcode(), from.getPckcode(), from.getContent());
                        } else if (oo0o.OooO00o(bArr2)) {
                            String str = new String(bArr2, Charsets.UTF_8);
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("code") && (i = jSONObject.getInt("code")) != 0) {
                                o00O00.OooO0O0("handleError JsonMessage type:" + iIntValue + ", data:" + str);
                                o.OooO0OO(i, iIntValue, str);
                            } else {
                                z2 = false;
                            }
                        } else {
                            if (!(iIntValue == 100661 || iIntValue == 100711 || iIntValue == 10072 || iIntValue == 10073 || iIntValue == 100731 || iIntValue == 100732 || iIntValue == 10074 || iIntValue == 10075 || iIntValue == 10076 || iIntValue == 10077 || iIntValue == 10078 || iIntValue == 1000000 || iIntValue == 1000002 || iIntValue == 1000003 || iIntValue == 1000005 || iIntValue == 1100001 || iIntValue == 1000201 || iIntValue == 1000200 || iIntValue == 1100002 || iIntValue == 1000500 || iIntValue == 1000800 || iIntValue == 1000801 || iIntValue == 10008010)) {
                                try {
                                    Room.Base from2 = Room.Base.parseFrom(bArr2);
                                    if (from2 != null) {
                                        from2.getCode();
                                        if (from2.getCode() != 0) {
                                            o00O00.OooO0O0("handleError ProtobufMessage type:" + iIntValue + ", code:" + from2.getCode());
                                            o.OooO0OO(from2.getCode(), iIntValue, bArr2);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        oo0oOO0.OooO0O0("error: handleErrorIfHave type = " + iIntValue);
                    }
                }
            }
            if (z2) {
                z = true;
            } else {
                int iIntValue2 = numValueOf.intValue();
                try {
                    switch (iIntValue2) {
                        case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                        case 10041:
                        case 10045:
                        case 10053:
                            oo0O.f43388OooO0O0.OooO0Oo(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 10006:
                        case 1001100:
                        case 1001103:
                        case 1001105:
                        case 1001106:
                        case 1001108:
                        case 1001109:
                            oo0O.f43397OooOO0o.OooO0OO(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 10007:
                            oo0O.f43388OooO0O0.OooO0Oo(iIntValue2, bArr2);
                            oo0O.f43395OooOO0.OooO0OO(iIntValue2, bArr2);
                            oO00000.OooO00o.OooO0O0(oo0O.f43396OooOO0O, iIntValue2, bArr2);
                            if (iIntValue2 == 10007 && bArr2 != null && (inOutRoomModel = (InOutRoomModel) p516o0o0O000.o0Oo0oo.OooO0OO(new String(bArr2, Charsets.UTF_8), InOutRoomModel.class)) != null && (user = inOutRoomModel.getUser()) != null && inOutRoomModel.getKind() == 0) {
                                o000O00O.OooO().OooOooO(33002, 0, user);
                            }
                            oo0O.f43397OooOO0o.OooO0OO(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 10009:
                        case 10048:
                        case 10056:
                        case 10057:
                        case 1000100:
                        case 1001001:
                        case 1001002:
                            oo0O.f43390OooO0Oo.OooO0Oo(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 10016:
                        case 10017:
                            oo0O.f43397OooOO0o.OooO0OO(iIntValue2, bArr2);
                            z = false;
                            break;
                        case 10019:
                        case 1000700:
                            oo0O.f43388OooO0O0.OooO0Oo(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 10021:
                        case 10022:
                        case 10024:
                        case 10042:
                        case 100212:
                        case 100221:
                        case 100222:
                        case 100242:
                        case 1000402:
                        case 1000900:
                        case 1000901:
                        case 1000902:
                        case 1000903:
                        case 1000904:
                        case 1000905:
                            oo0O.f43386OooO.OooO0O0(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 10023:
                        case 100231:
                        case 100232:
                            oo0O.f43386OooO.OooO0O0(iIntValue2, bArr2);
                            oo0O.f43397OooOO0o.OooO0OO(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 10054:
                        case 10055:
                            oo0O.f43395OooOO0.OooO0OO(iIntValue2, bArr2);
                            z = false;
                            break;
                        case 100241:
                            oo0O.f43386OooO.OooO0O0(iIntValue2, bArr2);
                            oo0O.f43397OooOO0o.OooO0OO(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 1000200:
                        case 1000201:
                            oo0O.f43391OooO0o.OooO0O0(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 1000300:
                        case 1000301:
                            oo0O.f43392OooO0o0.OooO0O0(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 1000500:
                            oo0O.f43393OooO0oO.OooO0O0(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 1000600:
                            oo0O.f43390OooO0Oo.OooO0Oo(iIntValue2, bArr2);
                            z = true;
                            break;
                        case 1000800:
                        case 1000801:
                            oo0O.f43394OooO0oo.OooO0O0(iIntValue2, bArr2);
                            z = true;
                            break;
                        default:
                            z = false;
                            break;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            z = true;
        }
        if (z) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = iOooO0Oo;
        if (oo0O.f43387OooO00o.OooO00o(bArr2)) {
            messageObtain.arg1 = 0;
            messageObtain.obj = new String(bArr2).trim();
        } else {
            messageObtain.arg1 = 1;
            messageObtain.obj = bArr2;
        }
        Handler handler = o00Var.f32392OooOOOO;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public static boolean OooO0O0(o00 o00Var, String str, int i) {
        if (o00Var.f32384OooO0o0 == null) {
            return false;
        }
        o00Var.f32386OooO0oo = 2;
        o00O00.OooO0oO("connectRoomServer : CONNECT_ING");
        try {
            Socket socket = o00Var.f32379OooO00o;
            if (socket != null) {
                socket.close();
                o00Var.f32379OooO00o = null;
            }
            o00O00.OooO0oO("Socket connectRoomServer : roomIp = " + str + ",roomPort = " + i);
            Socket socket2 = new Socket();
            o00Var.f32379OooO00o = socket2;
            socket2.connect(new InetSocketAddress(str, i), ResponseInfo.UnknownError);
            TrafficStats.setThreadStatsTag(1);
            o00Var.f32379OooO00o.setSoTimeout(ResponseInfo.UnknownError);
            o00Var.f32380OooO0O0 = o00Var.f32379OooO00o.getInputStream();
            o00Var.f32381OooO0OO = o00Var.f32379OooO00o.getOutputStream();
            o00Var.f32386OooO0oo = 4;
            o00Var.f32387OooOO0 = 3000L;
            o00O00.OooO0oO("connectRoomServer : CONNECT_SUCCESS");
            return (o00Var.f32380OooO0O0 == null || o00Var.f32381OooO0OO == null) ? false : true;
        } catch (IOException e) {
            e.printStackTrace();
            o00O00.OooO0oO("connectRoomServer : CONNECT_FAILED");
            if (o00Var.f32384OooO0o0 != null) {
                FLog.INSTANCE.roomLog(RoomEventType.Room_ConnectError, e.getMessage());
            }
            o00Var.f32386OooO0oo = 0;
            return false;
        }
    }

    public final void OooO() {
        synchronized (this) {
            this.f32388OooOO0O = false;
            o00O00.OooO0oo("destroy socketcommand : ", "com.app.base.mixedroom.MixedRoomSocketManager#disconnectRoomServer");
            Timer timer = this.f32391OooOOO0;
            if (timer != null) {
                timer.cancel();
                this.f32391OooOOO0 = null;
            }
            o00O0000 o00o0001 = this.f32390OooOOO;
            if (o00o0001 != null) {
                o00o0001.cancel();
                this.f32390OooOOO = null;
            }
            try {
                Socket socket = this.f32379OooO00o;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f32380OooO0O0 = null;
            this.f32381OooO0OO = null;
            this.f32389OooOO0o = false;
            this.f32386OooO0oo = -2;
        }
    }

    public final void OooO0OO() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("disconnectRoomServer:");
        sbOooO0o0.append(this.f32383OooO0o);
        o00O00.OooO0oO(sbOooO0o0.toString());
        if (Looper.getMainLooper() == Looper.myLooper()) {
            new Thread(this.f32382OooO0Oo, new OooO0OO()).start();
        } else {
            OooO();
        }
    }

    public final void OooO0Oo() {
        if (this.f32393OooOOOo) {
            this.f32393OooOOOo = false;
            OooO0oo(0L);
        } else {
            if (this.f32384OooO0o0 == null) {
                return;
            }
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o00000OO.f32213OooO0oO.OooO0OO(this.f32384OooO0o0.getId() + "", new OooO0O0());
        }
    }

    public final void OooO0o(int i, String str) {
        o00O00.OooO0oO("socket sendRoomCommand = " + i + "， msg = " + str);
        OooOO0(com.yalla.support.common.util.OooO0OO.OooO00o(str) ? o00OO00O.OooO0O0.OooO0OO(i, null) : o00OO00O.OooO0O0.OooO0OO(i, str.getBytes()));
    }

    public final void OooO0o0(String str) {
        if (this.f32384OooO0o0 != null) {
            RoomLoginModel roomLoginModel = new RoomLoginModel();
            roomLoginModel.barid = this.f32384OooO0o0.getId();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            roomLoginModel.userid = oooOOO.OooOo().getValue().longValue();
            roomLoginModel.token = oooOOO.OooOo0o().getValue();
            if (!TextUtils.isEmpty(this.f32384OooO0o0.getSessionId())) {
                roomLoginModel.sessionid = this.f32384OooO0o0.getSessionId();
            }
            if (!TextUtils.isEmpty(str)) {
                roomLoginModel.password = str;
            }
            String strOooO0Oo = o0Oo0oo.OooO0Oo(roomLoginModel);
            FLog.INSTANCE.writeI(NetStateExceptionTypeE.CONNECT_ROOM, "start login room");
            OooO0o(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS, strOooO0Oo);
        }
    }

    public final void OooO0oO(int i, byte[] bArr) {
        o00O00.OooO0oO("socket sendRoomProtoCommand = " + i + "， bytes = " + bArr);
        OooOO0(o00OO00O.OooO0O0.OooO0OO(i, bArr));
    }

    public final void OooO0oo(long j) {
        o0O0OOOo.OooO0O0().OooO00o().OooOOOo();
        o00OO00O.f43313OooooOo.OooO00o().f43325OooOO0O.postValue(RoomLoginState.Login);
        FLog.INSTANCE.writeI(NetStateExceptionTypeE.CONNECT_ROOM, "start connect room server");
        p617o0oo0o.o00.f48461OooO00o.OooO0o();
        new Thread(this.f32382OooO0Oo, new OooO00o(j)).start();
    }

    public final void OooOO0(byte[] bArr) {
        try {
            if (this.f32381OooO0OO != null && this.f32386OooO0oo == 4) {
                new Thread(this.f32382OooO0Oo, new o00oOoo(this, bArr)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
