package o00000OO;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface OooO0OO extends IInterface {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f33474OooO0OO = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace(Typography.dollar, '.');

    public static abstract class OooO00o extends Binder implements OooO0OO {
        public OooO00o() {
            attachInterface(this, OooO0OO.f33474OooO0OO);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            OooO0O0 oooO00o;
            String str = OooO0OO.f33474OooO0OO;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                oooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(OooO0O0.f33473OooO0O0);
                oooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0O0)) ? new o00000OO.OooO00o(strongBinder) : (OooO0O0) iInterfaceQueryLocalInterface;
            }
            UnusedAppRestrictionsBackportService.OooO00o oooO00o2 = (UnusedAppRestrictionsBackportService.OooO00o) this;
            if (oooO00o != null) {
                UnusedAppRestrictionsBackportService.this.OooO00o();
            }
            return true;
        }
    }
}
