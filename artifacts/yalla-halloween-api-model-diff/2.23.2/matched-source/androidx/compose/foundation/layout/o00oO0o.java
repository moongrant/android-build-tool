package androidx.compose.foundation.layout;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00oO0o implements androidx.media3.common.OooO0OO.OooO00o, o0O0Oo.OooO0O0.OooO00o, SuccessContinuation, o00000O0.OooO00o {
    public /* synthetic */ o00oO0o(AnalyticsListener.OooO00o oooO00o, float f) {
    }

    public static boolean OooO00o(WindowInsets.Companion companion, String str, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(companion, str);
        composer.startReplaceableGroup(i);
        return ComposerKt.isTraceInProgress();
    }

    @Override // o0O0Oo.OooO0O0.OooO00o
    public Object OooO0O0(JsonReader jsonReader) throws IOException {
        p299o0O0o00.oo000o oo000oVar = p288o0O0Oo.OooO0O0.f41451OooO00o;
        jsonReader.beginObject();
        String strNextString = null;
        Integer numValueOf = null;
        p291o0O0Oo0o.o00O0O o00o0o2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(p288o0O0Oo.OooO0O0.OooO00o(jsonReader));
                    }
                    jsonReader.endArray();
                    o00o0o2 = new p291o0O0Oo0o.o00O0O(arrayList);
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    break;
                    break;
                case "importance":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strOooO00o = strNextString == null ? " name" : "";
        if (numValueOf == null) {
            strOooO00o = strOooO00o.concat(" importance");
        }
        if (o00o0o2 == null) {
            strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " frames");
        }
        if (strOooO00o.isEmpty()) {
            return new com.google.firebase.crashlytics.internal.model.o00Oo0(strNextString, numValueOf.intValue(), o00o0o2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        int i = bundle.getInt(androidx.media3.session.OooO0OO.f9247OooO, 0);
        int i2 = bundle.getInt(androidx.media3.session.OooO0OO.f9252OooOOO0, 0);
        String string = bundle.getString(androidx.media3.session.OooO0OO.f9248OooOO0);
        string.getClass();
        String str = androidx.media3.session.OooO0OO.f9249OooOO0O;
        p080o000OoO.o00Oo0.OooO00o(bundle.containsKey(str));
        int i3 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(androidx.media3.session.OooO0OO.f9250OooOO0o);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new androidx.media3.session.OooO0OO(i, i2, string, i3, bundle2);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).Oooo();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
