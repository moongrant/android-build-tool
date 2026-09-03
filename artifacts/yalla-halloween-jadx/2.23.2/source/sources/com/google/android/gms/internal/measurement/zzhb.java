package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhb {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("DirectBootUtils.class")
    public static UserManager f15230OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile boolean f15231OooO0O0 = !zzb();

    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[Catch: all -> 0x005b, TryCatch #1 {, blocks: (B:9:0x000f, B:11:0x0013, B:16:0x001b, B:18:0x001f, B:19:0x0029, B:33:0x0055, B:34:0x0057, B:22:0x002f, B:24:0x0035, B:31:0x0051, B:28:0x0042), top: B:43:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[Catch: all -> 0x005b, TryCatch #1 {, blocks: (B:9:0x000f, B:11:0x0013, B:16:0x001b, B:18:0x001f, B:19:0x0029, B:33:0x0055, B:34:0x0057, B:22:0x002f, B:24:0x0035, B:31:0x0051, B:28:0x0042), top: B:43:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x005a A[RETURN] */
    public static boolean zza(Context context) {
        boolean z;
        if (zzb() && !f15231OooO0O0) {
            synchronized (zzhb.class) {
                if (!f15231OooO0O0) {
                    int i = 1;
                    while (true) {
                        if (i <= 2) {
                            if (f15230OooO00o == null) {
                                f15230OooO00o = (UserManager) context.getSystemService(UserManager.class);
                            }
                            UserManager userManager = f15230OooO00o;
                            if (userManager == null) {
                                z = true;
                            } else {
                                try {
                                    if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                        z = true;
                                    }
                                    if (z) {
                                        f15230OooO00o = null;
                                    }
                                } catch (NullPointerException e) {
                                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                    f15230OooO00o = null;
                                    i++;
                                }
                            }
                            if (z) {
                                f15231OooO0O0 = true;
                            }
                            if (!z) {
                                return true;
                            }
                        }
                        z = false;
                        if (z) {
                            f15230OooO00o = null;
                        }
                        if (z) {
                            f15231OooO0O0 = true;
                        }
                        if (!z) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 24)
    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
