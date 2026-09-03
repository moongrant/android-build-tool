package p381o0OOoOOO;

import OooO00o.OooO00o;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO implements Closeable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final URL f38764Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public volatile Future<?> f38765Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Task<Bitmap> f38766Oooo0oo;

    public o00O0OO(URL url) {
        this.f38764Oooo0o = url;
    }

    public final Bitmap OooO00o() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Starting download of: ");
            sbOooO0o0.append(this.f38764Oooo0o);
            Log.i("FirebaseMessaging", sbOooO0o0.toString());
        }
        URLConnection uRLConnectionOpenConnection = this.f38764Oooo0o.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrOooO0O0 = o000OOo0.OooO0O0(new o000OOo0.OooO00o(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Downloaded ");
                sbOooO0o1.append(bArrOooO0O0.length);
                sbOooO0o1.append(" bytes from ");
                sbOooO0o1.append(this.f38764Oooo0o);
                Log.v("FirebaseMessaging", sbOooO0o1.toString());
            }
            if (bArrOooO0O0.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrOooO0O0, 0, bArrOooO0O0.length);
            if (bitmapDecodeByteArray == null) {
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Failed to decode image: ");
                sbOooO0o2.append(this.f38764Oooo0o);
                throw new IOException(sbOooO0o2.toString());
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sbOooO0o3 = OooO00o.OooO0o0("Successfully downloaded image: ");
                sbOooO0o3.append(this.f38764Oooo0o);
                Log.d("FirebaseMessaging", sbOooO0o3.toString());
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38765Oooo0oO.cancel(true);
    }
}
