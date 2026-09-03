package p668o0oooo00;

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
import p135o00OOOo.OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO0 implements Handler.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f60344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f60345OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f60346OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f60347OooO0oO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f60348OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f60349OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0 f60351OooO0Oo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f60350OooO0OO = 100;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f60352OooO0o0 = new ArrayList();

        public OooO00o(Context context) {
            this.f60348OooO00o = context;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00df  */
        public final ArrayList OooO00o() throws IOException {
            String strReplace;
            File file;
            File fileOooO00o;
            boolean z;
            o00O0OO0 o00o0oo1 = new o00O0OO0(this);
            ArrayList arrayList = new ArrayList();
            Iterator it = o00o0oo1.f60347OooO0oO.iterator();
            while (it.hasNext()) {
                o00O0O0 o00o0o0 = (o00O0O0) it.next();
                o00O0.SINGLE.getClass();
                boolean z2 = true;
                File file2 = null;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(o00o0o0.open(), null, options);
                    strReplace = options.outMimeType.replace("image/", ".");
                } catch (Exception unused) {
                    strReplace = ".jpg";
                }
                if (TextUtils.isEmpty(o00o0oo1.f60344OooO0Oo)) {
                    File externalCacheDir = this.f60348OooO00o.getExternalCacheDir();
                    if (externalCacheDir != null) {
                        File file3 = new File(externalCacheDir, "luban_disk_cache");
                        if (file3.mkdirs() || (file3.exists() && file3.isDirectory())) {
                            file2 = file3;
                        }
                    } else if (Log.isLoggable("Luban", 6)) {
                        Log.e("Luban", "default disk cache dir is null");
                    }
                    o00o0oo1.f60344OooO0Oo = file2.getAbsolutePath();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(o00o0oo1.f60344OooO0Oo);
                sb.append("/");
                sb.append(System.currentTimeMillis());
                sb.append((int) (Math.random() * 1000.0d));
                sb.append(TextUtils.isEmpty(strReplace) ? ".jpg" : strReplace);
                File file4 = new File(sb.toString());
                OooO0O0 oooO0O0 = o00o0oo1.f60345OooO0o;
                int i = o00o0oo1.f60346OooO0o0;
                if (oooO0O0 != null) {
                    String it2 = o00o0o0.OooO00o();
                    if (it2 == null || StringsKt.isBlank(it2)) {
                        z = false;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(it2, "it");
                        if (StringsKt__StringsJVMKt.endsWith(it2, ".gif", true)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        o00O0 o00o1 = o00O0.SINGLE;
                        String strOooO00o = o00o0o0.OooO00o();
                        o00o1.getClass();
                        if (i > 0) {
                            File file5 = new File(strOooO00o);
                            if (!file5.exists() || file5.length() <= (i << 10)) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            fileOooO00o = new o00O0O00(o00o0o0, file4).OooO00o();
                        }
                    }
                    file = new File(o00o0o0.OooO00o());
                    fileOooO00o = file;
                } else {
                    o00O0 o00o2 = o00O0.SINGLE;
                    String strOooO00o2 = o00o0o0.OooO00o();
                    o00o2.getClass();
                    if (i > 0) {
                        File file6 = new File(strOooO00o2);
                        if (!file6.exists() || file6.length() <= (i << 10)) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        fileOooO00o = new o00O0O00(o00o0o0, file4).OooO00o();
                    } else {
                        file = new File(o00o0o0.OooO00o());
                        fileOooO00o = file;
                    }
                }
                arrayList.add(fileOooO00o);
                it.remove();
            }
            return arrayList;
        }
    }

    public o00O0OO0(OooO00o oooO00o) {
        this.f60344OooO0Oo = oooO00o.f60349OooO0O0;
        this.f60347OooO0oO = oooO00o.f60352OooO0o0;
        this.f60346OooO0o0 = oooO00o.f60350OooO0OO;
        this.f60345OooO0o = oooO00o.f60351OooO0Oo;
        new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
