package p288o0O0Oo0O;

import android.util.JsonReader;
import android.view.View;
import androidx.camera.core.impl.OooOOOO;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.firebase.crashlytics.internal.model.o00Oo0;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements OooOOO.OooO00o, BaseQuickAdapter.OooO0O0 {
    @Override // o0O0Oo0O.OooOOO.OooO00o
    public final Object OooO0O0(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        Integer numValueOf = null;
        p287o0O0Oo0.OooOO0 oooOO0OooO0Oo = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    oooOO0OooO0Oo = OooOOO.OooO0Oo(jsonReader, new OooOO0O());
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
        if (oooOO0OooO0Oo == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " frames");
        }
        if (strOooO00o.isEmpty()) {
            return new o00Oo0(strNextString, numValueOf.intValue(), oooOO0OooO0Oo);
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreCountryRoomListFragment.initView$lambda$2(baseQuickAdapter, view, i);
    }
}
