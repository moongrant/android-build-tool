package com.app.selectPicture.adapter.showImageLoad;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.app.selectPicture.view.AbsViewLinearLayout;
import com.app.selectPicture.view.photoview.PhotoView;
import p199o00o0Oo.o00O00O;
import p200o00o0Oo0.o0000Ooo;
import p400o0Oo0O.OooOO0O;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public class ShowImageLoadHolderView extends AbsViewLinearLayout {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public String f12298OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public RelativeLayout f12299OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Context f12300OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public PhotoView f12301OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooO00o f12302OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f12303OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o0000Ooo<String, Integer> f12304o000oOoO;

    public class OooO00o extends o00O00O {
        public OooO00o() {
        }

        @Override // p199o00o0Oo.o00O00O
        public final void OooO00o(View view) {
            ShowImageLoadHolderView showImageLoadHolderView;
            o0000Ooo<String, Integer> o0000ooo;
            if (view.getId() != OooOOO0.layout_show_image_load_pic_iv || (o0000ooo = (showImageLoadHolderView = ShowImageLoadHolderView.this).f12304o000oOoO) == null) {
                return;
            }
            o0000ooo.OooO0o0(showImageLoadHolderView.f12298OoooO, Integer.valueOf(showImageLoadHolderView.f12303OoooOOO));
        }
    }

    public ShowImageLoadHolderView(Context context) {
        super(context);
        this.f12303OoooOOO = 0;
        this.f12300OoooO00 = context;
        this.f12302OoooOO0 = new OooO00o();
    }

    @Override // com.app.selectPicture.view.AbsViewLinearLayout
    public final void OooO0O0() {
    }

    @Override // com.app.selectPicture.view.AbsViewLinearLayout
    public final void OooO0OO() {
        int i = OooOOO0.layout_show_image_load_layout;
        View convertView = getConvertView();
        this.f12299OoooO0 = (RelativeLayout) (convertView != null ? convertView.findViewById(i) : null);
        int i2 = OooOOO0.layout_show_image_load_pic_iv;
        View convertView2 = getConvertView();
        PhotoView photoView = (PhotoView) (convertView2 != null ? convertView2.findViewById(i2) : null);
        this.f12301OoooO0O = photoView;
        photoView.setOnClickListener(this.f12302OoooOO0);
        OooO0Oo();
    }

    public final void OooO0Oo() {
        this.f12299OoooO0.setVisibility(0);
        this.f12301OoooO0O.setImageResource(OooOO0O.icon_pic);
    }

    @Override // com.app.selectPicture.view.AbsViewLinearLayout
    public int getConvertViewId() {
        return OooOOO.layout_show_image_load;
    }

    public void setListener(o0000Ooo<String, Integer> o0000ooo) {
        this.f12304o000oOoO = o0000ooo;
    }
}
