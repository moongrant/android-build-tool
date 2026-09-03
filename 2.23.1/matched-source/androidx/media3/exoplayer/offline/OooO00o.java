package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.offline.OooO00o;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p029Oooo0oo.oo0oO0;
import p072o000O0oO.o00000;
import p072o000O0oO.o000000;
import p072o000O0oO.o000OOo;
import p072o000O0oO.o0O0O00;
import p072o000O0oO.o0OO00O;
import p073o000O0oo.o00000O;
import p080o000OoO.o000OO00;
import p080o000OoO.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Requirements f7801OooOOOO = new Requirements(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f7803OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000 f7804OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f7805OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0oO0 f7806OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f7807OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f7809OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f7810OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f7812OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f7813OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o00000O f7814OooOOO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f7811OooOO0 = 3;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f7802OooO = true;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public List<Download> f7815OooOOO0 = Collections.emptyList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CopyOnWriteArraySet<OooO0OO> f7808OooO0o0 = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.offline.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0150OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Download f7816OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f7817OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<Download> f7818OooO0OO;

        public C0150OooO00o(Download download, boolean z, ArrayList arrayList, @Nullable Exception exc) {
            this.f7816OooO00o = download;
            this.f7817OooO0O0 = z;
            this.f7818OooO0OO = arrayList;
        }
    }

    public static final class OooO0O0 extends Handler {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7819OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HandlerThread f7820OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00000 f7821OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000000 f7822OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Handler f7823OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final HashMap<String, OooO0o> f7824OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList<Download> f7825OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f7826OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f7827OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7828OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f7829OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f7830OooOO0o;

        public OooO0O0(HandlerThread handlerThread, o0OO00O o0oo00o2, p364o0OOo00.OooO0OO oooO0OO, Handler handler, int i, boolean z) {
            super(handlerThread.getLooper());
            this.f7820OooO00o = handlerThread;
            this.f7821OooO0O0 = o0oo00o2;
            this.f7822OooO0OO = oooO0OO;
            this.f7823OooO0Oo = handler;
            this.f7819OooO = i;
            this.f7828OooOO0 = 5;
            this.f7827OooO0oo = z;
            this.f7825OooO0o0 = new ArrayList<>();
            this.f7824OooO0o = new HashMap<>();
        }

        public static Download OooO00o(Download download, int i, int i2) {
            return new Download(download.f7770OooO00o, i, download.f7772OooO0OO, System.currentTimeMillis(), download.f7775OooO0o0, i2, 0, download.f7777OooO0oo);
        }

        @Nullable
        public final Download OooO0O0(String str, boolean z) {
            int iOooO0OO = OooO0OO(str);
            if (iOooO0OO != -1) {
                return this.f7825OooO0o0.get(iOooO0OO);
            }
            if (!z) {
                return null;
            }
            try {
                return this.f7821OooO0O0.OooO0oo(str);
            } catch (IOException e) {
                Log.OooO0Oo("DownloadManager", "Failed to load download: " + str, e);
                return null;
            }
        }

        public final int OooO0OO(String str) {
            int i = 0;
            while (true) {
                ArrayList<Download> arrayList = this.f7825OooO0o0;
                if (i >= arrayList.size()) {
                    return -1;
                }
                if (arrayList.get(i).f7770OooO00o.f7779OooO0Oo.equals(str)) {
                    return i;
                }
                i++;
            }
        }

        public final void OooO0Oo(Download download) {
            int i = download.f7771OooO0O0;
            o00O0O.OooO0Oo((i == 3 || i == 4) ? false : true);
            int iOooO0OO = OooO0OO(download.f7770OooO00o.f7779OooO0Oo);
            ArrayList<Download> arrayList = this.f7825OooO0o0;
            if (iOooO0OO == -1) {
                arrayList.add(download);
                Collections.sort(arrayList, new o0O0O00());
            } else {
                boolean z = download.f7772OooO0OO != arrayList.get(iOooO0OO).f7772OooO0OO;
                arrayList.set(iOooO0OO, download);
                if (z) {
                    Collections.sort(arrayList, new o0O0O00());
                }
            }
            try {
                this.f7821OooO0O0.OooO00o(download);
            } catch (IOException e) {
                Log.OooO0Oo("DownloadManager", "Failed to update index.", e);
            }
            this.f7823OooO0Oo.obtainMessage(2, new C0150OooO00o(download, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        public final void OooO0o(Download download, int i) {
            if (i == 0) {
                if (download.f7771OooO0O0 == 1) {
                    OooO0o0(download, 0, 0);
                }
            } else if (i != download.f7774OooO0o) {
                int i2 = download.f7771OooO0O0;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                OooO0Oo(new Download(download.f7770OooO00o, i2, download.f7772OooO0OO, System.currentTimeMillis(), download.f7775OooO0o0, i, 0, download.f7777OooO0oo));
            }
        }

        public final Download OooO0o0(Download download, int i, int i2) {
            o00O0O.OooO0Oo((i == 3 || i == 4) ? false : true);
            Download downloadOooO00o = OooO00o(download, i, i2);
            OooO0Oo(downloadOooO00o);
            return downloadOooO00o;
        }

        public final void OooO0oO() {
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList<Download> arrayList = this.f7825OooO0o0;
                if (i >= arrayList.size()) {
                    return;
                }
                Download download = arrayList.get(i);
                HashMap<String, OooO0o> map = this.f7824OooO0o;
                OooO0o oooO0o = map.get(download.f7770OooO00o.f7779OooO0Oo);
                o000000 o000000Var = this.f7822OooO0OO;
                int i3 = download.f7771OooO0O0;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oooO0o.getClass();
                            o00O0O.OooO0Oo(!oooO0o.f7835OooO0oO);
                            if (!(!this.f7827OooO0oo && this.f7826OooO0oO == 0) || i2 >= this.f7819OooO) {
                                OooO0o0(download, 0, 0);
                                oooO0o.OooO00o(false);
                            }
                        } else {
                            if (i3 != 5 && i3 != 7) {
                                throw new IllegalStateException();
                            }
                            if (oooO0o != null) {
                                if (!oooO0o.f7835OooO0oO) {
                                    oooO0o.OooO00o(false);
                                }
                            } else if (!this.f7830OooOO0o) {
                                DownloadRequest downloadRequest = download.f7770OooO00o;
                                OooO0o oooO0o2 = new OooO0o(download.f7770OooO00o, o000000Var.OooO00o(downloadRequest), download.f7777OooO0oo, true, this.f7828OooOO0, this);
                                map.put(downloadRequest.f7779OooO0Oo, oooO0o2);
                                this.f7830OooOO0o = true;
                                oooO0o2.start();
                            }
                        }
                    } else if (oooO0o != null) {
                        o00O0O.OooO0Oo(!oooO0o.f7835OooO0oO);
                        oooO0o.OooO00o(false);
                    }
                } else if (oooO0o != null) {
                    o00O0O.OooO0Oo(!oooO0o.f7835OooO0oO);
                    oooO0o.OooO00o(false);
                } else {
                    if (!(!this.f7827OooO0oo && this.f7826OooO0oO == 0) || this.f7829OooOO0O >= this.f7819OooO) {
                        oooO0o = null;
                    } else {
                        Download downloadOooO0o0 = OooO0o0(download, 2, 0);
                        DownloadRequest downloadRequest2 = downloadOooO0o0.f7770OooO00o;
                        OooO0o oooO0o3 = new OooO0o(downloadOooO0o0.f7770OooO00o, o000000Var.OooO00o(downloadRequest2), downloadOooO0o0.f7777OooO0oo, false, this.f7828OooOO0, this);
                        map.put(downloadRequest2.f7779OooO0Oo, oooO0o3);
                        int i4 = this.f7829OooOO0O;
                        this.f7829OooOO0O = i4 + 1;
                        if (i4 == 0) {
                            sendEmptyMessageDelayed(11, 5000L);
                        }
                        oooO0o3.start();
                        oooO0o = oooO0o3;
                    }
                }
                if (oooO0o != null && !oooO0o.f7835OooO0oO) {
                    i2++;
                }
                i++;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:108:0x0218 A[LOOP:3: B:106:0x0210->B:108:0x0218, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:112:0x022f A[LOOP:4: B:110:0x0229->B:112:0x022f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:121:0x025e A[LOOP:5: B:119:0x0258->B:121:0x025e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:139:0x02c8  */
        /* JADX WARN: Code duplicated, block: B:159:0x0319  */
        /* JADX WARN: Code duplicated, block: B:237:0x0228 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            long j;
            ?? EmptyList;
            int i;
            ArrayList<Download> arrayList;
            int i2;
            ArrayList arrayList2;
            int i3;
            o0OO00O.OooO00o oooO00oOooO0Oo = null;
            int i4 = 0;
            i = 0;
            int i5 = 0;
            int i6 = 0;
            switch (message.what) {
                case 0:
                    int i7 = message.arg1;
                    o00000 o00000Var = this.f7821OooO0O0;
                    ArrayList<Download> arrayList3 = this.f7825OooO0o0;
                    this.f7826OooO0oO = i7;
                    try {
                        try {
                            o00000Var.OooO0oO();
                            oooO00oOooO0Oo = o00000Var.OooO0Oo(0, 1, 2, 5, 7);
                            while (true) {
                                Cursor cursor = oooO00oOooO0Oo.f34355OooO0Oo;
                                if (cursor.moveToPosition(cursor.getPosition() + 1)) {
                                    arrayList3.add(o0OO00O.OooOO0O(oooO00oOooO0Oo.f34355OooO0Oo));
                                }
                                o000OO00.OooO0oO(oooO00oOooO0Oo);
                                this.f7823OooO0Oo.obtainMessage(0, new ArrayList(arrayList3)).sendToTarget();
                                OooO0oO();
                                i5 = 1;
                                this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                                return;
                            }
                        } catch (IOException e) {
                            Log.OooO0Oo("DownloadManager", "Failed to load index.", e);
                            arrayList3.clear();
                        }
                    } catch (Throwable th) {
                        o000OO00.OooO0oO(oooO00oOooO0Oo);
                        throw th;
                    }
                    break;
                case 1:
                    this.f7827OooO0oo = message.arg1 != 0;
                    OooO0oO();
                    i5 = 1;
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 2:
                    this.f7826OooO0oO = message.arg1;
                    OooO0oO();
                    i5 = 1;
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i8 = message.arg1;
                    o00000 o00000Var2 = this.f7821OooO0O0;
                    if (str != null) {
                        Download downloadOooO0O0 = OooO0O0(str, false);
                        if (downloadOooO0O0 != null) {
                            OooO0o(downloadOooO0O0, i8);
                        } else {
                            try {
                                o00000Var2.OooO0o(i8, str);
                            } catch (IOException e2) {
                                Log.OooO0Oo("DownloadManager", "Failed to set manual stop reason: ".concat(str), e2);
                            }
                        }
                        break;
                    } else {
                        while (true) {
                            ArrayList<Download> arrayList4 = this.f7825OooO0o0;
                            if (i6 < arrayList4.size()) {
                                OooO0o(arrayList4.get(i6), i8);
                                i6++;
                            } else {
                                try {
                                    o00000Var2.OooO0OO(i8);
                                } catch (IOException e3) {
                                    Log.OooO0Oo("DownloadManager", "Failed to set manual stop reason", e3);
                                }
                            }
                            break;
                        }
                    }
                    OooO0oO();
                    i5 = 1;
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 4:
                    this.f7819OooO = message.arg1;
                    OooO0oO();
                    i5 = 1;
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 5:
                    this.f7828OooOO0 = message.arg1;
                    i5 = 1;
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i9 = message.arg1;
                    Download downloadOooO0O1 = OooO0O0(downloadRequest.f7779OooO0Oo, true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (downloadOooO0O1 != null) {
                        int i10 = downloadOooO0O1.f7771OooO0O0;
                        if (i10 == 5) {
                            j = jCurrentTimeMillis;
                        } else if ((i10 == 3 || i10 == 4) == true) {
                            j = jCurrentTimeMillis;
                        } else {
                            j = downloadOooO0O1.f7772OooO0OO;
                        }
                        int i11 = (i10 == 5 || i10 == 7) ? 7 : i9 != 0 ? 1 : 0;
                        DownloadRequest downloadRequest2 = downloadOooO0O1.f7770OooO00o;
                        downloadRequest2.getClass();
                        o00O0O.OooO00o(downloadRequest2.f7779OooO0Oo.equals(downloadRequest.f7779OooO0Oo));
                        List<StreamKey> list = downloadRequest2.f7782OooO0oO;
                        if (list.isEmpty()) {
                            EmptyList = Collections.emptyList();
                        } else {
                            List<StreamKey> list2 = downloadRequest.f7782OooO0oO;
                            if (list2.isEmpty()) {
                                EmptyList = Collections.emptyList();
                            } else {
                                EmptyList = new ArrayList(list);
                                for (int i12 = 0; i12 < list2.size(); i12++) {
                                    StreamKey streamKey = list2.get(i12);
                                    if (!EmptyList.contains(streamKey)) {
                                        EmptyList.add(streamKey);
                                    }
                                }
                            }
                        }
                        OooO0Oo(new Download(new DownloadRequest(downloadRequest2.f7779OooO0Oo, downloadRequest.f7781OooO0o0, downloadRequest.f7780OooO0o, EmptyList, downloadRequest.f7783OooO0oo, downloadRequest.f7778OooO, downloadRequest.f7784OooOO0), i11, j, jCurrentTimeMillis, i9));
                    } else {
                        OooO0Oo(new Download(downloadRequest, i9 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i9));
                    }
                    OooO0oO();
                    i5 = 1;
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    Download downloadOooO0O2 = OooO0O0(str2, true);
                    if (downloadOooO0O2 == null) {
                        Log.OooO0OO("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        OooO0o0(downloadOooO0O2, 5, 0);
                        OooO0oO();
                    }
                    i5 = 1;
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 8:
                    o00000 o00000Var3 = this.f7821OooO0O0;
                    ArrayList arrayList5 = new ArrayList();
                    try {
                        o0OO00O.OooO00o oooO00oOooO0Oo2 = o00000Var3.OooO0Oo(3, 4);
                        while (true) {
                            try {
                                Cursor cursor2 = oooO00oOooO0Oo2.f34355OooO0Oo;
                                if (cursor2.moveToPosition(cursor2.getPosition() + 1)) {
                                    arrayList5.add(o0OO00O.OooOO0O(oooO00oOooO0Oo2.f34355OooO0Oo));
                                } else {
                                    oooO00oOooO0Oo2.close();
                                    i = 0;
                                    while (true) {
                                        arrayList = this.f7825OooO0o0;
                                        if (i < arrayList.size()) {
                                            for (i2 = 0; i2 < arrayList5.size(); i2++) {
                                                arrayList.add(OooO00o((Download) arrayList5.get(i2), 5, 0));
                                            }
                                            Collections.sort(arrayList, new o0O0O00());
                                            try {
                                                o00000Var3.OooO0o0();
                                                break;
                                            } catch (IOException e4) {
                                                Log.OooO0Oo("DownloadManager", "Failed to update index.", e4);
                                            }
                                            arrayList2 = new ArrayList(arrayList);
                                            for (i3 = 0; i3 < arrayList.size(); i3++) {
                                                this.f7823OooO0Oo.obtainMessage(2, new C0150OooO00o(arrayList.get(i3), false, arrayList2, null)).sendToTarget();
                                            }
                                            OooO0oO();
                                            i5 = 1;
                                            this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                                            return;
                                        }
                                        arrayList.set(i, OooO00o(arrayList.get(i), 5, 0));
                                        i++;
                                    }
                                }
                                i = 0;
                                while (true) {
                                    arrayList = this.f7825OooO0o0;
                                    if (i < arrayList.size()) {
                                        while (i2 < arrayList5.size()) {
                                            arrayList.add(OooO00o((Download) arrayList5.get(i2), 5, 0));
                                        }
                                        Collections.sort(arrayList, new o0O0O00());
                                        o00000Var3.OooO0o0();
                                        arrayList2 = new ArrayList(arrayList);
                                        while (i3 < arrayList.size()) {
                                            this.f7823OooO0Oo.obtainMessage(2, new C0150OooO00o(arrayList.get(i3), false, arrayList2, null)).sendToTarget();
                                        }
                                        OooO0oO();
                                        i5 = 1;
                                        this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                                        return;
                                    }
                                    arrayList.set(i, OooO00o(arrayList.get(i), 5, 0));
                                    i++;
                                }
                            } catch (Throwable th2) {
                                if (oooO00oOooO0Oo2 == null) {
                                    throw th2;
                                }
                                try {
                                    oooO00oOooO0Oo2.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                            Log.OooO0OO("DownloadManager", "Failed to load downloads.");
                        }
                    } catch (IOException unused) {
                        Log.OooO0OO("DownloadManager", "Failed to load downloads.");
                    }
                    break;
                case 9:
                    OooO0o oooO0o = (OooO0o) message.obj;
                    String str3 = oooO0o.f7832OooO0Oo.f7779OooO0Oo;
                    this.f7824OooO0o.remove(str3);
                    boolean z = oooO0o.f7835OooO0oO;
                    if (z) {
                        this.f7830OooOO0o = false;
                    } else {
                        int i13 = this.f7829OooOO0O - 1;
                        this.f7829OooOO0O = i13;
                        if (i13 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (!oooO0o.f7837OooOO0) {
                        Exception exc = oooO0o.f7838OooOO0O;
                        if (exc != null) {
                            Log.OooO0Oo("DownloadManager", "Task failed: " + oooO0o.f7832OooO0Oo + ", " + z, exc);
                        }
                        Download downloadOooO0O3 = OooO0O0(str3, false);
                        downloadOooO0O3.getClass();
                        int i14 = downloadOooO0O3.f7771OooO0O0;
                        if (i14 == 2) {
                            o00O0O.OooO0Oo(!z);
                            Download download = new Download(downloadOooO0O3.f7770OooO00o, exc == null ? 3 : 4, downloadOooO0O3.f7772OooO0OO, System.currentTimeMillis(), downloadOooO0O3.f7775OooO0o0, downloadOooO0O3.f7774OooO0o, exc == null ? 0 : 1, downloadOooO0O3.f7777OooO0oo);
                            ArrayList<Download> arrayList6 = this.f7825OooO0o0;
                            arrayList6.remove(OooO0OO(download.f7770OooO00o.f7779OooO0Oo));
                            try {
                                this.f7821OooO0O0.OooO00o(download);
                            } catch (IOException e5) {
                                Log.OooO0Oo("DownloadManager", "Failed to update index.", e5);
                            }
                            this.f7823OooO0Oo.obtainMessage(2, new C0150OooO00o(download, false, new ArrayList(arrayList6), exc)).sendToTarget();
                        } else {
                            if (i14 != 5 && i14 != 7) {
                                throw new IllegalStateException();
                            }
                            o00O0O.OooO0Oo(z);
                            if (downloadOooO0O3.f7771OooO0O0 == 7) {
                                int i15 = downloadOooO0O3.f7774OooO0o;
                                OooO0o0(downloadOooO0O3, i15 == 0 ? 0 : 1, i15);
                                OooO0oO();
                            } else {
                                DownloadRequest downloadRequest3 = downloadOooO0O3.f7770OooO00o;
                                int iOooO0OO = OooO0OO(downloadRequest3.f7779OooO0Oo);
                                ArrayList<Download> arrayList7 = this.f7825OooO0o0;
                                arrayList7.remove(iOooO0OO);
                                try {
                                    this.f7821OooO0O0.OooO0O0(downloadRequest3.f7779OooO0Oo);
                                } catch (IOException unused2) {
                                    Log.OooO0OO("DownloadManager", "Failed to remove from database");
                                }
                                this.f7823OooO0Oo.obtainMessage(2, new C0150OooO00o(downloadOooO0O3, true, new ArrayList(arrayList7), null)).sendToTarget();
                            }
                        }
                        OooO0oO();
                        break;
                    } else {
                        OooO0oO();
                    }
                    this.f7823OooO0Oo.obtainMessage(1, i5, this.f7824OooO0o.size()).sendToTarget();
                    return;
                case 10:
                    OooO0o oooO0o2 = (OooO0o) message.obj;
                    int i16 = message.arg1;
                    int i17 = message.arg2;
                    int i18 = o000OO00.f34965OooO00o;
                    long j2 = (4294967295L & ((long) i17)) | ((((long) i16) & 4294967295L) << 32);
                    Download downloadOooO0O4 = OooO0O0(oooO0o2.f7832OooO0Oo.f7779OooO0Oo, false);
                    downloadOooO0O4.getClass();
                    if (j2 == downloadOooO0O4.f7775OooO0o0 || j2 == -1) {
                        return;
                    }
                    OooO0Oo(new Download(downloadOooO0O4.f7770OooO00o, downloadOooO0O4.f7771OooO0O0, downloadOooO0O4.f7772OooO0OO, System.currentTimeMillis(), j2, downloadOooO0O4.f7774OooO0o, downloadOooO0O4.f7776OooO0oO, downloadOooO0O4.f7777OooO0oo));
                    return;
                case 11:
                    while (true) {
                        ArrayList<Download> arrayList8 = this.f7825OooO0o0;
                        if (i4 >= arrayList8.size()) {
                            sendEmptyMessageDelayed(11, 5000L);
                            return;
                        }
                        Download download2 = arrayList8.get(i4);
                        if (download2.f7771OooO0O0 == 2) {
                            try {
                                this.f7821OooO0O0.OooO00o(download2);
                            } catch (IOException e6) {
                                Log.OooO0Oo("DownloadManager", "Failed to update index.", e6);
                            }
                        }
                        i4++;
                    }
                    break;
                case 12:
                    Iterator<OooO0o> it = this.f7824OooO0o.values().iterator();
                    while (it.hasNext()) {
                        it.next().OooO00o(true);
                    }
                    try {
                        this.f7821OooO0O0.OooO0oO();
                        break;
                    } catch (IOException e7) {
                        Log.OooO0Oo("DownloadManager", "Failed to update index.", e7);
                    }
                    this.f7825OooO0o0.clear();
                    this.f7820OooO00o.quit();
                    synchronized (this) {
                        notifyAll();
                        break;
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public interface OooO0OO {
        void OooO00o(OooO00o oooO00o, boolean z);

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo(Download download);

        void OooO0o();

        void OooO0o0();

        void OooO0oO(OooO00o oooO00o);
    }

    public static class OooO0o extends Thread implements androidx.media3.exoplayer.offline.OooO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public volatile OooO0O0 f7831OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final DownloadRequest f7832OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o000OOo f7833OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final androidx.media3.exoplayer.offline.OooO0O0 f7834OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f7835OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f7836OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public volatile boolean f7837OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public Exception f7838OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f7839OooOO0o = -1;

        public OooO0o(DownloadRequest downloadRequest, androidx.media3.exoplayer.offline.OooO0O0 oooO0O0, o000OOo o000ooo2, boolean z, int i, OooO0O0 oooO0O1) {
            this.f7832OooO0Oo = downloadRequest;
            this.f7834OooO0o0 = oooO0O0;
            this.f7833OooO0o = o000ooo2;
            this.f7835OooO0oO = z;
            this.f7836OooO0oo = i;
            this.f7831OooO = oooO0O1;
        }

        public final void OooO00o(boolean z) {
            if (z) {
                this.f7831OooO = null;
            }
            if (this.f7837OooOO0) {
                return;
            }
            this.f7837OooOO0 = true;
            this.f7834OooO0o0.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f7835OooO0oO) {
                    this.f7834OooO0o0.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.f7837OooOO0) {
                        try {
                            this.f7834OooO0o0.OooO00o(this);
                            break;
                        } catch (IOException e) {
                            if (!this.f7837OooOO0) {
                                long j2 = this.f7833OooO0o.f34348OooO00o;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                i++;
                                if (i > this.f7836OooO0oo) {
                                    throw e;
                                }
                                Thread.sleep(Math.min((i - 1) * 1000, 5000));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.f7838OooOO0O = e2;
            }
            OooO0O0 oooO0O0 = this.f7831OooO;
            if (oooO0O0 != null) {
                oooO0O0.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o000O0oO.oo0o0Oo] */
    public OooO00o(Context context, o0OO00O o0oo00o2, p364o0OOo00.OooO0OO oooO0OO) {
        this.f7803OooO00o = context.getApplicationContext();
        this.f7804OooO0O0 = o0oo00o2;
        Handler handlerOooOOO0 = o000OO00.OooOOO0(new Handler.Callback() { // from class: o000O0oO.oo0o0Oo
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                OooO00o oooO00o = this.f34356OooO0Oo;
                oooO00o.getClass();
                int i = message.what;
                CopyOnWriteArraySet<OooO00o.OooO0OO> copyOnWriteArraySet = oooO00o.f7808OooO0o0;
                if (i == 0) {
                    List list = (List) message.obj;
                    oooO00o.f7810OooO0oo = true;
                    oooO00o.f7815OooOOO0 = Collections.unmodifiableList(list);
                    boolean zOooO0Oo = oooO00o.OooO0Oo();
                    Iterator<OooO00o.OooO0OO> it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        it.next().OooO0oO(oooO00o);
                    }
                    if (zOooO0Oo) {
                        oooO00o.OooO00o();
                    }
                } else if (i == 1) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    int i4 = oooO00o.f7807OooO0o - i2;
                    oooO00o.f7807OooO0o = i4;
                    oooO00o.f7809OooO0oO = i3;
                    if (i3 == 0 && i4 == 0) {
                        Iterator<OooO00o.OooO0OO> it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            it2.next().OooO0o();
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    OooO00o.C0150OooO00o c0150OooO00o = (OooO00o.C0150OooO00o) message.obj;
                    oooO00o.f7815OooOOO0 = Collections.unmodifiableList(c0150OooO00o.f7818OooO0OO);
                    boolean zOooO0Oo2 = oooO00o.OooO0Oo();
                    if (c0150OooO00o.f7817OooO0O0) {
                        Iterator<OooO00o.OooO0OO> it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            it3.next().OooO0O0();
                        }
                    } else {
                        Iterator<OooO00o.OooO0OO> it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            it4.next().OooO0Oo(c0150OooO00o.f7816OooO00o);
                        }
                    }
                    if (zOooO0Oo2) {
                        oooO00o.OooO00o();
                    }
                }
                return true;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        OooO0O0 oooO0O0 = new OooO0O0(handlerThread, o0oo00o2, oooO0OO, handlerOooOOO0, this.f7811OooOO0, this.f7802OooO);
        this.f7805OooO0OO = oooO0O0;
        oo0oO0 oo0oo0 = new oo0oO0(this);
        this.f7806OooO0Oo = oo0oo0;
        o00000O o00000o = new o00000O(context, oo0oo0, f7801OooOOOO);
        this.f7814OooOOO = o00000o;
        int iOooO0O0 = o00000o.OooO0O0();
        this.f7812OooOO0O = iOooO0O0;
        this.f7807OooO0o = 1;
        oooO0O0.obtainMessage(0, iOooO0O0, 0).sendToTarget();
    }

    public final void OooO00o() {
        Iterator<OooO0OO> it = this.f7808OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this, this.f7813OooOO0o);
        }
    }

    public final void OooO0O0(o00000O o00000o, int i) {
        Requirements requirements = o00000o.f34359OooO0OO;
        if (this.f7812OooOO0O != i) {
            this.f7812OooOO0O = i;
            this.f7807OooO0o++;
            this.f7805OooO0OO.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean zOooO0Oo = OooO0Oo();
        Iterator<OooO0OO> it = this.f7808OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO();
        }
        if (zOooO0Oo) {
            OooO00o();
        }
    }

    public final void OooO0OO(boolean z) {
        if (this.f7802OooO == z) {
            return;
        }
        this.f7802OooO = z;
        this.f7807OooO0o++;
        this.f7805OooO0OO.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean zOooO0Oo = OooO0Oo();
        Iterator<OooO0OO> it = this.f7808OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooO0o0();
        }
        if (zOooO0Oo) {
            OooO00o();
        }
    }

    public final boolean OooO0Oo() {
        boolean z;
        if (!this.f7802OooO && this.f7812OooOO0O != 0) {
            int i = 0;
            while (true) {
                if (i >= this.f7815OooOOO0.size()) {
                    z = false;
                    break;
                }
                if (this.f7815OooOOO0.get(i).f7771OooO0O0 == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z2 = this.f7813OooOO0o != z;
        this.f7813OooOO0o = z;
        return z2;
    }
}
