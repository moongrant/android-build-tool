package p544o0o0OoOO;

import android.media.MediaScannerConnection;
import android.view.View;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooO0o;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p146o00Oo000.OooO0O0;
import p162o00OoOOo.o0O0o;
import p170o00Ooo0O.OooO;
import p176o00OoooO.oOo00OO0;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class q6 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f44299Oooo;

    public q6(SearchMusicActivity searchMusicActivity) {
        this.f44299Oooo = searchMusicActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        o0O0O00.OooO0OO(this.f44299Oooo, oo0o0Oo.f48608OooO0OO, o0O0o.f32505Oooo0o, new Function1() { // from class: o0o0OoOO.p6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                File[] fileArrListFiles;
                q6 q6Var = this.f44293Oooo0o;
                Objects.requireNonNull(q6Var);
                if (((Boolean) obj).booleanValue()) {
                    SearchMusicActivity searchMusicActivity = q6Var.f44299Oooo;
                    int i = SearchMusicActivity.f23016Oooooo0;
                    Objects.requireNonNull(searchMusicActivity);
                    oOo00OO0 ooo00oo0 = new oOo00OO0(searchMusicActivity);
                    if (searchMusicActivity.f23024OooooOo == null) {
                        searchMusicActivity.f23024OooooOo = new v6(searchMusicActivity, ooo00oo0);
                    }
                    ooo00oo0.setOnDismissListener(new w6(searchMusicActivity));
                    OooO0O0.OooOOO0(ooo00oo0, searchMusicActivity);
                    OooO.OooO00o oooO00o = searchMusicActivity.f23024OooooOo;
                    String[] strArr = OooO.f32675OooO00o;
                    ArrayList arrayList = new ArrayList();
                    for (String str : OooO.f32676OooO0O0) {
                        if (OooO0o.OooO00o(str) && (fileArrListFiles = new File(str).listFiles()) != null) {
                            for (File file : fileArrListFiles) {
                                if (file.toString().endsWith(".mp3")) {
                                    arrayList.add(file.toString());
                                }
                            }
                        }
                    }
                    if (!OooO0OO.OooO00o(arrayList)) {
                        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                        MediaScannerConnection.scanFile(searchMusicActivity, strArr2, null, new p170o00Ooo0O.OooO0o(strArr2, oooO00o, searchMusicActivity));
                    } else if (oooO00o != null) {
                        v6 v6Var = (v6) oooO00o;
                        v6Var.f44331OooO0O0.OooOoo0(OooO.OooO00o(searchMusicActivity));
                        v6Var.f44330OooO00o.dismiss();
                    }
                }
                return Unit.INSTANCE;
            }
        });
    }
}
