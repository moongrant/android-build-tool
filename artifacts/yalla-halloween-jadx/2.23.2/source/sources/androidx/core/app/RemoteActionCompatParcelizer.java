package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import p113o00O00Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        OooOo oooOoOooOOO = remoteActionCompat.f5275OooO00o;
        if (versionedParcel.OooO0oo(1)) {
            oooOoOooOOO = versionedParcel.OooOOO();
        }
        remoteActionCompat.f5275OooO00o = (IconCompat) oooOoOooOOO;
        CharSequence charSequenceOooO0oO = remoteActionCompat.f5276OooO0O0;
        if (versionedParcel.OooO0oo(2)) {
            charSequenceOooO0oO = versionedParcel.OooO0oO();
        }
        remoteActionCompat.f5276OooO0O0 = charSequenceOooO0oO;
        CharSequence charSequenceOooO0oO2 = remoteActionCompat.f5277OooO0OO;
        if (versionedParcel.OooO0oo(3)) {
            charSequenceOooO0oO2 = versionedParcel.OooO0oO();
        }
        remoteActionCompat.f5277OooO0OO = charSequenceOooO0oO2;
        remoteActionCompat.f5278OooO0Oo = (PendingIntent) versionedParcel.OooOO0o(remoteActionCompat.f5278OooO0Oo, 4);
        boolean zOooO0o0 = remoteActionCompat.f5280OooO0o0;
        if (versionedParcel.OooO0oo(5)) {
            zOooO0o0 = versionedParcel.OooO0o0();
        }
        remoteActionCompat.f5280OooO0o0 = zOooO0o0;
        boolean zOooO0o1 = remoteActionCompat.f5279OooO0o;
        if (versionedParcel.OooO0oo(6)) {
            zOooO0o1 = versionedParcel.OooO0o0();
        }
        remoteActionCompat.f5279OooO0o = zOooO0o1;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.f5275OooO00o;
        versionedParcel.OooOOOO(1);
        versionedParcel.OooOo0o(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5276OooO0O0;
        versionedParcel.OooOOOO(2);
        versionedParcel.OooOOo(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f5277OooO0OO;
        versionedParcel.OooOOOO(3);
        versionedParcel.OooOOo(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f5278OooO0Oo;
        versionedParcel.OooOOOO(4);
        versionedParcel.OooOo0(pendingIntent);
        boolean z = remoteActionCompat.f5280OooO0o0;
        versionedParcel.OooOOOO(5);
        versionedParcel.OooOOOo(z);
        boolean z2 = remoteActionCompat.f5279OooO0o;
        versionedParcel.OooOOOO(6);
        versionedParcel.OooOOOo(z2);
    }
}
