package p252o00ooO0o;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o000O0Oo extends zzy {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40923OooO0Oo;

    public o000O0Oo(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.f40923OooO0Oo = Arrays.hashCode(bArr);
    }

    public static byte[] OooOOoo(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] OooOo00();

    public final boolean equals(@Nullable Object obj) {
        IObjectWrapper iObjectWrapperZzd;
        if (obj != null && (obj instanceof zzz)) {
            try {
                zzz zzzVar = (zzz) obj;
                if (zzzVar.zzc() == this.f40923OooO0Oo && (iObjectWrapperZzd = zzzVar.zzd()) != null) {
                    return Arrays.equals(OooOo00(), (byte[]) ObjectWrapper.unwrap(iObjectWrapperZzd));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40923OooO0Oo;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() {
        return this.f40923OooO0Oo;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(OooOo00());
    }
}
