package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Base64;
import android.util.JsonReader;
import androidx.media3.common.Player;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0o implements androidx.media3.common.OooO0OO.OooO00o, o0O0Oo.OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9263OooO0Oo;

    public /* synthetic */ OooO0o(int i) {
        this.f9263OooO0Oo = i;
    }

    @Override // o0O0Oo.OooO0O0.OooO00o
    public final Object OooO0O0(JsonReader jsonReader) throws IOException {
        p300o0O0o00.oo000o oo000oVar = p289o0O0Oo.OooO0O0.f41445OooO00o;
        com.google.firebase.crashlytics.internal.model.o000oOoO.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.o000oOoO.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    oooO00o.f19640OooO0OO = strNextString;
                    break;
                    break;
                case "size":
                    oooO00o.f19639OooO0O0 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "uuid":
                    oooO00o.f19641OooO0Oo = new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f19391OooO00o);
                    break;
                case "baseAddress":
                    oooO00o.f19638OooO00o = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final androidx.media3.common.OooO0OO OooO0Oo(Bundle bundle) {
        o0O00 o0o00OooO00o;
        switch (this.f9263OooO0Oo) {
            case 0:
                int i = bundle.getInt(OooO.f9218OooOOO, 0);
                int i2 = bundle.getInt(OooO.f9227OooOo0o, 0);
                IBinder iBinderOooO00o = p063o0000oO.Oooo0.OooO00o(bundle, OooO.f9219OooOOOO);
                iBinderOooO00o.getClass();
                IBinder iBinder = iBinderOooO00o;
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(OooO.f9220OooOOOo);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(OooO.f9222OooOOo0);
                if (parcelableArrayList != null) {
                    o0o00OooO00o = p080o000OoO.oo000o.OooO00o(OooO0O0.f9245OooOOOo, parcelableArrayList);
                } else {
                    ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18686OooO0o0;
                    o0o00OooO00o = o0O00.f19065OooO0oo;
                }
                o0O00 o0o01 = o0o00OooO00o;
                Bundle bundle2 = bundle.getBundle(OooO.f9221OooOOo);
                oo00o oo00oVar = bundle2 == null ? oo00o.f9516OooO0o0 : (oo00o) oo00o.f9517OooO0oO.OooO0Oo(bundle2);
                Bundle bundle3 = bundle.getBundle(OooO.f9225OooOo00);
                Player.OooO00o oooO00o = bundle3 == null ? Player.OooO00o.f6706OooO0o0 : (Player.OooO00o) Player.OooO00o.f6707OooO0oO.OooO0Oo(bundle3);
                Bundle bundle4 = bundle.getBundle(OooO.f9223OooOOoo);
                Player.OooO00o oooO00o2 = bundle4 == null ? Player.OooO00o.f6706OooO0o0 : (Player.OooO00o) Player.OooO00o.f6707OooO0oO.OooO0Oo(bundle4);
                Bundle bundle5 = bundle.getBundle(OooO.f9224OooOo0);
                Bundle bundle6 = bundle.getBundle(OooO.f9226OooOo0O);
                o00O00O o00o00o2 = bundle6 == null ? o00O00O.f9340Oooo0 : (o00O00O) o00O00O.f9369o00Ooo.OooO0Oo(bundle6);
                int i3 = OooOOO.OooO00o.f9264OooO0Oo;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
                return new OooO(i, i2, (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooOOO)) ? new OooOOO.OooO00o.C0159OooO00o(iBinder) : (OooOOO) iInterfaceQueryLocalInterface, pendingIntent, o0o01, oo00oVar, oooO00o2, oooO00o, bundle5 == null ? Bundle.EMPTY : bundle5, o00o00o2);
            default:
                int i4 = bundle.getInt(SessionCommand.f9269OooO0oO, 0);
                if (i4 != 0) {
                    return new SessionCommand(i4);
                }
                String string = bundle.getString(SessionCommand.f9270OooO0oo);
                string.getClass();
                Bundle bundle7 = bundle.getBundle(SessionCommand.f9268OooO);
                if (bundle7 == null) {
                    bundle7 = Bundle.EMPTY;
                }
                return new SessionCommand(string, bundle7);
        }
    }
}
