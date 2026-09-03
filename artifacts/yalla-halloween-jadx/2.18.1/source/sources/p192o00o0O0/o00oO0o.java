package p192o00o0O0;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import com.app.selectPicture.activity.AllImagesActivity;
import com.app.selectPicture.model.ImageModel;
import com.yalla.yalla.ui.activity.room.KickRecordActivity;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p186o00o00Oo.o0ooOOo;
import p200o00o0Oo0.o00000OO;
import p202o00o0Ooo.o0O0ooO;
import p649o0ooOOoo.kg;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oO0o implements o00000OO, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f33096OooO0Oo;

    public /* synthetic */ o00oO0o(AppCompatActivity appCompatActivity) {
        this.f33096OooO0Oo = appCompatActivity;
    }

    @Override // p200o00o0Oo0.o00000OO
    public final void OooO00o(Object obj) {
        AllImagesActivity allImagesActivity = (AllImagesActivity) this.f33096OooO0Oo;
        o0O0ooO o0o0ooo = (o0O0ooO) obj;
        allImagesActivity.f12254Oooo0oo = o0o0ooo;
        if (o0o0ooo == null) {
            allImagesActivity.f12254Oooo0oo = new o0O0ooO();
        }
        allImagesActivity.f12261OoooOOo.OooO0O0(allImagesActivity.f12254Oooo0oo.OooO0O0());
        if (allImagesActivity.f12264OoooOoo == null) {
            allImagesActivity.f12264OoooOoo = new ArrayList<>();
        }
        allImagesActivity.f12264OoooOoo.clear();
        HashMap map = new HashMap(allImagesActivity.f12254Oooo0oo.OooO00o().size());
        for (ImageModel imageModel : allImagesActivity.f12254Oooo0oo.OooO00o()) {
            map.put(imageModel.f12326o000oOoO, imageModel);
        }
        for (Uri uri : allImagesActivity.f12273Ooooooo.OooO00o()) {
            if (map.containsKey(uri)) {
                allImagesActivity.f12264OoooOoo.add((ImageModel) map.get(uri));
            } else {
                ImageModel imageModel2 = new ImageModel();
                imageModel2.f12326o000oOoO = uri;
                allImagesActivity.f12264OoooOoo.add(imageModel2);
            }
        }
        map.clear();
        allImagesActivity.OooOOo0(0);
        allImagesActivity.OooOOo();
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        KickRecordActivity this$0 = (KickRecordActivity) this.f33096OooO0Oo;
        int i = KickRecordActivity.f22842Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        kg kgVar = this$0.f22849Oooooo0;
        if (kgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            kgVar = null;
        }
        if (StringsKt.isBlank(kgVar.f49873OooO0O0.getSearchText())) {
            this$0.OooOooO(true);
        } else {
            this$0.OooOooo(true);
        }
    }
}
