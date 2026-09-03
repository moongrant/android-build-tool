package p454o0Ooo0;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.OooO0OO;
import com.umeng.analytics.pro.ao;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p458o0Ooo00o.o0O0O00;
import p552o0oOO0Oo.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    public class OooO00o extends Thread {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final /* synthetic */ int f40353Oooo = 0;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O00 f40354Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Context f40355Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000O0o f40356Oooo0oo;

        public OooO00o(o0O0O00 o0o0o00, Context context, o000O0o o000o0o2) {
            this.f40354Oooo0o = o0o0o00;
            this.f40355Oooo0oO = context;
            this.f40356Oooo0oo = o000o0o2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f40354Oooo0o.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]).get(3000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                this.f40354Oooo0o.cancel(true);
                ((Activity) this.f40355Oooo0oO).runOnUiThread(new OooO0OO(this.f40356Oooo0oo, e, 1));
                e.printStackTrace();
            }
        }
    }

    public static void OooO00o(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void OooO0O0(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, o000O0o o000o0o2) {
        new OooO00o(new o0O0O00(context, uri, uri2, i, i2, o000o0o2), context, o000o0o2).start();
    }

    public static BitmapFactory.Options OooO0OO(Context context, String str) {
        Uri uriOooO0Oo;
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            if (Build.VERSION.SDK_INT < 29 || (uriOooO0Oo = OooO0Oo(context, str)) == null) {
                BitmapFactory.decodeFile(str, options);
            } else {
                BitmapFactory.decodeFileDescriptor(context.getContentResolver().openFileDescriptor(uriOooO0Oo, "r").getFileDescriptor(), null, options);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return options;
    }

    public static Uri OooO0Oo(Context context, String str) {
        Uri uri = Uri.parse("content://media/external/images/media");
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, "bucket_display_name");
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            if (str.equals(cursorQuery.getString(cursorQuery.getColumnIndex("_data")))) {
                return Uri.withAppendedPath(uri, "" + cursorQuery.getInt(cursorQuery.getColumnIndex(ao.d)));
            }
            cursorQuery.moveToNext();
        }
        return null;
    }
}
