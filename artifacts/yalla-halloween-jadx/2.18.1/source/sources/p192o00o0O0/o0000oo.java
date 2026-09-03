package p192o00o0O0;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.selectPicture.activity.ShowImagesSelectActivity;
import com.app.selectPicture.model.ImageModel;
import java.util.Objects;
import p054o00000oo.o000OO00;
import p193o00o0O00.OooOO0;
import p193o00o0O00.OooOo;
import p199o00o0Oo.o00O00O;
import p200o00o0Oo0.o0000O00;
import p202o00o0Ooo.o00oOoo;
import p400o0Oo0O.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends o00O00O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.oo0o0Oo f33092Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f33093OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ImageModel f33094OoooO00;

    public o0000oo(o0000O0O o0000o0o2, RecyclerView.oo0o0Oo oo0o0oo, ImageModel imageModel) {
        this.f33093OoooO0 = o0000o0o2;
        this.f33092Oooo = oo0o0oo;
        this.f33094OoooO00 = imageModel;
    }

    @Override // p199o00o0Oo.o00O00O
    public final void OooO00o(View view) {
        o0000O0O o0000o0o2 = this.f33093OoooO0;
        if (o0000o0o2.f33090OooO0Oo.f12283Oooo > 1) {
            int layoutPosition = this.f33092Oooo.getLayoutPosition();
            ImageModel imageModel = this.f33094OoooO00;
            if (o0000o0o2.f33090OooO0Oo.f12295OoooOoo.OooO00o(Long.valueOf(imageModel.f12318Oooo0o))) {
                o0000o0o2.f33090OooO0Oo.f12295OoooOoo.OooO0Oo(imageModel);
                o00oOoo o00oooo2 = o0000o0o2.f33090OooO0Oo.f12295OoooOoo;
                o00oooo2.OooO0OO();
                for (ImageModel imageModel2 : o00oooo2.f33233OooO0O0) {
                    if (imageModel2 != null) {
                        o0000o0o2.notifyItemChanged(imageModel2.f12325OoooOO0);
                    }
                }
            } else if (o0000o0o2.f33090OooO0Oo.f12295OoooOoo.OooO0o() >= o0000o0o2.f33090OooO0Oo.f12283Oooo) {
                o0000O00 o0000o00OooO0O0 = OooOo.OooO0O0();
                ShowImagesSelectActivity showImagesSelectActivity = o0000o0o2.f33090OooO0Oo;
                Objects.requireNonNull(showImagesSelectActivity);
                o0000o00OooO0O0.OooO00o(o000OO00.OooO00o(showImagesSelectActivity.getString(OooOOOO.select_picture_string_Select_a_maximum_of_xxx_photos), o0000o0o2.f33090OooO0Oo.f12283Oooo + ""));
            } else if (imageModel.OooO0O0() && imageModel.OooO0OO()) {
                o0000O00 o0000o00OooO0O1 = OooOo.OooO0O0();
                ShowImagesSelectActivity showImagesSelectActivity2 = o0000o0o2.f33090OooO0Oo;
                Objects.requireNonNull(showImagesSelectActivity2);
                o0000o00OooO0O1.OooO00o(showImagesSelectActivity2.getString(OooOOOO.select_picture_string_GIF_too_large));
            } else {
                ShowImagesSelectActivity showImagesSelectActivity3 = o0000o0o2.f33090OooO0Oo;
                Objects.requireNonNull(showImagesSelectActivity3);
                if (OooOO0.OooO0O0(showImagesSelectActivity3, imageModel.f12326o000oOoO)) {
                    imageModel.f12325OoooOO0 = layoutPosition;
                    o00oOoo o00oooo3 = o0000o0o2.f33090OooO0Oo.f12295OoooOoo;
                    o00oooo3.OooO0OO();
                    o00oooo3.f33232OooO00o.put(Long.valueOf(imageModel.f12318Oooo0o), imageModel);
                    o00oooo3.f33233OooO0O0.add(imageModel);
                } else {
                    o0000O00 o0000o00OooO0O2 = OooOo.OooO0O0();
                    ShowImagesSelectActivity showImagesSelectActivity4 = o0000o0o2.f33090OooO0Oo;
                    Objects.requireNonNull(showImagesSelectActivity4);
                    o0000o00OooO0O2.OooO00o(showImagesSelectActivity4.getString(OooOOOO.select_picture_string_is_not_image_file_format));
                }
            }
            this.f33093OoooO0.OooO00o((TextView) view, this.f33094OoooO00);
            this.f33093OoooO0.f33090OooO0Oo.OooOOo();
        }
    }
}
