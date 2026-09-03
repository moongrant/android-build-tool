package p207o00o0oO;

import OooO0o.OooO0OO;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o {
    public static String OooO00o(Context context, String str) {
        int iLastIndexOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            File file = new File(str);
            String strSubstring = file.getName() + "_" + file.hashCode() + "_Rotating";
            HashMap<String, String> map = o00O00o0.f33292OooO00o;
            if (!TextUtils.isEmpty(strSubstring) && o00O00o0.OooO0o0(strSubstring) && (iLastIndexOf = strSubstring.lastIndexOf(o00O00o0.OooO0OO(strSubstring))) > 0 && iLastIndexOf < strSubstring.length()) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            }
            return OooO0O0(context, strSubstring);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String OooO0O0(Context context, String str) {
        File file = new File(OooO.OooO00o(new StringBuilder(), (Environment.getExternalStorageState().equals("mounted") || !Environment.isExternalStorageRemovable()) ? context.getExternalCacheDir().getPath() : context.getCacheDir().getPath(), "/MyPhoto"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file + OooO0OO.OooO00o("/", str, ".png");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:10:0x001c, B:14:0x0024), top: B:45:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x003f A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #4 {Exception -> 0x003b, blocks: (B:26:0x0037, B:30:0x003f), top: B:51:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0053 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #2 {Exception -> 0x004f, blocks: (B:37:0x004b, B:41:0x0053), top: B:47:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String OooO0OO(Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!new File(str).exists()) {
                fileOutputStream = new FileOutputStream(str);
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream2 = fileOutputStream;
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return null;
                            }
                        } else if (bitmap != null) {
                            bitmap.recycle();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            throw th;
                        }
                    } else if (bitmap != null) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            } else if (bitmap != null) {
                bitmap.recycle();
            }
            return str;
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } else if (bitmap != null) {
                bitmap.recycle();
            }
            throw th;
        }
    }
}
