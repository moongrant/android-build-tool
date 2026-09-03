package com.yalla.yalla.common.util;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class NetWorkUtil {

    public static class CommandResult {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f21211OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f21212OooO0O0;

        public CommandResult(int i, String str, String str2) {
            this.f21211OooO00o = str;
            this.f21212OooO0O0 = str2;
        }
    }

    public static void OooO00o(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
