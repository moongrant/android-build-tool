package androidx.media3.session;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements androidx.media3.common.OooO0OO.OooO00o, o0O0Oo.OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9233OooO0Oo;

    public /* synthetic */ OooO00o(int i) {
        this.f9233OooO0Oo = i;
    }

    @Override // o0O0Oo.OooO0O0.OooO00o
    public final Object OooO0O0(JsonReader jsonReader) throws IOException {
        p299o0O0o00.oo000o oo000oVar = p288o0O0Oo.OooO0O0.f41451OooO00o;
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null libraryName");
                    }
                    break;
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null arch");
                    }
                    break;
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildId");
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strOooO00o = strNextString == null ? " arch" : "";
        if (strNextString2 == null) {
            strOooO00o = strOooO00o.concat(" libraryName");
        }
        if (strNextString3 == null) {
            strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " buildId");
        }
        if (strOooO00o.isEmpty()) {
            return new com.google.firebase.crashlytics.internal.model.OooO0o(strNextString, strNextString2, strNextString3);
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        int i;
        switch (this.f9233OooO0Oo) {
            case 0:
                Bundle bundle2 = bundle.getBundle(OooO0O0.f9234OooOO0);
                SessionCommand sessionCommand = bundle2 == null ? null : (SessionCommand) SessionCommand.f9267OooOO0.OooO0OO(bundle2);
                int i2 = bundle.getInt(OooO0O0.f9235OooOO0O, -1);
                int i3 = bundle.getInt(OooO0O0.f9236OooOO0o, 0);
                CharSequence charSequence = bundle.getCharSequence(OooO0O0.f9238OooOOO0, "");
                Bundle bundle3 = bundle.getBundle(OooO0O0.f9237OooOOO);
                boolean z = bundle.getBoolean(OooO0O0.f9239OooOOOO, false);
                Bundle bundle4 = Bundle.EMPTY;
                SessionCommand sessionCommand2 = sessionCommand != null ? sessionCommand : null;
                if (i2 != -1) {
                    p080o000OoO.o00Oo0.OooO0O0(sessionCommand2 == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
                    i = i2;
                } else {
                    i = -1;
                }
                if (bundle3 == null) {
                    bundle3 = bundle4;
                }
                return new OooO0O0(sessionCommand2, i, i3, charSequence, new Bundle(bundle3), z);
            default:
                return new o00O00O.OooO0O0(bundle.getBoolean(o00O00O.OooO0O0.f9428OooO0o, false), bundle.getBoolean(o00O00O.OooO0O0.f9429OooO0oO, false));
        }
    }
}
