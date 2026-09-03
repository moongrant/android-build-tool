package p074o000O0oo;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.common.ui.fragment.OooO0OO;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00Oo00.OooO0O0;
import o0O0O00.o0ooOOo;
import p174o00OooOO.o0O00OOO;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements OooOo, BaseQuickAdapter.OooOOOO, OooO0O0, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f28223OooO0Oo;

    public /* synthetic */ OooOOO0(Object obj) {
        this.f28223OooO0Oo = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        o00O00.OooO("onTextClicked setViewData 动态详情 postCommentSonModel = " + ((PostCommentSonModel) this.f28223OooO0Oo));
    }

    @Override // o00Oo00.OooO0O0
    public final void OooO0O0(Object obj, int i, Object obj2) {
        AddTopicListActivity this$0 = (AddTopicListActivity) this.f28223OooO0Oo;
        String data = (String) obj;
        int i2 = AddTopicListActivity.f22264o0OoOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length() == 0) {
            this$0.Oooo0OO("");
            return;
        }
        if (this$0.Oooo0().f32947OoooO0.getText().length() <= this$0.f22273OoooooO) {
            this$0.Oooo0OO(StringsKt.trim((CharSequence) data).toString());
            return;
        }
        String strOooO00o = OooOo.OooO00o(this$0.getString(R.string.Input_a_maximum_of_xxx_characters), o0ooOOo.OooO00o(new StringBuilder(), this$0.f22273OoooooO, ""));
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (StringsKt.isBlank(strOooO00o)) {
            return;
        }
        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o0o0oooOooO0O0.run();
        } else {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
        }
    }

    public final boolean OooO0OO(Oooo000 oooo000, int i, Bundle bundle) {
        View view = (View) this.f28223OooO0Oo;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                oooo000.f28226OooO00o.OooO0O0();
                InputContentInfo inputContentInfo = (InputContentInfo) oooo000.f28226OooO00o.OooO0Oo();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipData clipData = new ClipData(oooo000.f28226OooO00o.getDescription(), new ClipData.Item(oooo000.f28226OooO00o.OooO00o()));
        ContentInfoCompat.OooO0O0 oooO00o = i2 >= 31 ? new ContentInfoCompat.OooO00o(clipData, 2) : new ContentInfoCompat.OooO0OO(clipData, 2);
        oooO00o.OooO00o(oooo000.f28226OooO00o.OooO0OO());
        oooO00o.setExtras(bundle);
        return ViewCompat.OooOOo(view, oooO00o.build()) == null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        GiftSendFragment this$0 = (GiftSendFragment) this.f28223OooO0Oo;
        int i2 = OooO0OO.f20913OooO0O0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.yalla.yalla.common.ui.fragment.OooO0O0 listener = new com.yalla.yalla.common.ui.fragment.OooO0O0(baseQuickAdapter, i, this$0, view);
        Intrinsics.checkNotNullParameter(listener, "listener");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - p254o00ooO0O.o00O00.f34345OooO00o) > 200) {
            p254o00ooO0O.o00O00.f34345OooO00o = jCurrentTimeMillis;
            listener.invoke();
        }
    }
}
