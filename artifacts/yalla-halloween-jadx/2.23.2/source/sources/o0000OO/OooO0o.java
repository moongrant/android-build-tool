package o0000OO;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import o000OOoO.oo000o;
import p080o000OoO.o00;
import p205o00o0o0o.o000O;
import p492o0o00OO0.o0OOO00;
import p492o0o00OO0.o0OOO0OO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements OooOO0O, o000OOoO.OooO0o.InterfaceC0401OooO0o, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33604OooO0Oo;

    public /* synthetic */ OooO0o(Object obj) {
        this.f33604OooO0Oo = obj;
    }

    @Override // o000OOoO.OooO0o.InterfaceC0401OooO0o
    public final long OooO00o(long j) {
        oo000o oo000oVar = (oo000o) this.f33604OooO0Oo;
        return o00.OooOO0((j * ((long) oo000oVar.f34738OooO0o0)) / AnimationKt.MillisToNanos, 0L, oo000oVar.f34741OooOO0 - 1);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f33604OooO0Oo;
        int i2 = TopicBlackListActivity.f25826OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getId() == o0OO00O.ivDelete) {
            o0OOO00 o0ooo00 = this$0.f25828OooOo0;
            if (o0ooo00 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
                o0ooo00 = null;
            }
            TopicBlackUserModel topicBlackUserModel = (TopicBlackUserModel) o0ooo00.f13189OooOOoo.get(i);
            if (topicBlackUserModel != null) {
                o000O o000o = new o000O(this$0);
                o000o.OooOOoo(o000000.Unblock_this_user);
                o000o.OooOo0(new o0OOO0OO(this$0, topicBlackUserModel));
                o000o.OooOO0o();
            }
        }
    }

    public final boolean OooO0OO(OooOOO0 oooOOO0, int i, Bundle bundle) {
        View view = (View) this.f33604OooO0Oo;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                oooOOO0.f33606OooO00o.OooO0OO();
                Parcelable parcelable = (Parcelable) oooOOO0.f33606OooO00o.OooO00o();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        }
        ClipDescription description = oooOOO0.f33606OooO00o.getDescription();
        OooOOO0.OooO0OO oooO0OO = oooOOO0.f33606OooO00o;
        ClipData clipData = new ClipData(description, new ClipData.Item(oooO0OO.OooO0O0()));
        ContentInfoCompat.OooO0O0 oooO00o = i2 >= 31 ? new ContentInfoCompat.OooO00o(clipData, 2) : new ContentInfoCompat.OooO0OO(clipData, 2);
        oooO00o.OooO00o(oooO0OO.OooO0Oo());
        oooO00o.setExtras(bundle);
        return ViewCompat.OooOO0O(view, oooO00o.build()) == null;
    }
}
