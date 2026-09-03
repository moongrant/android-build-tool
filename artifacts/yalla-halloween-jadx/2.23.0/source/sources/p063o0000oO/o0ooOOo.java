package p063o0000oO;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0ooOOo {
    @DoNotInline
    public static String OooO00o(File file) {
        return Environment.getExternalStorageState(file);
    }
}
