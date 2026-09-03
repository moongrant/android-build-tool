package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object objOooOOOO = remoteActionCompat.f7808OooO00o;
        if (versionedParcel.OooO(1)) {
            objOooOOOO = versionedParcel.OooOOOO();
        }
        remoteActionCompat.f7808OooO00o = (IconCompat) objOooOOOO;
        CharSequence charSequenceOooO0oo = remoteActionCompat.f7809OooO0O0;
        if (versionedParcel.OooO(2)) {
            charSequenceOooO0oo = versionedParcel.OooO0oo();
        }
        remoteActionCompat.f7809OooO0O0 = charSequenceOooO0oo;
        CharSequence charSequenceOooO0oo2 = remoteActionCompat.f7810OooO0OO;
        if (versionedParcel.OooO(3)) {
            charSequenceOooO0oo2 = versionedParcel.OooO0oo();
        }
        remoteActionCompat.f7810OooO0OO = charSequenceOooO0oo2;
        remoteActionCompat.f7811OooO0Oo = (PendingIntent) versionedParcel.OooOOO0(remoteActionCompat.f7811OooO0Oo, 4);
        boolean zOooO0o = remoteActionCompat.f7813OooO0o0;
        if (versionedParcel.OooO(5)) {
            zOooO0o = versionedParcel.OooO0o();
        }
        remoteActionCompat.f7813OooO0o0 = zOooO0o;
        boolean zOooO0o2 = remoteActionCompat.f7812OooO0o;
        if (versionedParcel.OooO(6)) {
            zOooO0o2 = versionedParcel.OooO0o();
        }
        remoteActionCompat.f7812OooO0o = zOooO0o2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        IconCompat iconCompat = remoteActionCompat.f7808OooO00o;
        versionedParcel.OooOOOo(1);
        versionedParcel.OooOoO0(iconCompat);
        CharSequence charSequence = remoteActionCompat.f7809OooO0O0;
        versionedParcel.OooOOOo(2);
        versionedParcel.OooOOoo(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f7810OooO0OO;
        versionedParcel.OooOOOo(3);
        versionedParcel.OooOOoo(charSequence2);
        versionedParcel.OooOo0o(remoteActionCompat.f7811OooO0Oo, 4);
        boolean z = remoteActionCompat.f7813OooO0o0;
        versionedParcel.OooOOOo(5);
        versionedParcel.OooOOo0(z);
        boolean z2 = remoteActionCompat.f7812OooO0o;
        versionedParcel.OooOOOo(6);
        versionedParcel.OooOOo0(z2);
    }
}
