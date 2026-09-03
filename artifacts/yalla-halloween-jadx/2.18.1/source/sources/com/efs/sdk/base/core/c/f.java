package com.efs.sdk.base.core.c;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static FileLock b;
    public volatile int a;

    public static class a {
        private static final f a = new f(0);
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public final boolean a() {
        if (this.a == 2) {
            return true;
        }
        if (this.a != 0) {
            return false;
        }
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        return false;
    }

    private f() {
        this.a = 0;
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
    }

    private synchronized void a(final Context context) {
        com.efs.sdk.base.core.util.d.a("efs.send_log", "tryFileLock start! ", null);
        this.a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.core.c.f.1
            @Override // java.lang.Runnable
            public final void run() {
                FileLock fileLockLock;
                try {
                    File fileA = com.efs.sdk.base.core.util.a.a(context);
                    if (!fileA.exists()) {
                        fileA.mkdirs();
                    }
                    File file = new File(fileA.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        fileLockLock = new FileOutputStream(file).getChannel().lock();
                        f.b = fileLockLock;
                    } while (!fileLockLock.isValid());
                    com.efs.sdk.base.core.util.d.a("efs.send_log", "tryFileLock sendlock sucess! processname: " + com.efs.sdk.base.core.util.e.b(), null);
                    f.this.a = 2;
                } catch (Exception e) {
                    com.efs.sdk.base.core.util.d.a("efs.send_log", "tryFileLock fail! " + e.getMessage(), null);
                    f.this.a = 0;
                }
            }
        }).start();
    }
}
