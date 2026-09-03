package p695oO000oOO;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.appevents.Oooo0;
import com.yalla.support.cloudfilemanager.interceptor.ImageCompressInterceptor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0000O implements Handler.Callback {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public List<o0> f52715Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f52716Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f52717Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Oooo0 f52718Oooo0oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Context f52719OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f52720OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Oooo0 f52722OooO0Oo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f52721OooO0OO = 100;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List<o0> f52723OooO0o0 = new ArrayList();

        public OooO00o(Context context) {
            this.f52719OooO00o = context;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<oO000oOO.o0>] */
        public final List<File> OooO00o() throws IOException {
            String strReplace;
            File file;
            File fileOooO00o;
            o0O0000O o0o0000o2 = new o0O0000O(this);
            Context context = this.f52719OooO00o;
            ArrayList arrayList = new ArrayList();
            Iterator it = o0o0000o2.f52715Oooo.iterator();
            while (it.hasNext()) {
                o0 o0Var = (o0) it.next();
                Objects.requireNonNull(o0oOOo.SINGLE);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(o0Var.open(), null, options);
                    strReplace = options.outMimeType.replace("image/", ".");
                } catch (Exception unused) {
                    strReplace = ".jpg";
                }
                if (TextUtils.isEmpty(o0o0000o2.f52716Oooo0o)) {
                    o0o0000o2.f52716Oooo0o = o0o0000o2.OooO00o(context).getAbsolutePath();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(o0o0000o2.f52716Oooo0o);
                sb.append("/");
                sb.append(System.currentTimeMillis());
                sb.append((int) (Math.random() * 1000.0d));
                sb.append(TextUtils.isEmpty(strReplace) ? ".jpg" : strReplace);
                File file2 = new File(sb.toString());
                if (o0o0000o2.f52718Oooo0oo != null) {
                    if (ImageCompressInterceptor.m252onUpload$lambda0(o0Var.OooO00o()) && o0oOOo.SINGLE.OooO0O0(o0o0000o2.f52717Oooo0oO, o0Var.OooO00o())) {
                        fileOooO00o = new o0O0o(o0Var, file2).OooO00o();
                    } else {
                        file = new File(o0Var.OooO00o());
                        fileOooO00o = file;
                    }
                } else if (o0oOOo.SINGLE.OooO0O0(o0o0000o2.f52717Oooo0oO, o0Var.OooO00o())) {
                    fileOooO00o = new o0O0o(o0Var, file2).OooO00o();
                } else {
                    file = new File(o0Var.OooO00o());
                    fileOooO00o = file;
                }
                arrayList.add(fileOooO00o);
                it.remove();
            }
            return arrayList;
        }
    }

    public o0O0000O(OooO00o oooO00o) {
        this.f52716Oooo0o = oooO00o.f52720OooO0O0;
        this.f52715Oooo = oooO00o.f52723OooO0o0;
        this.f52717Oooo0oO = oooO00o.f52721OooO0OO;
        this.f52718Oooo0oo = oooO00o.f52722OooO0Oo;
        new Handler(Looper.getMainLooper(), this);
    }

    public final File OooO00o(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            if (!Log.isLoggable("Luban", 6)) {
                return null;
            }
            Log.e("Luban", "default disk cache dir is null");
            return null;
        }
        File file = new File(externalCacheDir, "luban_disk_cache");
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
