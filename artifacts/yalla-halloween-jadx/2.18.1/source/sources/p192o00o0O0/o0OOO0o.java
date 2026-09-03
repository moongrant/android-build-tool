package p192o00o0O0;

import android.content.Intent;
import androidx.recyclerview.widget.GridLayoutManager;
import com.app.selectPicture.activity.AllImagesActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.Intrinsics;
import p200o00o0Oo0.o0000Ooo;
import p381o0OOoOOO.o0oOO;
import p563o0oOo0.o00O000;
import p563o0oOo0.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OOO0o implements o0000Ooo, OnCompleteListener, BaseQuickAdapter.Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33100OooO0Oo;

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.Oooo000
    public final int OooO00o(GridLayoutManager gridLayoutManager, int i) {
        o00O000 this_apply = (o00O000) this.f33100OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        return ((o00O000o) this_apply.getData().get(i)).f45076OooO0Oo;
    }

    @Override // p200o00o0Oo0.o0000Ooo
    public final void OooO0o0(Object obj, Object obj2) {
        AllImagesActivity allImagesActivity = (AllImagesActivity) this.f33100OooO0Oo;
        int i = AllImagesActivity.f12251ooOO;
        allImagesActivity.OooOOo();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        o0oOO.OooO00o((Intent) this.f33100OooO0Oo);
    }
}
