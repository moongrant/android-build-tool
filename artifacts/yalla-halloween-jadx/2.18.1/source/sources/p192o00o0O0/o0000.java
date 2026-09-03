package p192o00o0O0;

import android.view.View;
import com.app.selectPicture.activity.ShowImagesSelectActivity;
import com.app.selectPicture.model.ImageModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.UserNewPostFragment;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOO.o000oOoO;
import p043OooooO0.o00O0000;
import p186o00o00Oo.o0ooOOo;
import p193o00o0O00.OooOO0;
import p193o00o0O00.OooOo;
import p200o00o0Oo0.o0000Ooo;
import p202o00o0Ooo.o00oOoo;
import p286o0O0O0oO.o0OO00O;
import p288o0O0OOo.o00Oo0;
import p400o0Oo0O.OooOOOO;
import p497o0o00Oo.OooOOO0;
import p538o0o0Oo0.o0oo0000;
import p579o0oOoOOo.oOOO00Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements o0000Ooo, o00Oo0.OooO00o, BaseQuickAdapter.OooOOO0, BaseQuickAdapter.OooOOOO, o0ooOOo, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33080OooO0Oo;

    public /* synthetic */ o0000(Object obj) {
        this.f33080OooO0Oo = obj;
    }

    @Override // o0O0OOo.o00Oo0.OooO00o
    public final Object OooO0O0() {
        o000oOoO o000oooo2 = (o000oOoO) this.f33080OooO0Oo;
        Iterator<o0OO00O> it = o000oooo2.f35603OooO0O0.Oooo0o0().iterator();
        while (it.hasNext()) {
            o000oooo2.f35604OooO0OO.OooO00o(it.next(), 1);
        }
        return null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        UserNewPostFragment.m431initView$lambda5((UserNewPostFragment) this.f33080OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        oOOO00Oo this$0 = (oOOO00Oo) this.f33080OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GiftPropModel item = this$0.f46125OoooOO0.getItem(i);
        if (item != null) {
            int giftId = item.getGiftId();
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            if (giftId == OooOOO0.OooO0oO().OooOOO()) {
                return;
            }
            OooOOO0.OooO0oO().OooOo0o(item.getGiftId());
            OooOOO0.OooO0oO().OooOo0(item.getPrice());
            this$0.f46125OoooOO0.notifyDataSetChanged();
            this$0.OooOO0O().f49580OooO0O0.setText(String.valueOf(OooOOO0.OooO0oO().OooOO0o() * ((long) OooOOO0.OooO0oO().OooOOO0())));
        }
    }

    @Override // p200o00o0Oo0.o0000Ooo
    public final void OooO0o0(Object obj, Object obj2) {
        ShowImagesSelectActivity showImagesSelectActivity = (ShowImagesSelectActivity) this.f33080OooO0Oo;
        int i = ShowImagesSelectActivity.f12282Ooooo0o;
        Objects.requireNonNull(showImagesSelectActivity);
        int iIntValue = ((Integer) obj2).intValue();
        if (iIntValue == 1010) {
            showImagesSelectActivity.OooOOOo();
            return;
        }
        if (iIntValue != 1011) {
            return;
        }
        if (showImagesSelectActivity.f12293OoooOo0 == null) {
            showImagesSelectActivity.OooOOOo();
            return;
        }
        o00oOoo o00oooo2 = showImagesSelectActivity.f12295OoooOoo;
        o00oooo2.OooO0OO();
        if (o00oooo2.f33233OooO0O0.isEmpty()) {
            int size = showImagesSelectActivity.f12293OoooOo0.f33171OooO0O0.size();
            int i2 = showImagesSelectActivity.f12291OoooOOO;
            if (size > i2) {
                ImageModel imageModel = showImagesSelectActivity.f12293OoooOo0.f33171OooO0O0.get(i2);
                if (imageModel.OooO0O0() && imageModel.OooO0OO()) {
                    OooOo.OooO0O0().OooO00o(showImagesSelectActivity.getString(OooOOOO.select_picture_string_GIF_too_large));
                    return;
                } else if (!OooOO0.OooO0O0(showImagesSelectActivity, imageModel.f12326o000oOoO)) {
                    OooOo.OooO0O0().OooO00o(showImagesSelectActivity.getString(OooOOOO.select_picture_string_is_not_image_file_format));
                    return;
                } else {
                    o00oOoo o00oooo3 = showImagesSelectActivity.f12295OoooOoo;
                    o00oooo3.OooO0OO();
                    o00oooo3.f33233OooO0O0.add(imageModel);
                }
            }
        }
        o00oOoo o00oooo4 = showImagesSelectActivity.f12295OoooOoo;
        o00oooo4.OooO0OO();
        showImagesSelectActivity.OooOOo0(showImagesSelectActivity, -1, o00oooo4.f33233OooO0O0);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        BadgeFragment.m308initView$lambda0((BadgeFragment) this.f33080OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicManagerActivity this$0 = (TopicManagerActivity) this.f33080OooO0Oo;
        TopicManagerActivity.OooO00o oooO00o = TopicManagerActivity.f22638Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getId() == R.id.tvUserRevoke) {
            String strValueOf = String.valueOf(this$0.OooOoo().getData().get(i).getUserId());
            String userName = this$0.OooOoo().getData().get(i).getUserName();
            if (this$0.isDestroyed() || this$0.isFinishing()) {
                return;
            }
            Intrinsics.checkNotNull(this$0, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
            this$0.showDialog((String) null, o00O0000.OooO0O0(930893164, true, new o0oo0000(userName, this$0, strValueOf, i)));
        }
    }
}
