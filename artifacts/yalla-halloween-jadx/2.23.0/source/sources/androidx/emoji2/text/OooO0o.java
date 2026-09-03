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
public final class OooO0o {

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

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO0OO extends OooO0O0 {
        @Override // androidx.emoji2.text.OooO0o.OooO00o
        @NonNull
        public final Signature[] OooO00o(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    @Nullable
    public static Oooo000 OooO00o(@NonNull Context context) {
        ProviderInfo providerInfo;
        o0000O0.OooOO0 oooOO1;
        boolean z;
        ApplicationInfo applicationInfo;
        OooO00o oooO0OO = Build.VERSION.SDK_INT >= 28 ? new OooO0OO() : new OooO0O0();
        PackageManager packageManager = context.getPackageManager();
        o000OO.OooOOO0.OooO0o0(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        do {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null) {
                z = false;
            } else {
                z = true;
                if ((applicationInfo.flags & 1) != 1) {
                    z = false;
                }
            }
        } while (!z);
        if (providerInfo == null) {
            oooOO1 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrOooO00o = oooO0OO.OooO00o(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrOooO00o) {
                    arrayList.add(signature.toByteArray());
                }
                oooOO1 = new o0000O0.OooOO0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                oooOO1 = null;
            }
        }
        if (oooOO1 == null) {
            return null;
        }
        return new Oooo000(context, oooOO1);
    }
}
