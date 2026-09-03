package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import p106o000ooO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class OooO00o implements ProfileInstaller.OooO0OO {
        public OooO00o() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO00o() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO0O0(int i, @Nullable Object obj) {
            ProfileInstaller.f10527OooO0O0.OooO0O0(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) throws IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.OooO0O0(context, new o00O00OO(), new OooO00o(), true);
            return;
        }
        boolean zEquals = "androidx.profileinstaller.action.SKIP_FILE".equals(action);
        ProfileInstaller.OooO0O0 oooO0O0 = ProfileInstaller.f10527OooO0O0;
        if (zEquals) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        oooO0O0.OooO0O0(11, null);
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                try {
                    ProfileInstaller.OooO00o(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    oooO0O0.OooO0O0(10, null);
                    setResultCode(10);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    oooO0O0.OooO0O0(7, e);
                    setResultCode(7);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            if (Build.VERSION.SDK_INT < 24) {
                oooO0O0.OooO0O0(13, null);
                setResultCode(13);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                oooO0O0.OooO0O0(12, null);
                setResultCode(12);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
            oooO0O0.OooO0O0(16, null);
            setResultCode(16);
            return;
        }
        if (androidx.profileinstaller.OooO00o.OooO00o(Build.VERSION.SDK_INT >= 24 ? context.createDeviceProtectedStorageContext().getCodeCacheDir() : context.getCodeCacheDir())) {
            oooO0O0.OooO0O0(14, null);
            setResultCode(14);
        } else {
            oooO0O0.OooO0O0(15, null);
            setResultCode(15);
        }
    }
}
