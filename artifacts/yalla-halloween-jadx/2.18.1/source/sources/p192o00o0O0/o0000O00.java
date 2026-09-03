package p192o00o0O0;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.app.selectPicture.activity.ShowImagesSelectActivity;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ShowImagesSelectActivity f33089OooO00o;

    public o0000O00(ShowImagesSelectActivity showImagesSelectActivity) {
        this.f33089OooO00o = showImagesSelectActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        ShowImagesSelectActivity showImagesSelectActivity = this.f33089OooO00o;
        showImagesSelectActivity.OooOOoo(showImagesSelectActivity.f12294OoooOoO.findFirstVisibleItemPosition());
    }
}
