package p198o00o0OOo;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.app.selectPicture.view.photoview.PhotoView;
import p400o0Oo0O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O extends RecyclerView.oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public RelativeLayout f33208OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PhotoView f33209OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TextView f33210OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextView f33211OooO0Oo;

    public o000O(@NonNull View view) {
        super(view);
        this.f33208OooO00o = (RelativeLayout) view.findViewById(OooOOO0.layout_show_image_select_layout);
        this.f33209OooO0O0 = (PhotoView) view.findViewById(OooOOO0.layout_show_image_select_pic_iv);
        this.f33210OooO0OO = (TextView) view.findViewById(OooOOO0.layout_show_image_select_tv_select);
        this.f33211OooO0Oo = (TextView) view.findViewById(OooOOO0.layout_show_image_select_tv_info);
    }
}
