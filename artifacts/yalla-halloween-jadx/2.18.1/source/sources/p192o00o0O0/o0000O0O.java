package p192o00o0O0;

import OooO00o.OooO00o;
import android.content.Context;
import android.widget.TextView;
import com.app.selectPicture.activity.ShowImagesSelectActivity;
import com.app.selectPicture.model.ImageModel;
import p194o00o0O0O.o0000OO0;
import p400o0Oo0O.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends o0000OO0<ImageModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImagesSelectActivity f33090OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(ShowImagesSelectActivity showImagesSelectActivity, Context context, int i) {
        super(context, i);
        this.f33090OooO0Oo = showImagesSelectActivity;
    }

    public final void OooO00o(TextView textView, ImageModel imageModel) {
        if (this.f33090OooO0Oo.f12283Oooo > 1) {
            textView.setVisibility(0);
        }
        if (!this.f33090OooO0Oo.f12295OoooOoo.OooO00o(Long.valueOf(imageModel.f12318Oooo0o))) {
            textView.setText("");
            textView.setBackgroundResource(OooOO0O.icon_select_gray);
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
        ShowImagesSelectActivity showImagesSelectActivity = this.f33090OooO0Oo;
        sbOooO0o0.append(showImagesSelectActivity.f12295OoooOoo.OooO00o(Long.valueOf(imageModel.f12318Oooo0o)) ? 1 + showImagesSelectActivity.f12295OoooOoo.OooO0O0(imageModel) : 1);
        textView.setText(sbOooO0o0.toString());
        textView.setBackgroundResource(OooOO0O.icon_select_green);
    }
}
