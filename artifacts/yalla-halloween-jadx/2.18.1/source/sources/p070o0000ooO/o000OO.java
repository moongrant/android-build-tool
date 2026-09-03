package p070o0000ooO;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import o000O000.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO implements Iterable<Intent> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ArrayList<Intent> f27998Oooo0o = new ArrayList<>();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Context f27999Oooo0oO;

    public o000OO(Context context) {
        this.f27999Oooo0oO = context;
    }

    @NonNull
    public final o000OO OooO00o(@NonNull ComponentName componentName) {
        int size = this.f27998Oooo0o.size();
        try {
            Intent intentOooO0O0 = o0O0O00.OooO0O0(this.f27999Oooo0oO, componentName);
            while (intentOooO0O0 != null) {
                this.f27998Oooo0o.add(size, intentOooO0O0);
                intentOooO0O0 = o0O0O00.OooO0O0(this.f27999Oooo0oO, intentOooO0O0.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void OooO0O0() {
        if (this.f27998Oooo0o.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f27998Oooo0o.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f27999Oooo0oO;
        Object obj = OooO00o.f28085OooO00o;
        OooO00o.C0293OooO00o.OooO00o(context, intentArr, null);
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f27998Oooo0o.iterator();
    }
}
