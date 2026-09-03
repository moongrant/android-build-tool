package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o {
        @NonNull
        public Signature[] OooO00o(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO0O0 extends OooO00o {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO0OO$OooO0OO, reason: collision with other inner class name */
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class C0051OooO0OO extends OooO0O0 {
        @Override // androidx.emoji2.text.OooO0OO.OooO00o
        @NonNull
        public final Signature[] OooO00o(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @Nullable
    public static OooOOO OooO00o(@NonNull Context context) {
        ProviderInfo providerInfo;
        o000O0.OooOO0 oooOO1;
        boolean z;
        ApplicationInfo applicationInfo;
        OooO00o c0051OooO0OO = Build.VERSION.SDK_INT >= 28 ? new C0051OooO0OO() : new OooO0O0();
        PackageManager packageManager = context.getPackageManager();
        o000OO0O.OooOOO0.OooO0Oo(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        do {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            z = true;
            if (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) {
                z = false;
            }
        } while (!z);
        if (providerInfo == null) {
            oooOO1 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrOooO00o = c0051OooO0OO.OooO00o(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrOooO00o) {
                    arrayList.add(signature.toByteArray());
                }
                oooOO1 = new o000O0.OooOO0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                oooOO1 = null;
            }
        }
        if (oooOO1 == null) {
            return null;
        }
        return new OooOOO(context, oooOO1);
    }
}
