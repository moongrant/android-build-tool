package p022Oooo00O;

import android.view.View;
import androidx.activity.result.OooO00o;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.Player;
import androidx.media3.session.o00O00O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.yalla.album.CropImageActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.activity.room.o0O0OOO0;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p080o000OoO.o00000O0;
import p138o00OOOo.OooO0OO;
import p335o0OO0o0O.o0OO00O;
import p361o0OOOooo.o000O0Oo;
import p473o0OoooOo.o0OOO0;
import p562o0oOo000.o000000;
import p650o0ooo.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0o000 implements OooO00o, o00000O0.OooO00o, OooO0OO, BaseQuickAdapter.OooO0o, o0OOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f784OooO0Oo;

    public /* synthetic */ o0O0o000(Object obj) {
        this.f784OooO0Oo = obj;
    }

    @Override // p138o00OOOo.OooO0OO
    public void OooO00o(View view, Integer num) {
        CropImageActivity this$0 = (CropImageActivity) this.f784OooO0Oo;
        int i = CropImageActivity.f22056OooOOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 1010) {
            this$0.onBackPressed();
            return;
        }
        if (num != null && num.intValue() == 1011) {
            MediaEdit mediaEdit = this$0.f22061OooO0oo;
            if (mediaEdit == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEdit");
                mediaEdit = null;
            }
            mediaEdit.startCrop(new o000O0Oo(this$0));
        }
    }

    @Override // p473o0OoooOo.o0OOO0
    public void OooO0O0() {
        ((UserInfoLeftFragment) this.f784OooO0Oo).lambda$showAddPowerSeeroomFriendAndFans$8();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VoteGameCreateActivity this$0 = (VoteGameCreateActivity) this.f784OooO0Oo;
        int i2 = VoteGameCreateActivity.f26301OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.room.RoomUserInfoModel");
        if (((RoomUserInfoModel) obj).getUserId().getValue().longValue() != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this$0.f26303OooOo0);
        j jVar = new j(arrayList, new o0O0OOO0(this$0));
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        jVar.show(supportFragmentManager, o0000.OooO0OO(o000000.Online_Users));
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((Player.OooO0OO) obj).onDeviceInfoChanged(((o00O00O) this.f784OooO0Oo).f9384OooOo00);
    }

    @Override // androidx.activity.result.OooO00o
    public void onActivityResult(Object obj) {
        o0OO00O this$0 = (o0OO00O) this.f784OooO0Oo;
        int i = o0OO00O.f42474OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0Oo();
    }
}
