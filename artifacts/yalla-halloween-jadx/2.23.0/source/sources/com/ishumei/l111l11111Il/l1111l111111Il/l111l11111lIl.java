package com.ishumei.l111l11111Il.l1111l111111Il;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class l111l11111lIl extends l111l1111lI1l {
    private Context l1111l111111Il;
    private final LinkedBlockingQueue<IBinder> l111l11111lIl = new LinkedBlockingQueue<>(1);
    private ServiceConnection l111l11111I1l = new ServiceConnection() { // from class: com.ishumei.l111l11111Il.l1111l111111Il.l111l11111lIl.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l111l11111lIl.this.l111l11111lIl.put(iBinder);
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public l111l11111lIl(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.l111l11111Il.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        String string;
        try {
            this.l1111l111111Il.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            if (!this.l1111l111111Il.bindService(intent, this.l111l11111I1l, 1)) {
                return "";
            }
            try {
                IBinder iBinderTake = this.l111l11111lIl.take();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    iBinderTake.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        string = null;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        throw th2;
                    }
                }
                this.l1111l111111Il.unbindService(this.l111l11111I1l);
                return string;
            } catch (Exception unused) {
                this.l1111l111111Il.unbindService(this.l111l11111I1l);
                return "";
            } catch (Throwable th3) {
                this.l1111l111111Il.unbindService(this.l111l11111I1l);
                throw th3;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
