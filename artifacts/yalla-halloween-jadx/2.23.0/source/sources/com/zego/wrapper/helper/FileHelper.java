package com.zego.wrapper.helper;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class FileHelper {
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    public static String copyAssetsFile2Phone(Context context, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpen;
        FileOutputStream fileOutputStream2;
        InputStream inputStream = null;
        try {
            File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + str);
            inputStreamOpen = context.getAssets().open(str);
            try {
                if (file.exists() && file.length() == inputStreamOpen.available()) {
                    fileOutputStream2 = null;
                } else {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                        fileOutputStream2.flush();
                    } catch (IOException e) {
                        fileOutputStream = fileOutputStream2;
                        e = e;
                        try {
                            e.printStackTrace();
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStreamOpen;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        fileOutputStream = fileOutputStream2;
                        th = th2;
                        inputStream = inputStreamOpen;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                }
                String path = file.getPath();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused5) {
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused6) {
                    }
                }
                return path;
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpen = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (fileOutputStream == null) {
                throw th;
            }
            fileOutputStream.close();
            throw th;
        }
    }
}
