package com.yalla.yalla.ui.activity.main;

import Oooo000.o00O00;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p034OoooO0O.o0Oo0oo;
import p660o0ooo0o0.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends p144o00Oo.OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ NetworkTestActivity.OooO0O0 f22037OooO0O0;

    public OooO00o(NetworkTestActivity.OooO0O0 oooO0O0) {
        this.f22037OooO0O0 = oooO0O0;
    }

    @Override // p144o00Oo.OooO0o
    public final void OooO00o(Exception exc) {
        if (this.f22037OooO0O0.isCancelled()) {
            return;
        }
        o0Oo0oo.OooO0o0(602, 0);
    }

    @Override // p144o00Oo.OooO0o
    public final void OooO0O0(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0054: MOVE (r1 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:17:0x0054 */
    @Override // p144o00Oo.OooO0o
    public final Object OooO0Oo(o00OOOO0 o00oooo1) throws Exception {
        InputStream inputStreamOooO00o;
        InputStream inputStream;
        long jCurrentTimeMillis;
        InputStream inputStream2 = null;
        if (this.f22037OooO0O0.isCancelled()) {
            return null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        byte[] bArr = new byte[RecyclerView.oo0o0Oo.FLAG_MOVED];
        try {
            try {
                inputStreamOooO00o = o00oooo1.f51441OoooO.OooO00o();
                try {
                    NetworkTestActivity.this.f21997o00000O0 = o00oooo1.f51441OoooO.OooO0Oo();
                    FileOutputStream fileOutputStream = new FileOutputStream(p494o0o00OO0.OooO0o.f41155OooO00o.OooO0O0(NetworkTestActivity.this.f21994o000000O));
                    while (true) {
                        int i = inputStreamOooO00o.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.flush();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        inputStreamOooO00o.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (inputStreamOooO00o != null) {
                        try {
                            inputStreamOooO00o.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    jCurrentTimeMillis = 0;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamOooO00o = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
        if (this.f22037OooO0O0.isCancelled()) {
            return null;
        }
        if (jCurrentTimeMillis == 0) {
            o0Oo0oo.OooO0o0(602, 0);
        } else {
            File fileOooO0O0 = p494o0o00OO0.OooO0o.f41155OooO00o.OooO0O0(NetworkTestActivity.this.f21994o000000O);
            NetworkTestActivity.this.f21996o00000O = fileOooO0O0.length();
            if (fileOooO0O0.exists()) {
                o00O00.OooO(fileOooO0O0);
            }
            NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
            long j = jCurrentTimeMillis - jCurrentTimeMillis2;
            networkTestActivity.f21999o00000Oo = j;
            if (j > 0) {
                networkTestActivity.f21998o00000OO = ((networkTestActivity.f21996o00000O * 1000) / 1024) / j;
            } else {
                networkTestActivity.f21998o00000OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            o0Oo0oo.OooO0o0(602, 1);
        }
        return Float.valueOf(NetworkTestActivity.this.f21998o00000OO);
    }
}
