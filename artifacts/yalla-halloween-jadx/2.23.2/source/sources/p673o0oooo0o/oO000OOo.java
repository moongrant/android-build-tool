package p673o0oooo0o;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p039OoooOoo.o00O0OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000OOo implements Handler.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f59920OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0OO0 f59921OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f59922OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f59923OooO0oO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f59924OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f59925OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O0OO0 f59927OooO0Oo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f59926OooO0OO = 100;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f59928OooO0o0 = new ArrayList();

        public OooO00o(Context context) {
            this.f59924OooO00o = context;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
        public final ArrayList OooO00o() throws IOException {
            String strReplace;
            File file;
            File fileOooO00o;
            boolean z;
            oO000OOo oo000ooo = new oO000OOo(this);
            ArrayList arrayList = new ArrayList();
            Iterator it = oo000ooo.f59923OooO0oO.iterator();
            while (it.hasNext()) {
                oO0OoOO0 oo0oooo0 = (oO0OoOO0) it.next();
                oO0Ooooo.SINGLE.getClass();
                boolean z2 = true;
                File file2 = null;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(oo0oooo0.open(), null, options);
                    strReplace = options.outMimeType.replace("image/", ".");
                } catch (Exception unused) {
                    strReplace = ".jpg";
                }
                if (TextUtils.isEmpty(oo000ooo.f59920OooO0Oo)) {
                    File externalCacheDir = this.f59924OooO00o.getExternalCacheDir();
                    if (externalCacheDir != null) {
                        File file3 = new File(externalCacheDir, "luban_disk_cache");
                        if (file3.mkdirs() || (file3.exists() && file3.isDirectory())) {
                            file2 = file3;
                        }
                    } else if (Log.isLoggable("Luban", 6)) {
                        Log.e("Luban", "default disk cache dir is null");
                    }
                    oo000ooo.f59920OooO0Oo = file2.getAbsolutePath();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(oo000ooo.f59920OooO0Oo);
                sb.append("/");
                sb.append(System.currentTimeMillis());
                sb.append((int) (Math.random() * 1000.0d));
                sb.append(TextUtils.isEmpty(strReplace) ? ".jpg" : strReplace);
                File file4 = new File(sb.toString());
                o00O0OO0 o00o0oo1 = oo000ooo.f59921OooO0o;
                int i = oo000ooo.f59922OooO0o0;
                if (o00o0oo1 != null) {
                    String strOooO00o = oo0oooo0.OooO00o();
                    if (strOooO00o == null || StringsKt.isBlank(strOooO00o)) {
                        z = false;
                    } else {
                        Intrinsics.checkNotNull(strOooO00o);
                        if (StringsKt__StringsJVMKt.endsWith(strOooO00o, ".gif", true)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        oO0Ooooo oo0ooooo = oO0Ooooo.SINGLE;
                        String strOooO00o2 = oo0oooo0.OooO00o();
                        oo0ooooo.getClass();
                        if (i > 0) {
                            File file5 = new File(strOooO00o2);
                            if (!file5.exists() || file5.length() <= (i << 10)) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            fileOooO00o = new oO0o0o(oo0oooo0, file4).OooO00o();
                        }
                    }
                    file = new File(oo0oooo0.OooO00o());
                    fileOooO00o = file;
                } else {
                    oO0Ooooo oo0ooooo2 = oO0Ooooo.SINGLE;
                    String strOooO00o3 = oo0oooo0.OooO00o();
                    oo0ooooo2.getClass();
                    if (i > 0) {
                        File file6 = new File(strOooO00o3);
                        if (!file6.exists() || file6.length() <= (i << 10)) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        fileOooO00o = new oO0o0o(oo0oooo0, file4).OooO00o();
                    } else {
                        file = new File(oo0oooo0.OooO00o());
                        fileOooO00o = file;
                    }
                }
                arrayList.add(fileOooO00o);
                it.remove();
            }
            return arrayList;
        }
    }

    public oO000OOo(OooO00o oooO00o) {
        this.f59920OooO0Oo = oooO00o.f59925OooO0O0;
        this.f59923OooO0oO = oooO00o.f59928OooO0o0;
        this.f59922OooO0o0 = oooO00o.f59926OooO0OO;
        this.f59921OooO0o = oooO00o.f59927OooO0Oo;
        new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
