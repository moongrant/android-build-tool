package p330o0O0ooo0;

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

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000O0O0 extends zzy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f37055OooO00o;

    public o000O0O0(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.f37055OooO00o = Arrays.hashCode(bArr);
    }

    public static byte[] OooOOo0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] OooOOo();

    public final boolean equals(@Nullable Object obj) {
        IObjectWrapper iObjectWrapperZzd;
        if (obj != null && (obj instanceof zzz)) {
            try {
                zzz zzzVar = (zzz) obj;
                if (zzzVar.zzc() == this.f37055OooO00o && (iObjectWrapperZzd = zzzVar.zzd()) != null) {
                    return Arrays.equals(OooOOo(), (byte[]) ObjectWrapper.unwrap(iObjectWrapperZzd));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37055OooO00o;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() {
        return this.f37055OooO00o;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(OooOOo());
    }
}
