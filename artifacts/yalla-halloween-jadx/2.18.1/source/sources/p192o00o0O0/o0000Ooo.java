package p192o00o0O0;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.app.selectPicture.activity.ShowImagesSelectActivity;
import com.app.selectPicture.model.ImageModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p200o00o0Oo0.o00000OO;
import p202o00o0Ooo.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000Ooo implements o00000OO, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f33091OooO0Oo;

    public /* synthetic */ o0000Ooo(AppCompatActivity appCompatActivity) {
        this.f33091OooO0Oo = appCompatActivity;
    }

    @Override // p200o00o0Oo0.o00000OO
    public final void OooO00o(Object obj) {
        ShowImagesSelectActivity showImagesSelectActivity = (ShowImagesSelectActivity) this.f33091OooO0Oo;
        int i = ShowImagesSelectActivity.f12282Ooooo0o;
        ImageModel imageModel = (ImageModel) showImagesSelectActivity.getIntent().getParcelableExtra("data");
        showImagesSelectActivity.f12285Oooo0oo.clear();
        showImagesSelectActivity.f12285Oooo0oo.addAll(showImagesSelectActivity.f12290OoooOO0.OooO0OO(showImagesSelectActivity.f12297o000oOoO, ((o0O0ooO) obj).OooO00o()));
        ArrayList<ImageModel> arrayList = showImagesSelectActivity.f12285Oooo0oo;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (imageModel.f12318Oooo0o == arrayList.get(i3).f12318Oooo0o) {
                i2 = i3;
            }
        }
        while (i2 > 0 && !arrayList.isEmpty()) {
            ImageModel imageModel2 = arrayList.get(0);
            if (imageModel.f12318Oooo0o == imageModel2.f12318Oooo0o) {
                break;
            } else {
                arrayList.remove(imageModel2);
            }
        }
        if (showImagesSelectActivity.f12285Oooo0oo.isEmpty()) {
            return;
        }
        if (showImagesSelectActivity.f12287OoooO0) {
            showImagesSelectActivity.f12288OoooO00--;
        }
        showImagesSelectActivity.OooOOo();
        showImagesSelectActivity.f12293OoooOo0.f33171OooO0O0 = showImagesSelectActivity.f12285Oooo0oo;
        showImagesSelectActivity.f12292OoooOOo.scrollToPosition(showImagesSelectActivity.f12288OoooO00);
        showImagesSelectActivity.OooOOoo(showImagesSelectActivity.f12288OoooO00);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicManagerActivity this$0 = (TopicManagerActivity) this.f33091OooO0Oo;
        TopicManagerActivity.OooO00o oooO00o = TopicManagerActivity.f22638Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
        Objects.requireNonNull(this$0);
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o2, this$0, String.valueOf(this$0.OooOoo().getData().get(i).getUserId()), false, 12);
    }
}
