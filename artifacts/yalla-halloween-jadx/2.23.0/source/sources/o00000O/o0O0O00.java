package o00000O;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements Iterable<Intent> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<Intent> f33966OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f33967OooO0o0;

    public o0O0O00(Context context) {
        this.f33967OooO0o0 = context;
    }

    @NonNull
    public final void OooO00o(@NonNull ComponentName componentName) {
        Context context = this.f33967OooO0o0;
        ArrayList<Intent> arrayList = this.f33966OooO0Oo;
        int size = arrayList.size();
        try {
            for (Intent intentOooO0O0 = Oooo0.OooO0O0(context, componentName); intentOooO0O0 != null; intentOooO0O0 = Oooo0.OooO0O0(context, intentOooO0O0.getComponent())) {
                arrayList.add(size, intentOooO0O0);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void OooO0O0() {
        ArrayList<Intent> arrayList = this.f33966OooO0Oo;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = ContextCompat.f5271OooO00o;
        ContextCompat.OooO00o.OooO00o(this.f33967OooO0o0, intentArr, null);
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f33966OooO0Oo.iterator();
    }
}
