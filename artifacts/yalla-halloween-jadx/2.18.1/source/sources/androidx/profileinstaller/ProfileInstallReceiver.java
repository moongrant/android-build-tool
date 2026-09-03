package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import p088o000o00.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class OooO00o implements ProfileInstaller.OooO0OO {
        public OooO00o() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO00o(int i, @Nullable Object obj) {
            ProfileInstaller.f8822OooO0O0.OooO00o(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.OooO0OO(context, OooOO0.f28598Oooo0o, new OooO00o(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string)) {
                if ("DELETE_SKIP_FILE".equals(string)) {
                    OooOO0 oooOO1 = OooOO0.f28598Oooo0o;
                    OooO00o oooO00o = new OooO00o();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    ProfileInstaller.OooO0O0(oooOO1, oooO00o, 11, null);
                    return;
                }
                return;
            }
            OooOO0 oooOO2 = OooOO0.f28598Oooo0o;
            OooO00o oooO00o2 = new OooO00o();
            try {
                ProfileInstaller.OooO00o(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                ProfileInstaller.OooO0O0(oooOO2, oooO00o2, 10, null);
            } catch (PackageManager.NameNotFoundException e) {
                ProfileInstaller.OooO0O0(oooOO2, oooO00o2, 7, e);
            }
        }
    }
}
